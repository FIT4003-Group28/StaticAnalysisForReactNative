package defpackage;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: aft  reason: default package */
/* loaded from: classes.dex */
final class aft implements Iterator, Map.Entry, j$.util.Iterator, Map.Entry {
    int a;
    int b = -1;
    boolean c;
    final /* synthetic */ afw d;

    public aft(afw afwVar) {
        this.d = afwVar;
        this.a = afwVar.j - 1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.f(this.b);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.i(this.b);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object f = this.d.f(this.b);
        Object i = this.d.i(this.b);
        int i2 = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        if (i != null) {
            i2 = i.hashCode();
        }
        return hashCode ^ i2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.g(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.h(this.b, obj);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return afz.f(entry.getKey(), this.d.f(this.b)) && afz.f(entry.getValue(), this.d.i(this.b));
    }
}
