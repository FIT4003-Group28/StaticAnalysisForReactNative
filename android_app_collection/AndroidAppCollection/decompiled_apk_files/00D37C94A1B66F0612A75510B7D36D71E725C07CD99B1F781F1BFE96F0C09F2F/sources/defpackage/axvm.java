package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvm  reason: default package */
/* loaded from: classes2.dex */
public final class axvm implements axvl {
    public static final vdg a;

    static {
        try {
            a = new vdl("com.google.android.libraries.performance.primes").f().g().e("16", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.i);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"16\"");
        }
    }

    @Override // defpackage.axvl
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
