package respons.chain.impure;

public class SensitiveFilter implements Filter{

    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setReqestMsg(request.getReqestMsg()
                .replaceAll("敏感", "")
                .replaceAll("被就业", "就业")
                + "--Sensitive");
        filterChain.doFilter(request, response, filterChain);

        response.setResponseString(response.getResponseString()
                .replaceAll("敏感", "")
                .replaceAll("被就业", "就业")
                + "--Sensitive");
    }
}
