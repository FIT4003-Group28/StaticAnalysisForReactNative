package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cjxh  reason: default package */
/* loaded from: classes.dex */
public final class cjxh {
    public static final cqtv a = new cjxg(cqrp.d(48.0d), cqrp.d(72.0d), 360);
    public static final cqtv b = cqrp.d(48.0d);
    public static final cqtv c = cqrp.d(64.0d);
    private static final cqtv e = cqrp.d(32.0d);
    private static final cqtv f = cqrp.d(38.0d);
    private static final cqtv g = new cjxg(cqrp.d(36.0d), cqrp.d(48.0d), 360);
    private static final cqtv h = new cjxg(cqrp.d(36.0d), cqrp.d(56.0d), 360);
    private static final cqtv i = new cjxg(cqrp.d(52.0d), cqrp.d(56.0d), 361);
    public static final cqtv d = new cjxg(cqrp.d(56.0d), cqrp.d(64.0d), 361);

    public static boolean a(Context context, int i2) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= i2;
    }

    public static cqtv b(cjxf cjxfVar) {
        cjxf cjxfVar2 = cjxf.SMALL;
        int ordinal = cjxfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return f;
            }
            if (ordinal == 2) {
                return g;
            }
            if (ordinal == 3) {
                return h;
            }
            if (ordinal == 4) {
                return i;
            }
            String valueOf = String.valueOf(cjxfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Unknown button size: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return e;
    }

    public static cqtv c(cjxf cjxfVar) {
        cjxf cjxfVar2 = cjxf.SMALL;
        int ordinal = cjxfVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return b;
        }
        if (ordinal == 3) {
            return c;
        }
        if (ordinal == 4) {
            return d;
        }
        String valueOf = String.valueOf(cjxfVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Unknown button size: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
