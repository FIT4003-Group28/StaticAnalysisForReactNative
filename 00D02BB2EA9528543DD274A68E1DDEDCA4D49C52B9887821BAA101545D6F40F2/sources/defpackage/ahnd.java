package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahnd  reason: default package */
/* loaded from: classes2.dex */
public final class ahnd implements ahnc {
    public final long a;
    private final dtaq b;
    private final dcvs c;
    private final float d;

    public ahnd(dtaq dtaqVar) {
        this.b = dtaqVar;
        dtak dtakVar = dtaqVar.e;
        int i = (dtakVar == null ? dtak.d : dtakVar).b;
        dtak dtakVar2 = dtaqVar.e;
        this.c = dcvs.c(i, (dtakVar2 == null ? dtak.d : dtakVar2).c);
        this.d = dtaqVar.g / 1000.0f;
        this.a = (dtaqVar.a & 4) != 0 ? TimeUnit.MICROSECONDS.toMillis(dtaqVar.d) : -1L;
    }

    @Override // defpackage.ahnc
    public final dtaq a() {
        return this.b;
    }

    @Override // defpackage.ahnc
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ahnc
    public final boolean c() {
        return (this.b.a & 4) != 0;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ahnc
    public final float getAccuracy() {
        return this.d;
    }

    @Override // defpackage.ahnc
    public final double getLatitude() {
        return this.c.g();
    }

    @Override // defpackage.ahnc
    public final double getLongitude() {
        return this.c.i();
    }

    @Override // defpackage.ahnc
    public final long getTime() {
        return this.a;
    }
}
