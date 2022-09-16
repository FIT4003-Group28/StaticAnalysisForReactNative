package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzhf  reason: default package */
/* loaded from: classes6.dex */
final class dzhf extends dzhc {
    int a = 0;
    final /* synthetic */ dzhg b;

    public dzhf(dzhg dzhgVar) {
        this.b = dzhgVar;
    }

    @Override // defpackage.dzhc, defpackage.dzhl
    public final double b() {
        if (hasNext()) {
            double[] dArr = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return dArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b;
    }

    @Override // defpackage.dzhc, java.util.Iterator
    public final void remove() {
        dzhg dzhgVar = this.b;
        int i = dzhgVar.b;
        dzhgVar.b = i - 1;
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        double[] dArr = dzhgVar.a;
        System.arraycopy(dArr, i3 + 1, dArr, i3, i - i2);
    }
}
