package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String FileID;
    private String FileName;
}
