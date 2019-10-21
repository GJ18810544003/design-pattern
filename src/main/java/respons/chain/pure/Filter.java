package respons.chain.pure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 纯责任链模式，一个处理者要么处理请求，要么交给下一个处理者
 * 比如请假审批流，请假小于1天，组领导可批，小于3天，部门领导可批，大于3天的需要大boss批
 */
@Data
public abstract class Filter {

    /**
     * 下一个处理者
     */
    public Filter nextFilter;

    public abstract void doFilter(Request request, Response response);


}
