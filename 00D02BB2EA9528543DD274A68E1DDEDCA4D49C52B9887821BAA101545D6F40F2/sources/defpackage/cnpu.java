package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnpu  reason: default package */
/* loaded from: classes5.dex */
public final class cnpu implements cnrv {
    public final cnrb a;
    public final cnrb b;
    public Bundle c;
    public final Lock g;
    private final Context h;
    private final cnqx i;
    private final Looper j;
    private final Map<cnnr<?>, cnrb> k;
    private final cnnz m;
    private final Set<cnss> l = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult d = null;
    public ConnectionResult e = null;
    public boolean f = false;
    private int n = 0;

    public cnpu(Context context, cnqx cnqxVar, Lock lock, Looper looper, cnmr cnmrVar, Map<cnnr<?>, cnnz> map, Map<cnnr<?>, cnnz> map2, cnum cnumVar, cnnp<? extends coza, cozb> cnnpVar, cnnz cnnzVar, ArrayList<cnpp> arrayList, ArrayList<cnpp> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.h = context;
        this.i = cnqxVar;
        this.g = lock;
        this.j = looper;
        this.m = cnnzVar;
        this.a = new cnrb(context, cnqxVar, lock, looper, cnmrVar, map2, null, map4, null, arrayList2, new cnps(this));
        this.b = new cnrb(context, cnqxVar, lock, looper, cnmrVar, map, cnumVar, map3, cnnpVar, arrayList, new cnpt(this));
        aif aifVar = new aif();
        for (cnnr<?> cnnrVar : map2.keySet()) {
            aifVar.put(cnnrVar, this.a);
        }
        for (cnnr<?> cnnrVar2 : map.keySet()) {
            aifVar.put(cnnrVar2, this.b);
        }
        this.k = Collections.unmodifiableMap(aifVar);
    }

    private final void r() {
        for (cnss cnssVar : this.l) {
            cnssVar.r();
        }
        this.l.clear();
    }

    private final boolean s() {
        ConnectionResult connectionResult = this.e;
        return connectionResult != null && connectionResult.c == 4;
    }

    private final boolean t(cnpg<? extends cnom, ? extends cnnq> cnpgVar) {
        cnrb cnrbVar = this.k.get(cnpgVar.b);
        cnwc.n(cnrbVar, "GoogleApiClient is not configured to use the API required for this call.");
        return cnrbVar.equals(this.b);
    }

    private final PendingIntent u() {
        if (this.m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.h, System.identityHashCode(this.i), this.m.l(), 134217728);
    }

    private static boolean v(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.c();
    }

    @Override // defpackage.cnrv
    public final <A extends cnnq, R extends cnom, T extends cnpg<R, A>> T a(T t) {
        if (t(t)) {
            if (s()) {
                t.m(new Status(4, null, u()));
                return t;
            }
            return (T) this.b.a(t);
        }
        return (T) this.a.a(t);
    }

    @Override // defpackage.cnrv
    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> T b(T t) {
        if (t(t)) {
            if (s()) {
                t.m(new Status(4, null, u()));
                return t;
            }
            return (T) this.b.b(t);
        }
        return (T) this.a.b(t);
    }

    @Override // defpackage.cnrv
    public final ConnectionResult c(Api<?> api) {
        if (cnvv.a(this.k.get(api.getClientKey()), this.b)) {
            if (s()) {
                return new ConnectionResult(4, u());
            }
            return this.b.c(api);
        }
        return this.a.c(api);
    }

    @Override // defpackage.cnrv
    public final void d() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.d();
        this.b.d();
    }

    @Override // defpackage.cnrv
    public final ConnectionResult e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cnrv
    public final ConnectionResult f(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cnrv
    public final void g() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.g();
        this.b.g();
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r3.n == 1) goto L12;
     */
    @Override // defpackage.cnrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.g
            r0.lock()
            cnrb r0 = r3.a     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            boolean r0 = r3.m()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L1f
            boolean r0 = r3.s()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L1f
            int r0 = r3.n     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L20
        L1f:
            r1 = 1
        L20:
            java.util.concurrent.locks.Lock r0 = r3.g
            r0.unlock()
            return r1
        L26:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.g
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnpu.h():boolean");
    }

    @Override // defpackage.cnrv
    public final boolean i() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.cnrv
    public final boolean j(cnss cnssVar) {
        this.g.lock();
        try {
            if ((!i() && !h()) || m()) {
                this.g.unlock();
                return false;
            }
            this.l.add(cnssVar);
            if (this.n == 0) {
                this.n = 1;
            }
            this.e = null;
            this.b.d();
            return true;
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.cnrv
    public final void k() {
        this.a.k();
        this.b.k();
    }

    @Override // defpackage.cnrv
    public final void l() {
        this.g.lock();
        try {
            boolean i = i();
            this.b.g();
            this.e = new ConnectionResult(4);
            if (i) {
                new cojb(this.j).post(new cnpr(this));
            } else {
                r();
            }
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.cnrv
    public final boolean m() {
        return this.b.h();
    }

    public final void o(int i, boolean z) {
        this.i.c(i, z);
        this.e = null;
        this.d = null;
    }

    @Override // defpackage.cnrv
    public final void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.b.p(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.a.p(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void n() {
        ConnectionResult connectionResult;
        if (!v(this.d)) {
            if (this.d == null || !v(this.e)) {
                ConnectionResult connectionResult2 = this.d;
                if (connectionResult2 == null || (connectionResult = this.e) == null) {
                    return;
                }
                if (this.b.l < this.a.l) {
                    connectionResult2 = connectionResult;
                }
                q(connectionResult2);
                return;
            }
            this.b.g();
            ConnectionResult connectionResult3 = this.d;
            cnwc.a(connectionResult3);
            q(connectionResult3);
        } else if (v(this.e) || s()) {
            int i = this.n;
            if (i != 1) {
                if (i == 2) {
                    this.i.a(this.c);
                } else {
                    new AssertionError();
                    this.n = 0;
                }
            }
            r();
            this.n = 0;
        } else {
            ConnectionResult connectionResult4 = this.e;
            if (connectionResult4 == null) {
                return;
            }
            if (this.n == 1) {
                r();
                return;
            }
            q(connectionResult4);
            this.a.g();
        }
    }

    private final void q(ConnectionResult connectionResult) {
        int i = this.n;
        if (i != 1) {
            if (i == 2) {
                this.i.b(connectionResult);
            } else {
                new Exception();
                this.n = 0;
            }
        }
        r();
        this.n = 0;
    }
}
