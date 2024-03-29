package respons.chain.pure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 组领导审批链
 */
@Data
public class GroupLeaderFilter extends Filter{
    public void doFilter(Request request, Response response) {
        // 如果请假天数小于等于1，则组领导可直接审批
        if (request.getDays() <= 1) {
            response.setApprovalName("group_leader");
            response.setResult(true);
            System.out.println("group_leader同意了");
            return;
        }else {
            System.out.println("group_leader无权审批，交给下一级");
            this.getNextFilter().doFilter(request, response);
        }



    }
}
