package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileSize;
    private String fileName;
    private Boolean isIndexed;
    private Boolean idUploaded;
    private String videoUrl;
    private Long fileId;
}
