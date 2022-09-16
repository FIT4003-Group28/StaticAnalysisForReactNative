package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: anbv  reason: default package */
/* loaded from: classes.dex */
final class anbv implements Iterator, j$.util.Iterator {
    final /* synthetic */ anbw a;
    private int b = 0;

    public anbv(anbw anbwVar) {
        this.a = anbwVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        anby anbyVar = this.a.a;
        int[] iArr = anbyVar.a;
        int i = this.b;
        this.b = i + 1;
        return anbyVar.d(iArr[i] & 31);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
