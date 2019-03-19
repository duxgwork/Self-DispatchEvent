package com.github.kevin.library;

import com.github.kevin.library.manager.Boss;
import com.github.kevin.library.manager.GeneralManager;
import com.github.kevin.library.manager.Manager;
import com.github.kevin.library.manager.OrdinaryManager;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * 任链模式的优点：事件处理逻辑和事件响应逻辑分开了，结构更清晰。
 *
 * 责任链模式的缺点：
 * （1）如果层级过多，很消耗性能。
 * （2）如果出错，不好定位问题出现在哪一级。
 *
 */
public class EventTest {

    public static void main(String[] args) {
        //随机创建几个员工
        Random random = new Random();
        ArrayList<Staff> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Staff(random.nextInt(4),"加薪"));
        }

        Manager boss = new Boss();
        Manager generalManager = new GeneralManager();
        Manager ordinaryManager = new OrdinaryManager();

        //设置下一级责任人
        ordinaryManager.setNextManager(generalManager);
        generalManager.setNextManager(boss);

        for (Staff staff : arrayList){
            ordinaryManager.request(staff);
        }

    }


}
