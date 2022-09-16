package androidx.work.impl.background.systemalarm;

import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends n implements bsg {
    private bsi a;
    private boolean b;

    static {
        bqf.b("SystemAlarmService");
    }

    private final void b() {
        bsi bsiVar = new bsi(this);
        this.a = bsiVar;
        if (bsiVar.i == null) {
            bsiVar.i = this;
            return;
        }
        bqf.a();
        bqf.e(bsi.a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
    }

    @Override // defpackage.bsg
    public final void a() {
        this.b = true;
        bqf.a().d(new Throwable[0]);
        bvq.b();
        stopSelf();
    }

    @Override // defpackage.n, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.b = false;
    }

    @Override // defpackage.n, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            bqf.a();
            bqf.f(new Throwable[0]);
            this.a.c();
            b();
            this.b = false;
        }
        if (intent != null) {
            this.a.f(intent, i2);
            return 3;
        }
        return 3;
    }
}
