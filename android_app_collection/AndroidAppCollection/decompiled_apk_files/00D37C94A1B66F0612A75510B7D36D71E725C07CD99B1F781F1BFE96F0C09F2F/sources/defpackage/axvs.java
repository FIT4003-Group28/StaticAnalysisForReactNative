package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvs  reason: default package */
/* loaded from: classes2.dex */
public final class axvs implements axvr {
    public static final vdg a;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        try {
            g.e("14", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.l);
            a = g.d("45350519", false);
            g.d("37", true);
            g.d("33", false);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"14\"");
        }
    }

    @Override // defpackage.axvr
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
