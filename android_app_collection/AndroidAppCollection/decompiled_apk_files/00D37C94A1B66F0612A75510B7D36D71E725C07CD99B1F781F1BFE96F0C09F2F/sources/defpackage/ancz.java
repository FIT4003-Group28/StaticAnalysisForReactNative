package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: ancz  reason: default package */
/* loaded from: classes.dex */
final class ancz implements Iterator, j$.util.Iterator {
    final /* synthetic */ anda a;
    private int b = 0;

    public ancz(anda andaVar) {
        this.a = andaVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        int i = this.b;
        if (i < this.a.size()) {
            anda andaVar = this.a;
            Object obj = andaVar.b.b[andaVar.b() + i];
            this.b = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
