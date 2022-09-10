package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxx  reason: default package */
/* loaded from: classes.dex */
public class dbxx implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ dbxy c;

    public dbxx(dbxy dbxyVar) {
        Iterator it;
        this.c = dbxyVar;
        this.b = dbxyVar.b;
        Collection collection = dbxyVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    public dbxx(dbxy dbxyVar, Iterator it) {
        this.c = dbxyVar;
        this.b = dbxyVar.b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.a();
        if (this.c.b == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        dbye.A(this.c.e);
        this.c.b();
    }
}
