package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: dcgf  reason: default package */
/* loaded from: classes5.dex */
final class dcgf<T> extends dcpd<T> {
    final Queue<dcgg> a;

    public dcgf(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        this.a = new PriorityQueue(2, new dcge(comparator));
        for (Iterator<? extends T> it : iterable) {
            if (it.hasNext()) {
                this.a.add(dcgh.t(it));
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a.isEmpty();
    }

    @Override // java.util.Iterator
    public final T next() {
        dcgg remove = this.a.remove();
        T t = (T) remove.next();
        if (remove.hasNext()) {
            this.a.add(remove);
        }
        return t;
    }
}
