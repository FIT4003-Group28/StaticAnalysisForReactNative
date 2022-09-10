package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: deso  reason: default package */
/* loaded from: classes6.dex */
public final class deso implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<desn> d;
    private desk e;
    private boolean f;

    public deso(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new cnxx("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (defpackage.cnxg.a().b(r4.a, r4.b, r4, 65) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void b() {
        /*
            r4 = this;
            monitor-enter(r4)
        L1:
            java.util.Queue<desn> r0 = r4.d     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L67
            desk r0 = r4.e     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L44
            boolean r0 = r0.isBinderAlive()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L44
            java.util.Queue<desn> r0 = r4.d     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L69
            desn r0 = (defpackage.desn) r0     // Catch: java.lang.Throwable -> L69
            desk r1 = r4.e     // Catch: java.lang.Throwable -> L69
            int r2 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> L69
            int r3 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L69
            if (r2 != r3) goto L3c
            deuk r1 = r1.a     // Catch: java.lang.Throwable -> L69
            android.content.Intent r2 = r0.a     // Catch: java.lang.Throwable -> L69
            deul r1 = r1.a     // Catch: java.lang.Throwable -> L69
            cpcq r1 = r1.e(r2)     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.Executor r2 = defpackage.dero.a     // Catch: java.lang.Throwable -> L69
            desj r3 = new desj     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r1.n(r2, r3)     // Catch: java.lang.Throwable -> L69
            goto L1
        L3c:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L69
        L44:
            boolean r0 = r4.f     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L49
            goto L5d
        L49:
            r0 = 1
            r4.f = r0     // Catch: java.lang.Throwable -> L69
            cnxg r0 = defpackage.cnxg.a()     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L69
            android.content.Context r1 = r4.a     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L69
            android.content.Intent r2 = r4.b     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L69
            r3 = 65
            boolean r0 = r0.b(r1, r2, r4, r3)     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L69
            if (r0 != 0) goto L5d
            goto L5f
        L5d:
            monitor-exit(r4)
            return
        L5f:
            r0 = 0
            r4.f = r0     // Catch: java.lang.Throwable -> L69
            r4.c()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r4)
            return
        L67:
            monitor-exit(r4)
            return
        L69:
            r0 = move-exception
            monitor-exit(r4)
            goto L6d
        L6c:
            throw r0
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deso.b():void");
    }

    private final void c() {
        while (!this.d.isEmpty()) {
            this.d.poll().b();
        }
    }

    public final synchronized cpcq<Void> a(Intent intent) {
        final desn desnVar;
        desnVar = new desn(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(desnVar) { // from class: desl
            private final desn a;

            {
                this.a = desnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                desn desnVar2 = this.a;
                String action = desnVar2.a.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                sb.toString();
                desnVar2.b();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
        desnVar.a().n(scheduledExecutorService, new cpcf(schedule) { // from class: desm
            private final ScheduledFuture a;

            {
                this.a = schedule;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar) {
                this.a.cancel(false);
            }
        });
        this.d.add(desnVar);
        b();
        return desnVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = false;
        if (!(iBinder instanceof desk)) {
            String valueOf = String.valueOf(iBinder);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Invalid service connection: ");
            sb.append(valueOf);
            sb.toString();
            c();
            return;
        }
        this.e = (desk) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b();
    }
}
