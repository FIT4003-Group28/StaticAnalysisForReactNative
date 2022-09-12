package defpackage;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dchc  reason: default package */
/* loaded from: classes5.dex */
class dchc<T> extends AbstractList<List<T>> {
    final List<T> a;
    final int b = 100;

    public dchc(List<T> list) {
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        dbsk.z(i, size());
        int i2 = this.b;
        int i3 = i * i2;
        return this.a.subList(i3, Math.min(i2 + i3, this.a.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return deay.c(this.a.size(), this.b, RoundingMode.CEILING);
    }
}
