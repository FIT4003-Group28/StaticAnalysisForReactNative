package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmwc  reason: default package */
/* loaded from: classes3.dex */
public class bmwc implements bmtv, begs, begu, bmoe {
    public static final dcqe a = dcqe.c("bmwc");
    static final dnqh b;
    static final dnqh c;
    @dzsi
    private bmvs A;
    @dzsi
    private bmvt B;
    @dzsi
    private bmvu C;
    @dzsi
    private bmwa D;
    private bwrs<ilo> E;
    private final bmvo H;
    private final dxio<bmvg> J;
    public final bmon d;
    public final dxio<anhg> e;
    public final Activity f;
    public final bvrb g;
    public int i;
    private final cjqy j;
    private final cqat k;
    private final dxio<angp> l;
    private final Context m;
    private final dxio<ckcw> n;
    private final dxio<ania> p;
    private final dxio<apkr> q;
    private final dxio<akfa> r;
    private final btvo s;
    private final btrm t;
    private final btpc u;
    private final cqho v;
    private final bzqc w;
    private final axwi x;
    private final aese y;
    private final EnumSet<ckgn> o = EnumSet.noneOf(ckgn.class);
    private boolean G = false;
    private final bmtt I = new bmvn(this);
    private boolean F = false;
    private final bmtu z = new bmvq(this);
    public dbsg<bmvy> h = dbpy.a;

    static {
        eaow.e(1L);
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.eO.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        b = bZ.bK();
        dnqg bZ2 = dnqh.p.bZ();
        int i2 = ddda.eP.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ2.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i2;
        c = bZ2.bK();
    }

    public bmwc(Application application, Activity activity, cjqy cjqyVar, cqat cqatVar, bmon bmonVar, dxio<angp> dxioVar, dxio<anhg> dxioVar2, dxio<ckcw> dxioVar3, dxio<ania> dxioVar4, dxio<apkr> dxioVar5, dxio<akfa> dxioVar6, btvo btvoVar, btrm btrmVar, btpc btpcVar, cqho cqhoVar, bvrb bvrbVar, bzqc bzqcVar, cqhn cqhnVar, axwi axwiVar, aese aeseVar, dxio<bmvg> dxioVar7) {
        this.i = 1;
        this.m = application;
        this.f = activity;
        this.j = cjqyVar;
        this.k = cqatVar;
        this.d = bmonVar;
        this.l = dxioVar;
        this.e = dxioVar2;
        this.n = dxioVar3;
        this.J = dxioVar7;
        this.i = 1;
        this.p = dxioVar4;
        this.q = dxioVar5;
        this.r = dxioVar6;
        this.s = btvoVar;
        this.t = btrmVar;
        this.u = btpcVar;
        this.v = cqhoVar;
        this.g = bvrbVar;
        this.w = bzqcVar;
        this.x = axwiVar;
        this.y = aeseVar;
        ckcw a2 = dxioVar3.a();
        this.H = new bmvo(new bmvp(((ckcr) a2.a(ckgo.j)).a(), ((ckcr) a2.a(ckgo.k)).a()), new bmvp(((ckcr) a2.a(ckgo.l)).a(), ((ckcr) a2.a(ckgo.m)).a()));
        this.E = bwrs.a(new ily().d());
    }

    private final void as(ckgn ckgnVar, int i) {
        dnqg bZ = dnqh.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK = bZ.bK();
        if (!N().booleanValue()) {
            if (this.B != null) {
                this.B = null;
                ah();
            }
            if (this.A == null) {
                bmvs bmvsVar = new bmvs(this, ckgnVar, bK);
                this.A = bmvsVar;
                btrm btrmVar = this.t;
                dceq a2 = dcet.a();
                a2.b(anlb.class, new bmwd(anlb.class, bmvsVar));
                btrmVar.g(bmvsVar, a2.a());
            }
            this.q.a().a(new bmvr(), "timeline_checkin");
            return;
        }
        ac(ckgnVar, bK);
    }

    private final int at() {
        return this.w.c(bzqb.LOCATION_HISTORY);
    }

