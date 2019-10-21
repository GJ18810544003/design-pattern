package respons.chain.impure;

public class HtmlFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.setReqestMsg(request.getReqestMsg()
                .replaceAll("<", "[")
                .replaceAll(">", "]") + "--Html");
        filterChain.doFilter(request, response, filterChain);

        response.setResponseString(response.getResponseString()
                .replaceAll("<", "[")
                .replaceAll(">", "]") + "--Html");


    }
}
