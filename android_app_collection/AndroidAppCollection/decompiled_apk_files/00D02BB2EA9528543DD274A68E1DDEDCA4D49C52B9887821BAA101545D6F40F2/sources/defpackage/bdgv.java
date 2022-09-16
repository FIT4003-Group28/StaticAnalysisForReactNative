package defpackage;
/* compiled from: PG */
/* renamed from: bdgv  reason: default package */
/* loaded from: classes3.dex */
public final class bdgv extends cknx {
    private final boolean a;

    public bdgv() {
        this.a = false;
    }

    public bdgv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cknx
    public final dwge a(akqi akqiVar, int i, String str, int i2, int i3) {
        dwfy bZ = dwge.m.bZ();
        h(bZ, akqiVar);
        dwfs bZ2 = dwfv.m.bZ();
        f(bZ2, false);
        dwev bZ3 = dwew.e.bZ();
        l(bZ3, dgge.MEDIA_GUESSABLE_FIFE, dggc.PHOTO, false);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ2.b;
        dwew bK = bZ3.bK();
        bK.getClass();
        dwfvVar.b = bK;
        dwfvVar.a |= 1;
        j(bZ2, 20, str);
        n(bZ2, i2, i3);
        if (this.a) {
            dwex bZ4 = dwey.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dwey.c((dwey) bZ4.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwfv dwfvVar2 = (dwfv) bZ2.b;
            dwey bK2 = bZ4.bK();
            bK2.getClass();
            dwfvVar2.g = bK2;
            dwfvVar2.a |= 64;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar = (dwge) bZ.b;
        dwfv bK3 = bZ2.bK();
        bK3.getClass();
        dwgeVar.h = bK3;
        dwgeVar.a |= 128;
        return bZ.bK();
    }

    @Override // defpackage.cknx
    public final int b(@dzsi ilo iloVar) {
        return 1;
    }
}
