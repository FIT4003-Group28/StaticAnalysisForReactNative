package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dycx  reason: default package */
/* loaded from: classes6.dex */
public final class dycx implements dycv {
    public static final cxmb<Boolean> a;
    public static final cxmb<eaby> b;

    static {
        cxml a2 = new cxml("com.google.android.libraries.performance.primes").a();
        a2.d("2", true);
        a = a2.d("3", false);
        try {
            b = a2.f("19", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dycw.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"19\"");
        }
    }

    @Override // defpackage.dycv
    public final boolean a(Context context) {
        return a.b(context).booleanValue();
    }

    @Override // defpackage.dycv
    public final eaby b(Context context) {
        return b.b(context);
    }
}
