package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzrz  reason: default package */
/* loaded from: classes6.dex */
final class dzrz extends dznx<dzof> {
    int a = -1;
    int b = 0;
    final /* synthetic */ dzsa c;

    public dzrz(dzsa dzsaVar) {
        this.c = dzsaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            dzsb dzsbVar = this.c.a;
            Object[] objArr = dzsbVar.a;
            int i = this.b;
            this.a = i;
            Object obj = objArr[i];
            Object[] objArr2 = dzsbVar.b;
            this.b = i + 1;
            return new dzof(obj, objArr2[i]);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        if (this.a != -1) {
            this.a = -1;
            int f = dzsb.f(this.c.a);
            int i = this.b;
            int i2 = i - 1;
            this.b = i2;
            int i3 = f - i;
            Object[] objArr = this.c.a.a;
            System.arraycopy(objArr, i2 + 1, objArr, i2, i3);
            Object[] objArr2 = this.c.a.b;
            int i4 = this.b;
            System.arraycopy(objArr2, i4 + 1, objArr2, i4, i3);
            dzsb dzsbVar = this.c.a;
            Object[] objArr3 = dzsbVar.a;
            int i5 = dzsbVar.c;
            objArr3[i5] = null;
            dzsbVar.b[i5] = null;
            return;
        }
        throw new IllegalStateException();
    }
}
