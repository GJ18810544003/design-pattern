package respons.chain.impure;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
