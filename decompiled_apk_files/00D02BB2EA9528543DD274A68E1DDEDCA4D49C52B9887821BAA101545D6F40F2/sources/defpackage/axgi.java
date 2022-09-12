package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axgi  reason: default package */
/* loaded from: classes3.dex */
public final class axgi {
    public static final dcqe a = dcqe.c("axgi");
    public static final dcep<axgg> b = dcep.E(axgg.LOADED, axgg.PARTIALLY_LOADED, axgg.SUBSEQUENT_LOAD_ERROR, axgg.SUBSEQUENT_LOAD_IN_PROGRESS);
    public final z<axgh> c;
    public final z<axgh> d;
    public final z<axgh> e;
    public final z<dqas> f;
    public final axis g;
    public final Executor h;
    public final String i;
    private final axjm j;
    private final akfa k;
    private final bvjj l;
    private boolean m;

    public axgi(axis axisVar, axjm axjmVar, Executor executor, akfa akfaVar, bvjj bvjjVar, String str) {
        this.g = axisVar;
        this.j = axjmVar;
        this.h = executor;
        this.k = akfaVar;
        this.l = bvjjVar;
        this.i = str;
        axgf f = axgh.f();
        f.e(axgg.IDLE);
        this.c = new axfy(this, f.g());
        axgf f2 = axgh.f();
        f2.e(axgg.IDLE);
        this.d = new axfz(this, f2.g());
        axgf f3 = axgh.f();
        f3.e(axgg.IDLE);
        this.e = new axga(this, f3.g());
        this.f = new z<>();
    }

    public static void e(z<axgh> zVar, dqae dqaeVar) {
        axgh h = zVar.h();
        ArrayList arrayList = new ArrayList(h.b().c);
        if (g(arrayList, dqaeVar)) {
            i(zVar, arrayList);
            return;
        }
        axgf e = h.e();
        dimp b2 = h.b();
        dsqp dsqpVar = (dsqp) b2.cu(5);
        dsqpVar.bC(b2);
        dimo dimoVar = (dimo) dsqpVar;
        if (dimoVar.c) {
            dimoVar.bF();
            dimoVar.c = false;
        }
        dimp dimpVar = (dimp) dimoVar.b;
        dqaeVar.getClass();
        dimpVar.b();
        dimpVar.c.add(0, dqaeVar);
        e.d(dimoVar.bK());
        zVar.f(e.g());
    }

    public static void f(z<axgh> zVar, String str) {
        if (!b.contains(zVar.h().a())) {
            return;
        }
        axgh h = zVar.h();
        ArrayList arrayList = new ArrayList();
        for (dqae dqaeVar : h.b().c) {
            dqau dqauVar = dqaeVar.b;
            if (dqauVar == null) {
                dqauVar = dqau.e;
            }
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            if (!str.equals(dqknVar.d)) {
                arrayList.add(dqaeVar);
            }
        }
        axgf e = h.e();
        dimp b2 = h.b();
        dsqp dsqpVar = (dsqp) b2.cu(5);
        dsqpVar.bC(b2);
        dimo dimoVar = (dimo) dsqpVar;
        if (dimoVar.c) {
            dimoVar.bF();
            dimoVar.c = false;
        }
        ((dimp) dimoVar.b).c = dimp.ck();
        dimoVar.a(arrayList);
        e.d(dimoVar.bK());
        zVar.f(e.g());
    }

    public static boolean g(List<dqae> list, dqae dqaeVar) {
        for (int i = 0; i < list.size(); i++) {
            dqau dqauVar = list.get(i).b;
            if (dqauVar == null) {
                dqauVar = dqau.e;
            }
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            String str = dqknVar.d;
            dqau dqauVar2 = dqaeVar.b;
            if (dqauVar2 == null) {
                dqauVar2 = dqau.e;
            }
            dqkn dqknVar2 = dqauVar2.b;
            if (dqknVar2 == null) {
                dqknVar2 = dqkn.e;
            }
            if (str.equals(dqknVar2.d)) {
                list.set(i, dqaeVar);
                return true;
            }
        }
        return false;
    }

