package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahmv  reason: default package */
/* loaded from: classes2.dex */
public final class ahmv implements ahnc {
    public final dtap a;

    public ahmv(dtaq dtaqVar) {
        dsqp dsqpVar = (dsqp) dtaqVar.cu(5);
        dsqpVar.bC(dtaqVar);
        this.a = (dtap) dsqpVar;
    }

    @Override // defpackage.ahnc
    public final dtaq a() {
        return this.a.bK();
    }

    @Override // defpackage.ahnc
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ahnc
    public final boolean c() {
        return (((dtaq) this.a.b).a & 4) != 0;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ahnc
    public final float getAccuracy() {
        return ((dtaq) this.a.b).g / 1000.0f;
    }

    @Override // defpackage.ahnc
    public final double getLatitude() {
        dtak dtakVar = ((dtaq) this.a.b).e;
        if (dtakVar == null) {
            dtakVar = dtak.d;
        }
        double d = dtakVar.b;
        Double.isNaN(d);
        return d * 1.0E-7d;
    }

    @Override // defpackage.ahnc
    public final double getLongitude() {
        dtak dtakVar = ((dtaq) this.a.b).e;
        if (dtakVar == null) {
            dtakVar = dtak.d;
        }
        double d = dtakVar.c;
        Double.isNaN(d);
        return d * 1.0E-7d;
    }

    @Override // defpackage.ahnc
    public final long getTime() {
        return TimeUnit.MICROSECONDS.toMillis(((dtaq) this.a.b).d);
    }
}
