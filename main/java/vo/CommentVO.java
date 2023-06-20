package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentVO {
	private int post_mno;
	private int comment_mno;
	private String comment;
	private String author;
}
