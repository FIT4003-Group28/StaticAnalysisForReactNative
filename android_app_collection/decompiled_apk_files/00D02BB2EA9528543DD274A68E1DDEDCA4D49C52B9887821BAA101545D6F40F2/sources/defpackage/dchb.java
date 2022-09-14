package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dchb  reason: default package */
/* loaded from: classes5.dex */
public final class dchb<E> extends AbstractList<E> implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final E a;
    final E[] b;

    public dchb(E e, E[] eArr) {
        this.a = e;
        this.b = eArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        dbsk.z(i, size());
        return i == 0 ? this.a : this.b[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return deay.e(this.b.length, 1);
    }
}
