package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azgq  reason: default package */
/* loaded from: classes.dex */
public final class azgq implements axwb {
    public final azof a;
    public final bvrb b;
    public final dxio<azhi> c;
    public final dxio<axyh> d;
    private final ckcw e;
    private final akfa f;
    private final btrm g;
    private final bvjj h;
    private final batm i;
    private final bvaz j;

    public azgq(ckcw ckcwVar, akfa akfaVar, btrm btrmVar, bvjj bvjjVar, bvaz bvazVar, azof azofVar, bvrb bvrbVar, batm batmVar, dxio dxioVar, dxio dxioVar2) {
        this.e = ckcwVar;
        this.f = akfaVar;
        this.g = btrmVar;
        this.h = bvjjVar;
        this.j = bvazVar;
        this.a = azofVar;
        this.b = bvrbVar;
        this.i = batmVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    private static List<azvo> i(List<azvo> list) {
        return dcdc.w(dclu.d(new azgo()), list);
    }

    private final List<azvo> j(List<azvo> list) {
        try {
            dcde e = dckz.e(this.a.a(azxm.a), new azgp());
            dccx dccxVar = new dccx();
            for (azvo azvoVar : list) {
                Collection<V> f = e.f(Long.valueOf(azvoVar.g()));
                if (f.size() == 1) {
                    azvoVar.a = (azvm) f.iterator().next();
                    dccxVar.g(azvoVar);
                } else {
                    ((ckcp) this.e.a(ckkf.h)).a(f.size());
                    if (f.isEmpty()) {
                        azvoVar.g();
                    } else {
                        azvoVar.g();
                    }
                }
            }
            return dccxVar.f();
        } catch (axxc unused) {
            return dcdc.e();
        }
    }

    @Override // defpackage.axwb
    public final List<azvo> a() {
        bvrj.UI_THREAD.d();
        try {
            return i(j(this.a.a(azxm.b)));
        } catch (axxc unused) {
            return dcdc.e();
        }
    }

    @Override // defpackage.axwb
    public final void b(axwa axwaVar) {
        this.b.b(new azgm(this, axwaVar), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.axwb
    public final List<azvo> c(akqi akqiVar) {
        bvrj.UI_THREAD.d();
        try {
            return i(j(azof.p(azxm.b, akqiVar.n())));
        } catch (axxc unused) {
            return dcdc.e();
        }
    }

    @Override // defpackage.axwb
    public final List<azvo> d(ilo iloVar) {
        bvrj.UI_THREAD.d();
        List<azvo> c = c(iloVar.ai());
        Long l = iloVar.C;
        if (l == null) {
            return c;
        }
        Iterator<azvo> it = c.iterator();
        while (it.hasNext()) {
            if (it.next().g() == l.longValue()) {
                return c;
            }
        }
        try {
            dcdc q = azof.q(azxm.a, Long.toString(l.longValue()));
            if (q.isEmpty()) {
                return c;
            }
            dccx dccxVar = new dccx();
            dccxVar.g(new azvn((azvm) q.get(0)).b());
            dccxVar.i(c);
            return i(dccxVar.f());
        } catch (axxc unused) {
            return dcdc.e();
        }
    }

    @Override // defpackage.axwb
    public final void e(long j, axvz axvzVar) {
        ((ckcn) this.e.a(ckep.e)).a();
        dvjs bZ = dvjt.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvjt dvjtVar = (dvjt) bZ.b;
        dvjtVar.b = 5;
        int i = dvjtVar.a | 1;
        dvjtVar.a = i;
        dvjtVar.a = i | 16;
        dvjtVar.g = j;
        this.j.a(bZ.bK(), new azgn(axvzVar), bvrj.UI_THREAD);
    }

    @Override // defpackage.axwb
    public final dehn<Boolean> f(final azvo azvoVar, final axxd axxdVar) {
        return this.i.c(new Callable(this, azvoVar, axxdVar) { // from class: azgk
            private final azgq a;
            private final azvo b;
            private final axxd c;

            {
                this.a = this;
                this.b = azvoVar;
                this.c = axxdVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azgq azgqVar = this.a;
                azvo azvoVar2 = this.b;
                axxd axxdVar2 = this.c;
                try {
                    boolean j = azgqVar.a.j(azvoVar2);
                    if (j) {
                        azgqVar.d.a().c(azvoVar2);
                        azgqVar.c.a().b(axxdVar2);
                    }
                    return Boolean.valueOf(j);
                } catch (axxc unused) {
                    return false;
                }
            }
        });
    }

    @Override // defpackage.axwb
    public final boolean g() {
        return btlu.i(this.f.j()) == btlt.GOOGLE && this.h.o(bvjk.gJ, this.f.j(), true);
    }

    @Override // defpackage.axwb
    public final void h() {
        dbsk.l(btlu.i(this.f.j()) == btlt.GOOGLE);
        this.h.T(bvjk.gJ, this.f.j(), !g());
        this.g.b(new azra());
    }
}
