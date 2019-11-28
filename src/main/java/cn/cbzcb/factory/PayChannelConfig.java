package cn.cbzcb.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zcb on 2019/11/28.
 */
public class PayChannelConfig {
    private static PayChannelConfig instance = new PayChannelConfig();
    private PayChannelConfig(){};
    private  Map<String,String> config = new HashMap<String, String>();
    public static PayChannelConfig getInstance(){
        return instance;
    }

    public Map<String, String> getConfig() {
        config.put("alipay","cn.cbzcb.pay.AlipayChannelImpl");
        config.put("wechat","cn.cbzcb.pay.WeChatChannelImpl");
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }
}
