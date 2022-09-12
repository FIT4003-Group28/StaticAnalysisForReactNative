package defpackage;
/* compiled from: PG */
/* renamed from: ssh  reason: default package */
/* loaded from: classes7.dex */
abstract class ssh implements ahnc {
    @Override // defpackage.ahnc
    public final dtaq a() {
        dtap bZ = dtaq.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtaq dtaqVar = (dtaq) bZ.b;
        dtaqVar.b = 4;
        dtaqVar.a |= 1;
        dtaq dtaqVar2 = (dtaq) bZ.b;
        dtaqVar2.c = 55;
        dtaqVar2.a |= 2;
        dtaj bZ2 = dtak.d.bZ();
        int latitude = (int) (getLatitude() * 1.0E7d);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtak dtakVar = (dtak) bZ2.b;
        dtakVar.a |= 1;
        dtakVar.b = latitude;
        int longitude = (int) (getLongitude() * 1.0E7d);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtak dtakVar2 = (dtak) bZ2.b;
        dtakVar2.a |= 2;
        dtakVar2.c = longitude;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtaq dtaqVar3 = (dtaq) bZ.b;
        dtak bK = bZ2.bK();
        bK.getClass();
        dtaqVar3.e = bK;
        dtaqVar3.a |= 16;
        return bZ.bK();
    }

    @Override // defpackage.ahnc
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ahnc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ahnc
    public final float getAccuracy() {
        return 0.0f;
    }

    @Override // defpackage.ahnc
    public abstract double getLatitude();

    @Override // defpackage.ahnc
    public abstract double getLongitude();

    @Override // defpackage.ahnc
    public final long getTime() {
        return 0L;
    }
}
