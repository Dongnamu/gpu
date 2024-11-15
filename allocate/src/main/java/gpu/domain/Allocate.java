package gpu.domain;

import gpu.AllocateApplication;
import gpu.domain.AllocateStarted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Allocate_table")
@Data
//<<< DDD / Aggregate Root
public class Allocate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String status;

    private Long numCpu;

    private Long numGpu;

    @PostPersist
    public void onPostPersist() {
        AllocateStarted allocateStarted = new AllocateStarted(this);
        allocateStarted.publishAfterCommit();
    }

    public static AllocateRepository repository() {
        AllocateRepository allocateRepository = AllocateApplication.applicationContext.getBean(
            AllocateRepository.class
        );
        return allocateRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startAllocate(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Allocate allocate = new Allocate();
        repository().save(allocate);

        AllocateStarted allocateStarted = new AllocateStarted(allocate);
        allocateStarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(allocate->{
            
            allocate // do something
            repository().save(allocate);

            AllocateStarted allocateStarted = new AllocateStarted(allocate);
            allocateStarted.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
