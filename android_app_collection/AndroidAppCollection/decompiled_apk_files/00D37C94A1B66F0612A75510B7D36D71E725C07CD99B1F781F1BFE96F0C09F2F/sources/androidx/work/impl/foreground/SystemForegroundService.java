package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.UUID;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends n implements btm {
    btn a;
    public NotificationManager b;
    private Handler c;
    private boolean d;

    static {
        bqf.b("SystemFgService");
    }

    private final void e() {
        this.c = new Handler(Looper.getMainLooper());
        this.b = (NotificationManager) getApplicationContext().getSystemService("notification");
        btn btnVar = new btn(getApplicationContext());
        this.a = btnVar;
        if (btnVar.i == null) {
            btnVar.i = this;
            return;
        }
        bqf.a();
        bqf.e(btn.a, "A callback already exists.", new Throwable[0]);
    }

    @Override // defpackage.btm
    public final void a(int i) {
        this.c.post(new btq(this, i));
    }

    @Override // defpackage.btm
    public final void b(int i, Notification notification) {
        this.c.post(new btp(this, i, notification));
    }

    @Override // defpackage.btm
    public final void c(int i, int i2, Notification notification) {
        this.c.post(new bto(this, i, notification, i2));
    }

    @Override // defpackage.btm
    public final void d() {
        this.d = true;
        bqf.a().d(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }

    @Override // defpackage.n, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.n, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.h();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            bqf.a();
            bqf.f(new Throwable[0]);
            this.a.h();
            e();
            this.d = false;
        }
        if (intent != null) {
            btn btnVar = this.a;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                bqf.a();
                String.format("Started foreground service %s", intent);
                bqf.f(new Throwable[0]);
                btnVar.j.a(new btl(btnVar, btnVar.b.d, intent.getStringExtra("KEY_WORKSPEC_ID")));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    bqf.a();
                    String.format("Stopping foreground work for %s", intent);
                    bqf.f(new Throwable[0]);
                    String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                        return 3;
                    }
                    brq brqVar = btnVar.b;
                    brqVar.j.a(new bvb(brqVar, UUID.fromString(stringExtra)));
                    return 3;
                } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                } else {
                    bqf.a();
                    bqf.f(new Throwable[0]);
                    btm btmVar = btnVar.i;
                    if (btmVar == null) {
                        return 3;
                    }
                    btmVar.d();
                    return 3;
                }
            }
            btnVar.g(intent);
            return 3;
        }
        return 3;
    }
}
