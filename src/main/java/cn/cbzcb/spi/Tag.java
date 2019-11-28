package cn.cbzcb.spi;

import java.lang.annotation.*;

/**
 * Created by zcb on 2019/11/28.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Tag {
    String defaultId() default "";
}
