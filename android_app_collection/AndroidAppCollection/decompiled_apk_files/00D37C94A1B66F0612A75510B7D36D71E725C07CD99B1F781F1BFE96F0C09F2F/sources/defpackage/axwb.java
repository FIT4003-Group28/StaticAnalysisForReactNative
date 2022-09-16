package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axwb  reason: default package */
/* loaded from: classes2.dex */
public final class axwb implements axwa {
    public static final vdg a;

    static {
        try {
            a = new vdl("com.google.android.libraries.performance.primes").f().g().e("12", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.p);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"12\"");
        }
    }

    @Override // defpackage.axwa
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
