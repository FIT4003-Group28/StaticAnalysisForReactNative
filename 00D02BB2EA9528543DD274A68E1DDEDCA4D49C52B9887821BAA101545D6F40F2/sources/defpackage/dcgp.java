package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcgp  reason: default package */
/* loaded from: classes5.dex */
public final class dcgp extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ dcgz b;

    public dcgp(dcgz dcgzVar, Object obj) {
        this.b = dcgzVar;
        this.a = obj;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new dcgy(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        dcgv dcgvVar = (dcgv) this.b.c.get(this.a);
        if (dcgvVar == null) {
            return 0;
        }
        return dcgvVar.c;
    }
}
