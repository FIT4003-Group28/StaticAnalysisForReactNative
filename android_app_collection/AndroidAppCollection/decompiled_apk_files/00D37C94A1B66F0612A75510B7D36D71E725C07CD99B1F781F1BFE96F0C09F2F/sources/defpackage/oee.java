package defpackage;
/* compiled from: PG */
/* renamed from: oee  reason: default package */
/* loaded from: classes3.dex */
final class oee implements zas {
    final /* synthetic */ nml a;
    final /* synthetic */ oeg b;
    final /* synthetic */ yye c;

    public oee(oeg oegVar, yye yyeVar, nml nmlVar) {
        this.b = oegVar;
        this.c = yyeVar;
        this.a = nmlVar;
    }

    @Override // defpackage.zas
    public final void nH(int i, yye yyeVar) {
        if (i == 2 || i == 0) {
            yyeVar.j(this);
            oeg oegVar = this.b;
            oegVar.i(oegVar.f, false, null);
        }
        if (yyeVar == this.c && i == 2) {
            this.a.k();
        }
    }
}
