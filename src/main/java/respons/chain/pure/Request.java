package respons.chain.pure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    /**
     * 请假人姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private Integer days;
}
