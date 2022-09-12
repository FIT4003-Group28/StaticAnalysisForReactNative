package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cnui  reason: default package */
/* loaded from: classes.dex */
public abstract class cnui<T extends IInterface> {
    private static final Feature[] a = new Feature[0];
    private cnue A;
    private final int B;
    private final String C;
    cnvh b;
    public final Context c;
    public final cnmr d;
    final Handler e;
    protected cnuc h;
    public volatile String k;
    public final cnuu p;
    public final cnuv q;
    public cnvq r;
    private int s;
    private long t;
    private long u;
    private int v;
    private long w;
    private final cnva y;
    private T z;
    private volatile String x = null;
    public final Object f = new Object();
    public final Object g = new Object();
    public final ArrayList<cnub<?>> i = new ArrayList<>();
    public int j = 1;
    public ConnectionResult l = null;
    public boolean m = false;
    public volatile ConnectionInfo n = null;
    protected final AtomicInteger o = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: protected */
    public cnui(Context context, Looper looper, cnva cnvaVar, cnmr cnmrVar, int i, cnuu cnuuVar, cnuv cnuvVar, String str) {
        cnwc.n(context, "Context must not be null");
        this.c = context;
        cnwc.n(looper, "Looper must not be null");
        cnwc.n(cnvaVar, "Supervisor must not be null");
        this.y = cnvaVar;
        cnwc.n(cnmrVar, "API availability must not be null");
        this.d = cnmrVar;
        this.e = new cnua(this, looper);
        this.B = i;
        this.p = cnuuVar;
        this.q = cnuvVar;
        this.C = str;
    }

