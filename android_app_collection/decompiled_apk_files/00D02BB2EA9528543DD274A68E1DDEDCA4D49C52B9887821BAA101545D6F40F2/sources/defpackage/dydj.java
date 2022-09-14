package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dydj  reason: default package */
/* loaded from: classes6.dex */
public final class dydj implements dydh {
    public static final cxmb<eaby> a;

    static {
        try {
            a = new cxml("com.google.android.libraries.performance.primes").a().f("9", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dydi.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"9\"");
        }
    }

    @Override // defpackage.dydh
    public final eaby a(Context context) {
        return a.b(context);
    }
}
