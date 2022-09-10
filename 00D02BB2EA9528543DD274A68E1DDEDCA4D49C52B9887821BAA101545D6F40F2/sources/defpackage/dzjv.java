package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzjv  reason: default package */
/* loaded from: classes6.dex */
final class dzjv extends dzif {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ dzjw d;

    public dzjv(dzjw dzjwVar, int i) {
        this.d = dzjwVar;
        this.c = i;
        this.a = i;
    }

    @Override // defpackage.dzib, defpackage.dzkd
    public final int a() {
        if (hasNext()) {
            int[] iArr = this.d.a;
            int i = this.a;
            this.a = i + 1;
            this.b = i;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzhz, defpackage.dzkb
    public final int b() {
        if (hasPrevious()) {
            int[] iArr = this.d.a;
            int i = this.a - 1;
            this.a = i;
            this.b = i;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzif
    public final void c(int i) {
        dzjw dzjwVar = this.d;
        int i2 = this.a;
        this.a = i2 + 1;
        dzjwVar.e(i2, i);
        this.b = -1;
    }

    @Override // defpackage.dzif
    public final void d(int i) {
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.d.h(i2, i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.a < this.d.b;
    }

    @Override // defpackage.dzgt, java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // defpackage.dzib, java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.g(i);
        int i2 = this.b;
        int i3 = this.a;
        if (i2 < i3) {
            this.a = i3 - 1;
        }
        this.b = -1;
    }
}
