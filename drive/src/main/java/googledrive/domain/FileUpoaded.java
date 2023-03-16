package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUpoaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userid;

    public FileUpoaded(File aggregate) {
        super(aggregate);
    }

    public FileUpoaded() {
        super();
    }
}
