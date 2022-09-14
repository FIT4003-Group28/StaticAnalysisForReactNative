package com.facebook.imagepipeline.m;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: JobScheduler.java */
/* loaded from: classes.dex */
public class u {
    private final Executor f;
    private final a g;
    private final int j;
    private final Runnable h = new Runnable() { // from class: com.facebook.imagepipeline.m.u.1
        @Override // java.lang.Runnable
        public void run() {
            u.this.e();
        }
    };
    private final Runnable i = new Runnable() { // from class: com.facebook.imagepipeline.m.u.2
        @Override // java.lang.Runnable
        public void run() {
            u.this.d();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    com.facebook.imagepipeline.i.d f2898a = null;

    /* renamed from: b  reason: collision with root package name */
    boolean f2899b = false;

    /* renamed from: c  reason: collision with root package name */
    c f2900c = c.IDLE;

    /* renamed from: d  reason: collision with root package name */
    long f2901d = 0;
    long e = 0;

    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(com.facebook.imagepipeline.i.d dVar, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f2905a;

        static ScheduledExecutorService a() {
            if (f2905a == null) {
                f2905a = Executors.newSingleThreadScheduledExecutor();
            }
            return f2905a;
        }
    }

    public u(Executor executor, a aVar, int i) {
        this.f = executor;
        this.g = aVar;
        this.j = i;
    }

    public void a() {
        com.facebook.imagepipeline.i.d dVar;
        synchronized (this) {
            dVar = this.f2898a;
            this.f2898a = null;
            this.f2899b = false;
        }
        com.facebook.imagepipeline.i.d.d(dVar);
    }

    public boolean a(com.facebook.imagepipeline.i.d dVar, boolean z) {
        com.facebook.imagepipeline.i.d dVar2;
        if (!b(dVar, z)) {
            return false;
        }
        synchronized (this) {
            dVar2 = this.f2898a;
            this.f2898a = com.facebook.imagepipeline.i.d.a(dVar);
            this.f2899b = z;
        }
        com.facebook.imagepipeline.i.d.d(dVar2);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean b() {
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!b(this.f2898a, this.f2899b)) {
                return false;
            }
            switch (this.f2900c) {
                case IDLE:
                    long max = Math.max(this.e + this.j, uptimeMillis);
                    this.f2901d = uptimeMillis;
                    this.f2900c = c.QUEUED;
                    j = max;
                    z = true;
                    break;
                case QUEUED:
                    j = 0;
                    break;
                case RUNNING:
                    this.f2900c = c.RUNNING_AND_PENDING;
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            if (z) {
                a(j - uptimeMillis);
            }
            return true;
        }
    }

    private void a(long j) {
        if (j > 0) {
            b.a().schedule(this.i, j, TimeUnit.MILLISECONDS);
        } else {
            this.i.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f.execute(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.facebook.imagepipeline.i.d dVar;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            dVar = this.f2898a;
            z = this.f2899b;
            this.f2898a = null;
            this.f2899b = false;
            this.f2900c = c.RUNNING;
            this.e = uptimeMillis;
        }
        try {
            if (b(dVar, z)) {
                this.g.a(dVar, z);
            }
        } finally {
            com.facebook.imagepipeline.i.d.d(dVar);
            f();
        }
    }

    private void f() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f2900c == c.RUNNING_AND_PENDING) {
                j = Math.max(this.e + this.j, uptimeMillis);
                z = true;
                this.f2901d = uptimeMillis;
                this.f2900c = c.QUEUED;
            } else {
                this.f2900c = c.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            a(j - uptimeMillis);
        }
    }

    private static boolean b(com.facebook.imagepipeline.i.d dVar, boolean z) {
        return z || com.facebook.imagepipeline.i.d.e(dVar);
    }

    public synchronized long c() {
        return this.e - this.f2901d;
    }
}
