# 字符串最后一个单词长度

#### 题目

计算字符串最后一个单词的长度，单词以空格隔开。

**输入**

一行字符串，非空，长度小于5000

```
hello world
```

**输出**

整数N，最后一个单词的长度。

```
5
```

#### 答案

```java
import java.io.InputStream;
public class Main{
    public static void main(String[] args) throws Exception{
        int len = 0;
        InputStream in = System.in;
        char c = (char)in.read();
        while(c != '\n'){
            if(c == ' '){
                len = 0;
            }else{
                len++;
            }
            c = (char)in.read();
        }
        System.out.println(len);
    }
}
```

