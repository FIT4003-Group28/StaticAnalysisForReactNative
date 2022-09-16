package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzsd  reason: default package */
/* loaded from: classes6.dex */
final class dzsd extends dznx {
    int a = 0;
    final /* synthetic */ dzse b;

    public dzsd(dzse dzseVar) {
        this.b = dzseVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object[] objArr = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        dzse dzseVar = this.b;
        int i = dzseVar.b;
        dzseVar.b = i - 1;
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        Object[] objArr = dzseVar.a;
        System.arraycopy(objArr, i3 + 1, objArr, i3, i - i2);
        dzse dzseVar2 = this.b;
        dzseVar2.a[dzseVar2.b] = null;
    }
}
