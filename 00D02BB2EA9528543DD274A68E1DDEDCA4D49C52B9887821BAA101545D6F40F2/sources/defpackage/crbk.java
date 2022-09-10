package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Vibrator;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: crbk  reason: default package */
/* loaded from: classes.dex */
public final class crbk implements cref {
    public static final /* synthetic */ int m = 0;
    private final crek A;
    public final crbl a;
    public final crbl b;
    public final crbl c;
    public final Application d;
    public final btrm e;
    public final bvjj f;
    public final crox g;
    public final bvrb h;
    public final creb i;
    public final dxio<? extends crdh> j;
    public final dxio<crdi> k;
    private final btvo p;
    private final crem q;
    private final crfm r;
    private final crfe s;
    private final crer t;
    private final crco u;
    @dzsi
    private crbr v;
    @dzsi
    private BroadcastReceiver w;
    @dzsi
    private crfj x;
    @dzsi
    private crde y;
    @dzsi
    private crde z;
    private static final crec o = new crbh();
    static final Set<crfi> l = EnumSet.of(crfi.PREPARE, crfi.ACT, crfi.SUCCESS, crfi.OTHER_WITH_LOCALIZED_NAME);

    public crbk(Application application, bvrb bvrbVar, btrm btrmVar, bvjj bvjjVar, btvo btvoVar, cqat cqatVar, crco crcoVar, bvsl bvslVar, crfm crfmVar, ckuq ckuqVar, crem cremVar, crer crerVar, crox croxVar, dxio<crdi> dxioVar, dxio<crbu> dxioVar2) {
        crcj crcjVar = new crcj(application.getResources(), crcoVar, bvjjVar);
        crdf crdfVar = new crdf(application.getResources(), crcoVar, bvjjVar);
        crdy crdyVar = new crdy((Vibrator) application.getSystemService("vibrator"));
        crfc crfcVar = new crfc(application, bvslVar);
        int i = 0;
        crfa[] crfaVarArr = {crfcVar.c, crfcVar.d, crfcVar.e, crfcVar.f};
        int[] iArr = {R.plurals.DA_SPEECH_IN_X_METERS, R.plurals.DA_SPEECH_CONTINUE_FOR_X_METERS, R.plurals.DA_SPEECH_CONTINUE_ON_ROAD_FOR_X_METERS, R.plurals.DA_YOUR_DESTINATION_IS_X_METERS_AHEAD};
        int[] iArr2 = {R.plurals.DA_SPEECH_IN_X_KILOMETERS, R.plurals.DA_SPEECH_CONTINUE_FOR_X_KILOMETERS, R.plurals.DA_SPEECH_CONTINUE_ON_ROAD_FOR_X_KILOMETERS, R.plurals.DA_YOUR_DESTINATION_IS_X_KILOMETERS_AHEAD};
        int[] iArr3 = {R.string.DA_SPEECH_IN_ONE_AND_A_HALF_KILOMETERS, R.string.DA_SPEECH_CONTINUE_FOR_ONE_AND_A_HALF_KILOMETERS, R.string.DA_SPEECH_CONTINUE_ON_ROAD_FOR_ONE_AND_A_HALF_KILOMETERS, R.string.DA_YOUR_DESTINATION_IS_ONE_AND_A_HALF_KILOMETERS_AHEAD};
        while (i < 4) {
            crfaVarArr[i].add(new crey(crfcVar, 95, iArr[i], (Integer) 50));
            crfaVarArr[i].add(new crey(crfcVar, 145, iArr[i], (Integer) 100));
            crfaVarArr[i].add(new crey(crfcVar, 190, iArr[i], (Integer) 150));
            crfaVarArr[i].add(new crey(crfcVar, 280, iArr[i], (Integer) 200));
            crfaVarArr[i].add(new crey(crfcVar, 370, iArr[i], Integer.valueOf((int) cpnx.a)));
            crfaVarArr[i].add(new crey(crfcVar, 460, iArr[i], (Integer) 400));
            crfaVarArr[i].add(new crey(crfcVar, 550, iArr[i], (Integer) 500));
            crfaVarArr[i].add(new crey(crfcVar, 750, iArr[i], (Integer) 600));
            crfaVarArr[i].add(new crey(crfcVar, 950, iArr[i], (Integer) 800));
            crfaVarArr[i].add(new crfb(crfcVar, 1300, iArr2[i], 1000.0f));
            crfaVarArr[i].add(new crey(crfcVar, 1850, iArr3[i], (Integer) null));
            crfaVarArr[i].add(new crfb(crfcVar, Integer.MAX_VALUE, iArr2[i], 1000.0f));
            i++;
            crdyVar = crdyVar;
            crdfVar = crdfVar;
            crcjVar = crcjVar;
        }
        crcj crcjVar2 = crcjVar;
        crdf crdfVar2 = crdfVar;
        crdy crdyVar2 = crdyVar;
        crfa[] crfaVarArr2 = {crfcVar.g, crfcVar.h, crfcVar.i, crfcVar.j};
        int[] iArr4 = {R.plurals.DA_SPEECH_IN_X_FEET, R.plurals.DA_SPEECH_CONTINUE_FOR_X_FEET, R.plurals.DA_SPEECH_CONTINUE_ON_ROAD_FOR_X_FEET, R.plurals.DA_YOUR_DESTINATION_IS_X_FEET_AHEAD};
        int[] iArr5 = {R.plurals.DA_SPEECH_IN_X_MILES, R.plurals.DA_SPEECH_CONTINUE_FOR_X_MILES, R.plurals.DA_SPEECH_CONTINUE_ON_ROAD_FOR_X_MILES, R.plurals.DA_YOUR_DESTINATION_IS_X_MILES_AHEAD};
        int[] iArr6 = {R.string.DA_SPEECH_IN_A_QUARTER_MILE, R.string.DA_SPEECH_CONTINUE_FOR_A_QUARTER_MILE, R.string.DA_SPEECH_CONTINUE_ON_ROAD_FOR_A_QUARTER_MILE, R.string.DA_YOUR_DESTINATION_IS_A_QUARTER_MILE_AHEAD};
        int[] iArr7 = {R.string.DA_SPEECH_IN_A_HALF_MILE, R.string.DA_SPEECH_CONTINUE_FOR_A_HALF_MILE, R.string.DA_SPEECH_CONTINUE_ON_ROAD_FOR_A_HALF_MILE, R.string.DA_YOUR_DESTINATION_IS_A_HALF_MILE_AHEAD};
        int[] iArr8 = {R.string.DA_SPEECH_IN_THREE_QUARTERS_OF_A_MILE, R.string.DA_SPEECH_CONTINUE_FOR_THREE_QUARTERS_OF_A_MILE, R.string.DA_SPEECH_CONTINUE_ON_ROAD_FOR_THREE_QUARTERS_OF_A_MILE, R.string.DA_YOUR_DESTINATION_IS_THREE_QUARTERS_OF_A_MILE_AHEAD};
        int[] iArr9 = {R.string.DA_SPEECH_IN_ONE_AND_A_HALF_MILES, R.string.DA_SPEECH_CONTINUE_FOR_ONE_AND_A_HALF_MILES, R.string.DA_SPEECH_CONTINUE_ON_ROAD_FOR_ONE_AND_A_HALF_MILES, R.string.DA_YOUR_DESTINATION_IS_ONE_AND_A_HALF_MILES_AHEAD};
        int i2 = 0;
        for (int i3 = 4; i2 < i3; i3 = 4) {
            crfaVarArr2[i2].add(new crey(crfcVar, 28.956001f, iArr4[i2], (Integer) 50));
            crfaVarArr2[i2].add(new crey(crfcVar, 44.196f, iArr4[i2], (Integer) 100));
            crfaVarArr2[i2].add(new crey(crfcVar, 57.912003f, iArr4[i2], (Integer) 150));
            crfaVarArr2[i2].add(new crey(crfcVar, 85.344f, iArr4[i2], (Integer) 200));
            crfaVarArr2[i2].add(new crey(crfcVar, 112.776f, iArr4[i2], Integer.valueOf((int) cpnx.a)));
            crfaVarArr2[i2].add(new crey(crfcVar, 140.20801f, iArr4[i2], (Integer) 400));
            crfaVarArr2[i2].add(new crey(crfcVar, 167.64f, iArr4[i2], (Integer) 500));
            crfaVarArr2[i2].add(new crey(crfcVar, 225.552f, iArr4[i2], (Integer) 600));
            crfaVarArr2[i2].add(new crey(crfcVar, 289.56f, iArr4[i2], (Integer) 800));
            crfaVarArr2[i2].add(new crey(crfcVar, 396.24f, iArr4[i2], (Integer) 1000));
            crfaVarArr2[i2].add(new crey(crfcVar, 724.2048f, iArr6[i2], (Integer) null));
            crfaVarArr2[i2].add(new crey(crfcVar, 1126.5408f, iArr7[i2], (Integer) null));
            crfaVarArr2[i2].add(new crey(crfcVar, 1528.8768f, iArr8[i2], (Integer) null));
            crfaVarArr2[i2].add(new crfb(crfcVar, iArr5[i2]));
            crfaVarArr2[i2].add(new crey(crfcVar, 2896.819f, iArr9[i2], (Integer) null));
            crfaVarArr2[i2].add(new crfb(crfcVar, Integer.MAX_VALUE, iArr5[i2], 1609.344f));
            i2++;
        }
        int i4 = 0;
        crfa[] crfaVarArr3 = {crfcVar.k, crfcVar.l, crfcVar.m, crfcVar.n};
        int[] iArr10 = {R.plurals.DA_SPEECH_IN_X_YARDS, R.plurals.DA_SPEECH_CONTINUE_FOR_X_YARDS, R.plurals.DA_SPEECH_CONTINUE_ON_ROAD_FOR_X_YARDS, R.plurals.DA_YOUR_DESTINATION_IS_X_YARDS_AHEAD};
        for (int i5 = 4; i4 < i5; i5 = 4) {
            crfaVarArr3[i4].add(new crey(crfcVar, 86.868004f, iArr10[i4], (Integer) 50));
            crfaVarArr3[i4].add(new crey(crfcVar, 132.58801f, iArr10[i4], (Integer) 100));
            crfaVarArr3[i4].add(new crey(crfcVar, 173.73601f, iArr10[i4], (Integer) 150));
            crfaVarArr3[i4].add(new crey(crfcVar, 256.032f, iArr10[i4], (Integer) 200));
            crfaVarArr3[i4].add(new crey(crfcVar, 338.328f, iArr10[i4], Integer.valueOf((int) cpnx.a)));
            crfaVarArr3[i4].add(new crey(crfcVar, 724.2048f, iArr6[i4], (Integer) null));
            crfaVarArr3[i4].add(new crey(crfcVar, 1126.5408f, iArr7[i4], (Integer) null));
            crfaVarArr3[i4].add(new crey(crfcVar, 1528.8768f, iArr8[i4], (Integer) null));
            crfaVarArr3[i4].add(new crfb(crfcVar, iArr5[i4]));
            crfaVarArr3[i4].add(new crey(crfcVar, 2896.819f, iArr9[i4], (Integer) null));
            crfaVarArr3[i4].add(new crfb(crfcVar, Integer.MAX_VALUE, iArr5[i4], 1609.344f));
            i4++;
        }
        crfe crfeVar = new crfe(application, crfcVar, cqatVar);
        creb crebVar = new creb(ckuqVar);
        this.A = new crbi(this);
        this.d = application;
        this.f = bvjjVar;
        this.p = btvoVar;
        this.h = bvrbVar;
        this.s = crfeVar;
        this.r = crfmVar;
        this.a = crcjVar2;
        this.b = crdfVar2;
        this.c = crdyVar2;
        this.i = crebVar;
        this.g = croxVar;
        this.q = cremVar;
        this.e = btrmVar;
        this.k = dxioVar;
        this.j = dxioVar2;
        this.t = crerVar;
        this.u = crcoVar;
        bvqm.a(application, bvrj.ALERT_CONTROLLER, bvrbVar);
    }

