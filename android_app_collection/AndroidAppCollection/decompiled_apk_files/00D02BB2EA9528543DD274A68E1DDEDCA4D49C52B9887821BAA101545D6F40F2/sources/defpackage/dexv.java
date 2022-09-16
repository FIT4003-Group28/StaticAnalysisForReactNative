package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.frameworks.client.data.android.binder.LifecycleAwareServiceBinding;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dexv  reason: default package */
/* loaded from: classes6.dex */
public final class dexv extends dexw implements dymc, dexp {
    public final deyz a;
    public final dexq b;
    public final AtomicInteger c;
    @dzsi
    public dysl d;
    private final Executor m;
    private final deyw n;
    private int o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dexv(android.content.Context r6, @defpackage.dzsi defpackage.k r7, defpackage.dexo r8, java.util.concurrent.ScheduledExecutorService r9, java.util.concurrent.Executor r10, defpackage.deyz r11, defpackage.dyel r12) {
        /*
            r5 = this;
            dyej r7 = defpackage.dyel.b()
            dyek<dyiu> r0 = defpackage.dyop.a
            dyiu r1 = defpackage.dyiu.NONE
            r7.b(r0, r1)
            dyek<dyel> r0 = defpackage.dyop.b
            r7.b(r0, r12)
            dyek<java.net.SocketAddress> r12 = defpackage.dygc.b
            java.lang.Class r0 = r6.getClass()
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r6, r0)
            dexo r0 = defpackage.dexo.a(r1)
            r7.b(r12, r0)
            dyek<java.net.SocketAddress> r12 = defpackage.dygc.a
            r7.b(r12, r8)
            dyek<deyf> r12 = defpackage.deyv.a
            r0 = 0
            r7.b(r12, r0)
            dyel r7 = r7.a()
            java.lang.Class r12 = r6.getClass()
            java.lang.String r12 = r12.getSimpleName()
            android.content.ComponentName r1 = r8.a
            java.lang.String r1 = r1.toShortString()
            java.lang.String r2 = java.lang.String.valueOf(r12)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 2
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r12)
            java.lang.String r12 = "->"
            r4.append(r12)
            r4.append(r1)
            java.lang.Class<dexv> r12 = defpackage.dexv.class
            java.lang.String r1 = r4.toString()
            dygo r12 = defpackage.dygo.a(r12, r1)
            r5.<init>(r9, r7, r12)
            r7 = 1001(0x3e9, float:1.403E-42)
            r5.o = r7
            r5.m = r10
            r5.a = r11
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r7.<init>()
            r5.c = r7
            deyw r7 = new deyw
            r7.<init>()
            r5.n = r7
            com.google.frameworks.client.data.android.binder.LifecycleAwareServiceBinding r7 = new com.google.frameworks.client.data.android.binder.LifecycleAwareServiceBinding
            dbsg r9 = defpackage.dbsg.j(r0)
            android.content.ComponentName r8 = r8.a
            r7.<init>(r6, r9, r8, r5)
            r5.b = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dexv.<init>(android.content.Context, k, dexo, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor, deyz, dyel):void");
    }

    private static dyls s(dyjb dyjbVar, dyet dyetVar, dyel dyelVar, dyhw dyhwVar) {
        dyvi a = dyvi.a(dyetVar, dyelVar, dyhwVar);
        a.b();
        a.m();
        return new dyoh(dyjbVar);
    }

    @Override // defpackage.dexp
    public final synchronized void a(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(1);
        obtain.writeStrongBinder(this.g);
        try {
            if (!iBinder.transact(1, obtain, null, 1)) {
                n(dyjb.m, true);
            }
        } catch (RemoteException e) {
            n(dyjb.m.f(e), true);
        }
        obtain.recycle();
    }

    @Override // defpackage.dexp
    public final synchronized void b(boolean z) {
        dyjb g;
        if (z) {
            g = dyjb.k.g("service unbound due to lifecycle change");
        } else {
            g = dyjb.g.g("service unbound (or failed to bind)");
        }
        n(g, true);
    }

    @Override // defpackage.dysm
    public final synchronized Runnable c(dysl dyslVar) {
        this.d = dyslVar;
        return new Runnable(this) { // from class: dext
            private final dexv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dexv dexvVar = this.a;
                synchronized (dexvVar) {
                    if (dexvVar.q(1)) {
                        dexvVar.r(2);
                        dexvVar.b.g();
                    }
                }
            }
        };
    }

    @Override // defpackage.dylv
    public final synchronized dyls d(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        if (m()) {
            return s(this.j, dyetVar, this.i, dyhwVar);
        }
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        if (i2 == 16777215) {
            this.o = 1001;
        }
        deyb deybVar = new deyb(this, this.i, i, dyow.a(dyetVar));
        if (this.h.putIfAbsent(Integer.valueOf(i), deybVar) == null) {
            if (deybVar.a && this.c.getAndIncrement() == 0) {
                this.d.b(true);
            }
            deys deysVar = new deys(this, i, dyibVar, dyhwVar, dyvi.a(dyetVar, this.i, dyhwVar));
            if (dyibVar.a.a()) {
                return new deza(deybVar, deysVar);
            }
            return new deyo(deybVar, deysVar);
        }
        dyjb g = dyjb.l.g("Clashing call IDs");
        n(g, true);
        return s(g, dyetVar, this.i, dyhwVar);
    }

    @Override // defpackage.dysm
    public final synchronized void e(dyjb dyjbVar) {
        dbsk.t(dyjbVar, "reason");
        n(dyjbVar, false);
    }

    @Override // defpackage.dysm
    public final synchronized void f(dyjb dyjbVar) {
        dbsk.t(dyjbVar, "reason");
        n(dyjbVar, true);
    }

    @Override // defpackage.dexw
    public final void g(dyjb dyjbVar) {
        this.d.c(dyjbVar);
    }

    @Override // defpackage.dexw
    public final void h() {
        if (this.c.getAndSet(0) > 0) {
            this.d.b(false);
        }
        ((LifecycleAwareServiceBinding) this.b).i(false);
        this.d.d();
    }

    @Override // defpackage.dexw
    protected final void i(Parcel parcel) {
        dyiu dyiuVar;
        dyel dyelVar = this.i;
        int callingUid = Binder.getCallingUid();
        dyej c = dyelVar.c();
        c.b(e, Integer.valueOf(callingUid));
        dyek<dyiu> dyekVar = dyop.a;
        if (callingUid == Process.myUid()) {
            dyiuVar = dyiu.PRIVACY_AND_INTEGRITY;
        } else {
            dyiuVar = dyiu.INTEGRITY;
        }
        c.b(dyekVar, dyiuVar);
        this.i = c.a();
        if (q(2)) {
            int readInt = parcel.readInt();
            final IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1 || readStrongBinder == null) {
                n(dyjb.m, true);
            } else {
                this.m.execute(new Runnable(this, readStrongBinder) { // from class: dexu
                    private final dexv a;
                    private final IBinder b;

                    {
                        this.a = this;
                        this.b = readStrongBinder;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num;
                        dyjb a;
                        dexv dexvVar = this.a;
                        IBinder iBinder = this.b;
                        synchronized (dexvVar) {
                            num = (Integer) dexvVar.i.a(dexv.e);
                        }
                        if (num == null) {
                            a = dyjb.i.g("No remote UID available");
                        } else {
                            a = dexvVar.a.a(num.intValue());
                        }
                        synchronized (dexvVar) {
                            if (dexvVar.q(2)) {
                                if (!a.i()) {
                                    dexvVar.n(a, true);
                                } else {
                                    dexvVar.k = iBinder;
                                    try {
                                        iBinder.linkToDeath(dexvVar, 0);
                                        if (!dexvVar.m()) {
                                            dexvVar.r(3);
                                            dexvVar.d.a();
                                        }
                                    } catch (RemoteException unused) {
                                        dexvVar.n(dyjb.m.g("Failed to observe outgoing binder"), true);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.dexw
    protected final void j(Parcel parcel) {
        deyw deywVar = this.n;
        parcel.readInt();
        deywVar.a();
    }
}
