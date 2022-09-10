package defpackage;
/* compiled from: PG */
/* renamed from: bxi  reason: default package */
/* loaded from: classes4.dex */
final class bxi implements bui<Object> {
    final /* synthetic */ cao a;
    final /* synthetic */ bxj b;

    public bxi(bxj bxjVar, cao caoVar) {
        this.b = bxjVar;
        this.a = caoVar;
    }

    @Override // defpackage.bui
    public final void f(Object obj) {
        if (this.b.f(this.a)) {
            bxj bxjVar = this.b;
            cao caoVar = this.a;
            bwe bweVar = bxjVar.a.o;
            if (obj == null || !bweVar.c(caoVar.c.e())) {
                bvs bvsVar = bxjVar.b;
                btw btwVar = caoVar.a;
                buj<Data> bujVar = caoVar.c;
                bvsVar.d(btwVar, obj, bujVar, bujVar.e(), bxjVar.d);
                return;
            }
            bxjVar.c = obj;
            bxjVar.b.c();
        }
    }

    @Override // defpackage.bui
    public final void g(Exception exc) {
        if (this.b.f(this.a)) {
            bxj bxjVar = this.b;
            cao caoVar = this.a;
            bvs bvsVar = bxjVar.b;
            btw btwVar = bxjVar.d;
            buj<Data> bujVar = caoVar.c;
            bvsVar.e(btwVar, exc, bujVar, bujVar.e());
        }
    }
}
