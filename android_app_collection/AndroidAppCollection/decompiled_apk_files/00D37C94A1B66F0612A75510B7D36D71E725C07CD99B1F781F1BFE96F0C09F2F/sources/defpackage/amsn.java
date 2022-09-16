package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amsn  reason: default package */
/* loaded from: classes.dex */
final class amsn extends AbstractSet {
    final /* synthetic */ amsq a;

    public amsn(amsq amsqVar) {
        this.a = amsqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        amsq amsqVar = this.a;
        Map l = amsqVar.l();
        if (l != null) {
            return l.keySet().iterator();
        }
        return new amsi(amsqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.keySet().remove(obj);
        }
        return this.a.h(obj) != amsq.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
