package defpackage;
/* renamed from: ddd  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ddd implements dbrn {
    static final dbrn a = new ddd();

    private ddd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        ddx ddxVar = (ddx) obj;
        dsqp dsqpVar = (dsqp) ddxVar.cu(5);
        dsqpVar.bC(ddxVar);
        ddw ddwVar = (ddw) dsqpVar;
        if (ddwVar.c) {
            ddwVar.bF();
            ddwVar.c = false;
        }
        ddx ddxVar2 = (ddx) ddwVar.b;
        ddx ddxVar3 = ddx.e;
        ddxVar2.a |= 4;
        ddxVar2.d = true;
        return ddwVar.bK();
    }
}
