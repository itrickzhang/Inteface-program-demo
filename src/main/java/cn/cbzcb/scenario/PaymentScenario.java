package cn.cbzcb.scenario;

import cn.cbzcb.factory.PayChannelFactory;
import cn.cbzcb.pay.PayChannel;
import cn.cbzcb.spi.SpringFactoriesLoaderUtil;

/**
 * Created by zcb on 2019/11/28.
 */
public class PaymentScenario {
    public static void spiScenario(String orderId, String way){
        PayChannel payChannel = SpringFactoriesLoaderUtil.loadFactories(PayChannel.class,way);
        payChannel.createOrder(orderId);
        payChannel.pay(orderId);
        payChannel.refund(orderId);
    }
    public static void factoryScenario(String orderId, String way){
        PayChannel payChannel = PayChannelFactory.newInstance(PayChannel.class,way);
        payChannel.createOrder(orderId);
        payChannel.pay(orderId);
        payChannel.refund(orderId);

    }

    public static void main(String [] args){
        System.out.println("*************************基于spi实现************************************");
        //支付宝支付
        String orderId = "123";
        String way = "alipay";
        spiScenario(orderId,way);
        //微信支付
        way = "wechat";
        spiScenario(orderId,way);
        System.out.println("*************************基于简单工厂实现************************************");
        orderId = "456";
        way = "alipay";
        factoryScenario(orderId,way);
        way = "wechat";
        factoryScenario(orderId,way);
    }
}
