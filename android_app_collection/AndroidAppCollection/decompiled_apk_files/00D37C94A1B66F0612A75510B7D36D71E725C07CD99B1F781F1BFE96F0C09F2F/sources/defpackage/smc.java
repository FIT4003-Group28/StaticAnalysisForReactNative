package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
/* compiled from: PG */
/* renamed from: smc  reason: default package */
/* loaded from: classes4.dex */
public final class smc {
    public static volatile ayax a;

    private smc() {
    }

    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static void b() {
        aohk.c("elements", new String[0]);
    }

    public static int c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
