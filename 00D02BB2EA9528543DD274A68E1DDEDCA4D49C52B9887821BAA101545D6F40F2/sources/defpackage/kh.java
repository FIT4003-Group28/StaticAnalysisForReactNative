package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
/* compiled from: PG */
/* renamed from: kh  reason: default package */
/* loaded from: classes.dex */
public final class kh {
    public static final kq a;
    public static final ail<String, Typeface> b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new km();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new kl();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new kk();
        } else if (Build.VERSION.SDK_INT < 24 || kj.a == null) {
            a = new ki();
        } else {
            a = new kj();
        }
        b = new ail<>(16);
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = a.d(context, resources, i, str, i2);
        if (d != null) {
            b.c(a(resources, i, i2), d);
        }
        return d;
    }

    public static Typeface d(Context context, jn jnVar, Resources resources, int i, int i2, jx jxVar, boolean z) {
        Typeface a2;
        if (jnVar instanceof jq) {
            jq jqVar = (jq) jnVar;
            a2 = alh.b(context, jqVar.a, jxVar, !z ? jxVar == null : jqVar.c == 0, z ? jqVar.b : -1, i2);
        } else {
            a2 = a.a(context, (jo) jnVar, resources, i2);
            if (jxVar != null) {
                if (a2 != null) {
                    jxVar.d(a2);
                } else {
                    jxVar.c(-3);
                }
            }
        }
        if (a2 != null) {
            b.c(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface c(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface, i);
    }
}
