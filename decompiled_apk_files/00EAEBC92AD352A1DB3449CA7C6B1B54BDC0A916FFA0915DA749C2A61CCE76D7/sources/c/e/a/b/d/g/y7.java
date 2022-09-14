package c.e.a.b.d.g;

import java.util.ListIterator;
/* loaded from: classes.dex */
final class y7 implements ListIterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private ListIterator<String> f4544b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4545c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v7 f4546d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y7(v7 v7Var, int i) {
        v5 v5Var;
        this.f4546d = v7Var;
        this.f4545c = i;
        v5Var = this.f4546d.f4479b;
        this.f4544b = v5Var.listIterator(this.f4545c);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4544b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4544b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f4544b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4544b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f4544b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4544b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
