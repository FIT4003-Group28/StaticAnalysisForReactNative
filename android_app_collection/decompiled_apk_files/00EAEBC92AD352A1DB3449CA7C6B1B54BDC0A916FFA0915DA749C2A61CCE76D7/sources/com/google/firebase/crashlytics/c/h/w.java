package com.google.firebase.crashlytics.c.h;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8783a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f8784b;

        /* renamed from: com.google.firebase.crashlytics.c.h.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0165a extends d {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f8785b;

            C0165a(a aVar, Runnable runnable) {
                this.f8785b = runnable;
            }

            @Override // com.google.firebase.crashlytics.c.h.d
            public void a() {
                this.f8785b.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f8783a = str;
            this.f8784b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0165a(this, runnable));
            newThread.setName(this.f8783a + this.f8784b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends d {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ExecutorService f8787c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f8788d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TimeUnit f8789e;

        b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f8786b = str;
            this.f8787c = executorService;
            this.f8788d = j;
            this.f8789e = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.c.h.d
        public void a() {
            try {
                com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
                a2.a("Executing shutdown hook for " + this.f8786b);
                this.f8787c.shutdown();
                if (this.f8787c.awaitTermination(this.f8788d, this.f8789e)) {
                    return;
                }
                com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
                a3.a(this.f8786b + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f8787c.shutdownNow();
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.c.b.a().a(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f8786b));
                this.f8787c.shutdownNow();
            }
        }
    }

    public static ExecutorService a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(b(str));
        a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    private static final void a(String str, ExecutorService executorService) {
        a(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static final void a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static final ThreadFactory b(String str) {
        return new a(str, new AtomicLong(1L));
    }
}
