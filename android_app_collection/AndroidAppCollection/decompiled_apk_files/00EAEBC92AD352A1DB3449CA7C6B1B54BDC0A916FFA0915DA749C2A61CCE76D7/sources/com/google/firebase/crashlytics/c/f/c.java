package com.google.firebase.crashlytics.c.f;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f8599a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8600b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f8601c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8602d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f8603e;

    public c(e eVar, int i, TimeUnit timeUnit) {
        this.f8599a = eVar;
        this.f8600b = i;
        this.f8601c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.c.f.a
    public void a(String str, Bundle bundle) {
        com.google.firebase.crashlytics.c.b a2;
        String str2;
        synchronized (this.f8602d) {
            com.google.firebase.crashlytics.c.b.a().a("Logging Crashlytics event to Firebase");
            this.f8603e = new CountDownLatch(1);
            this.f8599a.a(str, bundle);
            com.google.firebase.crashlytics.c.b.a().a("Awaiting app exception callback from FA...");
            try {
                if (this.f8603e.await(this.f8600b, this.f8601c)) {
                    a2 = com.google.firebase.crashlytics.c.b.a();
                    str2 = "App exception callback received from FA listener.";
                } else {
                    a2 = com.google.firebase.crashlytics.c.b.a();
                    str2 = "Timeout exceeded while awaiting app exception callback from FA listener.";
                }
                a2.a(str2);
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.c.b.a().a("Interrupted while awaiting app exception callback from FA listener.");
            }
            this.f8603e = null;
        }
    }

    @Override // com.google.firebase.crashlytics.c.f.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f8603e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
