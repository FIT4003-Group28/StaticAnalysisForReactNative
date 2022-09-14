package defpackage;

import android.location.GnssStatus;
/* compiled from: PG */
/* renamed from: ahst  reason: default package */
/* loaded from: classes2.dex */
final class ahst extends GnssStatus.Callback {
    final /* synthetic */ ahsv a;
    private int b = 0;

    public ahst(ahsv ahsvVar) {
        this.a = ahsvVar;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        int satelliteCount = gnssStatus.getSatelliteCount();
        boolean z = false;
        float f = -1.0f;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < satelliteCount; i3++) {
            if (gnssStatus.usedInFix(i3)) {
                i2++;
            }
            float cn0DbHz = gnssStatus.getCn0DbHz(i3);
            if (cn0DbHz > 22.0f) {
                i++;
            }
            if (f < cn0DbHz) {
                f = cn0DbHz;
            }
        }
        if (i < 5 || i2 != 0) {
            this.b = 0;
        } else {
            int i4 = this.b + 1;
            this.b = i4;
            if (i4 > 100) {
                int i5 = ahsv.d;
                this.b = 0;
            }
            i2 = 0;
        }
        long e = this.a.b.e();
        ahsv ahsvVar = this.a;
        if (e - ahsvVar.c < 2000) {
            z = true;
        }
        ahsu ahsuVar = ahsvVar.a;
        if (i2 != 0) {
            i = i2;
        }
        ahsuVar.a(i, f, z);
    }
}
