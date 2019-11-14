package respons.chain.impure;

public class GroupLeaderFilter implements Filter{

    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.getOpinions().add("group_leader 同意");

        filterChain.doFilter(request, response, filterChain);

        response.getSign().add("group_leader 签名");
    }
}
