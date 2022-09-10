package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbm  reason: default package */
/* loaded from: classes5.dex */
final class csbm extends csbz {
    public csbm() {
        super("MOLECULE_WAVY");
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
            float f = csbz.f(j2, a);
            csbz.q(next, a, f);
            if (next == csciVar.b) {
                double d = f;
                Double.isNaN(d);
                if (d % 0.5d < 0.25d) {
                    next.i(14.0f);
                } else {
                    next.i(12.0f);
                }
            }
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
