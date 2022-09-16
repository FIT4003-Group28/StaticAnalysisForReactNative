package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axib  reason: default package */
/* loaded from: classes3.dex */
public final class axib implements axhs, axif {
    public static final dcqe a = dcqe.c("axib");
    public static final dcep<dfqe> b = dcnm.a(dfqe.REQUESTED, dfqe.NOT_FOLLOWING);
    public static final dcep<dfqe> c = dcnm.a(dfqe.FOLLOWING_PRIVATELY, dfqe.FOLLOWING_PUBLICLY);
    public final axis d;
    public final akfa e;
    public final ckcw f;
    public final axnx g;
    public final Executor h;
    public final axgj i;
    public final axhj j;
    public final Map<String, axfm> k;
    public final abfa l;
    @dzsi
    public axgi m;
    @dzsi
    public volatile axix n;
    public final WeakHashMap<axnw, Void> o = new WeakHashMap<>();
    public volatile axhi p;
    public final dzgn<axhd> q;
    public final dzgn<axie> r;
    public final Object s;
    @dzsi
    public String t;
    private final axfl u;
    private final crzp<btlu> v;

    public axib(axis axisVar, akfa akfaVar, ckcw ckcwVar, axgj axgjVar, axfl axflVar, axhj axhjVar, axnx axnxVar, abfa abfaVar, Executor executor, Executor executor2) {
        dzgn<axhd> a2 = dzgn.a();
        this.q = a2;
        this.r = dzgn.a();
        this.s = new Object();
        axhx axhxVar = new axhx(this);
        this.v = axhxVar;
        this.d = axisVar;
        this.e = akfaVar;
        this.f = ckcwVar;
        this.i = axgjVar;
        this.u = axflVar;
        this.j = axhjVar;
        this.g = axnxVar;
        this.l = abfaVar;
        this.h = executor2;
        this.k = new HashMap();
        String l = l(akfaVar.j());
        this.t = l;
        this.p = axhjVar.a(l, a2);
        String str = this.t;
        if (str != null) {
            this.m = axgjVar.a(str);
            String str2 = this.t;
            axgi axgiVar = this.m;
            dbsk.s(axgiVar);
            this.n = new axix(str2, axgiVar, executor2);
        }
        akfaVar.C().d(axhxVar, executor);
    }

    @dzsi
    public static String l(@dzsi btlu btluVar) {
        if (btluVar == null || btluVar.f != btlt.GOOGLE) {
            return null;
        }
        return btluVar.k();
    }

    @dzsi
    private final dqaw t(String str) {
        crzo<axoj> c2;
        axoj l;
        if (a()) {
            c2 = this.p.c(str);
        } else {
            axix axixVar = this.n;
            dbsk.s(axixVar);
            c2 = axixVar.c(str);
        }
        if (c2 == null || (l = c2.a.l()) == null) {
            return null;
        }
        return l.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String str, boolean z) {
        crzo<axoj> crzoVar;
        if (a()) {
            r(new axgy(str, z));
        } else if (this.n == null || (crzoVar = this.n.c.get(str)) == null) {
        } else {
            axoj l = crzoVar.a.l();
            dbsk.s(l);
            l.a = z;
            crzoVar.a(l);
        }
    }

    private final void v(String str) {
        synchronized (this.s) {
            if (!this.p.m()) {
                bvoo.h(str, new Object[0]);
                btlu j = this.e.j();
                this.q.c(axgw.a);
                this.p = this.j.a(j.f == btlt.GOOGLE ? j.j() : null, this.q.SU());
            }
        }
    }

    @Override // defpackage.axhs
    public final boolean a() {
        return this.l.v();
    }

