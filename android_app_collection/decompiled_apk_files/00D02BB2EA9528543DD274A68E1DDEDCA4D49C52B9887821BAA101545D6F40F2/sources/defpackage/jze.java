package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.gmm.car.projected.firstrun.GmmProjectedFirstRunActivity;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jze  reason: default package */
/* loaded from: classes.dex */
public final class jze {
    public boolean A;
    public boolean B;
    @dzsi
    public ClientMode C;
    public boolean D;
    public final crfr G;
    public final jza H;
    private final ktw I;
    private final ksr J;
    private final dxio<aukk> K;
    public final Context a;
    public final cqat b;
    public final ktu c;
    public final Executor d;
    public final bvrb e;
    public final ckcw f;
    public final dxio<ahjq> g;
    public final dxio<btvo> h;
    public final dxio<ckoq> i;
    public final dxio<bvrv> j;
    public final dxio<asio> k;
    public final ktx l;
    public final nls n;
    public final lye o;
    public final kex p;
    public final kfl q;
    public final lxp r;
    public final kfe s;
    public final lww t;
    public final akfa u;
    public final mgl v;
    public final dxio<ksw> w;
    public final ktf x;
    public final kaj y;
    public final NotificationManager z;
    public final jzd m = new jzd(this);
    private int L = 0;
    public int E = -1;
    public final crzp<dcep<ktr>> F = new jzc(this);

    public jze(Application application, cqat cqatVar, kes kesVar, lww lwwVar, btrm btrmVar, bvrb bvrbVar, Executor executor, Executor executor2, bvjj bvjjVar, ckcw ckcwVar, dxio dxioVar, dxio dxioVar2, akfa akfaVar, mgl mglVar, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, dxio dxioVar7, dxio dxioVar8, dxio dxioVar9, dzsj dzsjVar, dxio dxioVar10, ktu ktuVar, ktw ktwVar, ktx ktxVar, arpo arpoVar, Service service, lye lyeVar, kfl kflVar, dxio dxioVar11, kss kssVar, ktf ktfVar, kaj kajVar, dbsg dbsgVar) {
        Context applicationContext = application.getApplicationContext();
        this.a = applicationContext;
        this.b = cqatVar;
        this.e = bvrbVar;
        this.f = ckcwVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = dxioVar4;
        this.j = dxioVar5;
        this.k = dxioVar9;
        this.I = ktwVar;
        this.l = ktxVar;
        this.u = akfaVar;
        this.v = mglVar;
        this.K = dxioVar10;
        this.c = ktuVar;
        this.d = executor;
        this.z = (NotificationManager) applicationContext.getSystemService("notification");
        kfe kfeVar = new kfe(btrmVar);
        this.s = kfeVar;
        this.q = kflVar;
        this.w = dxioVar11;
        this.x = ktfVar;
        this.y = kajVar;
        ket ketVar = new ket(btrmVar, kfeVar, kflVar, dxioVar6);
        vxo vxoVar = new vxo(btsp.c(bvjjVar), btsp.c(akfaVar), null, dbsgVar);
        this.p = new kex(service, ketVar);
        ksr a = kssVar.a(null, vxoVar, 3);
        this.J = a;
        this.o = lyeVar;
        this.G = arpoVar.a(service);
        this.n = new nls(application, (ahjq) dxioVar.a(), akfaVar, executor, (btvo) dxioVar2.a(), btrmVar, ckcwVar, dxioVar7, dxioVar8, dxioVar6, cqatVar, dxioVar3, bvrbVar, a, dzsjVar, arpoVar.a(service));
        this.r = new lxp(lyeVar, application, executor, executor2, cqatVar, btrmVar, bvjjVar, dxioVar6, dxioVar7, dxioVar2, ckcwVar, a, dxioVar10);
        this.t = lwwVar;
        this.H = new jza(kflVar);
    }

    public final void a(String str) {
        PendingIntent activity = PendingIntent.getActivity(this.a, 0, new Intent(this.a, GmmProjectedFirstRunActivity.class).setAction("com.google.android.apps.maps.car.PROJECTED_FIRST_RUN"), 134217728);
        ib ibVar = new ib(this.a);
        ibVar.l(this.a.getResources().getString(R.string.CAR_TITLE_DEFAULT));
        ibVar.k(str);
        ibVar.B = this.a.getResources().getColor(R.color.quantum_googgreen);
        ibVar.w = true;
        ibVar.h(true);
        ibVar.g = activity;
        ibVar.t(2131232729);
        if (ako.a()) {
            this.K.a().a(false);
            ibVar.G = "OtherChannel";
        }
        this.z.notify(dpyv.CAR_ROADBLOCK_FIRST_RUN.dm, ibVar.b());
        this.L++;
    }

