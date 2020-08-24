package com.Chen.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host=new Host();
        //代理 中介帮房东租房子，但是呢，代理角色一般会有一些附属操作比如收中介费
        Proxy proxy=new Proxy(host);
        //你不用面对房东，找中介即可
        proxy.rent();
    }
}
