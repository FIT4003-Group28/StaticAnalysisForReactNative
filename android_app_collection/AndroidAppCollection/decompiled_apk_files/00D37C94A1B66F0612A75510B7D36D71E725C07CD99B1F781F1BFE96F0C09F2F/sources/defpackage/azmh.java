package defpackage;
/* compiled from: PG */
/* renamed from: azmh  reason: default package */
/* loaded from: classes2.dex */
public final class azmh extends ayos {
    final ayov[] a;
    final ayqe b;

    public azmh(ayov[] ayovVarArr, ayqe ayqeVar) {
        this.a = ayovVarArr;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        ayov[] ayovVarArr = this.a;
        azmf azmfVar = new azmf(ayotVar, this.b);
        ayotVar.sj(azmfVar);
        for (int i = 0; i < 2 && !azmfVar.e(); i++) {
            ayov ayovVar = ayovVarArr[i];
            if (ayovVar != null) {
                ayovVar.W(azmfVar.c[i]);
            } else {
                azmfVar.a(new NullPointerException("One of the sources is null"), i);
                return;
            }
        }
    }
}
