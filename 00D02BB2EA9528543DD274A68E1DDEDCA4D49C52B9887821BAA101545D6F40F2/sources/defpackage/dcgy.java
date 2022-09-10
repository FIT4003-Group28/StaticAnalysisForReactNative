package defpackage;

import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcgy  reason: default package */
/* loaded from: classes5.dex */
public final class dcgy implements ListIterator {
    final Object a;
    int b;
    dcgw c;
    dcgw d;
    dcgw e;
    final /* synthetic */ dcgz f;

    public dcgy(dcgz dcgzVar, Object obj) {
        this.f = dcgzVar;
        this.a = obj;
        dcgv dcgvVar = (dcgv) dcgzVar.c.get(obj);
        this.c = dcgvVar == null ? null : dcgvVar.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.b(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        dcgz.i(this.c);
        dcgw dcgwVar = this.c;
        this.d = dcgwVar;
        this.e = dcgwVar;
        this.c = dcgwVar.e;
        this.b++;
        return this.d.b;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        dcgz.i(this.e);
        dcgw dcgwVar = this.e;
        this.d = dcgwVar;
        this.c = dcgwVar;
        this.e = dcgwVar.f;
        this.b--;
        return this.d.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        dbzb.c(this.d != null);
        dcgw dcgwVar = this.d;
        if (dcgwVar != this.c) {
            this.e = dcgwVar.f;
            this.b--;
        } else {
            this.c = dcgwVar.e;
        }
        this.f.g(dcgwVar);
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        dbsk.l(this.d != null);
        this.d.b = obj;
    }

    public dcgy(dcgz dcgzVar, Object obj, int i) {
        this.f = dcgzVar;
        dcgv dcgvVar = (dcgv) dcgzVar.c.get(obj);
        int i2 = dcgvVar == null ? 0 : dcgvVar.c;
        dbsk.y(i, i2);
        if (i < i2 / 2) {
            this.c = dcgvVar == null ? null : dcgvVar.a;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            this.e = dcgvVar == null ? null : dcgvVar.b;
            this.b = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.a = obj;
        this.d = null;
    }
}
