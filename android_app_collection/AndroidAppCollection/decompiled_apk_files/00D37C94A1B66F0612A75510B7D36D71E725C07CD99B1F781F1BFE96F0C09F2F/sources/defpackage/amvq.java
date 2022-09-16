package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: amvq  reason: default package */
/* loaded from: classes.dex */
public abstract class amvq extends amvr implements NavigableSet, amyu {
    final transient Comparator a;
    transient amvq b;

    public amvq(Comparator comparator) {
        this.a = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amyh F(Comparator comparator) {
        if (amxo.a.equals(comparator)) {
            return amyh.c;
        }
        return new amyh(amuk.q(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract amvq A(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: B */
    public final amvq subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        aqxo.p(this.a.compare(obj, obj2) <= 0);
        return C(obj, z, obj2, z2);
    }

    public abstract amvq C(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: D */
    public final amvq tailSet(Object obj, boolean z) {
        obj.getClass();
        return E(obj, z);
    }

    public abstract amvq E(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: G */
    public abstract amzs descendingIterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return arey.r(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, defpackage.amyu
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        amvq amvqVar = this.b;
        if (amvqVar == null) {
            amvq y = y();
            this.b = y;
            y.b = this;
            return y;
        }
        return amvqVar;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().mo416next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return arey.j(headSet(obj, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return arey.r(tailSet(obj, false), null);
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract amzs iterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().mo416next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return arey.j(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.amvn, defpackage.amub
    Object writeReplace() {
        return new amvp(this.a, toArray());
    }

    public abstract amvq y();

    @Override // java.util.NavigableSet
    /* renamed from: z */
    public final amvq headSet(Object obj, boolean z) {
        obj.getClass();
        return A(obj, z);
    }
}
