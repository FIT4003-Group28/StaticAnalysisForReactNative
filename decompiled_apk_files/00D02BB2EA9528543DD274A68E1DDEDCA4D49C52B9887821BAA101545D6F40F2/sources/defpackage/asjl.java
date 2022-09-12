package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asjl  reason: default package */
/* loaded from: classes2.dex */
public final class asjl extends ges implements degu, asjv {
    public dxio<afha> ad;
    public dxio<akfa> ae;
    public bwqv af;
    public crfm ag;
    public asjw ah;
    public efg ai;
    public asjs aj;
    public afos ak;
    public bvrb al;
    public btrm am;
    public btvo an;
    public bvjj ao;
    public final asjo ap;
    private boolean ar;
    private int as;
    private boolean at;
    @dzsi
    private asjt au;
    public dxio<asjc> c;
    public dxio<cjyh> d;
    public dehq e;
    public dxio<qbt> f;
    public dxio<afgy> g;
    public static final dcqe a = dcqe.c("asjl");
    public static final String b = asjl.class.getSimpleName();
    private static final long aq = TimeUnit.SECONDS.toMillis(7);

    public asjl() {
        this.as = 0;
        this.ap = new asjo();
    }

    private final void aJ() {
        gn gnVar = this.A;
        if (gnVar == null || gnVar.J()) {
            return;
        }
        gn gnVar2 = this.A;
        dbsk.s(gnVar2);
        gnVar2.e();
    }

