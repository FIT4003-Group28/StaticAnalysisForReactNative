package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbl  reason: default package */
/* loaded from: classes5.dex */
final class csbl extends csbz {
    public csbl() {
        super("MOLECULE_EXIT");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csciVar.b.h(3.1415927f, 12.0f);
        csciVar.c.h(3.1415927f, 4.0f);
        csciVar.d.h(0.0f, 4.0f);
        csciVar.e.h(0.0f, 12.0f);
        csciVar.f.h(0.0f, 8.0f);
        csciVar.g.h(0.0f, 8.0f);
        csbz.m(csciVar);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.i(4.0f);
            next.k(0.0f);
        }
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (j2 - j < 100) {
            csciVar.b.l(16.0f);
            csciVar.c.l(9.0f);
            csciVar.d.l(14.0f);
            csciVar.e.l(10.0f);
            return true;
        }
        o(csciVar, j2);
        return false;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csbz.n(csciVar);
    }
}
