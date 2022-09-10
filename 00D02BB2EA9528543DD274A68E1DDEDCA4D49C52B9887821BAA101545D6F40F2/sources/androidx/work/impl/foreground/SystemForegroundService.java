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
/* loaded from: classes2.dex */
public class SystemForegroundService extends q implements bfj {
    bfk a;
    public NotificationManager b;
    private Handler c;
    private boolean d;

    static {
        bbz.f("SystemFgService");
    }

    private final void e() {
        this.c = new Handler(Looper.getMainLooper());
        this.b = (NotificationManager) getApplicationContext().getSystemService("notification");
        bfk bfkVar = new bfk(getApplicationContext());
        this.a = bfkVar;
        if (bfkVar.h != null) {
            bbz.e().b(new Throwable[0]);
        } else {
            bfkVar.h = this;
        }
    }

    @Override // defpackage.bfj
    public final void a(int i, int i2, Notification notification) {
        this.c.post(new bfl(this, i, notification, i2));
    }

    @Override // defpackage.bfj
    public final void b(int i, Notification notification) {
        this.c.post(new bfm(this, i, notification));
    }

    @Override // defpackage.bfj
    public final void c(int i) {
        this.c.post(new bfn(this, i));
    }

    @Override // defpackage.bfj
    public final void d() {
        this.d = true;
        bbz.e().a(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }

    @Override // defpackage.q, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.q, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            bbz.e().c(new Throwable[0]);
            this.a.b();
            e();
            this.d = false;
        }
        if (intent != null) {
            bfk bfkVar = this.a;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                bbz.e().c(new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                bfkVar.i.a(new bfi(bfkVar, bfkVar.a.c, stringExtra));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if (!"ACTION_CANCEL_WORK".equals(action)) {
                    if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                        return 3;
                    }
                    bbz.e().c(new Throwable[0]);
                    bfj bfjVar = bfkVar.h;
                    if (bfjVar == null) {
                        return 3;
                    }
                    bfjVar.d();
                    return 3;
                }
                bbz.e().c(new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                bdn bdnVar = bfkVar.a;
                bdnVar.k.a(new bgx(bdnVar, UUID.fromString(stringExtra2)));
                return 3;
            }
            bfkVar.c(intent);
            return 3;
        }
        return 3;
    }
}
