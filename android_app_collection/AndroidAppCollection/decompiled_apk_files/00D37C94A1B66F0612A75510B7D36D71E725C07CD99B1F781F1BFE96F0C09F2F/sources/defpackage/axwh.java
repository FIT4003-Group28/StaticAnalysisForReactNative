package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axwh  reason: default package */
/* loaded from: classes2.dex */
public final class axwh implements axwg {
    public static final vdg a;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        try {
            a = g.e("17", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, -24, 7, 24, 3}), vdh.r);
            g.d("38", false);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"17\"");
        }
    }

    @Override // defpackage.axwg
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
