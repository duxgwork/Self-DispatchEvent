package com.github.kevin.library.manager;

import com.github.kevin.library.Staff;

/**
 * 老板类
 */
public class Boss extends Manager{


    public Boss() {
        super(BOSS_MANAGER);
    }

    @Override
    protected void response(Staff staff) {
        System.out.println("员工问老板：" + staff.getRequest());
        System.out.println("老板的回答：" + "同意！\n=========");

    }

}
