package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dydb  reason: default package */
/* loaded from: classes6.dex */
public final class dydb implements dycz {
    public static final cxmb<eaby> a;

    static {
        try {
            a = new cxml("com.google.android.libraries.performance.primes").a().f("17", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dyda.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"17\"");
        }
    }

    @Override // defpackage.dycz
    public final eaby a(Context context) {
        return a.b(context);
    }
}
