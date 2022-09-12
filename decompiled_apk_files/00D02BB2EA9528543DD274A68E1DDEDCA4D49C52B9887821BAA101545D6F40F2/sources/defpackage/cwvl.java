package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwvl  reason: default package */
/* loaded from: classes5.dex */
public final class cwvl extends cwvg implements cwtw, cwqy, cwqx, cwwr {
    private final Context c;
    private final cwrb d;
    private final dehq e;
    private final cwwb g;
    private final cwvb h;
    private final cwwo i;
    private final AtomicBoolean f = new AtomicBoolean();
    final AtomicBoolean a = new AtomicBoolean();
    final ConcurrentHashMap<String, dehn<cwva>> b = new ConcurrentHashMap<>();

    public cwvl(cwwp cwwpVar, Context context, cwrb cwrbVar, dehq dehqVar, dxio<cwvf> dxioVar, cwwb cwwbVar, cwvb cwvbVar, dzsj<cxfg> dzsjVar, Executor executor) {
        this.i = cwwpVar.a(executor, dxioVar, dzsjVar);
        this.c = context;
        this.d = cwrbVar;
        this.e = dehqVar;
        this.g = cwwbVar;
        this.h = cwvbVar;
    }

    private dehn<cwva> n(final dzyb dzybVar, @dzsi final String str, boolean z, final boolean z2) {
        return deha.f(new deff(this, z2, dzybVar, str) { // from class: cwvh
            private final cwvl a;
            private final boolean b;
            private final dzyb c;
            private final String d;

            {
                this.a = this;
                this.b = z2;
                this.c = dzybVar;
                this.d = str;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return this.a.m(this.b, this.c, this.d, true);
            }
        }, this.e);
    }

