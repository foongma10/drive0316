package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;
}
