package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dgx  reason: default package */
/* loaded from: classes3.dex */
final class dgx implements Iterator, j$.util.Iterator {
    final /* synthetic */ dgy a;
    private int b = -1;
    private boolean c;

    public dgx(dgy dgyVar) {
        this.a = dgyVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < this.a.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (hasNext()) {
            this.c = false;
            int i = this.b + 1;
            this.b = i;
            return this.a.a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c) {
            throw new IllegalStateException();
        }
        this.a.b(this.b);
        this.c = true;
        this.b--;
    }
}
