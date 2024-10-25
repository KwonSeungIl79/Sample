package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class VideoProcessHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VideoProcess>> {

    @Override
    public EntityModel<VideoProcess> process(EntityModel<VideoProcess> model) {
        return model;
    }
}
