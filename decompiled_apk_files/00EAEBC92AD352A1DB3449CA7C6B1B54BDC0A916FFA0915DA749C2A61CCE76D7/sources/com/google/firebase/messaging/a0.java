package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.f0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {
    private static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f9431a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9432b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f9433c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.iid.s f9434d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f9436f;

    /* renamed from: h  reason: collision with root package name */
    private final y f9438h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<c.e.a.b.g.i<Void>>> f9435e = new a.e.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f9437g = false;

    private a0(FirebaseInstanceId firebaseInstanceId, f0 f0Var, y yVar, com.google.firebase.iid.s sVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9431a = firebaseInstanceId;
        this.f9433c = f0Var;
        this.f9438h = yVar;
        this.f9434d = sVar;
        this.f9432b = context;
        this.f9436f = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.e.a.b.g.h<a0> a(c.e.b.d dVar, FirebaseInstanceId firebaseInstanceId, f0 f0Var, c.e.b.p.h hVar, c.e.b.m.c cVar, com.google.firebase.installations.h hVar2, Context context, ScheduledExecutorService scheduledExecutorService) {
        return a(firebaseInstanceId, f0Var, new com.google.firebase.iid.s(dVar, f0Var, hVar, cVar, hVar2), context, scheduledExecutorService);
    }

    static c.e.a.b.g.h<a0> a(final FirebaseInstanceId firebaseInstanceId, final f0 f0Var, final com.google.firebase.iid.s sVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return c.e.a.b.g.k.a(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseInstanceId, f0Var, sVar) { // from class: com.google.firebase.messaging.z

            /* renamed from: a  reason: collision with root package name */
            private final Context f9506a;

            /* renamed from: b  reason: collision with root package name */
            private final ScheduledExecutorService f9507b;

            /* renamed from: c  reason: collision with root package name */
            private final FirebaseInstanceId f9508c;

            /* renamed from: d  reason: collision with root package name */
            private final f0 f9509d;

            /* renamed from: e  reason: collision with root package name */
            private final com.google.firebase.iid.s f9510e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9506a = context;
                this.f9507b = scheduledExecutorService;
                this.f9508c = firebaseInstanceId;
                this.f9509d = f0Var;
                this.f9510e = sVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a0.a(this.f9506a, this.f9507b, this.f9508c, this.f9509d, this.f9510e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ a0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, f0 f0Var, com.google.firebase.iid.s sVar) {
        return new a0(firebaseInstanceId, f0Var, y.a(context, scheduledExecutorService), sVar, context, scheduledExecutorService);
    }

    private static <T> T a(c.e.a.b.g.h<T> hVar) {
        try {
            return (T) c.e.a.b.g.k.a(hVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void a(x xVar, c.e.a.b.g.i<Void> iVar) {
        ArrayDeque<c.e.a.b.g.i<Void>> arrayDeque;
        synchronized (this.f9435e) {
            String c2 = xVar.c();
            if (this.f9435e.containsKey(c2)) {
                arrayDeque = this.f9435e.get(c2);
            } else {
                ArrayDeque<c.e.a.b.g.i<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f9435e.put(c2, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(iVar);
        }
    }

    private void c(x xVar) {
        synchronized (this.f9435e) {
            String c2 = xVar.c();
            if (!this.f9435e.containsKey(c2)) {
                return;
            }
            ArrayDeque<c.e.a.b.g.i<Void>> arrayDeque = this.f9435e.get(c2);
            c.e.a.b.g.i<Void> poll = arrayDeque.poll();
            if (poll != null) {
                poll.a((c.e.a.b.g.i<Void>) null);
            }
            if (arrayDeque.isEmpty()) {
                this.f9435e.remove(c2);
            }
        }
    }

    private void c(String str) {
        com.google.firebase.iid.w wVar = (com.google.firebase.iid.w) a(this.f9431a.g());
        a(this.f9434d.c(wVar.a(), wVar.b(), str));
    }

    private void d(String str) {
        com.google.firebase.iid.w wVar = (com.google.firebase.iid.w) a(this.f9431a.g());
        a(this.f9434d.d(wVar.a(), wVar.b(), str));
    }

    static boolean e() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    private void f() {
        if (!b()) {
            a(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> a(String str) {
        c.e.a.b.g.h<Void> b2 = b(x.b(str));
        c();
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        a(new b0(this, this.f9432b, this.f9433c, Math.min(Math.max(30L, j << 1), i)), j);
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable, long j) {
        this.f9436f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(boolean z) {
        this.f9437g = z;
    }

    boolean a() {
        return this.f9438h.a() != null;
    }

    boolean a(x xVar) {
        String sb;
        String sb2;
        try {
            String a2 = xVar.a();
            char c2 = 65535;
            int hashCode = a2.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && a2.equals("U")) {
                    c2 = 1;
                }
            } else if (a2.equals("S")) {
                c2 = 0;
            }
            if (c2 == 0) {
                c(xVar.b());
                if (e()) {
                    String b2 = xVar.b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b2).length() + 31);
                    sb3.append("Subscribe to topic: ");
                    sb3.append(b2);
                    sb3.append(" succeeded.");
                    sb2 = sb3.toString();
                    Log.d("FirebaseMessaging", sb2);
                }
                return true;
            } else if (c2 != 1) {
                if (e()) {
                    String valueOf = String.valueOf(xVar);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb4.append("Unknown topic operation");
                    sb4.append(valueOf);
                    sb4.append(".");
                    sb2 = sb4.toString();
                    Log.d("FirebaseMessaging", sb2);
                }
                return true;
            } else {
                d(xVar.b());
                if (e()) {
                    String b3 = xVar.b();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(b3).length() + 35);
                    sb5.append("Unsubscribe from topic: ");
                    sb5.append(b3);
                    sb5.append(" succeeded.");
                    sb2 = sb5.toString();
                    Log.d("FirebaseMessaging", sb2);
                }
                return true;
            }
        } catch (IOException e2) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage())) {
            }
            String message = e2.getMessage();
            StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 53);
            sb6.append("Topic operation failed: ");
            sb6.append(message);
            sb6.append(". Will retry Topic operation.");
            sb = sb6.toString();
            Log.e("FirebaseMessaging", sb);
            return false;
        }
        if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
            String message2 = e2.getMessage();
            StringBuilder sb62 = new StringBuilder(String.valueOf(message2).length() + 53);
            sb62.append("Topic operation failed: ");
            sb62.append(message2);
            sb62.append(". Will retry Topic operation.");
            sb = sb62.toString();
        } else if (e2.getMessage() != null) {
            throw e2;
        } else {
            sb = "Topic operation failed without exception message. Will retry Topic operation.";
        }
        Log.e("FirebaseMessaging", sb);
        return false;
    }

    c.e.a.b.g.h<Void> b(x xVar) {
        this.f9438h.a(xVar);
        c.e.a.b.g.i<Void> iVar = new c.e.a.b.g.i<>();
        a(xVar, iVar);
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(String str) {
        c.e.a.b.g.h<Void> b2 = b(x.c(str));
        c();
        return b2;
    }

    synchronized boolean b() {
        return this.f9437g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (a()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (e() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.y r0 = r2.f9438h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.x r0 = r0.a()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = e()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.a(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.y r1 = r2.f9438h
            r1.b(r0)
            r2.c(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.d():boolean");
    }
}
