package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbf  reason: default package */
/* loaded from: classes5.dex */
final class csbf extends csbz {
    public csbf() {
        super("MIC ENTER");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (csbz.j(csciVar)) {
            float e = csbz.e(j, j2, 300L);
            Iterator<csch> it = csciVar.iterator();
            while (it.hasNext()) {
                csch next = it.next();
                if (e - (csciVar.a(next) * 0.15f) < 0.0f) {
                    p(csciVar, next, j2);
                } else {
                    next.l(-6.0f);
                }
            }
            if (csciVar.b.m() < -5.666999816894531d) {
                csbz.k(csciVar);
            }
            Iterator<csch> it2 = csciVar.iterator();
            while (it2.hasNext()) {
                if (!it2.next().t()) {
                    return true;
                }
            }
            return false;
        }
        o(csciVar, j2);
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csbz.l(csciVar);
    }
}
