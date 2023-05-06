package top.codehoo.common.core.constant;

import org.apache.commons.codec.digest.Md5Crypt;

import java.nio.charset.StandardCharsets;

/**
 * Token的Key常量
 * 
 * @author ruoyi
 */
public class TokenConstants
{
    private static String secret = "";
    static {
        secret = Md5Crypt.md5Crypt("code_hoo".getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 令牌自定义标识
     */
    public static final String AUTHENTICATION = "Authorization";

    /**
     * 令牌前缀
     */
    public static final String PREFIX = "Bearer ";

    /**
     * 令牌秘钥
     */
    public final static String SECRET = secret;

}
