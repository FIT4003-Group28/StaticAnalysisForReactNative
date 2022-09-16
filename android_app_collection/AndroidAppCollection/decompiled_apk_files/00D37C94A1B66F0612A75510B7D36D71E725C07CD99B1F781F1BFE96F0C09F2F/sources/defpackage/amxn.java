package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: amxn  reason: default package */
/* loaded from: classes.dex */
final class amxn implements Iterator, j$.util.Iterator {
    private final amxj a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private amxk f;

    public amxn(amxj amxjVar, Iterator it) {
        this.a = amxjVar;
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (hasNext()) {
            int i = this.c;
            if (i == 0) {
                amxk amxkVar = (amxk) this.b.next();
                this.f = amxkVar;
                i = amxkVar.a();
                this.d = i;
            }
            this.c = i - 1;
            this.e = true;
            amxk amxkVar2 = this.f;
            amxkVar2.getClass();
            return amxkVar2.a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        araa.u(this.e);
        if (this.d == 1) {
            this.b.remove();
        } else {
            amxj amxjVar = this.a;
            amxk amxkVar = this.f;
            amxkVar.getClass();
            amxjVar.remove(amxkVar.a);
        }
        this.d--;
        this.e = false;
    }
}