    @Override // defpackage.axhs
    @dzsi
    public final dbsg<dqar> b() {
        boolean z = true;
        if (a()) {
            axhi axhiVar = this.p;
            axhiVar.l("Cannot get FollowerOnboardingData when FollowStateRepository is in terminal state");
            try {
                if (axhiVar.f == null) {
                    z = false;
                }
                dbsk.l(z);
            } catch (IllegalStateException e) {
                dcqe dcqeVar = axhiVar.a;
                bvoo.f(e);
            }
            dqas dqasVar = axhiVar.f;
            dqar dqarVar = null;
            if (dqasVar != null) {
                if ((dqasVar.a & 2) == 0) {
                    dqasVar = null;
                }
                if (dqasVar != null && (dqarVar = dqasVar.b) == null) {
                    dqarVar = dqar.d;
                }
            }
            return dbsg.j(dqarVar);
        }
        dbsk.l(this.n != null);
        axix axixVar = this.n;
        dbsk.s(axixVar);
        try {
            if (axixVar.d == null) {
                z = false;
            }
            dbsk.l(z);
        } catch (IllegalStateException e2) {
            bvoo.f(e2);
        }
        return axixVar.d;
    }

    @Override // defpackage.axhs
    public final crzo<axoj> c(String str, @dzsi dqaw dqawVar) {
        String str2;
        if (a()) {
            if (dqawVar != null) {
                p(str, dqawVar);
            }
            crzo<axoj> o = o(str);
            if (o == null) {
                if (this.p.a()) {
                    str2 = "Cache is in terminal state";
                } else {
                    axhi axhiVar = this.p;
                    dzvx.c(str, "user");
                    if (axhiVar.b.c(str)) {
                        str2 = "User was marked as ineligible";
                    } else {
                        str2 = this.p.b() ? "Data fetch is disabled" : "Unknown";
                    }
                }
                bvoo.h("Cached follow button state was null because: %s", str2);
                dqav bZ = dqaw.d.bZ();
                dfqe dfqeVar = dfqe.UNDEFINED_STATE;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqaw dqawVar2 = (dqaw) bZ.b;
                dqawVar2.b = dfqeVar.f;
                dqawVar2.a = 1 | dqawVar2.a;
                dqaw.b(dqawVar2);
                o = new crzo<>(new axoj(bZ.bK()));
            }
            return o;
        } else if (this.n == null) {
            ((ckco) this.f.a(ckik.b)).a(ckii.a(3));
            dqav bZ2 = dqaw.d.bZ();
            dfqe dfqeVar2 = dfqe.NOT_FOLLOWING;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqaw dqawVar3 = (dqaw) bZ2.b;
            dqawVar3.b = dfqeVar2.f;
            dqawVar3.a = 1 | dqawVar3.a;
            dqaw.b(dqawVar3);
            return new crzo<>(new axoj(bZ2.bK()));
        } else if (dqawVar != null) {
            return this.n.b(str, dqawVar);
        } else {
            if (this.n.c.containsKey(str)) {
                crzo<axoj> c2 = this.n.c(str);
                dbsk.s(c2);
                return c2;
            }
            ((ckco) this.f.a(ckik.b)).a(ckii.a(1));
            axix axixVar = this.n;
            dbsk.s(axixVar);
            dqav bZ3 = dqaw.d.bZ();
            dfqe dfqeVar3 = dfqe.UNDEFINED_STATE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqaw dqawVar4 = (dqaw) bZ3.b;
            dqawVar4.b = dfqeVar3.f;
            dqawVar4.a = 1 | dqawVar4.a;
            dqaw.b(dqawVar4);
            return axixVar.b(str, bZ3.bK());
        }
    }

