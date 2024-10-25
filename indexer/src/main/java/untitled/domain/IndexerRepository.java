package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "indexers", path = "indexers")
public interface IndexerRepository
    extends PagingAndSortingRepository<Indexer, Long> {}
