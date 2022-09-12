package defpackage;

import java.util.AbstractList;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: alxw  reason: default package */
/* loaded from: classes2.dex */
final class alxw extends AbstractList<Long> implements RandomAccess {
    private final dmve a;

    public alxw(dmve dmveVar) {
        this.a = dmveVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(this.a.k(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d();
    }
}
