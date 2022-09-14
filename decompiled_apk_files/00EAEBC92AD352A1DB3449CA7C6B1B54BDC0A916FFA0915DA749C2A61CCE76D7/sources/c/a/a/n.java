package c.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public class n<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f2289e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    private final Set<i<T>> f2290a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<i<Throwable>> f2291b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f2292c;

    /* renamed from: d  reason: collision with root package name */
    private volatile m<T> f2293d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n.this.f2293d == null) {
                return;
            }
            m mVar = n.this.f2293d;
            if (mVar.b() != null) {
                n.this.a((n) mVar.b());
            } else {
                n.this.a(mVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    private class b extends FutureTask<m<T>> {
        b(Callable<m<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                n.this.a((m) get());
            } catch (InterruptedException | ExecutionException e2) {
                n.this.a(new m(e2));
            }
        }
    }

    public n(Callable<m<T>> callable) {
        this(callable, false);
    }

    n(Callable<m<T>> callable, boolean z) {
        this.f2290a = new LinkedHashSet(1);
        this.f2291b = new LinkedHashSet(1);
        this.f2292c = new Handler(Looper.getMainLooper());
        this.f2293d = null;
        if (!z) {
            f2289e.execute(new b(callable));
            return;
        }
        try {
            a((m) callable.call());
        } catch (Throwable th) {
            a((m) new m<>(th));
        }
    }

    private void a() {
        this.f2292c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(m<T> mVar) {
        if (this.f2293d == null) {
            this.f2293d = mVar;
            a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(T t) {
        for (i iVar : new ArrayList(this.f2290a)) {
            iVar.a(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Throwable th) {
        ArrayList<i> arrayList = new ArrayList(this.f2291b);
        if (arrayList.isEmpty()) {
            c.a.a.y.d.a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (i iVar : arrayList) {
            iVar.a(th);
        }
    }

    public synchronized n<T> a(i<Throwable> iVar) {
        if (this.f2293d != null && this.f2293d.a() != null) {
            iVar.a(this.f2293d.a());
        }
        this.f2291b.add(iVar);
        return this;
    }

    public synchronized n<T> b(i<T> iVar) {
        if (this.f2293d != null && this.f2293d.b() != null) {
            iVar.a(this.f2293d.b());
        }
        this.f2290a.add(iVar);
        return this;
    }

    public synchronized n<T> c(i<Throwable> iVar) {
        this.f2291b.remove(iVar);
        return this;
    }

    public synchronized n<T> d(i<T> iVar) {
        this.f2290a.remove(iVar);
        return this;
    }
}
