package defpackage;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: shl  reason: default package */
/* loaded from: classes4.dex */
public final class shl extends AbstractSequentialList implements List {
    public final shj a;
    private final List b;

    public shl(List list, shj shjVar) {
        sho.h(list);
        this.b = list;
        sho.h(shjVar);
        this.a = shjVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new shk(this, this.b.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
