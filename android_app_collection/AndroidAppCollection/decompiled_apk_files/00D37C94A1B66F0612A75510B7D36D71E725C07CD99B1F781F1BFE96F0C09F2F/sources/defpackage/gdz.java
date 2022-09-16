package defpackage;
/* compiled from: PG */
/* renamed from: gdz  reason: default package */
/* loaded from: classes3.dex */
final class gdz implements afzf {
    final /* synthetic */ gea a;
    private final /* synthetic */ int b;

    public gdz(gea geaVar) {
        this.a = geaVar;
    }

    public gdz(gea geaVar, int i) {
        this.b = i;
        this.a = geaVar;
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (this.b == 0) {
            zep.d("Error flagging", cffVar);
            this.a.c.e(cffVar);
            return;
        }
        zep.d("Error creating playlist", cffVar);
        this.a.c.e(cffVar);
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        if (this.b == 0) {
            arrz arrzVar = (arrz) obj;
            if (arrzVar.g.size() == 0) {
                return;
            }
            this.a.e.d(arrzVar.g, null);
            return;
        }
        asay asayVar = (asay) obj;
        this.a.d.f(new gdp());
        if (asayVar.c.size() == 0) {
            return;
        }
        this.a.e.d(asayVar.c, null);
    }
}
