package defpackage;
/* renamed from: cije  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cije implements dbrn {
    static final dbrn a = new cije();

    private cije() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        chxp chxpVar = (chxp) obj;
        dsqp dsqpVar = (dsqp) chxpVar.cu(5);
        dsqpVar.bC(chxpVar);
        chxm chxmVar = (chxm) dsqpVar;
        if (chxmVar.c) {
            chxmVar.bF();
            chxmVar.c = false;
        }
        chxp chxpVar2 = (chxp) chxmVar.b;
        chxp chxpVar3 = chxp.k;
        chxpVar2.a |= 32;
        chxpVar2.i = true;
        return chxmVar.bK();
    }
}
