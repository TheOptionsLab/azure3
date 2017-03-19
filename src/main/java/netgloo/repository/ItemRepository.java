package netgloo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import netgloo.models.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
