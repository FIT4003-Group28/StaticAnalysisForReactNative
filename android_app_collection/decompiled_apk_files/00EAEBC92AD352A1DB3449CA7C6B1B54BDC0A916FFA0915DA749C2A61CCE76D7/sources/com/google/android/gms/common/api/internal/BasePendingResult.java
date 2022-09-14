package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.k> extends com.google.android.gms.common.api.h<R> {

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.gms.common.api.l<? super R> f6823e;

    /* renamed from: g  reason: collision with root package name */
    private R f6825g;

    /* renamed from: h  reason: collision with root package name */
    private Status f6826h;
    private volatile boolean i;
    private boolean j;
    private boolean k;

    /* renamed from: a  reason: collision with root package name */
    private final Object f6819a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f6821c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<h.a> f6822d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<o0> f6824f = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final a<R> f6820b = new a<>(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static class a<R extends com.google.android.gms.common.api.k> extends c.e.a.b.d.b.d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.l<? super R> lVar, R r) {
            BasePendingResult.a(lVar);
            sendMessage(obtainMessage(1, new Pair(lVar, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).b(Status.f6799g);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) pair.first;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) pair.second;
            try {
                lVar.a(kVar);
            } catch (RuntimeException e2) {
                BasePendingResult.c(kVar);
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, x0 x0Var) {
            this();
        }

        protected final void finalize() {
            BasePendingResult.c(BasePendingResult.this.f6825g);
            super.finalize();
        }
    }

    static {
        new x0();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <R extends com.google.android.gms.common.api.k> com.google.android.gms.common.api.l<R> a(com.google.android.gms.common.api.l<R> lVar) {
        return lVar;
    }

    private final R b() {
        R r;
        synchronized (this.f6819a) {
            com.google.android.gms.common.internal.s.b(!this.i, "Result has already been consumed.");
            com.google.android.gms.common.internal.s.b(a(), "Result is not ready.");
            r = this.f6825g;
            this.f6825g = null;
            this.f6823e = null;
            this.i = true;
        }
        o0 andSet = this.f6824f.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void b(R r) {
        this.f6825g = r;
        this.f6821c.countDown();
        this.f6826h = this.f6825g.n();
        if (this.j) {
            this.f6823e = null;
        } else if (this.f6823e != null) {
            this.f6820b.removeMessages(2);
            this.f6820b.a(this.f6823e, b());
        } else if (this.f6825g instanceof com.google.android.gms.common.api.i) {
            new b(this, null);
        }
        ArrayList<h.a> arrayList = this.f6822d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            h.a aVar = arrayList.get(i);
            i++;
            aVar.a(this.f6826h);
        }
        this.f6822d.clear();
    }

    public static void c(com.google.android.gms.common.api.k kVar) {
        if (kVar instanceof com.google.android.gms.common.api.i) {
            try {
                ((com.google.android.gms.common.api.i) kVar).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    protected abstract R a(Status status);

    public final void a(R r) {
        synchronized (this.f6819a) {
            if (this.k || this.j) {
                c(r);
                return;
            }
            a();
            boolean z = true;
            com.google.android.gms.common.internal.s.b(!a(), "Results have already been set");
            if (this.i) {
                z = false;
            }
            com.google.android.gms.common.internal.s.b(z, "Result has already been consumed");
            b((BasePendingResult<R>) r);
        }
    }

    public final boolean a() {
        return this.f6821c.getCount() == 0;
    }

    public final void b(Status status) {
        synchronized (this.f6819a) {
            if (!a()) {
                a((BasePendingResult<R>) a(status));
                this.k = true;
            }
        }
    }
}
