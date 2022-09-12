package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cuss  reason: default package */
/* loaded from: classes5.dex */
public class cuss<ValueT> {
    private dbsg<ValueT> a;
    public final Handler f;
    protected final Set<cusr<ValueT>> g;

    public cuss() {
        this.f = new Handler(Looper.getMainLooper());
        this.g = new HashSet();
        this.a = dbpy.a;
    }

    private final synchronized void d(int i) {
        int size = this.g.size() - i;
        if (size != 0) {
            if (this.g.size() == size) {
                b();
            } else if (this.g.isEmpty()) {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(ValueT valuet) {
        if (!this.a.a() || !valuet.equals(this.a.b())) {
            this.a = dbsg.i(valuet);
            j(valuet);
        }
    }

    protected synchronized void b() {
    }

    protected synchronized void c() {
    }

    public synchronized void g(cusr<ValueT> cusrVar) {
        int size = this.g.size();
        this.g.remove(cusrVar);
        d(size);
    }

    public synchronized dbsg<ValueT> h() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void i() {
        this.a = dbpy.a;
    }

    protected final synchronized void j(final ValueT valuet) {
        final dcep K = dcep.K(this.g);
        m(new Runnable(K, valuet) { // from class: cuso
            private final dcep a;
            private final Object b;

            {
                this.a = K;
                this.b = valuet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dcep dcepVar = this.a;
                Object obj = this.b;
                dcpd it = dcepVar.iterator();
                while (it.hasNext()) {
                    ((cusr) it.next()).a(obj);
                }
            }
        });
    }

    public final void k(cusr<ValueT> cusrVar) {
        q(new cusp(this, cusrVar));
    }

    public final void l() {
        q(new cusq(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(Runnable runnable) {
        this.f.post(runnable);
    }

    public synchronized void q(final cusr<ValueT> cusrVar) {
        int size = this.g.size();
        this.g.add(cusrVar);
        if (this.a.a()) {
            final ValueT b = this.a.b();
            m(new Runnable(cusrVar, b) { // from class: cusn
                private final cusr a;
                private final Object b;

                {
                    this.a = cusrVar;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b);
                }
            });
        }
        d(size);
    }

    public cuss(ValueT valuet) {
        this.f = new Handler(Looper.getMainLooper());
        this.g = new HashSet();
        this.a = dbsg.i(valuet);
    }
}
