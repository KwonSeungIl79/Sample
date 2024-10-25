package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationRepository notificationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileIndexed'"
    )
    public void wheneverFileIndexed_UploadComplateNotice(
        @Payload FileIndexed fileIndexed
    ) {
        FileIndexed event = fileIndexed;
        System.out.println(
            "\n\n##### listener UploadComplateNotice : " + fileIndexed + "\n\n"
        );

        // Sample Logic //
        Notification.uploadComplateNotice(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StreamingProcessed'"
    )
    public void wheneverStreamingProcessed_VideoUrlNotice(
        @Payload StreamingProcessed streamingProcessed
    ) {
        StreamingProcessed event = streamingProcessed;
        System.out.println(
            "\n\n##### listener VideoUrlNotice : " + streamingProcessed + "\n\n"
        );

        // Sample Logic //
        Notification.videoUrlNotice(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
