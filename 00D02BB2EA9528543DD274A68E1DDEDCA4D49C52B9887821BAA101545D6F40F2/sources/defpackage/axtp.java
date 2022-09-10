package defpackage;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: axtp  reason: default package */
/* loaded from: classes3.dex */
public final class axtp extends itb implements axwy {
    private static final long A = TimeUnit.HOURS.toMillis(1);
    private static final long B = TimeUnit.SECONDS.toMillis(10);
    public static final dvvi a;
    private final ania C;
    private final dxio<akfc> D;
    private final dxio<begg> E;
    private final dxio<aaap> F;
    private final dxio<glj> G;
    private final ayxb H;
    private final dxio<auhi> I;
    private final bvjj J;
    private final dxio<btxc> K;
    private final dxio<axws> L;
    private final Executor M;
    private final btvo N;
    private final bath O;
    private final batg P;
    private final batd Q;
    private final sic R;
    private final aymk S;
    public final gga b;
    public final axwq c;
    public final axxb d;
    public final bwqv e;
    public final btrm f;
    public final cqat g;
    public final bvrb h;
    public final cjqy i;
    public final cjqq j;
    public final bzpr k;
    public final dxio<akfa> o;
    public final dxio<bxtx> p;
    public final dxio<axwi> q;
    public final dxio<axwo> r;
    public final azrt s;
    public final baju t;
    public final acyp u;
    public final axwg v;
    public final buyv z;
    private boolean T = false;
    public long w = 0;
    public final Object x = new Object();
    public axtk y = null;
    private final axta U = new axta(this);
    private final crzp<btvo> V = new axsl(this);

    static {
        dvvh bZ = dvvi.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvi dvviVar = (dvvi) bZ.b;
        dvviVar.b = 3;
        dvviVar.a |= 1;
        a = bZ.bK();
    }

    public axtp(gga ggaVar, axwq axwqVar, axxb axxbVar, bwqv bwqvVar, btrm btrmVar, cqat cqatVar, ania aniaVar, bvrb bvrbVar, cjqy cjqyVar, cjqq cjqqVar, bzpr bzprVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, buyv buyvVar, dxio dxioVar5, ayxb ayxbVar, dxio dxioVar6, bvjj bvjjVar, dxio dxioVar7, dxio dxioVar8, dxio dxioVar9, dxio dxioVar10, dxio dxioVar11, Executor executor, btvo btvoVar, bath bathVar, batg batgVar, batd batdVar, azrt azrtVar, baju bajuVar, sic sicVar, acyp acypVar, axwg axwgVar, aymk aymkVar) {
        this.b = ggaVar;
        this.c = axwqVar;
        this.d = axxbVar;
        this.e = bwqvVar;
        this.f = btrmVar;
        this.g = cqatVar;
        this.C = aniaVar;
        this.h = bvrbVar;
        this.i = cjqyVar;
        this.j = cjqqVar;
        this.k = bzprVar;
        this.o = dxioVar;
        this.D = dxioVar2;
        this.E = dxioVar3;
        this.F = dxioVar4;
        this.z = buyvVar;
        this.G = dxioVar5;
        this.H = ayxbVar;
        this.I = dxioVar6;
        this.J = bvjjVar;
        this.K = dxioVar7;
        this.p = dxioVar8;
        this.L = dxioVar9;
        this.q = dxioVar10;
        this.r = dxioVar11;
        this.M = executor;
        this.N = btvoVar;
        this.O = bathVar;
        this.P = batgVar;
        this.Q = batdVar;
        this.s = azrtVar;
        this.t = bajuVar;
        this.R = sicVar;
        this.u = acypVar;
        this.v = axwgVar;
        this.S = aymkVar;
    }

    public static akqi T(alap alapVar) {
        akqi akqiVar = alapVar.g;
        return akqiVar == null ? akqi.a : akqiVar;
    }

