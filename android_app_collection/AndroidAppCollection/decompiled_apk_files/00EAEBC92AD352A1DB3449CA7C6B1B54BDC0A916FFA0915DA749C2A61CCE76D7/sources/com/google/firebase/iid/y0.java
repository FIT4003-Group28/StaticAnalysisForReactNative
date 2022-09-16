package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.y0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class y0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9324a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f9325b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f9326c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f9327d;

    /* renamed from: e  reason: collision with root package name */
    private v0 f9328e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9329f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f9330a;

        /* renamed from: b  reason: collision with root package name */
        private final c.e.a.b.g.i<Void> f9331b = new c.e.a.b.g.i<>();

        a(Intent intent) {
            this.f9330a = intent;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            this.f9331b.b((c.e.a.b.g.i<Void>) null);
        }

        void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.w0

                /* renamed from: b  reason: collision with root package name */
                private final y0.a f9303b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9303b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9303b.c();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            b().a(scheduledExecutorService, new c.e.a.b.g.c(schedule) { // from class: com.google.firebase.iid.x0

                /* renamed from: a  reason: collision with root package name */
                private final ScheduledFuture f9306a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9306a = schedule;
                }

                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    this.f9306a.cancel(false);
                }
            });
        }

        c.e.a.b.g.h<Void> b() {
            return this.f9331b.a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final /* synthetic */ void c() {
            String action = this.f9330a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseInstanceId", sb.toString());
            a();
        }
    }

    public y0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.q.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    y0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f9327d = new ArrayDeque();
        this.f9329f = false;
        this.f9324a = context.getApplicationContext();
        this.f9325b = new Intent(str).setPackage(this.f9324a.getPackageName());
        this.f9326c = scheduledExecutorService;
    }

    private void a() {
        while (!this.f9327d.isEmpty()) {
            this.f9327d.poll().a();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f9327d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            if (this.f9328e == null || !this.f9328e.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
            }
            this.f9328e.a(this.f9327d.poll());
        }
    }

    private void c() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f9329f);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        if (this.f9329f) {
            return;
        }
        this.f9329f = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", e2);
        }
        if (com.google.android.gms.common.stats.a.a().a(this.f9324a, this.f9325b, this, 65)) {
            return;
        }
        Log.e("FirebaseInstanceId", "binding to the service failed");
        this.f9329f = false;
        a();
    }

    public synchronized c.e.a.b.g.h<Void> a(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.f9326c);
        this.f9327d.add(aVar);
        b();
        return aVar.b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f9329f = false;
        if (iBinder instanceof v0) {
            this.f9328e = (v0) iBinder;
            b();
            return;
        }
        String valueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(valueOf2);
        Log.e("FirebaseInstanceId", sb2.toString());
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        b();
    }
}
