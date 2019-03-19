package com.github.kevin.library.manager;

import com.github.kevin.library.Staff;

public abstract class Manager {
    public static final int BOSS_MANAGER = 1;
    public static final int GENERAL_MANAGER = 2;
    public static final int ORDINARY_MANAGER = 3;

    //处理事件的级别
    private int level = 0;

    //下一个责任人是谁
    private Manager nextManager;

    public Manager(int level) {
        this.level = level;
    }

    //员工请求加薪（防止子类复写该方法）
    public final void request(Staff staff){
        if (staff.getLevel() == level){
            response(staff);
        } else {
            if (nextManager != null){
                nextManager.request(staff);
            } else {
                System.out.println("要求加薪太多，都不同意！");
            }
        }

    }

    public void setNextManager(Manager manager){
        this.nextManager = manager;
    }

    //子类响应事件
    protected abstract void response(Staff staff);


}
