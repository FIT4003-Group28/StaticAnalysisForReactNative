package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aycl  reason: default package */
/* loaded from: classes2.dex */
public abstract class aycl implements IBinder.DeathRecipient, aycs {
    public static final Logger e = Logger.getLogger(aycl.class.getName());
    public static final axya f = axya.a("remote-uid");
    public static final axya g = axya.a("inbound-parcelable-policy");
    private final axzs a;
    private long d;
    public final ScheduledExecutorService h;
    protected axyb k;
    protected Status l;
    public IBinder m;
    public volatile boolean n;
    public final aymj o;
    private long p;
    private int q = 1;
    public final ayct i = new ayct(this);
    protected final ConcurrentHashMap j = new ConcurrentHashMap();
    private final AtomicLong b = new AtomicLong();
    private final AtomicLong c = new AtomicLong();

    public aycl(aymj aymjVar, axyb axybVar, axzs axzsVar) {
        this.o = aymjVar;
        this.k = axybVar;
        this.a = axzsVar;
        this.h = (ScheduledExecutorService) aymjVar.b();
    }

    private final void a() {
        IBinder iBinder = this.m;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            Parcel obtain = Parcel.obtain();
            try {
                this.m.transact(2, obtain, null, 1);
            } catch (RemoteException unused2) {
            }
            obtain.recycle();
        }
    }

    public static Status m(RemoteException remoteException) {
        if ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) {
            return Status.o.c(remoteException);
        }
        return Status.n.c(remoteException);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        o(Status.o.withDescription("binderDied"), true);
    }

    public final axzs c() {
        return this.a;
    }

    protected void e(Parcel parcel) {
    }

    protected void f(Parcel parcel) {
    }

    public abstract void g(Status status);

    public abstract void h();

    public void i() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i, Parcel parcel) {
        int dataSize = parcel.dataSize();
        try {
            if (this.m.transact(i, parcel, null, 1)) {
                long addAndGet = this.b.addAndGet(dataSize);
                if (addAndGet - this.d <= 131072) {
                    return;
                }
                Logger logger = e;
                Level level = Level.FINE;
                long j = this.d;
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89);
                sb.append("transmist window full. Outgoing=");
                sb.append(addAndGet);
                sb.append(" Ack'd Outgoing=");
                sb.append(j);
                sb.append(" ");
                sb.append(valueOf);
                logger.logp(level, "io.grpc.binder.internal.BinderTransport", "sendTransaction", sb.toString());
                this.n = true;
                return;
            }
            throw Status.o.withDescription("Failed sending transaction").asException();
        } catch (RemoteException e2) {
            throw m(e2).asException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(final Status status, boolean z) {
        if (!q()) {
            this.l = status;
            r(4);
            g(status);
        }
        if (!s(5)) {
            if (!z && !this.j.isEmpty()) {
                return;
            }
            this.i.a = null;
            r(5);
            a();
            final ArrayList arrayList = new ArrayList(this.j.values());
            this.j.clear();
            this.h.execute(new Runnable() { // from class: aych
                @Override // java.lang.Runnable
                public final void run() {
                    aycl ayclVar = aycl.this;
                    ArrayList arrayList2 = arrayList;
                    Status status2 = status;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        aycr aycrVar = (aycr) arrayList2.get(i);
                        synchronized (aycrVar) {
                            aycrVar.g(status2);
                        }
                    }
                    ayclVar.h();
                    ayclVar.i();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return s(4) || s(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            aqxo.y(z);
        } else if (i3 == 2) {
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            aqxo.y(z);
        } else if (i3 != 3) {
            if (i2 == 4) {
                z = true;
            }
            aqxo.y(z);
        } else {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z = true;
            }
            aqxo.y(z);
        }
        this.q = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(int i) {
        return this.q == i;
    }

    @Override // defpackage.aycs
    public final boolean p(int i, Parcel parcel) {
        aycw aycwVar;
        aymn aymnVar;
        if (i >= 1001) {
            int dataSize = parcel.dataSize();
            aycr aycrVar = (aycr) this.j.get(Integer.valueOf(i));
            if (aycrVar == null) {
                synchronized (this) {
                }
                aycrVar = null;
            }
            if (aycrVar != null) {
                aycrVar.j(parcel);
            }
            if (this.c.addAndGet(dataSize) - this.p > 16384) {
                synchronized (this) {
                    IBinder iBinder = this.m;
                    iBinder.getClass();
                    long j = this.c.get();
                    this.p = j;
                    Parcel obtain = Parcel.obtain();
                    obtain.writeLong(j);
                    try {
                        if (!iBinder.transact(3, obtain, null, 1)) {
                            o(Status.o.withDescription("Failed sending ack bytes transaction"), true);
                        }
                    } catch (RemoteException e2) {
                        o(m(e2), true);
                    }
                    obtain.recycle();
                }
            }
            return true;
        }
        synchronized (this) {
            if (i == 1) {
                f(parcel);
            } else if (i == 2) {
                o(Status.o.withDescription("transport shutdown by peer"), true);
            } else if (i == 3) {
                long readLong = parcel.readLong();
                long j2 = this.d;
                if (j2 - readLong >= 0) {
                    readLong = j2;
                }
                this.d = readLong;
                if (this.b.get() - this.d < 131072 && this.n) {
                    Logger logger = e;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                    sb.append("handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", sb.toString());
                    this.n = false;
                    for (aycr aycrVar2 : this.j.values()) {
                        synchronized (aycrVar2) {
                            aycwVar = aycrVar2.e;
                            aymnVar = aycrVar2.g;
                        }
                        if (aymnVar != null) {
                            aymnVar.e();
                        }
                        if (aycwVar != null) {
                            try {
                                synchronized (aycwVar) {
                                    aycwVar.f();
                                }
                            } catch (StatusException e3) {
                                synchronized (aycrVar2) {
                                    aycrVar2.g(e3.a);
                                }
                            }
                        }
                    }
                }
            } else if (i != 4) {
                if (i != 5) {
                    return false;
                }
                e(parcel);
            } else if (this.q == 3) {
                try {
                    this.m.transact(5, parcel, null, 1);
                } catch (RemoteException unused) {
                }
            }
            return true;
        }
    }
}
