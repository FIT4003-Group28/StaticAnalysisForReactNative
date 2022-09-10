package defpackage;
/* compiled from: PG */
/* renamed from: lxf  reason: default package */
/* loaded from: classes7.dex */
public final class lxf extends atdm {
    private final lxj k;
    private boolean l;
    private boolean m;
    @dzsi
    private nce n;

    public lxf(atcu atcuVar, btrm btrmVar, cjqy cjqyVar, cjqq cjqqVar, atcw atcwVar, asla aslaVar, dxio<afwo> dxioVar, akox akoxVar, hwe hweVar, dxio<qbo> dxioVar2, dxio<duod> dxioVar3, lxj lxjVar, kdg kdgVar) {
        super(atcuVar, btrmVar, cjqyVar, cjqqVar, atcwVar, aslaVar, dxioVar, akoxVar, hweVar, alhv.a(), dxioVar2, dxioVar3, true != kdgVar.o() ? 3 : 2);
        this.k = lxjVar;
    }

    @Override // defpackage.atdm
    public final void h(aryn arynVar) {
        this.k.a(arynVar);
    }

    @Override // defpackage.atdm
    protected final void i(crhk crhkVar) {
        this.k.a(((crho) crhkVar.a).a);
    }

    @Override // defpackage.atdm
    protected final alfa j(atlq atlqVar) {
        if (this.l) {
            return alfa.CAR_ALTERNATES;
        }
        if (!this.m) {
            if (atlqVar.g != astb.NO_SEARCH) {
                return alfa.SHOW_NONE;
            }
            return alfa.SHOW_ALTERNATES_ONLY;
        }
        return alfa.SHOW_NONE;
    }

    public final void k(boolean z, @dzsi nce nceVar) {
        if (z) {
            dbsk.s(nceVar);
        }
        this.l = z;
        this.n = nceVar;
        o();
    }

    public final void l(boolean z) {
        if (this.m != z) {
            this.m = z;
            o();
        }
    }

    @Override // defpackage.atdm
    protected final void m(alco alcoVar) {
        atlq atlqVar;
        if (!this.l) {
            super.m(alcoVar);
        } else if (Qq().bb() && (atlqVar = this.h) != null && atlqVar.b()) {
            nce nceVar = this.n;
            amub amubVar = alcoVar.a;
            lsu lsuVar = (lsu) nceVar;
            int m = lsuVar.a.m();
            for (int i = 0; i < m; i++) {
                if (lsuVar.a.l(i) == amubVar) {
                    lsuVar.p(i);
                    return;
                }
            }
        }
    }
}
