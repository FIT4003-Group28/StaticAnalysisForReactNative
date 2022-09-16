package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amru  reason: default package */
/* loaded from: classes.dex */
final class amru extends AbstractCollection {
    final /* synthetic */ amrv a;

    public amru(amrv amrvVar) {
        this.a = amrvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.t(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.g();
    }
}
