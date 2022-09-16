package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: anbx  reason: default package */
/* loaded from: classes.dex */
final class anbx implements Iterator, j$.util.Iterator {
    final /* synthetic */ anby a;
    private final anas b;
    private int c;
    private int d;

    public anbx(anby anbyVar, anas anasVar, int i) {
        this.a = anbyVar;
        this.b = anasVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        Object d = this.b.d(this.a.e(this.c));
        int i = this.d;
        if (i != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.d >>>= numberOfTrailingZeros;
            this.c += numberOfTrailingZeros;
        } else {
            this.c = -1;
        }
        return d;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
