package defpackage;

import java.util.AbstractList;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: alxt  reason: default package */
/* loaded from: classes2.dex */
final class alxt extends AbstractList<Long> implements RandomAccess {
    private final dmue a;

    public alxt(dmue dmueVar) {
        this.a = dmueVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(this.a.B(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d();
    }
}
