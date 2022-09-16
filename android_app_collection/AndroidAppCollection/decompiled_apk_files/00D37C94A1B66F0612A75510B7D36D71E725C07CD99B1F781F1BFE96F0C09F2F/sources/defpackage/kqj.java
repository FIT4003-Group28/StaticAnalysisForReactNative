package defpackage;
/* compiled from: PG */
/* renamed from: kqj  reason: default package */
/* loaded from: classes3.dex */
final class kqj implements afzf {
    final /* synthetic */ kqk a;

    public kqj(kqk kqkVar) {
        this.a = kqkVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error creating playlist", cffVar);
        this.a.aj.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asay asayVar = (asay) obj;
        this.a.ak.f(new gdp());
        if (asayVar.c.size() != 0) {
            this.a.ae.b(asayVar.c);
        }
    }
}
