package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f7110a;

    /* renamed from: b  reason: collision with root package name */
    private static final Method f7111b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f7112c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f7113d;

    static {
        Process.myUid();
        f7110a = e();
        f7111b = f();
        f7112c = g();
        a();
        f7113d = b();
        c();
        d();
    }

    private static WorkSource a(int i, String str) {
        WorkSource workSource = new WorkSource();
        a(workSource, i, str);
        return workSource;
    }

    public static WorkSource a(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo a2 = com.google.android.gms.common.n.c.a(context).a(str, 0);
                if (a2 != null) {
                    return a(a2.uid, str);
                }
                String valueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", valueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(valueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                Log.e("WorkSourceUtil", valueOf2.length() != 0 ? "Could not find package: ".concat(valueOf2) : new String("Could not find package: "));
            }
        }
        return null;
    }

    private static String a(WorkSource workSource, int i) {
        Method method = f7113d;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return null;
            }
        }
        return null;
    }

    private static Method a() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<String> a(WorkSource workSource) {
        int b2 = workSource == null ? 0 : b(workSource);
        if (b2 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b2; i++) {
            String a2 = a(workSource, i);
            if (!n.b(a2)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private static void a(WorkSource workSource, int i, String str) {
        if (f7111b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f7111b.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method = f7110a;
        if (method == null) {
            return;
        }
        try {
            method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e3) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
        }
    }

    public static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || com.google.android.gms.common.n.c.a(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static int b(WorkSource workSource) {
        Method method = f7112c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    private static Method b() {
        if (l.d()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method c() {
        if (l.j()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static final Method d() {
        if (l.j()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        return null;
    }

    private static Method e() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method f() {
        if (l.d()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method g() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
