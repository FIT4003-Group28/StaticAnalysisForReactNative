package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BasePendingResult extends qta {
    public static final ThreadLocal e = new qty();
    private final CountDownLatch a;
    private final ArrayList b;
    private qtf c;
    private final AtomicReference d;
    public final Object f;
    protected final qtz g;
    public qte h;
    public boolean i;
    public qxl j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private qua mResultGuardian;
    private boolean n;
    private volatile qtg o;

    @Deprecated
    BasePendingResult() {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new qtz(Looper.getMainLooper());
        new WeakReference(null);
    }

    private final void c(qte qteVar) {
        this.h = qteVar;
        this.k = qteVar.a();
        this.j = null;
        this.a.countDown();
        if (this.m) {
            this.c = null;
        } else {
            qtf qtfVar = this.c;
            if (qtfVar == null) {
                if (this.h instanceof qtb) {
                    this.mResultGuardian = new qua(this);
                }
            } else {
                this.g.removeMessages(2);
                this.g.a(qtfVar, q());
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qsz) arrayList.get(i)).a(this.k);
        }
        this.b.clear();
    }

    public static void m(qte qteVar) {
        if (qteVar instanceof qtb) {
            try {
                ((qtb) qteVar).b();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(qteVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    private final qte q() {
        qte qteVar;
        synchronized (this.f) {
            qnm.k(!this.l, "Result has already been consumed.");
            qnm.k(p(), "Result is not ready.");
            qteVar = this.h;
            this.h = null;
            this.c = null;
            this.l = true;
        }
        qwa qwaVar = (qwa) this.d.getAndSet(null);
        if (qwaVar != null) {
            qwaVar.a();
        }
        qnm.b(qteVar);
        return qteVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract qte a(Status status);

    @Override // defpackage.qta
    public final void e(qsz qszVar) {
        qnm.d(qszVar != null, "Callback cannot be null.");
        synchronized (this.f) {
            if (!p()) {
                this.b.add(qszVar);
            } else {
                qszVar.a(this.k);
            }
        }
    }

    @Override // defpackage.qta
    public final void f() {
        synchronized (this.f) {
            if (!this.m && !this.l) {
                qxl qxlVar = this.j;
                if (qxlVar != null) {
                    try {
                        qxlVar.py(2, qxlVar.pv());
                    } catch (RemoteException unused) {
                    }
                }
                m(this.h);
                this.m = true;
                c(a(Status.e));
            }
        }
    }

    @Override // defpackage.qta
    public final void g(qtf qtfVar) {
        synchronized (this.f) {
            if (qtfVar == null) {
                this.c = null;
                return;
            }
            qnm.k(!this.l, "Result has already been consumed.");
            qnm.k(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (p()) {
                this.g.a(qtfVar, q());
            } else {
                this.c = qtfVar;
            }
        }
    }

    @Override // defpackage.qta
    public final qte h(TimeUnit timeUnit) {
        qnm.k(!this.l, "Result has already been consumed.");
        qnm.k(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                l(Status.d);
            }
        } catch (InterruptedException unused) {
            l(Status.b);
        }
        qnm.k(p(), "Result is not ready.");
        return q();
    }

    @Override // defpackage.qta
    public final void i(qtf qtfVar, TimeUnit timeUnit) {
        synchronized (this.f) {
            qnm.k(!this.l, "Result has already been consumed.");
            qnm.k(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (p()) {
                this.g.a(qtfVar, q());
            } else {
                this.c = qtfVar;
                qtz qtzVar = this.g;
                qtzVar.sendMessageDelayed(qtzVar.obtainMessage(2, this), timeUnit.toMillis(3L));
            }
        }
    }

    @Deprecated
    public final void l(Status status) {
        synchronized (this.f) {
            if (!p()) {
                n(a(status));
                this.n = true;
            }
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.f) {
            z = this.m;
        }
        return z;
    }

    public final boolean p() {
        return this.a.getCount() == 0;
    }

    public final void n(qte qteVar) {
        synchronized (this.f) {
            if (this.n || this.m) {
                m(qteVar);
                return;
            }
            p();
            qnm.k(!p(), "Results have already been set");
            qnm.k(!this.l, "Result has already been consumed");
            c(qteVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public BasePendingResult(Looper looper) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new qtz(looper);
        new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(qsx qsxVar) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new qtz(qsxVar != null ? ((qur) qsxVar).a.B : Looper.getMainLooper());
        new WeakReference(qsxVar);
    }
}
