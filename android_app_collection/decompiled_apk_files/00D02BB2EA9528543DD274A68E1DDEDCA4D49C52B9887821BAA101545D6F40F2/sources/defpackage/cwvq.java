package defpackage;

import android.os.health.HealthStats;
/* compiled from: PG */
/* renamed from: cwvq  reason: default package */
/* loaded from: classes5.dex */
final class cwvq extends cwvr<HealthStats, dzyo> {
    public static final cwvq a = new cwvq();

    private cwvq() {
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ String a(dzyo dzyoVar) {
        dzyi dzyiVar = dzyoVar.h;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        return dzyiVar.c;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyo b(dzyo dzyoVar, dzyo dzyoVar2) {
        dzyo dzyoVar3 = dzyoVar;
        dzyo dzyoVar4 = dzyoVar2;
        if (dzyoVar3 == null || dzyoVar4 == null) {
            return dzyoVar3;
        }
        dzyn bZ = dzyo.i.bZ();
        if ((dzyoVar3.a & 1) != 0) {
            long j = dzyoVar3.b - dzyoVar4.b;
            if (j != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dzyo dzyoVar5 = (dzyo) bZ.b;
                dzyoVar5.a |= 1;
                dzyoVar5.b = j;
            }
        }
        if ((dzyoVar3.a & 2) != 0) {
            long j2 = dzyoVar3.c - dzyoVar4.c;
            if (j2 != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dzyo dzyoVar6 = (dzyo) bZ.b;
                dzyoVar6.a |= 2;
                dzyoVar6.c = j2;
            }
        }
        if ((dzyoVar3.a & 4) != 0) {
            long j3 = dzyoVar3.d - dzyoVar4.d;
            if (j3 != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dzyo dzyoVar7 = (dzyo) bZ.b;
                dzyoVar7.a |= 4;
                dzyoVar7.d = j3;
            }
        }
        if ((dzyoVar3.a & 8) != 0) {
            long j4 = dzyoVar3.e - dzyoVar4.e;
            if (j4 != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dzyo dzyoVar8 = (dzyo) bZ.b;
                dzyoVar8.a |= 8;
                dzyoVar8.e = j4;
            }
        }
        if ((dzyoVar3.a & 16) != 0) {
            long j5 = dzyoVar3.f - dzyoVar4.f;
            if (j5 != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dzyo dzyoVar9 = (dzyo) bZ.b;
                dzyoVar9.a |= 16;
                dzyoVar9.f = j5;
            }
        }
        if ((dzyoVar3.a & 32) != 0) {
            long j6 = dzyoVar3.g - dzyoVar4.g;
            if (j6 != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dzyo dzyoVar10 = (dzyo) bZ.b;
                dzyoVar10.a |= 32;
                dzyoVar10.g = j6;
            }
        }
        dzyi dzyiVar = dzyoVar3.h;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyo dzyoVar11 = (dzyo) bZ.b;
        dzyiVar.getClass();
        dzyoVar11.h = dzyiVar;
        dzyoVar11.a |= 64;
        dzyo bK = bZ.bK();
        if (!cwvu.d(bK)) {
            return bK;
        }
        return null;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyo c(String str, HealthStats healthStats) {
        HealthStats healthStats2 = healthStats;
        dzyn bZ = dzyo.i.bZ();
        long i = cwvu.i(healthStats2, 30001);
        if (i != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar = (dzyo) bZ.b;
            dzyoVar.a |= 1;
            dzyoVar.b = i;
        }
        long i2 = cwvu.i(healthStats2, 30002);
        if (i2 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar2 = (dzyo) bZ.b;
            dzyoVar2.a |= 2;
            dzyoVar2.c = i2;
        }
        long i3 = cwvu.i(healthStats2, 30003);
        if (i3 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar3 = (dzyo) bZ.b;
            dzyoVar3.a |= 4;
            dzyoVar3.d = i3;
        }
        long i4 = cwvu.i(healthStats2, 30004);
        if (i4 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar4 = (dzyo) bZ.b;
            dzyoVar4.a |= 8;
            dzyoVar4.e = i4;
        }
        long i5 = cwvu.i(healthStats2, 30005);
        if (i5 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar5 = (dzyo) bZ.b;
            dzyoVar5.a |= 16;
            dzyoVar5.f = i5;
        }
        long i6 = cwvu.i(healthStats2, 30006);
        if (i6 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar6 = (dzyo) bZ.b;
            dzyoVar6.a |= 32;
            dzyoVar6.g = i6;
        }
        if (str != null) {
            dzyi a2 = cwvu.a(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyo dzyoVar7 = (dzyo) bZ.b;
            a2.getClass();
            dzyoVar7.h = a2;
            dzyoVar7.a |= 64;
        }
        dzyo bK = bZ.bK();
        if (cwvu.d(bK)) {
            return null;
        }
        return bK;
    }
}
