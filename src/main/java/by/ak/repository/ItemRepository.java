package by.ak.repository;

import by.ak.model.Item;
import io.micronaut.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
