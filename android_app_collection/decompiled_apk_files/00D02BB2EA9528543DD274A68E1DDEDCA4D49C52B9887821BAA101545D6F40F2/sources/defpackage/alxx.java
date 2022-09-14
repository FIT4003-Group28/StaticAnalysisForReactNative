package defpackage;

import java.util.AbstractList;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: alxx  reason: default package */
/* loaded from: classes2.dex */
final class alxx extends AbstractList<Integer> implements RandomAccess {
    private final dmve a;

    public alxx(dmve dmveVar) {
        this.a = dmveVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(this.a.g(i).d());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.f();
    }
}
