package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StreamingProcessed extends AbstractEvent {

    private Long id;

    public StreamingProcessed(VideoProcess aggregate) {
        super(aggregate);
    }

    public StreamingProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
