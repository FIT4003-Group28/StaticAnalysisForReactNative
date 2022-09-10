package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: kgw  reason: default package */
/* loaded from: classes7.dex */
public final class kgw extends nos {
    public static final /* synthetic */ int x = 0;
    private static final cjsz y = new cjsz(dtxm.r);
    private static final int z = 9;
    private final cqkj A;
    private final crzm<jzq> B;
    private final ncp C;
    private final bvjj D;
    private final kxu E;
    private final klt F;
    private final boolean G;
    private final kdg H;
    private final dcdc<brcl> I;
    private final axwi J;
    private final dehq K;
    @dzsi
    private kxs L;
    private final klm M;
    private final kcz<dcdc<ldm>> N;
    private final crzp<jzq> O;
    private final jty P;
    public final Context a;
    public final not b;
    public final nop c;
    public final nop d;
    public final noo e;
    public final kdi f;
    public final ntc g;
    public final ksr h;
    public final kcv i;
    public final jzp j;
    public final Runnable k;
    public final ckcw l;
    public final akfa m;
    public final cov n;
    public final kln o;
    public final View p;
    public final View q;
    @dzsi
    public btlu r;
    public kle s;
    public final cqkf<klf> t;
    @dzsi
    public ckcq u;
    public boolean v;
    public final klr w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgw(final Context context, cqkj cqkjVar, not notVar, nop nopVar, nop nopVar2, noo nooVar, kdi kdiVar, jty jtyVar, crzm crzmVar, bvjj bvjjVar, btvo btvoVar, kxu kxuVar, ksr ksrVar, final kcv kcvVar, jzp jzpVar, klt kltVar, Runnable runnable, cjqy cjqyVar, cjqq cjqqVar, ckcw ckcwVar, final akfa akfaVar, kdg kdgVar, ncp ncpVar, final Runnable runnable2, dcdc dcdcVar, dehq dehqVar, axwi axwiVar, dbsg dbsgVar, final dbsg dbsgVar2) {
        super(cjqyVar, cjqqVar);
        khw khwVar;
        ntc ntcVar = new ntc(cqkjVar, dbsg.i(Integer.valueOf(z)));
        new kgp(this);
        this.s = kle.TAB;
        dcdc.e();
        this.w = new kgr(this);
        kgs kgsVar = new kgs(this);
        this.M = kgsVar;
        this.N = new kgu(this);
        this.O = new kgv(this);
        this.a = context;
        dbsk.s(cqkjVar);
        this.A = cqkjVar;
        dbsk.s(notVar);
        this.b = notVar;
        dbsk.s(nopVar);
        this.c = nopVar;
        dbsk.s(nopVar2);
        this.d = nopVar2;
        dbsk.s(nooVar);
        this.e = nooVar;
        dbsk.s(kdiVar);
        this.f = kdiVar;
        dbsk.s(jtyVar);
        this.P = jtyVar;
        dbsk.s(bvjjVar);
        this.D = bvjjVar;
        dbsk.s(kxuVar);
        this.E = kxuVar;
        dbsk.s(ksrVar);
        this.h = ksrVar;
        dbsk.s(kcvVar);
        this.i = kcvVar;
        dbsk.s(jzpVar);
        this.j = jzpVar;
        dbsk.s(kltVar);
        this.F = kltVar;
        dbsk.s(runnable);
        this.k = runnable;
        dbsk.s(crzmVar);
        this.B = crzmVar;
        dbsk.s(ckcwVar);
        this.l = ckcwVar;
        dbsk.s(akfaVar);
        this.m = akfaVar;
        dbsk.s(kdgVar);
        this.H = kdgVar;
        dbsk.s(ncpVar);
        this.C = ncpVar;
        dbsk.s(dcdcVar);
        this.I = dcdcVar;
        dbsk.s(axwiVar);
        this.J = axwiVar;
        this.g = ntcVar;
        dbsk.s(runnable2);
        this.G = true;
        cqkf<klf> d = cqkjVar.d(new kjk(), notVar.a(), false);
        this.t = d;
        this.p = d.c().findViewById(kjk.e);
        this.q = d.c().findViewById(R.id.destination_input_sign_in_button);
        Runnable runnable3 = new Runnable(this, kcvVar, context, akfaVar, runnable2) { // from class: kgi
            private final kgw a;
            private final kcv b;
            private final Context c;
            private final akfa d;
            private final Runnable e;

            {
                this.a = this;
                this.b = kcvVar;
                this.c = context;
                this.d = akfaVar;
                this.e = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kgw kgwVar = this.a;
                kcv kcvVar2 = this.b;
                Context context2 = this.c;
                akfa akfaVar2 = this.d;
                Runnable runnable4 = this.e;
                dbsk.s(kgwVar.q);
                if (kgwVar.v) {
                    kcvVar2.k(context2.getString(R.string.CAR_ERROR_LOCKOUT), 1);
                    return;
                }
                dbsk.m(akfaVar2.s().isEmpty(), "Sign in invoked while there is already an account on a device.");
                runnable4.run();
            }
        };
        Runnable runnable4 = new Runnable(dbsgVar2) { // from class: kgj
            private final dbsg a;

            {
                this.a = dbsgVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvor.a(this.a, kgo.a);
            }
        };
        Runnable runnable5 = new Runnable(this) { // from class: kgk
            private final kgw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.p.performClick();
            }
        };
        if (!dbsgVar.a()) {
            khwVar = akfaVar.d() ? khw.NEARBY : khw.RECENT;
        } else {
            khwVar = (khw) dbsgVar.b();
        }
        this.o = new kln(context, btvoVar, kgsVar, runnable3, runnable4, runnable5, true, false, akfaVar, khwVar);
        this.n = (cov) d.c().findViewById(kjk.a);
        this.K = dehqVar;
    }

    public static ksu n(final bvqg<ldm> bvqgVar) {
        return new ksu(bvqgVar) { // from class: kgn
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.ksu
            public final void a(ldm ldmVar) {
                bvqg bvqgVar2 = this.a;
                int i = kgw.x;
                khw khwVar = khw.RECENT;
                int u = ldmVar.u() - 1;
                if (u != 0) {
                    if (u != 1) {
                        return;
                    }
                    bvqgVar2.NU(ldmVar);
                    return;
                }
                throw new IllegalStateException("Should not receive onComplete() callback while directions pending.");
            }
        };
    }

    private final void p() {
        cqtd G;
        cqtd cqtdVar;
        khw khwVar = khw.RECENT;
        int ordinal = this.o.w().ordinal();
        if (ordinal == 0) {
            btlu j = this.m.j();
            if (j == null || !j.m()) {
                List<String> F = this.D.F(bvjk.ar, new ArrayList());
                if (F.isEmpty() || dbsj.d(F.get(0))) {
                    this.C.d(this.N);
                } else {
                    ncg ncgVar = new ncg(this.D);
                    kcz<dcdc<ldm>> kczVar = this.N;
                    dbsk.s(kczVar);
                    ((kgu) kczVar).d(ncgVar.a);
                }
            } else {
                this.o.B(this.a.getString(R.string.CAR_NO_RECENT_PLACES_MAPS_NOT_SIGNED_IN));
            }
            this.u = ((ckcr) this.l.a(ckee.ax)).a();
            cjqp u = u();
            if (u == null) {
                return;
            }
            u.d(cjtd.a(dtxm.aw));
            if (j == null || j.o()) {
                u.d(cjtd.a(dtxm.aB));
            } else if (j.m()) {
                u.d(cjtd.a(dtxm.ax));
            }
        } else if (ordinal == 1) {
            dccx F2 = dcdc.F();
            for (int i = 0; i < this.I.size(); i++) {
                brcl brclVar = this.I.get(i);
                int i2 = brclVar.d;
                cqtd cqtdVar2 = brclVar.c;
                cqsn cqsnVar = brclVar.b;
                Context context = this.A.d;
                String charSequence = ((cqsh) cqsnVar).a.toString();
                String str = brclVar.a;
                int i3 = brclVar.e;
                if (i2 == 3) {
                    G = nqu.G();
                } else if (i2 == 4) {
                    G = nqu.aa();
                } else if (i2 == 6) {
                    G = nqu.E();
                } else if (i2 == 7) {
                    G = nqu.F();
                } else if (i2 == 49) {
                    G = nqu.X();
                } else if (i2 == 61956) {
                    G = nqu.aq(R.raw.car_only_ic_local_gas_station_36dp);
                } else if (i2 == 61959) {
                    G = nqu.aq(R.raw.car_only_ic_local_grocery_store_36dp);
                } else if (i2 == 61979) {
                    G = nqu.aq(R.raw.car_only_ic_local_ev_station_36dp);
                } else if (i2 == 4091) {
                    G = nqu.V();
                } else if (i2 != 4092) {
                    switch (i2) {
                        case 61953:
                            G = nqu.aq(R.raw.car_only_ic_local_restaurant_36dp);
                            break;
                        case 61954:
                            G = nqu.aq(R.raw.car_only_ic_local_cafe_36dp);
                            break;
                        default:
                            cqtdVar = cqtdVar2;
                            continue;
                            F2.g(new klu(charSequence, str, i3, i2, cqtdVar, nqu.as(i2, nqu.an(nql.x)), this.F, new View.OnFocusChangeListener(this) { // from class: kgm
                                private final kgw a;

                                {
                                    this.a = this;
                                }

                                @Override // android.view.View.OnFocusChangeListener
                                public final void onFocusChange(View view, boolean z2) {
                                    kgw kgwVar = this.a;
                                    if (z2) {
                                        kgwVar.s = kle.LIST;
                                    }
                                }
                            }, dtxm.q, i));
                    }
                } else {
                    G = nqu.ab();
                }
                cqtdVar = G;
                F2.g(new klu(charSequence, str, i3, i2, cqtdVar, nqu.as(i2, nqu.an(nql.x)), this.F, new View.OnFocusChangeListener(this) { // from class: kgm
                    private final kgw a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        kgw kgwVar = this.a;
                        if (z2) {
                            kgwVar.s = kle.LIST;
                        }
                    }
                }, dtxm.q, i));
            }
            this.g.b(new kla(), F2.f());
            this.o.A();
            o();
        } else {
            if (ordinal != 2) {
                return;
            }
            btlu j2 = this.m.j();
            if (j2 != null) {
                j2.m();
            }
            if (j2 == null || !j2.l()) {
                this.o.B(this.a.getString(R.string.CAR_NO_PERSONAL_PLACES_MAPS_NOT_SIGNED_IN));
                return;
            }
            Context context2 = this.a;
            kgq kgqVar = new kgq(this);
            try {
                this.J.f().get();
            } catch (InterruptedException | ExecutionException e) {
                bvoo.j(e);
                dcdc.e();
            }
            dccx F3 = dcdc.F();
            F3.g(new klx(context2, khx.LABELED_PLACES, kgqVar, "", ""));
            F3.g(new klx(context2, khx.FAVORITE_PLACES, kgqVar, "", ""));
            F3.g(new klx(context2, khx.STARRED_PLACES, kgqVar, "", ""));
            F3.g(new klx(context2, khx.WANT_TO_GO_PLACES, kgqVar, "", ""));
            F3.g(new klx(context2, khx.CONTACTS, kgqVar, "", ""));
            this.g.b(new kla(), F3.f());
            this.o.A();
            o();
        }
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final noq b() {
        s(y);
        p();
        kxs kxsVar = new kxs(this.t.c(), kxo.k(), this.E);
        this.L = kxsVar;
        kxsVar.a();
        this.o.y(!this.i.p());
        this.P.setKeyInterceptor(new kdh(this) { // from class: kgl
            private final kgw a;

            {
                this.a = this;
            }

            @Override // defpackage.kdh
            public final boolean a(KeyEvent keyEvent) {
                kgw kgwVar = this.a;
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 21 && kgwVar.s == kle.LIST) {
                    khw khwVar = khw.RECENT;
                    int ordinal = kgwVar.o.w().ordinal();
                    if (ordinal == 0) {
                        nol.b(kgwVar.t.c().findViewById(kjk.b));
                    } else if (ordinal == 1) {
                        nol.b(kgwVar.t.c().findViewById(kjk.c));
                    } else if (ordinal == 2) {
                        nol.b(kgwVar.t.c().findViewById(kjk.d));
                    } else {
                        String valueOf = String.valueOf(kgwVar.o.w());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Unrecognized DestinationsTab: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                    return true;
                }
                return false;
            }
        });
        this.B.d(this.O, this.K);
        this.i.i(this);
        this.H.d(this);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.t.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        this.i.h(this);
        this.H.e(this);
        this.B.c(this.O);
        this.P.a();
        kxs kxsVar = this.L;
        dbsk.s(kxsVar);
        kxsVar.b();
        this.L = null;
    }

    @Override // defpackage.non
    public final String g() {
        return "DestinationInputOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.b.b(noeVar, this.t.c());
    }

    @Override // defpackage.nos
    public final void k() {
        this.t.e(this.o);
        this.n.a.setClipChildren(false);
        this.n.setAdapter(this.g);
        this.h.a();
        this.o.z();
        cov covVar = this.n;
        covVar.b.g = true;
        covVar.a(0);
    }

    @Override // defpackage.nos
    public final void l() {
        this.C.e();
        this.h.b();
        this.t.e(null);
        this.u = null;
    }

    public final void m() {
        this.o.z();
        cov covVar = this.n;
        covVar.b.g = true;
        covVar.a(0);
        dcdc.e();
        p();
    }

    public final void o() {
        cov covVar = this.n;
        covVar.b.g = true;
        covVar.a(0);
        View f = this.n.f();
        if (f != null) {
            nol.b(f);
        }
    }
}
