package defpackage;
/* renamed from: cind  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cind implements dbrn {
    static final dbrn a = new cind();

    private cind() {
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
        chxpVar2.a |= 2;
        chxpVar2.d = true;
        return chxmVar.bK();
    }
}
