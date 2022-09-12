package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: datr  reason: default package */
/* loaded from: classes5.dex */
final class datr extends AbstractSet<Map.Entry> {
    final /* synthetic */ dats a;

    public datr(dats datsVar) {
        this.a = datsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new datq(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.a;
    }
}
