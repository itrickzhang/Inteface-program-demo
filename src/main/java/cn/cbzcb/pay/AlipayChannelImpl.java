package cn.cbzcb.pay;

import cn.cbzcb.spi.Tag;

/**
 * Created by zcb on 2019/11/28.
 */
@Tag(defaultId = "alipay")
public class AlipayChannelImpl implements PayChannel{

    /**
     * 支付宝支付
     * @param orderId
     * @return
     */
    public boolean pay(String orderId) {
        System.out.println("支付宝支付.订单号为:"+orderId);
        return false;
    }

    /**
     * 支付宝退款
     * @param orderId
     * @return
     */
    public boolean refund(String orderId) {
        System.out.println("支付宝退款.订单号为:"+orderId);
        return false;
    }

    /**
     * 支付宝订单创建
     * @param orderId
     * @return
     */
    public boolean createOrder(String orderId) {
        System.out.println("支付宝创建订单.订单号为:"+orderId);
        return false;
    }

}
