package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;

    public FileIndexed(Indexer aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event
