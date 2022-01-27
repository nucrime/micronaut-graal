package by.ak.controller;

import by.ak.model.Item;
import by.ak.service.ItemService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import org.springframework.http.ResponseEntity;

@Controller
public record ItemController(ItemService itemService) {

  @Get("/item/{id}")
  public ResponseEntity<Item> getItem(@PathVariable Long id) {
    return itemService.findById(id).map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound()
        .build());
  }

  @Post("/item")
  public ResponseEntity<Void> addItem(Item item) {
    itemService.save(item);
    return ResponseEntity.ok().build();
  }
}
