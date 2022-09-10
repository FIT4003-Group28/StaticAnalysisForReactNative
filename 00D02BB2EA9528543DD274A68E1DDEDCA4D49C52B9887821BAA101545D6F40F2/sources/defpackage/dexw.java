package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dexw  reason: default package */
/* loaded from: classes6.dex */
public abstract class dexw implements IBinder.DeathRecipient, deyg {
    static final dyek<Integer> e = dyek.a("remote-uid");
    private final dygo a;
    private long d;
    public final ScheduledExecutorService f;
    protected dyel i;
    @dzsi
    protected dyjb j;
    @dzsi
    public IBinder k;
    public volatile boolean l;
    private long m;
    private int n = 1;
    public final deyh g = new deyh(this);
    protected final ConcurrentHashMap<Integer, deye<?>> h = new ConcurrentHashMap<>();
    private final AtomicLong b = new AtomicLong();
    private final AtomicLong c = new AtomicLong();

    public dexw(ScheduledExecutorService scheduledExecutorService, dyel dyelVar, dygo dygoVar) {
        this.f = scheduledExecutorService;
        this.i = dyelVar;
        this.a = dygoVar;
    }

    private final void a() {
        IBinder iBinder = this.k;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            Parcel obtain = Parcel.obtain();
            try {
                this.k.transact(2, obtain, null, 1);
            } catch (RemoteException unused2) {
            }
            obtain.recycle();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        n(dyjb.m, true);
    }

    public abstract void g(dyjb dyjbVar);

    public abstract void h();

    protected void i(Parcel parcel) {
    }

    protected void j(Parcel parcel) {
    }

    public final dygo k() {
        return this.a;
    }

    public final synchronized dyel l() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return q(4) || q(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(final dyjb dyjbVar, boolean z) {
        if (!m()) {
            this.j = dyjbVar;
            r(4);
            g(dyjbVar);
        }
        if (!q(5)) {
            if (!z && !this.h.isEmpty()) {
                return;
            }
            this.g.a = null;
            r(5);
            a();
            final ArrayList arrayList = new ArrayList(this.h.values());
            this.h.clear();
            this.f.execute(new Runnable(this, arrayList, dyjbVar) { // from class: dexr
                private final dexw a;
                private final ArrayList b;
                private final dyjb c;

                {
                    this.a = this;
                    this.b = arrayList;
                    this.c = dyjbVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dexw dexwVar = this.a;
                    ArrayList arrayList2 = this.b;
                    dyjb dyjbVar2 = this.c;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        deye deyeVar = (deye) arrayList2.get(i);
                        synchronized (deyeVar) {
                            deyeVar.l(dyjbVar2);
                        }
                    }
                    dexwVar.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, Parcel parcel) {
        int dataSize = parcel.dataSize();
        if (!this.k.transact(i, parcel, null, 1)) {
            throw dyjb.m.l();
        }
        if (this.b.addAndGet(dataSize) - this.d <= 131072) {
            return;
        }
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q(int i) {
        return this.n == i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(int i) {
        int i2 = this.n;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            dbsk.l(z);
        } else if (i3 == 2) {
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            dbsk.l(z);
        } else if (i3 != 3) {
            if (i2 == 4) {
                z = true;
            }
            dbsk.l(z);
        } else {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z = true;
            }
            dbsk.l(z);
        }
        this.n = i;
    }

    @Override // defpackage.deyg
    public final boolean p(int i, Parcel parcel) {
        deyt deytVar;
        L l;
        if (i >= 1001) {
            int dataSize = parcel.dataSize();
            deye<?> deyeVar = this.h.get(Integer.valueOf(i));
            if (deyeVar == null) {
                synchronized (this) {
                }
                deyeVar = null;
            }
            if (deyeVar != null) {
                deyeVar.n(parcel);
            }
            if (this.c.addAndGet(dataSize) - this.m > 16384) {
                synchronized (this) {
                    IBinder iBinder = this.k;
                    dbsk.s(iBinder);
                    long j = this.c.get();
                    this.m = j;
                    Parcel obtain = Parcel.obtain();
                    obtain.writeLong(j);
                    try {
                        if (!iBinder.transact(3, obtain, null, 1)) {
                            n(dyjb.m, true);
                        }
                    } catch (RemoteException e2) {
                        n(dyjb.m.f(e2), true);
                    }
                    obtain.recycle();
                }
            }
            return true;
        }
        synchronized (this) {
            if (i == 1) {
                i(parcel);
            } else if (i == 2) {
                n(dyjb.m, true);
            } else if (i == 3) {
                this.d = Math.max(this.d, parcel.readLong());
                if (this.b.get() - this.d < 131072 && this.l) {
                    this.l = false;
                    for (deye<?> deyeVar2 : this.h.values()) {
                        synchronized (deyeVar2) {
                            deytVar = deyeVar2.e;
                            l = deyeVar2.g;
                        }
                        if (l != 0) {
                            l.f();
                        }
                        if (deytVar != null) {
                            try {
                                synchronized (deytVar) {
                                    deytVar.g();
                                }
                            } catch (dyjc e3) {
                                synchronized (deyeVar2) {
                                    deyeVar2.l(e3.a);
                                }
                            }
                        }
                    }
                }
            } else if (i != 4) {
                if (i != 5) {
                    return false;
                }
                j(parcel);
            } else if (this.n == 3) {
                try {
                    this.k.transact(5, parcel, null, 1);
                } catch (RemoteException unused) {
                }
            }
            return true;
        }
    }
}
