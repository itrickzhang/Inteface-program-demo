package cn.cbzcb.factory;

import cn.cbzcb.pay.PayChannel;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

import java.util.Map;

/**
 * Created by zcb on 2019/11/28.
 */
public class PayChannelFactory {
    public static <T> T newInstance(Class<T> type, String way){
        Map<String,String> config = PayChannelConfig.getInstance().getConfig();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String name = config.get(way);
        PayChannel payChannel = null;
        Class<?> instanceClass = null;
        try {
            instanceClass = ClassUtils.forName(name, classLoader);
            return (T) ReflectionUtils.accessibleConstructor(instanceClass, new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
