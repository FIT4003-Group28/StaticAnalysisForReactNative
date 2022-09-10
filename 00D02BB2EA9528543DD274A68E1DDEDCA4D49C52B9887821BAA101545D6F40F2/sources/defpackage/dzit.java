package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzit  reason: default package */
/* loaded from: classes6.dex */
final class dzit extends dznx<dzjh> {
    int a = -1;
    int b = 0;
    final /* synthetic */ dziu c;

    public dzit(dziu dziuVar) {
        this.c = dziuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            dziv dzivVar = this.c.a;
            int[] iArr = dzivVar.a;
            int i = this.b;
            this.a = i;
            int i2 = iArr[i];
            Object[] objArr = dzivVar.b;
            this.b = i + 1;
            return new dzhw(i2, objArr[i]);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        if (this.a != -1) {
            this.a = -1;
            int l = dziv.l(this.c.a);
            int i = this.b;
            int i2 = i - 1;
            this.b = i2;
            int i3 = l - i;
            int[] iArr = this.c.a.a;
            System.arraycopy(iArr, i2 + 1, iArr, i2, i3);
            Object[] objArr = this.c.a.b;
            int i4 = this.b;
            System.arraycopy(objArr, i4 + 1, objArr, i4, i3);
            dziv dzivVar = this.c.a;
            dzivVar.b[dzivVar.c] = null;
            return;
        }
        throw new IllegalStateException();
    }
}
