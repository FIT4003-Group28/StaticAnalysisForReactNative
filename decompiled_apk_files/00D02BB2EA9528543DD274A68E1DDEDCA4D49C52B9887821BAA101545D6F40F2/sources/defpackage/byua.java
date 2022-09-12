package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* JADX WARN: Init of enum h can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* compiled from: PG */
/* renamed from: byua  reason: default package */
/* loaded from: classes4.dex */
public enum byua {
    UNKNOWN(r1.d()),
    NEW_YORK(r2.d()),
    LONDON(r4.d()),
    NEW_DELHI(r6.d()),
    TOKYO(r8.d()),
    SYDNEY(r10.d()),
    JAKARTA(r12.d()),
    RIO_DE_JANEIRO(r8.d()),
    MUMBAI(r12.d());
    
    public final GmmLocation j;

    static {
        new amvs().v(dcyn.a, dcyn.a);
        new amvs().v(40.748817d, -73.985428d);
        new amvs().v(51.509865d, -0.118092d);
        new amvs().v(28.6448d, 77.216721d);
        new amvs().v(35.652832d, 139.839478d);
        new amvs().v(-33.865143d, 151.2099d);
        new amvs().v(-6.21462d, 106.84513d);
        new amvs().v(-22.90278d, -43.2075d);
        new amvs().v(19.195985d, 72.900424d);
    }

    byua(GmmLocation gmmLocation) {
        this.j = gmmLocation;
    }
}
