package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amyo  reason: default package */
/* loaded from: classes.dex */
public final class amyo extends amys {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public amyo(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.amys, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final amzs iterator() {
        return new amyn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (this.b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
