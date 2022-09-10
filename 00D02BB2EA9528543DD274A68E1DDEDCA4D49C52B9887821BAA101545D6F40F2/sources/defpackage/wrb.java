package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wrb  reason: default package */
/* loaded from: classes7.dex */
public final class wrb extends akvn<aktd> {
    final /* synthetic */ akqi a;
    final /* synthetic */ wrc b;

    public wrb(wrc wrcVar, akqi akqiVar) {
        this.b = wrcVar;
        this.a = akqiVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aktd aktdVar = (aktd) obj;
        dnqg bZ = dnqh.p.bZ();
        ddxw bZ2 = ddxx.j.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ2.b;
        ddxxVar.a |= 8;
        ddxxVar.d = 5210;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        ddxx bK = bZ2.bK();
        bK.getClass();
        dnqhVar.f = bK;
        dnqhVar.a |= 16;
        dbsg<cjqm> g = aktdVar.g();
        if (g.a()) {
            dbsg<String> a = g.b().a();
            if (a.a()) {
                String b = a.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                b.getClass();
                dnqhVar2.a |= 4;
                dnqhVar2.d = b;
            }
        }
        qdf o = qdg.o();
        qaw qawVar = (qaw) o;
        qawVar.b = this.a.o();
        qawVar.h = bZ.bK();
        this.b.a.a().t(o.h());
    }
}