    private final Boolean au() {
        boolean z = false;
        if (ak().booleanValue() && W().c().bO()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    private final ckgn av() {
        if (!k().booleanValue()) {
            return null;
        }
        if (this.d.b()) {
            if (ar()) {
                return ckgn.YOU_ARE_HERE_NOW;
            }
            if (!B().booleanValue() && (aq() || !ap())) {
                if (aq()) {
                    return ckgn.LAST_VISITED_TITLE;
                }
                if (ak().booleanValue()) {
                    if (au().booleanValue() || ax()) {
                        return ckgn.YOU_HAVE_VISITED_THIS_PLACE;
                    }
                    if (this.G) {
                        return ckgn.YOU_HAVE_NOT_VISITED_THIS_PLACE;
                    }
                }
                return null;
            }
            return ckgn.ARE_YOU_HERE_NOW_QUESTION;
        }
        return ckgn.LAST_VISITED_TITLE;
    }

    private final boolean aw() {
        if (!this.d.b()) {
            return false;
        }
        if (!ap()) {
            return W().l();
        }
        return true;
    }

    private final boolean ax() {
        return this.h.a() && this.h.b().b == 2;
    }

    @Override // defpackage.bmtv
    public String A() {
        return this.f.getResources().getString(R.string.VISITS_YOU_ARE_HERE_NOW);
    }

    @Override // defpackage.bmtv
    public Boolean B() {
        if (!k().booleanValue() || !this.d.b() || ar()) {
            return false;
        }
        return Boolean.valueOf(W().i());
    }

    @Override // defpackage.bmtv
    public Boolean C() {
        return Boolean.valueOf(av() == ckgn.YOU_ARE_HERE_NOW);
    }

    @Override // defpackage.bmtv
    public Boolean D() {
        return Boolean.valueOf(av() == ckgn.LAST_VISITED_TITLE);
    }

    @Override // defpackage.bmtv
    public Boolean E() {
        return Boolean.valueOf(av() == ckgn.YOU_HAVE_VISITED_THIS_PLACE);
    }

    @Override // defpackage.bmtv
    public Boolean F() {
        return Boolean.valueOf(av() == ckgn.YOU_HAVE_NOT_VISITED_THIS_PLACE);
    }

    @Override // defpackage.bmtv
    public Boolean G() {
        ckgn ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION;
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return Boolean.valueOf(true ^ aw());
            }
            if (i2 != 1 && i2 == 2) {
                return true;
            }
            return false;
        }
        throw null;
    }

