package gpu.domain;

import gpu.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "allocates", path = "allocates")
public interface AllocateRepository
    extends PagingAndSortingRepository<Allocate, Long> {}