package com.hm.iou.logger;

import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * Created by hjy on 18/4/25.<br>
 */

public class Logger {

    public static void init(Context context, boolean debug) {
        if (debug) {
            FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                    .showThreadInfo(true)
                    .tag("HEIMA")
                    .build();
            com.orhanobut.logger.Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        }
        //TODO 增加日志输出到文件的功能
    }

    public static void d(String message, Object... args) {
        com.orhanobut.logger.Logger.d(message, args);
    }

    public static void e(String message, Object... args) {
        com.orhanobut.logger.Logger.e(message, args);
    }

    public static void w(String message, Object... args) {
        com.orhanobut.logger.Logger.w(message, args);
    }

    public static void v(String message, Object... args) {
        com.orhanobut.logger.Logger.v(message, args);
    }

    public static void i(String message, Object... args) {
        com.orhanobut.logger.Logger.i(message, args);
    }

    public static void json(String message) {
        com.orhanobut.logger.Logger.json(message);
    }

    /**
     * 设置tag
     *
     * @param tag
     */
    public static void t(String tag) {
        com.orhanobut.logger.Logger.t(tag);
    }

}
