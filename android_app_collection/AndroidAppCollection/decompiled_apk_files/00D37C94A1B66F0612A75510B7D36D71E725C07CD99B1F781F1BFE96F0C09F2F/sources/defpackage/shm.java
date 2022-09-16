package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: shm  reason: default package */
/* loaded from: classes4.dex */
public final class shm extends AbstractList implements List, RandomAccess {
    private final List a;
    private final shj b;

    public shm(List list, shj shjVar) {
        sho.h(list);
        this.a = list;
        sho.h(shjVar);
        this.b = shjVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
