package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjmi  reason: default package */
/* loaded from: classes3.dex */
public final class bjmi implements bjln {
    private static final dcqe u = dcqe.c("bjmi");
    private final dxio<akfc> A;
    private btlu B;
    public final bvff a;
    public final btrm b;
    public final bwqv c;
    public final Executor d;
    public final Resources e;
    public final gga f;
    public final ges g;
    public final bjgh h;
    public final bjll i;
    public final dxio<afha> j;
    public final dxio<bjgy> k;
    public final dxio<begg> l;
    public final dxio<chhr> m;
    public final chhs n;
    public bjfs o;
    public final ilo p;
    public dbsg<dehn<btzx<djbb, djbf>>> q = dbpy.a;
    public dbsg<dehn<btzx<djaa, djae>>> r = dbpy.a;
    public final bjfz s;
    public final crzo<bjml> t;
    private final bveo v;
    private final bvfk w;
    private final bvfc x;
    private final bjhc y;
    private final dxio<afgy> z;

    public bjmi(btlu btluVar, ilo iloVar, bjga bjgaVar, ges gesVar, gga ggaVar, btrm btrmVar, bwqv bwqvVar, Resources resources, bveo bveoVar, bvfk bvfkVar, bvff bvffVar, bvfc bvfcVar, bjgi bjgiVar, bjhc bjhcVar, bjlm bjlmVar, dxio<akfc> dxioVar, dxio<bjgy> dxioVar2, dxio<afha> dxioVar3, dxio<afgy> dxioVar4, dxio<begg> dxioVar5, dxio<chhr> dxioVar6, chht chhtVar, Executor executor) {
        bjfs bjfsVar = bjgaVar.b;
        this.o = bjfsVar == null ? bjfs.e : bjfsVar;
        bjfz bjfzVar = bjgaVar.c;
        bjfzVar = bjfzVar == null ? bjfz.e : bjfzVar;
        this.s = bjfzVar;
        this.p = iloVar;
        this.B = btluVar;
        this.f = ggaVar;
        this.g = gesVar;
        this.v = bveoVar;
        this.w = bvfkVar;
        this.a = bvffVar;
        this.x = bvfcVar;
        this.b = btrmVar;
        this.c = bwqvVar;
        this.e = resources;
        this.d = executor;
        this.h = bjgiVar.a(bwrs.a(iloVar));
        this.y = bjhcVar;
        caxo a = bjlmVar.a.a();
        bjlm.a(a, 1);
        caxn a2 = bjlmVar.b.a();
        bjlm.a(a2, 2);
        this.i = new bjll(a, a2);
        this.j = dxioVar3;
        this.z = dxioVar4;
        this.A = dxioVar;
        this.k = dxioVar2;
        this.l = dxioVar5;
        this.m = dxioVar6;
        this.n = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.t = new crzo<>(bjml.f(iloVar, this.o, btluVar, bjfzVar, false));
    }

    private final void r(String str, dqjh dqjhVar, Runnable runnable) {
        bvfc bvfcVar = this.x;
        djcf bZ = djcg.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcg djcgVar = (djcg) bZ.b;
        str.getClass();
        djcgVar.a |= 1;
        djcgVar.b = str;
        String o = this.p.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcg djcgVar2 = (djcg) bZ.b;
        o.getClass();
        djcgVar2.a |= 4;
        djcgVar2.d = o;
        String cG = this.p.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcg djcgVar3 = (djcg) bZ.b;
        cG.getClass();
        int i = djcgVar3.a | 8;
        djcgVar3.a = i;
        djcgVar3.e = cG;
        djcgVar3.c = dqjhVar.e;
        djcgVar3.a = i | 2;
        deha.q(bvfcVar.c(bZ.bK()), new bjly(runnable), this.d);
    }

