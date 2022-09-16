package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amrk  reason: default package */
/* loaded from: classes.dex */
class amrk implements Iterator, j$.util.Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ amrl c;

    public amrk(amrl amrlVar) {
        Iterator it;
        this.c = amrlVar;
        this.b = amrlVar.b;
        Collection collection = amrlVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    public amrk(amrl amrlVar, Iterator it) {
        this.c = amrlVar;
        this.b = amrlVar.b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.b();
        if (this.c.b == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.a.remove();
        amrl amrlVar = this.c;
        amro amroVar = amrlVar.e;
        amroVar.b--;
        amrlVar.c();
    }
}
