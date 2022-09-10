package defpackage;

import java.lang.Comparable;
import java.util.List;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: anif  reason: default package */
/* loaded from: classes2.dex */
public final class anif<T extends Comparable<? super T>> {
    public final int c;
    public final List<aouo> b = dchl.a();
    public final SortedSet<anie<T>> a = dcnm.j();

    public anif(int i) {
        this.c = i;
    }

    public final void a(int i) {
        int max = Math.max(i, 0);
        while (this.a.size() > max) {
            T t = this.a.first().a;
            SortedSet<anie<T>> sortedSet = this.a;
            sortedSet.remove(sortedSet.first());
            for (aouo aouoVar : this.b) {
                aouoVar.a.j(t);
            }
        }
    }

    public final void b(T t) {
        dcft.y(this.a, new anid(t));
    }
}
