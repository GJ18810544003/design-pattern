package respons.chain.pure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 最终的boss审批
 */
@Data
public class FinalBossFilter extends Filter{
    public void doFilter(Request request, Response response) {
        response.setApprovalName("final_boss");

        // boss很霸道，只有张三才能请长假
        if (request.getName().equals("张三")) {
            response.setResult(true);
            response.setMsg("玩得愉快！");
            System.out.println("最终boss同意了");
            return;
        }
        response.setResult(false);
        response.setMsg("你不是张三，不准你请这么长假=.=");
        System.out.printf("最终boss不同意");
        return;
    }
}