    private final void w() {
        dehn a2;
        dehn<cpxx> dehnVar;
        crfo crfoVar = this.ap.q;
        dqvj dqvjVar = null;
        if (crfoVar != null) {
            if (crfoVar.a == arym.GUIDED_NAV) {
                dqvjVar = crfoVar.a().b;
            } else if (crfoVar.a == arym.FREE_NAV) {
                dqvjVar = crfoVar.b().a();
            }
        }
        if (dqvjVar != dqvj.DRIVE) {
            a2 = deha.a(false);
        } else if (this.ao.m(bvjk.jF, false)) {
            a2 = deha.a(true);
        } else if (!this.an.getAssistantParameters().d) {
            a2 = deha.a(false);
        } else if (this.ae.a().d()) {
            a2 = deha.a(false);
        } else {
            Context H = H();
            if (H == null || !cqhl.a(H)) {
                cjyh a3 = this.d.a();
                if (Build.VERSION.SDK_INT >= 28 && a3.d.a().getAssistantParameters().b) {
                    synchronized (a3) {
                        if (a3.h == null) {
                            a3.h = a3.a.a().g();
                        }
                        dehnVar = a3.h;
                    }
                    a2 = deew.h(dehnVar, cjyf.a, dege.a);
                } else {
                    a2 = deha.a(false);
                }
            } else {
                a2 = deha.a(false);
            }
        }
        deha.q(deha.h(a2, 5L, TimeUnit.SECONDS, this.e), new asjg(this), this.e);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvrj.UI_THREAD.c();
        this.at = false;
        this.ap.i = asjk.DONE;
        aJ();
        if (!this.ap.m) {
            this.f.a().m(this.ap.p);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        asjo asjoVar = this.ap;
        dqvj dqvjVar = null;
        if (asjoVar.j) {
            qcx qcxVar = asjoVar.p;
            if (qcxVar != null) {
                dqvjVar = qcxVar.f();
            }
            asjs asjsVar = this.aj;
            asjt asjtVar = new asjt(asjsVar.c);
            asjtVar.c(asjsVar.a, asjsVar.b, dqvjVar);
            this.au = asjtVar;
            return asjtVar.b.c();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        bvmn bvmnVar = bvmo.a;
        super.ak();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        if (this.ap.i == asjk.WAIT_FOR_PREREQUISITE_DIALOGS) {
            this.ah.c();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        amte amteVar = (amte) obj;
        bvrj.UI_THREAD.c();
        this.at = false;
        this.ap.a(null, amteVar, 0, true);
        this.ap.i = asjk.WAIT_FOR_SERVICE_START;
        this.ak.a(amteVar.c);
        w();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        asjk asjkVar = asjk.WAIT_FOR_ON_CREATE;
        int ordinal = this.ap.i.ordinal();
        if (ordinal == 0) {
            bvoo.h("Impossible WAIT_FOR_ON_CREATE", new Object[0]);
            return false;
        } else if (ordinal != 5) {
            return ordinal == 6;
        } else {
            this.ag.d(false);
            return false;
        }
    }

    public final void g() {
        dbsk.l(this.ap.i == asjk.WAIT_FOR_PREREQUISITE_DIALOGS);
        this.ah.d(false);
    }

    public final void i() {
        dehn<GmmLocation> dehnVar;
        boolean z = false;
        dbsk.l(this.ap.i == asjk.WAIT_FOR_DIRECTIONS);
        if (this.ap.q == null) {
            z = true;
        }
        dbsk.l(z);
        if (!this.at) {
            this.at = true;
            qcx qcxVar = this.ap.p;
            dbsk.s(qcxVar);
            asjc a2 = this.c.a();
            bvrj bvrjVar = bvrj.UI_THREAD;
            long j = aq;
            bvmn bvmnVar = bvmo.a;
            final asjd asjdVar = new asjd(a2.a, qcxVar, a2.b, a2.c, a2.d, a2.e, a2.h, a2.i, a2.j);
            bvrb bvrbVar = a2.f;
            ahth ahthVar = a2.g;
            btrm btrmVar = asjdVar.c;
            dceq a3 = dcet.a();
            a3.b(srf.class, new asje(srf.class, asjdVar));
            btrmVar.g(asjdVar, a3.a());
            synchronized (asjdVar) {
                try {
                    asjdVar.i = true;
                    asjdVar.g = ahthVar.a();
                    dehnVar = asjdVar.g;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    throw th;
                }
            }
            Executor g = bvrbVar.g(bvrj.BACKGROUND_THREADPOOL);
            dbsk.s(g);
            deha.q(dehnVar, asjdVar, g);
            bvrbVar.a(new Runnable(asjdVar) { // from class: asjb
                private final asjd a;

                {
                    this.a = asjdVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    asjd asjdVar2 = this.a;
                    asjdVar2.k(new RuntimeException(String.valueOf(asjd.a).concat(": timeout")));
                    synchronized (asjdVar2) {
                        asjdVar2.d();
                    }
                }
            }, bvrjVar, j);
            Executor g2 = bvrbVar.g(bvrjVar);
            dbsk.s(g2);
            deha.q(asjdVar, this, g2);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        crfo c;
        bvmn bvmnVar = bvmo.a;
        super.l(bundle);
        asjo asjoVar = this.ap;
        bwqv bwqvVar = this.af;
        boolean z = true;
        if (bundle != null) {
            try {
                asjoVar.i = (asjk) dbsc.a((asjk) bundle.getSerializable(asjk.h), asjk.WAIT_FOR_FIRST_EVENT);
                asjoVar.j = bundle.getBoolean(asjo.b, false);
                asjoVar.k = bundle.getBoolean(asjo.c, false);
                asjoVar.l = bundle.getBoolean(asjo.e, false);
                asjoVar.m = bundle.getBoolean(asjo.f, false);
                asjoVar.n = bundle.getBoolean(asjo.g, false);
                asjoVar.o = bundle.getBoolean(asjo.h, false);
                asjn asjnVar = (asjn) bundle.getSerializable(asjn.c);
                if (asjnVar == asjn.DIRECTIONS) {
                    Serializable serializable = bundle.getSerializable(asjo.d);
                    dbsk.s(serializable);
                    asjoVar.p = (qcx) serializable;
                } else if (asjnVar == asjn.NAVIGATION) {
                    long j = bundle.getLong("t");
                    arym arymVar = (arym) bundle.getSerializable("m");
                    if (arymVar != null) {
                        int ordinal = arymVar.ordinal();
                        if (ordinal == 0) {
                            asbz asbzVar = (asbz) bwqvVar.d(asbz.class, bundle, "fn");
                            dbsk.s(asbzVar);
                            crfn b2 = crfn.b(asbzVar);
                            b2.b = j;
                            c = b2.c();
                        } else if (ordinal == 1) {
                            amte amteVar = (amte) bwqvVar.d(amte.class, bundle, "d");
                            int i = bundle.getInt("idx", -1);
                            boolean z2 = bundle.getBoolean("hdp", false);
                            boolean z3 = bundle.getBoolean("dtu", false);
                            boolean z4 = bundle.getBoolean("dr", false);
                            boolean z5 = bundle.getBoolean("fdan", false);
                            String string = bundle.getString("rn", "");
                            dspd x = bundle.containsKey("trht") ? dspd.x((byte[]) dbsk.s(bundle.getByteArray("trht"))) : null;
                            boolean z6 = bundle.getBoolean("ipr");
                            dbsk.s(amteVar);
                            crfn a2 = crfn.a(amteVar);
                            a2.b = j;
                            a2.d = i;
                            a2.e = z2;
                            a2.f = z3;
                            a2.g = z4;
                            a2.h = z5;
                            a2.i = string;
                            a2.k = x;
                            a2.l = z6;
                            c = a2.c();
                        }
                        asjoVar.q = c;
                    }
                    throw new IllegalStateException("NavigationMode is null");
                }
            } catch (IOException e) {
                bvoo.h("Corrupt storage data: %s", e);
                asjoVar.i = asjk.DONE;
            }
        } else {
            asjoVar.i = asjk.WAIT_FOR_FIRST_EVENT;
        }
        dbsk.l(asjoVar.i != asjk.WAIT_FOR_ON_CREATE);
        if (asjoVar.i != asjk.DONE) {
            boolean z7 = asjoVar.p == null;
            if (asjoVar.q != null) {
                z = false;
            }
            dbsk.l(z7 ^ z);
        }
        this.ah.b(this);
    }

    @Override // defpackage.asjv
    public final void n(boolean z) {
        if (this.ap.i != asjk.WAIT_FOR_PREREQUISITE_DIALOGS) {
            return;
        }
        if (z) {
            asjo asjoVar = this.ap;
            if (asjoVar.q == null) {
                asjoVar.i = asjk.WAIT_FOR_DIRECTIONS;
                i();
                return;
            }
            asjoVar.i = asjk.WAIT_FOR_SERVICE_START;
            w();
            return;
        }
        this.ap.i = asjk.DONE;
        aJ();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.cL;
    }

    public final void q() {
        this.as++;
        if (this.ap.i != asjk.WAIT_FOR_SERVICE_START) {
            bvoo.d(new IllegalStateException(String.format(Locale.getDefault(), "Trying to call startNavigationService in a bad state: %s, called %d times", this.ap.i.toString(), Integer.valueOf(this.as))));
            return;
        }
        dbsk.s(this.ap.q);
        crfn crfnVar = new crfn(this.ap.q);
        crfnVar.i = this.g.a().j();
        this.ag.c(crfnVar.c());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        asjt asjtVar;
        bvmn bvmnVar = bvmo.a;
        super.s();
        if (this.ap.j && (asjtVar = this.au) != null) {
            View a2 = asjtVar.a();
            efg efgVar = this.ai;
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.w(a2);
            egjVar.e(this);
            efgVar.a(egjVar.a());
        }
        if (this.ap.i == asjk.DONE) {
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.e();
            return;
        }
        this.ar = true;
        btrm btrmVar = this.am;
        dceq a3 = dcet.a();
        a3.b(crhp.class, new asjm(crhp.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a3.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        asjo asjoVar = this.ap;
        bwqv bwqvVar = this.af;
        bundle.putSerializable(asjk.h, asjoVar.i);
        bundle.putBoolean(asjo.b, asjoVar.j);
        bundle.putBoolean(asjo.c, asjoVar.k);
        bundle.putBoolean(asjo.e, asjoVar.l);
        bundle.putBoolean(asjo.f, asjoVar.m);
        bundle.putBoolean(asjo.g, asjoVar.n);
        bundle.putBoolean(asjo.h, asjoVar.o);
        if (asjoVar.p != null) {
            bundle.putSerializable(asjo.d, asjoVar.p);
            asjn.DIRECTIONS.a(bundle);
            return;
        }
        crfo crfoVar = asjoVar.q;
        if (crfoVar == null) {
            return;
        }
        bundle.putSerializable("m", crfoVar.a);
        bundle.putLong("t", crfoVar.b);
        if (crfoVar.a == arym.GUIDED_NAV) {
            bwqvVar.c(bundle, "d", crfoVar.c);
            bundle.putInt("idx", crfoVar.d);
            bundle.putBoolean("hdp", crfoVar.e);
            bundle.putBoolean("dtu", crfoVar.f);
            bundle.putBoolean("dr", crfoVar.g);
            bundle.putBoolean("fdan", crfoVar.h);
            bundle.putString("rn", crfoVar.i);
            dspd dspdVar = crfoVar.k;
            if (dspdVar != null) {
                bundle.putByteArray("trht", dspdVar.G());
            }
            bundle.putBoolean("ipr", crfoVar.l);
        } else if (crfoVar.a == arym.FREE_NAV) {
            bwqvVar.c(bundle, "fn", crfoVar.j);
        }
        asjn.NAVIGATION.a(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (this.ar) {
            this.am.a(this);
            this.ar = false;
        }
        asjk asjkVar = this.ap.i;
        asjt asjtVar = this.au;
        if (asjtVar != null) {
            asjtVar.b();
        }
        if (this.ap.i == asjk.DONE) {
            this.ap.j = false;
            this.au = null;
        }
        super.u();
    }

    public asjl(asjo asjoVar) {
        this.as = 0;
        this.ap = asjoVar;
    }
}
