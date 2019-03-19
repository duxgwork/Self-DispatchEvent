package com.github.kevin.library.manager;

import com.github.kevin.library.Staff;

/**
 * 普通经理类
 */
public class OrdinaryManager extends Manager {


    public OrdinaryManager() {
        super(ORDINARY_MANAGER);
    }

    @Override
    protected void response(Staff staff) {
        System.out.println("员工问经理：" + staff.getRequest());
        System.out.println("经理的回答：" + "同意！\n=========");
    }
}
