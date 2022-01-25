package by.ak.service;

import by.ak.model.Item;
import by.ak.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public record ItemService(ItemRepository itemRepository) {
  public Optional<Item> findById(Long id) {
    return itemRepository.findById(id);
  }

  public void save(Item item) {
    itemRepository.save(item);
  }
}
