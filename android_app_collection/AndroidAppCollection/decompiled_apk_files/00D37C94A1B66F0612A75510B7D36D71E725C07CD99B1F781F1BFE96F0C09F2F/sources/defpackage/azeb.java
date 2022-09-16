package defpackage;
/* compiled from: PG */
/* renamed from: azeb  reason: default package */
/* loaded from: classes2.dex */
public final class azeb extends ayoi {
    final ayok[] a;
    final Iterable b;
    final ayqe c;
    final int d;

    public azeb(ayok[] ayokVarArr, Iterable iterable, ayqe ayqeVar, int i) {
        this.a = ayokVarArr;
        this.b = iterable;
        this.c = ayqeVar;
        this.d = i;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        int length;
        ayok[] ayokVarArr = this.a;
        if (ayokVarArr == null) {
            ayokVarArr = new ayoi[8];
            length = 0;
            for (ayok ayokVar : this.b) {
                if (length == ayokVarArr.length) {
                    ayok[] ayokVarArr2 = new ayok[(length >> 2) + length];
                    System.arraycopy(ayokVarArr, 0, ayokVarArr2, 0, length);
                    ayokVarArr = ayokVarArr2;
                }
                ayokVarArr[length] = ayokVar;
                length++;
            }
        } else {
            length = ayokVarArr.length;
        }
        if (length == 0) {
            ayqj.f(ayomVar);
            return;
        }
        azea azeaVar = new azea(ayomVar, this.c, length, this.d);
        azdz[] azdzVarArr = azeaVar.c;
        int length2 = azdzVarArr.length;
        azeaVar.a.sj(azeaVar);
        for (int i = 0; i < length2 && !azeaVar.g && !azeaVar.f; i++) {
            ayokVarArr[i].az(azdzVarArr[i]);
        }
    }
}
