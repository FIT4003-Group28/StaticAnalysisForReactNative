package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzkz  reason: default package */
/* loaded from: classes6.dex */
final class dzkz extends dznx<dzkj> {
    int a = -1;
    int b = 0;
    final /* synthetic */ dzla c;

    public dzkz(dzla dzlaVar) {
        this.c = dzlaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            dzlb dzlbVar = this.c.a;
            long[] jArr = dzlbVar.a;
            int i = this.b;
            this.a = i;
            long j = jArr[i];
            double[] dArr = dzlbVar.b;
            this.b = i + 1;
            return new dzkj(j, dArr[i]);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        if (this.a != -1) {
            this.a = -1;
            int l = dzlb.l(this.c.a);
            int i = this.b;
            int i2 = i - 1;
            this.b = i2;
            int i3 = l - i;
            long[] jArr = this.c.a.a;
            System.arraycopy(jArr, i2 + 1, jArr, i2, i3);
            double[] dArr = this.c.a.b;
            int i4 = this.b;
            System.arraycopy(dArr, i4 + 1, dArr, i4, i3);
            return;
        }
        throw new IllegalStateException();
    }
}
