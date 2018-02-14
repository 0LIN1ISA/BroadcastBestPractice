package com.example.a0lin1isa.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 0LIN1ISA on 2018/2/15.
 */

public class ActivityCollector {

    // 活动列表
    public static List<Activity> activitiess = new ArrayList<>();

    /**
     * 新增一个活动
     * */
    public static void addActivity(Activity activity) {
        activitiess.add(activity);
    }

    /**
     * 删除一个活动
     * */
    public static void removeActivity(Activity activity) {
        activitiess.remove(activity);
    }

    /**
     * 从列表中删除所有活动
     * */
    public static void finishAll() {
        for (Activity activity : activitiess) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }



}
