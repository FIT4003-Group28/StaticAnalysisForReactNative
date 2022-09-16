package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amwn  reason: default package */
/* loaded from: classes.dex */
public final class amwn extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;
    final List a;
    final ampg b;

    public amwn(List list, ampg ampgVar) {
        list.getClass();
        this.a = list;
        ampgVar.getClass();
        this.b = ampgVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new amwm(this, this.a.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
