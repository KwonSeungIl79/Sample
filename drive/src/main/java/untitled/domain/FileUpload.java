package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DriveApplication;
import untitled.domain.FileUploaded;

@Entity
@Table(name = "FileUpload_table")
@Data
//<<< DDD / Aggregate Root
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String userName;

    private Integer fileSize;

    private Boolean uploadOx;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileUploadRepository repository() {
        FileUploadRepository fileUploadRepository = DriveApplication.applicationContext.getBean(
            FileUploadRepository.class
        );
        return fileUploadRepository;
    }

    //<<< Clean Arch / Port Method
    public static void fileUploadStatusNotice(UserNoticed userNoticed) {
        //implement business logic here:

        /** Example 1:  new item 
        FileUpload fileUpload = new FileUpload();
        repository().save(fileUpload);

        */

        /** Example 2:  finding and process
        
        repository().findById(userNoticed.get???()).ifPresent(fileUpload->{
            
            fileUpload // do something
            repository().save(fileUpload);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
