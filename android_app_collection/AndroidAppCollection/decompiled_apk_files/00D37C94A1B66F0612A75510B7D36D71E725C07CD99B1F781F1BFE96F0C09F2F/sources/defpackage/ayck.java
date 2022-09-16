package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayck  reason: default package */
/* loaded from: classes2.dex */
public final class ayck extends aycl implements ayez, ayce {
    public final aycd a;
    public final aycf b;
    public final AtomicInteger c;
    public ayjs d;
    private final Executor p;
    private int q;
    private final aymj r;
    private final aztk s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ayck(android.content.Context r6, defpackage.aybz r7, java.util.concurrent.Executor r8, defpackage.aymj r9, defpackage.aymj r10, defpackage.aycd r11, defpackage.axyb r12) {
        /*
            r5 = this;
            axxz r0 = defpackage.axyb.a()
            axya r1 = defpackage.ayhb.a
            aybo r2 = defpackage.aybo.NONE
            r0.b(r1, r2)
            axya r1 = defpackage.ayhb.b
            r0.b(r1, r12)
            axya r12 = defpackage.axzg.b
            java.lang.Class r1 = r6.getClass()
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r1)
            aybz r1 = defpackage.aybz.b(r2)
            r0.b(r12, r1)
            axya r12 = defpackage.axzg.a
            r0.b(r12, r7)
            axya r12 = defpackage.ayck.g
            r1 = 0
            r0.b(r12, r1)
            axyb r12 = r0.a()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.ComponentName r1 = r7.a()
            java.lang.String r1 = r1.toShortString()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 2
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "->"
            r4.append(r0)
            r4.append(r1)
            java.lang.Class<ayck> r0 = defpackage.ayck.class
            java.lang.String r1 = r4.toString()
            axzs r0 = defpackage.axzs.a(r0, r1)
            r5.<init>(r9, r12, r0)
            r9 = 1001(0x3e9, float:1.403E-42)
            r5.q = r9
            r5.r = r10
            r5.a = r11
            java.lang.Object r9 = r10.b()
            r5.p = r9
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>()
            r5.c = r9
            aztk r9 = new aztk
            r9.<init>()
            r5.s = r9
            aycz r9 = new aycz
            android.content.Intent r7 = r7.a
            android.content.Intent r7 = r7.cloneFilter()
            r9.<init>(r8, r6, r7, r5)
            r5.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayck.<init>(android.content.Context, aybz, java.util.concurrent.Executor, aymj, aymj, aycd, axyb):void");
    }

    private static ayeo t(Status status, axyb axybVar, ayat ayatVar, azqj[] azqjVarArr) {
        aymk.m(azqjVarArr, axybVar, ayatVar).c();
        return new aygt(status, azqjVarArr, null, null);
    }

    @Override // defpackage.ayce
    public final synchronized void a(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(1);
        obtain.writeStrongBinder(this.i);
        try {
            if (!iBinder.transact(1, obtain, null, 1)) {
                o(Status.o.withDescription("Failed sending SETUP_TRANSPORT transaction"), true);
            }
        } catch (RemoteException e) {
            o(aycl.m(e), true);
        }
        obtain.recycle();
    }

    @Override // defpackage.ayce
    public final synchronized void b(Status status) {
        o(status, true);
    }

    @Override // defpackage.ayjt
    public final synchronized Runnable d(ayjs ayjsVar) {
        this.d = ayjsVar;
        return new Runnable() { // from class: ayci
            @Override // java.lang.Runnable
            public final void run() {
                ayck ayckVar = ayck.this;
                synchronized (ayckVar) {
                    if (ayckVar.s(1)) {
                        ayckVar.r(2);
                        ayckVar.b.a();
                    }
                }
            }
        };
    }

    @Override // defpackage.aycl
    protected final void e(Parcel parcel) {
        aztk aztkVar = this.s;
        parcel.readInt();
        aztkVar.d();
    }

    @Override // defpackage.aycl
    protected final void f(Parcel parcel) {
        aybo ayboVar;
        axyb axybVar = this.k;
        int callingUid = Binder.getCallingUid();
        axxz b = axybVar.b();
        b.b(f, Integer.valueOf(callingUid));
        axya axyaVar = ayhb.a;
        if (callingUid == Process.myUid()) {
            ayboVar = aybo.PRIVACY_AND_INTEGRITY;
        } else {
            ayboVar = aybo.INTEGRITY;
        }
        b.b(axyaVar, ayboVar);
        this.k = b.a();
        if (s(2)) {
            int readInt = parcel.readInt();
            final IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1) {
                o(Status.o.withDescription("Wire format version mismatch"), true);
            } else if (readStrongBinder == null) {
                o(Status.o.withDescription("Malformed SETUP_TRANSPORT data"), true);
            } else {
                this.p.execute(new Runnable() { // from class: aycj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num;
                        Status a;
                        ayck ayckVar = ayck.this;
                        IBinder iBinder = readStrongBinder;
                        synchronized (ayckVar) {
                            num = (Integer) ayckVar.k.c(ayck.f);
                        }
                        if (num == null) {
                            a = Status.i.withDescription("No remote UID available");
                        } else {
                            a = ayckVar.a.a(num.intValue());
                        }
                        synchronized (ayckVar) {
                            if (ayckVar.s(2)) {
                                if (!a.f()) {
                                    ayckVar.o(a, true);
                                } else {
                                    ayckVar.m = iBinder;
                                    try {
                                        iBinder.linkToDeath(ayckVar, 0);
                                        if (!ayckVar.q()) {
                                            ayckVar.r(3);
                                            ayckVar.d.b();
                                        }
                                    } catch (RemoteException unused) {
                                        ayckVar.o(Status.o.withDescription("Failed to observe outgoing binder"), true);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.aycl
    public final void g(Status status) {
        this.d.c(status);
    }

    @Override // defpackage.aycl
    public final void h() {
        if (this.c.getAndSet(0) > 0) {
            this.d.a(false);
        }
        ((aycz) this.b).c(Status.c);
        this.d.d();
    }

    @Override // defpackage.aycl
    public final void i() {
        this.o.c(this.h);
        this.r.c(this.p);
    }

    @Override // defpackage.ayjt
    public final synchronized void j(Status status) {
        status.getClass();
        o(status, false);
    }

    @Override // defpackage.ayjt
    public final synchronized void k(Status status) {
        status.getClass();
        o(status, true);
    }

    @Override // defpackage.ayer
    public final synchronized ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        if (q()) {
            return t(this.l, this.k, ayatVar, azqjVarArr);
        }
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        if (i2 == 16777215) {
            this.q = 1001;
        }
        aymk m = aymk.m(azqjVarArr, this.k, ayatVar);
        ayco aycoVar = new ayco(this, this.k, i, ayhf.h(axydVar));
        if (this.j.putIfAbsent(Integer.valueOf(i), aycoVar) == null) {
            if (aycoVar.a && this.c.getAndIncrement() == 0) {
                this.d.a(true);
            }
            aycv aycvVar = new aycv(this, i, ayaxVar, ayatVar, m);
            if (ayaxVar.a.a()) {
                return new ayda(aycoVar, aycvVar);
            }
            return new aycu(aycoVar, aycvVar);
        }
        Status withDescription = Status.n.withDescription("Clashing call IDs");
        o(withDescription, true);
        return t(withDescription, this.k, ayatVar, azqjVarArr);
    }
}
