package defpackage;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vue  reason: default package */
/* loaded from: classes7.dex */
public final class vue implements amjm {
    private static final dcqe c = dcqe.c("vue");
    @dzsi
    public final vud a;
    public final Executor b;
    private dcdn<dozz, alfg> d;
    private final alfe e;
    private final int f;
    private volatile dcdc<amrc> g = dcdc.e();
    private boolean h;
    private final boolean i;
    @dzsi
    private dbsl<dmpn> j;
    private final aktz k;
    private final akvz l;
    private final akty m;
    private final amrg n;
    private dcdc<akte> o;
    private final List<dozz> p;
    private final akxa q;

    protected vue(List<dozz> list, aktz aktzVar, akvz akvzVar, akty aktyVar, amrg amrgVar, akxa akxaVar, Context context, Executor executor, boolean z, boolean z2, int i, @dzsi vud vudVar) {
        this.p = dcdc.r(dcep.K(list));
        dbsk.s(aktzVar);
        this.k = aktzVar;
        dbsk.s(akvzVar);
        this.l = akvzVar;
        dbsk.s(aktyVar);
        this.m = aktyVar;
        dbsk.s(amrgVar);
        this.n = amrgVar;
        dbsk.s(akxaVar);
        this.q = akxaVar;
        dbsk.s(executor);
        this.b = executor;
        this.h = z;
        this.j = null;
        this.i = z2;
        this.f = i;
        this.a = vudVar;
        this.e = new alfe(context, akvzVar, z2, null, null, null);
        this.o = dcdc.e();
        this.d = dcmn.a;
    }

    public static vue a(List<dozz> list, akox akoxVar, Context context, Executor executor, int i, @dzsi vud vudVar) {
        return new vue(list == null ? dcdc.e() : list, akoxVar.aj().aB(), akoxVar.aj().aE(), akoxVar.aj().aC(), akoxVar.aj().ak(), new akxa(akoxVar.aj().aF()), context, executor, akoxVar.r.b(), akoxVar.z(), i, vudVar);
    }

    private final dcdc<amrc> f() {
        alfg alfgVar;
        dozs dozsVar;
        dozs dozsVar2;
        aktc d;
        dozs dozsVar3;
        j();
        dccx F = dcdc.F();
        for (dozz dozzVar : this.p) {
            if (m(dozzVar) && (alfgVar = this.d.get(dozzVar)) != null) {
                if (dozzVar.b == 22) {
                    dozsVar = (dozs) dozzVar.c;
                } else {
                    dozsVar = dozs.q;
                }
                dozr dozrVar = dozsVar.l;
                if (dozrVar == null) {
                    dozrVar = dozr.e;
                }
                albp a = albp.a(dozrVar, this.l);
                if (!a.b) {
                    d = null;
                } else {
                    String o = alca.o(dozzVar, this.i);
                    if (dozzVar.b == 22) {
                        dozsVar2 = (dozs) dozzVar.c;
                    } else {
                        dozsVar2 = dozs.q;
                    }
                    dgas dgasVar = dozsVar2.d;
                    if (dgasVar == null) {
                        dgasVar = dgas.e;
                    }
                    int i = dgasVar.b;
                    alfe alfeVar = this.e;
                    if (true != a.c) {
                        i = 0;
                    }
                    d = this.m.d(alfeVar.b(i, this.h, o), dmti.WORLD_ENCODING_LAT_LNG_E7);
                    d.Pt(new vua(this, dozzVar, d));
                }
                alge algeVar = new alge(true, alfgVar, dcdc.e(), new alfx(new Rect(), dcdc.e()), dbpy.a);
                if (dozzVar.b == 22) {
                    dozsVar3 = (dozs) dozzVar.c;
                } else {
                    dozsVar3 = dozs.q;
                }
                dozr dozrVar2 = dozsVar3.l;
                if (dozrVar2 == null) {
                    dozrVar2 = dozr.e;
                }
                int a2 = alfe.a(dozzVar, albp.a(dozrVar2, this.l).c, false);
                if (d != null) {
                    amrb g = amrc.g();
                    g.b(d);
                    g.c(algeVar);
                    g.f(amsb.JAMCIDENTS);
                    g.d(a2);
                    g.e(alfq.c);
                    F.g(g.g());
                }
            }
        }
        return F.f();
    }

