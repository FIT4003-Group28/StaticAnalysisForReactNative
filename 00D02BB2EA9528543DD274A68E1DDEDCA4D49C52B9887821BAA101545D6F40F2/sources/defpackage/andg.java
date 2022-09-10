package defpackage;
/* compiled from: PG */
/* renamed from: andg  reason: default package */
/* loaded from: classes2.dex */
public final class andg implements aneg {
    public final /* synthetic */ andm a;

    public andg(andm andmVar) {
        this.a = andmVar;
    }

    @Override // defpackage.aneg
    public final void a(@dzsi ilo iloVar) {
        andm andmVar = this.a;
        if (!andmVar.aD) {
            return;
        }
        if (iloVar != null) {
            andmVar.Nw(iloVar);
        } else {
            akqq q = andmVar.q();
            if (q == null) {
                return;
            }
            ily ilyVar = new ily();
            ilyVar.q(q);
            ilyVar.g = true;
            ilyVar.f = false;
            andmVar.Nw(ilyVar.d());
        }
        andmVar.Nz(null);
        andmVar.aJ();
    }
}