    public final void A(cnvj cnvjVar, Set<Scope> set) {
        Bundle i = i();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.B, this.k);
        getServiceRequest.d = this.c.getPackageName();
        getServiceRequest.g = i;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (j()) {
            Account H = H();
            if (H == null) {
                H = new Account(GoogleApiClient.DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.h = H;
            if (cnvjVar != null) {
                getServiceRequest.e = cnvjVar.asBinder();
            }
        } else if (M()) {
            getServiceRequest.h = H();
        }
        getServiceRequest.i = I();
        getServiceRequest.j = Sm();
        if (So()) {
            getServiceRequest.m = true;
        }
        try {
            try {
                synchronized (this.g) {
                    cnvq cnvqVar = this.r;
                    if (cnvqVar != null) {
                        cnvqVar.a(new cnud(this, this.o.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                J(8, null, null, this.o.get());
            }
        } catch (DeadObjectException unused2) {
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.o.get(), 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    protected String B() {
        return "com.google.android.gms";
    }

    protected final String C() {
        String str = this.C;
        return str == null ? this.c.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(ConnectionResult connectionResult) {
        this.v = connectionResult.c;
        this.w = System.currentTimeMillis();
    }

    public final void E(int i, T t) {
        cnvh cnvhVar;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        cnwc.g(z);
        synchronized (this.f) {
            this.j = i;
            this.z = t;
            if (i == 1) {
                cnue cnueVar = this.A;
                if (cnueVar != null) {
                    cnva cnvaVar = this.y;
                    String str = this.b.a;
                    cnwc.a(str);
                    cnvh cnvhVar2 = this.b;
                    String str2 = cnvhVar2.b;
                    int i2 = cnvhVar2.c;
                    C();
                    cnvaVar.e(str, str2, i2, cnueVar, this.b.d);
                    this.A = null;
                }
            } else if (i == 2 || i == 3) {
                cnue cnueVar2 = this.A;
                if (cnueVar2 != null && (cnvhVar = this.b) != null) {
                    String str3 = cnvhVar.a;
                    String str4 = cnvhVar.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    sb.toString();
                    cnva cnvaVar2 = this.y;
                    String str5 = this.b.a;
                    cnwc.a(str5);
                    cnvh cnvhVar3 = this.b;
                    String str6 = cnvhVar3.b;
                    int i3 = cnvhVar3.c;
                    C();
                    cnvaVar2.e(str5, str6, i3, cnueVar2, this.b.d);
                    this.o.incrementAndGet();
                }
                cnue cnueVar3 = new cnue(this, this.o.get());
                this.A = cnueVar3;
                cnvh cnvhVar4 = new cnvh(B(), a(), p(), Sn());
                this.b = cnvhVar4;
                if (cnvhVar4.d && c() < 17895000) {
                    String valueOf = String.valueOf(this.b.a);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                cnva cnvaVar3 = this.y;
                String str7 = this.b.a;
                cnwc.a(str7);
                cnvh cnvhVar5 = this.b;
                if (!cnvaVar3.b(new cnuz(str7, cnvhVar5.b, cnvhVar5.c, this.b.d), cnueVar3, C())) {
                    cnvh cnvhVar6 = this.b;
                    String str8 = cnvhVar6.a;
                    String str9 = cnvhVar6.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str8);
                    sb2.append(" on ");
                    sb2.append(str9);
                    sb2.toString();
                    P(16, this.o.get());
                }
            } else if (i == 4) {
                cnwc.a(t);
                q(t);
            }
        }
    }

    public final boolean F(int i, int i2, T t) {
        synchronized (this.f) {
            if (this.j != i) {
                return false;
            }
            E(i2, t);
            return true;
        }
    }

    public final void G(cnuc cnucVar, int i, PendingIntent pendingIntent) {
        cnwc.n(cnucVar, "Connection progress callbacks cannot be null.");
        this.h = cnucVar;
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, this.o.get(), i, pendingIntent));
    }

    public Account H() {
        throw null;
    }

    public Feature[] I() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new cnug(this, i, iBinder, bundle)));
    }

    public final void K() {
        if (r()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public boolean M() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<Scope> N() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(int i, int i2) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new cnuh(this, i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Sl(int i) {
        this.s = i;
        this.t = System.currentTimeMillis();
    }

    public Feature[] Sm() {
        return a;
    }

    protected boolean Sn() {
        return false;
    }

    public boolean So() {
        return false;
    }

    protected abstract String a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String b();

    public int c() {
        return cnmr.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T e(IBinder iBinder);

    public void h(String str) {
        this.x = str;
        o();
    }

    protected Bundle i() {
        return new Bundle();
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public Intent l() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public void n(cnuc cnucVar) {
        cnwc.n(cnucVar, "Connection progress callbacks cannot be null.");
        this.h = cnucVar;
        E(2, null);
    }

    public void o() {
        this.o.incrementAndGet();
        synchronized (this.i) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                this.i.get(i).f();
            }
            this.i.clear();
        }
        synchronized (this.g) {
            this.r = null;
        }
        E(1, null);
    }

    protected int p() {
        return 4225;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(T t) {
        this.u = System.currentTimeMillis();
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f) {
            z = this.j == 4;
        }
        return z;
    }

    public final boolean s() {
        boolean z;
        synchronized (this.f) {
            int i = this.j;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean t() {
        return true;
    }

    public final Feature[] u() {
        ConnectionInfo connectionInfo = this.n;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final String w() {
        return this.x;
    }

    public final void x(cnri cnriVar) {
        cnriVar.a.j.n.post(new cnrh(cnriVar));
    }

    public final void y(String str, PrintWriter printWriter) {
        int i;
        T t;
        cnvq cnvqVar;
        synchronized (this.f) {
            i = this.j;
            t = this.z;
        }
        synchronized (this.g) {
            cnvqVar = this.r;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i == 5) {
            printWriter.print("DISCONNECTING");
        } else {
            printWriter.print("UNKNOWN");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) b()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (cnvqVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(cnvqVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.u > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.u;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.t > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.s;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 == 3) {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            } else {
                printWriter.append((CharSequence) String.valueOf(i2));
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.t;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.w > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) cnoc.getStatusCodeString(this.v));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.w;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final void z() {
        if (!r() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final T L() {
        T t;
        synchronized (this.f) {
            if (this.j == 5) {
                throw new DeadObjectException();
            }
            K();
            t = this.z;
            cnwc.n(t, "Client is connected but service is null");
        }
        return t;
    }
}
