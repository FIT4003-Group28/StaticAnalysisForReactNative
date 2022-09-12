package defpackage;

import android.content.Context;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: btpf  reason: default package */
/* loaded from: classes.dex */
public enum btpf {
    PHONE_PORTRAIT(false, false),
    PHONE_LANDSCAPE(false, true),
    TABLET_PORTRAIT(true, false),
    TABLET_LANDSCAPE(true, true);
    
    private static Boolean g;
    public final boolean e;
    public final boolean f;

    btpf(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }

    public static boolean a(Context context) {
        return !b(context);
    }

    public static boolean b(Context context) {
        if (g == null) {
            g = Boolean.valueOf(c(context).e);
        }
        return g.booleanValue();
    }

    public static btpf c(Context context) {
        return d(context.getResources().getConfiguration());
    }

    public static btpf d(Configuration configuration) {
        btpf[] values;
        boolean z = true;
        boolean z2 = configuration.smallestScreenWidthDp >= 600;
        if (configuration.screenWidthDp <= configuration.screenHeightDp) {
            z = false;
        }
        for (btpf btpfVar : values()) {
            if (btpfVar.f == z && btpfVar.e == z2) {
                return btpfVar;
            }
        }
        throw new RuntimeException();
    }
}
