package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostVO {
	private int post_mno;
	private String post_name;
	private String author;
	private String post_content;
}
