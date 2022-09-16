package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class h {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.q.a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService a() {
        return c.e.a.b.d.f.a.a().a(new com.google.android.gms.common.util.q.a("Firebase-Messaging-Intent-Handle"), c.e.a.b.d.f.f.f4027a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.q.a("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.q.a("Firebase-Messaging-Topics-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor d() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
