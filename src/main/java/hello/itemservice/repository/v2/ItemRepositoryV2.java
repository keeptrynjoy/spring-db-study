package hello.itemservice.repository.v2;

import hello.itemservice.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

//Item 기본 쿼리
public interface ItemRepositoryV2 extends JpaRepository<Item, Long> {
}
