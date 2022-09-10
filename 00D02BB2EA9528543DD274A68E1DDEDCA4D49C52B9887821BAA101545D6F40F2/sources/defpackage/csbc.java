package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbc  reason: default package */
/* loaded from: classes5.dex */
final class csbc extends csbz {
    public csbc() {
        super("GOOGLE LOGO ENTER");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.g(csciVar);
        csciVar.b(true);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (csbz.j(csciVar)) {
            float e = csbz.e(j, j2, 300L);
            Iterator<csch> it = csciVar.iterator();
            while (it.hasNext()) {
                csch next = it.next();
                if (e - (csciVar.a(next) * 0.15f) > 0.0f) {
                    next.q(1);
                    next.o(1.0f);
                    next.k(csciVar.c(next));
                    next.l(0.0f);
                } else {
                    p(csciVar, next, j2);
                }
            }
            return e < 1.0f;
        }
        o(csciVar, j2);
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.q(1);
            next.o(1.0f);
            next.k(csciVar.c(next));
            next.l(0.0f);
        }
    }
}
