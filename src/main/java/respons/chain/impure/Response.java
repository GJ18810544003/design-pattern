package respons.chain.impure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    /**
     * 领导的签名
     */
    private List<String> sign = new ArrayList<String>();
}
