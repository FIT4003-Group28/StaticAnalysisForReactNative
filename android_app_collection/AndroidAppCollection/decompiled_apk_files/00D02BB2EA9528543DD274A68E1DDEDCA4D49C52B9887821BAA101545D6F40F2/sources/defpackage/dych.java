package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dych  reason: default package */
/* loaded from: classes6.dex */
public final class dych implements dycf {
    public static final cxmb<eaby> a;

    static {
        try {
            a = new cxml("com.google.android.libraries.performance.primes").a().f("15", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dycg.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"15\"");
        }
    }

    @Override // defpackage.dycf
    public final eaby a(Context context) {
        return a.b(context);
    }
}
