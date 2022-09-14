package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dcnj  reason: default package */
/* loaded from: classes5.dex */
abstract class dcnj<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return dcnm.v(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        dbsk.s(collection);
        return super.retainAll(collection);
    }
}
