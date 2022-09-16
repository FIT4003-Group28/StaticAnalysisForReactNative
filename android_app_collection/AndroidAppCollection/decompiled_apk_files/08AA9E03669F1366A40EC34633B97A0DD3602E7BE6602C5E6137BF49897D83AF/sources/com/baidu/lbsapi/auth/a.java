package com.baidu.lbsapi.auth;

import android.util.Log;
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1483a = false;

    /* renamed from: b  reason: collision with root package name */
    private static String f1484b = "BaiduApiAuth";

    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return stackTraceElement.getFileName() + "[" + stackTraceElement.getLineNumber() + "]";
    }

    public static void a(String str) {
        if (!f1483a || Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        String str2 = f1484b;
        Log.d(str2, a() + ";" + str);
    }

    public static void b(String str) {
        if (!f1483a || Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        String str2 = f1484b;
        Log.e(str2, a() + ";" + str);
    }
}
