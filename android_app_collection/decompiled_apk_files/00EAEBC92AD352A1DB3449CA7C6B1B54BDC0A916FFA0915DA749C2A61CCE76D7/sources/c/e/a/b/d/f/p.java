package c.e.a.b.d.f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
final class p extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4035a;

    public p(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f4035a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == p.class) {
            if (this == obj) {
                return true;
            }
            p pVar = (p) obj;
            if (this.f4035a == pVar.f4035a && get() == pVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4035a;
    }
}
