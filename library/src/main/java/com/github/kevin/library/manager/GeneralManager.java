package com.github.kevin.library.manager;

import com.github.kevin.library.Staff;

/**
 * 总经理类
 */
public class GeneralManager extends Manager{

    public GeneralManager() {
        super(GENERAL_MANAGER);
    }

    @Override
    protected void response(Staff staff) {
        System.out.println("员工问总经理：" + staff.getRequest());
        System.out.println("总经理的回答：" + "同意！\n=========");
    }

}
