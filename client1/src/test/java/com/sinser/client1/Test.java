package com.sinser.client1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Description :
 *
 * @author : zhang
 * @date : 2018/11/2 10:55
 */
public class Test {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @org.junit.Test
    public void test1() throws Exception {


        String url = "http://www.cqgzfglj.gov.cn:9090/site/cqgzf/lotteryresultpublic/getYhpzjgAction";
        String json = "{\"isInit\":true,\"pageNumber\":1,\"prefix\":null,\"xm\":null,\"cnumber\":null,\"bname\":null,\"code\":null,\"tableName\":\" YHPZJG24\"}";
        Connection connection = Jsoup
                .connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.75 Safari/537.36") // User-Agent of Chrome 55
                .referrer("http://www.cqgzfglj.gov.cn:9090/site/cqgzf/lotteryresultpublic/lotteryresultdetail/24")
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Content-Length", "77")
                .header("Accept", "application/json, text/javascript, */*; q=0.01")
                .header("Accept-Encoding", "gzip,deflate")
                .header("Accept-Language", "zh-CN,zh;q=0.9")
                .header("Connection", "keep-alive")
                .header("X-Requested-With", "XMLHttpRequest")
                .requestBody(json)
                .maxBodySize(100)
                .timeout(1000 * 10)
                .method(Connection.Method.POST);
        Connection.Response response = connection.cookie("JSESSIONID","161C92E2E8BB51E852929762CB150934").execute();
        System.out.println(response.body());
    }
}
