package com.github.kevin.library;


/**
 * 员工类
 */
public class Staff {
    //员工的请求等级
    private int level = 0;

    //员工的请示
    private String request = "";

    public Staff(int level, String request) {
        this.level = level;
        switch (this.level) {
            case 1:
                this.request = "员工的请求是：" + request + "10000";
                break;
            case 2:
                this.request = "员工的请求是：" + request + "5000";
                break;
            case 3:
                this.request = "员工的请求是：" + request + "1000";
                break;
            default:
                this.request = "员工的请求是：" + request + "20000";
                break;
        }
    }

    public int getLevel() {
        return level;
    }

    public String getRequest() {
        return request;
    }

}
