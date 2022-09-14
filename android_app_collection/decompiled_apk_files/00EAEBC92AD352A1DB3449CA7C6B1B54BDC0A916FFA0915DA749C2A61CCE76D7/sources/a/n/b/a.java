package a.n.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {
    private final Executor j;
    volatile a<D>.RunnableC0026a k;
    volatile a<D>.RunnableC0026a l;
    long m;
    long n;
    Handler o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0026a extends d<Void, Void, D> implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);
        boolean l;

        RunnableC0026a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a.n.b.d
        public D a(Void... voidArr) {
            try {
                return (D) a.this.z();
            } catch (a.g.j.c e2) {
                if (!a()) {
                    throw e2;
                }
                return null;
            }
        }

        @Override // a.n.b.d
        protected void b(D d2) {
            try {
                a.this.a(this, d2);
            } finally {
                this.k.countDown();
            }
        }

        @Override // a.n.b.d
        protected void c(D d2) {
            try {
                a.this.b(this, d2);
            } finally {
                this.k.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.l = false;
            a.this.w();
        }
    }

    public a(Context context) {
        this(context, d.i);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.n = -10000L;
        this.j = executor;
    }

    void a(a<D>.RunnableC0026a runnableC0026a, D d2) {
        c(d2);
        if (this.l == runnableC0026a) {
            r();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            d();
            w();
        }
    }

    @Override // a.n.b.c
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.l);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.l);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            h.a(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            h.a(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void b(a<D>.RunnableC0026a runnableC0026a, D d2) {
        if (this.k != runnableC0026a) {
            a(runnableC0026a, d2);
        } else if (g()) {
            c(d2);
        } else {
            c();
            this.n = SystemClock.uptimeMillis();
            this.k = null;
            b(d2);
        }
    }

    public abstract void c(D d2);

    @Override // a.n.b.c
    protected boolean k() {
        if (this.k != null) {
            if (!this.f475e) {
                this.f478h = true;
            }
            if (this.l != null) {
                if (this.k.l) {
                    this.k.l = false;
                    this.o.removeCallbacks(this.k);
                }
                this.k = null;
                return false;
            } else if (this.k.l) {
                this.k.l = false;
                this.o.removeCallbacks(this.k);
                this.k = null;
                return false;
            } else {
                boolean a2 = this.k.a(false);
                if (a2) {
                    this.l = this.k;
                    v();
                }
                this.k = null;
                return a2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.n.b.c
    public void m() {
        super.m();
        b();
        this.k = new RunnableC0026a();
        w();
    }

    public void v() {
    }

    void w() {
        if (this.l != null || this.k == null) {
            return;
        }
        if (this.k.l) {
            this.k.l = false;
            this.o.removeCallbacks(this.k);
        }
        if (this.m <= 0 || SystemClock.uptimeMillis() >= this.n + this.m) {
            this.k.a(this.j, null);
            return;
        }
        this.k.l = true;
        this.o.postAtTime(this.k, this.n + this.m);
    }

    public boolean x() {
        return this.l != null;
    }

    /* renamed from: y */
    public abstract D mo18y();

    protected D z() {
        return mo18y();
    }
}
