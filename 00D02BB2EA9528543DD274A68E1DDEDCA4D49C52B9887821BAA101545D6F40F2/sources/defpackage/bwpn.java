package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwpn  reason: default package */
/* loaded from: classes4.dex */
public class bwpn implements bwob {
    private final Application A;
    private final cqat B;
    private final btvo C;
    private final eeu D;
    private final dzsj<qbt> E;
    private final akfa F;
    private final btpc G;
    private final bvsl H;
    private final ahjq I;
    private final bvjj J;
    private final ckcw K;
    private final Executor L;
    private final Executor M;
    private final dxio<bwpz> N;
    private final dxio<vpd> O;
    private final dxio<vrg> P;
    private final dxio<vri> Q;
    private final dxio<vrc> R;
    private final dxio<vrp> S;
    private final qeg U;
    @dzsi
    private bwpz W;
    protected final bwnj a;
    @dzsi
    public cjyo c;
    @dzsi
    public oxf e;
    public final akfc h;
    public final dzsj<glj> i;
    public final crzo<Boolean> j;
    @dzsi
    private bwoa n;
    @dzsi
    private final bwol p;
    @dzsi
    private final avic r;
    @dzsi
    private final bwom s;
    @dzsi
    private vqv t;
    @dzsi
    private vqw u;
    @dzsi
    private vqw v;
    @dzsi
    private vqw w;
    private final ff z;
    @dzsi
    public Runnable b = null;
    public boolean d = false;
    @dzsi
    private bttq l = null;
    @dzsi
    private bwoc m = null;
    @dzsi
    public bwog f = null;
    @dzsi
    private iwx o = null;
    @dzsi
    private bwok q = null;
    private boolean x = false;
    public boolean g = true;
    private int y = 0;
    private final cqqw V = new bwpi(this);
    private final oxg k = new bwpm(this);

