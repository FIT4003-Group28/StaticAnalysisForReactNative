package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dycp  reason: default package */
/* loaded from: classes6.dex */
public final class dycp implements dycn {
    public static final cxmb<eaby> a;

    static {
        cxml a2 = new cxml("com.google.android.libraries.performance.primes").a();
        a2.d("5", true);
        try {
            a = a2.f("8", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dyco.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"8\"");
        }
    }

    @Override // defpackage.dycn
    public final eaby a(Context context) {
        return a.b(context);
    }
}
