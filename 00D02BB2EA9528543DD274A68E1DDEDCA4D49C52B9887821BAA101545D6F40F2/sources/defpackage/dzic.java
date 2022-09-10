package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzic  reason: default package */
/* loaded from: classes6.dex */
final class dzic extends dzif {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ dzid d;

    public dzic(dzid dzidVar, int i) {
        this.d = dzidVar;
        this.c = i;
        this.a = i;
    }

    @Override // defpackage.dzib, defpackage.dzkd
    public final int a() {
        if (hasNext()) {
            dzid dzidVar = this.d;
            dzke dzkeVar = dzidVar.a;
            int i = dzidVar.b;
            int i2 = this.a;
            this.a = i2 + 1;
            this.b = i2;
            return dzkeVar.f(i + i2);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzhz, defpackage.dzkb
    public final int b() {
        if (hasPrevious()) {
            dzid dzidVar = this.d;
            dzke dzkeVar = dzidVar.a;
            int i = dzidVar.b;
            int i2 = this.a - 1;
            this.a = i2;
            this.b = i2;
            return dzkeVar.f(i + i2);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzif
    public final void c(int i) {
        if (this.b != -1) {
            dzid dzidVar = this.d;
            int i2 = this.a;
            this.a = i2 + 1;
            dzidVar.e(i2, i);
            this.b = -1;
            return;
        }
        throw new IllegalStateException();
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
        return this.a < this.d.size();
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
