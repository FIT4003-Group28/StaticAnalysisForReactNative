package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cnct  reason: default package */
/* loaded from: classes5.dex */
final class cnct implements ServiceConnection {
    public aiy<cmxn> a;
    final /* synthetic */ cncu b;

    public cnct(cncu cncuVar) {
        this.b = cncuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        final cncu cncuVar = this.b;
        final aiy<cmxn> aiyVar = this.a;
        if (iBinder == null) {
            cncuVar.f(new cnah(ddid.GH_STARTUP_SERVICE_NULL_BINDING, "Gearhead Car Startup Service returned null binding."), aiyVar);
        } else {
            Executors.newSingleThreadExecutor().execute(new Runnable(cncuVar, iBinder, aiyVar) { // from class: cncr
                private final cncu a;
                private final IBinder b;
                private final aiy c;

                {
                    this.a = cncuVar;
                    this.b = iBinder;
                    this.c = aiyVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r9 = this;
                        cncu r0 = r9.a
                        android.os.IBinder r1 = r9.b
                        aiy r2 = r9.c
                        java.lang.String r3 = "com.google.android.gms.car.startup.IStartup"
                        android.os.IInterface r3 = r1.queryLocalInterface(r3)
                        boolean r4 = r3 instanceof defpackage.cnjf
                        if (r4 == 0) goto L13
                        cnjf r3 = (defpackage.cnjf) r3
                        goto L18
                    L13:
                        cnjf r3 = new cnjf
                        r3.<init>(r1)
                    L18:
                        r1 = 0
                        boolean r1 = r3.f()     // Catch: java.lang.Throwable -> L1e
                        goto L26
                    L1e:
                        java.lang.String r4 = "GH.GhCarClientCtor"
                        r5 = 4
                        boolean r4 = defpackage.cnjc.a(r4, r5)
                    L26:
                        r4 = 0
                        cmxn r3 = r3.e()     // Catch: java.lang.SecurityException -> L3d android.os.RemoteException -> L4b java.lang.IllegalStateException -> L59
                        if (r3 != 0) goto L67
                        cnai r4 = new cnai     // Catch: java.lang.SecurityException -> L37 android.os.RemoteException -> L39 java.lang.IllegalStateException -> L3b
                        ddid r5 = defpackage.ddid.GH_STARTUP_SERVICE_NULL_CAR_SERVICE     // Catch: java.lang.SecurityException -> L37 android.os.RemoteException -> L39 java.lang.IllegalStateException -> L3b
                        java.lang.String r6 = "Car service unexpectedly null."
                        r4.<init>(r5, r6)     // Catch: java.lang.SecurityException -> L37 android.os.RemoteException -> L39 java.lang.IllegalStateException -> L3b
                        goto L67
                    L37:
                        r4 = move-exception
                        goto L41
                    L39:
                        r4 = move-exception
                        goto L4f
                    L3b:
                        r4 = move-exception
                        goto L5d
                    L3d:
                        r3 = move-exception
                        r8 = r4
                        r4 = r3
                        r3 = r8
                    L41:
                        cnai r5 = new cnai
                        ddid r6 = defpackage.ddid.GH_STARTUP_SERVICE_SECURITY_EXCEPTION
                        java.lang.String r7 = "Not allowed to access the Gearhead Car Service."
                        r5.<init>(r6, r7, r4)
                        goto L66
                    L4b:
                        r3 = move-exception
                        r8 = r4
                        r4 = r3
                        r3 = r8
                    L4f:
                        cnai r5 = new cnai
                        ddid r6 = defpackage.ddid.GH_STARTUP_SERVICE_REMOTE_EXCEPTION
                        java.lang.String r7 = "Gearhead Car Startup Service failed to become ready."
                        r5.<init>(r6, r7, r4)
                        goto L66
                    L59:
                        r3 = move-exception
                        r8 = r4
                        r4 = r3
                        r3 = r8
                    L5d:
                        cnai r5 = new cnai
                        ddid r6 = defpackage.ddid.GH_STARTUP_SERVICE_ILLEGAL_STATE_EXCEPTION
                        java.lang.String r7 = "Gearhead Car Startup Service had an internal failure."
                        r5.<init>(r6, r7, r4)
                    L66:
                        r4 = r5
                    L67:
                        if (r4 == 0) goto L6f
                        int r1 = defpackage.cnjc.a
                        r0.f(r4, r2)
                        return
                    L6f:
                        int r4 = defpackage.cnjc.a
                        monitor-enter(r0)
                        r0.f = r1     // Catch: java.lang.Throwable -> L7e
                        if (r2 == 0) goto L7c
                        defpackage.dbsk.s(r3)     // Catch: java.lang.Throwable -> L7e
                        r2.b(r3)     // Catch: java.lang.Throwable -> L7e
                    L7c:
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
                        return
                    L7e:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cncr.run():void");
                }
            });
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cnxg.a().d(this.b.a, this);
        final cncu cncuVar = this.b;
        cnaj cnajVar = new cnaj();
        cncuVar.g(cnajVar, this.a);
        if (cnjc.a("GH.GhCarClientCtor", 4)) {
            cnajVar.getMessage();
        }
        cncu.i(cncuVar.c, new Runnable(cncuVar) { // from class: cncq
            private final cncu a;

            {
                this.a = cncuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cncd cncdVar = this.a.e;
                dbsk.s(cncdVar);
                cncdVar.a();
            }
        });
    }
}
