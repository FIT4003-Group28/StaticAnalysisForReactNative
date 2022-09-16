package androidx.work.impl.background.systemalarm;

import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemAlarmService extends q implements bed {
    private bef a;
    private boolean b;

    static {
        bbz.f("SystemAlarmService");
    }

    private final void c() {
        bef befVar = new bef(this);
        this.a = befVar;
        if (befVar.h != null) {
            bbz.e().b(new Throwable[0]);
        } else {
            befVar.h = this;
        }
    }

    @Override // defpackage.bed
    public final void a() {
        this.b = true;
        bbz.e().a(new Throwable[0]);
        bhl.b();
        stopSelf();
    }

    @Override // defpackage.q, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
        this.b = false;
    }

    @Override // defpackage.q, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            bbz.e().c(new Throwable[0]);
            this.a.b();
            c();
            this.b = false;
        }
        if (intent != null) {
            this.a.f(intent, i2);
            return 3;
        }
        return 3;
    }
}
