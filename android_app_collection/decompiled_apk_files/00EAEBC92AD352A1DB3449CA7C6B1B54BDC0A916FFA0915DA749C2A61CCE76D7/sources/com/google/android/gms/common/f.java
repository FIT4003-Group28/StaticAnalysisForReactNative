package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.j0;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6957a = i.f6959a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f6958b = new f();

    public static f a() {
        return f6958b;
    }

    private static String b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f6957a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.n.c.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return i.a(context);
    }

    public int a(Context context, int i) {
        int a2 = i.a(context, i);
        if (i.b(context, a2)) {
            return 18;
        }
        return a2;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a2, 134217728);
    }

    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !com.google.android.gms.common.util.i.c(context)) ? j0.a("com.google.android.gms", b(context, str)) : j0.a();
        } else if (i == 3) {
            return j0.a("com.google.android.gms");
        } else {
            return null;
        }
    }

    public String a(int i) {
        return i.a(i);
    }

    public boolean a(Context context, String str) {
        return i.a(context, str);
    }

    public int b(Context context) {
        return a(context, f6957a);
    }

    public boolean b(int i) {
        return i.b(i);
    }
}
