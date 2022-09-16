package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.directions.api.PseudoTrackDirectionsEvent;
import com.google.android.apps.gmm.map.intents.AndroidIntentEvent;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: edx  reason: default package */
/* loaded from: classes.dex */
public class edx extends gga implements btss {
    public static final /* synthetic */ int aU = 0;
    public dxio<efc> A;
    public dxio<btrm> B;
    public dxio<bvjj> C;
    public dxio<bttf> D;
    public dxio<glj> E;
    public dxio<efh> F;
    public dxio<eet> G;
    public dxio<asik> H;
    public dxio<asil> I;
    public dxio<asim> J;
    public dxio<cjyh> K;
    public dxio<cref> L;
    public dxio<cqhn> M;
    public dxio<qbt> N;
    public dxio<ahjq> O;
    public dxio<arag> P;
    public dxio<afgy> Q;
    public dxio<afwt> R;
    public dxio<akfa> S;
    public dzsj<akfc> T;
    public dxio<akox> U;
    public dxio<hwd> V;
    public dxio<awnv> W;
    public dxio<bycs> X;
    public dxio<bzmi> Y;
    public dxio<cqho> Z;
    public dxio<jjm> aA;
    public Boolean aB;
    ckmm aC;
    public bvsb aD;
    public ckml aE;
    public dxio<cyy> aF;
    public dxio<awoe> aG;
    jzv aH;
    fzc aI;
    public boolean aJ;
    edy aN;
    protected MainLayout aO;
    public btxc aS;
    public ctv aT;
    public dxio<ckrp> aa;
    public dxio<auhi> ab;
    public dxio<htw> ac;
    public dxio<awwq> ad;
    public ckcw ae;
    public dxio<efz> af;
    public dxio<bubw> ag;
    public dxio<btuo> ah;
    public dxio<cvze<cwfm>> ai;
    public dxio<ina> aj;
    public dxio<GmsheadAccountsModelUpdater> ak;
    public dxio<afef> al;
    public btuu am;
    public dxio<gcg> an;
    public dxio<gce> ao;
    public dxio<gcm> ap;
    public dxio<hum> aq;
    public dxio<btbd> ar;
    public dxio<btcx> as;
    public dxio<btcy> at;
    public dehq au;
    public Executor av;
    public dxio<acys> aw;
    public dzsj<bnkn> ax;
    public atbs ay;
    public dzsj<dbsg<gli>> az;
    private ammc bg;
    @dzsi
    private String bh;
    private boolean bi;
    @dzsi
    private ScheduledFuture<?> bk;
    private auev bl;
    private crzp<Boolean> bm;
    public ita l;
    public dxio<ckoq> m;
    public dxio<crfm> n;
    public dxio<aufc> o;
    public dxio<auey> p;
    public dxio<bwqv> q;
    public dxio<cqat> r;
    public dxio<btmv> s;
    public dxio<bvkx> t;
    public dxio<btvo> u;
    public dxio<cjwt> v;
    public dxio<cjqy> w;
    public dxio<cjqq> x;
    public dxio<cjxd> y;
    public dxio<efx> z;
    static final long k = TimeUnit.DAYS.toMillis(1);
    private static final ckme be = ckme.PRIMARY_MAP;
    private final egb bf = new egb();
    @dzsi
    private bvjz bj = null;
    @dzsi
    public durz aK = null;
    public volatile boolean aL = false;
    public volatile boolean aM = false;
    protected final boolean aP = true;
    public boolean aQ = false;
    protected final edu aR = new edu(this);

    private final void M() {
        long w = this.C.a().w(bvjk.go, 0L);
        long b = this.r.a().b();
        if (w == 0 || b - w > k) {
            this.C.a().Z(bvjk.go, b);
        }
    }

