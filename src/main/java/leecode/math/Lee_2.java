package leecode.math;


/**
 * @author jinwentao
 * @version 1.0.0
 * @ClassName Solution1.java
 * @Description 数字倒序
 * @createTime 2021年02月19日 17:36:00
 */
public class Lee_2 {

    public static int  solution(int x) {
        int res = 0;
        while (x != 0){

            res = res*10 + x%10;
            x = x/10;
        }
        if(res*10/10 != res){
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(-1232222233));;
    }
}
