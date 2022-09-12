package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: datq  reason: default package */
/* loaded from: classes5.dex */
final class datq implements Iterator<Map.Entry> {
    final /* synthetic */ dats a;
    private boolean b;
    private int c;

    public datq(dats datsVar) {
        this.a = datsVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.a.a;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        int i = this.c;
        dats datsVar = this.a;
        if (i != datsVar.a) {
            this.c = i + 1;
            this.b = false;
            return new datp(datsVar, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c - 1;
        if (this.b || i < 0) {
            throw new IllegalArgumentException();
        }
        this.a.d(i + i);
        this.c--;
        this.b = true;
    }
}
