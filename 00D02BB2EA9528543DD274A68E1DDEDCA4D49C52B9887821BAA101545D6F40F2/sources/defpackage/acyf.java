package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acyf  reason: default package */
/* loaded from: classes.dex */
public final class acyf extends dxiz implements gfw, gfo, gft, cjsf, ggc, acyq {
    public aefg a;
    public dxio<aeei> aA;
    public dxio<gcs> aB;
    public dxio<aeem> aC;
    public dxio<aeek> aD;
    public dxio<bzmm> aE;
    public dxio<ckcw> aF;
    public acxe aG;
    public dxio<abal> aH;
    public dxio<hwd> aI;
    public cqkj aJ;
    public acyp aK;
    public dxio<aeic> aL;
    public dxio<gcr> aM;
    public dxio<akto> aN;
    public dxio<cjmt> aO;
    public bxxl aP;
    public bkat aQ;
    public bxrw aR;
    public dxio<gcn> aS;
    public dxio<abfa> aT;
    public dxio<aefj> aU;
    public btco aV;
    public dxio<alhv> ad;
    public ixr ae;
    public dxio<acwo> af;
    public acyo ag;
    public bvkx ah;
    public dxio<awwq> ai;
    public ivt aj;
    public btvo ak;
    public acyr al;
    public bvjj am;
    public dxio<glk> an;
    public acwu ao;
    public dxio<ish> ap;
    public acys aq;
    public acwx ar;
    public dxio<afwp> as;
    public dxio<cjea> at;
    public acyn au;
    public dxio<cjqy> av;
    public dxio<aeaa> aw;
    public adzz ax;
    public dxio<acyy> ay;
    public dxio<aeef> az;
    public dzsj<aedv> b;
    @dzsi
    private ivs bA;
    private bvpk bE;
    private bvpk bF;
    private aefi bI;
    @dzsi
    private cqkf<aees> bJ;
    private boolean bK;
    @dzsi
    private Parcelable bO;
    public boolean ba;
    public boolean bb;
    public boolean bc;
    awwb bg;
    awwp bh;
    @dzsi
    public dktk bi;
    @dzsi
    public deig<Boolean> bk;
    @dzsi
    public deig<Void> bl;
    public Integer bn;
    public boolean bp;
    @dzsi
    public cjqp br;
    public adyx bt;
    public bxeg bu;
    @dzsi
    public aeal bv;
    private cqkf<?> bz;
    public aeet c;
    public efg d;
    public cqat e;
    public dxio<btrm> f;
    public Executor g;
    public static final dcqe aW = dcqe.c("acyf");
    private static final long bx = TimeUnit.MINUTES.toMillis(2);
    public static final long aX = TimeUnit.MINUTES.toMillis(2);
    public static final dcep<dktk> aY = dcep.C(dktk.EXPLORE, dktk.INFORMAL_TRANSIT);
    private final dbty<cjsz> by = dbud.a(new dbty() { // from class: acxf
        @Override // defpackage.dbty
        public final Object a() {
            return new cjsz(dtxr.as);
        }
    });
    public boolean aZ = false;
    public boolean bd = true;
    public boolean be = false;
    public boolean bf = false;
    private boolean bB = false;
    private boolean bC = false;
    private boolean bD = false;
    private final acyc bG = new acyc(this);
    private SparseArray<Parcelable> bH = new SparseArray<>();
    public final Map<dktk, acye> bj = new EnumMap(dktk.class);
    public boolean bm = false;
    public boolean bo = false;
    private boolean bL = false;
    private int bM = -1;
    private long bN = -1000;
    public boolean bq = false;
    private final alht bP = new alht(this) { // from class: acxk
        private final acyf a;

        {
            this.a = this;
        }

        @Override // defpackage.alht
        public final boolean a(alhr alhrVar) {
            acyf acyfVar = this.a;
            aegc h = acyfVar.h();
            dxio<abfa> dxioVar = acyfVar.aT;
            int i = 59;
            if (dxioVar != null && dxioVar.a().v()) {
                i = 67;
            }
            if (!acyfVar.ba || !acyfVar.aZ || h == null || aefy.b(h, i)) {
                return false;
            }
            acyfVar.aT(2, true);
            acyfVar.a.h();
            return true;
        }
    };
    private final awwn bQ = new acxt(this);
    private final acxu bU = new acxu();
    private final aedu bR = new aedu(this) { // from class: acxl
        private final acyf a;

        {
            this.a = this;
        }

        @Override // defpackage.aedu
        public final void a(dktk dktkVar) {
            acyf acyfVar = this.a;
            if (!acyf.aY.contains(dktkVar)) {
                return;
            }
            acye acyeVar = acyfVar.bj.containsKey(dktkVar) ? acyfVar.bj.get(dktkVar) : new acye();
            acyeVar.a = acyfVar.e.e();
            acyfVar.bj.put(dktkVar, acyeVar);
        }
    };
    private final aedt bS = new aedt(this) { // from class: acxm
        private final acyf a;

        {
            this.a = this;
        }

        @Override // defpackage.aedt
        public final void a(dktk dktkVar, boolean z, cjqm cjqmVar) {
            dbsg dbsgVar;
            cqkf<aeeq> l;
            acye acyeVar;
            jjf i;
            acyf acyfVar = this.a;
            ff J = acyfVar.J();
            if (J == null || !acyfVar.ba || !acyf.aY.contains(dktkVar)) {
                return;
            }
            acyfVar.be = true;
            aeet aeetVar = acyfVar.c;
            aeetVar.e.a();
            aebb c = aeet.c(aeetVar.a, dktkVar);
            if (c == null) {
                dbsgVar = dbpy.a;
            } else {
                if (c != aeetVar.e) {
                    aeetVar.e = c;
                    aeetVar.b.a().j(awwm.GOLDFINGER_TAB_SWITCH);
                    aeetVar.b();
                } else if (!z) {
                    dbsgVar = dbpy.a;
                }
                cjqp a = aeetVar.d.a(aeetVar.e.d());
                aeetVar.f = a.d(aeetVar.e.b());
                dbsgVar = dbsg.i(a);
            }
            if (dbsgVar.a()) {
                acyfVar.br = (cjqp) dbsgVar.b();
            }
            aegc h = acyfVar.h();
            btpf c2 = btpf.c(J);
            if (!z) {
                if (c2.e && c2.f && (i = acyfVar.i()) != null) {
                    i.h();
                }
                if (h != null) {
                    aegc h2 = acyfVar.h();
                    ff J2 = acyfVar.J();
                    if (h2 != null && J2 != null && (((acyeVar = acyfVar.bj.get(dktkVar)) != null && acyfVar.e.e() - acyeVar.a > acyf.aX) || h2.c() < acyfVar.aS())) {
                        h2.h(acyfVar.aS());
                    }
                }
            }
            aefg aefgVar = acyfVar.a;
            if (aefgVar != null) {
                aeez j = aefgVar.j();
                btpf c3 = btpf.c(aefgVar.c);
                if (aefgVar.k()) {
                    aefgVar.g(c3.f);
                }
                if (j != null) {
                    cqkx.p(j);
                }
            }
            dxio<abfa> dxioVar = acyfVar.aT;
            if (dxioVar != null && dxioVar.a().v() && (l = acyfVar.a.l()) != null) {
                aeez aeezVar = (aeez) l.d();
                if (dktkVar == dktk.EXPLORE && aeezVar != null) {
                    acyfVar.getClass();
                    aeezVar.j(new aeey(acyfVar) { // from class: acxj
                        private final acyf a;

                        {
                            this.a = acyfVar;
                        }

                        @Override // defpackage.aeey
                        public final void a(View view) {
                            acyf acyfVar2 = this.a;
                            View findViewById = view.findViewById(R.id.explore_tab_home_title_card);
                            aegc h3 = acyfVar2.h();
                            if (h3 == null) {
                                return;
                            }
                            boolean z2 = true;
                            if (h3.c() != h3.o().getHeight() || (findViewById != null && findViewById.getY() >= (-findViewById.getHeight()))) {
                                z2 = false;
                            }
                            if (acyfVar2.bo == z2) {
                                return;
                            }
                            acyfVar2.bo = z2;
                            acyfVar2.p();
                        }
                    });
                } else if (aeezVar != null) {
                    aeezVar.j(null);
                }
            }
            if ((!c2.e || !c2.f) && dktkVar == acyfVar.bi) {
                return;
            }
            acyfVar.p();
        }
    };
    private final aeds bT = new aeds(this) { // from class: acxn
        private final acyf a;

        {
            this.a = this;
        }

        @Override // defpackage.aeds
        public final void a(dktk dktkVar) {
            ff J;
            aeet aeetVar;
            aebb a;
            jjf i;
            acyf acyfVar = this.a;
            if (!acyfVar.ba || !acyf.aY.contains(dktkVar) || (J = acyfVar.J()) == null) {
                return;
            }
            btpf c = btpf.c(J);
            if (c.e && c.f && (i = acyfVar.i()) != null) {
                if (i.f()) {
                    i.h();
                } else {
                    i.g();
                }
            }
            aegc h = acyfVar.h();
            if (h == null) {
                return;
            }
            int c2 = h.c();
            int aS = acyfVar.aS();
            h.e(aS);
            if (c2 < aS) {
                acyfVar.aV(3);
            }
            dxio<abfa> dxioVar = acyfVar.aT;
            if (dxioVar == null || !dxioVar.a().v() || (aeetVar = acyfVar.c) == null || acyfVar.ai == null || acyfVar.bn == null || (a = aeetVar.a()) == null || a.a() != dktk.EXPLORE || a.j() || h.d() <= acyfVar.bn.intValue()) {
                return;
            }
            a.l(true, ckfe.USER_TAPPED_TAB_BUTTON);
            acyfVar.ai.a().j(awwm.GOLDFINGER_SHEET_UNCOLLAPSE);
        }
    };
    public final ViewTreeObserver.OnDrawListener bs = new acxy(this);

