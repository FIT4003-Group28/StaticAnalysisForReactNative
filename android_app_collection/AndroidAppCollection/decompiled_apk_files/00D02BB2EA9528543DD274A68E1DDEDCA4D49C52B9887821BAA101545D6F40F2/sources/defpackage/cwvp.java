package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: cwvp  reason: default package */
/* loaded from: classes5.dex */
final class cwvp extends cwvr<HealthStats, dzyk> {
    public static final cwvp a = new cwvp();

    private cwvp() {
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ String a(dzyk dzykVar) {
        dzyi dzyiVar = dzykVar.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        return dzyiVar.c;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyk b(dzyk dzykVar, dzyk dzykVar2) {
        dzyk dzykVar3 = dzykVar;
        dzyk dzykVar4 = dzykVar2;
        if (dzykVar3 == null || dzykVar4 == null) {
            return dzykVar3;
        }
        dzyj bZ = dzyk.e.bZ();
        bZ.a(cwvs.a.d(dzykVar3.b, dzykVar4.b));
        bZ.b(cwvo.a.d(dzykVar3.c, dzykVar4.c));
        dzyi dzyiVar = dzykVar3.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyk dzykVar5 = (dzyk) bZ.b;
        dzyiVar.getClass();
        dzykVar5.d = dzyiVar;
        dzykVar5.a |= 1;
        dzyk bK = bZ.bK();
        if (!cwvu.e(bK)) {
            return bK;
        }
        return null;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyk c(String str, HealthStats healthStats) {
        HealthStats healthStats2 = healthStats;
        dzyj bZ = dzyk.e.bZ();
        bZ.a(cwvs.a.e(cwvu.l(healthStats2, 40001)));
        bZ.b(cwvo.a.e((healthStats2 == null || !healthStats2.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats2.getMeasurements(40002)));
        if (str != null) {
            dzyi a2 = cwvu.a(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyk dzykVar = (dzyk) bZ.b;
            a2.getClass();
            dzykVar.d = a2;
            dzykVar.a |= 1;
        }
        dzyk bK = bZ.bK();
        if (cwvu.e(bK)) {
            return null;
        }
        return bK;
    }
}
