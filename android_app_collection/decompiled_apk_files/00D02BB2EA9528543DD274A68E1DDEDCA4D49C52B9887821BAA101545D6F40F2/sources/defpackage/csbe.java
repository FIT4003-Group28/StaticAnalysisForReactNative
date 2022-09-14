package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbe  reason: default package */
/* loaded from: classes5.dex */
final class csbe extends csbz {
    public csbe() {
        super("GOOGLE LOGO EXIT");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csciVar.b(true);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        float e = csbz.e(j, j2, 500L);
        csch cschVar = csciVar.f;
        csch cschVar2 = csciVar.g;
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            if (e - (csciVar.a(next) * 0.15f) > 0.0f) {
                next.q(0);
                next.k(0.0f);
                if (next == cschVar || next == cschVar2) {
                    next.o(0.0f);
                }
                p(csciVar, next, j2);
            }
        }
        return cschVar.u() || cschVar2.u();
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csciVar.f.o(0.0f);
        csciVar.g.o(0.0f);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.q(0);
            next.k(0.0f);
        }
        csciVar.b(false);
    }
}