    public final void b(ClientMode clientMode) {
        f();
        if (clientMode.a == 1) {
            c();
        } else {
            d();
        }
        this.C = null;
    }

    public final void c() {
        kaj kajVar = this.y;
        kajVar.a.a(kajVar);
        this.l.a();
        this.o.n(null);
        kex kexVar = this.p;
        kexVar.a();
        kexVar.b.d();
    }

    public final void d() {
        asio a = this.k.a();
        if (!a.b) {
            return;
        }
        a.b = false;
        a.a.b(new asin());
    }

    public final void e(ClientMode clientMode) {
        ddho ddhoVar;
        nls nlsVar = this.n;
        bvrj.UI_THREAD.c();
        dbsk.l(nlsVar.e == null);
        dbsk.s(clientMode);
        nlsVar.e = clientMode;
        nlsVar.a();
        nlsVar.c.a().v();
        nlz nlzVar = nlsVar.g;
        dbsk.s(nlzVar);
        final nlg nlgVar = nlsVar.h;
        nlgVar.getClass();
        nlzVar.b(new nly(nlgVar) { // from class: nlp
            private final nlg a;

            {
                this.a = nlgVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[LOOP:1: B:22:0x0073->B:24:0x0079, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[SYNTHETIC] */
            @Override // defpackage.nly
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.dcdc r15) {
                /*
                    Method dump skipped, instructions count: 344
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nlp.a(dcdc):void");
            }
        });
        nlr nlrVar = nlsVar.d;
        nlrVar.e = true;
        if (nlrVar.d) {
            nlrVar.f();
        }
        int i = clientMode.a;
        if (i == 1) {
            ddhoVar = dtxm.ew;
        } else {
            ddhoVar = i == 2 ? dtye.e : null;
        }
        if (ddhoVar != null) {
            nlsVar.b.a().g().d(cjtd.a(ddhoVar));
        }
        ktw ktwVar = this.I;
        boolean z = this.D;
        ktwVar.a(clientMode);
        if (clientMode.a == 1) {
            ktwVar.b = z;
        }
        lxp lxpVar = this.r;
        dbsk.l(lxpVar.n);
        lxpVar.n = false;
        lxpVar.m(1);
        if (lxpVar.a.f()) {
            lxpVar.d();
        } else if (!lxpVar.l) {
            btrm btrmVar = lxpVar.e;
            dceq a = dcet.a();
            a.b(lzg.class, new lxq(lzg.class, lxpVar, bvrj.UI_THREAD));
            btrmVar.g(lxpVar, a.a());
            lxpVar.l = true;
        }
        lww lwwVar = this.t;
        dbsk.l(!lwwVar.g);
        lwwVar.g = true;
        btrm btrmVar2 = lwwVar.f;
        lwv lwvVar = lwwVar.j;
        dceq a2 = dcet.a();
        a2.b(crhp.class, new lxc(crhp.class, lwvVar, bvrj.CURRENT));
        btrmVar2.g(lwvVar, a2.a());
    }

    public final void f() {
        lww lwwVar = this.t;
        dbsk.l(lwwVar.g);
        lwwVar.f.a(lwwVar.j);
        lwwVar.g = false;
        lxp lxpVar = this.r;
        dbsk.l(!lxpVar.n);
        if (lxpVar.l) {
            lxq.b(lxpVar.e, lxpVar);
            lxpVar.l = false;
        }
        lxpVar.g();
        lxpVar.h();
        lxpVar.n = true;
        this.I.a(null);
        nls nlsVar = this.n;
        bvrj.UI_THREAD.c();
        dbsk.s(nlsVar.e);
        nlr nlrVar = nlsVar.d;
        if (nlrVar.d) {
            nlrVar.d = false;
            nlrVar.g();
        }
        nlrVar.e = false;
        nlsVar.a();
        nlz nlzVar = nlsVar.g;
        dbsk.s(nlzVar);
        nlzVar.d();
        nlsVar.c.a().w();
        nlsVar.e = null;
    }
}
