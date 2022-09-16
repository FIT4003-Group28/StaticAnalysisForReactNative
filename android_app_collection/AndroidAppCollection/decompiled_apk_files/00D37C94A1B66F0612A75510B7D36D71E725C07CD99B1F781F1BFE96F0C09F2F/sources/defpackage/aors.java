package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aors  reason: default package */
/* loaded from: classes.dex */
final class aors implements Iterator, j$.util.Iterator {
    final /* synthetic */ aoru a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public aors(aoru aoruVar) {
        this.a = aoruVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b + 1 >= this.a.a.size()) {
            return !this.a.b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        if (i < this.a.a.size()) {
            return (Map.Entry) this.a.a.get(this.b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c) {
            this.c = false;
            this.a.g();
            if (this.b < this.a.a.size()) {
                aoru aoruVar = this.a;
                int i = this.b;
                this.b = i - 1;
                aoruVar.e(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
