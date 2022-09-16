package defpackage;

import android.app.Service;
import android.content.Context;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ameq  reason: default package */
/* loaded from: classes.dex */
public final class ameq {
    public final ameh a;
    public final Context b;
    public final Object c = new Object();
    public final Map d = new IdentityHashMap(10);
    public Service e;
    public amep f;
    public int g;
    public ameo h;

    public ameq(Context context, ameh amehVar, final Executor executor) {
        this.b = context;
        this.a = amehVar;
        anlz.g(executor);
        this.f = amep.STOPPED;
        new Runnable() { // from class: amen
            @Override // java.lang.Runnable
            public final void run() {
                final ameq ameqVar = ameq.this;
                executor.execute(new Runnable() { // from class: amem
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r7 = this;
                            ameq r0 = defpackage.ameq.this
                            ameh r1 = r0.a
                            java.lang.Object r2 = r1.a
                            monitor-enter(r2)
                            boolean r1 = r1.c     // Catch: java.lang.Throwable -> L6b
                            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
                            java.lang.Object r3 = r0.c
                            monitor-enter(r3)
                            r2 = 1
                            r4 = 0
                            if (r1 != 0) goto L1d
                            java.util.Map r1 = r0.d     // Catch: java.lang.Throwable -> L1b
                            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
                            if (r1 != 0) goto L1d
                            r1 = 1
                            goto L1e
                        L1b:
                            r0 = move-exception
                            goto L69
                        L1d:
                            r1 = 0
                        L1e:
                            amep r5 = defpackage.amep.STOPPED     // Catch: java.lang.Throwable -> L1b
                            amep r5 = r0.f     // Catch: java.lang.Throwable -> L1b
                            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L1b
                            if (r5 == 0) goto L32
                            r2 = 2
                            if (r5 == r2) goto L2c
                            goto L67
                        L2c:
                            if (r1 != 0) goto L67
                            r0.b()     // Catch: java.lang.Throwable -> L1b
                            goto L67
                        L32:
                            if (r1 == 0) goto L67
                            r1 = 0
                            ameo r5 = r0.a(r1)     // Catch: java.lang.Throwable -> L1b
                            android.app.Notification r5 = r5.a     // Catch: java.lang.Throwable -> L1b
                            amep r5 = r0.f     // Catch: java.lang.Throwable -> L1b
                            amep r6 = defpackage.amep.STOPPED     // Catch: java.lang.Throwable -> L1b
                            if (r5 != r6) goto L42
                            goto L43
                        L42:
                            r2 = 0
                        L43:
                            defpackage.aqxo.y(r2)     // Catch: java.lang.Throwable -> L1b
                            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1b
                            android.content.Context r4 = r0.b     // Catch: java.lang.Throwable -> L1b
                            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1b
                            java.lang.String r4 = "fallback_notification"
                            r2.putExtra(r4, r1)     // Catch: java.lang.Throwable -> L1b
                            amep r1 = defpackage.amep.STARTING     // Catch: java.lang.Throwable -> L1b
                            r0.f = r1     // Catch: java.lang.Throwable -> L1b
                            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
                            r4 = 26
                            if (r1 < r4) goto L62
                            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L1b
                            r0.startForegroundService(r2)     // Catch: java.lang.Throwable -> L1b
                            goto L67
                        L62:
                            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L1b
                            r0.startService(r2)     // Catch: java.lang.Throwable -> L1b
                        L67:
                            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                            return
                        L69:
                            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                            throw r0
                        L6b:
                            r0 = move-exception
                            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.amem.run():void");
                    }
                });
            }
        };
    }

    public final ameo a(ameo ameoVar) {
        aqxo.z(!this.d.isEmpty(), "Can't select a best notification if thare are none");
        for (ameo ameoVar2 : this.d.values()) {
            if (ameoVar != null) {
                int i = ameoVar2.b;
            } else {
                ameoVar = ameoVar2;
            }
        }
        return ameoVar;
    }

    public final void b() {
        aqxo.B(this.f == amep.STARTED, "Destroyed in wrong state %s", this.f);
        this.f = amep.STOPPED;
        this.e.stopForeground(true);
        this.h = null;
        this.e.stopSelf(this.g);
        this.e = null;
    }
}
