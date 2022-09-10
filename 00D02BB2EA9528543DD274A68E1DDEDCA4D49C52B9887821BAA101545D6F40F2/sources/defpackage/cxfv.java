package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
/* compiled from: PG */
/* renamed from: cxfv  reason: default package */
/* loaded from: classes.dex */
public final class cxfv extends cxgb {
    private final Context a;
    private final cxfs b;
    private final ClearcutMetricSnapshotTransmitter c;

    public cxfv(Context context, cxfs cxfsVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.b = cxfsVar;
        this.c = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.cxgb
    protected final void b(eacd eacdVar) {
        cxfk cxfkVar = (cxfk) cxfl.c.bZ();
        if (cxfkVar.c) {
            cxfkVar.bF();
            cxfkVar.c = false;
        }
        cxfl cxflVar = (cxfl) cxfkVar.b;
        eacdVar.getClass();
        cxflVar.b = eacdVar;
        cxflVar.a |= 1;
        cxfs cxfsVar = this.b;
        cxfq bZ = cxfr.g.bZ();
        String str = cxfsVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cxfr cxfrVar = (cxfr) bZ.b;
        str.getClass();
        int i = cxfrVar.a | 1;
        cxfrVar.a = i;
        cxfrVar.b = str;
        String str2 = cxfsVar.a;
        str2.getClass();
        int i2 = i | 2;
        cxfrVar.a = i2;
        cxfrVar.c = str2;
        boolean z = cxfsVar.e;
        cxfrVar.a = i2 | 4;
        cxfrVar.d = z;
        String a = cxfsVar.c.a();
        if (!dbsj.d(a)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cxfr cxfrVar2 = (cxfr) bZ.b;
            a.getClass();
            cxfrVar2.a |= 8;
            cxfrVar2.e = a;
        }
        try {
            String a2 = cxfsVar.b.a();
            if (a2 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cxfr cxfrVar3 = (cxfr) bZ.b;
                a2.getClass();
                cxfrVar3.a |= 16;
                cxfrVar3.f = a2;
            }
        } catch (RuntimeException unused) {
        }
        cxfkVar.k(cxfr.h, bZ.bK());
        deha.q(this.c.a(this.a, (cxfl) cxfkVar.bK()), new cxft(), dege.a);
    }
}
