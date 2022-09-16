package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class OfflineTransferService extends agxn {
    public SharedPreferences h;
    public Executor i;
    public azqb j;
    public azqb k;
    public azqb l;
    public agpn m;
    public agyc n;
    public aadd o;
    public acsf p;
    public Executor q;
    public agvn r;
    public agyz s;
    public agzq t;
    private volatile String u;
    private Notification v;
    private SharedPreferences.OnSharedPreferenceChangeListener w;
    private aypg x;

    private final void s() {
        agxg.B(this.h, ((agrf) this.l.get()).d(), true);
    }

    private final void t() {
        if (Build.VERSION.SDK_INT < 26 || getApplicationInfo().targetSdkVersion < 26) {
            return;
        }
        Notification a = ((agrn) this.j.get()).a();
        this.v = a;
        if (a == null) {
            return;
        }
        startForeground(13, a);
    }

    @Override // defpackage.agxn
    protected final agxt a(agxs agxsVar) {
        return this.n.a(agxsVar, amps.d(getClass().getCanonicalName()), this.s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agxn
    public final void b() {
        if (this.g) {
            stopSelf();
        }
    }

    @Override // defpackage.agxn, defpackage.agxs
    public final void c(boolean z) {
        if (this.e.e() <= 0) {
            for (agxf agxfVar : this.d) {
                agxfVar.c();
            }
            this.g = true;
            b();
        }
        if (z) {
            agxg.B(this.h, ((agrf) this.l.get()).d(), false);
        }
    }

    @Override // defpackage.agxn, defpackage.agxs
    public final void d(Map map) {
        this.b.putAll(map);
        this.c = true;
        for (agxf agxfVar : this.d) {
            agxfVar.g();
        }
        for (agqz agqzVar : map.values()) {
            if (agqzVar.c()) {
                s();
                return;
            }
        }
    }

    @Override // defpackage.agxn, defpackage.agxs
    public final void e(agqz agqzVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.a(agqzVar);
        }
        s();
    }

    @Override // defpackage.agxn, defpackage.agxs
    public final void g(final agqz agqzVar, final boolean z) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.e(agqzVar);
        }
        this.a.execute(new Runnable() { // from class: agzn
            @Override // java.lang.Runnable
            public final void run() {
                OfflineTransferService.this.r(agqzVar, z);
            }
        });
    }

    @Override // defpackage.agxn, defpackage.agxs
    public final void h(agqz agqzVar) {
        this.b.remove(agqzVar.a);
        for (agxf agxfVar : this.d) {
            agxfVar.f(agqzVar);
            if ((agqzVar.c & 512) != 0) {
                agxfVar.b(agqzVar);
            }
        }
        if (agxg.ai(agqzVar) && agqzVar.a.equals(this.u)) {
            this.u = null;
        }
        this.a.execute(new agzm(this, agqzVar, 1));
    }

    @Override // defpackage.agxn, defpackage.agxs
    public final void l(agqz agqzVar, atsg atsgVar, agqe agqeVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.k(agqzVar, atsgVar, agqeVar);
        }
        if (agxg.ai(agqzVar)) {
            if (agqzVar.b == avkl.TRANSFER_STATE_COMPLETE) {
                if (agqzVar.a.equals(this.u)) {
                    this.u = null;
                }
            } else if (agqzVar.b == avkl.TRANSFER_STATE_TRANSFERRING) {
                this.u = agqzVar.a;
            }
        }
        this.a.execute(new agzm(this, agqzVar));
    }

    @Override // defpackage.agxn
    public final void n() {
        Notification notification = this.v;
        if (notification != null) {
            startForeground(13, notification);
        } else {
            stopForeground(true);
        }
    }

    @Override // defpackage.agxn
    protected final void o() {
        this.q.execute(new Runnable() { // from class: agzl
            @Override // java.lang.Runnable
            public final void run() {
                OfflineTransferService offlineTransferService = OfflineTransferService.this;
                String d = ((agrf) offlineTransferService.l.get()).d();
                if (!"NO_OP_STORE_TAG".equals(d)) {
                    offlineTransferService.e.l(d);
                }
            }
        });
    }

    @Override // defpackage.agxn, android.app.Service
    public final void onCreate() {
        zep.g("[Offline] Creating OfflineTransferService...");
        dxj ju = ((agzo) zew.E(getApplication(), agzo.class)).ju();
        this.h = (SharedPreferences) ju.a.t.get();
        this.i = (Executor) ju.a.lA.get();
        ylm ylmVar = (ylm) ju.a.kP.get();
        dyo dyoVar = ju.a;
        this.j = dyoVar.lv;
        this.k = dyoVar.hf;
        this.l = dyoVar.gS;
        this.m = (agpn) dyoVar.lz.get();
        this.n = ju.a.eV();
        this.o = (aadd) ju.a.K.get();
        this.p = (acsf) ju.a.hg.get();
        this.q = (Executor) ju.a.h.get();
        ahdf ahdfVar = (ahdf) ju.a.ha.get();
        this.r = (agvn) ju.a.hd.get();
        dyo dyoVar2 = ju.a;
        azqb azqbVar = dyoVar2.gS;
        amqo amqoVar = (amqo) dyoVar2.fS.get();
        snc sncVar = (snc) ju.a.v.get();
        dyo dyoVar3 = ju.a;
        this.s = afku.d(azqbVar, amqoVar, sncVar, dyoVar3.gy, (pwx) dyoVar3.gP.get(), ampq.j(ju.a.dL()), amup.n(5, ju.a.lB, 4, ju.a.lN, 3, ju.a.lO, 2, ju.a.lP));
        this.t = (agzq) ju.a.a.bE.get();
        super.onCreate();
        agzp agzpVar = new agzp(this);
        this.w = agzpVar;
        this.h.registerOnSharedPreferenceChangeListener(agzpVar);
        this.x = this.r.a(new ayqb() { // from class: agzk
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                OfflineTransferService.this.q();
            }
        });
        q();
        if (ahdf.j(this.o)) {
            this.p.b(new acsd(1, 6), aqzj.FLOW_TYPE_OFFLINE_TRANSFER_SERVICE);
        }
        t();
        p(this.m);
        p(this.t);
        Executor executor = this.i;
        this.a = executor;
        agyy agyyVar = this.f;
        if (agyyVar != null) {
            agyyVar.b = executor;
        }
    }

    @Override // defpackage.agxn, android.app.Service
    public final void onDestroy() {
        zep.g("[Offline] Destroying OfflineTransferService...");
        if (ahdf.j(this.o)) {
            this.p.b(new acsd(2, 6), aqzj.FLOW_TYPE_OFFLINE_TRANSFER_SERVICE);
        }
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.w;
        if (onSharedPreferenceChangeListener != null) {
            this.h.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        super.onDestroy();
        aypg aypgVar = this.x;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.x = null;
        }
    }

    @Override // defpackage.agxn, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zep.g("[Offline] OfflineTransferService onStartCommand");
        t();
        if (intent != null) {
            this.e.g(intent.getAction(), intent.getExtras());
        }
        this.g = false;
        return 1;
    }

    public final void q() {
        this.e.o(((agvq) this.k.get()).w());
    }

    public final void r(agqz agqzVar, boolean z) {
        ((agrn) this.j.get()).C(agqzVar, z);
    }
}
