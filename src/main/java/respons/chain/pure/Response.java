package respons.chain.pure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response {

    /**
     * 审批人姓名
     */
    private String approvalName;

    /**
     * 审批结果
     */
    private boolean result;

    /**
     * 审批消息
     */
    private String msg;
}
