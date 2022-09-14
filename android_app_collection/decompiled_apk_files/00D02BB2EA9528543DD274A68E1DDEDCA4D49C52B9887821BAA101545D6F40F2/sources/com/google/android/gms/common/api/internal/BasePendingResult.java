package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import defpackage.cnom;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends cnom> extends cnoh<R> {
    static final ThreadLocal<Boolean> d = new cnpm();
    public static final /* synthetic */ int j = 0;
    private final CountDownLatch a;
    private final ArrayList<cnog> b;
    private cnon<? super R> c;
    public final Object e;
    protected final cnpn<R> f;
    public final WeakReference<GoogleApiClient> g;
    public R h;
    public boolean i;
    private final AtomicReference<cnth> k;
    private Status l;
    private volatile boolean m;
    private cnpo mResultGuardian;
    private boolean n;
    private boolean o;
    private volatile cntg<R> p;
    private cnvk q;

    @Deprecated
    BasePendingResult() {
        this.e = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList<>();
        this.k = new AtomicReference<>();
        this.i = false;
        this.f = new cnpn<>(Looper.getMainLooper());
        this.g = new WeakReference<>(null);
    }

    private final void b(R r) {
        this.h = r;
        this.l = r.a();
        this.q = null;
        this.a.countDown();
        if (this.n) {
            this.c = null;
        } else {
            cnon<? super R> cnonVar = this.c;
            if (cnonVar == null) {
                if (this.h instanceof cnoj) {
                    this.mResultGuardian = new cnpo(this);
                }
            } else {
                this.f.removeMessages(2);
                this.f.a(cnonVar, v());
            }
        }
        ArrayList<cnog> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(this.l);
        }
        this.b.clear();
    }

    public static void s(cnom cnomVar) {
        if (cnomVar instanceof cnoj) {
            try {
                ((cnoj) cnomVar).b();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(cnomVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    private final R v() {
        R r;
        synchronized (this.e) {
            cnwc.c(!this.m, "Result has already been consumed.");
            cnwc.c(n(), "Result is not ready.");
            r = this.h;
            this.h = null;
            this.c = null;
            this.m = true;
        }
        cnth andSet = this.k.getAndSet(null);
        if (andSet != null) {
            andSet.a.b.remove(this);
        }
        cnwc.a(r);
        return r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract R d(Status status);

    @Override // defpackage.cnoh
    public final R f() {
        cnwc.i("await must not be called on the UI thread");
        cnwc.c(!this.m, "Result has already been consumed");
        cnwc.c(true, "Cannot await if then() has been called.");
        try {
            this.a.await();
        } catch (InterruptedException unused) {
            q(Status.b);
        }
        cnwc.c(n(), "Result is not ready.");
        return v();
    }

    @Override // defpackage.cnoh
    public final R g(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            cnwc.i("await must not be called on the UI thread when time is greater than zero.");
        }
        cnwc.c(!this.m, "Result has already been consumed.");
        cnwc.c(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(j2, timeUnit)) {
                q(Status.d);
            }
        } catch (InterruptedException unused) {
            q(Status.b);
        }
        cnwc.c(n(), "Result is not ready.");
        return v();
    }

    @Override // defpackage.cnoh
    public final void h() {
        synchronized (this.e) {
            if (!this.n && !this.m) {
                cnvk cnvkVar = this.q;
                if (cnvkVar != null) {
                    try {
                        cnvkVar.e();
                    } catch (RemoteException unused) {
                    }
                }
                s(this.h);
                this.n = true;
                b(d(Status.e));
            }
        }
    }

    @Override // defpackage.cnoh
    public final void i(cnon<? super R> cnonVar) {
        synchronized (this.e) {
            if (cnonVar == null) {
                this.c = null;
                return;
            }
            cnwc.c(!this.m, "Result has already been consumed.");
            cnwc.c(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (n()) {
                this.f.a(cnonVar, v());
            } else {
                this.c = cnonVar;
            }
        }
    }

    @Override // defpackage.cnoh
    public final void j(cnon<? super R> cnonVar, long j2, TimeUnit timeUnit) {
        synchronized (this.e) {
            if (cnonVar == null) {
                this.c = null;
                return;
            }
            cnwc.c(!this.m, "Result has already been consumed.");
            cnwc.c(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (n()) {
                this.f.a(cnonVar, v());
            } else {
                this.c = cnonVar;
                cnpn<R> cnpnVar = this.f;
                cnpnVar.sendMessageDelayed(cnpnVar.obtainMessage(2, this), timeUnit.toMillis(j2));
            }
        }
    }

    @Override // defpackage.cnoh
    public final void k(cnog cnogVar) {
        cnwc.e(cnogVar != null, "Callback cannot be null.");
        synchronized (this.e) {
            if (!n()) {
                this.b.add(cnogVar);
            } else {
                cnogVar.a(this.l);
            }
        }
    }

    public final boolean n() {
        return this.a.getCount() == 0;
    }

    public final boolean o() {
        boolean z;
        synchronized (this.e) {
            z = this.n;
        }
        return z;
    }

    @Deprecated
    public final void q(Status status) {
        synchronized (this.e) {
            if (!n()) {
                p(d(status));
                this.o = true;
            }
        }
    }

    public final void r() {
        boolean z = true;
        if (!this.i && !d.get().booleanValue()) {
            z = false;
        }
        this.i = z;
    }

    public final void t(cnth cnthVar) {
        this.k.set(cnthVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(cnvk cnvkVar) {
        synchronized (this.e) {
            this.q = cnvkVar;
        }
    }

    public final void p(R r) {
        synchronized (this.e) {
            if (this.o || this.n) {
                s(r);
                return;
            }
            n();
            cnwc.c(!n(), "Results have already been set");
            cnwc.c(!this.m, "Result has already been consumed");
            b(r);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public BasePendingResult(Looper looper) {
        this.e = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList<>();
        this.k = new AtomicReference<>();
        this.i = false;
        this.f = new cnpn<>(looper);
        this.g = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.e = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList<>();
        this.k = new AtomicReference<>();
        this.i = false;
        this.f = new cnpn<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.g = new WeakReference<>(googleApiClient);
    }
}
