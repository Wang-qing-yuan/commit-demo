package top.wqy.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: wqy
 * @create: 2021-09-26 20:44
 **/
@Slf4j
public class StringEquals {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        log.info("a == b ? {}", a == b);

        String c = new String("2");
        String d = new String("2");
        log.info("c == d ? {}", c == d);

        String e = new String("3").intern();
        String f = new String("3").intern();
        log.info("e == f ? {}", e == f);

        String g = new String("4");
        String h = new String("4");
        log.info("g == h ? {}", g.equals(h));
    }
}
