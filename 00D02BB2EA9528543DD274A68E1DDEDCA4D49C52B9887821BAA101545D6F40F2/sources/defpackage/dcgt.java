package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dcgt  reason: default package */
/* loaded from: classes5.dex */
final class dcgt extends AbstractSequentialList {
    final /* synthetic */ dcgz a;

    public dcgt(dcgz dcgzVar) {
        this.a = dcgzVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        dcgx dcgxVar = new dcgx(this.a, i);
        return new dcgs(dcgxVar, dcgxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
