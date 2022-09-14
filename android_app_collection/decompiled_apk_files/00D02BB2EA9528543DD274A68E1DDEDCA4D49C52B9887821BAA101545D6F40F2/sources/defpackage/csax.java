package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csax  reason: default package */
/* loaded from: classes5.dex */
final class csax extends csbz {
    public csax() {
        super("DIDN'T GET IT");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.g(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        float e = csbz.e(j, j2, 550L);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.k((float) (Math.sin((e - (csciVar.a(next) * 0.030909091f)) * 6.2831855f * 3.0f) * 6.0d));
            p(csciVar, next, j2);
        }
        return e < 1.0f;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().k(0.0f);
        }
    }
}