    @Override // defpackage.axhs
    public final dehn<dhyy> d(String str, dfqc dfqcVar) {
        dqaw t = t(str);
        u(str, true);
        final axgi axgiVar = this.m;
        dbsk.s(axgiVar);
        axis axisVar = axgiVar.g;
        deig d = deig.d();
        dhyr dhyrVar = (dhyr) dhyu.d.bZ();
        dhys bZ = dhyt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhyt dhytVar = (dhyt) bZ.b;
        str.getClass();
        int i = 1 | dhytVar.a;
        dhytVar.a = i;
        dhytVar.b = str;
        dhytVar.c = dfqcVar.m;
        dhytVar.a = i | 2;
        if (dhyrVar.c) {
            dhyrVar.bF();
            dhyrVar.c = false;
        }
        dhyu dhyuVar = (dhyu) dhyrVar.b;
        dhyt bK = bZ.bK();
        bK.getClass();
        dhyuVar.b = bK;
        dhyuVar.a |= 4;
        dnwb a2 = axisVar.b.a();
        if (dhyrVar.c) {
            dhyrVar.bF();
            dhyrVar.c = false;
        }
        dhyu dhyuVar2 = (dhyu) dhyrVar.b;
        a2.getClass();
        dhyuVar2.c = a2;
        dhyuVar2.a |= 8;
        buac buacVar = ((buno) axisVar.c).c;
        btlu j = axisVar.a.a().j();
        dbsk.s(j);
        buacVar.e = j;
        axisVar.b(((buno) axisVar.c).b(), (dhyu) dhyrVar.bK(), d, axig.a);
        deha.q(d, bvqj.b(new bvqg(axgiVar) { // from class: axfv
            private final axgi a;

            {
                this.a = axgiVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axgi axgiVar2 = this.a;
                dhyy dhyyVar = (dhyy) obj;
                int a3 = dhyx.a(dhyyVar.c);
                if (a3 != 0 && a3 == 2) {
                    ArrayList arrayList = new ArrayList(axgiVar2.c.h().b().c);
                    dqae dqaeVar = dhyyVar.a;
                    if (dqaeVar == null) {
                        dqaeVar = dqae.c;
                    }
                    if (axgi.g(arrayList, dqaeVar)) {
                        axgi.i(axgiVar2.c, arrayList);
                    }
                    dqae dqaeVar2 = dhyyVar.a;
                    if (dqaeVar2 == null) {
                        dqaeVar2 = dqae.c;
                    }
                    dqau dqauVar = dqaeVar2.b;
                    if (dqauVar == null) {
                        dqauVar = dqau.e;
                    }
                    dqaw dqawVar = dqauVar.c;
                    if (dqawVar == null) {
                        dqawVar = dqaw.d;
                    }
                    dfqe b2 = dfqe.b(dqawVar.b);
                    if (b2 == null) {
                        b2 = dfqe.UNDEFINED_STATE;
                    }
                    if (b2 == dfqe.FOLLOWING_PUBLICLY || b2 == dfqe.FOLLOWING_PRIVATELY) {
                        z<axgh> zVar = axgiVar2.d;
                        dqae dqaeVar3 = dhyyVar.a;
                        if (dqaeVar3 == null) {
                            dqaeVar3 = dqae.c;
                        }
                        axgi.e(zVar, dqaeVar3);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(axgiVar2.d.h().b().c);
                    dqae dqaeVar4 = dhyyVar.a;
                    if (dqaeVar4 == null) {
                        dqaeVar4 = dqae.c;
                    }
                    if (!axgi.g(arrayList2, dqaeVar4)) {
                        return;
                    }
                    axgi.i(axgiVar2.d, arrayList2);
                }
            }
        }), axgiVar.h);
        deha.q(d, new axhy(this, str, t), this.h);
        n(d, str);
        return d;
    }

    @Override // defpackage.axhs
    public final dehn<djzu> e(String str) {
        u(str, true);
        dqaw t = t(str);
        final axgi axgiVar = this.m;
        dbsk.s(axgiVar);
        axis axisVar = axgiVar.g;
        deig d = deig.d();
        djzr djzrVar = (djzr) djzs.d.bZ();
        if (djzrVar.c) {
            djzrVar.bF();
            djzrVar.c = false;
        }
        djzs djzsVar = (djzs) djzrVar.b;
        str.getClass();
        djzsVar.a |= 4;
        djzsVar.b = str;
        dnwb a2 = axisVar.b.a();
        if (djzrVar.c) {
            djzrVar.bF();
            djzrVar.c = false;
        }
        djzs djzsVar2 = (djzs) djzrVar.b;
        a2.getClass();
        djzsVar2.c = a2;
        djzsVar2.a |= 8;
        buac buacVar = ((buyr) axisVar.d).c;
        btlu j = axisVar.a.a().j();
        dbsk.s(j);
        buacVar.e = j;
        axisVar.b(((buyr) axisVar.d).b(), (djzs) djzrVar.bK(), d, axih.a);
        deha.q(d, bvqj.b(new bvqg(axgiVar) { // from class: axfw
            private final axgi a;

            {
                this.a = axgiVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axgi axgiVar2 = this.a;
                djzu djzuVar = (djzu) obj;
                ArrayList arrayList = new ArrayList(axgiVar2.c.h().b().c);
                String str2 = djzuVar.a;
                dqaw dqawVar = djzuVar.b;
                if (dqawVar == null) {
                    dqawVar = dqaw.d;
                }
                if (axgi.h(arrayList, str2, dqawVar)) {
                    axgi.i(axgiVar2.c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(axgiVar2.d.h().b().c);
                String str3 = djzuVar.a;
                dqaw dqawVar2 = djzuVar.b;
                if (dqawVar2 == null) {
                    dqawVar2 = dqaw.d;
                }
                if (axgi.h(arrayList2, str3, dqawVar2)) {
                    axgi.i(axgiVar2.d, arrayList2);
                }
            }
        }), axgiVar.h);
        deha.q(d, new axhz(this, str, t), this.h);
        n(d, str);
        return d;
    }

    @Override // defpackage.axhs
    public final dehn<dhkx> f(final String str) {
        dehn<dhkx> dehnVar;
        final axgi axgiVar = this.m;
        dbsk.s(axgiVar);
        z<axgh> zVar = axgiVar.e;
        final dqae dqaeVar = !axgi.b.contains(zVar.h().a()) ? null : (dqae) dcft.m(zVar.h().b().c, new dbsl(str) { // from class: axfx
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                dcqe dcqeVar = axgi.a;
                dqau dqauVar = ((dqae) obj).b;
                if (dqauVar == null) {
                    dqauVar = dqau.e;
                }
                dqkn dqknVar = dqauVar.b;
                if (dqknVar == null) {
                    dqknVar = dqkn.e;
                }
                return str2.equals(dqknVar.d);
            }
        }).f();
        if (dqaeVar == null) {
            bvoo.h("Cannot approve an applicant that does not exist", new Object[0]);
            dehnVar = deha.b(new IllegalStateException("Cannot approve an applicant that does not exist"));
        } else {
            axis axisVar = axgiVar.g;
            deig d = deig.d();
            dhks dhksVar = (dhks) dhkt.c.bZ();
            if (dhksVar.c) {
                dhksVar.bF();
                dhksVar.c = false;
            }
            dhkt dhktVar = (dhkt) dhksVar.b;
            str.getClass();
            dhktVar.a |= 4;
            dhktVar.b = str;
            buac buacVar = ((bujo) axisVar.f).c;
            btlu j = axisVar.a.a().j();
            dbsk.s(j);
            buacVar.e = j;
            axisVar.b(((bujo) axisVar.f).b(), (dhkt) dhksVar.bK(), d, axij.a);
            deha.q(d, bvqj.b(new bvqg(axgiVar, str, dqaeVar) { // from class: axft
                private final axgi a;
                private final String b;
                private final dqae c;

                {
                    this.a = axgiVar;
                    this.b = str;
                    this.c = dqaeVar;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    int a2;
                    int a3;
                    axgi axgiVar2 = this.a;
                    String str2 = this.b;
                    dqae dqaeVar2 = this.c;
                    dhkx dhkxVar = (dhkx) obj;
                    int a4 = dhkw.a(dhkxVar.b);
                    if ((a4 != 0 && a4 == 2) || (((a2 = dhkw.a(dhkxVar.b)) != 0 && a2 == 3) || ((a3 = dhkw.a(dhkxVar.b)) != 0 && a3 == 4))) {
                        axgi.f(axgiVar2.e, str2);
                    }
                    int a5 = dhkw.a(dhkxVar.b);
                    if (a5 != 0 && a5 == 2) {
                        axgi.e(axgiVar2.c, dqaeVar2);
                    }
                }
            }), axgiVar.h);
            dehnVar = d;
        }
        deha.q(dehnVar, bvqj.b(new bvqg(this, str) { // from class: axht
            private final axib a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                int a2;
                int a3;
                int a4;
                axib axibVar = this.a;
                String str2 = this.b;
                dhkx dhkxVar = (dhkx) obj;
                Map<String, axfm> map = axibVar.k;
                btlu j2 = axibVar.e.j();
                dbsk.s(j2);
                axfm axfmVar = map.get(j2.j());
                axfm axfmVar2 = axibVar.k.get(str2);
                if (axfmVar != null && (((a2 = dhkw.a(dhkxVar.b)) != 0 && a2 == 2) || (((a3 = dhkw.a(dhkxVar.b)) != 0 && a3 == 3) || ((a4 = dhkw.a(dhkxVar.b)) != 0 && a4 == 4)))) {
                    axfmVar.f();
                }
                int a5 = dhkw.a(dhkxVar.b);
                if (a5 != 0 && a5 == 2) {
                    if (axfmVar != null) {
                        axfmVar.c();
                    }
                    if (axfmVar2 == null) {
                        return;
                    }
                    axfmVar2.b();
                }
            }
        }), this.h);
        return dehnVar;
    }

    @Override // defpackage.axhs
    public final dehn<djoq> g(final String str) {
        final axgi axgiVar = this.m;
        dbsk.s(axgiVar);
        dehn<djoq> a2 = axgiVar.g.a(str);
        deha.q(a2, bvqj.b(new bvqg(axgiVar, str) { // from class: axfu
            private final axgi a;
            private final String b;

            {
                this.a = axgiVar;
                this.b = str;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axgi axgiVar2 = this.a;
                djoq djoqVar = (djoq) obj;
                axgi.f(axgiVar2.e, this.b);
            }
        }), axgiVar.h);
        deha.q(a2, bvqj.b(new bvqg(this) { // from class: axhu
            private final axib a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axib axibVar = this.a;
                djoq djoqVar = (djoq) obj;
                Map<String, axfm> map = axibVar.k;
                btlu j = axibVar.e.j();
                dbsk.s(j);
                axfm axfmVar = map.get(j.j());
                if (axfmVar != null) {
                    axfmVar.f();
                }
            }
        }), this.h);
        return a2;
    }

