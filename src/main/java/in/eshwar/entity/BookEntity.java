package in.eshwar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BookEntity {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrize;

}
