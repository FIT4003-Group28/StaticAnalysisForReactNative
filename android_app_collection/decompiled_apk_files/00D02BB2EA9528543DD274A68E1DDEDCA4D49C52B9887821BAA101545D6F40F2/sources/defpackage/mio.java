package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.filament.R;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mio  reason: default package */
/* loaded from: classes7.dex */
public final class mio extends nor {
    public static final dcqe a = dcqe.c("mio");
    @dzsi
    public ckcq A;
    @dzsi
    public btlu B;
    @dzsi
    public ldm C;
    public boolean D;
    public final Runnable E;
    final ksu F;
    final ksu G;
    final mpt H;
    public final mwp I;
    @dzsi
    private final aryr J;
    private final kcw K;
    private final cjqy L;
    private final hwe M;
    private final lzf N;
    private final ncm O;
    private final ckcw P;
    private final mir Q;
    private final cjsz R;
    private final cqkf<mox> S;
    @dzsi
    private CardView T;
    private final cqkf<mpd> U;
    private final mqe V;
    private final kdk W;
    private final boolean X;
    private final boolean Y;
    private final btrm Z;
    private final akfa aa;
    private final ckco ab;
    @dzsi
    private ckcq ac;
    private final crzp<btlu> ad;
    @dzsi
    private kxs ae;
    private boolean af;
    private final min ag;
    private final lze ah;
    private final kqn ai;
    private final lzd aj;
    private final lzd ak;
    private final kso al;
    private final mog am;
    private final jty an;
    public final bvsl b;
    public final nov c;
    public final ksi d;
    public final ksr e;
    @dzsi
    public final vup f;
    public final bvnx g;
    public final cqkj h;
    public final not i;
    public final akox j;
    public final kxu k;
    public final kdi l;
    public final nop m;
    public final asmp n;
    final mor o;
    public final Handler p;
    public final ncf q;
    public final dcdc<ldm> r;
    public final ldm s;
    public final mpu t;
    @dzsi
    public View u;
    @dzsi
    public View v;
    @dzsi
    public View w;
    public final mnz x;
    public final boolean y;
    public final dehq z;

