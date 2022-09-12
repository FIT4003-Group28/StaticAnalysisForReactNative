package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcgx  reason: default package */
/* loaded from: classes5.dex */
final class dcgx implements ListIterator<Map.Entry> {
    int a;
    dcgw b;
    dcgw c;
    dcgw d;
    int e;
    final /* synthetic */ dcgz f;

    public dcgx(dcgz dcgzVar, int i) {
        this.f = dcgzVar;
        this.e = dcgzVar.e;
        int i2 = dcgzVar.d;
        dbsk.y(i, i2);
        if (i < i2 / 2) {
            this.b = dcgzVar.a;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            this.d = dcgzVar.b;
            this.a = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.e == this.e) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a */
    public final dcgw next() {
        c();
        dcgz.i(this.b);
        dcgw dcgwVar = this.b;
        this.c = dcgwVar;
        this.d = dcgwVar;
        this.b = dcgwVar.c;
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b */
    public final dcgw previous() {
        c();
        dcgz.i(this.d);
        dcgw dcgwVar = this.d;
        this.c = dcgwVar;
        this.b = dcgwVar;
        this.d = dcgwVar.d;
        this.a--;
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        dbzb.c(this.c != null);
        dcgw dcgwVar = this.c;
        if (dcgwVar != this.b) {
            this.d = dcgwVar.d;
            this.a--;
        } else {
            this.b = dcgwVar.c;
        }
        this.f.g(dcgwVar);
        this.c = null;
        this.e = this.f.e;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
