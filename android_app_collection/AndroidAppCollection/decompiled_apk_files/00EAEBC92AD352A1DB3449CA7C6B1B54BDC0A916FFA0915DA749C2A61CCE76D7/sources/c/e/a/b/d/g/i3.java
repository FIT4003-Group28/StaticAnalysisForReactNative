package c.e.a.b.d.g;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
final class i3 {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<h3, List<Throwable>> f4211a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4212b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f4212b.poll();
            if (poll == null) {
                break;
            }
            this.f4211a.remove(poll);
        }
        List<Throwable> list = this.f4211a.get(new h3(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4211a.putIfAbsent(new h3(th, this.f4212b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
