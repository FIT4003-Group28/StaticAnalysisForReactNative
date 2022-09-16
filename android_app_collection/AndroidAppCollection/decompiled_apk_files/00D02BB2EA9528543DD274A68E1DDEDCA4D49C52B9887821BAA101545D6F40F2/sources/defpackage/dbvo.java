package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbvo  reason: default package */
/* loaded from: classes5.dex */
final class dbvo extends dbuy {
    final /* synthetic */ dbwu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbvo(dbwu dbwuVar) {
        super(dbwuVar);
        this.b = dbwuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dbvn(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.b.remove(obj) != null;
    }
}
