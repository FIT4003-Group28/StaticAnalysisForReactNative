package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dqu  reason: default package */
/* loaded from: classes3.dex */
final class dqu implements Iterator {
    final /* synthetic */ Iterator a;

    public dqu(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new drc((String) this.a.next());
    }
}
