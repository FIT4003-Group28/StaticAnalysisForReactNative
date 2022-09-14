package a.g.j;

import android.os.Build;
import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f223a;

    /* renamed from: b  reason: collision with root package name */
    private a f224b;

    /* renamed from: c  reason: collision with root package name */
    private Object f225c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f226d;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private void e() {
        while (this.f226d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f223a) {
                return;
            }
            this.f223a = true;
            this.f226d = true;
            a aVar = this.f224b;
            Object obj = this.f225c;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f226d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f226d = false;
                notifyAll();
            }
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            e();
            if (this.f224b == aVar) {
                return;
            }
            this.f224b = aVar;
            if (this.f223a && aVar != null) {
                aVar.a();
            }
        }
    }

    public Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f225c == null) {
                this.f225c = new CancellationSignal();
                if (this.f223a) {
                    ((CancellationSignal) this.f225c).cancel();
                }
            }
            obj = this.f225c;
        }
        return obj;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.f223a;
        }
        return z;
    }

    public void d() {
        if (!c()) {
            return;
        }
        throw new c();
    }
}
