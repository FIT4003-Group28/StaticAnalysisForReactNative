package defpackage;
/* renamed from: bswv  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bswv implements bszo {
    static final bszo a = new bswv();

    private bswv() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        arky arkyVar = (arky) dssiVar;
        Boolean bool = (Boolean) obj;
        arkx arkxVar = ((arkz) arkyVar.b).b;
        if (arkxVar == null) {
            arkxVar = arkx.g;
        }
        dsqp dsqpVar = (dsqp) arkxVar.cu(5);
        dsqpVar.bC(arkxVar);
        arkw arkwVar = (arkw) dsqpVar;
        boolean booleanValue = bool.booleanValue();
        if (arkwVar.c) {
            arkwVar.bF();
            arkwVar.c = false;
        }
        arkx arkxVar2 = (arkx) arkwVar.b;
        arkxVar2.a |= 8;
        arkxVar2.d = booleanValue;
        if (arkyVar.c) {
            arkyVar.bF();
            arkyVar.c = false;
        }
        arkz arkzVar = (arkz) arkyVar.b;
        arkx bK = arkwVar.bK();
        bK.getClass();
        arkzVar.b = bK;
        arkzVar.a |= 1;
    }
}
