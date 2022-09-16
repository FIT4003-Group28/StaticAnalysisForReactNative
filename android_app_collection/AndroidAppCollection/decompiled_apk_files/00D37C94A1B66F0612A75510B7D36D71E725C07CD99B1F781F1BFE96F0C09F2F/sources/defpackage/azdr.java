package defpackage;
/* compiled from: PG */
/* renamed from: azdr  reason: default package */
/* loaded from: classes2.dex */
public final class azdr extends ayoi {
    final ayok[] a;

    public azdr(ayok[] ayokVarArr) {
        this.a = ayokVarArr;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        ayok[] ayokVarArr = this.a;
        azdp azdpVar = new azdp(ayomVar);
        azdq[] azdqVarArr = azdpVar.b;
        int i = 0;
        while (i < 2) {
            int i2 = i + 1;
            azdqVarArr[i] = new azdq(azdpVar, i2, azdpVar.a);
            i = i2;
        }
        azdpVar.c.lazySet(0);
        azdpVar.a.sj(azdpVar);
        for (int i3 = 0; i3 < 2 && azdpVar.c.get() == 0; i3++) {
            ayokVarArr[i3].az(azdqVarArr[i3]);
        }
    }
}
