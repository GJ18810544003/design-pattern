package respons.chain.impure;

public class FinalBossFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.getOpinions().add("final_boss 同意");

        filterChain.doFilter(request, response, filterChain);

        response.getSign().add("final_boss 签名");
    }
}
