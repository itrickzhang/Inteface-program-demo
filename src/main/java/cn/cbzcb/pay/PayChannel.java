package cn.cbzcb.pay;

/**
 * Created by zcb on 2019/11/28.
 */
public interface PayChannel {

    boolean pay(String orderId);

    boolean refund(String orderId);

    boolean createOrder(String orderId);

}
