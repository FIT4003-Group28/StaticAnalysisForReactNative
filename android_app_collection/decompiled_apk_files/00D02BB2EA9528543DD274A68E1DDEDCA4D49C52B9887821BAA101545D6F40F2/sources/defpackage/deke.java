package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: deke  reason: default package */
/* loaded from: classes6.dex */
final class deke {
    private final ConcurrentHashMap<dekd, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.a.remove(poll);
            referenceQueue = this.b;
        }
        List<Throwable> list = this.a.get(new dekd(th, null));
        if (z && list == null) {
            Vector vector = new Vector(2);
            List<Throwable> putIfAbsent = this.a.putIfAbsent(new dekd(th, this.b), vector);
            return putIfAbsent == null ? vector : putIfAbsent;
        }
        return list;
    }
}
