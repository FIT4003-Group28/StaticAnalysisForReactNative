package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: qwr  reason: default package */
/* loaded from: classes4.dex */
public abstract class qwr {
    private static final Feature[] a = new Feature[0];
    public final int A;
    public volatile String B;
    public ConnectionResult C;
    public boolean D;
    public volatile ConnectionInfo E;
    protected AtomicInteger F;
    public qxq G;
    private volatile String b;
    private final qxd c;
    private final qrr d;
    private IInterface e;
    private qwn f;
    private final String g;
    qxi p;
    public final Context q;
    public final Looper r;
    final Handler s;
    public final Object t;
    public final Object u;
    protected qwm v;
    public final ArrayList w;
    public int x;
    public final qwi y;
    public final qwj z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qwr(android.content.Context r10, android.os.Looper r11, int r12, defpackage.qwi r13, defpackage.qwj r14) {
        /*
            r9 = this;
            qxd r3 = defpackage.qxd.a(r10)
            qrr r4 = defpackage.qrr.d
            defpackage.qnm.b(r13)
            defpackage.qnm.b(r14)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwr.<init>(android.content.Context, android.os.Looper, int, qwi, qwj):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i, IInterface iInterface) {
        qxi qxiVar;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        qnm.c(z);
        synchronized (this.t) {
            this.x = i;
            this.e = iInterface;
            if (i == 1) {
                qwn qwnVar = this.f;
                if (qwnVar != null) {
                    qxd qxdVar = this.c;
                    qxi qxiVar2 = this.p;
                    String str = qxiVar2.a;
                    String str2 = qxiVar2.b;
                    int i2 = qxiVar2.c;
                    E();
                    qxdVar.e(str, qwnVar, this.p.d);
                    this.f = null;
                }
            } else if (i == 2 || i == 3) {
                qwn qwnVar2 = this.f;
                if (qwnVar2 != null && (qxiVar = this.p) != null) {
                    String str3 = qxiVar.a;
                    String str4 = qxiVar.b;
                    StringBuilder sb = new StringBuilder(str3.length() + 70 + str4.length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    qxd qxdVar2 = this.c;
                    qxi qxiVar3 = this.p;
                    String str5 = qxiVar3.a;
                    String str6 = qxiVar3.b;
                    int i3 = qxiVar3.c;
                    E();
                    qxdVar2.e(str5, qwnVar2, this.p.d);
                    this.F.incrementAndGet();
                }
                qwn qwnVar3 = new qwn(this, this.F.get());
                this.f = qwnVar3;
                qxi qxiVar4 = new qxi(d(), g());
                this.p = qxiVar4;
                if (qxiVar4.d && a() < 17895000) {
                    String str7 = this.p.a;
                    throw new IllegalStateException(str7.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(str7) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                qxd qxdVar3 = this.c;
                qxi qxiVar5 = this.p;
                String str8 = qxiVar5.a;
                String str9 = qxiVar5.b;
                int i4 = qxiVar5.c;
                if (!qxdVar3.b(new qxc(str8, this.p.d), qwnVar3, E())) {
                    qxi qxiVar6 = this.p;
                    String str10 = qxiVar6.a;
                    String str11 = qxiVar6.b;
                    StringBuilder sb2 = new StringBuilder(str10.length() + 34 + str11.length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str10);
                    sb2.append(" on ");
                    sb2.append(str11);
                    Log.w("GmsClient", sb2.toString());
                    O(16, this.F.get());
                }
            } else if (i == 4) {
                qnm.b(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final void A() {
    }

    public final void B(qxk qxkVar, Set set) {
        Bundle i = i();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.A, this.B);
        getServiceRequest.d = this.q.getPackageName();
        getServiceRequest.g = i;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (j()) {
            Account C = C();
            if (C == null) {
                C = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.h = C;
            if (qxkVar != null) {
                getServiceRequest.e = qxkVar.a;
            }
        } else if (L()) {
            getServiceRequest.h = C();
        }
        getServiceRequest.i = M();
        getServiceRequest.j = h();
        if (Q()) {
            getServiceRequest.m = true;
        }
        try {
            synchronized (this.u) {
                qxq qxqVar = this.G;
                if (qxqVar != null) {
                    qxp qxpVar = new qxp(this, this.F.get());
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(qxpVar);
                    obtain.writeInt(1);
                    qpm.a(getServiceRequest, obtain, 0);
                    qxqVar.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            I(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m(8, null, null, this.F.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m(8, null, null, this.F.get());
        }
    }

    public Account C() {
        return null;
    }

    protected final String E() {
        String str = this.g;
        return str == null ? this.q.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set F() {
        return Collections.emptySet();
    }

    public final void G() {
        int h = this.d.h(this.q, a());
        if (h != 0) {
            k(1, null);
            this.v = new qwo(this);
            Handler handler = this.s;
            handler.sendMessage(handler.obtainMessage(3, this.F.get(), h, null));
            return;
        }
        v(new qwo(this));
    }

    public final void H() {
        if (w()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public final void I(int i) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(6, this.F.get(), i));
    }

    public final boolean J(int i, int i2, IInterface iInterface) {
        synchronized (this.t) {
            if (this.x != i) {
                return false;
            }
            k(i2, iInterface);
            return true;
        }
    }

    public final boolean K() {
        return this.E != null;
    }

    public boolean L() {
        return false;
    }

    public Feature[] M() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O(int i, int i2) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new qwq(this, i)));
    }

    public boolean Q() {
        return false;
    }

    public int a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface b(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected abstract String d();

    public void f(String str) {
        this.b = str;
        l();
    }

    protected boolean g() {
        return false;
    }

    public Feature[] h() {
        return a;
    }

    protected Bundle i() {
        return new Bundle();
    }

    public boolean j() {
        return false;
    }

    public void l() {
        this.F.incrementAndGet();
        synchronized (this.w) {
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                ((qwl) this.w.get(i)).e();
            }
            this.w.clear();
        }
        synchronized (this.u) {
            this.G = null;
        }
        k(1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new qwp(this, i, iBinder, bundle)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        System.currentTimeMillis();
    }

    public void r() {
    }

    public final String s() {
        qxi qxiVar;
        if (!w() || (qxiVar = this.p) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return qxiVar.b;
    }

    public final String t() {
        return this.b;
    }

    public final void v(qwm qwmVar) {
        qnm.n(qwmVar, "Connection progress callbacks cannot be null.");
        this.v = qwmVar;
        k(2, null);
    }

    public final boolean w() {
        boolean z;
        synchronized (this.t) {
            z = this.x == 4;
        }
        return z;
    }

    public final boolean x() {
        boolean z;
        synchronized (this.t) {
            int i = this.x;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final Feature[] y() {
        ConnectionInfo connectionInfo = this.E;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void z(qul qulVar) {
        qulVar.a.l.o.post(new quk(qulVar));
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.t) {
            if (this.x == 5) {
                throw new DeadObjectException();
            }
            H();
            iInterface = this.e;
            qnm.n(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public qwr(Context context, Looper looper, qxd qxdVar, qrr qrrVar, int i, qwi qwiVar, qwj qwjVar, String str) {
        this.b = null;
        this.t = new Object();
        this.u = new Object();
        this.w = new ArrayList();
        this.x = 1;
        this.C = null;
        this.D = false;
        this.E = null;
        this.F = new AtomicInteger(0);
        qnm.n(context, "Context must not be null");
        this.q = context;
        qnm.n(looper, "Looper must not be null");
        this.r = looper;
        qnm.n(qxdVar, "Supervisor must not be null");
        this.c = qxdVar;
        qnm.n(qrrVar, "API availability must not be null");
        this.d = qrrVar;
        this.s = new qwk(this, looper);
        this.A = i;
        this.y = qwiVar;
        this.z = qwjVar;
        this.g = str;
    }
}
