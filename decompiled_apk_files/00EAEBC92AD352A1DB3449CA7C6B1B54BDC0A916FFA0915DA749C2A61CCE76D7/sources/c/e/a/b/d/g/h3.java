package c.e.a.b.d.g;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
final class h3 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4190a;

    public h3(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f4190a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == h3.class) {
            if (this == obj) {
                return true;
            }
            h3 h3Var = (h3) obj;
            if (this.f4190a == h3Var.f4190a && get() == h3Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4190a;
    }
}