    private final boolean N(Bundle bundle) {
        int i;
        if (bundle != null) {
            dvsb savedStateExpirationParameters = this.u.a().getSavedStateExpirationParameters();
            if ((savedStateExpirationParameters.a & 1) != 0 && (i = savedStateExpirationParameters.b) > 0) {
                if (TimeUnit.MILLISECONDS.toSeconds(this.r.a().b() - bundle.getLong("ON_SAVED_INSTANCE_STATE_TIME_KEY")) >= i) {
                    cjta b = cjtd.b();
                    b.d = dtyb.ac;
                    if (savedStateExpirationParameters.d) {
                        b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                    }
                    this.x.a().g().d(b.a());
                    if (!savedStateExpirationParameters.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean O() {
        if (this.u.a().getBusinessMessagingParameters().v) {
            return this.aK == durz.EIT_BUSINESS_MESSAGING_START_CONVERSATION || this.aK == durz.EIT_BUSINESS_MESSAGING_NOTIFICATION || this.aK == durz.EIT_BUSINESS_MESSAGING_MAPS_ONLY;
        }
        return false;
    }

    private final void P(boolean z, boolean z2) {
        ascc asccVar;
        if (z2) {
            asccVar = z ? ascc.b : ascc.a;
        } else {
            asccVar = ascc.c;
        }
        this.B.a().b(asccVar);
    }

    private final String Q() {
        fd K = K();
        return K != null ? K.getClass().getCanonicalName() : "No fragment found";
    }

    @Override // defpackage.rb, defpackage.iw, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (NullPointerException e) {
            bvoo.j(e);
            return false;
        }
    }

    @Override // defpackage.ff, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.O.a().NX(str, printWriter);
        this.O.a().o();
        this.m.a().a(str, printWriter);
        this.S.a().F(str, printWriter);
        ita itaVar = this.l;
        printWriter.print(str);
        printWriter.print("Active Veneers in ");
        printWriter.print(Integer.toHexString(System.identityHashCode(itaVar)));
        printWriter.println(":");
        for (itb itbVar : ((isz) itaVar).a.values()) {
            synchronized (itbVar) {
                printWriter.print(str);
                printWriter.print("  ");
                printWriter.print(itbVar.getClass().getName());
                printWriter.print(": ");
                printWriter.println(Integer.toHexString(System.identityHashCode(itbVar)));
                itbVar.u(String.valueOf(str).concat("    "), fileDescriptor, printWriter, strArr);
            }
        }
        this.U.a().NX(str, printWriter);
        this.B.a().NX(str, printWriter);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2.equals("flushClearcutCounters")) {
                    this.ae.i();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final Intent getIntent() {
        Intent intent = super.getIntent();
        efz.a(intent);
        return intent;
    }

    @Override // android.app.Activity
    public final boolean isDestroyed() {
        return this.F.a().c;
    }

    public final void o(Window window, boolean z) {
        int i = -16777216;
        if (Build.VERSION.SDK_INT >= 27) {
            if (z) {
                window.setNavigationBarColor(-16777216);
            } else if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarColor(-1);
            } else {
                window.setNavigationBarColor(getColor(R.color.qu_grey_100));
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility & (-17) : systemUiVisibility | 16);
        }
        if (ako.b()) {
            if (!z) {
                i = Build.VERSION.SDK_INT >= 29 ? 0 : getColor(R.color.divider_grey);
            }
            bvrm.a(window, i);
        }
    }

    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onActivityResult(int i, final int i2, Intent intent) {
        efz.a(intent);
        super.onActivityResult(i, i2, intent);
        efz a = this.af.a();
        efz.a(intent);
        a.c.a().e = false;
        if (a.o.a().c(i, i2, intent)) {
            return;
        }
        int ordinal = awnn.a(i).ordinal();
        if (ordinal == 2) {
            this.aa.a().c(i2, intent);
        } else if (ordinal == 3) {
            this.T.a().i(i2, intent);
        } else if (ordinal != 4) {
        } else {
            this.au.execute(new Runnable(this, i2) { // from class: edg
                private final edx a;
                private final int b;

                {
                    this.a = this;
                    this.b = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    edx edxVar = this.a;
                    edxVar.P.a().m(this.b);
                }
            });
        }
    }

    @Override // defpackage.agi, android.app.Activity
    public final void onBackPressed() {
        this.af.a().d.a().L();
        s();
    }

    @Override // defpackage.rb, defpackage.ff, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.bi) {
            return;
        }
        efz a = this.af.a();
        if (a.c.a().c || a.a.isFinishing()) {
            return;
        }
        a.s.a().a();
        hut a2 = a.l.a();
        int i = configuration.orientation;
        if (a2.c != i) {
            a2.a();
            a2.c = i;
        }
        huv a3 = a.m.a();
        int i2 = configuration.orientation;
        if (a3.f != i2) {
            a3.a();
            a3.f = i2;
        }
        a.g.a().s(configuration);
        this.I.a().d(configuration);
        this.V.a().r();
        if (this.an.a().a()) {
            this.ao.a().d(this);
        }
        atbs atbsVar = this.ay;
        if (atbsVar.a()) {
            atbs.m(this, 0);
        }
        atbsVar.g = false;
    }

    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        bvmo.c(bvmo.b);
        if (!this.bf.a(1, 2)) {
            super.onCreate(bundle);
            return;
        }
        fzc pW = ((fzb) btsr.a(fzb.class)).pW();
        this.aI = pW;
        ckme ckmeVar = be;
        pW.b(ckmeVar);
        this.aC = ((ckmw) btsr.a(ckmw.class)).sL();
        final ckcw rU = ((ckcu) btsr.a(ckcu.class)).rU();
        this.bg = new ammc(rU, ckmeVar, this.aC);
        this.aC.q(ckoh.d);
        ammc ammcVar = this.bg;
        fzc fzcVar = this.aI;
        if (ammcVar.b != null) {
            if (fzcVar.a(ammcVar.a)) {
                ckmm ckmmVar = ammcVar.b;
                cwsv cwsvVar = ckoh.h.get(ammcVar.a);
                dbsk.s(cwsvVar);
                ckmmVar.q(cwsvVar);
                ckmm ckmmVar2 = ammcVar.b;
                cwsv cwsvVar2 = ckoh.j.get(ammcVar.a);
                dbsk.s(cwsvVar2);
                ckmmVar2.q(cwsvVar2);
                ckmm ckmmVar3 = ammcVar.b;
                cwsv cwsvVar3 = ckoh.i.get(ammcVar.a);
                dbsk.s(cwsvVar3);
                ckmmVar3.q(cwsvVar3);
            } else {
                ckmm ckmmVar4 = ammcVar.b;
                cwsv cwsvVar4 = ckoh.e.get(ammcVar.a);
                dbsk.s(cwsvVar4);
                ckmmVar4.q(cwsvVar4);
                ckmm ckmmVar5 = ammcVar.b;
                cwsv cwsvVar5 = ckoh.g.get(ammcVar.a);
                dbsk.s(cwsvVar5);
                ckmmVar5.q(cwsvVar5);
                ckmm ckmmVar6 = ammcVar.b;
                cwsv cwsvVar6 = ckoh.f.get(ammcVar.a);
                dbsk.s(cwsvVar6);
                ckmmVar6.q(cwsvVar6);
            }
        }
        cxdy e = bvmo.e("GmmActivity::onCreate");
        try {
            int i = cqaz.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            jzv qo = ((jzu) btsr.a(jzu.class)).qo();
            this.aH = qo;
            if (!qo.a()) {
                cxdy e2 = bvmo.e("GmmActivity::createActivityComponent");
                this.aN = (edy) btsq.a(edy.class, this);
                bvmo.f(e2);
                cxdy e3 = bvmo.e("GmmActivity::injectActivityComponent");
                try {
                    this.aN.c(this);
                } catch (Throwable unused) {
                }
                bvmo.f(e3);
                this.t.a().a();
                bvmo.g.a(ckip.n);
                bvmo.g.a(ckip.o);
                ammc ammcVar2 = this.bg;
                ammcVar2.p(ckgi.a);
                ammcVar2.p(ckgi.b);
                ammcVar2.p(ckgi.c);
                ammcVar2.p(ckgi.h);
                ammcVar2.p(ckgi.e);
                final btuo a = this.ah.a();
                a.b.execute(new Runnable(a) { // from class: btun
                    private final btuo a;

                    {
                        this.a = a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        btuo btuoVar = this.a;
                        btuoVar.a.a().d(btuoVar.b);
                    }
                });
                Bundle bundle2 = true == N(bundle) ? null : bundle;
                this.ar.a().a();
                this.t.a().k(this.as.a(), this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                this.t.a().i(new Runnable(this) { // from class: edd
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        if (!edxVar.u.a().getLanguageSettingParameters().b || dajk.c()) {
                            return;
                        }
                        dajk.d(edxVar.getApplicationContext());
                    }
                }, this.av);
                this.t.a().k(this.at.a(), this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                if (!bycr.a(this.D.a())) {
                    this.D.a().e();
                    this.X.a().c();
                } else if (this.aB.booleanValue()) {
                    this.D.a().f();
                }
                Executor executor = this.av;
                final btuu btuuVar = this.am;
                btuuVar.getClass();
                executor.execute(new Runnable(btuuVar) { // from class: edi
                    private final btuu a;

                    {
                        this.a = btuuVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                });
                Executor executor2 = this.av;
                final dxio<bubw> dxioVar = this.ag;
                dxioVar.getClass();
                executor2.execute(new Runnable(dxioVar) { // from class: edj
                    private final dxio a;

                    {
                        this.a = dxioVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                });
                this.av.execute(new Runnable(this) { // from class: edk
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        edxVar.ai.a().a();
                        edxVar.ak.a();
                        edxVar.S.a().l().Pk(new Runnable(new WeakReference(edxVar.aj)) { // from class: edh
                            private final WeakReference a;

                            {
                                this.a = r1;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                WeakReference weakReference = this.a;
                                int i2 = edx.aU;
                                dxio dxioVar2 = (dxio) weakReference.get();
                                if (dxioVar2 != null) {
                                    ((ina) dxioVar2.a()).a();
                                }
                            }
                        }, edxVar.av);
                    }
                });
                final dxio<ahjq> dxioVar2 = this.O;
                dxioVar2.getClass();
                this.t.a().i(new Runnable(dxioVar2) { // from class: edl
                    private final dxio a;

                    {
                        this.a = dxioVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, this.av);
                cxdy e4 = bvmo.e("GmmActivity::callCurvularEnvironmentViewHierarchyFactory");
                this.Z.a().g();
                bvmo.f(e4);
                if (bundle2 == null) {
                    this.av.execute(new edr(this));
                }
                Runnable a2 = this.v.a().a(this.w.a());
                if (a2 != null) {
                    this.t.a().k(a2, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                }
                this.t.a().k(new Runnable(this) { // from class: edm
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        if (edxVar.aM) {
                            return;
                        }
                        edxVar.aS.a().d(edxVar.al.a().i(), edxVar.au);
                        edxVar.aL = true;
                    }
                }, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                setTheme(R.style.GmmDayNightTheme);
                this.aD.b();
                final efz a3 = this.af.a();
                a3.c.a().c = false;
                a3.c.a().f = bundle2 == null;
                a3.r.a().j(new Runnable(a3) { // from class: efy
                    private final efz a;

                    {
                        this.a = a3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c.a().i = true;
                    }
                }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
                a3.a.setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, a3.a.getResources().getColor(R.color.quantum_googblue)));
                isj a4 = a3.i.a();
                Application application = a3.a.getApplication();
                if (!a4.b) {
                    application.registerActivityLifecycleCallbacks(a4);
                    a4.b = true;
                }
                ita itaVar = a3.n;
                ((isz) itaVar).b.set(true);
                for (itb itbVar : ((isz) itaVar).a.values()) {
                    synchronized (itbVar) {
                        if (!itbVar.v()) {
                            itbVar.getClass();
                            itbVar.Ns();
                            itbVar.y(true);
                        }
                    }
                }
                a3.o.a().a(bundle2);
                cxdy e5 = bvmo.e("GmmActivity::super.onCreate");
                super.onCreate(bundle2);
                bvmo.f(e5);
                this.aF.a();
                if (bundle2 == null) {
                    this.bh = efz.b(this);
                } else {
                    this.bh = bundle2.getString("ON_SAVED_INSTANCE_STATE_REFERRER_KEY");
                }
                this.t.a().k(new Runnable(this) { // from class: edn
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cjyh a5 = this.a.K.a();
                        if (Build.VERSION.SDK_INT < 28 || !a5.d.a().getAssistantParameters().b) {
                            a5.g = deha.a(false);
                            return;
                        }
                        arne a6 = a5.b.a();
                        if (a6.a()) {
                            arng arngVar = a6.a;
                            if (arngVar.c == null) {
                                arnf arnfVar = new arnf(arngVar, a6);
                                Intent intent = new Intent();
                                intent.setPackage("com.google.android.googlequicksearchbox");
                                intent.setAction("com.google.android.apps.gsa.opa.BT_LATENCY_SERVICE");
                                if (arngVar.a.bindService(intent, arnfVar, 1)) {
                                    arngVar.b = arnfVar;
                                    a6.b(2);
                                }
                            }
                            a6.b(1);
                        }
                        a5.c();
                    }
                }, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                bvoj.a(this);
                this.J.a().a(bundle2);
                this.I.a().a();
                cxdy e6 = bvmo.e("GmmActivity::onCreateInternal");
                setVolumeControlStream(3);
                cxdy e7 = bvmo.e("GmmActivity::setContentView");
                LayoutInflater.from(this).inflate(R.layout.base_gmmactivity_internal, this.I.a().i());
                bvmo.f(e7);
                this.af.a().h.a().c();
                this.aO = (MainLayout) findViewById(R.id.mainmap_container);
                this.aA.a().a = this.aO.as.e;
                edu eduVar = this.aR;
                dceq a5 = dcet.a();
                a5.b(dcpy.class, new edz(0, dcpy.class, eduVar));
                a5.b(bvpc.class, new edz(bvpc.class, eduVar, bvrj.UI_THREAD));
                a5.b(awnt.class, new edz(2, awnt.class, eduVar));
                a5.b(AndroidIntentEvent.class, new edz(3, AndroidIntentEvent.class, eduVar));
                a5.b(PseudoTrackDirectionsEvent.class, new edz(4, PseudoTrackDirectionsEvent.class, eduVar));
                a5.b(GmmCarProjectionStateEvent.class, new edz(5, GmmCarProjectionStateEvent.class, eduVar));
                this.B.a().g(eduVar, a5.a());
                final eet a6 = this.G.a();
                bvqj.c(((hwd) a6.a.b(32)).n(), new bvqg(a6) { // from class: eep
                    private final eet a;

                    {
                        this.a = a6;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        final eet eetVar = this.a;
                        akox akoxVar = (akox) obj;
                        if (!eetVar.c.a().getHomeScreenParameters().j) {
                            eetVar.a.b(40);
                        } else {
                            eetVar.b.j(new Runnable(eetVar) { // from class: eer
                                private final eet a;

                                {
                                    this.a = eetVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.a.b(40);
                                }
                            }, bvrj.UI_THREAD, bvkw.ON_FIRST_TRANSITION_COMPLETE);
                        }
                        eetVar.b.j(new Runnable(eetVar) { // from class: ees
                            private final eet a;

                            {
                                this.a = eetVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                eet eetVar2 = this.a;
                                if (eetVar2.a.c()) {
                                    eetVar2.a.b(54);
                                    eetVar2.a.b(19);
                                    eetVar2.a.b(80);
                                    eetVar2.a.b(84);
                                    eetVar2.a.b(13);
                                    eetVar2.a.b(41);
                                    eetVar2.a.b(47);
                                    eetVar2.a.b(3);
                                    eetVar2.a.b(29);
                                    eetVar2.a.b(66);
                                    eetVar2.a.b(33);
                                }
                            }
                        }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
                    }
                }, dege.a);
                a6.b.j(new Runnable(a6) { // from class: eeq
                    private final eet a;

                    {
                        this.a = a6;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        eet eetVar = this.a;
                        if (eetVar.a.c()) {
                            eetVar.a.b(23);
                            eetVar.a.b(1);
                            eetVar.a.b(76);
                            eetVar.a.b(30);
                            eetVar.a.b(57);
                            eetVar.a.b(37);
                            eetVar.a.b(53);
                            eetVar.a.b(88);
                            eetVar.a.b(17);
                            eetVar.a.b(46);
                            eetVar.a.b(8);
                            eetVar.a.b(42);
                            eetVar.a.b(51);
                            eetVar.a.b(44);
                            eetVar.a.b(67);
                            eetVar.a.b(74);
                            eetVar.a.b(81);
                            eetVar.a.b(85);
                            eetVar.a.b(86);
                            eetVar.a.b(64);
                            eetVar.a.b(52);
                            eetVar.a.b(28);
                            eetVar.a.b(38);
                            eetVar.a.b(36);
                            eetVar.a.b(Integer.valueOf((int) com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu));
                            if (eetVar.c.a().getStreetViewLayerParameters().a) {
                                eetVar.a.b(96);
                            }
                            if (!eetVar.c.a().getEnableFeatureParameters().br) {
                                return;
                            }
                            eetVar.a.b(Integer.valueOf((int) com.google.android.filament.R.styleable.AppCompatTheme_textColorSearchUrl));
                        }
                    }
                }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
                if (bundle2 != null) {
                    this.W.a().l(bundle2);
                }
                this.V.a().m((TextView) this.aO.findViewById(R.id.map_copyright_content));
                if (this.F.a().f && this.n.a().e() != null && !this.H.a().a()) {
                    this.n.a().d(false);
                }
                bvmo.f(e6);
                if (!this.an.a().a()) {
                    rd.n(1);
                } else {
                    this.ao.a().a();
                }
                gcm a7 = this.ap.a();
                a7.a.g().am(a7.b, true);
                if (this.D.a().b()) {
                    this.C.a().ao(bvjk.g);
                }
                ily.a(this);
                this.aC.x();
                if (bundle2 == null) {
                    onNewIntent(getIntent());
                    if (!this.F.a().d) {
                        this.aw.a().b(false, elapsedRealtime, this.aI.a(be));
                    }
                } else {
                    this.aw.a().b(true, elapsedRealtime, this.aI.a(be));
                }
                this.t.a().j(new glm(this.Z.a().o()), bvrj.BACKGROUND_THREADPOOL, bvkw.ON_STARTUP_FULLY_COMPLETE);
                o(getWindow(), v());
                this.bl = new auev(new Runnable(this) { // from class: edo
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        edxVar.o(edxVar.getWindow(), edxVar.v());
                        edxVar.M.a();
                        cqkx.b();
                    }
                }, this.au);
                this.bm = new eds(this);
                this.aw.a().j(false);
                this.t.a().i(new Runnable(this) { // from class: edp
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        if (edxVar.u.a().getEnableFeatureParameters().aV) {
                            edxVar.ax.a().a();
                        }
                    }
                }, this.av);
                if (this.C.a().m(bvjk.m, false) && this.C.a().m(bvjk.k, false)) {
                    rU.o(ckja.P, 1L);
                    rU.s(ckfn.s, this.C.a().s(bvjk.t, 0));
                    this.C.a().P(bvjk.k);
                }
                if (!this.C.a().m(bvjk.m, false)) {
                    if (this.C.a().m(bvjk.l, false)) {
                        rU.o(ckja.Q, 1L);
                        this.C.a().P(bvjk.l);
                    }
                    if (this.C.a().m(bvjk.u, false)) {
                        rU.o(ckfn.v, 1L);
                        this.C.a().S(bvjk.u, false);
                    }
                }
                this.t.a().k(new Runnable(this) { // from class: ecu
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dehn a8;
                        try {
                            final hum a9 = this.a.aq.a();
                            try {
                                bbo bboVar = new bbo();
                                bboVar.e("worker_name_key", "NotificationOptOutChangeLoggingWorker");
                                bbp a10 = bboVar.a();
                                bbk bbkVar = new bbk();
                                bbkVar.c = 2;
                                bbkVar.a = false;
                                final bci f = new bch(GmmWorkerWrapper.class, 1L, TimeUnit.DAYS).d("NOTIFICATION_OPT_OUT_CHANGE_LOGGER").c(a10).b(bbkVar.a()).f();
                                a8 = deew.h(a9.a.a().f("NOTIFICATION_OPT_OUT_CHANGE_LOGGER", 2, f).a(), new dbrn(a9, f) { // from class: hul
                                    private final hum a;
                                    private final bci b;

                                    {
                                        this.a = a9;
                                        this.b = f;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        hum humVar = this.a;
                                        try {
                                            return this.b.a;
                                        } catch (RuntimeException e8) {
                                            humVar.b.c(12, e8);
                                            return bbx.c();
                                        }
                                    }
                                }, dege.a);
                            } catch (RuntimeException e8) {
                                a9.b.c(12, e8);
                                a8 = deha.a(bbx.c());
                            }
                            a8.get();
                        } catch (InterruptedException | ExecutionException unused2) {
                        }
                    }
                }, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                this.t.a().k(new Runnable(this, rU) { // from class: ecv
                    private final edx a;
                    private final ckcw b;

                    {
                        this.a = this;
                        this.b = rU;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        ckcw ckcwVar = this.b;
                        if (edxVar.C.a().i(bvjk.bv)) {
                            ckcwVar.o(ckja.al, edxVar.C.a().s(bvjk.bv, 0));
                            edxVar.C.a().P(bvjk.bv);
                        }
                    }
                }, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
            } else {
                Intent intent = getIntent();
                if (intent != null) {
                    this.aH.e(intent);
                }
                super.onCreate(null);
                this.bi = true;
                this.aH.f();
                finish();
            }
        } finally {
            bvmo.f(e);
            bvmo.d(bvmo.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onDestroy() {
        this.aM = true;
        if (!this.bf.a(2, 1)) {
            super.onDestroy();
            return;
        }
        atbs atbsVar = this.ay;
        if (atbsVar != null) {
            atbsVar.l(false, false, false);
        }
        dxio<acys> dxioVar = this.aw;
        if (dxioVar != null && dxioVar.a() != null) {
            this.aw.a().d();
        }
        if (this.bi) {
            this.bi = false;
            super.onDestroy();
            return;
        }
        this.aG.a().d();
        this.s.a().b(0.0f);
        efz a = this.af.a();
        a.c.a().c = true;
        a.g.a().c();
        cqkx.b.d();
        a.h.a().d();
        isz iszVar = (isz) a.n;
        iszVar.g.set(true);
        for (itb itbVar : iszVar.a.values()) {
            synchronized (itbVar) {
                if (itbVar.x()) {
                    dcqe.b.v(dcqz.MEDIUM);
                    itbVar.getClass();
                    itbVar.PY();
                    itbVar.A(false);
                }
                if (itbVar.w()) {
                    dcqe.b.v(dcqz.MEDIUM);
                    itbVar.getClass();
                    itbVar.Po();
                    itbVar.z(false);
                }
                if (itbVar.v()) {
                    itbVar.Nu();
                    itbVar.y(false);
                }
            }
        }
        iszVar.a.clear();
        iszVar.b.set(false);
        iszVar.g.set(false);
        this.t.a().b();
        this.B.a().a(this.aR);
        this.J.a().d();
        this.I.a().h();
        this.aD.c();
        gcm a2 = this.ap.a();
        a2.a.g().an(a2.b);
        if (this.aL) {
            this.aS.a().c(this.al.a().i());
        }
        ScheduledFuture<?> scheduledFuture = this.bk;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        super.onDestroy();
    }

    @Override // defpackage.rb, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.F.a().b || !this.Y.a().a()) {
            if (i == 25) {
                if (this.L.a().m(false)) {
                    return true;
                }
                i = 25;
            }
            if (i == 24 && this.L.a().m(true)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.F.a().a) {
            return false;
        }
        if (!this.D.a().b() || i != 82) {
            return super.onKeyUp(i, keyEvent);
        }
        this.B.a().b(new gdt());
        return true;
    }

    @Override // defpackage.ff, android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // defpackage.ff, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        atbs atbsVar = this.ay;
        if (atbsVar.g(this.F.a().b(), z)) {
            atbsVar.d.a().b(crih.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onNewIntent(Intent intent) {
        bvmo.c(bvmo.f);
        cxdy e = bvmo.e("GmmActivity::onNewIntent");
        try {
            super.onNewIntent(intent);
            if (this.aH.a()) {
                this.aH.e(intent);
            } else if (!this.S.a().d() || this.al.a().q(intent)) {
                setIntent(intent);
                this.bh = efz.b(this);
                bvjz e2 = this.Q.a().e(intent, this.bh);
                this.bj = e2;
                this.aK = e2 == null ? null : e2.b();
                boolean z = true;
                if (this.F.a().f) {
                    if (O()) {
                        this.V.a().q(true);
                    }
                    this.t.a().k(new Runnable(this) { // from class: edb
                        private final edx a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            edx edxVar = this.a;
                            edxVar.V.a().q(false);
                            edxVar.V.a().j();
                        }
                    }, this.au, bvkw.ON_STARTUP_FULLY_COMPLETE);
                }
                if (this.aK == durz.EIT_MAIN) {
                    z = false;
                }
                this.F.a().d = z;
                if (z) {
                    if (!this.S.a().d()) {
                        this.S.a().a();
                    }
                    this.C.a().Z(bvjk.gp, this.r.a().b());
                }
                this.aE.a(this.bj);
            }
        } finally {
            bvmo.f(e);
            bvmo.d(bvmo.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.ff, android.app.Activity
    public final void onPause() {
        if (!this.bf.a(4, 3)) {
            super.onPause();
        } else if (this.bi) {
            super.onPause();
        } else {
            this.I.a().f();
            this.J.a().c();
            this.K.a().a();
            efz a = this.af.a();
            a.c.a().a = false;
            a.c.a().f = false;
            isz iszVar = (isz) a.n;
            iszVar.e.set(true);
            for (itb itbVar : iszVar.a.values()) {
                synchronized (itbVar) {
                    if (itbVar.x()) {
                        itbVar.PY();
                        itbVar.A(false);
                    }
                }
            }
            iszVar.d.set(false);
            iszVar.e.set(false);
            ((ckhe) this.ae.a(ckgh.aK)).c();
            ((ckgv) this.ae.a(ckgh.aJ)).b();
            ((ckgv) this.ae.a(ckgh.aJ)).c();
            super.onPause();
        }
    }

    @Override // defpackage.ff, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        atbs atbsVar = this.ay;
        atbsVar.l(this.F.a().b(), z, atbs.j(this));
        if (atbsVar.a() && !z) {
            atbs.m(this, 0);
        }
        P(z, this.F.a().b);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        this.af.a().e.a().g().d(cjtd.a(dtxw.eg));
        assistContent.setStructuredData(this.U.a().aj().ac());
    }

    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.af.a().f.a().e(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        bvmo.c(bvmo.d);
        super.onRestart();
        ScheduledFuture<?> scheduledFuture = this.bk;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.aw.a().c();
        bvmo.d(bvmo.d);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        if (!N(bundle)) {
            super.onRestoreInstanceState(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x030f, code lost:
        if (r19.W.a().j() != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0322 A[Catch: all -> 0x038a, TryCatch #3 {all -> 0x038a, blocks: (B:3:0x000d, B:7:0x0023, B:10:0x0028, B:12:0x0056, B:13:0x0066, B:93:0x0279, B:94:0x02ad, B:96:0x02b3, B:97:0x02bc, B:108:0x02d8, B:110:0x02ee, B:112:0x02f2, B:116:0x0316, B:118:0x0322, B:120:0x0330, B:122:0x0336, B:124:0x033c, B:126:0x0342, B:131:0x034d, B:132:0x037c, B:113:0x0303, B:115:0x0311, B:16:0x0071, B:18:0x0081, B:20:0x0087, B:22:0x008f, B:23:0x0096, B:25:0x009e, B:27:0x00a3, B:29:0x00a8, B:31:0x00ad, B:33:0x00bc, B:36:0x00d0, B:58:0x0127, B:60:0x0157, B:62:0x0165, B:65:0x017d, B:67:0x0189, B:68:0x018f, B:70:0x01ad, B:74:0x01bb, B:76:0x01bf, B:77:0x01c5, B:79:0x01d5, B:80:0x01db, B:81:0x01f0, B:83:0x0200, B:85:0x0214, B:87:0x023a, B:88:0x0240, B:90:0x0250, B:91:0x0256, B:92:0x026b, B:49:0x00f1, B:41:0x00e2, B:39:0x00de, B:45:0x00e9, B:51:0x0101, B:53:0x010b, B:57:0x0118, B:30:0x00ab, B:26:0x00a1, B:98:0x02bd, B:100:0x02c3, B:102:0x02c9, B:103:0x02d3), top: B:142:0x000d, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d A[Catch: all -> 0x038a, TryCatch #3 {all -> 0x038a, blocks: (B:3:0x000d, B:7:0x0023, B:10:0x0028, B:12:0x0056, B:13:0x0066, B:93:0x0279, B:94:0x02ad, B:96:0x02b3, B:97:0x02bc, B:108:0x02d8, B:110:0x02ee, B:112:0x02f2, B:116:0x0316, B:118:0x0322, B:120:0x0330, B:122:0x0336, B:124:0x033c, B:126:0x0342, B:131:0x034d, B:132:0x037c, B:113:0x0303, B:115:0x0311, B:16:0x0071, B:18:0x0081, B:20:0x0087, B:22:0x008f, B:23:0x0096, B:25:0x009e, B:27:0x00a3, B:29:0x00a8, B:31:0x00ad, B:33:0x00bc, B:36:0x00d0, B:58:0x0127, B:60:0x0157, B:62:0x0165, B:65:0x017d, B:67:0x0189, B:68:0x018f, B:70:0x01ad, B:74:0x01bb, B:76:0x01bf, B:77:0x01c5, B:79:0x01d5, B:80:0x01db, B:81:0x01f0, B:83:0x0200, B:85:0x0214, B:87:0x023a, B:88:0x0240, B:90:0x0250, B:91:0x0256, B:92:0x026b, B:49:0x00f1, B:41:0x00e2, B:39:0x00de, B:45:0x00e9, B:51:0x0101, B:53:0x010b, B:57:0x0118, B:30:0x00ab, B:26:0x00a1, B:98:0x02bd, B:100:0x02c3, B:102:0x02c9, B:103:0x02d3), top: B:142:0x000d, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200 A[Catch: all -> 0x038a, TryCatch #3 {all -> 0x038a, blocks: (B:3:0x000d, B:7:0x0023, B:10:0x0028, B:12:0x0056, B:13:0x0066, B:93:0x0279, B:94:0x02ad, B:96:0x02b3, B:97:0x02bc, B:108:0x02d8, B:110:0x02ee, B:112:0x02f2, B:116:0x0316, B:118:0x0322, B:120:0x0330, B:122:0x0336, B:124:0x033c, B:126:0x0342, B:131:0x034d, B:132:0x037c, B:113:0x0303, B:115:0x0311, B:16:0x0071, B:18:0x0081, B:20:0x0087, B:22:0x008f, B:23:0x0096, B:25:0x009e, B:27:0x00a3, B:29:0x00a8, B:31:0x00ad, B:33:0x00bc, B:36:0x00d0, B:58:0x0127, B:60:0x0157, B:62:0x0165, B:65:0x017d, B:67:0x0189, B:68:0x018f, B:70:0x01ad, B:74:0x01bb, B:76:0x01bf, B:77:0x01c5, B:79:0x01d5, B:80:0x01db, B:81:0x01f0, B:83:0x0200, B:85:0x0214, B:87:0x023a, B:88:0x0240, B:90:0x0250, B:91:0x0256, B:92:0x026b, B:49:0x00f1, B:41:0x00e2, B:39:0x00de, B:45:0x00e9, B:51:0x0101, B:53:0x010b, B:57:0x0118, B:30:0x00ab, B:26:0x00a1, B:98:0x02bd, B:100:0x02c3, B:102:0x02c9, B:103:0x02d3), top: B:142:0x000d, inners: #0, #2 }] */
    @Override // defpackage.gga, defpackage.ff, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edx.onResume():void");
    }

    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            this.af.a().o.a().b(bundle);
            this.W.a().k(bundle);
            this.J.a().e(bundle);
            bundle.putString("ON_SAVED_INSTANCE_STATE_REFERRER_KEY", this.bh);
            bundle.putLong("ON_SAVED_INSTANCE_STATE_TIME_KEY", this.r.a().b());
            p();
        } catch (Exception unused) {
            String str = "Bundle contents: ";
            for (String str2 : bundle.keySet()) {
                String valueOf = String.valueOf(str);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(str2);
                sb.append(" ");
                str = sb.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStart() {
        Display.Mode mode;
        bvmo.c(bvmo.c);
        cxdy e = bvmo.e("GmmActivity::onStart");
        try {
            super.onStart();
            if (this.bf.a(2, 3)) {
                if (this.aI.a(be)) {
                    findViewById(16908290).getViewTreeObserver().addOnPreDrawListener(new edw(this));
                } else {
                    this.aC.r(ckoh.d);
                }
                if (this.aH.a()) {
                    this.bi = true;
                    this.aH.f();
                    finish();
                } else {
                    this.I.a().b();
                    efz a = this.af.a();
                    a.c.a().b = true;
                    a.c.a().g = true;
                    a.f.a().d();
                    a.j.a().b();
                    a.k.a().g();
                    hut a2 = a.l.a();
                    btrm btrmVar = a2.a;
                    dceq a3 = dcet.a();
                    a3.b(crhp.class, new huu(crhp.class, a2, bvrj.UI_THREAD));
                    btrmVar.g(a2, a3.a());
                    huv a4 = a.m.a();
                    a4.h = a4.b.e();
                    a4.f = a4.a.getResources().getConfiguration().orientation;
                    btrm btrmVar2 = a4.c;
                    dceq a5 = dcet.a();
                    a5.b(crhp.class, new huw(crhp.class, a4, bvrj.UI_THREAD));
                    btrmVar2.g(a4, a5.a());
                    a.p.a().a();
                    a.q.a().f(ckhc.GMM_ACTIVITY);
                    ita itaVar = a.n;
                    ((isz) itaVar).c.set(true);
                    for (itb itbVar : ((isz) itaVar).a.values()) {
                        synchronized (itbVar) {
                            if (itbVar.v() && !itbVar.w()) {
                                itbVar.getClass();
                                itbVar.Nt();
                                itbVar.z(true);
                            }
                        }
                    }
                    a.h.a().a();
                    M();
                    long b = this.r.a().b();
                    long w = this.C.a().w(bvjk.gr, 0L);
                    long w2 = this.C.a().w(bvjk.gq, 0L);
                    long millis = TimeUnit.SECONDS.toMillis(this.u.a().getPromoPresentationParameters().d);
                    if (w == 0 || b - w2 > millis) {
                        this.C.a().Z(bvjk.gr, b);
                    }
                    this.J.a().f();
                    atbs atbsVar = this.ay;
                    atbsVar.h = true;
                    atbsVar.l(true, atbs.k(this), atbs.j(this));
                    if (atbsVar.a()) {
                        atbs.m(this, 0);
                    }
                    getResources().getConfiguration();
                    atbsVar.g = false;
                    P(this.ay.f(this), true);
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    attributes.screenBrightness = -1.0f;
                    getWindow().setAttributes(attributes);
                    if (Build.VERSION.SDK_INT >= 29) {
                        List asList = Arrays.asList(getWindowManager().getDefaultDisplay().getSupportedModes());
                        if (asList.size() == 1) {
                            asList.get(0);
                        } else {
                            Iterator it = asList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    mode = null;
                                    break;
                                }
                                mode = (Display.Mode) it.next();
                                if (mode.getRefreshRate() > 55.0f && mode.getRefreshRate() < 65.0f) {
                                    break;
                                }
                            }
                            if (mode != null) {
                                getWindow().getAttributes().preferredDisplayModeId = mode.getModeId();
                                int i = getWindow().getAttributes().preferredDisplayModeId;
                            }
                        }
                    }
                    this.o.a().d(this.p.a());
                    auev auevVar = this.bl;
                    aufc a6 = this.o.a();
                    boolean z = this.u.a().getHomeScreenParameters().k;
                    auevVar.b = true;
                    if (z) {
                        auevVar.On(a6.i());
                        a6.i().a(auevVar, auevVar.a);
                    } else {
                        a6.i().d(auevVar, auevVar.a);
                    }
                    if (this.an.a().a()) {
                        this.ao.a().g().d(this.bm, this.au);
                        this.ao.a().b(this);
                    }
                    getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(ibm.b().b(this)));
                    dbsg<gli> a7 = this.az.a();
                    if (((Boolean) a7.h(ecw.a).c(false)).booleanValue()) {
                        a7.b().c();
                    }
                    final ckcy ckcyVar = bvmo.g;
                    if (ckcyVar != null) {
                        ckcyVar.getClass();
                        this.t.a().k(new Runnable(ckcyVar) { // from class: ecx
                            private final ckcy a;

                            {
                                this.a = ckcyVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.j();
                            }
                        }, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                        this.ae.b(ckgx.FIRST_VIEWPORT_STATE, new amlz());
                        ckcyVar.k();
                    }
                    final ctu ctuVar = this.aT.a;
                    if (ctuVar.a != null) {
                        ctuVar.b.execute(new Runnable(ctuVar) { // from class: ctt
                            private final ctu a;

                            {
                                this.a = ctuVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                cmpq cmpqVar;
                                cmpn cmpnVar;
                                ctu ctuVar2 = this.a;
                                try {
                                    cmpo cmpoVar = new cmpo(ctuVar2.a);
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    cnwc.i("Calling this from your main thread can lead to deadlock");
                                    synchronized (cmpoVar) {
                                        if (cmpoVar.b) {
                                            cmpoVar.a();
                                        }
                                        Context context = cmpoVar.d;
                                        try {
                                            context.getPackageManager().getPackageInfo("com.android.vending", 0);
                                            int j = cnmr.d.j(context, 12451000);
                                            if (j != 0 && j != 2) {
                                                throw new IOException("Google Play services not available");
                                            }
                                            cnml cnmlVar = new cnml();
                                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                                            intent.setPackage("com.google.android.gms");
                                            if (cnxg.a().b(context, intent, cnmlVar, 1)) {
                                                cmpoVar.a = cnmlVar;
                                                cnml cnmlVar2 = cmpoVar.a;
                                                try {
                                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                                    cnwc.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                                    if (!cnmlVar2.a) {
                                                        cnmlVar2.a = true;
                                                        IBinder poll = cnmlVar2.b.poll(10000L, timeUnit);
                                                        if (poll == null) {
                                                            throw new TimeoutException("Timed out waiting for the service connection");
                                                        }
                                                        IInterface queryLocalInterface = poll.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                                        if (queryLocalInterface instanceof cmpq) {
                                                            cmpqVar = (cmpq) queryLocalInterface;
                                                        } else {
                                                            cmpqVar = new cmpq(poll);
                                                        }
                                                        cmpoVar.e = cmpqVar;
                                                        cmpoVar.b = true;
                                                    } else {
                                                        throw new IllegalStateException("Cannot call get on this connection more than once");
                                                    }
                                                } catch (InterruptedException unused) {
                                                    throw new IOException("Interrupted exception");
                                                } catch (Throwable th) {
                                                    throw new IOException(th);
                                                }
                                            } else {
                                                throw new IOException("Connection failure");
                                            }
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            throw new cnni();
                                        }
                                    }
                                    cnwc.i("Calling this from your main thread can lead to deadlock");
                                    synchronized (cmpoVar) {
                                        if (cmpoVar.b) {
                                            cnwc.a(cmpoVar.a);
                                            cnwc.a(cmpoVar.e);
                                            try {
                                                cmpnVar = new cmpn(cmpoVar.e.e(), cmpoVar.e.f());
                                            } catch (RemoteException unused3) {
                                                throw new IOException("Remote exception");
                                            }
                                        } else {
                                            synchronized (cmpoVar.c) {
                                                throw new IOException("AdvertisingIdClient is not connected.");
                                            }
                                        }
                                    }
                                    synchronized (cmpoVar.c) {
                                    }
                                    cmpo.b(cmpnVar, SystemClock.elapsedRealtime() - elapsedRealtime, null);
                                    cmpoVar.a();
                                    if (!cmpnVar.b) {
                                        ctuVar2.c.j(cmpnVar.a);
                                    } else {
                                        ctuVar2.c.cancel(true);
                                    }
                                } catch (cnni | cnnj | IOException unused4) {
                                }
                            }
                        });
                    }
                    this.t.a().k(new Runnable(this) { // from class: ecy
                        private final edx a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            edx edxVar = this.a;
                            Application application = edxVar.getApplication();
                            int i2 = 1;
                            if (!bvrn.a(application).contains("classnotfound_exception_marker")) {
                                i2 = 3;
                            } else if (!bvrn.a(application).getBoolean("classnotfound_exception_marker", true)) {
                                bvrn.a(application).edit().remove("classnotfound_exception_marker").commit();
                                i2 = 2;
                            }
                            if (i2 != 3) {
                                edxVar.ae.s(ckja.o, i2 - 1);
                            }
                        }
                    }, this.av, bvkw.ON_STARTUP_FULLY_COMPLETE);
                    this.aJ = true;
                }
            }
        } finally {
            bvmo.f(e);
            bvmo.d(bvmo.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStop() {
        if (!this.bf.a(3, 2)) {
            super.onStop();
        } else if (this.bi) {
            this.bi = false;
            super.onStop();
        } else {
            this.w.a().J(dukj.APP_BACKGROUNDED);
            efz a = this.af.a();
            a.c.a().b = false;
            a.k.a().h();
            hut a2 = a.l.a();
            a2.a.a(a2);
            a2.a();
            for (Map.Entry<hus, Long> entry : a2.e.entrySet()) {
                if (entry.getValue() != null && entry.getValue().longValue() > 0) {
                    a2.b.b(ckgx.DEVICE_ORIENTATION_TIME, new hur(entry));
                    ((ckcp) a2.b.a(ckjg.b)).a(entry.getValue().longValue());
                }
            }
            huv a3 = a.m.a();
            a3.c.a(a3);
            a3.a();
            for (Map.Entry<ckjf, Long> entry2 : a3.e.entrySet()) {
                if (entry2.getValue() != null && entry2.getValue().longValue() > 0) {
                    ((ckcp) a3.d.a(ckjg.c)).b(entry2.getKey().g, entry2.getValue().longValue());
                }
            }
            a3.e.clear();
            a.h.a().b();
            isz iszVar = (isz) a.n;
            iszVar.f.set(true);
            for (itb itbVar : iszVar.a.values()) {
                synchronized (itbVar) {
                    if (itbVar.w()) {
                        itbVar.Po();
                        itbVar.z(false);
                    }
                }
            }
            iszVar.c.set(false);
            iszVar.f.set(false);
            a.p.a().d();
            a.q.a().g(ckhc.GMM_ACTIVITY);
            this.A.a().d();
            cjxd a4 = this.y.a();
            Dialog dialog = a4.c;
            if (dialog != null && dialog.isShowing()) {
                a4.c.dismiss();
                a4.c = null;
            }
            auev auevVar = this.bl;
            this.o.a().i().c(auevVar);
            auevVar.c = null;
            auevVar.b = false;
            if (this.an.a().a()) {
                this.ao.a().c();
                this.ao.a().g().c(this.bm);
            }
            p();
            atbs atbsVar = this.ay;
            boolean k2 = atbs.k(this);
            if (atbsVar.k && !k2 && atbsVar.i) {
                atbsVar.e.a().S(bvjk.iq, true);
            }
            atbsVar.l(false, k2, atbs.j(this));
            P(this.ay.f(this), false);
            this.I.a().g();
            this.aJ = false;
            this.J.a().g();
            ammc ammcVar = this.bg;
            ammcVar.q(ckgi.a);
            ammcVar.q(ckgi.b);
            ammcVar.q(ckgi.c);
            ammcVar.q(ckgi.h);
            ammcVar.q(ckgi.e);
            p();
            M();
            this.C.a().Z(bvjk.gq, this.r.a().b());
            bvmo.g = new ckcf(this.ae, new cqaz());
            if (this.u.a().getSavedStateExpirationParameters().c) {
                this.bk = this.au.d(new Runnable(this) { // from class: ecz
                    private final edx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        edx edxVar = this.a;
                        if (edxVar.aJ || edxVar.aW.d() == null) {
                            return;
                        }
                        for (fd fdVar : edxVar.g().q()) {
                            if (edxVar.bc.b(fdVar)) {
                                return;
                            }
                        }
                        edxVar.finish();
                    }
                }, this.u.a().getSavedStateExpirationParameters().b, TimeUnit.SECONDS);
            }
            this.aE.b();
            super.onStop();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        cqhw o = this.af.a().g.a().o();
        synchronized (o.c) {
            o.b.b();
            o.a.p();
        }
        cqrt.q();
        if (i != 15 || !this.aH.a()) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.Q.a().k();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        atbs atbsVar = this.ay;
        if (!atbsVar.h) {
            atbsVar.h = true;
        } else if (!atbsVar.a()) {
        } else {
            boolean z = atbsVar.g;
            if (atbsVar.a.a().e() != arym.GUIDED_NAV || atbsVar.b.a().a() || atbsVar.c.a().a() || atbsVar.f.a().a() || !(K() instanceof atbq) || bvrl.b(this)) {
                return;
            }
            try {
                if (!bvrl.a(this, 3, 4)) {
                    return;
                }
                View findViewById = findViewById(R.id.picture_in_picture_cover);
                if (findViewById != null) {
                    findViewById.animate().cancel();
                    findViewById.setVisibility(0);
                    findViewById.setAlpha(1.0f);
                    atbs.m(this, 8000);
                }
                atbsVar.l(true, true, true);
                P(true, this.F.a().b);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.I.a().e(z);
        this.B.a().b(new gdx(z));
    }

    final void p() {
        try {
            final ckcq a = ((ckcr) this.ae.a(ckja.I)).a();
            a.getClass();
            final Runnable runnable = new Runnable(a) { // from class: eda
                private final ckcq a;

                {
                    this.a = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            };
            final bwqv a2 = this.q.a();
            FutureTask futureTask = new FutureTask(new Runnable(a2, runnable) { // from class: bwql
                private final bwqv a;
                private final Runnable b;

                {
                    this.a = a2;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bwqv bwqvVar = this.a;
                    Runnable runnable2 = this.b;
                    bwqvVar.a.b();
                    runnable2.run();
                }
            }, null);
            a2.b.a().b(futureTask, bvrj.GMM_STORAGE);
            futureTask.get(2500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            bvoo.j(new edv(e));
        } catch (ExecutionException e2) {
            e = e2;
            bvoo.j(new edv(e));
        } catch (TimeoutException unused) {
        }
    }

    @Override // defpackage.gga
    protected final void q() {
        this.Y.a().a();
        this.ay.h(this);
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.A.a();
    }

    @Override // defpackage.gga
    public final void s() {
        if (!this.F.a().b || !this.R.a().o()) {
            dbsg<gli> a = this.az.a();
            if (((Boolean) a.h(edf.a).c(false)).booleanValue()) {
                a.b().c();
                return;
            }
            gfq gfqVar = this.af.a().b;
            fd d = gfqVar.d();
            if (d == null) {
                d = gfqVar.b(gfu.ACTIVITY_FRAGMENT);
            }
            if (((d instanceof gfo) && ((gfo) d).e()) || this.E.a().h()) {
                return;
            }
            if (this.F.a().d && this.F.a().e && g().j() == 1) {
                finish();
            }
            String Q = Q();
            try {
                if (g().f()) {
                    return;
                }
                finishAfterTransition();
                return;
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null || !message.startsWith("Wrong state class")) {
                    throw e;
                }
                String Q2 = Q();
                StringBuilder sb = new StringBuilder(String.valueOf(Q).length() + 90 + String.valueOf(Q2).length());
                sb.append("Wrong state class found when popping fragment. Original top fragment: ");
                sb.append(Q);
                sb.append(", new top fragment: ");
                sb.append(Q2);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
        this.R.a().q();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.ay.h = false;
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.aN);
    }

    @Override // defpackage.gga
    public final void u() {
        this.ay.h = false;
    }

    public final boolean v() {
        return this.o.a().b() || (this.an.a().a() && this.ao.a().h());
    }
}
