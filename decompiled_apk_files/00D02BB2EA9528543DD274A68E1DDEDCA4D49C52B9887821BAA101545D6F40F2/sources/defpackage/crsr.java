package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crsr  reason: default package */
/* loaded from: classes5.dex */
public final class crsr {
    public static dhjx a(@dzsi GmmLocation gmmLocation) {
        dhjw bZ = dhjx.f.bZ();
        dhka bZ2 = dhkb.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhkb dhkbVar = (dhkb) bZ2.b;
        int i = dhkbVar.a | 2;
        dhkbVar.a = i;
        dhkbVar.c = 0.0f;
        dhkbVar.a = i | 4;
        dhkbVar.d = 0.0f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ.b;
        dhkb bK = bZ2.bK();
        bK.getClass();
        dhjxVar.c = bK;
        dhjxVar.a |= 2;
        dhkc bZ3 = dhkd.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ3.b;
        int i2 = dhkdVar.a | 1;
        dhkdVar.a = i2;
        dhkdVar.b = 1000;
        dhkdVar.a = i2 | 2;
        dhkdVar.c = 1000;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ.b;
        dhkd bK2 = bZ3.bK();
        bK2.getClass();
        dhjxVar2.d = bK2;
        dhjxVar2.a |= 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ.b;
        dhjxVar3.a |= 8;
        dhjxVar3.e = 20.0f;
        if (gmmLocation != null) {
            dhjy bZ4 = dhjz.e.bZ();
            double latitude = gmmLocation.getLatitude();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ4.b;
            dhjzVar.a |= 2;
            dhjzVar.c = latitude;
            double longitude = gmmLocation.getLongitude();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ4.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = longitude;
            double altitude = gmmLocation.getAltitude();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhjz dhjzVar3 = (dhjz) bZ4.b;
            dhjzVar3.a |= 4;
            dhjzVar3.d = altitude;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar4 = (dhjx) bZ.b;
            dhjz bK3 = bZ4.bK();
            bK3.getClass();
            dhjxVar4.b = bK3;
            dhjxVar4.a |= 1;
            dhkb dhkbVar2 = ((dhjx) bZ.b).c;
            if (dhkbVar2 == null) {
                dhkbVar2 = dhkb.e;
            }
            dsqp dsqpVar = (dsqp) dhkbVar2.cu(5);
            dsqpVar.bC(dhkbVar2);
            dhka dhkaVar = (dhka) dsqpVar;
            float bearing = gmmLocation.getBearing();
            if (dhkaVar.c) {
                dhkaVar.bF();
                dhkaVar.c = false;
            }
            dhkb dhkbVar3 = (dhkb) dhkaVar.b;
            dhkbVar3.a |= 1;
            dhkbVar3.b = bearing;
            dhkb bK4 = dhkaVar.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar5 = (dhjx) bZ.b;
            bK4.getClass();
            dhjxVar5.c = bK4;
            dhjxVar5.a |= 2;
        }
        return bZ.bK();
    }
}
