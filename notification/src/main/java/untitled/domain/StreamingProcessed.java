package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class StreamingProcessed extends AbstractEvent {

    private Long id;
}
