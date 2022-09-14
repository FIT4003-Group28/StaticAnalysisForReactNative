package defpackage;
/* compiled from: PG */
/* renamed from: byah  reason: default package */
/* loaded from: classes4.dex */
public final class byah extends byap<dlzm, dlzs> {
    public byah(String str, bvrb bvrbVar, dzsj dzsjVar, dlzm dlzmVar, ckhe ckheVar) {
        super(str, bvrbVar, dzsjVar, dlzmVar, ckheVar);
    }

    @Override // defpackage.byap
    @dzsi
    public final btys a() {
        btyr bZ = btys.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar = (btys) bZ.b;
        btysVar.a |= 2;
        btysVar.c = 1;
        return bZ.bK();
    }

    @Override // defpackage.byap
    public final /* bridge */ /* synthetic */ dmag b(dlzm dlzmVar) {
        dmag dmagVar = dlzmVar.b;
        return dmagVar == null ? dmag.d : dmagVar;
    }

    @Override // defpackage.byap
    public final /* bridge */ /* synthetic */ dlzm c(dlzm dlzmVar, dmaf dmafVar) {
        dlzm dlzmVar2 = dlzmVar;
        dsqp dsqpVar = (dsqp) dlzmVar2.cu(5);
        dsqpVar.bC(dlzmVar2);
        dlzj dlzjVar = (dlzj) dsqpVar;
        if (dlzjVar.c) {
            dlzjVar.bF();
            dlzjVar.c = false;
        }
        dlzm dlzmVar3 = (dlzm) dlzjVar.b;
        dmag bK = dmafVar.bK();
        dlzm dlzmVar4 = dlzm.e;
        bK.getClass();
        dlzmVar3.b = bK;
        dlzmVar3.a |= 4;
        return dlzjVar.bK();
    }
}
