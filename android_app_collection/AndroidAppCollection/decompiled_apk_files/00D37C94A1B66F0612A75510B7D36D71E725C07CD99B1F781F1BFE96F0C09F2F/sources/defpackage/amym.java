package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amym  reason: default package */
/* loaded from: classes.dex */
public final class amym extends amys {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public amym(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.amys, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final amzs iterator() {
        return new amyl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.a.size();
        amzs it = ((amyt) this.b).iterator();
        while (it.hasNext()) {
            if (!this.a.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
