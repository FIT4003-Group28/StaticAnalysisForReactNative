package defpackage;
/* renamed from: doo  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class doo implements dbrn {
    static final dbrn a = new doo();

    private doo() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dsw dswVar = (dsw) obj;
        dsqp dsqpVar = (dsqp) dswVar.cu(5);
        dsqpVar.bC(dswVar);
        dsv dsvVar = (dsv) dsqpVar;
        if (dsvVar.c) {
            dsvVar.bF();
            dsvVar.c = false;
        }
        dsw dswVar2 = (dsw) dsvVar.b;
        dsw dswVar3 = dsw.d;
        dswVar2.a |= 1;
        dswVar2.b = true;
        return dsvVar.bK();
    }
}
