package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: btna  reason: default package */
/* loaded from: classes4.dex */
public final class btna<Key, Value> implements Iterator<btnb<Key, Value>> {
    final Iterator<dzqo<Key, Value>> a;

    public btna(dzqn<Key, Value> dzqnVar) {
        this.a = dzqnVar.o().Td();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final btnb<Key, Value> next() {
        dzqo<Key, Value> next = this.a.next();
        return new btnb<>(next.getKey(), next.getValue());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
