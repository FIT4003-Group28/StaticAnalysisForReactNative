package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzqb  reason: default package */
/* loaded from: classes6.dex */
final class dzqb extends dznx<dzqo> {
    int a = -1;
    int b = 0;
    final /* synthetic */ dzqc c;

    public dzqb(dzqc dzqcVar) {
        this.c = dzqcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.a.d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            dzqd dzqdVar = this.c.a;
            Object[] objArr = dzqdVar.b;
            int i = this.b;
            this.a = i;
            Object obj = objArr[i];
            Object[] objArr2 = dzqdVar.c;
            this.b = i + 1;
            return new dzns(obj, objArr2[i]);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        if (this.a != -1) {
            this.a = -1;
            int h = dzqd.h(this.c.a);
            int i = this.b;
            int i2 = i - 1;
            this.b = i2;
            int i3 = h - i;
            Object[] objArr = this.c.a.b;
            System.arraycopy(objArr, i2 + 1, objArr, i2, i3);
            Object[] objArr2 = this.c.a.c;
            int i4 = this.b;
            System.arraycopy(objArr2, i4 + 1, objArr2, i4, i3);
            dzqd dzqdVar = this.c.a;
            Object[] objArr3 = dzqdVar.b;
            int i5 = dzqdVar.d;
            objArr3[i5] = null;
            dzqdVar.c[i5] = null;
            return;
        }
        throw new IllegalStateException();
    }
}
