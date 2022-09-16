package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dqm  reason: default package */
/* loaded from: classes3.dex */
final class dqm implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;

    public dqm(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a.hasNext()) {
            return new drc(((Integer) this.a.next()).toString());
        }
        if (this.b.hasNext()) {
            return new drc((String) this.b.next());
        }
        throw new NoSuchElementException();
    }
}
