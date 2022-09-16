package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class v7 extends AbstractList<String> implements v5, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private final v5 f4479b;

    public v7(v5 v5Var) {
        this.f4479b = v5Var;
    }

    @Override // c.e.a.b.d.g.v5
    public final void a(v3 v3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // c.e.a.b.d.g.v5
    public final Object b(int i) {
        return this.f4479b.b(i);
    }

    @Override // c.e.a.b.d.g.v5
    public final v5 g() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f4479b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new x7(this);
    }

    @Override // c.e.a.b.d.g.v5
    public final List<?> k() {
        return this.f4479b.k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new y7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4479b.size();
    }
}
