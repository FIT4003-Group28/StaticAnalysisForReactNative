package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: aocs  reason: default package */
/* loaded from: classes.dex */
public final class aocs {
    private static final long e = TimeUnit.HOURS.toSeconds(8);
    public final aobz a;
    public final FirebaseMessaging b;
    public final aocq d;
    private final Context f;
    private final aocd g;
    private final ScheduledExecutorService h;
    public final Map c = new afw();
    private boolean i = false;

    public aocs(FirebaseMessaging firebaseMessaging, aocd aocdVar, aocq aocqVar, aobz aobzVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = firebaseMessaging;
        this.g = aocdVar;
        this.d = aocqVar;
        this.a = aobzVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    public static rve a(final FirebaseMessaging firebaseMessaging, final aocd aocdVar, final aobz aobzVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return rwd.a(scheduledExecutorService, new Callable() { // from class: aocr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                return new aocs(firebaseMessaging, aocdVar, aocq.b(context2, scheduledExecutorService2), aobzVar, context2, scheduledExecutorService2);
            }
        });
    }

    public static void c(rve rveVar) {
        try {
            rwd.e(rveVar, 30L, TimeUnit.SECONDS);
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
    public final rve b(aocp aocpVar) {
        ArrayDeque arrayDeque;
        this.d.c(aocpVar);
        rvh rvhVar = new rvh();
        synchronized (this.c) {
            String str = aocpVar.c;
            if (this.c.containsKey(str)) {
                arrayDeque = (ArrayDeque) this.c.get(str);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.c.put(str, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(rvhVar);
        }
        return rvhVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(boolean z) {
        this.i = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.d.a() == null || h()) {
            return;
        }
        g(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(long j) {
        d(new aocu(this, this.f, this.g, Math.min(Math.max(30L, j + j), e)), j);
        e(true);
    }

    final synchronized boolean h() {
        return this.i;
    }
}
