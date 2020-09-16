# 明明的随机数

#### 题目

https://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&rp=1&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking

**输入**

```

```

**输出**

```

```

#### 答案

```java
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = br.readLine()) != null ){
            boolean[] stu = new boolean[1001];
            int n = Integer.valueOf(str);
            for(int i = 1; i <= n;i++){
                stu[Integer.valueOf(br.readLine())] = true;
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 1;i<1001;i++){
                if(stu[i]){
                    sb.append(i).append("\n");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
}
```