    public bwpn(bwnj bwnjVar, final ff ffVar, final eeu eeuVar, Application application, final cqat cqatVar, ckcw ckcwVar, btvo btvoVar, btpc btpcVar, bvsl bvslVar, ahjq ahjqVar, akfc akfcVar, bypr byprVar, dzsj<glj> dzsjVar, dxio<avij> dxioVar, final Executor executor, Executor executor2, dzsj<qbt> dzsjVar2, akfa akfaVar, final dzsj<awre> dzsjVar3, final awti awtiVar, bvjj bvjjVar, final awtj awtjVar, bwpa bwpaVar, bwow bwowVar, dxio<bwpz> dxioVar2, dxio<vpd> dxioVar3, dxio<vrg> dxioVar4, qeg qegVar, dxio<vrc> dxioVar5, dxio<vrp> dxioVar6, dxio<vri> dxioVar7, dxio<bwqg> dxioVar8, cqhn cqhnVar) {
        dcdc<bwop> dcdcVar;
        bwou bwouVar;
        dtjt F;
        this.n = null;
        this.z = ffVar;
        this.A = application;
        this.B = cqatVar;
        this.C = btvoVar;
        this.G = btpcVar;
        this.h = akfcVar;
        this.D = eeuVar;
        this.E = dzsjVar2;
        this.F = akfaVar;
        this.H = bvslVar;
        this.I = ahjqVar;
        this.J = bvjjVar;
        this.a = bwnjVar;
        this.i = dzsjVar;
        this.K = ckcwVar;
        this.L = executor;
        this.M = executor2;
        this.N = dxioVar2;
        this.O = dxioVar3;
        this.P = dxioVar4;
        this.U = qegVar;
        this.Q = dxioVar7;
        this.R = dxioVar5;
        this.S = dxioVar6;
        this.s = new bwqh(qegVar, H(ffVar.getIntent()));
        if (bwnjVar.b() == dtja.FREE_NAV_DESTINATIONS) {
            dcdcVar = bwov.e(ffVar, bwov.d);
            bwouVar = bwou.FREE_NAV;
        } else if (!bwnjVar.h() || (F = bwnjVar.F()) == null) {
            dcdcVar = null;
            bwouVar = null;
        } else {
            dtjv dtjvVar = F.b;
            dqvj c = dqvj.c((dtjvVar == null ? dtjv.d : dtjvVar).b);
            c = c == null ? dqvj.DRIVE : c;
            dups enrouteParameters = btvoVar.getEnrouteParameters();
            dcdc<brcl> a = brcm.a(c == dqvj.BICYCLE ? enrouteParameters.g : c == dqvj.WALK ? enrouteParameters.f : enrouteParameters.e);
            dccx F2 = dcdc.F();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                brcl brclVar = a.get(i);
                F2.g(new bwop(((cqsh) brclVar.b).a.toString(), brclVar.a, brclVar.e, brclVar.c, dtyb.au));
            }
            dcdcVar = F2.f();
            bwouVar = bwou.IN_NAV;
        }
        if (bwouVar != null && dcdcVar != null) {
            bwow.a(bwouVar, 1);
            eeu a2 = bwowVar.a.a();
            bwow.a(a2, 2);
            Activity activity = (Activity) ((dxjd) bwowVar.b).a;
            bwow.a(activity, 3);
            dzsj<glj> dzsjVar4 = bwowVar.c;
            dzsj<brba> dzsjVar5 = bwowVar.d;
            dzsj<ascb> dzsjVar6 = bwowVar.e;
            bwow.a(dcdcVar, 7);
            this.n = new bwov(bwouVar, a2, activity, dzsjVar4, dzsjVar5, dzsjVar6, dcdcVar);
        }
        if ((bwoz.b(bwnjVar) || (bwnjVar.d() && (bwnjVar.b() == dtja.SEARCH || bwnjVar.b() == dtja.DIRECTIONS_DRIVING || bwnjVar.b() == dtja.FREE_NAV_DESTINATIONS))) && dxioVar.a() != null) {
            this.r = bwpaVar.a(bwnjVar, new bwoy(this, executor) { // from class: bwpb
                private final bwpn a;
                private final Executor b;

                {
                    this.a = this;
                    this.b = executor;
                }

                @Override // defpackage.bwoy
                public final void a() {
                    final bwpn bwpnVar = this.a;
                    this.b.execute(new Runnable(bwpnVar) { // from class: bwph
                        private final bwpn a;

                        {
                            this.a = bwpnVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    });
                }
            });
        } else {
            this.r = null;
        }
        dkql dkqlVar = btvoVar.getNotificationsParameters().j;
        if (byprVar.a(dkqlVar == null ? dkql.k : dkqlVar)) {
            bwqg a3 = dxioVar8.a();
            dzsj<byej> dzsjVar7 = a3.a;
            Context a4 = a3.b.a();
            bwqg.a(a4, 2);
            this.p = new bwqf(dzsjVar7, a4);
        } else {
            this.p = null;
        }
        if (bwnjVar.d() && bwnjVar.b() == dtja.SEARCH) {
            awtiVar.b().Pk(new Runnable(this, awtiVar, ffVar, eeuVar, cqatVar, dzsjVar3, awtjVar) { // from class: bwpc
                private final bwpn a;
                private final awti b;
                private final ff c;
                private final eeu d;
                private final cqat e;
                private final dzsj f;
                private final awtj g;

                {
                    this.a = this;
                    this.b = awtiVar;
                    this.c = ffVar;
                    this.d = eeuVar;
                    this.e = cqatVar;
                    this.f = dzsjVar3;
                    this.g = awtjVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bwpn bwpnVar = this.a;
                    awti awtiVar2 = this.b;
                    ff ffVar2 = this.c;
                    eeu eeuVar2 = this.d;
                    cqat cqatVar2 = this.e;
                    dzsj dzsjVar8 = this.f;
                    awtj awtjVar2 = this.g;
                    awtn f = awtiVar2.f();
                    if (f != null) {
                        bwpnVar.f = new bwpw(ffVar2, eeuVar2, cqatVar2, f, (awre) dzsjVar8.a(), awtjVar2);
                    }
                }
            }, executor);
        }
        this.j = new crzo<>(Boolean.valueOf(this.g));
    }

