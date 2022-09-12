package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbym  reason: default package */
/* loaded from: classes5.dex */
final class dbym extends AbstractCollection {
    final /* synthetic */ dbyn a;

    public dbym(dbyn dbynVar) {
        this.a = dbynVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.E(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.u();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.l();
    }
}