    private final boolean aW() {
        ff J = J();
        return (J instanceof gga) && ((gga) J).I();
    }

    private final void aX() {
        this.bi = this.b.a().f();
        aegc h = h();
        if ((h == null && !this.al.a().i) || this.bA == null) {
            String str = "";
            String str2 = h == null ? " bottomSheetView (without kill switch " : str;
            if (this.bA == null) {
                str = "directionsFabViewModel";
            }
            StringBuilder sb = new StringBuilder(str2.length() + 92 + str.length());
            sb.append("The following field should not be null when applyBottomSheetUiStateTransition() is called : ");
            sb.append(str2);
            sb.append(str);
            bvoo.f(new IllegalStateException(sb.toString()));
        }
        egj ba = ba();
        if (this.aZ) {
            ff J = J();
            if (J != null && bc(J)) {
                this.a.g(false);
            }
            if (h != null) {
                ba.H(h);
                ba.N(bf());
            }
            this.au.a(h, bf());
            this.au.b(null);
        }
        this.ae.ak(false);
        this.ae.al(true);
        if (this.aT.a().v()) {
            cqkf<aees> cqkfVar = this.bJ;
            if (cqkfVar == null || !this.bo) {
                ba.F(null);
                this.ae.aj(true);
            } else {
                ba.F(cqkfVar.c());
                if (cpv.a.e(J())) {
                    ba.W(null);
                }
                this.ae.aj(false);
            }
            ba.a.aG = 2;
        }
        this.d.a(ba.a());
        if (!this.ae.n().booleanValue()) {
            this.ae.o(true);
            cqkx.p(this.ae);
        }
        if (this.ae.s().booleanValue()) {
            this.ae.t(false);
            cqkx.p(this.ae);
        }
    }

