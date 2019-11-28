package cn.cbzcb.sample;

/**
 * Created by zcb on 2019/11/28.
 */
public class AliPayChannel {

    /**
     *支持宝支付
     * @param orderId
     * @return
     */
    public boolean alipay(String orderId){
        //具体代码省略
        return true;
    }

    /**
     * 支付宝退款
     * @param orderId
     * @return
     */
    public boolean aliRefund(String orderId){
        //具体代码省略
        return true;
    }

    /**
     * 支付宝创建订单
     * @param orderId
     * @return
     */
    public boolean aliOrderCreate(String orderId){
        //具体代码省略
        return true;
    }

}
