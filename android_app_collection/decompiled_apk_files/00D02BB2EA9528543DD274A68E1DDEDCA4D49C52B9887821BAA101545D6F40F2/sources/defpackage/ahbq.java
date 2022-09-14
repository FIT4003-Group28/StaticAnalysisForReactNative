package defpackage;
/* renamed from: ahbq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ahbq implements dbrn {
    static final dbrn a = new ahbq();

    private ahbq() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dkzo dkzoVar = (dkzo) obj;
        dsqp dsqpVar = (dsqp) dkzoVar.cu(5);
        dsqpVar.bC(dkzoVar);
        dkzm dkzmVar = (dkzm) dsqpVar;
        if (dkzmVar.c) {
            dkzmVar.bF();
            dkzmVar.c = false;
        }
        dkzo dkzoVar2 = (dkzo) dkzmVar.b;
        dkzo dkzoVar3 = dkzo.d;
        dkzoVar2.b = 1;
        dkzoVar2.a = 1 | dkzoVar2.a;
        return dkzmVar.bK();
    }
}
