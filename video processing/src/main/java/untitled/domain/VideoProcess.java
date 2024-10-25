package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.VideoProcessingApplication;
import untitled.domain.StreamingProcessed;

@Entity
@Table(name = "VideoProcess_table")
@Data
//<<< DDD / Aggregate Root
public class VideoProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        StreamingProcessed streamingProcessed = new StreamingProcessed(this);
        streamingProcessed.publishAfterCommit();
    }

    public static VideoProcessRepository repository() {
        VideoProcessRepository videoProcessRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoProcessRepository.class
        );
        return videoProcessRepository;
    }

    //<<< Clean Arch / Port Method
    public static void streamingProcessed(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        VideoProcess videoProcess = new VideoProcess();
        repository().save(videoProcess);

        StreamingProcessed streamingProcessed = new StreamingProcessed(videoProcess);
        streamingProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoProcess->{
            
            videoProcess // do something
            repository().save(videoProcess);

            StreamingProcessed streamingProcessed = new StreamingProcessed(videoProcess);
            streamingProcessed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
