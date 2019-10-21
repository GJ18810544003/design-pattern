package respons.chain.pure;

public class Main {

    public static void main(String[] args) {
        // 构造责任链
        GroupLeaderFilter groupLeaderFilter = new GroupLeaderFilter();
        DeptLeaderFilter deptLeaderFilter = new DeptLeaderFilter();
        FinalBossFilter finalBossFilter = new FinalBossFilter();
        groupLeaderFilter.setNextFilter(deptLeaderFilter);
        deptLeaderFilter.setNextFilter(finalBossFilter);

        // 处理张三的请求
        Request request = new Request();
        request.setDays(10);
        request.setName("张三");
        Response response = new Response();

        System.out.println("开始审批张三的请求");
        groupLeaderFilter.doFilter(request, response);
        System.out.println("张三的请假审批结果：" + response);


    }
}