    public static ilo W(alap alapVar) {
        alxk alxkVar = alapVar.c;
        String str = alxkVar != null ? alxkVar.a : "";
        ily ilyVar = new ily();
        ilyVar.i(alapVar);
        ilyVar.f = false;
        ilyVar.u = str;
        ilyVar.D();
        ilyVar.C(alapVar.j);
        ilyVar.j = true;
        return ilyVar.d();
    }

    private final void ad(boolean z) {
        boolean z2 = true;
        aker i = akeu.i(new axth(z, z && this.u.f()));
        if (z) {
            i.c(dktk.SAVED_LISTS);
        }
        aken a2 = i.a();
        a2.f(af());
        a2.g(ag());
        a2.d(af());
        a2.e(ag());
        a2.c(R.string.YOUR_PLACES_INCOGNITO_PROMO_DESCRIPTION);
        if (!z || !this.u.f()) {
            z2 = false;
        }
        i.d(z2);
        this.D.a().b(i.b());
    }

    private final void ae(int i, boolean z) {
        aker i2 = akeu.i(new axto(i, z));
        if (z) {
            i2.c(dktk.SAVED_LISTS);
        }
        aken a2 = i2.a();
        a2.f(af());
        a2.g(ag());
        a2.d(af());
        a2.e(ag());
        a2.c(R.string.YOUR_PLACES_INCOGNITO_PROMO_DESCRIPTION);
        this.D.a().b(i2.b());
    }

    private final int af() {
        dkls dklsVar = this.u.e().b;
        if (dklsVar == null) {
            dklsVar = dkls.b;
        }
        int a2 = dklr.a(dklsVar.a);
        return (a2 != 0 && a2 == 3) ? R.string.PLACES_TAB_BUTTON : R.string.SAVED_TAB_BUTTON;
    }

    private final int ag() {
        dkls dklsVar = this.u.e().b;
        if (dklsVar == null) {
            dklsVar = dkls.b;
        }
        int a2 = dklr.a(dklsVar.a);
        return (a2 != 0 && a2 == 3) ? R.string.PLACES_PAGE_TITLE_CONTENT_DESCRIPTION : R.string.SAVED_PAGE_TITLE_CONTENT_DESCRIPTION;
    }

    private final dehn<String> ah() {
        axtk axtkVar;
        deig<String> deigVar;
        synchronized (this.x) {
            axtk axtkVar2 = new axtk(this);
            synchronized (axtkVar2.d.x) {
                axtkVar = axtkVar2.d.y;
            }
            if (axtkVar != null) {
                synchronized (axtkVar.a) {
                    if (!axtkVar.c) {
                        axtkVar.b.a();
                        axtkVar.c = true;
                    }
                }
            }
            this.y = axtkVar2;
            deigVar = axtkVar2.a;
        }
        return deigVar;
    }

