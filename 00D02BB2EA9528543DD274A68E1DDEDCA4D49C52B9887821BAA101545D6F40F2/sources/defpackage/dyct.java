package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dyct  reason: default package */
/* loaded from: classes6.dex */
public final class dyct implements dycr {
    public static final cxmb<eaby> a;

    static {
        try {
            a = new cxml("com.google.android.libraries.performance.primes").a().f("12", (eaby) dsqw.cq(eaby.d, new byte[]{16, 0, 24, 2}), dycs.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"12\"");
        }
    }

    @Override // defpackage.dycr
    public final eaby a(Context context) {
        return a.b(context);
    }
}
