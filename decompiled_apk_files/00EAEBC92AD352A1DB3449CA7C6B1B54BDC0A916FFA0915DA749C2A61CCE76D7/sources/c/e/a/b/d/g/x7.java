package c.e.a.b.d.g;

import java.util.Iterator;
/* loaded from: classes.dex */
final class x7 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f4519b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v7 f4520c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7(v7 v7Var) {
        v5 v5Var;
        this.f4520c = v7Var;
        v5Var = this.f4520c.f4479b;
        this.f4519b = v5Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4519b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f4519b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
