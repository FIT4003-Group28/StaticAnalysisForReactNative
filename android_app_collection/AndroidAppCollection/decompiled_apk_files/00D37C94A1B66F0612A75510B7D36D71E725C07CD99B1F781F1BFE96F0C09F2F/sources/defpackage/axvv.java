package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvv  reason: default package */
/* loaded from: classes2.dex */
public final class axvv implements axvu {
    public static final vdg a;
    public static final vdg b;
    public static final vdg c;
    public static final vdg d;
    public static final vdg e;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        a = g.d("25", false);
        b = g.d("34", false);
        g.b("45351156", 10L);
        try {
            c = g.e("40", (uxg) aopi.parseFrom(uxg.a, new byte[]{10, 45, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 114, 105, 109, 101, 115, 45, 106, 97, 110, 107, 45, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 18, 35, 8, 2, 18, 31, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 109, 105, 115, 115, 101, 100, 65, 112, 112, 70, 114, 97, 109, 101, 115, 18, 31, 8, 3, 18, 27, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 116, 111, 116, 97, 108, 70, 114, 97, 109, 101, 115, 18, 38, 8, 5, 18, 34, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 109, 97, 120, 70, 114, 97, 109, 101, 84, 105, 109, 101, 77, 105, 108, 108, 105, 115}), vdh.m);
            try {
                d = g.e("13", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.n);
                g.c("39", "com.google.android.primes-jank-%PACKAGE_NAME%");
                e = g.d("45351799", false);
            } catch (aopx unused) {
                throw new AssertionError("Could not parse proto flag \"13\"");
            }
        } catch (aopx unused2) {
            throw new AssertionError("Could not parse proto flag \"40\"");
        }
    }

    @Override // defpackage.axvu
    public final uxg a(Context context) {
        return (uxg) c.a(context);
    }

    @Override // defpackage.axvu
    public final baaw b(Context context) {
        return (baaw) d.a(context);
    }

    @Override // defpackage.axvu
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.axvu
    public final boolean d(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.axvu
    public final boolean e(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }
}
