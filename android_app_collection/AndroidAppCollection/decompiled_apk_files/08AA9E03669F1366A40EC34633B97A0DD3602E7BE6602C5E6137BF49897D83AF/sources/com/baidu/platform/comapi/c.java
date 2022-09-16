package com.baidu.platform.comapi;

import android.app.Application;
import android.content.Context;
import com.baidu.mapapi.common.EnvironmentUtilities;
import java.io.File;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1996a;

    public static void a(String str, Context context) {
        if (!f1996a) {
            if (context == null) {
                throw new IllegalArgumentException("context can not be null");
            }
            if (!(context instanceof Application)) {
                throw new RuntimeException("context must be an Application Context");
            }
            NativeLoader.getInstance();
            NativeLoader.setContext(context);
            a.a().a(context);
            a.a().c();
            if (str != null && !str.equals("")) {
                try {
                    File file = new File(str + "/test.0");
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    if (file.exists()) {
                        file.delete();
                    }
                    EnvironmentUtilities.setSDCardPath(str);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new IllegalArgumentException("provided sdcard path can not used.");
                }
            }
            f1996a = true;
        }
    }
}
