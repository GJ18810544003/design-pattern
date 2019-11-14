package respons.chain.impure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    /**
     * 申请人姓名
     */
    private String name;

    /**
     * 申请报销金额
     */
    private Long gold;

    /**
     * 审批意见
     */
    private List<String> opinions = new ArrayList<String>();
}
