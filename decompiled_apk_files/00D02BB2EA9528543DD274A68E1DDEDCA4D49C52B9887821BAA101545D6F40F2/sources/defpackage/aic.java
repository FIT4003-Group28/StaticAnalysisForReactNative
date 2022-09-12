package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: aic  reason: default package */
/* loaded from: classes2.dex */
final class aic implements Iterator<Map.Entry>, Map.Entry {
    int a;
    int b = -1;
    boolean c;
    final /* synthetic */ aif d;

    public aic(aif aifVar) {
        this.d = aifVar;
        this.a = aifVar.j - 1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.i(this.b);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.j(this.b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        K i = this.d.i(this.b);
        V j = this.d.j(this.b);
        int i2 = 0;
        int hashCode = i == 0 ? 0 : i.hashCode();
        if (j != 0) {
            i2 = j.hashCode();
        }
        return hashCode ^ i2;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.m(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.k(this.b, obj);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return aii.d(entry.getKey(), this.d.i(this.b)) && aii.d(entry.getValue(), this.d.j(this.b));
    }
}
