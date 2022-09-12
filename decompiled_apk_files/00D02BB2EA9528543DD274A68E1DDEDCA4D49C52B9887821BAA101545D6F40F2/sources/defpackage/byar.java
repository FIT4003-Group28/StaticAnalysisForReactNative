package defpackage;
/* renamed from: byar  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class byar implements dbrn {
    static final dbrn a = new byar();

    private byar() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        bxzs bxzsVar;
        dccx F = dcdc.F();
        for (dlzx dlzxVar : ((dlzy) ((btzx) obj).b()).a) {
            dmam dmamVar = dlzxVar.a;
            if (dmamVar == null) {
                dmamVar = dmam.f;
            }
            if ((dmamVar.a & 8) != 0) {
                dmam dmamVar2 = dlzxVar.a;
                if (dmamVar2 == null) {
                    dmamVar2 = dmam.f;
                }
                String str = dmamVar2.e;
                dmam dmamVar3 = dlzxVar.a;
                if (dmamVar3 == null) {
                    dmamVar3 = dmam.f;
                }
                int a2 = dmaj.a(dmamVar3.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i = a2 - 1;
                if (i == 1) {
                    bxzsVar = bxzs.CONSENT_STATUS_ACCEPTED;
                } else if (i == 2) {
                    bxzsVar = bxzs.CONSENT_STATUS_REJECTED;
                } else {
                    bxzsVar = bxzs.CONSENT_STATUS_UNKNOWN;
                }
                String str2 = dlzxVar.b;
                String str3 = dlzxVar.d;
                douj doujVar = dlzxVar.c;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                F.g(bxzt.f(str, bxzsVar, str2, str3, doujVar));
            }
        }
        return F.f();
    }
}