    private final void A() {
        final cree creeVar;
        crde crdeVar = this.z;
        this.z = null;
        if (crdeVar == null || (creeVar = crdeVar.f) == null) {
            return;
        }
        this.h.b(new Runnable(creeVar) { // from class: crbe
            private final cree a;

            {
                this.a = creeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cree creeVar2 = this.a;
                int i = crbk.m;
                creeVar2.a(cred.CANCELLED);
            }
        }, bvrj.UI_THREAD);
    }

    private final synchronized void B(final crde crdeVar) {
        this.y = crdeVar;
        int i = crdeVar.g.b() == 7 ? 5 : 6;
        crbr crbrVar = this.v;
        dbsk.s(crbrVar);
        crbrVar.f(i);
        bvrb bvrbVar = this.h;
        crdeVar.getClass();
        bvrbVar.b(new Runnable(crdeVar) { // from class: crbf
            private final crde a;

            {
                this.a = crdeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final crde crdeVar2 = this.a;
                crdeVar2.c.e();
                synchronized (crdeVar2.b) {
                    if (crdeVar2.c(false)) {
                        crdeVar2.d();
                    } else {
                        synchronized (crdeVar2.b) {
                            crdeVar2.i = new Runnable(crdeVar2) { // from class: crcz
                                private final crde a;

                                {
                                    this.a = crdeVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    crde crdeVar3 = this.a;
                                    synchronized (crdeVar3.b) {
                                        if (crdeVar3.i != null) {
                                            crdeVar3.i = null;
                                            crdeVar3.a();
                                        }
                                    }
                                }
                            };
                            crdeVar2.a.a(crdeVar2.i, bvrj.ALERT_CONTROLLER, crdeVar2.g.k.e);
                        }
                    }
                }
            }
        }, bvrj.ALERT_CONTROLLER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@dzsi cree creeVar) {
        if (creeVar != null) {
            bvrj.UI_THREAD.c();
            creeVar.a(cred.NEVER_PLAYED);
        }
    }

    private final boolean y(crej crejVar) {
        if (!this.q.h(crejVar)) {
            if (((crgt) this.r).b != arym.FREE_NAV) {
                return true;
            }
            if (crejVar != crej.GUIDANCE && crejVar != crej.CONNECTIVITY) {
                return true;
            }
        }
        return false;
    }

    private final synchronized crec z(@dzsi crfj crfjVar, crej crejVar, @dzsi cree creeVar) {
        if (crfjVar == null) {
            if (creeVar != null) {
                bvrj.UI_THREAD.c();
                creeVar.a(cred.NEVER_PLAYED);
            }
            return o;
        }
        crde crdeVar = new crde(this.h, this, this.q, crfjVar, crejVar, creeVar, this.d.getResources(), this.t, this.u);
        crde crdeVar2 = this.y;
        crfj crfjVar2 = crdeVar2 != null ? crdeVar2.c : this.x;
        if (!crejVar.k.b && crfjVar2 != null) {
            amut amutVar = crdeVar.c.f;
            amut amutVar2 = crfjVar2.f;
            if (amutVar != null && amutVar2 != null && amutVar.a != doxu.SUCCESS && amutVar.a == amutVar2.a && crdeVar.c.equals(crfjVar2) && amutVar.a().c.equals(amutVar2.a().c)) {
                amutVar.b();
                amutVar.a();
                if (creeVar != null) {
                    bvrj.UI_THREAD.c();
                    creeVar.a(cred.NEVER_PLAYED);
                }
                return crdeVar;
            }
        }
        if (this.y != null) {
            A();
            this.z = crdeVar;
        } else {
            B(crdeVar);
        }
        return crdeVar;
    }

    public final synchronized void a(crbr crbrVar) {
        this.v = crbrVar;
        this.h.b(new Runnable(this) { // from class: crbd
            private final crbk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crbk crbkVar = this.a;
                crbkVar.k.a();
                crbkVar.j.a();
            }
        }, bvrj.ALERT_CONTROLLER);
        crbj crbjVar = new crbj(this);
        this.w = crbjVar;
        this.d.registerReceiver(crbjVar, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.q.a(this.A);
    }

    @Override // defpackage.cref
    public final crec b(@dzsi crfj crfjVar, crej crejVar, @dzsi cree creeVar) {
        if (!y(crejVar) && (!this.t.a || !n() || (((crgt) this.r).b == arym.FREE_NAV && (crejVar == crej.GUIDANCE || crejVar == crej.CONNECTIVITY)))) {
            d(creeVar);
            return o;
        }
        return z(crfjVar, crejVar, creeVar);
    }

    @Override // defpackage.cref
    public final void c(String str, crej crejVar, @dzsi cree creeVar) {
        b(new crfj(crfi.URI, null, str, str, null, null, -1), crejVar, creeVar);
    }

    @Override // defpackage.cref
    public final synchronized void e() {
        crde crdeVar = this.y;
        if (crdeVar != null) {
            crdeVar.a();
        }
    }

    @Override // defpackage.cref
    public final void f(List<crfj> list) {
        if (o()) {
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    this.k.a().e(list.get(0), null, cksq.SOON);
                } else {
                    this.k.a().e(list.get(i), null, cksq.PREFETCH);
                }
            }
        }
    }

    @Override // defpackage.cref
    public final void g() {
        synchronized (this) {
            this.k.a().b();
        }
        this.s.f();
    }

    @Override // defpackage.cref
    public final synchronized void h() {
        boolean z;
        crde crdeVar = this.y;
        if (crdeVar != null) {
            this.x = crdeVar.c;
        }
        crde crdeVar2 = this.z;
        if (crdeVar2 == null || !y(crdeVar2.g)) {
            crbr crbrVar = this.v;
            dbsk.s(crbrVar);
            synchronized (crbrVar.i) {
                crbm crbmVar = crbrVar.j;
                bvrj.UI_THREAD.c();
                arq arqVar = ((crbo) crbmVar).c;
                boolean z2 = false;
                if (((crbo) crbmVar).e == 3 && arqVar != null) {
                    if (arv.c().c.equals(arqVar.c)) {
                        ((crbo) crbmVar).e = 1;
                        ((crbo) crbmVar).c = null;
                    } else {
                        ((crbo) crbmVar).e = 4;
                        arv.d(arqVar);
                        z2 = true;
                    }
                }
                z = !z2;
                if (z) {
                    crbrVar.e();
                }
            }
            if (!z) {
                return;
            }
        }
        crde crdeVar3 = this.z;
        if (crdeVar3 != null) {
            this.z = null;
            B(crdeVar3);
            return;
        }
        this.y = null;
        crbr crbrVar2 = this.v;
        dbsk.s(crbrVar2);
        crbrVar2.f(1);
    }

    @Override // defpackage.cref
    public final void i() {
        synchronized (this) {
            this.k.a().c();
            this.j.a().c();
            crbr crbrVar = this.v;
            dbsk.s(crbrVar);
            crbrVar.e.a(crbrVar);
        }
        BroadcastReceiver broadcastReceiver = this.w;
        if (broadcastReceiver != null) {
            this.d.unregisterReceiver(broadcastReceiver);
        }
        this.q.b(this.A);
    }

    @Override // defpackage.cref
    public final synchronized boolean j() {
        return r().b();
    }

    @Override // defpackage.cref
    public final synchronized void k(boolean z) {
        if (z) {
            crde crdeVar = this.z;
            if (crdeVar != null && !crdeVar.g.a()) {
                A();
            }
            crde crdeVar2 = this.y;
            if (crdeVar2 != null && !crdeVar2.g.a()) {
                this.y.b();
            }
        }
        this.y = null;
        this.x = null;
        g();
        this.s.h();
    }

    @Override // defpackage.cref
    public final synchronized void l() {
        crde crdeVar = this.y;
        if (crdeVar != null) {
            cres a = cres.a(this.f);
            synchronized (crdeVar.b) {
                crbc crbcVar = crdeVar.e;
                if (crbcVar != null) {
                    crbcVar.e(a);
                }
            }
        }
    }

    @Override // defpackage.cref
    public final synchronized boolean m(boolean z) {
        boolean z2;
        int i;
        crbr crbrVar = this.v;
        dbsk.s(crbrVar);
        synchronized (crbrVar.i) {
            z2 = false;
            if (crbrVar.j.a() && !crbrVar.d.isMusicActive() && (i = crbrVar.n) != 0) {
                int i2 = -1;
                int i3 = i - 1;
                if (i3 == 0) {
                    crbrVar.i.b(crfj.d(crfi.SILENT, ""), crej.GUIDANCE, null);
                } else if (i3 != 4 && i3 != 5) {
                }
                int i4 = crbrVar.k;
                if (true == z) {
                    i2 = 1;
                }
                crbrVar.k = i4 + i2;
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        Vibrator vibrator = (Vibrator) this.d.getSystemService("vibrator");
        return vibrator != null && vibrator.hasVibrator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return this.p.getTextToSpeechParameters().b;
    }

    @Override // defpackage.cref
    public final crox p() {
        return this.g;
    }

    @Override // defpackage.cref
    public final crfe q() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized crbr r() {
        crbr crbrVar;
        crbrVar = this.v;
        dbsk.s(crbrVar);
        return crbrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crdj s() {
        return this.j.a();
    }

    @Override // defpackage.cref
    public final synchronized void t() {
        if (this.z != null) {
            A();
        }
        crde crdeVar = this.y;
        if (crdeVar != null) {
            crdeVar.b();
        }
    }

    @Override // defpackage.cref
    public final synchronized void u(crec crecVar) {
        if (crecVar == this.z) {
            A();
            return;
        }
        crde crdeVar = this.y;
        if (crdeVar != crecVar) {
            return;
        }
        crdeVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void v() {
        crde crdeVar = this.y;
        crde crdeVar2 = this.z;
        if (crdeVar2 != null && this.q.h(crdeVar2.g)) {
            A();
        }
        if (crdeVar == null || !this.q.h(crdeVar.g)) {
            return;
        }
        crdeVar.b();
    }

    @Override // defpackage.cref
    @dzsi
    public final synchronized crej w() {
        crde crdeVar = this.y;
        if (crdeVar != null) {
            return crdeVar.g;
        }
        return null;
    }

    @Override // defpackage.cref
    public final void x() {
        this.h.b(new Runnable(this) { // from class: crbg
            private final crbk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j.a().d(Locale.getDefault());
            }
        }, bvrj.ALERT_CONTROLLER);
    }
}
