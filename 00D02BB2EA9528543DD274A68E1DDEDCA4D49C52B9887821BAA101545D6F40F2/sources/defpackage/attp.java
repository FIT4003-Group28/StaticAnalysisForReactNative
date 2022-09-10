package defpackage;
/* compiled from: PG */
/* renamed from: attp  reason: default package */
/* loaded from: classes2.dex */
final class attp implements asxv {
    final /* synthetic */ attr a;

    public attp(attr attrVar) {
        this.a = attrVar;
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        bvrj.UI_THREAD.c();
        if (!aszmVar.b() || ((crqb) this.a.e).g != 3) {
            return;
        }
        dcdc<crqg> dcdcVar = aszmVar.l.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            crqg crqgVar = dcdcVar.get(i);
            i++;
            if (crqgVar.a.equals(this.a.i().a)) {
                attr attrVar = this.a;
                attrVar.d = crqgVar;
                attrVar.g();
                cqkx.p(this.a);
                return;
            }
        }
    }
}
