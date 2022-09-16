package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axwk  reason: default package */
/* loaded from: classes2.dex */
public final class axwk implements axwj {
    public static final vdg a;

    static {
        try {
            a = new vdl("com.google.android.libraries.performance.primes").f().g().e("9", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, -24, 7, 24, 4}), vdh.s);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"9\"");
        }
    }

    @Override // defpackage.axwj
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
