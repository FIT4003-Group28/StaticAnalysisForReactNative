package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: daol  reason: default package */
/* loaded from: classes5.dex */
public final class daol {
    static final Intent a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    private static volatile daol f;
    private final Context d;
    final ServiceConnection b = new daoj(this);
    private volatile daok c = new daok(1);
    private final AtomicReference<CountDownLatch> e = new AtomicReference<>();

    public daol(Context context) {
        this.d = context.getApplicationContext();
    }

    public static danu b(Context context, long j, TimeUnit timeUnit) {
        daof.c(context, "Context object cannot be null.");
        daol daolVar = f;
        if (daolVar == null) {
            synchronized (daol.class) {
                daolVar = f;
                if (daolVar == null) {
                    daolVar = new daol(context.getApplicationContext());
                    f = daolVar;
                    f.c();
                }
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            daok d = daolVar.d();
            switch (d.a - 1) {
                case 1:
                case 5:
                    return null;
                case 2:
                case 4:
                    return daolVar.e(j, timeUnit);
                case 3:
                    return d.b;
                case 6:
                    daolVar.c();
                    return daolVar.e(j, timeUnit);
                default:
                    throw new IllegalStateException("NOT_STARTED state only possible before instance is created.");
            }
        }
        throw new IllegalStateException("getService blocks and should not be called from the main thread.");
    }

    private final synchronized void c() {
        int i = d().a;
        if (i == 4) {
            return;
        }
        if (i != 1) {
            this.d.unbindService(this.b);
        }
        try {
            if (this.d.bindService(a, this.b, 1)) {
                if (this.c.a == 4) {
                    return;
                }
                a(new daok(3));
                return;
            }
        } catch (SecurityException unused) {
        }
        a(new daok(2));
    }

    private final synchronized daok d() {
        return this.c;
    }

    private final danu e(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        daok d = d();
        if (d.a != 4) {
            do {
                countDownLatch = this.e.get();
                if (countDownLatch != null) {
                    break;
                }
                countDownLatch = new CountDownLatch(1);
            } while (!this.e.compareAndSet(null, countDownLatch));
            if (!countDownLatch.await(j, timeUnit)) {
                c();
                throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
            }
            return d().b;
        }
        return d.b;
    }

    public final void a(daok daokVar) {
        this.c = daokVar;
        CountDownLatch andSet = this.e.getAndSet(null);
        if (andSet != null) {
            andSet.countDown();
        }
    }
}
