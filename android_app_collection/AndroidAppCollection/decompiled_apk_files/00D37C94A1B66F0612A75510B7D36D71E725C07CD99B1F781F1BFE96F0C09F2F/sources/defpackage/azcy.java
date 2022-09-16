package defpackage;
/* compiled from: PG */
/* renamed from: azcy  reason: default package */
/* loaded from: classes2.dex */
public final class azcy extends ayoc {
    final ayof[] a;
    final ayqe b;

    public azcy(ayof[] ayofVarArr, ayqe ayqeVar) {
        this.a = ayofVarArr;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        ayof[] ayofVarArr = this.a;
        azcw azcwVar = new azcw(ayodVar, this.b);
        ayodVar.sj(azcwVar);
        for (int i = 0; i < 2 && !azcwVar.e(); i++) {
            ayof ayofVar = ayofVarArr[i];
            if (ayofVar != null) {
                ayofVar.X(azcwVar.c[i]);
            } else {
                azcwVar.c(new NullPointerException("One of the sources is null"), i);
                return;
            }
        }
    }
}
