package respons.chain.impure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 *  不纯的责任链模式，一个处理者既处理请求，又把请求传递给下一个处理者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterChain implements Filter {
    private int index = 0;
    private List<Filter> filters = new ArrayList<Filter>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }


    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size()) return;

        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, filterChain);
    }
}
