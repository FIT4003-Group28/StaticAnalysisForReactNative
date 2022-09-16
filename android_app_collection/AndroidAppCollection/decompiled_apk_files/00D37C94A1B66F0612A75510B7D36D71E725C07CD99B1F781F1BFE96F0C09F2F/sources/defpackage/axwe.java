package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axwe  reason: default package */
/* loaded from: classes2.dex */
public final class axwe implements axwd {
    public static final vdg a;
    public static final vdg b;
    public static final vdg c;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        g.d("45350020", false);
        g.d("2", true);
        a = g.d("3", false);
        b = g.b("45357887", 1L);
        try {
            c = g.e("19", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.q);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"19\"");
        }
    }

    @Override // defpackage.axwd
    public final long a(Context context) {
        return ((Long) b.a(context)).longValue();
    }

    @Override // defpackage.axwd
    public final baaw b(Context context) {
        return (baaw) c.a(context);
    }

    @Override // defpackage.axwd
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
