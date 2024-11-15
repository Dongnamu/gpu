package gpu.infra;

import gpu.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AllocateHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Allocate>> {

    @Override
    public EntityModel<Allocate> process(EntityModel<Allocate> model) {
        return model;
    }
}
