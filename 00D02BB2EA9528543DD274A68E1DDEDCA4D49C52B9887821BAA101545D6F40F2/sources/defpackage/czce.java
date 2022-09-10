package defpackage;
/* compiled from: PG */
/* renamed from: czce  reason: default package */
/* loaded from: classes5.dex */
final class czce implements degu<cyli> {
    final /* synthetic */ cytq a;
    final /* synthetic */ dbtp b;
    final /* synthetic */ czch c;

    public czce(czch czchVar, cytq cytqVar, dbtp dbtpVar) {
        this.c = czchVar;
        this.a = cytqVar;
        this.b = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.d(this.c.e, 3, 0L, this.a.k);
        cypg.e(this.c.e, 3, cypj.a(th), 0L, null, this.a.k);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyli cyliVar) {
        cyli cyliVar2 = cyliVar;
        cyph cyphVar = this.c.e;
        cylg cylgVar = cyliVar2.b;
        if (cylgVar == null) {
            cylgVar = cylg.d;
        }
        cypg.d(cyphVar, 3, cylgVar.b, this.a.k);
        cyph cyphVar2 = this.c.e;
        cylg cylgVar2 = cyliVar2.b;
        if (cylgVar2 == null) {
            cylgVar2 = cylg.d;
        }
        cypg.e(cyphVar2, 3, 2, cylgVar2.c, this.b, this.a.k);
    }
}
