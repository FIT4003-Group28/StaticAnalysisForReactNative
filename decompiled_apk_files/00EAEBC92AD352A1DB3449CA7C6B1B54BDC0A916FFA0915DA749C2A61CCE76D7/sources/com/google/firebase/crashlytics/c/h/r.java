package com.google.firebase.crashlytics.c.h;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
class r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f8761a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.q.e f8762b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f8763c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f8764d = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    interface a {
        void a(com.google.firebase.crashlytics.c.q.e eVar, Thread thread, Throwable th);
    }

    public r(a aVar, com.google.firebase.crashlytics.c.q.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8761a = aVar;
        this.f8762b = eVar;
        this.f8763c = uncaughtExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f8764d.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        com.google.firebase.crashlytics.c.b a2;
        String str;
        this.f8764d.set(true);
        try {
            try {
            } catch (Exception e2) {
                com.google.firebase.crashlytics.c.b.a().b("An error occurred in the uncaught exception handler", e2);
            }
            if (thread == null) {
                a2 = com.google.firebase.crashlytics.c.b.a();
                str = "Could not handle uncaught exception; null thread";
            } else if (th != null) {
                this.f8761a.a(this.f8762b, thread, th);
                com.google.firebase.crashlytics.c.b.a().a("Crashlytics completed exception processing. Invoking default exception handler.");
                this.f8763c.uncaughtException(thread, th);
                this.f8764d.set(false);
            } else {
                a2 = com.google.firebase.crashlytics.c.b.a();
                str = "Could not handle uncaught exception; null throwable";
            }
            a2.b(str);
            com.google.firebase.crashlytics.c.b.a().a("Crashlytics completed exception processing. Invoking default exception handler.");
            this.f8763c.uncaughtException(thread, th);
            this.f8764d.set(false);
        } catch (Throwable th2) {
            com.google.firebase.crashlytics.c.b.a().a("Crashlytics completed exception processing. Invoking default exception handler.");
            this.f8763c.uncaughtException(thread, th);
            this.f8764d.set(false);
            throw th2;
        }
    }
}
