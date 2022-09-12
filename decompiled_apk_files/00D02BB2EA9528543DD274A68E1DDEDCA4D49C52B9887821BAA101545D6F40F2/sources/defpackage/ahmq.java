package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: ahmq  reason: default package */
/* loaded from: classes2.dex */
public final class ahmq {
    public static dtap a(Location location) {
        dtap bZ = dtaq.m.bZ();
        dtaj bZ2 = dtak.d.bZ();
        int latitude = (int) (location.getLatitude() * 1.0E7d);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtak dtakVar = (dtak) bZ2.b;
        dtakVar.a |= 1;
        dtakVar.b = latitude;
        int longitude = (int) (location.getLongitude() * 1.0E7d);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtak dtakVar2 = (dtak) bZ2.b;
        dtakVar2.a |= 2;
        dtakVar2.c = longitude;
        dtak bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtaq dtaqVar = (dtaq) bZ.b;
        bK.getClass();
        dtaqVar.e = bK;
        dtaqVar.a |= 16;
        float accuracy = location.getAccuracy();
        if (accuracy > 0.0f) {
            float f = accuracy * 1000.0f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtaq dtaqVar2 = (dtaq) bZ.b;
            dtaqVar2.a |= 128;
            dtaqVar2.g = f;
        }
        return bZ;
    }
}
