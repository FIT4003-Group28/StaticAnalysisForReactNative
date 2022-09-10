package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxp  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbxp<T> implements Iterator<T> {
    final Iterator<Map.Entry> a;
    Object b = null;
    Collection c = null;
    Iterator d = dcgd.a;
    final /* synthetic */ dbye e;

    public dbxp(dbye dbyeVar) {
        this.e = dbyeVar;
        this.a = dbyeVar.a.entrySet().iterator();
    }

    public abstract T a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.d.hasNext()) {
            Map.Entry next = this.a.next();
            this.b = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        if (this.c.isEmpty()) {
            this.a.remove();
        }
        dbye.A(this.e);
    }
}
