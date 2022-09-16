package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: zfe  reason: default package */
/* loaded from: classes4.dex */
final class zfe extends AbstractCollection {
    final /* synthetic */ zfi a;

    public zfe(zfi zfiVar) {
        this.a = zfiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zfh(this.a, new zfd());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
