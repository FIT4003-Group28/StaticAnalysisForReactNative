package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcgq  reason: default package */
/* loaded from: classes5.dex */
final class dcgq extends AbstractSequentialList<Map.Entry> {
    final /* synthetic */ dcgz a;

    public dcgq(dcgz dcgzVar) {
        this.a = dcgzVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry> listIterator(int i) {
        return new dcgx(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
