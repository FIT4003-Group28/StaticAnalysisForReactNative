package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvp  reason: default package */
/* loaded from: classes2.dex */
public final class axvp implements axvo {
    public static final vdg a;

    static {
        vdl g = new vdl("com.google.android.libraries.performance.primes").f().g();
        try {
            a = g.e("15", (baaw) aopi.parseFrom(baaw.a, new byte[]{16, 0, 24, 2}), vdh.k);
            try {
                g.e("45357002", (uwc) aopi.parseFrom(uwc.a, new byte[]{8, 0, 18, 0, 24, 0, 32, 0, 40, 0, 48, 0, 56, 0, 64, 0}), vdh.j);
                try {
                    g.e("45355611", (uwc) aopi.parseFrom(uwc.a, new byte[]{8, 0, 18, 0, 24, 0, 32, 0, 40, 0, 48, 0, 56, 0, 64, 0}), vdh.j);
                } catch (aopx unused) {
                    throw new AssertionError("Could not parse proto flag \"45355611\"");
                }
            } catch (aopx unused2) {
                throw new AssertionError("Could not parse proto flag \"45357002\"");
            }
        } catch (aopx unused3) {
            throw new AssertionError("Could not parse proto flag \"15\"");
        }
    }

    @Override // defpackage.axvo
    public final baaw a(Context context) {
        return (baaw) a.a(context);
    }
}
