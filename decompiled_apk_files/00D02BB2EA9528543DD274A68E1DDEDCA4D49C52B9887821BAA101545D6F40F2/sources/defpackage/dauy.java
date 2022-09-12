package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dauy  reason: default package */
/* loaded from: classes5.dex */
final class dauy implements Iterator {
    final int a;
    int b = 0;
    final /* synthetic */ dauz c;

    public dauy(dauz dauzVar) {
        this.c = dauzVar;
        this.a = Array.getLength(dauzVar.a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.c.a;
            int i = this.b;
            this.b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
