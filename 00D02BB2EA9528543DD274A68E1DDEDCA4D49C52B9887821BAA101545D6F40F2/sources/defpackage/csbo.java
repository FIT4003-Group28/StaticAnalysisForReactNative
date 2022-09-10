package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbo  reason: default package */
/* loaded from: classes5.dex */
final class csbo extends csbz {
    private final int[] D;

    public csbo() {
        super("MOLECULE_DISAPPEAR");
        this.D = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.i(csciVar);
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
                next.l(csbz.a[a] - 25.0f);
            } else if (f > 0.5f && f < 1.0f) {
                next.l(csbz.a[a] + 10.0f);
            }
        }
        if (e > 0.8f) {
            csciVar.i(0.0f);
        }
        return e < 1.0f;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csciVar.i(0.0f);
    }
}
