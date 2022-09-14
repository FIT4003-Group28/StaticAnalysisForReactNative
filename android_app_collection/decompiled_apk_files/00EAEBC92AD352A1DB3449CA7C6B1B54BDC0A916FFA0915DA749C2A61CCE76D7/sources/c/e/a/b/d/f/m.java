package c.e.a.b.d.f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<p, List<Throwable>> f4032a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4033b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f4033b.poll();
            if (poll == null) {
                break;
            }
            this.f4032a.remove(poll);
        }
        List<Throwable> list = this.f4032a.get(new p(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4032a.putIfAbsent(new p(th, this.f4033b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
