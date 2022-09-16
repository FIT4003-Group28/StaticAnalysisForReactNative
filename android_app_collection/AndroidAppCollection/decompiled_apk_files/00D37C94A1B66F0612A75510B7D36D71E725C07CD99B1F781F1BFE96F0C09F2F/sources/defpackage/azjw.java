package defpackage;
/* compiled from: PG */
/* renamed from: azjw  reason: default package */
/* loaded from: classes2.dex */
public final class azjw extends ayoi {
    final ayok[] a;
    final ayqe b;
    final int c;

    public azjw(ayok[] ayokVarArr, ayqe ayqeVar, int i) {
        this.a = ayokVarArr;
        this.b = ayqeVar;
        this.c = i;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        ayok[] ayokVarArr = this.a;
        azju azjuVar = new azju(ayomVar, this.b);
        int i = this.c;
        azjv[] azjvVarArr = azjuVar.c;
        int length = azjvVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            azjvVarArr[i2] = new azjv(azjuVar, i);
        }
        azjuVar.lazySet(0);
        azjuVar.a.sj(azjuVar);
        for (int i3 = 0; i3 < 2 && !azjuVar.e; i3++) {
            ayokVarArr[i3].az(azjvVarArr[i3]);
        }
    }
}