    private dehn<Void> o(final dehn<cwva> dehnVar, final dehn<cwva> dehnVar2, final String str, boolean z, final dzze dzzeVar) {
        dehn<Void> a = deha.m(dehnVar, dehnVar2).a(new deff(this, dehnVar, dehnVar2, str, dzzeVar) { // from class: cwvi
            private final cwvl a;
            private final dehn b;
            private final dehn c;
            private final String d;
            private final dzze e;

            {
                this.a = this;
                this.b = dehnVar;
                this.c = dehnVar2;
                this.d = str;
                this.e = dzzeVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return this.a.l(this.b, this.c, this.d, true, this.e);
            }
        }, this.e);
        a.Pk(new Runnable(this, str) { // from class: cwvj
            private final cwvl a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k(this.b);
            }
        }, dege.a);
        return a;
    }

    private cwva p(dzyb dzybVar, @dzsi String str, boolean z) {
        cwvb cwvbVar = this.h;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        Long valueOf2 = Long.valueOf(System.currentTimeMillis());
        SystemHealthManager systemHealthManager = (SystemHealthManager) cwvbVar.a.a.getSystemService("systemhealth");
        HealthStats takeMyUidSnapshot = systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null;
        cwvbVar.d.a().c();
        return new cwva(cwvbVar, valueOf, valueOf2, takeMyUidSnapshot, dzybVar, str, true);
    }

    private dehn<Void> q(final dzyb dzybVar, @dzsi String str, boolean z) {
        return deha.f(new deff(this, dzybVar) { // from class: cwvk
            private final cwvl a;
            private final dzyb b;

            {
                this.a = this;
                this.b = dzybVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return this.a.j(this.b, null, true);
            }
        }, this.e);
    }

    @Override // defpackage.cwud
    public void Sz() {
        if (this.f.getAndSet(false)) {
            this.d.b(this);
        }
        synchronized (this.g) {
            cxer cxerVar = this.g.a;
            czhz.c();
            if (cqvm.c(cxerVar.a)) {
                cxerVar.b.a().edit().remove("primes.battery.snapshot").commit();
            }
        }
    }

    @Override // defpackage.cwqy
    public void a(@dzsi Activity activity) {
        if (!this.a.get()) {
            cwtl.a(h());
        }
    }

    @Override // defpackage.cwqx
    public void b(Activity activity) {
        cwtl.a(i());
    }

    @Override // defpackage.cwtw
    public void c() {
        a(null);
        if (!this.f.getAndSet(true)) {
            this.d.a(this);
        }
    }

    @Override // defpackage.cwvg
    public dehn<Void> d(String str, boolean z) {
        if (this.b.size() >= 10) {
            return deha.b(new IllegalStateException("Unable to capture snapshot; maximum concurrent measurements reached: 10"));
        }
        dehn<cwva> n = n(dzyb.CUSTOM_MEASURE_START, str, true, true);
        this.b.put(str, n);
        return deew.h(n, dbrs.b(null), dege.a);
    }

    @Override // defpackage.cwvg
    public dehn<Void> e(String str, boolean z, dzze dzzeVar) {
        dehn<cwva> dehnVar = this.b.get(str);
        if (dehnVar == null) {
            String valueOf = String.valueOf(str);
            return deha.b(new IllegalStateException(valueOf.length() != 0 ? "startBatteryDiffMeasurement() failed for customEventName: ".concat(valueOf) : new String("startBatteryDiffMeasurement() failed for customEventName: ")));
        }
        return o(dehnVar, n(dzyb.CUSTOM_MEASURE_STOP, str, true, false), str, true, dzzeVar);
    }

    @Override // defpackage.cwvg
    public void f(String str) {
        dehn<cwva> remove = this.b.remove(str);
        if (remove != null) {
            remove.cancel(true);
        }
    }

    @Override // defpackage.cwwr
    public void g() {
    }

    public dehn<Void> h() {
        if (!cqvm.c(this.c)) {
            return dehk.a;
        }
        if (this.a.getAndSet(true)) {
            return deha.c();
        }
        return q(dzyb.BACKGROUND_TO_FOREGROUND, null, true);
    }

    public dehn<Void> i() {
        if (!cqvm.c(this.c)) {
            return dehk.a;
        }
        try {
            dbsk.l(this.a.getAndSet(false));
            return q(dzyb.FOREGROUND_TO_BACKGROUND, null, true);
        } catch (Exception e) {
            return deha.b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: all -> 0x0280, TryCatch #0 {, blocks: (B:8:0x0013, B:14:0x0046, B:17:0x004a, B:20:0x0050, B:23:0x005c, B:68:0x00ea, B:26:0x0063, B:28:0x0069, B:30:0x0071, B:33:0x0076, B:35:0x007c, B:36:0x007e, B:38:0x0085, B:40:0x008e, B:42:0x0094, B:44:0x009d, B:46:0x00a3, B:48:0x00ac, B:50:0x00b2, B:52:0x00bb, B:54:0x00c1, B:56:0x00c6, B:58:0x00ca, B:60:0x00d5, B:62:0x00db, B:64:0x00df, B:67:0x00e6, B:11:0x0031), top: B:146:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.dehn j(defpackage.dzyb r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwvl.j(dzyb, java.lang.String, boolean):dehn");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void k(String str) {
        this.b.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ dehn l(dehn dehnVar, dehn dehnVar2, String str, boolean z, dzze dzzeVar) {
        eacd a = this.h.a(((cwva) deha.r(dehnVar)).a(), ((cwva) deha.r(dehnVar2)).a());
        if (a != null && (a.a & 512) != 0) {
            cwwo cwwoVar = this.i;
            cwwi f = cwwj.f();
            cwwf cwwfVar = (cwwf) f;
            cwwfVar.a = str;
            f.b(true);
            f.c(a);
            cwwfVar.b = dzzeVar;
            return cwwoVar.c(f.a());
        }
        return dehk.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ dehn m(boolean z, dzyb dzybVar, String str, boolean z2) {
        return (!z || this.i.a()) ? deha.a(p(dzybVar, str, true)) : deha.c();
    }
}