    @Override // defpackage.axhs
    public final dehn<djoq> h(final String str) {
        final axgi axgiVar = this.m;
        dbsk.s(axgiVar);
        dehn<djoq> a2 = axgiVar.g.a(str);
        deha.q(a2, bvqj.b(new bvqg(axgiVar, str) { // from class: axfs
            private final axgi a;
            private final String b;

            {
                this.a = axgiVar;
                this.b = str;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axgi axgiVar2 = this.a;
                djoq djoqVar = (djoq) obj;
                axgi.f(axgiVar2.c, this.b);
            }
        }), axgiVar.h);
        deha.q(a2, bvqj.b(new bvqg(this, str) { // from class: axhv
            private final axib a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axib axibVar = this.a;
                String str2 = this.b;
                djoq djoqVar = (djoq) obj;
                Map<String, axfm> map = axibVar.k;
                btlu j = axibVar.e.j();
                dbsk.s(j);
                axfm axfmVar = map.get(j.j());
                if (axfmVar != null) {
                    axfmVar.e();
                }
                axfm axfmVar2 = axibVar.k.get(str2);
                if (axfmVar2 != null) {
                    axfmVar2.d();
                }
            }
        }), this.h);
        return a2;
    }

    @Override // defpackage.axhs
    public final axfm i(String str) {
        axfm axfmVar;
        synchronized (this.s) {
            axfmVar = this.k.get(str);
            if (axfmVar == null) {
                axfl axflVar = this.u;
                axif a2 = axflVar.a.a();
                dbsk.s(a2);
                axjm a3 = axflVar.b.a();
                dbsk.s(a3);
                final axfm axfmVar2 = new axfm(a2, a3, str);
                dzaj dzajVar = axfmVar2.g;
                dzdp dzdpVar = new dzdp(axfmVar2.a.m().ST(axfe.a));
                dzfy.e();
                dzcg dzcgVar = new dzcg(dzdpVar);
                dzfy.d();
                dyzp e = dzcgVar.e(dzaf.a());
                dzbt dzbtVar = new dzbt(new dzax(axfmVar2) { // from class: axff
                    private final axfm a;

                    {
                        this.a = axfmVar2;
                    }

                    @Override // defpackage.dzax
                    public final void a() {
                        axfm axfmVar3 = this.a;
                        axfmVar3.g.SQ();
                        z<axfk> zVar = axfmVar3.e;
                        axfk h = zVar.h();
                        dbsk.s(h);
                        zVar.f(axfk.e(h));
                        z<axfk> zVar2 = axfmVar3.d;
                        axfk h2 = zVar2.h();
                        dbsk.s(h2);
                        zVar2.f(axfk.e(h2));
                        axfmVar3.f.f(new axew(2, dbpy.a));
                    }
                });
                e.f(dzbtVar);
                dzajVar.b(dzbtVar);
                axfmVar2.g.b(axfmVar2.b.b.SV(dzaf.a()).ST(new dzbb(axfmVar2) { // from class: axfg
                    private final axfm a;

                    {
                        this.a = axfmVar2;
                    }

                    @Override // defpackage.dzbb
                    public final boolean a(Object obj) {
                        axjk axjkVar = (axjk) obj;
                        return axjkVar.a.equals(this.a.c) && (axjkVar.b.a & 32) != 0;
                    }
                }).SW(new dzaz(axfmVar2) { // from class: axfh
                    private final axfm a;

                    {
                        this.a = axfmVar2;
                    }

                    @Override // defpackage.dzaz
                    public final void SR(Object obj) {
                        axfm axfmVar3 = this.a;
                        dqah dqahVar = ((axjk) obj).b.f;
                        if (dqahVar == null) {
                            dqahVar = dqah.e;
                        }
                        axfmVar3.a(dqahVar);
                    }
                }));
                this.k.put(str, axfmVar2);
                axfmVar = axfmVar2;
            }
        }
        return axfmVar;
    }

    @Override // defpackage.axhs
    @dzsi
    public final axgi j() {
        axgi axgiVar;
        synchronized (this.s) {
            axgiVar = this.m;
        }
        return axgiVar;
    }

    @Override // defpackage.axif
    public final dyzu<axie> m() {
        return this.r.SU();
    }

    public final <ResponseT> void n(dehn<ResponseT> dehnVar, final String str) {
        deha.q(dehnVar, bvqj.b(new bvqg(this, str) { // from class: axhw
            private final axib a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                axib axibVar = this.a;
                String str2 = this.b;
                for (axnw axnwVar : axibVar.o.keySet()) {
                    for (axnv axnvVar : axnwVar.b) {
                        if (axnw.c(axnvVar.a).equals(str2)) {
                            axnvVar.b = true;
                        }
                    }
                }
            }
        }), this.h);
    }

    @dzsi
    public final crzo<axoj> o(String str) {
        if (!a()) {
            return null;
        }
        v("Trying to get FollowButtonState manager but the state repository is not associated with the currently logged-in user");
        return this.p.c(str);
    }

    public final void p(String str, dqaw dqawVar) {
        if (!a()) {
            return;
        }
        r(new axgx(str, dqawVar));
    }

    public final void q(String str, dqaw dqawVar) {
        if (a()) {
            p(str, dqawVar);
        } else if (this.n == null) {
        } else {
            this.n.b(str, dqawVar);
        }
    }

    public final void r(axhd axhdVar) {
        v("Posting an UpdateEvent when the repository is not associated with currently logged-in user");
        this.q.c(axhdVar);
    }

    @Override // defpackage.axhs
    public final axgi k(String str) {
        synchronized (this.s) {
            axgi axgiVar = this.m;
            if (axgiVar == null || !axgiVar.i.equals(str)) {
                return this.i.a(str);
            }
            return this.m;
        }
    }
}