    @Override // defpackage.bmtv
    public Boolean H() {
        boolean z = true;
        if (G().booleanValue() || ((!aq() || !D().booleanValue()) && !C().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtv
    public Boolean I() {
        return Boolean.valueOf(this.F);
    }

    @Override // defpackage.bmtv
    public Boolean J() {
        boolean z = false;
        if (k().booleanValue() && ao()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtv
    public Boolean K() {
        boolean z = false;
        if (k().booleanValue() && ak().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtv
    public Boolean L() {
        boolean z = false;
        if (k().booleanValue() && !ao() && !this.h.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtv
    public Boolean M() {
        return Boolean.valueOf(this.s.getMapsActivitiesParameters().m);
    }

    @Override // defpackage.bmtv
    public Boolean N() {
        return Boolean.valueOf(this.p.a().a());
    }

    @Override // defpackage.bmtv
    public Boolean O() {
        return Boolean.valueOf(at() == 2);
    }

    @Override // defpackage.bmtv
    public void P(Boolean bool) {
        boolean z = false;
        if (!an().booleanValue() && bool.booleanValue()) {
            z = true;
        }
        this.F = z;
    }

    @Override // defpackage.bmtv
    public void Q(boolean z) {
        W().o(z);
    }

    @Override // defpackage.bmtv
    public bmtp R() {
        return W().j();
    }

    @Override // defpackage.bmtv
    public bmxb S() {
        return new bmxb(this) { // from class: bmvm
            private final bmwc a;

            {
                this.a = this;
            }

            @Override // defpackage.bmxb
            public final void a(int i) {
                dbsg dbsgVar;
                bmwc bmwcVar = this.a;
                dbsk.l(!bmwcVar.J().booleanValue());
                dcdc<bmud> k = bmwcVar.W().k();
                if (i < 0 || i >= k.size()) {
                    bvoo.h("Clicked out-of-bounds point.", new Object[0]);
                    return;
                }
                bmud bmudVar = k.get(i);
                long j = bmudVar.b().a().a;
                String aT = bmwcVar.W().c().aT();
                if (bmudVar.b().b()) {
                    dbsgVar = dbsg.i(bmudVar.a());
                } else {
                    dbsgVar = dbpy.a;
                }
                bmwcVar.e.a().D(anhy.n(j, aT, dbsgVar));
            }
        };
    }

    @Override // defpackage.bmtv
    public Integer T() {
        ckgn ckgnVar;
        dbsk.l(z().booleanValue());
        int at = at();
        boolean aw = aw();
        if (at != 2) {
            if (at != 3) {
                if (aw) {
                    ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION_LH_UNKNOWN_DEFAULT_EXPANDED;
                } else {
                    ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION_LH_UNKNOWN_DEFAULT_COLLAPSED;
                }
            } else if (aw) {
                ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION_LH_OFF_DEFAULT_EXPANDED;
            } else {
                ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION_LH_OFF_DEFAULT_COLLAPSED;
            }
        } else if (aw) {
            ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION_LH_ON_DEFAULT_EXPANDED;
        } else {
            ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION_LH_ON_DEFAULT_COLLAPSED;
        }
        return Integer.valueOf(ckgnVar.H);
    }

    @Override // defpackage.bmtv
    public cqkl U() {
        a(ckgn.VIEW_IN_VISITED_PLACES);
        anhq p = anhy.p();
        p.g(anhw.VISITED_PLACES);
        this.e.a().D(p.k());
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public bmtu V() {
        return this.z;
    }

    public final bmvi W() {
        return this.J.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X() {
        this.E.d(W().c());
    }

    final void Y() {
        if (w().booleanValue()) {
            cqkx.p(this);
        } else {
            this.v.q().b();
        }
    }

    public cqkl Z(ckgn ckgnVar, ddda dddaVar) {
        as(ckgnVar, dddaVar.b);
        return cqkl.a;
    }

    public final void aa() {
        dbsk.l(ak().booleanValue());
        if (this.D == null) {
            bmwa bmwaVar = new bmwa(this);
            this.D = bmwaVar;
            btrm btrmVar = this.t;
            dceq a2 = dcet.a();
            a2.b(anlb.class, new bmwg(anlb.class, bmwaVar));
            btrmVar.g(bmwaVar, a2.a());
        }
        if (N().booleanValue()) {
            af();
        } else {
            this.q.a().a(new bmwb(), "timeline_checkin");
        }
    }

    public final void ab() {
        dbsk.l(ak().booleanValue());
        if (!f().booleanValue() || !g().booleanValue()) {
            return;
        }
        if (!this.u.i()) {
            ckos.b(this.f.findViewById(16908290), R.string.OFFLINE_ERROR, 0).c();
            return;
        }
        this.h = dbsg.i(new bmvy(this));
        X();
        if (this.C == null) {
            bmvu bmvuVar = new bmvu(this);
            this.C = bmvuVar;
            btrm btrmVar = this.t;
            dceq a2 = dcet.a();
            a2.b(anlb.class, new bmwf(anlb.class, bmvuVar));
            btrmVar.g(bmvuVar, a2.a());
        }
        if (N().booleanValue()) {
            ae();
        } else {
            this.q.a().a(new bmvz(), "timeline_checkin");
        }
    }

    public final void ac(ckgn ckgnVar, dnqh dnqhVar) {
        dnqp bZ = dnqq.f.bZ();
        dbsg<dqfw> c2 = bmon.c(this.y.f());
        if (c2.a()) {
            dnru bZ2 = dnrv.c.bZ();
            dqfw b2 = c2.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnrv dnrvVar = (dnrv) bZ2.b;
            b2.getClass();
            dnrvVar.b = b2;
            dnrvVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqq dnqqVar = (dnqq) bZ.b;
            dnrv bK = bZ2.bK();
            bK.getClass();
            dnqqVar.c = bK;
            dnqqVar.a |= 4;
        }
        W().h(bZ);
        dnqq bK2 = bZ.bK();
        eapd eapdVar = new eapd(this.k.b());
        W().f(eapdVar);
        a(ckgnVar);
        ckco ckcoVar = (ckco) this.n.a().a(ckgo.n);
        int at = at();
        int i = 3;
        if (at == 0) {
            i = 5;
        } else if (at == 999) {
            i = 2;
        } else if (at != 2) {
            i = at != 3 ? 1 : 4;
        }
        ckcoVar.a(i - 1);
        this.F = !an().booleanValue();
        X();
        dnhy bZ3 = dnhz.e.bZ();
        long j = eapdVar.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnhz dnhzVar = (dnhz) bZ3.b;
        dnhzVar.a |= 4;
        dnhzVar.d = j;
        dnhz bK3 = bZ3.bK();
        dvyw h = W().c().h();
        this.H.a.b();
        angp a2 = this.l.a();
        bmvi W = W();
        String string = this.m.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION);
        this.m.getString(R.string.VISITS_ERROR_COULDNT_REFRESH_AFTER_SUCCESS);
        a2.j(h, bK3, dnqhVar, bK2, dbsg.i(W.v(string, this.t)));
    }

    public final void ad(ckgn ckgnVar, dnqh dnqhVar) {
        dbsg<String> g = W().g();
        a(ckgnVar);
        eapd eapdVar = new eapd(this.k.b());
        bmvi W = W();
        btrm btrmVar = this.t;
        String string = this.m.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION);
        this.m.getString(R.string.VISITS_ERROR_COULDNT_REFRESH_AFTER_SUCCESS);
        bmvh w = W.w(eapdVar, btrmVar, string);
        X();
        dnhy bZ = dnhz.e.bZ();
        long j = w.a().a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnhz dnhzVar = (dnhz) bZ.b;
        dnhzVar.a |= 4;
        dnhzVar.d = j;
        dnhz bK = bZ.bK();
        dnhy bZ2 = dnhz.e.bZ();
        long j2 = eapdVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnhz dnhzVar2 = (dnhz) bZ2.b;
        dnhzVar2.a |= 4;
        dnhzVar2.d = j2;
        dvyw h = W().c().h();
        dbpy<Object> dbpyVar = dbpy.a;
        this.H.b.b();
        this.l.a().g(dbsg.i(bK), dbsg.i(bZ2.bK()), h, dbpyVar, dnqhVar, g, dbsg.i(w.b()));
    }

    public final void ae() {
        dbsk.l(ak().booleanValue());
        bmvy b2 = this.h.b();
        dvyw h = W().c().h();
        String string = this.m.getString(R.string.VISITS_ADDED_TO_VISITED_PLACES_TOAST_MESSAGE);
        String string2 = this.m.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION);
        this.l.a().i(h, b, dbsg.i(new bmvx(b2, dbsg.i(string), string2)));
        b2.b = 2;
        X();
    }

    public final void af() {
        dbsk.l(ak().booleanValue());
        dbsg<String> g = W().g();
        X();
        this.l.a().g(dbpy.a, dbpy.a, W().c().h(), dbpy.a, c, g, dbsg.i(W().t(this.m.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION), this.m.getString(R.string.NOT_BEEN_HERE_SUCCESS))));
    }

    public final void ag() {
        bmvs bmvsVar = this.A;
        if (bmvsVar != null) {
            this.t.a(bmvsVar);
            this.A = null;
        }
    }

    public final void ah() {
        bmvt bmvtVar = this.B;
        if (bmvtVar != null) {
            this.t.a(bmvtVar);
            this.B = null;
        }
    }

    public final void ai() {
        bmvu bmvuVar = this.C;
        if (bmvuVar != null) {
            this.t.a(bmvuVar);
            this.C = null;
        }
    }

    public final void aj() {
        bmwa bmwaVar = this.D;
        if (bmwaVar != null) {
            this.t.a(bmwaVar);
            this.D = null;
        }
    }

    public Boolean ak() {
        boolean z = false;
        if (this.r.a().j().l() && this.s.getMapsActivitiesParameters().b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmof
    /* renamed from: al */
    public cqkl b(ckgn ckgnVar) {
        if (!this.o.contains(ckgnVar)) {
            ((ckco) this.n.a().a(ckgo.f)).a(ckgnVar.H);
            this.o.add(ckgnVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmof
    /* renamed from: am */
    public void a(@dzsi ckgn ckgnVar) {
        if (ckgnVar != null) {
            ((ckco) this.n.a().a(ckgo.g)).a(ckgnVar.H);
        }
    }

    public Boolean an() {
        return Boolean.valueOf(czue.a(this.m));
    }

    public final boolean ao() {
        return W().s() || ax() || ap();
    }

    public final boolean ap() {
        return W().p();
    }

    public final boolean aq() {
        return W().q();
    }

    public final boolean ar() {
        return W().r();
    }

    @Override // defpackage.begu
    public void c(Bundle bundle) {
        this.H.a();
        W().y();
    }

    @Override // defpackage.begu
    public void d(Bundle bundle) {
        W().x();
    }

    @Override // defpackage.bmoe
    public void e() {
        ab();
    }

    @Override // defpackage.bmoe
    public Boolean f() {
        dbsg<String> d = anpx.d(W().c().h());
        boolean z = true;
        boolean z2 = d.a() && !d.b().equals(akqi.a.o());
        if (!ak().booleanValue() || !z2 || au().booleanValue() || aq() || C().booleanValue() || W().c().j()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmoe
    public Boolean g() {
        boolean z = false;
        if (ak().booleanValue() && !this.h.a() && !ao()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmoe
    public void h() {
        this.G = true;
        Y();
    }

    @Override // defpackage.bmoe
    public bmod i() {
        if (C().booleanValue()) {
            return bmod.CHECKED_IN_AT_THE_PLACE;
        }
        if (!z().booleanValue()) {
            return bmod.NOT_AT_THE_PLACE;
        }
        if (!aw() || !W().u()) {
            return bmod.AT_THE_PLACE_LOW_CONFIDENCE;
        }
        return bmod.AT_THE_PLACE_HIGH_CONFIDENCE;
    }

    @Override // defpackage.bmoe
    public cqkl j(ckgn ckgnVar, ddda dddaVar) {
        return Z(ckgnVar, dddaVar);
    }

    @Override // defpackage.bmtv
    public Boolean k() {
        return Boolean.valueOf(W().c().f);
    }

    @Override // defpackage.bmtv
    public String l() {
        return W().d();
    }

    @Override // defpackage.begs
    public void m(btrm btrmVar) {
        W().z();
    }

    @Override // defpackage.begs
    public void n(btrm btrmVar) {
        ag();
        ah();
        ai();
        aj();
        W().A();
        this.H.a();
    }

    @Override // defpackage.bmtv
    public cqkl o(ckgn ckgnVar) {
        dbsk.l(!ao());
        a(ckgnVar);
        this.j.i(cjtd.a(dtxu.j));
        if (M().booleanValue()) {
            this.e.a().F(W().c());
        } else {
            List<dosf> e = W().e();
            if (!e.isEmpty()) {
                this.e.a().D(anhy.o(W().c().aT(), e.get(0)));
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public cqkl p(@dzsi ckgn ckgnVar) {
        a(ckgnVar);
        int i = 2;
        if (N().booleanValue()) {
            ddho ddhoVar = null;
            if (k().booleanValue() && ckgnVar != null) {
                int ordinal = ckgnVar.ordinal();
                if (ordinal == 0) {
                    ddhoVar = dtxy.hp;
                } else if (ordinal == 1) {
                    ddhoVar = dtxy.ni;
                } else if (ordinal == 2) {
                    ddhoVar = dtxy.jj;
                } else if (ordinal == 14) {
                    ddhoVar = dtxy.nk;
                } else if (ordinal == 15) {
                    ddhoVar = dtxy.nj;
                }
            }
            if (ddhoVar != null) {
                cjta b2 = cjtd.b();
                b2.d = ddhoVar;
                dvxb dvxbVar = W().c().h().V;
                if (dvxbVar == null) {
                    dvxbVar = dvxb.d;
                }
                if ((dvxbVar.a & 2) != 0) {
                    b2.g(dvxbVar.c);
                }
                if ((dvxbVar.a & 1) != 0) {
                    b2.b = dvxbVar.b;
                }
                this.j.i(b2.a());
            }
        }
        if (true != G().booleanValue()) {
            i = 3;
        }
        this.i = i;
        Y();
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public cqkl q() {
        p(av());
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public cqkl r(ckgn ckgnVar, ddfv ddfvVar) {
        as(ckgnVar, ddfvVar.a);
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public cqkl s(ckgn ckgnVar, ddda dddaVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = dddaVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK = bZ.bK();
        if (!N().booleanValue()) {
            if (this.A != null) {
                this.A = null;
                ag();
            }
            if (this.B == null) {
                bmvt bmvtVar = new bmvt(this, ckgnVar, bK);
                this.B = bmvtVar;
                btrm btrmVar = this.t;
                dceq a2 = dcet.a();
                a2.b(anlb.class, new bmwe(anlb.class, bmvtVar));
                btrmVar.g(bmvtVar, a2.a());
            }
            this.q.a().a(new bmvr(), "timeline_checkin");
        } else {
            ad(ckgnVar, bK);
        }
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        bvrj.UI_THREAD.c();
        this.E = bwrsVar;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        W().a(iloVar, this.I);
        if (z().booleanValue()) {
            bmvo bmvoVar = this.H;
            bmvoVar.a.a();
            bmvoVar.b.a();
        }
        if (this.x.p() != null) {
            h();
        }
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bmtv
    public cqkl v() {
        dbsk.l(ak().booleanValue());
        a(ckgn.EDIT_MARK_AS_VISITED);
        b(ckgn.YES_MARK_AS_VISITED);
        b(ckgn.NO_NOT_BEEN_HERE);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: bmvj
            private final bmwc a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bmwc bmwcVar = this.a;
                if (i == -1) {
                    bmwcVar.a(ckgn.YES_MARK_AS_VISITED);
                    bmwcVar.ab();
                } else if (i != -2) {
                } else {
                    bmwcVar.a(ckgn.NO_NOT_BEEN_HERE);
                }
            }
        };
        new AlertDialog.Builder(this.f).setMessage(R.string.VISITS_HAVE_YOU_BEEN_HERE_BEFORE_QUESTION).setPositiveButton(R.string.YES_BUTTON, onClickListener).setNegativeButton(R.string.NO_BUTTON, onClickListener).show();
        return cqkl.a;
    }

    @Override // defpackage.bega
    public Boolean w() {
        bvrj.UI_THREAD.c();
        boolean z = false;
        if (k().booleanValue() && (aq() || z().booleanValue() || ao() || E().booleanValue() || F().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtv
    public cqkl x() {
        dbsk.l(ak().booleanValue());
        dbsk.l(E().booleanValue());
        a(ckgn.EDIT_MARK_AS_NOT_BEEN_HERE);
        b(ckgn.NO_MARK_AS_NOT_BEEN_HERE);
        b(ckgn.YES_BEEN_HERE);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: bmvk
            private final bmwc a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bmwc bmwcVar = this.a;
                if (i == -1) {
                    bmwcVar.a(ckgn.YES_BEEN_HERE);
                    bmwcVar.aa();
                } else if (i != -2) {
                } else {
                    bmwcVar.a(ckgn.NO_MARK_AS_NOT_BEEN_HERE);
                }
            }
        };
        new AlertDialog.Builder(this.f).setMessage(R.string.VISITS_REMOVE_FROM_VISITED_PLACES).setPositiveButton(R.string.YES_BUTTON, onClickListener).setNegativeButton(R.string.NO_BUTTON, onClickListener).show();
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public cqkl y() {
        dbsk.l(ak().booleanValue());
        dbsk.l(!E().booleanValue());
        dbsk.l(!F().booleanValue());
        a(ckgn.EDIT_REMOVE_ALL_VISITS);
        b(ckgn.REMOVE_ALL_VISITS);
        b(ckgn.CANCEL_REMOVE_ALL_VISITS);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: bmvl
            private final bmwc a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bmwc bmwcVar = this.a;
                if (i == -1) {
                    bmwcVar.a(ckgn.REMOVE_ALL_VISITS);
                    bmwcVar.aa();
                } else if (i != -2) {
                } else {
                    bmwcVar.a(ckgn.CANCEL_REMOVE_ALL_VISITS);
                }
            }
        };
        new AlertDialog.Builder(this.f).setTitle(R.string.VISITS_REMOVE_ALL_VISITS_DIALOG_TITLE).setMessage(R.string.VISITS_REMOVE_ALL_VISITS_DIALOG_MESSAGE).setPositiveButton(R.string.REMOVE_BUTTON, onClickListener).setNegativeButton(R.string.CANCEL_BUTTON, onClickListener).show();
        return cqkl.a;
    }

    @Override // defpackage.bmtv
    public Boolean z() {
        return Boolean.valueOf(av() == ckgn.ARE_YOU_HERE_NOW_QUESTION);
    }
}
