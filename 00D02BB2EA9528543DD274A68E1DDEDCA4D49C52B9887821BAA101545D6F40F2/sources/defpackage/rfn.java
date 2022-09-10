package defpackage;

import android.app.Dialog;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: rfn  reason: default package */
/* loaded from: classes7.dex */
public class rfn extends qvu implements rej, rcr, zrz, qbp {
    @dzsi
    private final qbo A;
    private final dxio<qbt> B;
    private final dxio<afwp> C;
    private final gun D;
    private final dxio<reu> E;
    private final amvh F;
    private final zce G;
    private final znh H;
    private final dqek I;
    @dzsi
    private final rel J;
    private final wbw K;
    @dzsi
    private final rjz L;
    private final qqw M;
    private final zio N;
    @dzsi
    private amte O;
    private int P;
    private int Q;
    private final jam R;
    public final gga l;
    public final ivf m;
    public final rfl n;
    public final dqvj o;
    public final ziq p;
    public final yzi q;
    dcdc<reh> r;
    public rcq s;
    public dwao t;
    @dzsi
    Dialog u;
    public int v;
    izy w;
    rfm x;
    private final btvo y;
    private final quv z;

    public rfn(gga ggaVar, ivg ivgVar, btvo btvoVar, cqhn cqhnVar, quv quvVar, dxio<ros> dxioVar, dxio<qbt> dxioVar2, isd isdVar, yzi yziVar, dxio<afwp> dxioVar3, dxio<afwt> dxioVar4, gun gunVar, dxio<reu> dxioVar5, ziq ziqVar, zni zniVar, @dzsi wbw wbwVar, dxio<rfp> dxioVar6, dxio<rem> dxioVar7, dzsj<qqz> dzsjVar, dxio<qwx> dxioVar8, acyp acypVar, @dzsi qut qutVar, @dzsi rjz rjzVar, zio zioVar, dcdc<amvh> dcdcVar, dqvj dqvjVar, dwao dwaoVar, @dzsi amte amteVar, long j, rfl rflVar, zce zceVar, @dzsi dqek dqekVar) {
        super(ggaVar, qutVar, dxioVar, dxioVar4, isdVar, dxioVar8, acypVar, btvoVar);
        rel relVar;
        this.v = 0;
        this.P = 0;
        this.Q = 0;
        this.w = new rfi(this);
        this.R = new rfj(this);
        this.x = new rfk(this);
        dbsk.l(dcdcVar.size() == 1);
        dbsk.l(dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER);
        this.l = ggaVar;
        this.m = ivgVar.a(this.w);
        this.y = btvoVar;
        this.z = quvVar;
        this.A = dxioVar2.a().f();
        this.B = dxioVar2;
        this.C = dxioVar3;
        this.D = gunVar;
        this.E = dxioVar5;
        this.L = rjzVar;
        this.p = ziqVar;
        this.F = dcdcVar.get(0);
        this.o = dqvjVar;
        this.t = dwaoVar;
        this.O = amteVar;
        this.n = rflVar;
        this.G = zceVar;
        this.I = dqekVar;
        this.H = zniVar.a(dtxl.bJ, dtxl.bK);
        this.K = wbwVar;
        this.r = K(this.x, amteVar, j, dqekVar, true);
        this.N = zioVar;
        this.q = yziVar;
        zioVar.z(this);
        int i = btvoVar.getCommuteDrivingImmersiveParameters().f;
        int a = dkhy.a(btvoVar.getCommuteDrivingImmersiveParameters().c);
        a = a == 0 ? 1 : a;
        if (a != 3 && a != 4) {
            int a2 = dkhy.a(btvoVar.getCommuteDrivingImmersiveParameters().e);
            a2 = a2 == 0 ? 1 : a2;
            if (a2 != 3 && a2 != 4) {
                relVar = null;
                this.J = relVar;
                this.M = dzsjVar.a();
                this.s = rcq.LOADING;
            }
        }
        rem a3 = dxioVar7.a();
        gga a4 = a3.a.a();
        rem.a(a4, 1);
        btvo a5 = a3.b.a();
        rem.a(a5, 2);
        cjqq a6 = a3.c.a();
        rem.a(a6, 3);
        relVar = new rel(a4, a5, a6);
        this.J = relVar;
        this.M = dzsjVar.a();
        this.s = rcq.LOADING;
    }

    public static boolean B(dqvj dqvjVar, dwao dwaoVar) {
        return zri.n(dqvjVar, dwaoVar, null);
    }

    private final void I(rcq rcqVar) {
        if (rcqVar != rcq.LOADING || e().booleanValue()) {
            this.G.h();
        } else {
            this.G.d(90000L);
        }
    }

    private final void J(amte amteVar, Long l) {
        this.H.a(new rfg(this, amteVar, l));
    }

