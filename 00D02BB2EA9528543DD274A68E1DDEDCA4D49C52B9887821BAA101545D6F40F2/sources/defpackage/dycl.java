package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dycl  reason: default package */
/* loaded from: classes6.dex */
public final class dycl implements dycj {
    public static final cxmb<eaby> a;

    static {
        cxml a2 = new cxml("com.google.android.libraries.performance.primes").a();
        a2.d("25", false);
        try {
            a = a2.f("13", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dyck.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"13\"");
        }
    }

    @Override // defpackage.dycj
    public final eaby a(Context context) {
        return a.b(context);
    }
}
