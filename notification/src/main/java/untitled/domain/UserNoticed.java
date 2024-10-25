package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserNoticed extends AbstractEvent {

    private Long id;

    public UserNoticed(Notification aggregate) {
        super(aggregate);
    }

    public UserNoticed() {
        super();
    }
}
//>>> DDD / Domain Event