    private final void j() {
        dcdc<amrc> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            amrc amrcVar = dcdcVar.get(i);
            this.n.a(amrcVar.a());
            this.m.e(amrcVar.a());
        }
        this.g = dcdc.e();
    }

    private final void l() {
        dcdc<amrc> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.n.c(dcdcVar.get(i));
        }
    }

    private final boolean m(dozz dozzVar) {
        dozs dozsVar;
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        dozr dozrVar = dozsVar.l;
        if (dozrVar == null) {
            dozrVar = dozr.e;
        }
        return albp.a(dozrVar, this.l).b;
    }

    public final void b(boolean z) {
        if (z != this.h) {
            this.h = z;
            this.g = f();
            l();
        }
    }

    public final void c() {
        dozs dozsVar;
        dozs dozsVar2;
        doud doudVar;
        List<dozz> list = this.p;
        dccx F = dcdc.F();
        for (dozz dozzVar : list) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            if ((dozsVar.a & 512) != 0) {
                if (dozzVar.b == 22) {
                    dozsVar2 = (dozs) dozzVar.c;
                } else {
                    dozsVar2 = dozs.q;
                }
                dozr dozrVar = dozsVar2.l;
                if (dozrVar == null) {
                    dozrVar = dozr.e;
                }
                if (dozrVar.b == 1) {
                    doudVar = (doud) dozrVar.c;
                } else {
                    doudVar = doud.c;
                }
                akrk g = akrk.g(doudVar);
                try {
                    akxa akxaVar = this.q;
                    akvz akvzVar = this.l;
                    akuh akuhVar = albp.a(dozrVar, akvzVar).a;
                    int i = albp.a(dozrVar, akvzVar).d;
                    akte c2 = akxaVar.c(g.q(), akuhVar, 0, 0, i, i, 1);
                    c2.Pt(new vuc(this, dozzVar));
                    F.g(c2);
                } catch (IllegalArgumentException unused) {
                    bvoo.h("Invalid vertex encoding. Should not happen considering we hardcode a lat/lng e7 encoding.", new Object[0]);
                }
            }
        }
        this.o = F.f();
    }

    public final void d() {
        for (akte akteVar : dchl.l(this.o)) {
            this.k.f(akteVar);
        }
    }

    public final void e() {
        this.d = dcmn.a;
        j();
        this.e.h();
        dcdc<akte> dcdcVar = this.o;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            akte akteVar = dcdcVar.get(i);
            this.k.h(akteVar);
            this.k.a(akteVar);
        }
        this.o = dcdc.e();
    }

    @Override // defpackage.amjm
    public final void g(amjl amjlVar) {
    }

    @Override // defpackage.amjm
    public final void h(amii amiiVar) {
        dozs dozsVar;
        doud doudVar;
        List<dozz> list = this.p;
        int i = this.f;
        dcdg p = dcdn.p();
        if (i == -1) {
            i = list.size();
        }
        int i2 = 0;
        for (dozz dozzVar : list) {
            if (i2 == i) {
                break;
            }
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            dozr dozrVar = dozsVar.l;
            if (dozrVar == null) {
                dozrVar = dozr.e;
            }
            if (dozrVar.b == 1) {
                doudVar = (doud) dozrVar.c;
            } else {
                doudVar = doud.c;
            }
            akrk g = akrk.g(doudVar);
            if (m(dozzVar)) {
                p.f(dozzVar, new alfg(g));
                i2++;
            }
        }
        this.d = p.b();
        dcen N = dcep.N();
        dcpd<dozz> it = this.d.keySet().iterator();
        while (it.hasNext()) {
            N.i(alca.k(it.next()));
        }
        dbsl<dmpn> a = alfg.a(N.f());
        this.j = a;
        this.m.i(a);
        this.g = f();
        l();
    }

    @Override // defpackage.amjm
    public final void i(amii amiiVar) {
        this.d = dcmn.a;
        j();
        dbsl<dmpn> dbslVar = this.j;
        if (dbslVar != null) {
            this.m.j(dbslVar);
        }
        this.j = null;
    }

    @Override // defpackage.amjm
    public final boolean k() {
        return true;
    }
}
