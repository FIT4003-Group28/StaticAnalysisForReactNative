package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: awmg  reason: default package */
/* loaded from: classes3.dex */
final class awmg implements Iterator {
    final int a;
    final /* synthetic */ awmi b;
    @dzsi
    private awmh c;

    public awmg(awmi awmiVar) {
        this.b = awmiVar;
        this.a = awmiVar.b;
        this.c = awmiVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        awmh awmhVar = this.c;
        if (awmhVar != null) {
            if (this.b.b == this.a) {
                T t = awmhVar.a;
                this.c = awmhVar.b;
                return t;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }
}
