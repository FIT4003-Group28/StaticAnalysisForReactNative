package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axwn  reason: default package */
/* loaded from: classes2.dex */
public final class axwn implements axwm {
    public static final vdg a;

    static {
        try {
            a = new vdl("com.google.android.libraries.performance.primes").f().g().e("10", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, -24, 7, 24, 4}), vdh.t);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"10\"");
        }
    }

    @Override // defpackage.axwm
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
