package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvj  reason: default package */
/* loaded from: classes2.dex */
public final class axvj implements axvi {
    public static final vdg a;
    public static final vdg b;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        a = g.d("45352228", false);
        try {
            b = g.e("45352241", (azyy) aopi.parseFrom(azyy.a, new byte[0]), vdh.h);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"45352241\"");
        }
    }

    @Override // defpackage.axvi
    public final azyy a(Context context) {
        return (azyy) b.a(context);
    }

    @Override // defpackage.axvi
    public final boolean b(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
