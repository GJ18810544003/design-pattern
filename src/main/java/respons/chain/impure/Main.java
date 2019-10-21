package respons.chain.impure;

public class Main {

    public static void main(String[] args) {
        String msg = "大家好:) 敏感 <script> 被就业 网络授课没感觉";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new SensitiveFilter()).add(new HtmlFilter()).add(new FaceFilter());

        Request request = new Request();
        request.setReqestMsg(msg);

        Response response = new Response();
        response.setResponseString(msg);

        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.getReqestMsg());
        System.out.println(response.getResponseString());
    }
}