    public static int E(bttq bttqVar) {
        int ordinal = bttqVar.ordinal();
        return ordinal != 7 ? ordinal != 9 ? R.string.DATA_REQUEST_ERROR_TITLE : R.string.DATA_REQUEST_ERROR_GAIA : R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_TITLE;
    }

    public static int F(bttq bttqVar) {
        int ordinal = bttqVar.ordinal();
        if (ordinal != 7) {
            if (ordinal == 9) {
                return -1;
            }
            return R.string.DATA_REQUEST_ERROR_SUBTITLE;
        }
        return R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_SUBTITLE;
    }

    private final Boolean G(vpc vpcVar) {
        boolean z = false;
        if (this.a.b() == dtja.DIRECTIONS_DRIVING && this.a.d() && this.O.a().c(vpcVar) && !this.J.m(bvjk.is, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static boolean H(Intent intent) {
        return intent.getBooleanExtra("LOOK_BEFORE_YOU_LEAVE_PROMO", false);
    }

    public void A(cjyo cjyoVar) {
        this.c = cjyoVar;
    }

    public crzm<Boolean> B() {
        return this.j.a;
    }

    public void C(int i) {
        this.y = i;
        cqkx.p(this);
    }

    public void D(List<nxn> list) {
        for (nxn nxnVar : list) {
            if (nxnVar.c.b == 1) {
                if (this.W == null) {
                    this.W = this.N.a();
                }
                bwpz bwpzVar = this.W;
                dbsk.s(bwpzVar);
                bwpzVar.d(nxnVar, nxnVar.a(this.a.R()));
            }
        }
    }

    @Override // defpackage.bwob
    public oxg a() {
        return this.k;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwog b() {
        return this.f;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwoc c() {
        return this.m;
    }

    @Override // defpackage.bwob
    @dzsi
    public jbf d() {
        return this.o;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwok e() {
        if (!this.a.H()) {
            return null;
        }
        return this.q;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwoa f() {
        return this.n;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwoh g() {
        return this.W;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwoe h() {
        avic avicVar = this.r;
        if (avicVar == null) {
            return null;
        }
        return ((bwoz) avicVar).b;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwof i() {
        avic avicVar = this.r;
        return null;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwol j() {
        if (!this.a.d() || this.a.b() != dtja.DIRECTIONS_DRIVING || !this.G.i()) {
            return null;
        }
        return this.p;
    }

    @Override // defpackage.bwob
    @dzsi
    public bwom k() {
        if (this.a.b() != dtja.DIRECTIONS_TWO_WHEELER || !this.a.d() || !this.U.c()) {
            return null;
        }
        if (!H(this.z.getIntent()) && this.J.m(bvjk.hX, false)) {
            return null;
        }
        return this.s;
    }

    @Override // defpackage.bwob
    @dzsi
    public vqv l() {
        if (G(vpc.JAKARTA).booleanValue()) {
            if (this.t == null) {
                vrg a = this.P.a();
                Runnable runnable = new Runnable(this) { // from class: bwpd
                    private final bwpn a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkx.p(this.a);
                    }
                };
                cqhn a2 = a.a.a();
                vrg.a(a2, 1);
                cklf a3 = a.b.a();
                vrg.a(a3, 2);
                vpd a4 = a.c.a();
                vrg.a(a4, 3);
                btrm a5 = a.d.a();
                vrg.a(a5, 4);
                this.t = new vrf(a2, a3, a4, a5, runnable, false);
            }
            return this.t;
        }
        return null;
    }

    @Override // defpackage.bwob
    @dzsi
    public vqw m() {
        if (G(vpc.SAO_PAULO).booleanValue()) {
            if (this.u == null) {
                vri a = this.Q.a();
                Runnable runnable = new Runnable(this) { // from class: bwpe
                    private final bwpn a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkx.p(this.a);
                    }
                };
                cklf a2 = a.a.a();
                vri.a(a2, 1);
                vpd a3 = a.b.a();
                vri.a(a3, 2);
                btrm a4 = a.c.a();
                vri.a(a4, 3);
                vrk a5 = a.d.a();
                vri.a(a5, 4);
                gga a6 = a.e.a();
                vri.a(a6, 5);
                dxio a7 = ((dxjh) a.f).a();
                vri.a(a7, 6);
                this.u = new vrh(a2, a3, a4, a5, a6, a7, runnable);
            }
            return this.u;
        }
        return null;
    }

    @Override // defpackage.bwob
    @dzsi
    public vqw n() {
        if (G(vpc.MANILA).booleanValue()) {
            if (this.v == null) {
                vrc a = this.R.a();
                Runnable runnable = new Runnable(this) { // from class: bwpf
                    private final bwpn a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkx.p(this.a);
                    }
                };
                cklf a2 = a.a.a();
                vrc.a(a2, 1);
                vpd a3 = a.b.a();
                vrc.a(a3, 2);
                btrm a4 = a.c.a();
                vrc.a(a4, 3);
                vre a5 = a.d.a();
                vrc.a(a5, 4);
                gga a6 = a.e.a();
                vrc.a(a6, 5);
                dxio a7 = ((dxjh) a.f).a();
                vrc.a(a7, 6);
                this.v = new vrb(a2, a3, a4, a5, a6, a7, runnable);
            }
            return this.v;
        }
        return null;
    }

    @Override // defpackage.bwob
    @dzsi
    public vqw o() {
        if (G(vpc.SANTIAGO).booleanValue()) {
            if (this.w == null) {
                vrp a = this.S.a();
                Runnable runnable = new Runnable(this) { // from class: bwpg
                    private final bwpn a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkx.p(this.a);
                    }
                };
                cklf a2 = a.a.a();
                vrp.a(a2, 1);
                vpd a3 = a.b.a();
                vrp.a(a3, 2);
                btrm a4 = a.c.a();
                vrp.a(a4, 3);
                vrr a5 = a.d.a();
                vrp.a(a5, 4);
                gga a6 = a.e.a();
                vrp.a(a6, 5);
                dxio a7 = ((dxjh) a.f).a();
                vrp.a(a7, 6);
                this.w = new vro(a2, a3, a4, a5, a6, a7, runnable);
            }
            return this.w;
        }
        return null;
    }

    @Override // defpackage.bwob
    public Boolean p() {
        return Boolean.valueOf(this.x);
    }

    @Override // defpackage.bwob
    public void q(Boolean bool) {
        this.x = bool.booleanValue();
    }

    @Override // defpackage.bwob
    public cqqw r() {
        return this.V;
    }

    @Override // defpackage.bwob
    public Boolean s() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bwob
    public Boolean t() {
        return Boolean.valueOf(this.a.i());
    }

    @Override // defpackage.bwob
    public Integer u() {
        return Integer.valueOf(this.y);
    }

    public void v(boolean z) {
        this.d = z;
    }

    public void w(Runnable runnable) {
        this.b = runnable;
    }

    public void x(@dzsi oxf oxfVar) {
        this.e = oxfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
        if (defpackage.vze.c(r10) == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(@defpackage.dzsi defpackage.bttq r23) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwpn.y(bttq):void");
    }

    public void z(List<dtmr> list, bwnm bwnmVar) {
        String str;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                str = null;
                break;
            }
            dtmr dtmrVar = list.get(size);
            if ((dtmrVar.a & 2048) != 0) {
                str = dtmrVar.m;
                break;
            }
        }
        if (str != null) {
            this.a.w(str);
        }
    }
}
