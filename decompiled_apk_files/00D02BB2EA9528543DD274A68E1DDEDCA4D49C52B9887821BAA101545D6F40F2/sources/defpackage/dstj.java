package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dstj  reason: default package */
/* loaded from: classes6.dex */
final class dstj implements Iterator<Map.Entry> {
    final /* synthetic */ dstl a;
    private int b = -1;
    private boolean c;
    private Iterator<Map.Entry> d;

    public dstj(dstl dstlVar) {
        this.a = dstlVar;
    }

    private final Iterator<Map.Entry> a() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b + 1 >= this.a.a.size()) {
            return !this.a.b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        return (Map.Entry) (i < this.a.a.size() ? this.a.a.get(this.b) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.c = false;
            this.a.g();
            if (this.b < this.a.a.size()) {
                dstl dstlVar = this.a;
                int i = this.b;
                this.b = i - 1;
                dstlVar.f(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