    public mio(cqhn cqhnVar, bvsl bvslVar, nov novVar, ksh kshVar, ksi ksiVar, qbo qboVar, ksr ksrVar, kcw kcwVar, bvnx bvnxVar, cqkj cqkjVar, not notVar, akox akoxVar, hwe hweVar, kxu kxuVar, lzf lzfVar, jty jtyVar, kdi kdiVar, nop nopVar, ncm ncmVar, cjqy cjqyVar, cjqq cjqqVar, ckcw ckcwVar, asmp asmpVar, ldm ldmVar, ncf ncfVar, dcdc dcdcVar, vup vupVar, aryr aryrVar, kdk kdkVar, mnz mnzVar, boolean z, boolean z2, mwp mwpVar, boolean z3, cjsz cjszVar, btrm btrmVar, axxb axxbVar, axwi axwiVar, akfa akfaVar, dehq dehqVar, mpv mpvVar) {
        super(cjqyVar, cjqqVar);
        cqtd I;
        dcdc f;
        this.ad = new mid(this);
        this.af = false;
        this.ag = new min(this);
        mie mieVar = new mie(this);
        this.ah = mieVar;
        this.ai = new mif(this);
        this.E = new mig(this);
        mih mihVar = new mih(this);
        this.F = mihVar;
        this.G = new mii(this);
        mik mikVar = new mik(this);
        this.H = mikVar;
        this.aj = new mil(this);
        this.ak = new mim(this);
        this.al = new mib(this);
        mic micVar = new mic(this);
        this.am = micVar;
        this.b = bvslVar;
        this.c = novVar;
        this.d = ksiVar;
        this.e = ksrVar;
        this.K = kcwVar;
        this.g = bvnxVar;
        this.L = cjqyVar;
        this.h = cqkjVar;
        this.i = notVar;
        this.j = akoxVar;
        this.M = hweVar;
        this.k = kxuVar;
        dbsk.s(lzfVar);
        this.N = lzfVar;
        dbsk.s(jtyVar);
        this.an = jtyVar;
        dbsk.s(kdiVar);
        this.l = kdiVar;
        this.m = nopVar;
        this.O = ncmVar;
        dbsk.s(ckcwVar);
        this.P = ckcwVar;
        dbsk.s(asmpVar);
        this.n = asmpVar;
        this.f = vupVar;
        this.J = aryrVar;
        dbsk.s(ldmVar);
        this.s = ldmVar;
        dbsk.s(ncfVar);
        this.q = ncfVar;
        dbsk.s(dcdcVar);
        this.r = dcdcVar;
        this.W = kdkVar;
        this.x = mnzVar;
        this.y = z;
        this.Y = z2;
        dbsk.s(mwpVar);
        this.I = mwpVar;
        dbsk.s(akfaVar);
        this.aa = akfaVar;
        dbsk.s(dehqVar);
        this.z = dehqVar;
        this.R = cjszVar != null ? cjszVar : new cjsz(dtxm.cN);
        dbsk.s(btrmVar);
        this.Z = btrmVar;
        this.p = new Handler(Looper.getMainLooper());
        mnzVar.name();
        boolean z4 = !dcdcVar.isEmpty();
        this.X = z4;
        if (z4) {
            I = nqu.J();
        } else {
            I = nqu.I();
        }
        cqtd cqtdVar = I;
        if (!z4) {
            f = dcdc.f(ldmVar);
        } else {
            dccx G = dcdc.G(dcdcVar.size() + 1);
            G.g(ldmVar);
            G.i(dcdcVar);
            f = G.f();
        }
        dcdc dcdcVar2 = f;
        mof mofVar = new mof();
        this.Q = mofVar;
        mor morVar = new mor(qboVar, lzfVar, ksrVar, dcdcVar2, new lzc(mnzVar), ncfVar, mieVar, mihVar, micVar, kdkVar, false, cqtdVar, 0, new Runnable(this) { // from class: mhv
            private final mio a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final mio mioVar = this.a;
                mioVar.z.execute(new Runnable(mioVar) { // from class: mia
                    private final mio a;

                    {
                        this.a = mioVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        mio mioVar2 = this.a;
                        mioVar2.c.a();
                        mioVar2.m.b();
                        mioVar2.I.a(mioVar2.s, mioVar2.r, mioVar2.i);
                        mioVar2.c.b();
                    }
                });
            }
        }, z3, mofVar);
        this.o = morVar;
        boolean g = nopVar.g();
        cqat a2 = mpvVar.a.a();
        mpv.a(a2, 1);
        mpv.a(ldmVar, 2);
        mpv.a(cqkjVar, 3);
        mpv.a(mikVar, 4);
        mpv.a(kshVar, 5);
        mpv.a(morVar, 6);
        npo a3 = mpvVar.b.a();
        mpv.a(a3, 8);
        mpv.a(nopVar, 9);
        mpv.a(kdiVar, 10);
        mpv.a(cqhnVar, 13);
        bvrb a4 = mpvVar.c.a();
        mpv.a(a4, 14);
        akfa a5 = mpvVar.d.a();
        mpv.a(a5, 15);
        mpv.a(kdkVar, 17);
        btvo a6 = mpvVar.e.a();
        mpv.a(a6, 18);
        this.t = new mpu(a2, ldmVar, cqkjVar, mikVar, kshVar, morVar, z2, a3, nopVar, kdiVar, axxbVar, axwiVar, cqhnVar, a4, a5, g, kdkVar, a6);
        this.U = cqkjVar.d(new mnw(), notVar.a(), false);
        this.V = new mqe(cqkjVar.d, ldmVar.d);
        this.S = cqkjVar.d(new mkr(z2), notVar.a(), false);
        this.ab = (ckco) ckcwVar.a(ckee.aA);
    }

    private final void p() {
        akqi akqiVar;
        akqq akqqVar;
        if (!this.D) {
            return;
        }
        ldm ldmVar = this.s;
        ilo iloVar = ldmVar.d;
        amte l = ldmVar.l();
        if (iloVar == null || iloVar.aj() == null) {
            amvh f = l != null ? l.f() : this.s.h;
            akqq akqqVar2 = f.e;
            akqiVar = f.d;
            akqqVar = akqqVar2;
        } else {
            akqqVar = iloVar.aj();
            akqiVar = iloVar.ai();
        }
        if (akqqVar == null) {
            return;
        }
        this.M.a(akqiVar, akra.f(akqqVar));
    }

    private final int q() {
        ldm ldmVar = this.s;
        ilo iloVar = ldmVar.d;
        qbm qbmVar = ldmVar.f;
        if (iloVar == null || qbmVar == null || qbmVar.i().size() < 2) {
            return 5;
        }
        return iloVar.ad() == null ? qbmVar.i().get(1).G() == null ? 1 : 3 : qbmVar.i().get(1).G() == null ? 4 : 2;
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        int i = this.x.x;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append(str);
        sb.append("entryPoint: ");
        sb.append(i);
        printWriter.println(sb.toString());
        String name = this.W.name();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(name).length());
        sb2.append(str);
        sb2.append("directionsCompleteAction: ");
        sb2.append(name);
        printWriter.println(sb2.toString());
        if (this.W == kdk.NAVIGATE_IF_NOT_EV_CHARGING_STATION) {
            int q = q();
            String str2 = q != 1 ? q != 2 ? q != 3 ? q != 4 ? "NOT_APPLICABLE" : "NOT_EQUAL_WAYPOINT_EV_INFO_IS_NULL" : "NOT_EQUAL_PLACEMARK_EV_INFO_IS_NULL" : "EQUAL_EVINFO_NOT_NULL" : "EQUAL_EVINFO_NULL";
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 21 + str2.length());
            sb3.append(str);
            sb3.append("evInfoCompareResult: ");
            sb3.append(str2);
            printWriter.println(sb3.toString());
        }
        printWriter.println(String.valueOf(str).concat("PlaceDetailsStateManager"));
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        ckhg ckhgVar;
        this.A = ((ckcr) this.P.a(ckee.ae)).a();
        ckcw ckcwVar = this.P;
        kdk kdkVar = kdk.NOTHING;
        int ordinal = this.W.ordinal();
        boolean z = true;
        if (ordinal != 1 && (ordinal != 2 || this.s.t())) {
            ckhgVar = ckee.ah;
        } else {
            ckhgVar = ckee.ag;
        }
        this.ac = ((ckcr) ckcwVar.a(ckhgVar)).a();
        this.e.a();
        this.U.e(this.V);
        this.S.e(this.t);
        CardView cardView = (CardView) this.S.c().findViewById(nrk.a);
        this.T = cardView;
        if (this.Y) {
            nsr nsrVar = (nsr) cardView.findViewById(mkr.c);
            View findViewById = nsrVar.findViewById(mkr.d);
            dbsk.s(findViewById);
            this.u = findViewById;
            View findViewById2 = nsrVar.findViewById(mkr.e);
            dbsk.s(findViewById2);
            this.v = findViewById2;
            final View findViewById3 = nsrVar.findViewById(mkr.f);
            dbsk.s(findViewById3);
            this.w = findViewById3;
            nsrVar.a.add(Pair.create(findViewById3, findViewById));
            ((nti) nsrVar.findViewById(mlp.b)).setOnScrollBarVisibilityChangeListener(new nth(this, findViewById3) { // from class: mhw
                private final mio a;
                private final View b;

                {
                    this.a = this;
                    this.b = findViewById3;
                }

                @Override // defpackage.nth
                public final void a(boolean z2) {
                    this.b.setElevation(z2 ? this.a.d.a(cqrp.d(16.0d)) : 0.0f);
                }
            });
        }
        View c = this.S.c();
        kxn k = kxo.k();
        k.k();
        this.ae = new kxs(c, k, this.k);
        dbsk.l(!((mof) this.Q).a);
        this.N.h(this.aj);
        ncm ncmVar = this.O;
        ldm ldmVar = this.s;
        ksu ksuVar = this.G;
        if (this.x != mnz.MAP_INTERACTION_POI && this.x != mnz.MAP_INTERACTION_DROPPED_PIN) {
            z = false;
        }
        ncmVar.a(ldmVar, ksuVar, z);
        kty.b(this.P);
        ((ckco) this.P.a(ckee.af)).a(this.x.x);
        this.B = this.aa.j();
        this.aa.C().e(this.ad, this.z);
    }

    @Override // defpackage.non
    public final noq b() {
        this.D = true;
        kxs kxsVar = this.ae;
        dbsk.s(kxsVar);
        kxsVar.a();
        this.i.a().addView(this.U.c());
        p();
        m(this.q.k(), true);
        this.n.l(this.J);
        l();
        this.p.post(new Runnable(this) { // from class: mhx
            private final mio a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mio mioVar = this.a;
                if (mioVar.s.u() != 1) {
                    mioVar.o.l();
                }
                mioVar.E.run();
            }
        });
        this.K.b(this.ai);
        this.e.h(this.al);
        if (this.Y) {
            this.an.setKeyInterceptor(new kdh(this) { // from class: mhy
                private final mio a;

                {
                    this.a = this;
                }

                @Override // defpackage.kdh
                public final boolean a(KeyEvent keyEvent) {
                    mio mioVar = this.a;
                    if (keyEvent.getAction() != 1) {
                        return false;
                    }
                    if (keyEvent.getKeyCode() == 20) {
                        View view = mioVar.u;
                        dbsk.s(view);
                        if (view.hasFocus()) {
                            View view2 = mioVar.v;
                            dbsk.s(view2);
                            nol.b(view2);
                        } else {
                            View view3 = mioVar.v;
                            dbsk.s(view3);
                            if (!view3.hasFocus()) {
                                return false;
                            }
                            View view4 = mioVar.w;
                            dbsk.s(view4);
                            nol.b(view4);
                            return true;
                        }
                    } else if (keyEvent.getKeyCode() != 19) {
                        return false;
                    } else {
                        View view5 = mioVar.w;
                        dbsk.s(view5);
                        if (view5.hasFocus()) {
                            View view6 = mioVar.v;
                            dbsk.s(view6);
                            nol.b(view6);
                        } else {
                            View view7 = mioVar.v;
                            dbsk.s(view7);
                            if (!view7.hasFocus()) {
                                return false;
                            }
                            View view8 = mioVar.u;
                            dbsk.s(view8);
                            nol.b(view8);
                            return true;
                        }
                    }
                    return true;
                }
            });
        }
        this.N.h(this.ak);
        s(this.R);
        btrm btrmVar = this.Z;
        min minVar = this.ag;
        dceq a2 = dcet.a();
        a2.b(alco.class, new miq(alco.class, minVar, bvrj.UI_THREAD));
        btrmVar.g(minVar, a2.a());
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.S.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.Z.a(this.ag);
        t();
        if (this.Y) {
            this.an.a();
        }
        this.e.i(this.al);
        this.K.c(this.ai);
        this.M.c();
        this.i.a().removeView(this.U.c());
        this.p.removeCallbacksAndMessages(null);
        this.N.i(this.ak);
        kxs kxsVar = this.ae;
        dbsk.s(kxsVar);
        kxsVar.b();
        this.D = false;
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        int q;
        this.n.D(null);
        this.n.l(null);
        this.n.B();
        ((mof) this.Q).a = true;
        o(false);
        this.N.i(this.aj);
        if (this.W == kdk.NAVIGATE_IF_NOT_EV_CHARGING_STATION && (q = q()) != 5) {
            this.ab.a(q - 1);
        }
        if (this.Y) {
            CardView cardView = this.T;
            dbsk.s(cardView);
            ((nti) ((nsr) cardView.findViewById(mkr.c)).findViewById(mlp.b)).setOnScrollBarVisibilityChangeListener(null);
        }
        this.ae = null;
        this.T = null;
        this.S.f();
        this.U.f();
        this.e.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "PlaceDetailsOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.i.b(noeVar, this.S.c());
    }

    public final void k() {
        boolean z;
        p();
        if (this.D) {
            amuh k = this.q.k();
            if (k == null) {
                this.n.D(null);
            } else {
                ldm ldmVar = this.C;
                ldm ldmVar2 = this.s;
                if (ldmVar != ldmVar2) {
                    this.C = ldmVar2;
                    z = true;
                } else {
                    z = false;
                }
                m(k, z);
            }
        }
        l();
    }

    public final void l() {
        this.t.n();
        cqkx.p(this.t);
        cqkx.p(this.V);
    }

    public final void m(@dzsi amuh amuhVar, boolean z) {
        if (amuhVar == null) {
            return;
        }
        asmp asmpVar = this.n;
        astf f = astg.f();
        f.e(amuhVar);
        asmpVar.D(f.a());
        if (!z || !amuhVar.j()) {
            return;
        }
        this.n.A(true, new aslo(amuhVar.k(), 0, amuhVar.k().G()));
    }

    public final void n(akqq akqqVar) {
        this.n.y();
        akyc m = akyt.m(akqqVar, this.x == mnz.MAP_INTERACTION_POI ? this.j.n().k : 15.0f, this.k.b());
        m.b = -1;
        this.j.q(m, null);
    }

    public final void o(boolean z) {
        if (this.af) {
            return;
        }
        if (z) {
            ckcq ckcqVar = this.ac;
            dbsk.s(ckcqVar);
            ckcqVar.b();
        }
        mor morVar = this.o;
        int i = morVar.s;
        if (i == 201 || i == 202) {
            morVar.r();
        }
        int i2 = morVar.s;
        if (z) {
            int i3 = i2 - 1;
            kdk kdkVar = kdk.NOTHING;
            if (i2 == 0) {
                throw null;
            }
            switch (i3) {
                case 100:
                    i2 = 1;
                    break;
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    i2 = 2;
                    break;
                case 102:
                    i2 = 3;
                    break;
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                    i2 = 4;
                    break;
            }
        } else if (i2 == 0) {
            throw null;
        }
        if (this.x.a()) {
            ((ckco) this.P.a(ckee.am)).a(i2 - 1);
            if (z && this.W == kdk.NOTHING) {
                cjqy cjqyVar = this.L;
                cjsx i4 = cjsy.i();
                i4.b(ddda.bq);
                cjqyVar.k(i4.a());
            }
        } else {
            ((ckco) this.P.a(ckee.an)).a(i2 - 1);
        }
        this.af = true;
    }
}
