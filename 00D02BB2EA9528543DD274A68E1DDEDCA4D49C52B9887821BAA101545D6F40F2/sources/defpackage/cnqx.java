package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnqx  reason: default package */
/* loaded from: classes.dex */
public final class cnqx extends GoogleApiClient implements cnru {
    public final Lock a;
    public final Context b;
    public final Looper c;
    cnrq e;
    final Map<cnnr<?>, cnnz> f;
    final cnum h;
    final Map<Api<?>, Boolean> i;
    final cnnp<? extends coza, cozb> j;
    final cnti l;
    private final cnuy m;
    private final int o;
    private volatile boolean p;
    private final cnqv s;
    private final cnmq t;
    private final ArrayList<cnpp> v;
    private Integer w;
    private final cnux x;
    private cnrv n = null;
    final Queue<cnpg<?, ?>> d = new LinkedList();
    private long q = 120000;
    private long r = 5000;
    Set<Scope> g = new HashSet();
    private final cnse u = new cnse();
    Set<cntg> k = null;

    public cnqx(Context context, Lock lock, Looper looper, cnum cnumVar, cnmq cnmqVar, cnnp<? extends coza, cozb> cnnpVar, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<cnnr<?>, cnnz> map2, int i, int i2, ArrayList<cnpp> arrayList) {
        this.w = null;
        cnqr cnqrVar = new cnqr(this);
        this.x = cnqrVar;
        this.b = context;
        this.a = lock;
        this.m = new cnuy(looper, cnqrVar);
        this.c = looper;
        this.s = new cnqv(this, looper);
        this.t = cnmqVar;
        this.o = i;
        if (i >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.i = map;
        this.f = map2;
        this.v = arrayList;
        this.l = new cnti();
        for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : list) {
            this.m.c(connectionCallbacks);
        }
        for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : list2) {
            this.m.d(onConnectionFailedListener);
        }
        this.h = cnumVar;
        this.j = cnnpVar;
    }

    public static int h(Iterable<cnnz> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (cnnz cnnzVar : iterable) {
            z2 |= cnnzVar.j();
            z3 |= cnnzVar.k();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    static String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    private final void k(cnrw cnrwVar) {
        if (this.o >= 0) {
            cnpc.a(cnrwVar).b(this.o);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // defpackage.cnru
    public final void a(Bundle bundle) {
        while (!this.d.isEmpty()) {
            execute(this.d.remove());
        }
        cnuy cnuyVar = this.m;
        cnwc.k(cnuyVar.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (cnuyVar.i) {
            boolean z = true;
            cnwc.b(!cnuyVar.g);
            cnuyVar.h.removeMessages(1);
            cnuyVar.g = true;
            if (cnuyVar.c.size() != 0) {
                z = false;
            }
            cnwc.b(z);
            ArrayList arrayList = new ArrayList(cnuyVar.b);
            int i = cnuyVar.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!cnuyVar.e || !cnuyVar.a.r() || cnuyVar.f.get() != i) {
                    break;
                } else if (!cnuyVar.c.contains(connectionCallbacks)) {
                    connectionCallbacks.Ph(bundle);
                }
            }
            cnuyVar.c.clear();
            cnuyVar.g = false;
        }
    }

    @Override // defpackage.cnru
    public final void b(ConnectionResult connectionResult) {
        if (!cnnl.j(this.b, connectionResult.c)) {
            g();
        }
        if (!this.p) {
            cnuy cnuyVar = this.m;
            cnwc.k(cnuyVar.h, "onConnectionFailure must only be called on the Handler thread");
            cnuyVar.h.removeMessages(1);
            synchronized (cnuyVar.i) {
                ArrayList arrayList = new ArrayList(cnuyVar.d);
                int i = cnuyVar.f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (cnuyVar.e && cnuyVar.f.get() == i) {
                        if (cnuyVar.d.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.Pi(connectionResult);
                        }
                    }
                }
            }
            this.m.a();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        cnwc.c(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.a.lock();
        try {
            if (this.o >= 0) {
                if (this.w == null) {
                    z = false;
                }
                cnwc.c(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(h(this.f.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.w;
            cnwc.a(num2);
            l(num2.intValue());
            this.m.b();
            cnrv cnrvVar = this.n;
            cnwc.a(cnrvVar);
            return cnrvVar.e();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final cnoh<Status> clearDefaultAccountAndReconnect() {
        cnwc.c(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.w;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        cnwc.c(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        cnsx cnsxVar = new cnsx(this);
        if (this.f.containsKey(cnwr.a)) {
            d(this, cnsxVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            cnqs cnqsVar = new cnqs(this, atomicReference, cnsxVar);
            cnqt cnqtVar = new cnqt(cnsxVar);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.b);
            builder.addApi(cnwr.b);
            builder.addConnectionCallbacks(cnqsVar);
            builder.addOnConnectionFailedListener(cnqtVar);
            builder.setHandler(this.s);
            GoogleApiClient build = builder.build();
            atomicReference.set(build);
            build.connect();
        }
        return cnsxVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.a.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.o >= 0) {
                cnwc.c(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(h(this.f.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.w;
            cnwc.a(num2);
            int intValue = num2.intValue();
            this.a.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                cnwc.e(z, sb.toString());
                l(i);
                e();
                this.a.unlock();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            cnwc.e(z, sb2.toString());
            l(i);
            e();
            this.a.unlock();
        } finally {
            this.a.unlock();
        }
    }

    public final void d(GoogleApiClient googleApiClient, cnsx cnsxVar, boolean z) {
        cnoa<cnww> cnoaVar = cnwr.a;
        googleApiClient.execute(new cnws(googleApiClient)).i(new cnqu(this, cnsxVar, z, googleApiClient));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock;
        this.a.lock();
        try {
            this.l.b();
            cnrv cnrvVar = this.n;
            if (cnrvVar != null) {
                cnrvVar.g();
            }
            cnse cnseVar = this.u;
            for (cnsd<?> cnsdVar : cnseVar.a) {
                cnsdVar.b();
            }
            cnseVar.a.clear();
            for (cnpg<?, ?> cnpgVar : this.d) {
                cnpgVar.t(null);
                cnpgVar.h();
            }
            this.d.clear();
            if (this.n == null) {
                lock = this.a;
            } else {
                g();
                this.m.a();
                lock = this.a;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.b);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.p);
        printWriter.append(" mWorkQueue.size()=").print(this.d.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.l.b.size());
        cnrv cnrvVar = this.n;
        if (cnrvVar != null) {
            cnrvVar.p(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void e() {
        this.m.b();
        cnrv cnrvVar = this.n;
        cnwc.a(cnrvVar);
        cnrvVar.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> T enqueue(T t) {
        Lock lock;
        Api<?> api = t.c;
        boolean containsKey = this.f.containsKey(t.b);
        String name = api != null ? api.getName() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        cnwc.e(containsKey, sb.toString());
        this.a.lock();
        try {
            cnrv cnrvVar = this.n;
            if (cnrvVar != null) {
                t = (T) cnrvVar.a(t);
                lock = this.a;
            } else {
                this.d.add(t);
                lock = this.a;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T execute(T t) {
        Lock lock;
        Api<?> api = t.c;
        boolean containsKey = this.f.containsKey(t.b);
        String name = api != null ? api.getName() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        cnwc.e(containsKey, sb.toString());
        this.a.lock();
        try {
            cnrv cnrvVar = this.n;
            if (cnrvVar != null) {
                if (this.p) {
                    this.d.add(t);
                    while (!this.d.isEmpty()) {
                        cnpg<?, ?> remove = this.d.remove();
                        this.l.a(remove);
                        remove.m(Status.c);
                    }
                    lock = this.a;
                } else {
                    t = (T) cnrvVar.b(t);
                    lock = this.a;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public final void f() {
        this.a.lock();
        try {
            if (this.p) {
                e();
            }
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (!this.p) {
            return false;
        }
        this.p = false;
        this.s.removeMessages(2);
        this.s.removeMessages(1);
        cnrq cnrqVar = this.e;
        if (cnrqVar != null) {
            cnrqVar.a();
            this.e = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends cnnz> C getClient(cnnr<C> cnnrVar) {
        C c = (C) this.f.get(cnnrVar);
        cnwc.n(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock;
        this.a.lock();
        try {
            if (!isConnected() && !this.p) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.f.containsKey(api.getClientKey())) {
                cnrv cnrvVar = this.n;
                cnwc.a(cnrvVar);
                ConnectionResult c = cnrvVar.c(api);
                if (c != null) {
                    return c;
                }
                if (this.p) {
                    connectionResult = ConnectionResult.a;
                    lock = this.a;
                } else {
                    j();
                    api.getName();
                    new Exception();
                    connectionResult = new ConnectionResult(8, null);
                    lock = this.a;
                }
                lock.unlock();
                return connectionResult;
            }
            throw new IllegalArgumentException(String.valueOf(api.getName()).concat(" was never registered with GoogleApiClient"));
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(Api<?> api) {
        return this.f.containsKey(api.getClientKey());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasAuthenticatedScope(Scope scope) {
        this.a.lock();
        try {
            boolean z = false;
            if (isConnected()) {
                if (this.g.contains(scope)) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api<?> api) {
        cnnz cnnzVar;
        return isConnected() && (cnnzVar = this.f.get(api.getClientKey())) != null && cnnzVar.r();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        cnrv cnrvVar = this.n;
        return cnrvVar != null && cnrvVar.h();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        cnrv cnrvVar = this.n;
        return cnrvVar != null && cnrvVar.i();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        cnuy cnuyVar = this.m;
        cnwc.a(connectionCallbacks);
        synchronized (cnuyVar.i) {
            contains = cnuyVar.b.contains(connectionCallbacks);
        }
        return contains;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        cnuy cnuyVar = this.m;
        cnwc.a(onConnectionFailedListener);
        synchronized (cnuyVar.i) {
            contains = cnuyVar.d.contains(onConnectionFailedListener);
        }
        return contains;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isSignedIn() {
        cnrv cnrvVar = this.n;
        return cnrvVar != null && cnrvVar.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(cnss cnssVar) {
        cnrv cnrvVar = this.n;
        return cnrvVar != null && cnrvVar.j(cnssVar);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        cnrv cnrvVar = this.n;
        if (cnrvVar != null) {
            cnrvVar.l();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.m.c(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.m.d(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> cnsd<L> registerListener(L l) {
        this.a.lock();
        try {
            cnse cnseVar = this.u;
            cnsd<L> a = cnse.a(l, this.c, "NO_TYPE");
            cnseVar.a.add(a);
            return a;
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerPendingTransform(cntg cntgVar) {
        this.a.lock();
        try {
            if (this.k == null) {
                this.k = new HashSet();
            }
            this.k.add(cntgVar);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(ff ffVar) {
        k(new cnrw(ffVar));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        cnuy cnuyVar = this.m;
        cnwc.a(connectionCallbacks);
        synchronized (cnuyVar.i) {
            if (!cnuyVar.b.remove(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            } else if (cnuyVar.g) {
                cnuyVar.c.add(connectionCallbacks);
            }
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        cnuy cnuyVar = this.m;
        cnwc.a(onConnectionFailedListener);
        synchronized (cnuyVar.i) {
            if (!cnuyVar.d.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r2 == false) goto L16;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unregisterPendingTransform(defpackage.cntg r2) {
        /*
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.a
            r0.lock()
            java.util.Set<cntg> r0 = r1.k     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto Lf
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            goto L3e
        Lf:
            boolean r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L1b
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            goto L3e
        L1b:
            java.util.concurrent.locks.Lock r2 = r1.a     // Catch: java.lang.Throwable -> L4b
            r2.lock()     // Catch: java.lang.Throwable -> L4b
            java.util.Set<cntg> r2 = r1.k     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L2a
            java.util.concurrent.locks.Lock r2 = r1.a     // Catch: java.lang.Throwable -> L4b
            r2.unlock()     // Catch: java.lang.Throwable -> L4b
            goto L37
        L2a:
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L44
            r2 = r2 ^ 1
            java.util.concurrent.locks.Lock r0 = r1.a     // Catch: java.lang.Throwable -> L4b
            r0.unlock()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L3e
        L37:
            cnrv r2 = r1.n     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L3e
            r2.k()     // Catch: java.lang.Throwable -> L4b
        L3e:
            java.util.concurrent.locks.Lock r2 = r1.a
            r2.unlock()
            return
        L44:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.a     // Catch: java.lang.Throwable -> L4b
            r0.unlock()     // Catch: java.lang.Throwable -> L4b
            throw r2     // Catch: java.lang.Throwable -> L4b
        L4b:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.a
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqx.unregisterPendingTransform(cntg):void");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(Activity activity) {
        k(new cnrw(activity));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        cnwc.c(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        cnwc.n(timeUnit, "TimeUnit must not be null");
        this.a.lock();
        try {
            Integer num = this.w;
            if (num == null) {
                this.w = Integer.valueOf(h(this.f.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.w;
            cnwc.a(num2);
            l(num2.intValue());
            this.m.b();
            cnrv cnrvVar = this.n;
            cnwc.a(cnrvVar);
            return cnrvVar.f(j, timeUnit);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.a.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            cnwc.e(z, sb.toString());
            l(i);
            e();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.cnru
    public final void c(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.p) {
                this.p = true;
                if (this.e == null) {
                    try {
                        this.e = this.t.c(this.b.getApplicationContext(), new cnqw(this));
                    } catch (SecurityException unused) {
                    }
                }
                cnqv cnqvVar = this.s;
                cnqvVar.sendMessageDelayed(cnqvVar.obtainMessage(1), this.q);
                cnqv cnqvVar2 = this.s;
                cnqvVar2.sendMessageDelayed(cnqvVar2.obtainMessage(2), this.r);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.l.b.toArray(new BasePendingResult[0])) {
            basePendingResult.q(cnti.a);
        }
        cnuy cnuyVar = this.m;
        cnwc.k(cnuyVar.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        cnuyVar.h.removeMessages(1);
        synchronized (cnuyVar.i) {
            cnuyVar.g = true;
            ArrayList arrayList = new ArrayList(cnuyVar.b);
            int i2 = cnuyVar.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!cnuyVar.e || cnuyVar.f.get() != i2) {
                    break;
                } else if (cnuyVar.b.contains(connectionCallbacks)) {
                    connectionCallbacks.Pj(i);
                }
            }
            cnuyVar.c.clear();
            cnuyVar.g = false;
        }
        this.m.a();
        if (i == 2) {
            e();
        }
    }

    private final void l(int i) {
        cnqx cnqxVar;
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String i2 = i(i);
            String i3 = i(this.w.intValue());
            StringBuilder sb = new StringBuilder(i2.length() + 51 + i3.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(i2);
            sb.append(". Mode was already set to ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        if (this.n != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (cnnz cnnzVar : this.f.values()) {
            z |= cnnzVar.j();
            z2 |= cnnzVar.k();
        }
        int intValue = this.w.intValue();
        if (intValue == 1) {
            cnqxVar = this;
            if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z) {
            Context context = this.b;
            Lock lock = this.a;
            Looper looper = this.c;
            cnmq cnmqVar = this.t;
            Map<cnnr<?>, cnnz> map = this.f;
            cnum cnumVar = this.h;
            Map<Api<?>, Boolean> map2 = this.i;
            cnnp<? extends coza, cozb> cnnpVar = this.j;
            ArrayList<cnpp> arrayList = this.v;
            aif aifVar = new aif();
            aif aifVar2 = new aif();
            Iterator<Map.Entry<cnnr<?>, cnnz>> it = map.entrySet().iterator();
            cnnz cnnzVar2 = null;
            while (it.hasNext()) {
                Map.Entry<cnnr<?>, cnnz> next = it.next();
                cnnz value = next.getValue();
                Iterator<Map.Entry<cnnr<?>, cnnz>> it2 = it;
                if (true == value.k()) {
                    cnnzVar2 = value;
                }
                if (value.j()) {
                    aifVar.put(next.getKey(), value);
                } else {
                    aifVar2.put(next.getKey(), value);
                }
                it = it2;
            }
            cnwc.c(!aifVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
            aif aifVar3 = new aif();
            aif aifVar4 = new aif();
            Iterator<Api<?>> it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                Api<?> next2 = it3.next();
                Iterator<Api<?>> it4 = it3;
                cnnr<?> clientKey = next2.getClientKey();
                if (aifVar.containsKey(clientKey)) {
                    aifVar3.put(next2, map2.get(next2));
                } else if (aifVar2.containsKey(clientKey)) {
                    aifVar4.put(next2, map2.get(next2));
                } else {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                it3 = it4;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = size;
                cnpp cnppVar = arrayList.get(i4);
                ArrayList<cnpp> arrayList4 = arrayList;
                if (aifVar3.containsKey(cnppVar.a)) {
                    arrayList2.add(cnppVar);
                } else if (aifVar4.containsKey(cnppVar.a)) {
                    arrayList3.add(cnppVar);
                } else {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                i4++;
                size = i5;
                arrayList = arrayList4;
            }
            this.n = new cnpu(context, this, lock, looper, cnmqVar, aifVar, aifVar2, cnumVar, cnnpVar, cnnzVar2, arrayList2, arrayList3, aifVar3, aifVar4);
            return;
        } else {
            cnqxVar = this;
        }
        cnqxVar.n = new cnrb(cnqxVar.b, this, cnqxVar.a, cnqxVar.c, cnqxVar.t, cnqxVar.f, cnqxVar.h, cnqxVar.i, cnqxVar.j, cnqxVar.v, this);
    }
}
