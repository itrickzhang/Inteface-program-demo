package cn.cbzcb.pay;

import cn.cbzcb.spi.Tag;

/**
 * Created by zcb on 2019/11/28.
 */
@Tag(defaultId = "wechat")
public class WeChatChannelImpl implements PayChannel {

    /**
     * 微信支付
     * @param orderId
     * @return
     */
    public boolean pay(String orderId) {
        System.out.println("微信支付.订单号为:"+orderId);
        return false;
    }

    /**
     * 微信退款
     * @param orderId
     * @return
     */
    public boolean refund(String orderId) {
        System.out.println("微信退款.订单号为:"+orderId);
        return false;
    }

    /**
     * 微信订单创建
     * @param orderId
     * @return
     */
    public boolean createOrder(String orderId) {
        System.out.println("微信创建订单.订单号为:"+orderId);
        return false;
    }
}
