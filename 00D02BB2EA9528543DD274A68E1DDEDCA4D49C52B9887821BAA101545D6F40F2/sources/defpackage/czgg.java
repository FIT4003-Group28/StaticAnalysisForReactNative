package defpackage;
/* compiled from: PG */
/* renamed from: czgg  reason: default package */
/* loaded from: classes5.dex */
final class czgg implements degu<cyli> {
    final /* synthetic */ cyor a;
    final /* synthetic */ dbtp b;
    final /* synthetic */ czgk c;

    public czgg(czgk czgkVar, cyor cyorVar, dbtp dbtpVar) {
        this.c = czgkVar;
        this.a = cyorVar;
        this.b = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.d(this.c.h, 5, 0L, this.a);
        cypg.e(this.c.h, 5, cypj.a(th), 0L, null, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyli cyliVar) {
        cyli cyliVar2 = cyliVar;
        cyph cyphVar = this.c.h;
        cylg cylgVar = cyliVar2.b;
        if (cylgVar == null) {
            cylgVar = cylg.d;
        }
        cypg.d(cyphVar, 5, cylgVar.b, this.a);
        cyph cyphVar2 = this.c.h;
        cylg cylgVar2 = cyliVar2.b;
        if (cylgVar2 == null) {
            cylgVar2 = cylg.d;
        }
        cypg.e(cyphVar2, 5, 2, cylgVar2.c, this.b, this.a);
    }
}
