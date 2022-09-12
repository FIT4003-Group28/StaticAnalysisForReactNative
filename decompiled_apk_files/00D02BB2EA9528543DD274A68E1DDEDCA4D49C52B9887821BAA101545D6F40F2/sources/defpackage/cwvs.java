package defpackage;

import android.os.health.HealthStats;
/* compiled from: PG */
/* renamed from: cwvs  reason: default package */
/* loaded from: classes5.dex */
final class cwvs extends cwvr<HealthStats, dzyq> {
    public static final cwvs a = new cwvs();

    private cwvs() {
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ String a(dzyq dzyqVar) {
        dzyi dzyiVar = dzyqVar.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        return dzyiVar.c;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyq b(dzyq dzyqVar, dzyq dzyqVar2) {
        int i;
        int i2;
        dzyq dzyqVar3 = dzyqVar;
        dzyq dzyqVar4 = dzyqVar2;
        if (dzyqVar3 == null || dzyqVar4 == null) {
            return dzyqVar3;
        }
        dzyp bZ = dzyq.e.bZ();
        if ((dzyqVar3.a & 1) != 0 && (i2 = dzyqVar3.b - dzyqVar4.b) != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyq dzyqVar5 = (dzyq) bZ.b;
            dzyqVar5.a |= 1;
            dzyqVar5.b = i2;
        }
        if ((dzyqVar3.a & 2) != 0 && (i = dzyqVar3.c - dzyqVar4.c) != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyq dzyqVar6 = (dzyq) bZ.b;
            dzyqVar6.a |= 2;
            dzyqVar6.c = i;
        }
        dzyi dzyiVar = dzyqVar3.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyq dzyqVar7 = (dzyq) bZ.b;
        dzyiVar.getClass();
        dzyqVar7.d = dzyiVar;
        dzyqVar7.a |= 4;
        dzyq bK = bZ.bK();
        if (!cwvu.f(bK)) {
            return bK;
        }
        return null;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyq c(String str, HealthStats healthStats) {
        HealthStats healthStats2 = healthStats;
        dzyp bZ = dzyq.e.bZ();
        int i = (int) cwvu.i(healthStats2, 50001);
        if (i != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyq dzyqVar = (dzyq) bZ.b;
            dzyqVar.a |= 1;
            dzyqVar.b = i;
        }
        int i2 = (int) cwvu.i(healthStats2, 50002);
        if (i2 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyq dzyqVar2 = (dzyq) bZ.b;
            dzyqVar2.a |= 2;
            dzyqVar2.c = i2;
        }
        if (str != null) {
            dzyi a2 = cwvu.a(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyq dzyqVar3 = (dzyq) bZ.b;
            a2.getClass();
            dzyqVar3.d = a2;
            dzyqVar3.a |= 4;
        }
        dzyq bK = bZ.bK();
        if (cwvu.f(bK)) {
            return null;
        }
        return bK;
    }
}
