package defpackage;
/* compiled from: PG */
/* renamed from: abgx  reason: default package */
/* loaded from: classes.dex */
final class abgx implements afzf {
    final /* synthetic */ avtc a;
    final /* synthetic */ abgy b;
    final /* synthetic */ aysm c;

    public abgx(abgy abgyVar, avtc avtcVar, aysm aysmVar) {
        this.b = abgyVar;
        this.a = avtcVar;
        this.c = aysmVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        aafo aafoVar = this.b.b;
        apzg apzgVar = this.a.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
        this.c.c(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arve arveVar = (arve) obj;
        this.c.a();
    }
}
