package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cnmr  reason: default package */
/* loaded from: classes.dex */
public class cnmr {
    public static final int c = cnnl.b;
    public static final cnmr d = new cnmr();

    public final int i(Context context) {
        return j(context, c);
    }

    public final int j(Context context, int i) {
        int c2 = cnnl.c(context, i);
        if (cnnl.j(context, c2)) {
            return 18;
        }
        return c2;
    }

    public final Intent k(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                return cnvf.c();
            }
            return null;
        } else if (context == null || !cnxo.b(context)) {
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
                    sb.append(cnyb.b(context).b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return cnvf.b(sb.toString());
        } else {
            return cnvf.a();
        }
    }

    public PendingIntent l(Context context, int i, String str) {
        Intent k = k(context, i, str);
        if (k == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, k, 134217728);
    }
}
