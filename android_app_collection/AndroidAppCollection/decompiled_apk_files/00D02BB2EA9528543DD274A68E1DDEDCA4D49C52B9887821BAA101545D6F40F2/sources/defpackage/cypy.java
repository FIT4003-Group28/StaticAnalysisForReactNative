package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cypy  reason: default package */
/* loaded from: classes5.dex */
final class cypy implements degu<cylk> {
    final /* synthetic */ List a;
    final /* synthetic */ dbtp b;
    final /* synthetic */ cyqa c;

    public cypy(cyqa cyqaVar, List list, dbtp dbtpVar) {
        this.c = cyqaVar;
        this.a = list;
        this.b = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.f.keySet().removeAll(this.a);
        cypg.d(this.c.d, 15, 0L, cyor.a);
        cypg.e(this.c.d, 15, cypj.a(th), 0L, null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cylk cylkVar) {
        cylk cylkVar2 = cylkVar;
        this.c.f.keySet().removeAll(this.a);
        cyph cyphVar = this.c.d;
        cylg cylgVar = cylkVar2.b;
        if (cylgVar == null) {
            cylgVar = cylg.d;
        }
        cypg.d(cyphVar, 15, cylgVar.b, cyor.a);
        cyph cyphVar2 = this.c.d;
        cylg cylgVar2 = cylkVar2.b;
        if (cylgVar2 == null) {
            cylgVar2 = cylg.d;
        }
        cypg.e(cyphVar2, 15, 2, cylgVar2.c, this.b, cyor.a);
    }
}
