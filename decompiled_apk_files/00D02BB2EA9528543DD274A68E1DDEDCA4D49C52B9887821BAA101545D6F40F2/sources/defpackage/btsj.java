package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: btsj  reason: default package */
/* loaded from: classes.dex */
public final class btsj {
    @dzsi
    private static Boolean a;
    private static volatile btsi b = new btsi(-1, -1);

    private btsj() {
    }

    public static boolean a(Context context, String str) {
        boolean booleanValue;
        try {
            if (!context.getPackageName().equals(str)) {
                return btsn.a(context, str);
            }
            synchronized (btsj.class) {
                if (a == null) {
                    a = Boolean.valueOf(btsn.a(context, str));
                }
                booleanValue = a.booleanValue();
            }
            return booleanValue;
        } catch (RuntimeException e) {
            bvoo.j(e);
            return false;
        }
    }

    public static boolean b(Context context) {
        return f(context, 12800000);
    }

    public static int c(Context context) {
        return e(context, 12800000);
    }

    public static boolean d(Context context) {
        return f(context, 12800000);
    }

    public static int e(Context context, int i) {
        try {
            btsi btsiVar = b;
            if (btsiVar.a(i)) {
                return btsiVar.a;
            }
            synchronized (btsj.class) {
                btsi btsiVar2 = b;
                if (btsiVar2.a(i)) {
                    return btsiVar2.a;
                }
                int j = cnmq.a.j(context, i);
                if (j == 0) {
                    b = new btsi(i, 0);
                    j = 0;
                }
                return j;
            }
        } catch (RuntimeException e) {
            bvoo.j(e);
            return 16;
        }
    }

    public static boolean f(Context context, int i) {
        return e(context, i) == 0;
    }
}
