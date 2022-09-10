package defpackage;

import java.util.AbstractList;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: alxu  reason: default package */
/* loaded from: classes2.dex */
final class alxu extends AbstractList<Integer> implements RandomAccess {
    private final dmue a;

    public alxu(dmue dmueVar) {
        this.a = dmueVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(this.a.y(i).d());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.x();
    }
}
