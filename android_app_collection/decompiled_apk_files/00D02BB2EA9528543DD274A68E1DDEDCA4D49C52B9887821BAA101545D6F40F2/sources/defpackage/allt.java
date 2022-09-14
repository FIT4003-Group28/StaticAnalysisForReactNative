package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: allt  reason: default package */
/* loaded from: classes2.dex */
public final class allt implements alsn {
    public final int a;
    private final dmpz b;
    private final alrt c;

    public allt(int i, alrt alrtVar) {
        this.a = i;
        this.c = alrtVar;
        dmpy bZ = dmpz.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpz dmpzVar = (dmpz) bZ.b;
        dmpzVar.a |= 1;
        dmpzVar.b = i;
        this.b = bZ.bK();
    }

    @Override // defpackage.akuh
    public final int a() {
        return -1;
    }

    @Override // defpackage.akuh
    public final dmpz b() {
        return this.b;
    }

    @Override // defpackage.akuh
    public final void c(Runnable runnable) {
        boolean z;
        alrs alrsVar = this.c.a;
        synchronized (alrsVar) {
            z = alrsVar.a;
            if (!z) {
                List<Runnable> list = alrsVar.b;
                dbsk.s(list);
                list.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }

    @Override // defpackage.akuh
    public final dmqx d() {
        return dmqx.e;
    }

    @Override // defpackage.akuh
    public final dmpc e() {
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        dmpcVar.k(dmqa.d, this.b);
        return dmpcVar;
    }

    @Override // defpackage.akuh
    public final dmpe f() {
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.k(dmqa.c, this.b);
        return dmpeVar;
    }

    @Override // defpackage.akuh
    public final dmpk g() {
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpkVar.k(dmqa.b, this.b);
        return dmpkVar;
    }

    @Override // defpackage.alsn
    public final boolean q(akuh akuhVar, boolean z) {
        return akuhVar instanceof allt;
    }
}
