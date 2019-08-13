import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

public class redis {
    public static void main(String[] args) {
        // 数据库链接池配置
        JedisPoolConfig config = new JedisPoolConfig();
//最大连接数, 应用自己评估，不要超过Redis每个实例最大的连接数
        config.setMaxTotal(100);
//最大空闲连接数, 应用自己评估，不要超过Redis每个实例最大的连接数
        config.setMaxIdle(50);
        config.setMinIdle(20);
        config.setMaxWaitMillis(6 * 1000);
        config.setTestOnBorrow(false);
        config.setTestOnReturn(false);

        String host = "127.0.0.1"; //域名
        String password = "123456"; //密码
        int port = 6379; //端口
        int timeout = 3000; //建立连接超时时间
        JedisPool pool = new JedisPool(config, host, port, timeout, password);
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            /// ... do stuff here ... for example
            jedis.set("foo", "bar");
            String foobar = jedis.get("foo");
            System.out.println(foobar);
            jedis.zadd("sose", 0, "car");
            jedis.zadd("sose", 0, "bike");
            Set<String> sose = jedis.zrange("sose", 0, -1);
            System.out.println(sose);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
/// ... when closing your application:
        pool.destroy();
    }
}
