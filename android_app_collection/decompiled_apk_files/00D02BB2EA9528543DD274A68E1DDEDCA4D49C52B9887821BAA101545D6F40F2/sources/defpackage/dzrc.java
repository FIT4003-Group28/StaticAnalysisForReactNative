package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzrc  reason: default package */
/* loaded from: classes6.dex */
final class dzrc extends dzob {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ dzrd d;

    public dzrc(dzrd dzrdVar, int i) {
        this.d = dzrdVar;
        this.c = i;
        this.a = i;
    }

    @Override // defpackage.dzob, java.util.ListIterator
    public final void add(Object obj) {
        dzrd dzrdVar = this.d;
        int i = this.a;
        this.a = i + 1;
        dzrdVar.add(i, obj);
        this.b = -1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.a < this.d.b;
    }

    @Override // defpackage.dzgt, java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            Object[] objArr = this.d.a;
            int i = this.a;
            this.a = i + 1;
            this.b = i;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // defpackage.dzgt
    public final Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.d.a;
            int i = this.a - 1;
            this.a = i;
            this.b = i;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.remove(i);
        int i2 = this.b;
        int i3 = this.a;
        if (i2 < i3) {
            this.a = i3 - 1;
        }
        this.b = -1;
    }

    @Override // defpackage.dzob, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.set(i, obj);
    }
}
