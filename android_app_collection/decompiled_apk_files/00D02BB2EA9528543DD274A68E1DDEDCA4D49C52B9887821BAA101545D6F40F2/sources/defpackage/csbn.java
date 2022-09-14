package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbn  reason: default package */
/* loaded from: classes5.dex */
final class csbn extends csbz {
    public csbn() {
        super("MOLECULE_DRIFTING");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.i(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            int a = csciVar.a(next);
            csbz.q(next, a, csbz.f(j2, a));
        }
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.l(csbz.a[csciVar.a(next)]);
        }
    }
}
