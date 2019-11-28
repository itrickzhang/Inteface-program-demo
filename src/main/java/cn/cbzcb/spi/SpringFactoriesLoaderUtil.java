package cn.cbzcb.spi;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2019/11/28.
 */
public class SpringFactoriesLoaderUtil {

    public static <T> T loadFactories(Class<T> type,String tag){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Set<String> names = new LinkedHashSet<String>(
                SpringFactoriesLoader.loadFactoryNames(type, classLoader));
        for (String name : names) {
            try {
                Class<?> instanceClass = ClassUtils.forName(name, classLoader);
                Tag annotation = (Tag) instanceClass.getAnnotation(Tag.class);
                if (tag.equals(annotation.defaultId())){
                    return (T) ReflectionUtils.accessibleConstructor(instanceClass, new Class[0]).newInstance(new Object[0]);
                }
            } catch (Exception e ) {
                e.printStackTrace();
            }

        }
        return null;
    }

}
