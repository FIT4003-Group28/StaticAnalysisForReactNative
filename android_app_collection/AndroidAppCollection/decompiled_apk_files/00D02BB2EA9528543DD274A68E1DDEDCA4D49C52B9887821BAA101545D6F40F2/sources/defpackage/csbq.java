package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbq  reason: default package */
/* loaded from: classes5.dex */
final class csbq extends csbz {
    private final int[] D;

    public csbq() {
        super("MOLECULE_APPEAR");
        this.D = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.i(csciVar);
        csciVar.i(0.0f);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.l(csbz.a[csciVar.a(next)] + 10.0f);
        }
        csciVar.g();
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        float e = csbz.e(j, j2, 300L);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            int a = csciVar.a(next);
            float f = e - (this.D[a] * 0.01f);
            if (f > 0.0f && f < 0.5f) {
                next.l(csbz.a[a] - 32.0f);
            } else if (f > 0.5f && f < 1.0f) {
                next.l(csbz.a[a]);
            }
        }
        csciVar.i(e);
        return e < 1.0f;
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
