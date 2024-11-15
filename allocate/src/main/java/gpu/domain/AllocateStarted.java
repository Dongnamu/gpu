package gpu.domain;

import gpu.domain.*;
import gpu.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AllocateStarted extends AbstractEvent {

    private Long id;
    private Long userId;
    private String status;
    private Long numCpu;
    private Long numGpu;

    public AllocateStarted(Allocate aggregate) {
        super(aggregate);
    }

    public AllocateStarted() {
        super();
    }
}
//>>> DDD / Domain Event
