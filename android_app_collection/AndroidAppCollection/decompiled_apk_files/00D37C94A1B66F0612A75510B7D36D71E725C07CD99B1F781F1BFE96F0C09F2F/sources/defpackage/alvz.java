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
/* renamed from: alvz  reason: default package */
/* loaded from: classes.dex */
public final class alvz {
    private static volatile alvz d;
    private final Context f;
    public static final ancy c = new ancy("SetupCompatServiceProvider");
    static final Intent a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    final ServiceConnection b = new alvx(this);
    private volatile alvy e = new alvy(1);
    private final AtomicReference g = new AtomicReference();

    public alvz(Context context) {
        this.f = context.getApplicationContext();
    }

    public static alvl b(Context context, long j, TimeUnit timeUnit) {
        apwt.n(context, "Context object cannot be null.");
        alvz alvzVar = d;
        if (alvzVar == null) {
            synchronized (alvz.class) {
                alvzVar = d;
                if (alvzVar == null) {
                    alvzVar = new alvz(context.getApplicationContext());
                    d = alvzVar;
                    d.d();
                }
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            alvy c2 = alvzVar.c();
            switch (c2.a - 1) {
                case 1:
                case 5:
                    return null;
                case 2:
                case 4:
                    return alvzVar.e(j, timeUnit);
                case 3:
                    return c2.b;
                case 6:
                    alvzVar.d();
                    return alvzVar.e(j, timeUnit);
                default:
                    throw new IllegalStateException("NOT_STARTED state only possible before instance is created.");
            }
        }
        throw new IllegalStateException("getService blocks and should not be called from the main thread.");
    }

    private final synchronized alvy c() {
        return this.e;
    }

    private final synchronized void d() {
        int i = c().a;
        if (i == 4) {
            return;
        }
        if (i != 1) {
            this.f.unbindService(this.b);
        }
        try {
            if (this.f.bindService(a, this.b, 1)) {
                if (this.e.a == 4) {
                    return;
                }
                a(new alvy(3));
                return;
            }
        } catch (SecurityException e) {
            ancy ancyVar = c;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Unable to bind to compat service. ");
            sb.append(valueOf);
            ancyVar.b(sb.toString());
        }
        a(new alvy(2));
        c.b("Context#bindService did not succeed.");
    }

    private final alvl e(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        alvy c2 = c();
        if (c2.a != 4) {
            do {
                countDownLatch = (CountDownLatch) this.g.get();
                if (countDownLatch != null) {
                    break;
                }
                countDownLatch = new CountDownLatch(1);
            } while (!this.g.compareAndSet(null, countDownLatch));
            if (!countDownLatch.await(j, timeUnit)) {
                d();
                throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
            }
            alvy c3 = c();
            String.format("Finished waiting for service to get connected. Current state = %s", apwt.k(c3.a));
            return c3.b;
        }
        return c2.b;
    }

    public final void a(alvy alvyVar) {
        String.format("State changed: %s -> %s", apwt.k(this.e.a), apwt.k(alvyVar.a));
        this.e = alvyVar;
        CountDownLatch countDownLatch = (CountDownLatch) this.g.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
