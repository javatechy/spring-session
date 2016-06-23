import static org.junit.Assert.*;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class ResisTest {

	@Test
	public void poolTest() throws Exception {
		System.out.println("jedisPool test");
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(12);
		JedisPool pool = new JedisPool(config, "127.0.0.1", 6379);
		Jedis jedis = pool.getResource();
//		jedis.set("test", "hoge");
		jedis.hset("accesstoken", "key1", "value1");
		jedis.hset("accesstoken", "key2", "value2");
		jedis.hset("accesstoken", "key3", "value3");
		jedis.hset("accesstoken", "key4", "value4");
		jedis.hdel("acccesstoken","key1");
		
		jedis.rpush("test", "1");
		jedis.rpush("test1", "2");
		jedis.rpush("tes2", "3");
		jedis.rpush("test3", "4");
		jedis.rpush("test4", "5");
		jedis.rpush("test5", "6");
		//logger.info("result:" + jedis.lrange("test", 0, -1));
	}

}
