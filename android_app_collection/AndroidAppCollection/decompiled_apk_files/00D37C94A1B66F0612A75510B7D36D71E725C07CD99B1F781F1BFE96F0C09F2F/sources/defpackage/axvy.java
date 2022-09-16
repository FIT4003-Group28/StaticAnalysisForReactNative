package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvy  reason: default package */
/* loaded from: classes2.dex */
public final class axvy implements axvx {
    public static final vdg a;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        g.d("5", true);
        try {
            a = g.e("8", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.o);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"8\"");
        }
    }

    @Override // defpackage.axvx
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