    @Override // defpackage.bjln
    public final void a(final bjfw bjfwVar, dqjh dqjhVar) {
        if (p()) {
            dqjh b = dqjh.b(bjfwVar.f);
            if (b == null) {
                b = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (b == dqjhVar) {
                return;
            }
            dsqp dsqpVar = (dsqp) bjfwVar.cu(5);
            dsqpVar.bC(bjfwVar);
            bjfv bjfvVar = (bjfv) dsqpVar;
            if (bjfvVar.c) {
                bjfvVar.bF();
                bjfvVar.c = false;
            }
            bjfw bjfwVar2 = (bjfw) bjfvVar.b;
            bjfwVar2.f = dqjhVar.e;
            bjfwVar2.a |= 16;
            int max = dqjhVar == dqjh.THUMBS_UP ? bjfwVar.e + 1 : Math.max(bjfwVar.e - 1, 0);
            if (bjfvVar.c) {
                bjfvVar.bF();
                bjfvVar.c = false;
            }
            bjfw bjfwVar3 = (bjfw) bjfvVar.b;
            bjfwVar3.a |= 8;
            bjfwVar3.e = max;
            bjfw bK = bjfvVar.bK();
            bjfs bjfsVar = this.o;
            dsqp dsqpVar2 = (dsqp) bjfsVar.cu(5);
            dsqpVar2.bC(bjfsVar);
            bjfr bjfrVar = (bjfr) dsqpVar2;
            if (bjfrVar.c) {
                bjfrVar.bF();
                bjfrVar.c = false;
            }
            bjfs bjfsVar2 = (bjfs) bjfrVar.b;
            bjfs bjfsVar3 = bjfs.e;
            bK.getClass();
            bjfsVar2.b = bK;
            bjfsVar2.a |= 1;
            this.o = bjfrVar.bK();
            n();
            bjfu bjfuVar = bjfwVar.b;
            if (bjfuVar == null) {
                bjfuVar = bjfu.c;
            }
            r(bjfuVar.b, dqjhVar, new Runnable(this, bjfwVar) { // from class: bjlo
                private final bjmi a;
                private final bjfw b;

                {
                    this.a = this;
                    this.b = bjfwVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bjmi bjmiVar = this.a;
                    bjfw bjfwVar4 = this.b;
                    bjfs bjfsVar4 = bjmiVar.o;
                    dsqp dsqpVar3 = (dsqp) bjfsVar4.cu(5);
                    dsqpVar3.bC(bjfsVar4);
                    bjfr bjfrVar2 = (bjfr) dsqpVar3;
                    if (bjfrVar2.c) {
                        bjfrVar2.bF();
                        bjfrVar2.c = false;
                    }
                    bjfs bjfsVar5 = (bjfs) bjfrVar2.b;
                    bjfs bjfsVar6 = bjfs.e;
                    bjfwVar4.getClass();
                    bjfsVar5.b = bjfwVar4;
                    bjfsVar5.a |= 1;
                    bjmiVar.o = bjfrVar2.bK();
                    bjmiVar.n();
                }
            });
            return;
        }
        m();
    }

    @Override // defpackage.bjln
    public final void b(final bjfo bjfoVar, dqjh dqjhVar) {
        if (p()) {
            dqjh b = dqjh.b(bjfoVar.f);
            if (b == null) {
                b = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (b == dqjhVar) {
                return;
            }
            dbsg<Integer> h = h(bjfoVar);
            if (!h.a()) {
                return;
            }
            dsqp dsqpVar = (dsqp) bjfoVar.cu(5);
            dsqpVar.bC(bjfoVar);
            bjfn bjfnVar = (bjfn) dsqpVar;
            if (bjfnVar.c) {
                bjfnVar.bF();
                bjfnVar.c = false;
            }
            bjfo bjfoVar2 = (bjfo) bjfnVar.b;
            bjfoVar2.f = dqjhVar.e;
            bjfoVar2.a |= 16;
            int max = dqjhVar == dqjh.THUMBS_UP ? bjfoVar.e + 1 : Math.max(bjfoVar.e - 1, 0);
            if (bjfnVar.c) {
                bjfnVar.bF();
                bjfnVar.c = false;
            }
            bjfo bjfoVar3 = (bjfo) bjfnVar.b;
            bjfoVar3.a |= 8;
            bjfoVar3.e = max;
            bjfs bjfsVar = this.o;
            dsqp dsqpVar2 = (dsqp) bjfsVar.cu(5);
            dsqpVar2.bC(bjfsVar);
            bjfr bjfrVar = (bjfr) dsqpVar2;
            bjfrVar.c(h.b().intValue(), bjfnVar.bK());
            this.o = bjfrVar.bK();
            n();
            bjfm bjfmVar = bjfoVar.b;
            if (bjfmVar == null) {
                bjfmVar = bjfm.c;
            }
            r(bjfmVar.b, dqjhVar, new Runnable(this, bjfoVar) { // from class: bjlp
                private final bjmi a;
                private final bjfo b;

                {
                    this.a = this;
                    this.b = bjfoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bjmi bjmiVar = this.a;
                    bjfo bjfoVar4 = this.b;
                    dbsg<Integer> h2 = bjmiVar.h(bjfoVar4);
                    if (!h2.a()) {
                        return;
                    }
                    bjfs bjfsVar2 = bjmiVar.o;
                    dsqp dsqpVar3 = (dsqp) bjfsVar2.cu(5);
                    dsqpVar3.bC(bjfsVar2);
                    bjfr bjfrVar2 = (bjfr) dsqpVar3;
                    bjfrVar2.c(h2.b().intValue(), bjfoVar4);
                    bjmiVar.o = bjfrVar2.bK();
                    bjmiVar.n();
                }
            });
            return;
        }
        m();
    }

    @Override // defpackage.bjln
    public final void c(bjfo bjfoVar, String str) {
        if (this.r.a()) {
            return;
        }
        bvff bvffVar = this.a;
        dizy q = q();
        if (q.c) {
            q.bF();
            q.c = false;
        }
        djaa djaaVar = (djaa) q.b;
        djaa djaaVar2 = djaa.l;
        str.getClass();
        djaaVar.a |= 32;
        djaaVar.g = str;
        dbsg<dehn<btzx<djaa, djae>>> i = dbsg.i(bvffVar.c(q.bK()));
        this.r = i;
        deha.q(i.b(), new bjma(this, bjfoVar, str), this.d);
    }

    @Override // defpackage.bjln
    public final void d(final bjfo bjfoVar) {
        cjkp B = cjkr.B();
        B.t("Delete your answer?");
        B.z(this.e.getString(R.string.DELETE_BUTTON), new View.OnClickListener(this, bjfoVar) { // from class: bjlr
            private final bjmi a;
            private final bjfo b;

            {
                this.a = this;
                this.b = bjfoVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(this.b);
            }
        }, null);
        B.y(this.e.getString(R.string.CANCEL_BUTTON), bjls.a, null);
        B.u(this.f).q().show();
    }

    @Override // defpackage.bjln
    public final void e(bjfq bjfqVar) {
        this.z.a().f(bjfqVar.f);
    }

    @Override // defpackage.bjln
    public final void f() {
        this.f.onBackPressed();
    }

    public final void g() {
        bvrj.UI_THREAD.c();
        if (this.q.a()) {
            this.q.b().cancel(false);
        }
        bveo bveoVar = this.v;
        djba bZ = djbb.d.bZ();
        String o = this.p.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djbb djbbVar = (djbb) bZ.b;
        o.getClass();
        djbbVar.a |= 1;
        djbbVar.b = o;
        dqck bZ2 = dqcm.e.bZ();
        dqce bZ3 = dqcf.f.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcf dqcfVar = (dqcf) bZ3.b;
        dqcfVar.a |= 8;
        dqcfVar.d = true;
        bjfw bjfwVar = this.o.b;
        if (bjfwVar == null) {
            bjfwVar = bjfw.l;
        }
        bjfu bjfuVar = bjfwVar.b;
        if (bjfuVar == null) {
            bjfuVar = bjfu.c;
        }
        String str = bjfuVar.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcf dqcfVar2 = (dqcf) bZ3.b;
        str.getClass();
        dqcfVar2.a = 1 | dqcfVar2.a;
        dqcfVar2.b = str;
        dqcg bZ4 = dqch.a.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqch.b((dqch) bZ4.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcf dqcfVar3 = (dqcf) bZ3.b;
        dqch bK = bZ4.bK();
        bK.getClass();
        dqcfVar3.e = bK;
        dqcfVar3.a |= 16;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcf.b((dqcf) bZ3.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcf.c((dqcf) bZ3.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqcm dqcmVar = (dqcm) bZ2.b;
        dqcf bK2 = bZ3.bK();
        bK2.getClass();
        dqcmVar.c = bK2;
        dqcmVar.b = 3;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqcm.b((dqcm) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqcm.c((dqcm) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djbb djbbVar2 = (djbb) bZ.b;
        dqcm bK3 = bZ2.bK();
        bK3.getClass();
        djbbVar2.c = bK3;
        djbbVar2.a |= 2;
        dbsg<dehn<btzx<djbb, djbf>>> i = dbsg.i(bveoVar.c(bZ.bK()));
        this.q = i;
        deha.q(i.b(), new bjlw(this), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<Integer> h(bjfo bjfoVar) {
        for (bjfo bjfoVar2 : this.o.c) {
            bjfm bjfmVar = bjfoVar.b;
            if (bjfmVar == null) {
                bjfmVar = bjfm.c;
            }
            bjfm bjfmVar2 = bjfoVar2.b;
            if (bjfmVar2 == null) {
                bjfmVar2 = bjfm.c;
            }
            if (bjfmVar.equals(bjfmVar2)) {
                return dbsg.i(0);
            }
        }
        return dbpy.a;
    }

    public final void i(bjfo bjfoVar, boolean z) {
        dcdc z2 = dcbg.b(this.o.c).s(bjlq.a).z();
        bjfm bjfmVar = bjfoVar.b;
        if (bjfmVar == null) {
            bjfmVar = bjfm.c;
        }
        int indexOf = z2.indexOf(bjfmVar);
        if (indexOf == -1) {
            return;
        }
        bjfq bjfqVar = this.o.c.get(indexOf).c;
        if (bjfqVar == null) {
            bjfqVar = bjfq.g;
        }
        if (!bjfqVar.c) {
            bvoo.h("Trying to modify non-author answer", new Object[0]);
        }
        bjfs bjfsVar = this.o;
        dsqp dsqpVar = (dsqp) bjfsVar.cu(5);
        dsqpVar.bC(bjfsVar);
        bjfr bjfrVar = (bjfr) dsqpVar;
        bjfo bjfoVar2 = this.o.c.get(indexOf);
        dsqp dsqpVar2 = (dsqp) bjfoVar2.cu(5);
        dsqpVar2.bC(bjfoVar2);
        bjfn bjfnVar = (bjfn) dsqpVar2;
        if (bjfnVar.c) {
            bjfnVar.bF();
            bjfnVar.c = false;
        }
        bjfo bjfoVar3 = (bjfo) bjfnVar.b;
        bjfoVar3.a |= 256;
        bjfoVar3.j = z;
        bjfrVar.c(indexOf, bjfnVar.bK());
        this.o = bjfrVar.bK();
    }

    public final void j(String str) {
        bvfk bvfkVar = this.w;
        djap bZ = djar.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar = (djar) bZ.b;
        djarVar.b = 2;
        djarVar.a |= 1;
        String o = this.p.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar2 = (djar) bZ.b;
        o.getClass();
        djarVar2.a |= 4;
        djarVar2.d = o;
        String cG = this.p.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar3 = (djar) bZ.b;
        cG.getClass();
        djarVar3.a |= 8;
        djarVar3.e = cG;
        bjfw bjfwVar = this.o.b;
        if (bjfwVar == null) {
            bjfwVar = bjfw.l;
        }
        bjfu bjfuVar = bjfwVar.b;
        if (bjfuVar == null) {
            bjfuVar = bjfu.c;
        }
        String str2 = bjfuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar4 = (djar) bZ.b;
        str2.getClass();
        djarVar4.a = 2 | djarVar4.a;
        djarVar4.c = str2;
        djai djaiVar = this.p.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcu dqcuVar = djaiVar.f;
        if (dqcuVar == null) {
            dqcuVar = dqcu.c;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar5 = (djar) bZ.b;
        dqcuVar.getClass();
        djarVar5.f = dqcuVar;
        int i = djarVar5.a | 16;
        djarVar5.a = i;
        str.getClass();
        djarVar5.a = i | 32;
        djarVar5.h = str;
        deha.q(bvfkVar.c(bZ.bK()), new bjmc(this, str), this.d);
    }

    public final void k(bjfo bjfoVar) {
        bvff bvffVar = this.a;
        dizy bZ = djaa.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar = (djaa) bZ.b;
        djaaVar.b = 2;
        djaaVar.a |= 1;
        String o = this.p.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar2 = (djaa) bZ.b;
        o.getClass();
        djaaVar2.a |= 4;
        djaaVar2.d = o;
        String cG = this.p.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar3 = (djaa) bZ.b;
        cG.getClass();
        djaaVar3.a |= 8;
        djaaVar3.e = cG;
        bjfw bjfwVar = this.o.b;
        if (bjfwVar == null) {
            bjfwVar = bjfw.l;
        }
        bjfu bjfuVar = bjfwVar.b;
        if (bjfuVar == null) {
            bjfuVar = bjfu.c;
        }
        String str = bjfuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar4 = (djaa) bZ.b;
        str.getClass();
        djaaVar4.a = 2 | djaaVar4.a;
        djaaVar4.c = str;
        deha.q(bvffVar.c(bZ.bK()), new bjmf(this, bjfoVar), this.d);
    }

    public final void l(bjfw bjfwVar) {
        bvfk bvfkVar = this.w;
        djap bZ = djar.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar = (djar) bZ.b;
        djarVar.b = 3;
        djarVar.a |= 1;
        String o = this.p.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar2 = (djar) bZ.b;
        o.getClass();
        djarVar2.a |= 4;
        djarVar2.d = o;
        String cG = this.p.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar3 = (djar) bZ.b;
        cG.getClass();
        djarVar3.a |= 8;
        djarVar3.e = cG;
        bjfu bjfuVar = bjfwVar.b;
        if (bjfuVar == null) {
            bjfuVar = bjfu.c;
        }
        String str = bjfuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar4 = (djar) bZ.b;
        str.getClass();
        djarVar4.a |= 2;
        djarVar4.c = str;
        deha.q(bvfkVar.c(bZ.bK()), new bjmh(this, bjfwVar), this.d);
    }

    public final void m() {
        this.A.a().a(akeu.j(new akeo(this) { // from class: bjlv
            private final bjmi a;

            {
                this.a = this;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                this.a.o(btluVar);
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        }).b());
    }

    public final void n() {
        bjfw bjfwVar = this.o.b;
        if (bjfwVar == null) {
            bjfwVar = bjfw.l;
        }
        this.t.b(bjml.f(this.p, this.o, this.B, this.s, !bjfwVar.d.isEmpty()));
    }

    public final void o(btlu btluVar) {
        bvrj.UI_THREAD.c();
        if (this.B.equals(btluVar)) {
            return;
        }
        this.B = btluVar;
        n();
    }

    public final boolean p() {
        return this.B.l();
    }

    public final dizy q() {
        dizy bZ = djaa.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar = (djaa) bZ.b;
        djaaVar.b = 1;
        djaaVar.a = 1 | djaaVar.a;
        bjfw bjfwVar = this.o.b;
        if (bjfwVar == null) {
            bjfwVar = bjfw.l;
        }
        bjfu bjfuVar = bjfwVar.b;
        if (bjfuVar == null) {
            bjfuVar = bjfu.c;
        }
        String str = bjfuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar2 = (djaa) bZ.b;
        str.getClass();
        djaaVar2.a |= 2;
        djaaVar2.c = str;
        String o = this.p.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar3 = (djaa) bZ.b;
        o.getClass();
        djaaVar3.a |= 4;
        djaaVar3.d = o;
        String cG = this.p.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar4 = (djaa) bZ.b;
        cG.getClass();
        djaaVar4.a |= 8;
        djaaVar4.e = cG;
        boolean d = this.y.d(this.p);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar5 = (djaa) bZ.b;
        djaaVar5.a |= 64;
        djaaVar5.h = d;
        djai djaiVar = this.p.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcu dqcuVar = djaiVar.f;
        if (dqcuVar == null) {
            dqcuVar = dqcu.c;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar6 = (djaa) bZ.b;
        dqcuVar.getClass();
        djaaVar6.f = dqcuVar;
        djaaVar6.a |= 16;
        dqcj b = dqcj.b(this.s.c);
        if (b == null) {
            b = dqcj.UNKNOWN_PLACE_QA_ENTRY_POINT;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar7 = (djaa) bZ.b;
        djaaVar7.k = b.e;
        djaaVar7.a |= 2048;
        return bZ;
    }
}
