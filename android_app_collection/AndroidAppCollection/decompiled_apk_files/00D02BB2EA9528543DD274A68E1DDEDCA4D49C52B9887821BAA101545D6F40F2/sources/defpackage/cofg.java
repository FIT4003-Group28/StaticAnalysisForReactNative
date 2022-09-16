package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cofg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cofg extends Service {
    private Binder a;
    private final Object b;
    private int c;
    final ExecutorService d;
    private int e;

    public cofg() {
        coiz coizVar = coja.a;
        this.d = coiz.b(new cnxx("EnhancedIntentService"));
        this.b = new Object();
        this.e = 0;
    }

    public final void b(Intent intent) {
        if (intent != null) {
            cozl.a(intent);
        }
        synchronized (this.b) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new coff();
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.d.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.e++;
        }
        if (intent == null) {
            b(null);
            return 2;
        }
        this.d.execute(new cofe(this, intent, intent));
        return 3;
    }
}
