# 计算字符数

#### 题目

写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。

**输入**

第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符

```
ABCDEF
A
```

**输出**

输出输入字符串中含有该字符的个数。

```
1
```

#### 答案

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] agrs) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char c = br.readLine().charAt(0);
        int total = 0;
        for(char l : line.toCharArray()){
            if(l == c || l == c+32 || l == c-32){
                total++;
            }
        }
        System.out.println(total);
    }
}
```

