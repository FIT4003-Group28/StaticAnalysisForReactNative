package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aodb  reason: default package */
/* loaded from: classes.dex */
public final class aodb implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private aocx e;
    private boolean f;

    public aodb(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new qyo("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            ((aoda) this.d.poll()).b();
        }
    }

    private final synchronized void c() {
        while (!this.d.isEmpty()) {
            aocx aocxVar = this.e;
            if (aocxVar != null && aocxVar.isBinderAlive()) {
                final aoda aodaVar = (aoda) this.d.poll();
                aocx aocxVar2 = this.e;
                if (Binder.getCallingUid() == Process.myUid()) {
                    aobl aoblVar = aocxVar2.a;
                    aoblVar.a.f(aodaVar.a).m(qrj.m, new rut() { // from class: aocw
                        @Override // defpackage.rut
                        public final void a(rve rveVar) {
                            aoda.this.b();
                        }
                    });
                } else {
                    throw new SecurityException("Binding only allowed within app");
                }
            } else {
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!qyf.a().c(this.a, this.b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f = false;
                        b();
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized rve a(Intent intent) {
        final aoda aodaVar;
        aodaVar = new aoda(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: aocz
            @Override // java.lang.Runnable
            public final void run() {
                aoda aodaVar2 = aoda.this;
                String action = aodaVar2.a.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseMessaging", sb.toString());
                aodaVar2.b();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
        aodaVar.a().m(scheduledExecutorService, new rut() { // from class: aocy
            @Override // defpackage.rut
            public final void a(rve rveVar) {
                schedule.cancel(false);
            }
        });
        this.d.add(aodaVar);
        c();
        return aodaVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = false;
        if (!(iBinder instanceof aocx)) {
            String valueOf = String.valueOf(iBinder);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Invalid service connection: ");
            sb.append(valueOf);
            Log.e("FirebaseMessaging", sb.toString());
            b();
            return;
        }
        this.e = (aocx) iBinder;
        c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c();
    }
}
