package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dycd  reason: default package */
/* loaded from: classes6.dex */
public final class dycd implements dycb {
    public static final cxmb<eaby> a;

    static {
        try {
            a = new cxml("com.google.android.libraries.performance.primes").a().f("16", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dycc.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"16\"");
        }
    }

    @Override // defpackage.dycb
    public final eaby a(Context context) {
        return a.b(context);
    }
}
