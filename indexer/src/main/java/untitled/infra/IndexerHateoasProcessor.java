package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class IndexerHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Indexer>> {

    @Override
    public EntityModel<Indexer> process(EntityModel<Indexer> model) {
        return model;
    }
}
