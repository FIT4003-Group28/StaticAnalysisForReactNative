package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqkv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bqkv implements dbrn {
    static final dbrn a = new bqkv();

    private bqkv() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        eapy eapyVar = (eapy) obj;
        drft bZ = drfu.c.bZ();
        dpoi bZ2 = dpoj.e.bZ();
        int l = eapyVar.l();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpoj dpojVar = (dpoj) bZ2.b;
        dpojVar.a |= 1;
        dpojVar.b = l;
        int m = eapyVar.m();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpoj dpojVar2 = (dpoj) bZ2.b;
        int i = dpojVar2.a | 2;
        dpojVar2.a = i;
        dpojVar2.c = m;
        dpojVar2.a = i | 4;
        dpojVar2.d = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drfu drfuVar = (drfu) bZ.b;
        dpoj bK = bZ2.bK();
        bK.getClass();
        drfuVar.b = bK;
        drfuVar.a |= 1;
        return bZ.bK();
    }
}
