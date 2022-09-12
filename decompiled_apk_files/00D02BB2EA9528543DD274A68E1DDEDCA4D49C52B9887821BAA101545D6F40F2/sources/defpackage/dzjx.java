package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzjx  reason: default package */
/* loaded from: classes6.dex */
final class dzjx extends dzib {
    int a = 0;
    final /* synthetic */ dzjy b;

    public dzjx(dzjy dzjyVar) {
        this.b = dzjyVar;
    }

    @Override // defpackage.dzib, defpackage.dzkd
    public final int a() {
        if (hasNext()) {
            int[] iArr = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b;
    }

    @Override // defpackage.dzib, java.util.Iterator
    public final void remove() {
        dzjy dzjyVar = this.b;
        int i = dzjyVar.b;
        dzjyVar.b = i - 1;
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        int[] iArr = dzjyVar.a;
        System.arraycopy(iArr, i3 + 1, iArr, i3, i - i2);
    }
}
