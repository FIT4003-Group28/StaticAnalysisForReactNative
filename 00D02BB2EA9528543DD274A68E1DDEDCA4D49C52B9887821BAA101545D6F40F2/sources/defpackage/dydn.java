package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dydn  reason: default package */
/* loaded from: classes6.dex */
public final class dydn implements dydl {
    public static final cxmb<eaby> a;

    static {
        try {
            a = new cxml("com.google.android.libraries.performance.primes").a().f("10", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dydm.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"10\"");
        }
    }

    @Override // defpackage.dydl
    public final eaby a(Context context) {
        return a.b(context);
    }
}
