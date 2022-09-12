package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbg  reason: default package */
/* loaded from: classes5.dex */
final class csbg extends csbz {
    public csbg() {
        super("MIC_EXIT");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        csciVar.c.r(0);
        csciVar.d.r(0);
        csciVar.e.r(0);
        if (csciVar.c.s() < 0.5f) {
            csciVar.b.r(0);
            csciVar.c.k(0.0f);
            csciVar.d.k(0.0f);
        }
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            p(csciVar, it.next(), j2);
        }
        Iterator<csch> it2 = csciVar.iterator();
        while (it2.hasNext()) {
            if (it2.next().t()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.r(0);
            next.k(0.0f);
            next.l(0.0f);
        }
    }
}
