package googledrive.domain;

import googledrive.DriveApplication;
import googledrive.domain.FileUpoaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long size;

    private String type;

    private String userid;

    @PostPersist
    public void onPostPersist() {
        FileUpoaded fileUpoaded = new FileUpoaded(this);
        fileUpoaded.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
