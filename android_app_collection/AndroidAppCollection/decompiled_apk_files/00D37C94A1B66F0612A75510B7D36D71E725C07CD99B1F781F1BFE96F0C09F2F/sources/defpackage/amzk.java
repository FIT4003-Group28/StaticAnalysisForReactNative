package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: amzk  reason: default package */
/* loaded from: classes.dex */
public final class amzk extends amzj implements SortedSet {
    private static final long serialVersionUID = 0;

    public amzk(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amzj
    /* renamed from: c */
    public final SortedSet b() {
        return (SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.g) {
            comparator = b().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object first;
        synchronized (this.g) {
            first = b().first();
        }
        return first;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        SortedSet k;
        synchronized (this.g) {
            k = ancv.k(b().headSet(obj), this.g);
        }
        return k;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object last;
        synchronized (this.g) {
            last = b().last();
        }
        return last;
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        SortedSet k;
        synchronized (this.g) {
            k = ancv.k(b().subSet(obj, obj2), this.g);
        }
        return k;
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        SortedSet k;
        synchronized (this.g) {
            k = ancv.k(b().tailSet(obj), this.g);
        }
        return k;
    }
}
