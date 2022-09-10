package defpackage;

import java.util.Comparator;
/* renamed from: bzku  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bzku implements Comparator {
    static final Comparator a = new bzku();

    private bzku() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        bzjd bzjdVar = (bzjd) obj2;
        int i = bzkv.b;
        bzjc b = bzjc.b(((bzjd) obj).f);
        if (b == null) {
            b = bzjc.UNKNOWN;
        }
        int i2 = b.e;
        bzjc b2 = bzjc.b(bzjdVar.f);
        if (b2 == null) {
            b2 = bzjc.UNKNOWN;
        }
        return i2 - b2.e;
    }
}