    private static final int ai(int i) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        dvvl dvvlVar = dvvl.UNKNOWN;
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 2 : 1;
        }
        return 0;
    }

    @Override // defpackage.axwy
    public final void B(axxe axxeVar) {
        Z(axxeVar);
    }

    @Override // defpackage.axwy
    public final dehn<String> C(boolean z) {
        synchronized (this.x) {
            if (this.y == null) {
                return ah();
            }
            long j = z ? B : A;
            long b = this.g.b() - this.w;
            if (b >= 0 && b <= j) {
                return this.y.a;
            }
            return ah();
        }
    }

    public final void D(final baaq baaqVar) {
        int a2 = dvvg.a(baaqVar.a.b);
        if ((a2 != 0 && a2 == 2) || this.L.a().b().b()) {
            this.z.b(baaqVar.a, new axsp(this, baaqVar), this.M);
        } else {
            this.M.execute(new Runnable(this, baaqVar) { // from class: axsg
                private final axtp a;
                private final baaq b;

                {
                    this.a = this;
                    this.b = baaqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    axtp axtpVar = this.a;
                    this.b.o(bttq.NO_CONNECTIVITY);
                    axtpVar.b.D(new azqt());
                }
            });
        }
    }

    @Override // defpackage.axwy
    public final void E(String str) {
        this.r.a().f(str);
    }

    @Override // defpackage.axwy
    public final void F(axwf axwfVar) {
        this.r.a().g(axwfVar);
    }

    @Override // defpackage.axwy
    public final void G() {
        this.r.a().k(baab.STARRED_PLACES);
    }

    @Override // defpackage.axwy
    public final void H() {
        this.r.a().k(baab.WANT_TO_GO);
    }

    @Override // defpackage.axwy
    public final void I(dndr dndrVar, axwu axwuVar, @dzsi axvp axvpVar, boolean z, String str, @dzsi String str2, @dzsi akqq akqqVar, @dzsi ddho ddhoVar, @dzsi String str3) {
        if (!w()) {
            return;
        }
        dbsk.s(str);
        dbsk.a(dndr.HOME.equals(dndrVar) || dndr.WORK.equals(dndrVar));
        axtr axtrVar = new axtr(this.b, this.c, this.f, axwuVar, dndrVar, str, str2, akqqVar, null, axvpVar, z, azvb.UPDATE);
        axwuVar.F(true);
        D(baaq.b(dndrVar, str, str2, this.c.b(), ddhoVar, str3, axtrVar));
    }

    public final ggg J(azrv azrvVar) {
        batd batdVar = this.Q;
        dvko a2 = batdVar.a.a().a(azrvVar.a());
        bxlu bxluVar = null;
        if ((a2.a & 2048) != 0 && a2.j) {
            int a3 = dvkn.a(this.O.a(azrvVar.a()).b);
            if (a3 == 0) {
                a3 = 1;
            }
            int i = 3;
            if (azrvVar.d() || (a3 == 2 && azrvVar.c())) {
                i = 2;
            }
            bxluVar = new bxlu(i);
        }
        anee m = azrvVar.m();
        if (bxluVar == null) {
            if (m == null) {
                return azsu.aR(azrvVar, this.b, this.e);
            }
            return azsd.i(azrvVar.a(), m, azrvVar.e(), azrvVar.f(), azrvVar.p(this.e), azrvVar.h(), true, this.e);
        }
        azsg a4 = azrt.a(azrvVar, this.e);
        anee m2 = azrvVar.m();
        if (m2 == null) {
            m2 = this.s.b(this.u, azrvVar);
        }
        azrw azrwVar = new azrw(azrvVar, a4, m2);
        azrs azrsVar = new azrs();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ParentFragment_factory", azrwVar);
        bundle.putSerializable("ParentFragment_parameters", bxluVar);
        azrsVar.B(bundle);
        return azrsVar;
    }

    public final void K(axww axwwVar, boolean z) {
        anee l = axwwVar.l();
        dvko dvkoVar = this.N.getPersonalPlacesParameters().b;
        if (dvkoVar == null) {
            dvkoVar = dvko.n;
        }
        boolean z2 = dvkoVar.l;
        azru q = azrv.q();
        q.c(axwwVar.a());
        q.f(axwwVar.b());
        q.g(axwwVar.c());
        boolean z3 = false;
        q.d(false);
        azro azroVar = (azro) q;
        azroVar.a = axwwVar.d();
        azroVar.b = axwwVar.e();
        q.i(axwwVar.f());
        q.j(z ? !z2 : axwwVar.g());
        q.e(false);
        q.k(axwwVar.k());
        azroVar.c = axwwVar.j();
        q.n(z ? new axsy(axwwVar.i()) : axwwVar.i(), this.e);
        azroVar.d = axwwVar.l();
        if (l != null && l.v()) {
            z3 = true;
        }
        q.l(z3);
        azrv a2 = q.a();
        if (!axwwVar.h() && !this.C.a()) {
            this.k.a(new axsz(this, a2, axwwVar.m())).a("geo_personal_place_label_or_contact");
            return;
        }
        this.b.D(J(a2));
        X(axwwVar.m());
    }

    @Override // defpackage.axwy
    public final void L(final axww axwwVar) {
        batd batdVar = this.Q;
        dndr a2 = axwwVar.a();
        if (a2 == dndr.HOME || a2 == dndr.WORK) {
            dvkk dvkkVar = batdVar.a.a().a.a().getPersonalPlacesParameters().d;
            if (dvkkVar == null) {
                dvkkVar = dvkk.b;
            }
            int a3 = dvkj.a(dvkkVar.a);
            if (a3 != 0 && a3 == 4 && batdVar.b.a().a()) {
                if (axwwVar.a() == dndr.HOME) {
                    K(axwwVar, true);
                    return;
                } else if (axwwVar.a() == dndr.WORK) {
                    this.R.c(new sib(this, axwwVar) { // from class: axsh
                        private final axtp a;
                        private final axww b;

                        {
                            this.a = this;
                            this.b = axwwVar;
                        }

                        @Override // defpackage.sib
                        public final void a(qjn qjnVar) {
                            this.a.K(this.b, qjnVar.a() != null);
                        }
                    });
                    return;
                }
            }
        }
        K(axwwVar, false);
    }

    @Override // defpackage.axwy
    public final void M(axww axwwVar) {
        K(axwwVar, true);
    }

    @Override // defpackage.axwy
    public final void N(axww axwwVar) {
        dbsk.s(axwwVar.i());
        K(axwwVar, false);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.c.v();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (!this.T) {
            this.c.z(2);
        } else {
            this.T = false;
        }
        this.G.a().e(this.H);
        this.K.a().a().d(this.V, dege.a);
        btrm btrmVar = this.f;
        axta axtaVar = this.U;
        dceq a2 = dcet.a();
        a2.b(alho.class, new axtq(alho.class, axtaVar, bvrj.UI_THREAD));
        btrmVar.g(axtaVar, a2.a());
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.c.w();
        super.Nu();
    }

    @Override // defpackage.axwy
    public final void O(dndr dndrVar, akqq akqqVar, @dzsi String str, @dzsi ddho ddhoVar, @dzsi String str2, @dzsi dpyv dpyvVar) {
        dbsk.a(dndrVar == dndr.HOME || dndrVar == dndr.WORK);
        String string = this.b.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_CARD_TEXT);
        String string2 = this.b.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_SUBTITLE);
        if (dndrVar == dndr.HOME) {
            string = this.b.getString(R.string.SET_HOME_TITLE);
        }
        aneb z = anee.z();
        z.r(string);
        z.q(string2);
        andx andxVar = (andx) z;
        andxVar.b = this.b.getString(R.string.SAVE);
        andxVar.c = akqqVar;
        andxVar.f = str;
        z.g(dtxo.e);
        z.c(dtxl.z);
        z.e(dtxl.B);
        z.p(this.O.a(dndrVar).h);
        if (this.O.a(dndrVar).i) {
            z.o(true);
            andxVar.d = this.P.a(dndrVar, batf.DROPPED_PIN_CALLOUT);
        }
        if (this.O.a(dndrVar).g) {
            z.f(true);
            andxVar.e = this.P.a(dndrVar, batf.NO_MOVE_SAVE_WARNING);
        }
        anee a2 = z.a();
        dbsk.a(dndrVar == dndr.HOME || dndrVar == dndr.WORK);
        azru q = azrv.q();
        q.c(dndrVar);
        q.f("");
        q.g(false);
        q.d(true);
        azro azroVar = (azro) q;
        azroVar.a = ddhoVar;
        azroVar.b = str2;
        q.i(false);
        q.j(true);
        q.e(false);
        q.k(false);
        azroVar.c = null;
        q.n(null, this.e);
        azroVar.d = a2;
        q.l(a2.v());
        azrv a3 = q.a();
        if (!this.C.a()) {
            this.k.a(new axsz(this, a3, dpyvVar)).a("geo_personal_place_label_or_contact");
            return;
        }
        this.b.D(azsd.i(dndrVar, a2, ddhoVar, str2, null, true, true, this.e));
        X(dpyvVar);
    }

    @Override // defpackage.axwy
    public final void P(dndr dndrVar, long j, @dzsi akqq akqqVar, dvvi dvviVar, axwu axwuVar) {
        akqq akqqVar2;
        dpum dpumVar;
        dvve dvveVar = dvviVar.d;
        if (dvveVar == null) {
            dvveVar = dvve.e;
        }
        boolean z = true;
        if (dvveVar.b == 3 && akqqVar != null) {
            z = false;
        }
        dbsk.b(z, "Only provide lat-lng in the arguments if not present in the undoRequest.");
        gga ggaVar = this.b;
        axwq axwqVar = this.c;
        btrm btrmVar = this.f;
        dvve dvveVar2 = dvviVar.d;
        if (dvveVar2 == null) {
            dvveVar2 = dvve.e;
        }
        String f = dbsj.f(dvveVar2.d);
        dvve dvveVar3 = dvviVar.d;
        if (dvveVar3 == null) {
            dvveVar3 = dvve.e;
        }
        String f2 = dbsj.f(dvveVar3.b == 2 ? (String) dvveVar3.c : "");
        dvve dvveVar4 = dvviVar.d;
        if (dvveVar4 == null) {
            dvveVar4 = dvve.e;
        }
        if (dvveVar4.b == 3) {
            dvve dvveVar5 = dvviVar.d;
            if (dvveVar5 == null) {
                dvveVar5 = dvve.e;
            }
            if (dvveVar5.b == 3) {
                dpumVar = (dpum) dvveVar5.c;
            } else {
                dpumVar = dpum.d;
            }
            akqqVar2 = akqq.f(dpumVar);
        } else {
            akqqVar2 = akqqVar;
        }
        axtm axtmVar = new axtm(this, dndrVar, new axtn(this, dvviVar, axwuVar, new axtr(ggaVar, axwqVar, btrmVar, axwuVar, dndrVar, f, f2, akqqVar2, null, null, false, azvb.UPDATE)));
        Q(dndrVar, axwuVar, axtmVar, false, j);
        new Handler().postDelayed(new axtl(axtmVar), 1000L);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.c.u();
        this.K.a().a().c(this.V);
        this.f.a(this.U);
        this.G.a().j(this.H);
        super.Po();
    }

    @Override // defpackage.axwy
    public final void Q(dndr dndrVar, axwu axwuVar, @dzsi axvp axvpVar, boolean z, long j) {
        if (!w()) {
            return;
        }
        axtr axtrVar = new axtr(this.b, this.c, this.f, axwuVar, dndrVar, null, null, null, null, axvpVar, z, azvb.DELETE);
        axwuVar.F(true);
        D(baaq.c(dndrVar, Long.valueOf(j), this.c.b(), axtrVar));
    }

    public final void R(boolean z, bwrs<ilo> bwrsVar) {
        this.h.b(new axss(this, bwrsVar, z), bvrj.BACKGROUND_THREADPOOL);
    }

    public final void S(bwrs<ilo> bwrsVar) {
        this.f.b(azrg.c(2, bwrsVar));
    }

    @Override // defpackage.axwy
    public final boolean U(alap alapVar) {
        dpuk dpukVar;
        dmol dmolVar = (dmol) bvrt.f(alapVar.a, (dssr) dmol.n.cu(7), dmol.n);
        if (dmolVar == null) {
            return false;
        }
        String str = dmolVar.g;
        if (str.isEmpty()) {
            return false;
        }
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        dvvl dvvlVar = dvvl.UNKNOWN;
        int a2 = dmok.a(dmolVar.h);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 - 1 == 1) {
            dpukVar = dpuk.MAJOR_EVENT;
        } else {
            dpukVar = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        aaan g = aaao.g();
        aaaj aaajVar = (aaaj) g;
        aaajVar.a = str;
        aaajVar.b = dpukVar;
        g.c(false);
        g.b(true);
        baad p = this.q.a().p();
        if (p != null && p.h(azxb.g(str, dpukVar))) {
            if (this.r.a().n(W(alapVar)).booleanValue()) {
                return true;
            }
            gcg a3 = this.S.a.a();
            aymk.b(a3, 2);
            aaajVar.c = new aymj(p, a3);
        }
        this.F.a().i(g.a());
        return true;
    }

    public final void V(alap alapVar, String str, drcs drcsVar, int i) {
        begj begjVar = new begj();
        begjVar.b(W(alapVar));
        begjVar.a = begi.BASE_MAP_POI;
        begjVar.n = true;
        begjVar.c = jjn.COLLAPSED;
        begjVar.f = this.S.a(str, drcsVar, i);
        begjVar.c(false);
        this.E.a().o(begjVar, false, null);
    }

    public final void X(@dzsi dpyv dpyvVar) {
        if (dpyvVar != null) {
            avac.bp(this.b, Integer.valueOf(dpyv.SET_ALIAS.dm), this.J, this.h, this.I.a());
        }
    }

    @Override // defpackage.axwy
    public final void Y(azwm<?> azwmVar, nvl nvlVar) {
        azko azkoVar = new azko();
        Bundle bundle = new Bundle();
        bundle.putSerializable("myplaces_item", azwmVar);
        azkoVar.B(bundle);
        azkoVar.d = nvlVar;
        gei.a(this.b, azkoVar);
    }

    public final void Z(axxe axxeVar) {
        bakk bakkVar = new bakk();
        Bundle bundle = new Bundle();
        bundle.putString("arg_trip_id", axxeVar.a().b);
        bundle.putString("arg_trip_name", axxeVar.a().c);
        bakkVar.B(bundle);
        if (this.b.z(bakk.class) != null) {
            this.b.E(bakkVar);
        } else {
            this.b.D(bakkVar);
        }
    }

    @Override // defpackage.axwy
    public final void aa(dndr dndrVar, Long l, @dzsi decq decqVar, String str, @dzsi String str2, @dzsi akqq akqqVar, axwu axwuVar, @dzsi axvp axvpVar, @dzsi ddho ddhoVar) {
        axtr axtrVar = new axtr(this.b, this.c, this.f, axwuVar, dndrVar, str, str2, akqqVar, null, axvpVar, true, azvb.EDIT);
        String b = this.c.b();
        baaq.e(dndrVar, axtrVar);
        if (dndrVar == dndr.NICKNAME) {
            throw null;
        }
        dvvb bZ = dvvc.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvc dvvcVar = (dvvc) bZ.b;
        dvvcVar.b = dndrVar.h;
        dvvcVar.a |= 1;
        long longValue = l.longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvc dvvcVar2 = (dvvc) bZ.b;
        dvvcVar2.a |= 2;
        dvvcVar2.c = longValue;
        dvvc bK = bZ.bK();
        dvvh bZ2 = dvvi.k.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvvi dvviVar = (dvvi) bZ2.b;
        dvviVar.b = 2;
        int i = dvviVar.a | 1;
        dvviVar.a = i;
        bK.getClass();
        dvviVar.c = bK;
        int i2 = i | 2;
        dvviVar.a = i2;
        if (decqVar != null) {
            int i3 = decqVar.b;
            i2 |= 64;
            dvviVar.a = i2;
            dvviVar.h = i3;
        }
        int i4 = ((dtxi) ddhoVar).a;
        dvviVar.a = i2 | 512;
        dvviVar.j = i4;
        D(baaq.d(bZ2, b, axtrVar));
    }

    @Override // defpackage.axwy
    public final void ab(dndr dndrVar, long j, dvvi dvviVar) {
        fd K = this.b.K();
        dbsk.s(K);
        dbsk.g(K instanceof axwu, "Top fragment must implement AliasUpdatingListener: %s", K.getClass().getName());
        P(dndrVar, j, null, dvviVar, (axwu) K);
    }

    @Override // defpackage.axwy
    public final void ac(dndr dndrVar, axwu axwuVar, @dzsi axvp axvpVar, boolean z, @dzsi String str, @dzsi String str2, @dzsi ddho ddhoVar, @dzsi String str3, ilo iloVar, @dzsi String str4) {
        String B2;
        if (!w()) {
            return;
        }
        dbsk.s(iloVar);
        gga ggaVar = this.b;
        axwq axwqVar = this.c;
        btrm btrmVar = this.f;
        if (!dbsj.d(iloVar.B()) || iloVar.aj() == null) {
            B2 = iloVar.B();
        } else {
            B2 = iloVar.aj().b();
        }
        axtr axtrVar = new axtr(ggaVar, axwqVar, btrmVar, axwuVar, dndrVar, B2, iloVar.ai().o(), iloVar.aj(), str4, axvpVar, z, azvb.UPDATE);
        axwuVar.F(true);
        String b = this.c.b();
        baaq.e(dndrVar, axtrVar);
        dbsk.s(iloVar);
        if (dndrVar == dndr.NICKNAME) {
            dbsk.s(str);
        }
        dvvb bZ = dvvc.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvc dvvcVar = (dvvc) bZ.b;
        dvvcVar.b = dndrVar.h;
        dvvcVar.a |= 1;
        if (iloVar.bk() != null && !iloVar.bg()) {
            Long bk = iloVar.bk();
            dbsk.s(bk);
            long longValue = bk.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvvc dvvcVar2 = (dvvc) bZ.b;
            dvvcVar2.a |= 2;
            dvvcVar2.c = longValue;
        }
        dvvd bZ2 = dvve.e.bZ();
        String y = iloVar.y();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvve dvveVar = (dvve) bZ2.b;
        y.getClass();
        dvveVar.a |= 1;
        dvveVar.d = y;
        String o = akqi.d(iloVar.ai()) ? iloVar.ai().o() : null;
        if (o != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvve dvveVar2 = (dvve) bZ2.b;
            o.getClass();
            dvveVar2.b = 2;
            dvveVar2.c = o;
        } else if (iloVar.aj() != null) {
            dpul bZ3 = dpum.d.bZ();
            akqq aj = iloVar.aj();
            dbsk.s(aj);
            double d = aj.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpum dpumVar = (dpum) bZ3.b;
            dpumVar.a |= 1;
            dpumVar.b = d;
            akqq aj2 = iloVar.aj();
            dbsk.s(aj2);
            double d2 = aj2.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpum dpumVar2 = (dpum) bZ3.b;
            dpumVar2.a |= 2;
            dpumVar2.c = d2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvve dvveVar3 = (dvve) bZ2.b;
            dpum bK = bZ3.bK();
            bK.getClass();
            dvveVar3.c = bK;
            dvveVar3.b = 3;
        }
        dvvh bZ4 = dvvi.k.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dvvi dvviVar = (dvvi) bZ4.b;
        dvviVar.b = 0;
        dvviVar.a = 1 | dvviVar.a;
        dvvc bK2 = bZ.bK();
        bK2.getClass();
        dvviVar.c = bK2;
        dvviVar.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dvvi dvviVar2 = (dvvi) bZ4.b;
        dvve bK3 = bZ2.bK();
        bK3.getClass();
        dvviVar2.d = bK3;
        dvviVar2.a |= 4;
        if (str != null) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvvi dvviVar3 = (dvvi) bZ4.b;
            str.getClass();
            dvviVar3.a |= 32;
            dvviVar3.g = str;
        }
        if (str2 != null) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvvi dvviVar4 = (dvvi) bZ4.b;
            str2.getClass();
            dvviVar4.a |= 128;
            dvviVar4.i = str2;
        }
        if (ddhoVar != null) {
            int b2 = ddhoVar.b();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvvi dvviVar5 = (dvvi) bZ4.b;
            dvviVar5.a |= 512;
            dvviVar5.j = b2;
        }
        if (str3 != null) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvvi dvviVar6 = (dvvi) bZ4.b;
            str3.getClass();
            dvviVar6.a |= 16;
            dvviVar6.f = str3;
        }
        D(baaq.d(bZ4, b, axtrVar));
    }

    @Override // defpackage.axwy
    public final void e() {
        this.T = true;
    }

    @Override // defpackage.axwy
    public final void f(bwrs<ilo> bwrsVar) {
        bvrj.UI_THREAD.c();
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if (!c.bM()) {
            S(bwrsVar);
            return;
        }
        btlu j = this.o.a().j();
        boolean z = true;
        if (btlu.i(j).equals(btlt.GOOGLE) && c.bN()) {
            z = false;
        }
        this.D.a().a(akeu.j(new axso(this, j, z, bwrsVar)).b());
    }

    @Override // defpackage.axwy
    public final void i(bwrs<ilo> bwrsVar, boolean z) {
        this.r.a().a(bwrsVar, z);
    }

    @Override // defpackage.axwy
    public final void j(bwrs<ilo> bwrsVar) {
        i(bwrsVar, true);
    }

    @Override // defpackage.axwy
    public final void k(bwrs<ilo> bwrsVar) {
        this.b.C(bhul.i(this.e, bwrsVar), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    }

    @Override // defpackage.axwy
    public final void l(bwrs<ilo> bwrsVar, @dzsi axuc axucVar) {
        if (!w()) {
            return;
        }
        this.b.C(bhul.g(this.e, bwrsVar, bhul.a, false, new axtf(axucVar)), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    }

    @Override // defpackage.axwy
    public final void m() {
        ae(0, false);
    }

    @Override // defpackage.axwy
    public final void n() {
        if (this.v.f()) {
            ad(false);
        } else {
            ae(ai(1), false);
        }
    }

    @Override // defpackage.axwy
    public final void o() {
        if (this.v.f()) {
            aker i = akeu.i(new axtc());
            aken a2 = i.a();
            a2.f(af());
            a2.g(ag());
            a2.d(af());
            a2.e(ag());
            a2.c(R.string.YOUR_PLACES_INCOGNITO_PROMO_DESCRIPTION);
            this.D.a().b(i.b());
            return;
        }
        ae(ai(2), false);
    }

    @Override // defpackage.axwy
    public final void p() {
        fd K = this.b.K();
        if ((K instanceof baup) || (K instanceof babb)) {
            return;
        }
        if (this.v.f()) {
            ad(true);
        } else {
            ae(ai(1), true);
        }
    }

    @Override // defpackage.axwy
    public final void q() {
        if (this.v.f()) {
            aker i = akeu.i(new axsu());
            aken a2 = i.a();
            a2.f(af());
            a2.g(ag());
            a2.d(af());
            a2.e(ag());
            a2.c(R.string.YOUR_PLACES_INCOGNITO_PROMO_DESCRIPTION);
            this.D.a().b(i.b());
        }
    }

    @Override // defpackage.axwy
    public final void r() {
        if (this.v.f()) {
            aker i = akeu.i(new axtg());
            aken a2 = i.a();
            a2.f(af());
            a2.g(ag());
            a2.d(af());
            a2.e(ag());
            a2.c(R.string.YOUR_PLACES_INCOGNITO_PROMO_DESCRIPTION);
            this.D.a().b(i.b());
            return;
        }
        ae(ai(3), false);
    }

    @Override // defpackage.axwy
    public final void s() {
        if (this.v.f()) {
            aker i = akeu.i(new axtd());
            aken a2 = i.a();
            a2.f(af());
            a2.g(ag());
            a2.d(af());
            a2.e(ag());
            a2.c(R.string.YOUR_PLACES_INCOGNITO_PROMO_DESCRIPTION);
            this.D.a().b(i.b());
        }
    }

    @Override // defpackage.axwy
    public final void t(final String str) {
        dcdc<axxe> h = this.c.y().b().h();
        dbsk.s(h);
        dbsg r = dcbg.b(h).r(new dbsl(str) { // from class: axsf
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                dvvi dvviVar = axtp.a;
                return ((axxe) obj).a().b.equals(str2);
            }
        });
        if (r.a()) {
            Z((axxe) r.b());
        } else {
            r();
        }
    }
}
