package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzre  reason: default package */
/* loaded from: classes6.dex */
final class dzre extends dznx {
    int a = 0;
    final /* synthetic */ dzrf b;

    public dzre(dzrf dzrfVar) {
        this.b = dzrfVar;
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
        dzrf dzrfVar = this.b;
        int i = dzrfVar.b;
        dzrfVar.b = i - 1;
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        Object[] objArr = dzrfVar.a;
        System.arraycopy(objArr, i3 + 1, objArr, i3, i - i2);
        dzrf dzrfVar2 = this.b;
        dzrfVar2.a[dzrfVar2.b] = null;
    }
}
