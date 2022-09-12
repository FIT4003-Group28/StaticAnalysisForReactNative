package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzms  reason: default package */
/* loaded from: classes6.dex */
final class dzms extends dzkw {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ dzmt d;

    public dzms(dzmt dzmtVar, int i) {
        this.d = dzmtVar;
        this.c = i;
        this.a = i;
    }

    @Override // defpackage.dzkq, defpackage.dzmx
    public final long a() {
        if (hasPrevious()) {
            long[] jArr = this.d.a;
            int i = this.a - 1;
            this.a = i;
            this.b = i;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzks, defpackage.dzna
    public final long b() {
        if (hasNext()) {
            long[] jArr = this.d.a;
            int i = this.a;
            this.a = i + 1;
            this.b = i;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dzkw
    public final void c(long j) {
        dzmt dzmtVar = this.d;
        int i = this.a;
        this.a = i + 1;
        dzmtVar.e(i, j);
        this.b = -1;
    }

    @Override // defpackage.dzkw
    public final void d(long j) {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.h(i, j);
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

    @Override // defpackage.dzks, java.util.Iterator
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
