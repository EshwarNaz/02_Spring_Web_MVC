package in.eshwar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.eshwar.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
