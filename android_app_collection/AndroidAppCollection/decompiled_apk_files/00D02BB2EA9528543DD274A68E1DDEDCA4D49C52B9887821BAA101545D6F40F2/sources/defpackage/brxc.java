package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: brxc  reason: default package */
/* loaded from: classes4.dex */
public final class brxc implements brwx {
    @dzsi
    public brwy a;
    private final dxio<bvjj> b;
    private final bzmm c;
    private final bbdv d;
    private final brwy e;
    private final brwy f;
    private final bbeo g;
    @dzsi
    private brlu h;
    @dzsi
    private brwy i;

    public brxc(dxio<bvjj> dxioVar, bzmm bzmmVar, bbdv bbdvVar, brft brftVar, bbem bbemVar, bbeo bbeoVar) {
        this.b = dxioVar;
        this.c = bzmmVar;
        this.d = bbdvVar;
        this.e = brftVar;
        this.f = bbemVar;
        this.g = bbeoVar;
    }

    @dzsi
    private final bryf c(brww brwwVar, boolean z, List<cqkp> list, bbdt bbdtVar, @dzsi ilo iloVar) {
        if (bbdt.GOOD_STATE.equals(bbdtVar)) {
            this.d.H(false);
            this.b.a().S(bvjk.jd, true);
            return null;
        } else if (bbdt.UNSUPPORTED_USER.equals(bbdtVar)) {
            return null;
        } else {
            brwy brwyVar = this.f;
            ((bbem) brwyVar).c = z;
            bryf b = b(brwyVar, list, brwwVar);
            if (iloVar != null && b != null && (b instanceof abmh)) {
                ((abmh) b).a(iloVar);
            }
            return b;
        }
    }

    private final bbdt d(@dzsi ilo iloVar) {
        if (iloVar != null) {
            return this.d.D(iloVar);
        }
        return bbdt.NOT_PRESENT;
    }

    private static void e(int i, cqkp cqkpVar, List<cqkp> list) {
        if (i <= list.size()) {
            list.add(i, cqkpVar);
        } else {
            list.add(cqkpVar);
        }
    }

    @Override // defpackage.brwx
    @dzsi
    public final bryf a(brww brwwVar, brlu brluVar, List<cqkp> list) {
        brwy brwyVar;
        if (!brluVar.equals(this.h) || (brwyVar = this.i) == null) {
            this.h = brluVar;
            this.a = null;
            brww brwwVar2 = brww.ANY;
            int ordinal = brwwVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    ilo F = brluVar.F();
                    return c(brwwVar, true, list, d(F), F);
                } else if (ordinal == 2) {
                    return b(this.e, list, brwwVar);
                } else {
                    return null;
                }
            }
            ilo F2 = brluVar.F();
            bbdt d = d(F2);
            if (!bbdt.GOOD_STATE.equals(d) ? !(!this.f.d() || d == bbdt.UNSUPPORTED_USER) : this.g.d()) {
                return c(brwwVar, false, list, d, F2);
            }
            return null;
        } else if (brwyVar.equals(this.a)) {
            return null;
        } else {
            bryf g = this.i.g();
            e(this.i.h(brwwVar), g, list);
            return g;
        }
    }

    @dzsi
    final bryf b(final brwy brwyVar, List<cqkp> list, brww brwwVar) {
        if (!this.c.a(brwyVar)) {
            this.i = null;
            return null;
        }
        bryf g = brwyVar.g();
        e(brwyVar.h(brwwVar), g, list);
        this.i = brwyVar;
        g.i(new brye(this, brwyVar) { // from class: brxb
            private final brxc a;
            private final brwy b;

            {
                this.a = this;
                this.b = brwyVar;
            }

            @Override // defpackage.brye
            public final void a() {
                this.a.a = this.b;
            }
        });
        return g;
    }
}
