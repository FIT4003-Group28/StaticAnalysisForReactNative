package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
/* compiled from: PG */
/* renamed from: ahmt  reason: default package */
/* loaded from: classes2.dex */
public final class ahmt implements ahnc {
    private final ahnc a;

    public ahmt(ahnc ahncVar) {
        this.a = ahncVar;
    }

    @Override // defpackage.ahnc
    public final dtaq a() {
        dtaq a = this.a.a();
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dtap dtapVar = (dtap) dsqpVar;
        if (dtapVar.c) {
            dtapVar.bF();
            dtapVar.c = false;
        }
        dtaq dtaqVar = (dtaq) dtapVar.b;
        dtaq dtaqVar2 = dtaq.m;
        dtaqVar.b = 4;
        dtaqVar.a |= 1;
        dtaq dtaqVar3 = (dtaq) dtapVar.b;
        dtaqVar3.c = 58;
        dtaqVar3.a |= 2;
        return dtapVar.bK();
    }

    @Override // defpackage.ahnc
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ahnc
    public final boolean c() {
        return ((DeviceLocation) this.a).c;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ahnc
    public final float getAccuracy() {
        return this.a.getAccuracy();
    }

    @Override // defpackage.ahnc
    public final double getLatitude() {
        return this.a.getLatitude();
    }

    @Override // defpackage.ahnc
    public final double getLongitude() {
        return this.a.getLongitude();
    }

    @Override // defpackage.ahnc
    public final long getTime() {
        return this.a.getTime();
    }
}
