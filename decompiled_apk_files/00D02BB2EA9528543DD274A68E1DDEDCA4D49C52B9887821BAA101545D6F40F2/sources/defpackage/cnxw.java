package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cnxw  reason: default package */
/* loaded from: classes5.dex */
public final class cnxw {
    private static final Method a;
    private static final Method b;

    static {
        Method method;
        Process.myUid();
        Method method2 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
        }
        b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (cnxs.b()) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused6) {
            }
        }
        if (cnxs.b()) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused7) {
            }
        }
    }

    public static WorkSource a(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo a2 = cnyb.b(context).a(str, 0);
                if (a2 == null) {
                    if (str.length() == 0) {
                        new String("Could not get applicationInfo from package: ");
                    }
                    return null;
                }
                int i = a2.uid;
                WorkSource workSource = new WorkSource();
                Method method = b;
                if (method == null) {
                    Method method2 = a;
                    if (method2 != null) {
                        method2.invoke(workSource, Integer.valueOf(i));
                    }
                    return workSource;
                }
                method.invoke(workSource, Integer.valueOf(i), str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() == 0) {
                    new String("Could not find package: ");
                }
            }
        }
        return null;
    }

    public static boolean b(Context context) {
        return (context == null || context.getPackageManager() == null || cnyb.b(context).c("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }
}