    public static boolean h(List<dqae> list, String str, dqaw dqawVar) {
        for (int i = 0; i < list.size(); i++) {
            dqae dqaeVar = list.get(i);
            dqau dqauVar = dqaeVar.b;
            if (dqauVar == null) {
                dqauVar = dqau.e;
            }
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            if (dqknVar.d.equals(str)) {
                dsqp dsqpVar = (dsqp) dqaeVar.cu(5);
                dsqpVar.bC(dqaeVar);
                dqad dqadVar = (dqad) dsqpVar;
                dqau dqauVar2 = dqaeVar.b;
                if (dqauVar2 == null) {
                    dqauVar2 = dqau.e;
                }
                dsqp dsqpVar2 = (dsqp) dqauVar2.cu(5);
                dsqpVar2.bC(dqauVar2);
                dqat dqatVar = (dqat) dsqpVar2;
                if (dqatVar.c) {
                    dqatVar.bF();
                    dqatVar.c = false;
                }
                dqau dqauVar3 = (dqau) dqatVar.b;
                dqawVar.getClass();
                dqauVar3.c = dqawVar;
                dqauVar3.a |= 2;
                if (dqadVar.c) {
                    dqadVar.bF();
                    dqadVar.c = false;
                }
                dqae dqaeVar2 = (dqae) dqadVar.b;
                dqau bK = dqatVar.bK();
                bK.getClass();
                dqaeVar2.b = bK;
                dqaeVar2.a |= 1;
                list.set(i, dqadVar.bK());
                return true;
            }
        }
        return false;
    }

    public static void i(z<axgh> zVar, List<dqae> list) {
        axgh h = zVar.h();
        axgf e = h.e();
        dimp b2 = h.b();
        dsqp dsqpVar = (dsqp) b2.cu(5);
        dsqpVar.bC(b2);
        dimo dimoVar = (dimo) dsqpVar;
        if (dimoVar.c) {
            dimoVar.bF();
            dimoVar.c = false;
        }
        dimp dimpVar = dimp.e;
        ((dimp) dimoVar.b).c = dimp.ck();
        dimoVar.a(list);
        e.d(dimoVar.bK());
        zVar.f(e.g());
    }

    private final boolean k(btlu btluVar) {
        return btlu.i(btluVar) == btlt.GOOGLE && this.i.equals(btluVar.j());
    }

    private final void l(String str) {
        z<axgh> zVar = this.c;
        axgf f = axgh.f();
        f.e(axgg.INITIAL_LOAD_IN_PROGRESS);
        zVar.g(f.g());
        z<axgh> zVar2 = this.d;
        axgf f2 = axgh.f();
        f2.e(axgg.INITIAL_LOAD_IN_PROGRESS);
        zVar2.g(f2.g());
        z<axgh> zVar3 = this.e;
        axgf f3 = axgh.f();
        f3.e(axgg.INITIAL_LOAD_IN_PROGRESS);
        zVar3.g(f3.g());
        btlu j = this.k.j();
        final dimj dimjVar = (dimj) dimm.h.bZ();
        if (dimjVar.c) {
            dimjVar.bF();
            dimjVar.c = false;
        }
        dimm dimmVar = (dimm) dimjVar.b;
        str.getClass();
        dimmVar.a |= 4;
        dimmVar.b = str;
        dimm.b(dimmVar);
        if (dimjVar.c) {
            dimjVar.bF();
            dimjVar.c = false;
        }
        dimm.c((dimm) dimjVar.b);
        boolean k = k(j);
        if (dimjVar.c) {
            dimjVar.bF();
            dimjVar.c = false;
        }
        dimm dimmVar2 = (dimm) dimjVar.b;
        dimmVar2.a |= 128;
        dimmVar2.e = k;
        bvor.a(n(bvjk.gZ, j), new mw(dimjVar) { // from class: axfq
            private final dimj a;

            {
                this.a = dimjVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dimj dimjVar2 = this.a;
                dspd dspdVar = (dspd) obj;
                dcqe dcqeVar = axgi.a;
                dimk bZ = diml.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                diml dimlVar = (diml) bZ.b;
                dspdVar.getClass();
                dimlVar.a |= 2;
                dimlVar.c = dspdVar;
                if (dimjVar2.c) {
                    dimjVar2.bF();
                    dimjVar2.c = false;
                }
                dimm dimmVar3 = (dimm) dimjVar2.b;
                diml bK = bZ.bK();
                dimm dimmVar4 = dimm.h;
                bK.getClass();
                dimmVar3.c = bK;
                dimmVar3.a |= 16;
            }
        });
        bvor.a(n(bvjk.ha, j), new mw(dimjVar) { // from class: axfr
            private final dimj a;

            {
                this.a = dimjVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dimj dimjVar2 = this.a;
                dspd dspdVar = (dspd) obj;
                dcqe dcqeVar = axgi.a;
                dimk bZ = diml.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                diml dimlVar = (diml) bZ.b;
                dspdVar.getClass();
                dimlVar.a |= 2;
                dimlVar.c = dspdVar;
                if (dimjVar2.c) {
                    dimjVar2.bF();
                    dimjVar2.c = false;
                }
                dimm dimmVar3 = (dimm) dimjVar2.b;
                diml bK = bZ.bK();
                dimm dimmVar4 = dimm.h;
                bK.getClass();
                dimmVar3.f = bK;
                dimmVar3.a |= 256;
            }
        });
        this.j.a((dimm) dimjVar.bK()).h(dzgh.b(this.h)).f(new axgb(this));
    }

