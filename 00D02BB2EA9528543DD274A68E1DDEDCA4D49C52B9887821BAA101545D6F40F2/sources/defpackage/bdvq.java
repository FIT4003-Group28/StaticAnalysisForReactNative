package defpackage;
/* compiled from: PG */
/* renamed from: bdvq  reason: default package */
/* loaded from: classes3.dex */
public final class bdvq extends cknx {
    private final boolean a;

    public bdvq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cknx
    public final dwge a(akqi akqiVar, int i, String str, int i2, int i3) {
        dwfy bZ = dwge.m.bZ();
        h(bZ, akqiVar);
        dwfs d = d(true, true, this.a);
        j(d, 20, str);
        n(d, i2, i3);
        dwex bZ2 = dwey.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwey.c((dwey) bZ2.b);
        if (d.c) {
            d.bF();
            d.c = false;
        }
        dwfv dwfvVar = (dwfv) d.b;
        dwey bK = bZ2.bK();
        dwfv dwfvVar2 = dwfv.m;
        bK.getClass();
        dwfvVar.g = bK;
        dwfvVar.a |= 64;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar = (dwge) bZ.b;
        dwfv bK2 = d.bK();
        bK2.getClass();
        dwgeVar.h = bK2;
        dwgeVar.a |= 128;
        return bZ.bK();
    }

    @Override // defpackage.cknx
    public final int b(@dzsi ilo iloVar) {
        return iloVar.aJ();
    }
}