    private final dcdc<reh> K(rfm rfmVar, amte amteVar, long j, dqek dqekVar, boolean z) {
        dcdc<dbsg<wcn>> r;
        if (amteVar == null || amteVar.a.n() == 0) {
            return dcdc.e();
        }
        int L = L(amteVar);
        if (this.v >= L) {
            this.v = 0;
        }
        wbw wbwVar = this.K;
        if (wbwVar == null) {
            r = dcdc.r(Collections.nCopies(L, dbpy.a));
        } else {
            r = wbwVar.d(amteVar, z, new rfc(this));
        }
        dcdc<dbsg<wcn>> dcdcVar = r;
        dccx F = dcdc.F();
        int i = 0;
        while (i < L) {
            F.g(this.E.a().a(amteVar, i, rfmVar, i == this.v, B(this.o, this.t), j, dqekVar, dcdcVar.get(i)));
            i++;
        }
        return F.f();
    }

    private static int L(amte amteVar) {
        return Math.min(amteVar.a.n(), 2);
    }

    private final dccx<jho> M() {
        qup l;
        dccx<jho> F = dcdc.F();
        jhm jhmVar = new jhm();
        jhmVar.a = this.l.getString(R.string.COMMUTE_IMMERSIVE_ROUTE_OPTIONS);
        jhmVar.f = cjtd.a(dtxl.bI);
        jhmVar.d(new View.OnClickListener(this) { // from class: rfd
            private final rfn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rfn rfnVar = this.a;
                rfnVar.u = rfnVar.p.a(rfnVar.o, rfnVar.t, rfnVar);
            }
        });
        F.g(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.a = this.l.getString(R.string.COMMUTE_HUB_CREATE_SHORTCUT_OVERFLOW_BUTTON);
        jhmVar2.f = cjtd.a(dtxl.aT);
        jhmVar2.d(new View.OnClickListener(this) { // from class: rfe
            private final rfn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q.b();
            }
        });
        F.g(jhmVar2.c());
        qut qutVar = this.d;
        if (qutVar != null && qutVar.o() && (l = this.d.l()) != null && l.b() == domy.DRIVE) {
            jhm jhmVar3 = new jhm();
            jhmVar3.a = this.l.getString(R.string.COMMUTE_HUB_VIEW_TRANSIT);
            jhmVar3.f = cjtd.a(dtxl.bO);
            jhmVar3.d(new View.OnClickListener(this) { // from class: rff
                private final rfn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d.j(domy.TRANSIT);
                }
            });
            F.g(jhmVar3.c());
        }
        return F;
    }

    public cqkl A() {
        this.B.a().m(H());
        return cqkl.a;
    }

    public void C(int i) {
        this.P = i;
        cqkx.p(this);
    }

    public void D(int i) {
        this.Q = i;
        cqkx.p(this);
    }

    public void E() {
        amte amteVar = this.O;
        if (amteVar == null) {
            return;
        }
        int L = L(amteVar);
        List<amub> a = this.O.a(this.l);
        if (this.A == null || a.isEmpty() || a.size() < L) {
            return;
        }
        amuh f = amuh.f(this.v, a.subList(0, L));
        qbo qboVar = this.A;
        vut I = vuv.I();
        I.A(f);
        I.o(f.k().ag());
        I.H(albo.a);
        I.E(true);
        I.F(true);
        I.x(true);
        I.v(false);
        I.Q(alfa.SHOW_NONE);
        I.D(true);
        qboVar.e(I.O());
    }

    @dzsi
    public View F() {
        return this.C.a().e();
    }

    @dzsi
    public View G() {
        return this.C.a().i();
    }

    public qcz H() {
        qcw x = qcx.x();
        x.k(qbs.DEFAULT);
        x.s(this.o);
        x.r(amvh.i(this.l));
        x.u(this.F);
        x.w(this.t);
        return x.a();
    }

    @Override // defpackage.jbk
    public jib NC() {
        dccx<jho> M = M();
        jhm jhmVar = new jhm();
        jhmVar.a = this.l.getString(R.string.COMMUTE_IMMERSIVE_MORE_OPTIONS);
        jhmVar.f = cjtd.a(dtxl.bv);
        jhmVar.d(new View.OnClickListener(this) { // from class: rfb
            private final rfn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A();
            }
        });
        M.g(jhmVar.c());
        return reo.a(this.l, this.F, M.f(), !B(this.o, this.t));
    }

    @Override // defpackage.qvu
    protected final List<jho> b() {
        return M().f();
    }

    @Override // defpackage.qvu
    protected final qvt c() {
        rcq rcqVar = rcq.LOADING;
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = this.F.b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return qvt.b(this.l);
            }
            return qvt.c(this.l, this.F.q(false));
        }
        return qvt.a(this.l);
    }

    @Override // defpackage.rej
    public rcq d() {
        return this.s;
    }

    @Override // defpackage.rej
    public Boolean e() {
        dcdc<reh> dcdcVar = this.r;
        boolean z = false;
        if (dcdcVar != null && !dcdcVar.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.rej
    public String f() {
        return this.l.getString(R.string.COMMUTE_IMMERSIVE_DRIVING_HEADER);
    }

    @Override // defpackage.rej
    public Integer g() {
        return Integer.valueOf(this.P);
    }

    @Override // defpackage.qbp
    public void h(dwao dwaoVar, @dzsi dnqh dnqhVar) {
        w(dwaoVar);
    }

    @Override // defpackage.rej
    public Integer i() {
        return Integer.valueOf(this.Q);
    }

    @Override // defpackage.rej
    public List<reh> j() {
        return dcdc.r(this.r);
    }

    @Override // defpackage.rej
    public jam k() {
        return this.R;
    }

    @Override // defpackage.rej
    public cqkl l() {
        this.D.a(dtxl.bt, dtxl.bu, dtxl.br, dtxl.bs, new rfh(this)).a();
        return cqkl.a;
    }

    @Override // defpackage.rej
    public zbs m() {
        return this.N;
    }

    @Override // defpackage.rej
    public zce n() {
        return this.G;
    }

    @Override // defpackage.rej
    @dzsi
    public reg o() {
        rel relVar = this.J;
        if (relVar == null || !relVar.a().booleanValue()) {
            return null;
        }
        return this.J;
    }

    @Override // defpackage.rej
    public qqw p() {
        return this.M;
    }

    @Override // defpackage.rej
    @dzsi
    public rjz q() {
        return this.L;
    }

    @Override // defpackage.rej
    @dzsi
    public qvm r() {
        return null;
    }

    public void s() {
        this.w.c();
        this.H.c();
    }

    public void t() {
        this.w.d();
        this.H.b();
    }

    public final void v(amte amteVar, Long l) {
        this.O = amteVar;
        this.r = K(this.x, amteVar, l.longValue(), this.I, false);
        E();
        cqkx.p(this);
    }

    @Override // defpackage.zrz
    public void w(dwao dwaoVar) {
        Dialog dialog = this.u;
        if (dialog != null && dialog.isShowing()) {
            this.u.dismiss();
        }
        this.t = dwaoVar;
        rfl rflVar = this.n;
        bvrj.UI_THREAD.c();
        rci rciVar = (rci) rflVar;
        if (!dwaoVar.equals(rciVar.aA)) {
            rciVar.aA = dwaoVar;
            rciVar.ax.a(rciVar.aA);
        }
        this.N.B(B(this.o, dwaoVar), this.o, dwaoVar, douz.g, yiv.e, null, null, false, false);
        cqkx.p(this);
    }

    @Override // defpackage.zrz
    public void x() {
        Dialog dialog = this.u;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.u.dismiss();
    }

    public void y() {
        qbo qboVar = this.A;
        if (qboVar != null) {
            qboVar.f();
        }
    }

    public void z(int i) {
        this.x.a(i);
    }

    public void u(rcq rcqVar, @dzsi amte amteVar, @dzsi Long l, boolean z) {
        if (this.s != rcqVar || amteVar != null) {
            this.s = rcqVar;
            boolean z2 = rcqVar == rcq.LOADING;
            dcdc<reh> dcdcVar = this.r;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dcdcVar.get(i).d(z2);
            }
            if (rcqVar == rcq.SUCCESS) {
                this.z.b(quu.DRIVING);
                dbsk.s(amteVar);
                rel relVar = this.J;
                if (relVar != null) {
                    relVar.h(amteVar);
                }
                amte amteVar2 = this.O;
                if (amteVar2 == null || !amteVar2.a.d() || amteVar.a.d()) {
                    v(amteVar, l);
                } else {
                    amte amteVar3 = this.O;
                    dbsk.s(amteVar3);
                    amub b = amteVar3.b(0, this.l);
                    List<amub> a = amteVar.a(this.l);
                    dbsk.s(b);
                    int c = vxm.c(b, a);
                    if (c == 0) {
                        v(amteVar, l);
                    } else if (c > 0) {
                        if (z) {
                            J(amteVar, l);
                        } else {
                            v(amteVar, l);
                        }
                    } else if (c == -1) {
                        J(amteVar, l);
                    }
                }
            } else if (amteVar != null) {
                cqkx.p(this);
            } else {
                this.O = null;
                this.r = dcdc.e();
                qbo qboVar = this.A;
                if (qboVar != null) {
                    qboVar.h();
                }
                cqkx.p(this);
            }
            I(rcqVar);
            return;
        }
        I(rcqVar);
    }
}
