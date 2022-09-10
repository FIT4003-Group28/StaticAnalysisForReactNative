package defpackage;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: devi  reason: default package */
/* loaded from: classes6.dex */
public final class devi {
    private static final long e = TimeUnit.HOURS.toSeconds(8);
    public final FirebaseInstanceId a;
    public final derv b;
    public final devg d;
    private final Context f;
    private final derx g;
    private final ScheduledExecutorService h;
    public final Map<String, ArrayDeque<cpct<Void>>> c = new aif();
    private boolean i = false;

    public devi(FirebaseInstanceId firebaseInstanceId, derx derxVar, devg devgVar, derv dervVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = firebaseInstanceId;
        this.g = derxVar;
        this.d = devgVar;
        this.b = dervVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    public static cpcq<devi> a(dela delaVar, final FirebaseInstanceId firebaseInstanceId, final derx derxVar, desq<devr> desqVar, desq<derf> desqVar2, desz deszVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        final derv dervVar = new derv(delaVar, derxVar, desqVar, desqVar2, deszVar);
        return cpda.c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseInstanceId, derxVar, dervVar) { // from class: devh
            private final Context a;
            private final ScheduledExecutorService b;
            private final FirebaseInstanceId c;
            private final derx d;
            private final derv e;

            {
                this.a = context;
                this.b = scheduledExecutorService;
                this.c = firebaseInstanceId;
                this.d = derxVar;
                this.e = dervVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.a;
                ScheduledExecutorService scheduledExecutorService2 = this.b;
                return new devi(this.c, this.d, devg.getInstance(context2, scheduledExecutorService2), this.e, context2, scheduledExecutorService2);
            }
        });
    }

    public static <T> T d(cpcq<T> cpcqVar) {
        try {
            return (T) cpda.e(cpcqVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j) {
        c(new devk(this, this.f, this.g, Math.min(Math.max(30L, j + j), e)), j);
        f(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(boolean z) {
        this.i = z;
    }
}
