package respons.chain.impure;

public class FaceFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setReqestMsg(request.getReqestMsg()
                .replaceAll(":", "=.=")
                + "--Face");
        filterChain.doFilter(request, response, filterChain);

        response.setResponseString(response.getResponseString()
                .replaceAll(":", "=.=")
                + "--Face");
    }
}