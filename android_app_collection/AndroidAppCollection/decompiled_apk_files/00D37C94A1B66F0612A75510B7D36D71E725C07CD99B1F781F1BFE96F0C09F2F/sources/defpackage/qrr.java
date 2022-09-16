package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: qrr  reason: default package */
/* loaded from: classes4.dex */
public class qrr {
    public static final int c;
    public static final qrr d;

    static {
        int i = qse.c;
        c = 213380000;
        d = new qrr();
    }

    public final int g(Context context) {
        return h(context, c);
    }

    public final int h(Context context, int i) {
        int b = qse.b(context, i);
        if (qse.f(context, b)) {
            return 18;
        }
        return b;
    }

    public final Intent i(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                return qxh.c();
            }
            return null;
        } else if (context == null || !trz.e(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(c);
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
                    sb.append(qyr.b(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return qxh.b(sb.toString());
        } else {
            return qxh.a();
        }
    }

    public final PendingIntent j(Context context, int i, String str) {
        Intent i2 = i(context, i, str);
        if (i2 == null) {
            return null;
        }
        return rfi.a(context, 0, i2, rfi.a | 134217728);
    }
}