    @dzsi
    private final dspd m(axok axokVar) {
        return j(axokVar).h().b().b;
    }

    private final dbsg<dspd> n(bvjk bvjkVar, btlu btluVar) {
        return k(btluVar) ? dbsg.j(this.l.au(bvjkVar, btluVar)) : dbpy.a;
    }

    public final void a() {
        if (!this.m) {
            this.m = true;
            l(this.i);
        }
    }

    public final boolean b() {
        return k(this.k.j());
    }

    public final void c() {
        l(this.i);
    }

    public final void d(axok axokVar) {
        dimj dimjVar = (dimj) dimm.h.bZ();
        String str = this.i;
        if (dimjVar.c) {
            dimjVar.bF();
            dimjVar.c = false;
        }
        dimm dimmVar = (dimm) dimjVar.b;
        str.getClass();
        dimmVar.a |= 4;
        dimmVar.b = str;
        axok axokVar2 = axok.FOLLOWERS;
        int ordinal = axokVar.ordinal();
        if (ordinal == 0) {
            if (dimjVar.c) {
                dimjVar.bF();
                dimjVar.c = false;
            }
            dimm.b((dimm) dimjVar.b);
            dimk bZ = diml.d.bZ();
            dspd m = m(axokVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            diml dimlVar = (diml) bZ.b;
            m.getClass();
            dimlVar.a = 1 | dimlVar.a;
            dimlVar.b = m;
            if (dimjVar.c) {
                dimjVar.bF();
                dimjVar.c = false;
            }
            dimm dimmVar2 = (dimm) dimjVar.b;
            diml bK = bZ.bK();
            bK.getClass();
            dimmVar2.c = bK;
            dimmVar2.a |= 16;
        } else if (ordinal == 1) {
            if (dimjVar.c) {
                dimjVar.bF();
                dimjVar.c = false;
            }
            dimm.c((dimm) dimjVar.b);
            dimk bZ2 = diml.d.bZ();
            dspd m2 = m(axokVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            diml dimlVar2 = (diml) bZ2.b;
            m2.getClass();
            dimlVar2.a = 1 | dimlVar2.a;
            dimlVar2.b = m2;
            if (dimjVar.c) {
                dimjVar.bF();
                dimjVar.c = false;
            }
            dimm dimmVar3 = (dimm) dimjVar.b;
            diml bK2 = bZ2.bK();
            bK2.getClass();
            dimmVar3.d = bK2;
            dimmVar3.a |= 64;
        } else if (ordinal == 2) {
            if (dimjVar.c) {
                dimjVar.bF();
                dimjVar.c = false;
            }
            dimm dimmVar4 = (dimm) dimjVar.b;
            dimmVar4.a |= 128;
            dimmVar4.e = true;
            dimk bZ3 = diml.d.bZ();
            dspd m3 = m(axokVar);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            diml dimlVar3 = (diml) bZ3.b;
            m3.getClass();
            dimlVar3.a = 1 | dimlVar3.a;
            dimlVar3.b = m3;
            if (dimjVar.c) {
                dimjVar.bF();
                dimjVar.c = false;
            }
            dimm dimmVar5 = (dimm) dimjVar.b;
            diml bK3 = bZ3.bK();
            bK3.getClass();
            dimmVar5.f = bK3;
            dimmVar5.a |= 256;
        }
        z<axgh> j = j(axokVar);
        axgf e = j.h().e();
        e.e(axgg.SUBSEQUENT_LOAD_IN_PROGRESS);
        j.g(e.g());
        this.j.a((dimm) dimjVar.bK()).h(dzgh.b(this.h)).f(new axge(this, axokVar, j));
    }

    public final z<axgh> j(axok axokVar) {
        z<axgh> zVar;
        axok axokVar2 = axok.FOLLOWERS;
        int ordinal = axokVar.ordinal();
        if (ordinal == 0) {
            zVar = this.c;
        } else if (ordinal != 1) {
            zVar = ordinal != 2 ? null : this.e;
        } else {
            zVar = this.d;
        }
        dbsk.s(zVar);
        return zVar;
    }
}