    private final void aY() {
        jjf i = i();
        if ((i == null && !this.al.a().i) || this.bA == null) {
            String str = "";
            String str2 = i == null ? " collapsibleSidePanelView (without kill switch " : str;
            if (this.bA == null) {
                str = "directionsFabViewModel";
            }
            StringBuilder sb = new StringBuilder(str2.length() + 90 + str.length());
            sb.append("The following field should not be null when applySidePanelUiStateTransition() is called : ");
            sb.append(str2);
            sb.append(str);
            bvoo.f(new IllegalStateException(sb.toString()));
        }
        egj ba = ba();
        if (this.aZ) {
            ff J = J();
            if (J != null && bc(J)) {
                this.a.g(true);
            }
            ba.ax(i);
            this.au.a(null, 0);
            this.au.b(i);
        }
        this.ae.ak(false);
        this.ae.al(true);
        this.d.a(ba.a());
        ff J2 = J();
        if (J2 != null) {
            aN(btpf.c(J2));
        }
    }

    private final egj ba() {
        cqkf<?> cqkfVar;
        egj egjVar = new egj(this);
        View view = null;
        egjVar.ag(null);
        egjVar.w(null);
        egjVar.Q(this.bA);
        egjVar.z(new aljk());
        egjVar.Z();
        egjVar.V(new hqv(), this.ae);
        egjVar.au();
        egjVar.J(new egq(this) { // from class: acxg
            private final acyf a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                ViewTreeObserver viewTreeObserver;
                ViewTreeObserver viewTreeObserver2;
                awwb awwbVar;
                awwp awwpVar;
                acyf acyfVar = this.a;
                acyfVar.bb = true;
                if (acyfVar.aJ() && (awwbVar = acyfVar.bg) != null && (awwpVar = acyfVar.bh) != null) {
                    acyfVar.aR(awwbVar, awwpVar);
                }
                acyfVar.f.a().b(acyv.a);
                ish a = acyfVar.ap.a();
                a.e = a.b.a().b(new isg(a));
                a.e.b(1000L);
                a.e.a();
                acyfVar.aE.a().a(acyfVar.aD.a());
                acyfVar.aE.a().a(acyfVar.aC.a());
                if (!acyfVar.aq.h(acyfVar.bp)) {
                    if (acyfVar.g()) {
                        jjf i = acyfVar.i();
                        if (i != null && (viewTreeObserver2 = i.getViewTreeObserver()) != null) {
                            viewTreeObserver2.removeOnDrawListener(acyfVar.bs);
                            viewTreeObserver2.addOnDrawListener(acyfVar.bs);
                            return;
                        }
                    } else {
                        aegc h = acyfVar.h();
                        if (h != null && (viewTreeObserver = h.o().getViewTreeObserver()) != null) {
                            viewTreeObserver.removeOnDrawListener(acyfVar.bs);
                            viewTreeObserver.addOnDrawListener(acyfVar.bs);
                            return;
                        }
                    }
                    bvoo.h("Failed to add draw listener to inspect view hierarchy.", new Object[0]);
                    acyfVar.aq.e();
                }
            }
        });
        egf a = egf.a();
        a.B = true;
        a.D = true;
        a.s = true;
        a.E = dpwz.MAP_CONTENT_BROWSE;
        a.s(4);
        a.s(3);
        egjVar.A(a);
        if (this.aZ && (cqkfVar = this.bz) != null) {
            egjVar.av(cqkfVar.c());
            egjVar.k(true);
        }
        egjVar.c(this.as.a().e());
        if (this.aK.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
        }
        if (this.aK.g()) {
            egjVar.h();
        }
        this.at.a();
        acyy a2 = this.ay.a();
        if (a2.g != null || a2.b()) {
            cqkf<jbn> cqkfVar2 = a2.g;
            dbsk.s(cqkfVar2);
            view = cqkfVar2.c();
        }
        if (view != null) {
            egjVar.i(view);
        }
        return egjVar;
    }

    private static boolean bc(Activity activity) {
        return btpf.c(activity).e;
    }

    private final boolean be() {
        return this.ak.getPassiveAssistParameters().o();
    }

    private final int bf() {
        float f;
        aegc h = h();
        ff J = J();
        if (h == null || J == null) {
            return 0;
        }
        aebb a = this.c.a();
        if (a != null) {
            f = a.k().floatValue();
        } else {
            f = this.al.a().h;
        }
        return (int) (bvsc.a(J) * f);
    }

    public static boolean w(Activity activity) {
        return btpf.c(activity).f;
    }

    @Override // defpackage.ggg
    public final gfu Nx() {
        return gfu.ACTIVITY_FRAGMENT;
    }

    @Override // defpackage.gfr
    public final fd Ny() {
        return this;
    }

    @Override // defpackage.fd
    public final void Qe() {
        aefg aefgVar = this.a;
        cqkf<aeeq> l = aefgVar.l();
        if (l != null) {
            l.c().getViewTreeObserver().removeOnPreDrawListener(aefgVar.b);
        }
        for (cqkf<aeeq> cqkfVar : aefgVar.o.values()) {
            cqkfVar.e(null);
            if (!aefgVar.l.getPassiveAssistParameters().p()) {
                aefgVar.m.g((ViewGroup) cqkfVar.c());
            }
        }
        aefgVar.o.clear();
        aefgVar.a = null;
        cqkf<aeeq> cqkfVar2 = aefgVar.j;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        aefgVar.j = null;
        cqkf<jbn> cqkfVar3 = this.ay.a().g;
        if (cqkfVar3 != null) {
            cqkfVar3.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (!(obj instanceof bsjn) || !be()) {
            if (!(obj instanceof bbua) || !this.aT.a().v()) {
                return;
            }
            dbsk.s(obj);
            bbua bbuaVar = (bbua) obj;
            aebb a = this.c.a();
            if (!(a instanceof aebl)) {
                return;
            }
            ((aebl) a).o(bbuaVar);
            return;
        }
        dbsk.s(obj);
        bsjn bsjnVar = (bsjn) obj;
        this.aL.a().e(bsjnVar.c(), bsjnVar.a());
    }

    public final boolean aJ() {
        return this.ak.getHomeScreenParameters().i;
    }

    public final int aM() {
        aegc h = h();
        if (h == null) {
            return 0;
        }
        dktk f = this.b.a().f();
        if ((f != dktk.EXPLORE && f != dktk.INFORMAL_TRANSIT) || this.ae.P() != null) {
            return h.u();
        }
        int u = h.u();
        Integer num = this.bn;
        dbsk.s(num);
        return u + num.intValue();
    }

    @Override // defpackage.ggg
    public final List aO() {
        return dcdc.e();
    }

    @Override // defpackage.cjsf
    public final cjtg aP() {
        return this.by.a();
    }

    public final void aQ() {
        this.aw.a().a(this.ax.a(aeav.PERSONALIZED_HISTORY, "personalized_history_prefetch", dcep.B(awvv.I)));
    }

    public final void aR(awwb awwbVar, awwp awwpVar) {
        aeal aealVar;
        acxb acxbVar;
        bvrj.UI_THREAD.c();
        boolean z = true;
        if (!this.bD) {
            this.bD = true;
            acxc acxcVar = (acxc) this.aq;
            if (acxcVar.l()) {
                bvmo.g.c(ckfh.e);
                ((ckhe) acxcVar.a.a(ckfh.j)).c();
            }
            this.aq.j(true);
        }
        aebb a = this.c.a();
        boolean z2 = a == null || !awwh.a(awwbVar, a.h());
        dnui dnuiVar = null;
        if (a != null && a.a() == dktk.EXPLORE) {
            deig<Boolean> deigVar = this.bk;
            if (deigVar == null) {
                deig<Void> deigVar2 = this.bl;
                if (deigVar2 != null && z2) {
                    deigVar2.j(null);
                    this.bl = null;
                }
            } else if (z2) {
                deigVar.j(false);
                this.bk = null;
                this.bl = null;
            } else {
                deigVar.j(true);
                this.bk = null;
            }
        }
        if (z2) {
            acxc acxcVar2 = (acxc) this.aq;
            if (acxcVar2.l() && (acxbVar = acxcVar2.b) != null && !acxbVar.h) {
                acxbVar.h = true;
                bvmo.g.c(ckfh.f);
            }
            aegc h = h();
            boolean z3 = h != null && !aefy.b(h, 59);
            if (!this.bB && z3) {
                this.bB = true;
                if (a != null && a.a() == dktk.EXPLORE && this.al.a().X && this.al.a().aa) {
                    this.aw.a().b(new acyd(this), this.al.a().ac, TimeUnit.MILLISECONDS);
                }
            }
        }
        aegc h2 = h();
        boolean z4 = awwpVar.a() || this.be;
        this.be = false;
        boolean z5 = h2 != null && h2.c() == h2.u();
        awwo c = awwp.c();
        if (!z4 && !z5) {
            z = false;
        }
        c.c(z);
        c.b(awwpVar.b());
        awwp a2 = c.a();
        aeez j = this.a.j();
        if (j != null) {
            j.n(awwbVar, a2);
        }
        this.bd = false;
        if (z2 && (aealVar = this.bv) != null && aealVar.b()) {
            this.bv.a();
        }
        acyy a3 = this.ay.a();
        if (a3.d.a().booleanValue()) {
            a3.c.h(awwbVar);
        }
        if (a3.e.a().booleanValue() && a3.b.a().j().l()) {
            dbsg a4 = awwbVar.a(awvv.j);
            if (a4.a()) {
                for (dnui dnuiVar2 : ((dnuk) a4.b()).b) {
                    dpjx dpjxVar = dnuiVar2.d;
                    if (dpjxVar == null) {
                        dpjxVar = dpjx.n;
                    }
                    if ((dpjxVar.a & 256) != 0) {
                        dpjx dpjxVar2 = dnuiVar2.d;
                        if (dpjxVar2 == null) {
                            dpjxVar2 = dpjx.n;
                        }
                        dpjs b = dpjs.b(dpjxVar2.f);
                        if (b == null) {
                            b = dpjs.ENTITY_TYPE_DEFAULT;
                        }
                        if (b == dpjs.ENTITY_TYPE_HOME || b == dpjs.ENTITY_TYPE_WORK) {
                            dnuiVar = dnuiVar2;
                            break;
                        }
                    }
                }
                if (dnuiVar != null) {
                    dpjx dpjxVar3 = dnuiVar.d;
                    if (dpjxVar3 == null) {
                        dpjxVar3 = dpjx.n;
                    }
                    amvh M = amvh.M(dpjxVar3, a3.a);
                    amvh amvhVar = a3.f;
                    if (M != null ? !M.equals(amvhVar) : amvhVar != null) {
                        a3.f = M;
                        if (M.b == dpjs.ENTITY_TYPE_HOME) {
                            a3.c.g(dndr.HOME, M, dnuiVar.b);
                        } else if (M.b == dpjs.ENTITY_TYPE_WORK) {
                            a3.c.g(dndr.WORK, M, dnuiVar.b);
                        }
                    }
                }
            }
        }
        a3.c.i();
        if (this.bq) {
            q();
            this.bq = false;
        }
        aefi aefiVar = this.bI;
        if (aefiVar != null) {
            aefiVar.b(awwbVar);
            cqkx.p(this.bI);
        }
    }

    public final int aS() {
        if (J() == null) {
            return 0;
        }
        return bf();
    }

    public final void aT(@dzsi int i, boolean z) {
        aegc h = h();
        if (h == null) {
            return;
        }
        int aM = aM();
        if (h.c() <= h.u()) {
            return;
        }
        if (i != 0) {
            aU(i);
        }
        if (!this.ba || !z) {
            h.h(aM);
        }
        h.e(aM);
    }

    public final void aU(int i) {
        if (this.e.e() - this.bN < 1000) {
            return;
        }
        ((ckco) this.aF.a().a(ckfh.aR)).a(i - 1);
        this.bN = this.e.e();
    }

    public final void aV(int i) {
        ((ckco) this.aF.a().a(ckfh.aS)).a(i - 1);
    }

    @Override // defpackage.gfw
    public final void aZ(gfv gfvVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0069 A[SYNTHETIC] */
    @Override // defpackage.fd
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ag(android.view.LayoutInflater r9, @defpackage.dzsi android.view.ViewGroup r10, @defpackage.dzsi android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyf.ag(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.fd
    public final void al() {
        super.al();
        this.ae.ah();
    }

    @Override // defpackage.gft
    public final boolean bb() {
        return this.ba;
    }

    @Override // defpackage.ggc
    public final dbsg<cjqp> bd() {
        return dbsg.j(this.br);
    }

    public final void d() {
        if (this.bc) {
            this.ai.a().j(awwm.GOLDFINGER_SHEET_UNCOLLAPSE);
        }
    }

    @Override // defpackage.gfo
    public final boolean e() {
        aegc h = h();
        if (!this.ba || h == null || !h.k()) {
            return false;
        }
        h.e(aS());
        return true;
    }

    public final boolean g() {
        ff J = J();
        return J != null && w(J) && bc(J);
    }

    @dzsi
    public final aegc h() {
        aefg aefgVar = this.a;
        if (aefgVar == null) {
            return null;
        }
        return aefgVar.e();
    }

    @dzsi
    public final jjf i() {
        aefg aefgVar = this.a;
        if (aefgVar == null) {
            return null;
        }
        return aefgVar.f();
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        int i;
        this.bK = true;
        this.ae.ai(true);
        super.l(bundle);
        adza adzaVar = (adza) this.al;
        boolean z = false;
        boolean z2 = adzaVar.h(dktk.EXPLORE) || adzaVar.h(dktk.INFORMAL_TRANSIT);
        boolean z3 = adzaVar.a.a().i;
        if (z2 && !z3) {
            z = true;
        }
        this.aZ = z;
        final acys acysVar = this.aq;
        acysVar.getClass();
        this.ai.a().e(new Runnable(acysVar) { // from class: acxo
            private final acys a;

            {
                this.a = acysVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        });
        if (this.ak.getHomeScreenParameters().j && this.aN.a().l()) {
            this.aI.a().j();
        }
        if (bundle != null) {
            this.ao.a = (alad) bundle.getSerializable("previous_camera_position");
            if (bundle.containsKey("ue3ActivationId") && (i = bundle.getInt("ue3ActivationId")) != 0) {
                aP().b(i);
            }
            for (aebb aebbVar : this.c.a) {
                aebbVar.m(bundle);
            }
        }
        Bundle bundle2 = this.o;
        if (bundle2 != null && bundle2.containsKey("isAppStartKey")) {
            this.bL = bundle2.getBoolean("isAppStartKey", true);
        }
        dkmu dkmuVar = this.ak.getLanguageSettingParameters().h;
        if (dkmuVar == null) {
            dkmuVar = dkmu.e;
        }
        if (dkmuVar.a) {
            aa<? super List<Locale>> aaVar = new aa(this) { // from class: acxi
                private final acyf a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    acyf acyfVar = this.a;
                    if (!((List) obj).isEmpty()) {
                        btcb btcbVar = new btcb();
                        ff J = acyfVar.J();
                        if (J == null) {
                            return;
                        }
                        dkmu dkmuVar2 = acyfVar.ak.getLanguageSettingParameters().h;
                        if (dkmuVar2 == null) {
                            dkmuVar2 = dkmu.e;
                        }
                        if (!dkmuVar2.b) {
                            btcbVar.aJ(J);
                            return;
                        }
                        ddho ddhoVar = dtxu.f;
                        cjqp cjqpVar = acyfVar.br;
                        if (cjqpVar == null) {
                            return;
                        }
                        cjqpVar.d(cjtd.a(ddhoVar));
                    }
                }
            };
            if (this.aV.b.h() != null) {
                return;
            }
            this.ah.k(this.aV, this.g, bvkw.ON_STARTUP_FULLY_COMPLETE);
            this.aV.b.b(this, aaVar);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ff J = J();
        if (J == null || !this.ba) {
            return;
        }
        if (!bc(J) || configuration.orientation != 2) {
            aX();
        } else {
            aY();
        }
        this.ae.ah();
    }

    public final void p() {
        if (g()) {
            aY();
        } else {
            aX();
        }
    }

    public final void q() {
        ViewTreeObserver viewTreeObserver;
        acya acyaVar = new acya(this);
        aegc h = h();
        if (h == null || (viewTreeObserver = h.o().getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnDrawListener(acyaVar);
    }

    @Override // defpackage.fd
    public final void s() {
        aegc h;
        super.s();
        if (aW()) {
            return;
        }
        int i = 1;
        this.ba = true;
        this.bd = true;
        long w = this.am.w(bvjk.N, 0L);
        if (w == 0 || this.e.b() - w > bx) {
            this.be = true;
        }
        this.ao.b();
        this.a.a = this.bO;
        this.ad.a().b(this.bP);
        this.bt.a.add(this.bU);
        final acyn acynVar = this.au;
        acynVar.e = true;
        acynVar.a.a().k.Pk(new Runnable(acynVar) { // from class: acyj
            private final acyn a;

            {
                this.a = acynVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                acyn acynVar2 = this.a;
                if (acynVar2.e) {
                    acynVar2.a.a().ad(acynVar2.g);
                }
            }
        }, acynVar.d);
        this.ai.a().k();
        this.b.a().i(this.bS);
        this.b.a().j(this.bR);
        this.b.a().k(this.bT);
        if (!this.al.c()) {
            this.b.a().a();
        } else if (this.bL) {
            this.b.a().a();
            this.bL = false;
        } else {
            this.aq.i(dktk.EXPLORE);
            this.b.a().g(dktk.EXPLORE);
        }
        this.b.a().b(this);
        this.bi = this.b.a().f();
        if (!this.al.a().i) {
            this.ai.a().f(this.bQ);
        }
        this.aH.a();
        this.ai.a().l();
        if (!this.bC) {
            this.ai.a().o(new acxq(this));
            ((ckcm) ((acxc) this.aq).a.a(ckfh.aT)).a(this.aZ);
            this.bC = true;
        }
        acyc acycVar = this.bG;
        dceq a = dcet.a();
        a.b(alhl.class, new acyg(0, alhl.class, acycVar));
        a.b(alhy.class, new acyg(1, alhy.class, acycVar));
        a.b(alhw.class, new acyg(2, alhw.class, acycVar));
        a.b(alhx.class, new acyg(3, alhx.class, acycVar));
        a.b(ardp.class, new acyg(4, ardp.class, acycVar));
        a.b(ege.class, new acyg(ege.class, acycVar, bvrj.UI_THREAD));
        this.f.a().g(acycVar, a.a());
        this.ae.am();
        this.bE = bvpk.a(new Runnable(this) { // from class: acxr
            private final acyf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                acyf acyfVar = this.a;
                acyo acyoVar = acyfVar.ag;
                if (!acyoVar.b) {
                    acyoVar.b = true;
                    for (Runnable runnable : acyoVar.a) {
                        runnable.run();
                    }
                }
                aefg aefgVar = acyfVar.a;
                if (aefgVar.p) {
                    return;
                }
                aefgVar.p = true;
                for (aeez aeezVar : aefgVar.i.a().values()) {
                    aeezVar.m();
                }
                aeez j = aefgVar.j();
                if (j != null) {
                    cqhn cqhnVar = aefgVar.g;
                    cqkx.p(j);
                }
                aefgVar.e.b();
            }
        });
        this.bF = bvpk.a(new Runnable(this) { // from class: acxs
            private final acyf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ddda dddaVar;
                acyf acyfVar = this.a;
                acyfVar.aE.a().a(acyfVar.az.a());
                acyfVar.aE.a().a(acyfVar.aA.a());
                acyfVar.aE.a().a(acyfVar.aB.a());
                acyfVar.af.a().i(dvum.BASE_MAP, null);
                gcn a2 = acyfVar.aS.a();
                if (gct.a(a2.a.getResources().getConfiguration())) {
                    if (a2.b.a().a()) {
                        dddaVar = ddda.cj;
                    } else {
                        dddaVar = ddda.ck;
                    }
                    cjqy cjqyVar = a2.c;
                    cjsx i2 = cjsy.i();
                    i2.b(dddaVar);
                    cjqyVar.k(i2.a());
                }
            }
        });
        this.ah.k(this.bE, this.g, bvkw.ON_FIRST_TRANSITION_COMPLETE);
        this.ah.k(this.bF, this.g, bvkw.ON_STARTUP_FULLY_COMPLETE);
        final bxxl bxxlVar = this.aP;
        if (bxxlVar.e == null && !bxxlVar.f && bxxlVar.b.getSuggestParameters().t) {
            bxxlVar.c.k(new Runnable(bxxlVar) { // from class: bxxk
                private final bxxl a;

                {
                    this.a = bxxlVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    dehn dehnVar;
                    bxxl bxxlVar2 = this.a;
                    if (!bxxlVar2.f) {
                        final cqkj cqkjVar = bxxlVar2.d;
                        final dcdc m = dcdc.m(new Pair(new hqv(), 1), new Pair(new bxsx(), 1), new Pair(new wfb(), 2), new Pair(new bxsw(), 2), new Pair(new wek(), 1), new Pair(new bxqz(), 1), new Pair(new bxvl(), 7), new Pair(new bxuy(), 1));
                        if (m.isEmpty()) {
                            dehnVar = dehk.a;
                        } else {
                            final deig d = deig.d();
                            final LinearLayout linearLayout = new LinearLayout(cqkjVar.d);
                            new Handler(Looper.getMainLooper()).post(new Runnable(cqkjVar, m, d, linearLayout) { // from class: cqkh
                                private final cqkj a;
                                private final List b;
                                private final deig c;
                                private final LinearLayout d;

                                {
                                    this.a = cqkjVar;
                                    this.b = m;
                                    this.c = d;
                                    this.d = linearLayout;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b(this.b, 0, this.c, this.d);
                                }
                            });
                            dehnVar = d;
                        }
                        bxxlVar2.e = dehnVar;
                    }
                }
            }, bxxlVar.a, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
        this.aQ.b();
        this.aR.f.a();
        long w2 = this.am.w(bvjk.N, 0L);
        aegc h2 = h();
        int a2 = dkty.a(this.al.a().as);
        if (a2 != 0) {
            i = a2;
        }
        if (i == 2) {
            if (h2 != null) {
                h2.h(h2.u());
            }
        } else if (i == 4) {
            if (h2 != null) {
                h2.h(aM());
            }
        } else if (i != 3) {
            int i2 = this.al.a().ad * 1000;
            if (i2 > 0 && this.e.b() - w2 > i2) {
                cjsx i3 = cjsy.i();
                i3.b(ddda.cI);
                this.av.a().k(i3.a());
                if (h2 != null) {
                    h2.h(aS());
                }
                jjf i4 = i();
                if (i4 != null) {
                    i4.h();
                }
            }
        } else if (h2 != null) {
            h2.h(aS());
        }
        if (this.aK.g() && (h = h()) != null && h.c() > aS()) {
            h.h(aS());
        }
        if (this.aq.a()) {
            aQ();
        }
        if ((this.ak.getSuggestParameters().h || this.ak.getSuggestParameters().i) && this.aq.a()) {
            this.aw.a().a(this.ax.a(aeav.SEARCH_ZERO_SUGGEST_ADS, "zero_suggest_ads_prefetch", dcep.B(awvv.E)));
        }
        if (be()) {
            this.aL.a().b(this);
        }
        final gcr a3 = this.aM.a();
        if (a3.b.a().a() && a3.a()) {
            bvqd.a(a3.c.d(new Runnable(a3, this) { // from class: gcq
                private final gcr a;
                private final gft b;

                {
                    this.a = a3;
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gcr gcrVar = this.a;
                    if (!((acyf) this.b).ba) {
                        return;
                    }
                    gcrVar.a.a().i(dvum.DARK_MODE_HOME_SCREEN, null);
                }
            }, 3000L, TimeUnit.MILLISECONDS), a3.c);
        }
        p();
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        Integer c = aP().c();
        if (c != null) {
            bundle.putInt("ue3ActivationId", c.intValue());
        }
        alad aladVar = this.ao.a;
        if (aladVar != null) {
            bundle.putSerializable("previous_camera_position", aladVar);
        }
        for (aebb aebbVar : this.c.a) {
            aebbVar.n(bundle);
        }
        if (this.ba) {
            this.a.c(this.bH);
            aegc h = h();
            Parcelable parcelable = null;
            if (h != null) {
                ddmo d = aefy.d(h, aM());
                ddmo ddmoVar = ddmo.FULL_EXPANSION;
                if (this.b.a().f() == dktk.EXPLORE && d == ddmoVar) {
                    parcelable = this.a.d();
                }
                this.bO = parcelable;
            } else {
                this.bO = null;
            }
        }
        bundle.putSparseParcelableArray("viewHierarchyState", this.bH);
        Parcelable parcelable2 = this.bO;
        if (parcelable2 != null) {
            bundle.putParcelable("exploreTabViewStateKey", parcelable2);
        }
    }

    @Override // defpackage.fd
    public final void u() {
        acyb acybVar;
        if (!this.ba) {
            super.u();
            return;
        }
        this.aq.e();
        bvpk bvpkVar = this.bE;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk bvpkVar2 = this.bF;
        if (bvpkVar2 != null) {
            bvpkVar2.b();
        }
        this.bt.a.remove(this.bU);
        this.ad.a().c(this.bP);
        this.ai.a().i(this.bQ);
        this.b.a().c(this);
        this.b.a().l(this.bS);
        this.b.a().m(this.bR);
        this.b.a().n(this.bT);
        final acyn acynVar = this.au;
        acynVar.a(null, 0);
        acynVar.b(null);
        acynVar.b.b(new ardq(alae.a));
        acynVar.e = false;
        acynVar.f = false;
        acynVar.a.a().k.Pk(new Runnable(acynVar) { // from class: acyl
            private final acyn a;

            {
                this.a = acynVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                acyn acynVar2 = this.a;
                acynVar2.a.a().ae(acynVar2.g);
            }
        }, acynVar.d);
        this.f.a().a(this.bG);
        this.ae.an();
        this.a.c(this.bH);
        aegc h = h();
        if (h != null) {
            bvjj bvjjVar = this.am;
            bvjk bvjkVar = bvjk.M;
            int c = h.c();
            if (c <= h.u()) {
                acybVar = acyb.FULLY_COLLAPSED;
            } else {
                int u = h.u();
                Integer num = this.bn;
                dbsk.s(num);
                if (c <= u + num.intValue()) {
                    acybVar = acyb.MINIMIZED;
                } else {
                    acybVar = acyb.EXPANDED;
                }
            }
            bvjjVar.ai(bvjkVar, acybVar);
            this.bM = h.c();
            this.bO = (this.b.a().f() == dktk.EXPLORE && aefy.d(h, aM()) == ddmo.FULL_EXPANSION) ? this.a.d() : null;
        } else {
            this.bO = null;
        }
        this.bf = false;
        this.ba = false;
        this.bB = false;
        ish a = this.ap.a();
        ahtf ahtfVar = a.e;
        if (ahtfVar != null) {
            ahtfVar.c();
            a.e = null;
        }
        if (a.d == dqkc.PARKING_LOCATION) {
            a.c.a().g();
        } else {
            a.d = null;
        }
        this.am.Z(bvjk.N, this.e.b());
        this.aw.a().e();
        this.aL.a().g();
        super.u();
    }

    public final void aN(btpf btpfVar) {
        boolean z = false;
        if (!btpfVar.e || !btpfVar.f) {
            aegc h = h();
            if (h == null) {
                return;
            }
            int c = h.c();
            if (c != h.o().getHeight() || !this.ae.n().booleanValue()) {
                if (c == h.o().getHeight() || this.ae.n().booleanValue()) {
                    return;
                }
                this.ae.o(true);
                cqkx.p(this.ae);
                if (!this.aK.c()) {
                    return;
                }
                this.aO.a().k(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
                return;
            }
            this.ae.o(false);
            cqkx.p(this.ae);
            if (!this.aK.c()) {
                return;
            }
            this.aO.a().k(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
            return;
        }
        if (!this.ae.n().booleanValue()) {
            this.ae.o(true);
            cqkx.p(this.ae);
        }
        jjf i = i();
        if (i == null) {
            return;
        }
        if (this.aZ && i.a >= i.k()) {
            z = true;
        }
        if (z != this.ae.s().booleanValue()) {
            this.ae.t(z);
            cqkx.p(this.ae);
        }
        if (!this.aZ) {
            return;
        }
        this.ae.r(true != i.f() ? 0.0f : 1.0f);
    }
}
