package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amdx  reason: default package */
/* loaded from: classes.dex */
public class amdx extends Service {
    private ankt a = anlz.q(null);
    private int b = -1;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (Map.Entry entry : ((amdw) awwc.u(getApplicationContext(), amdw.class)).gk().e.entrySet()) {
            printWriter.println((String) entry.getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        int a;
        if (!this.a.isDone()) {
            amef gk = ((amdw) awwc.u(getApplicationContext(), amdw.class)).gk();
            int i = this.b;
            int a2 = amef.a(gk.c.get());
            if (i != a2) {
                return;
            }
            do {
                j = gk.c.get();
                a = amef.a(j);
                if (a != a2) {
                    return;
                }
            } while (!gk.c.compareAndSet(j, amef.a(a + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        ankt q;
        if ((i & 2) == 0 && intent != null) {
            amef gk = ((amdw) awwc.u(getApplicationContext(), amdw.class)).gk();
            aqxo.u(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            aqxo.u(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            aqxo.u(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (gk.h.getMostSignificantBits() != longExtra || gk.h.getLeastSignificantBits() != longExtra2) {
                ((amzw) ((amzw) amef.a.g()).i("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 222, "AndroidFuturesServiceCounter.java")).A(intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                q = anlz.q(null);
            } else {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (gk.d) {
                    q = (SettableFuture) gk.f.get(intExtra);
                    q.getClass();
                    if (q != amef.b) {
                        gk.g.put(intExtra, q);
                    }
                    gk.f.remove(intExtra);
                }
            }
            this.a = q;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.qY(new Runnable() { // from class: amdv
            @Override // java.lang.Runnable
            public final void run() {
                amdx.this.stopSelf(i2);
            }
        }, anjk.a);
        return 2;
    }
}
