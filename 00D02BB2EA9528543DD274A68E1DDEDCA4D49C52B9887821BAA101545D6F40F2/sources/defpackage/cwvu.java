package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.google.ar.core.ImageMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cwvu  reason: default package */
/* loaded from: classes5.dex */
final class cwvu {
    public static dzyi a(String str) {
        dzyh bZ = dzyi.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyi dzyiVar = (dzyi) bZ.b;
        str.getClass();
        dzyiVar.a |= 2;
        dzyiVar.c = str;
        return bZ.bK();
    }

    public static dzys b(String str, TimerStat timerStat) {
        dzyr bZ = dzys.e.bZ();
        int count = timerStat.getCount();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzys dzysVar = (dzys) bZ.b;
        dzysVar.a |= 1;
        dzysVar.b = count;
        long time = timerStat.getTime();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzys dzysVar2 = (dzys) bZ.b;
        int i = dzysVar2.a | 2;
        dzysVar2.a = i;
        dzysVar2.c = time;
        if (dzysVar2.b < 0) {
            dzysVar2.a = i | 1;
            dzysVar2.b = 0;
        }
        if (str != null) {
            dzyi a = a(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzys dzysVar3 = (dzys) bZ.b;
            a.getClass();
            dzysVar3.d = a;
            dzysVar3.a |= 4;
        }
        dzys dzysVar4 = (dzys) bZ.b;
        if (dzysVar4.b == 0 && dzysVar4.c == 0) {
            return null;
        }
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dzys c(dzys dzysVar, dzys dzysVar2) {
        if (dzysVar == null || dzysVar2 == null) {
            return dzysVar;
        }
        int i = dzysVar.b - dzysVar2.b;
        long j = dzysVar.c - dzysVar2.c;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        dzyr bZ = dzys.e.bZ();
        dzyi dzyiVar = dzysVar.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzys dzysVar3 = (dzys) bZ.b;
        dzyiVar.getClass();
        dzysVar3.d = dzyiVar;
        int i2 = dzysVar3.a | 4;
        dzysVar3.a = i2;
        int i3 = i2 | 1;
        dzysVar3.a = i3;
        dzysVar3.b = i;
        dzysVar3.a = i3 | 2;
        dzysVar3.c = j;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(dzyo dzyoVar) {
        if (dzyoVar != null) {
            return dzyoVar.b <= 0 && dzyoVar.c <= 0 && dzyoVar.d <= 0 && dzyoVar.e <= 0 && dzyoVar.f <= 0 && dzyoVar.g <= 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(dzyk dzykVar) {
        return dzykVar == null || (dzykVar.b.size() == 0 && dzykVar.c.size() == 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(dzyq dzyqVar) {
        return dzyqVar == null || (((long) dzyqVar.b) <= 0 && ((long) dzyqVar.c) <= 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dzyu g(dzyu dzyuVar, dzyu dzyuVar2) {
        dzys dzysVar;
        dzys dzysVar2;
        dzys dzysVar3;
        dzys dzysVar4;
        dzys dzysVar5;
        dzys dzysVar6;
        dzys dzysVar7;
        dzys dzysVar8;
        dzys dzysVar9;
        dzys dzysVar10;
        dzys dzysVar11;
        dzys dzysVar12;
        dzys dzysVar13;
        dzys dzysVar14;
        dzys dzysVar15;
        dzys dzysVar16;
        dzys dzysVar17;
        dzys dzysVar18;
        dzys dzysVar19;
        dzys dzysVar20;
        dzys dzysVar21;
        dzys dzysVar22;
        dzys dzysVar23;
        dzys dzysVar24;
        dzys dzysVar25;
        dzys dzysVar26;
        dzys dzysVar27;
        dzys dzysVar28;
        dzys dzysVar29;
        dzys dzysVar30;
        if (dzyuVar != null && dzyuVar2 != null) {
            dzyt bZ = dzyu.an.bZ();
            if ((dzyuVar.a & 1) != 0) {
                long j = dzyuVar.c - dzyuVar2.c;
                if (j != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).c(j);
                }
            }
            if ((dzyuVar.a & 2) != 0) {
                long j2 = dzyuVar.d - dzyuVar2.d;
                if (j2 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).e(j2);
                }
            }
            if ((dzyuVar.a & 4) != 0) {
                long j3 = dzyuVar.e - dzyuVar2.e;
                if (j3 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).f(j3);
                }
            }
            if ((dzyuVar.a & 8) != 0) {
                long j4 = dzyuVar.f - dzyuVar2.f;
                if (j4 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).g(j4);
                }
            }
            bZ.n(cwvt.a.d(dzyuVar.g, dzyuVar2.g));
            bZ.o(cwvt.a.d(dzyuVar.h, dzyuVar2.h));
            bZ.p(cwvt.a.d(dzyuVar.i, dzyuVar2.i));
            bZ.m(cwvt.a.d(dzyuVar.j, dzyuVar2.j));
            bZ.l(cwvt.a.d(dzyuVar.k, dzyuVar2.k));
            bZ.h(cwvt.a.d(dzyuVar.l, dzyuVar2.l));
            if ((dzyuVar.a & 16) != 0) {
                dzysVar = dzyuVar.m;
                if (dzysVar == null) {
                    dzysVar = dzys.e;
                }
            } else {
                dzysVar = null;
            }
            if ((dzyuVar2.a & 16) != 0) {
                dzysVar2 = dzyuVar2.m;
                if (dzysVar2 == null) {
                    dzysVar2 = dzys.e;
                }
            } else {
                dzysVar2 = null;
            }
            dzys c = c(dzysVar, dzysVar2);
            if (c != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).n(c);
            }
            bZ.i(cwvt.a.d(dzyuVar.n, dzyuVar2.n));
            bZ.k(cwvq.a.d(dzyuVar.p, dzyuVar2.p));
            bZ.j(cwvp.a.d(dzyuVar.q, dzyuVar2.q));
            if ((dzyuVar.a & 32) != 0) {
                long j5 = dzyuVar.r - dzyuVar2.r;
                if (j5 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).p(j5);
                }
            }
            if ((dzyuVar.a & 64) != 0) {
                long j6 = dzyuVar.s - dzyuVar2.s;
                if (j6 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).q(j6);
                }
            }
            if ((dzyuVar.a & 128) != 0) {
                long j7 = dzyuVar.t - dzyuVar2.t;
                if (j7 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).r(j7);
                }
            }
            if ((dzyuVar.a & 256) != 0) {
                long j8 = dzyuVar.u - dzyuVar2.u;
                if (j8 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).s(j8);
                }
            }
            if ((dzyuVar.a & 512) != 0) {
                long j9 = dzyuVar.v - dzyuVar2.v;
                if (j9 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).t(j9);
                }
            }
            if ((dzyuVar.a & 1024) != 0) {
                long j10 = dzyuVar.w - dzyuVar2.w;
                if (j10 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).u(j10);
                }
            }
            if ((dzyuVar.a & 2048) != 0) {
                long j11 = dzyuVar.x - dzyuVar2.x;
                if (j11 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).v(j11);
                }
            }
            if ((dzyuVar.a & 4096) != 0) {
                long j12 = dzyuVar.y - dzyuVar2.y;
                if (j12 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).w(j12);
                }
            }
            if ((dzyuVar.a & 8192) != 0) {
                long j13 = dzyuVar.z - dzyuVar2.z;
                if (j13 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).x(j13);
                }
            }
            if ((dzyuVar.a & 16384) != 0) {
                long j14 = dzyuVar.A - dzyuVar2.A;
                if (j14 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).y(j14);
                }
            }
            if ((dzyuVar.a & 32768) != 0) {
                long j15 = dzyuVar.B - dzyuVar2.B;
                if (j15 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).z(j15);
                }
            }
            if ((dzyuVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                long j16 = dzyuVar.C - dzyuVar2.C;
                if (j16 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).A(j16);
                }
            }
            if ((dzyuVar.a & 131072) != 0) {
                long j17 = dzyuVar.D - dzyuVar2.D;
                if (j17 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).B(j17);
                }
            }
            if ((dzyuVar.a & 262144) != 0) {
                long j18 = dzyuVar.E - dzyuVar2.E;
                if (j18 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).C(j18);
                }
            }
            if ((dzyuVar.a & ImageMetadata.LENS_APERTURE) != 0) {
                dzysVar3 = dzyuVar.F;
                if (dzysVar3 == null) {
                    dzysVar3 = dzys.e;
                }
            } else {
                dzysVar3 = null;
            }
            if ((524288 & dzyuVar2.a) != 0) {
                dzysVar4 = dzyuVar2.F;
                if (dzysVar4 == null) {
                    dzysVar4 = dzys.e;
                }
            } else {
                dzysVar4 = null;
            }
            dzys c2 = c(dzysVar3, dzysVar4);
            if (c2 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).D(c2);
            }
            if ((dzyuVar.a & ImageMetadata.SHADING_MODE) != 0) {
                long j19 = dzyuVar.G - dzyuVar2.G;
                if (j19 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).E(j19);
                }
            }
            if ((dzyuVar.a & 2097152) != 0) {
                dzysVar5 = dzyuVar.H;
                if (dzysVar5 == null) {
                    dzysVar5 = dzys.e;
                }
            } else {
                dzysVar5 = null;
            }
            if ((2097152 & dzyuVar2.a) != 0) {
                dzysVar6 = dzyuVar2.H;
                if (dzysVar6 == null) {
                    dzysVar6 = dzys.e;
                }
            } else {
                dzysVar6 = null;
            }
            dzys c3 = c(dzysVar5, dzysVar6);
            if (c3 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).F(c3);
            }
            if ((dzyuVar.a & 4194304) != 0) {
                dzysVar7 = dzyuVar.I;
                if (dzysVar7 == null) {
                    dzysVar7 = dzys.e;
                }
            } else {
                dzysVar7 = null;
            }
            if ((dzyuVar2.a & 4194304) != 0) {
                dzysVar8 = dzyuVar2.I;
                if (dzysVar8 == null) {
                    dzysVar8 = dzys.e;
                }
            } else {
                dzysVar8 = null;
            }
            dzys c4 = c(dzysVar7, dzysVar8);
            if (c4 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).G(c4);
            }
            if ((dzyuVar.a & 8388608) != 0) {
                dzysVar9 = dzyuVar.J;
                if (dzysVar9 == null) {
                    dzysVar9 = dzys.e;
                }
            } else {
                dzysVar9 = null;
            }
            if ((dzyuVar2.a & 8388608) != 0) {
                dzysVar10 = dzyuVar2.J;
                if (dzysVar10 == null) {
                    dzysVar10 = dzys.e;
                }
            } else {
                dzysVar10 = null;
            }
            dzys c5 = c(dzysVar9, dzysVar10);
            if (c5 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).J(c5);
            }
            if ((dzyuVar.a & 16777216) != 0) {
                dzysVar11 = dzyuVar.K;
                if (dzysVar11 == null) {
                    dzysVar11 = dzys.e;
                }
            } else {
                dzysVar11 = null;
            }
            if ((dzyuVar2.a & 16777216) != 0) {
                dzysVar12 = dzyuVar2.K;
                if (dzysVar12 == null) {
                    dzysVar12 = dzys.e;
                }
            } else {
                dzysVar12 = null;
            }
            dzys c6 = c(dzysVar11, dzysVar12);
            if (c6 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).K(c6);
            }
            if ((dzyuVar.a & 33554432) != 0) {
                dzysVar13 = dzyuVar.L;
                if (dzysVar13 == null) {
                    dzysVar13 = dzys.e;
                }
            } else {
                dzysVar13 = null;
            }
            if ((dzyuVar2.a & 33554432) != 0) {
                dzysVar14 = dzyuVar2.L;
                if (dzysVar14 == null) {
                    dzysVar14 = dzys.e;
                }
            } else {
                dzysVar14 = null;
            }
            dzys c7 = c(dzysVar13, dzysVar14);
            if (c7 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).L(c7);
            }
            if ((dzyuVar.a & 67108864) != 0) {
                dzysVar15 = dzyuVar.M;
                if (dzysVar15 == null) {
                    dzysVar15 = dzys.e;
                }
            } else {
                dzysVar15 = null;
            }
            if ((dzyuVar2.a & 67108864) != 0) {
                dzysVar16 = dzyuVar2.M;
                if (dzysVar16 == null) {
                    dzysVar16 = dzys.e;
                }
            } else {
                dzysVar16 = null;
            }
            dzys c8 = c(dzysVar15, dzysVar16);
            if (c8 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).M(c8);
            }
            if ((dzyuVar.a & 134217728) != 0) {
                dzysVar17 = dzyuVar.N;
                if (dzysVar17 == null) {
                    dzysVar17 = dzys.e;
                }
            } else {
                dzysVar17 = null;
            }
            if ((dzyuVar2.a & 134217728) != 0) {
                dzysVar18 = dzyuVar2.N;
                if (dzysVar18 == null) {
                    dzysVar18 = dzys.e;
                }
            } else {
                dzysVar18 = null;
            }
            dzys c9 = c(dzysVar17, dzysVar18);
            if (c9 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).N(c9);
            }
            if ((dzyuVar.a & 268435456) != 0) {
                dzysVar19 = dzyuVar.O;
                if (dzysVar19 == null) {
                    dzysVar19 = dzys.e;
                }
            } else {
                dzysVar19 = null;
            }
            if ((dzyuVar2.a & 268435456) != 0) {
                dzysVar20 = dzyuVar2.O;
                if (dzysVar20 == null) {
                    dzysVar20 = dzys.e;
                }
            } else {
                dzysVar20 = null;
            }
            dzys c10 = c(dzysVar19, dzysVar20);
            if (c10 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).O(c10);
            }
            if ((dzyuVar.a & 536870912) != 0) {
                dzysVar21 = dzyuVar.P;
                if (dzysVar21 == null) {
                    dzysVar21 = dzys.e;
                }
            } else {
                dzysVar21 = null;
            }
            if ((dzyuVar2.a & 536870912) != 0) {
                dzysVar22 = dzyuVar2.P;
                if (dzysVar22 == null) {
                    dzysVar22 = dzys.e;
                }
            } else {
                dzysVar22 = null;
            }
            dzys c11 = c(dzysVar21, dzysVar22);
            if (c11 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).P(c11);
            }
            if ((dzyuVar.a & 1073741824) != 0) {
                dzysVar23 = dzyuVar.Q;
                if (dzysVar23 == null) {
                    dzysVar23 = dzys.e;
                }
            } else {
                dzysVar23 = null;
            }
            if ((dzyuVar2.a & 1073741824) != 0) {
                dzysVar24 = dzyuVar2.Q;
                if (dzysVar24 == null) {
                    dzysVar24 = dzys.e;
                }
            } else {
                dzysVar24 = null;
            }
            dzys c12 = c(dzysVar23, dzysVar24);
            if (c12 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).Q(c12);
            }
            if ((dzyuVar.a & Integer.MIN_VALUE) != 0) {
                dzysVar25 = dzyuVar.R;
                if (dzysVar25 == null) {
                    dzysVar25 = dzys.e;
                }
            } else {
                dzysVar25 = null;
            }
            if ((dzyuVar2.a & Integer.MIN_VALUE) != 0) {
                dzysVar26 = dzyuVar2.R;
                if (dzysVar26 == null) {
                    dzysVar26 = dzys.e;
                }
            } else {
                dzysVar26 = null;
            }
            dzys c13 = c(dzysVar25, dzysVar26);
            if (c13 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).R(c13);
            }
            if ((dzyuVar.b & 1) != 0) {
                dzysVar27 = dzyuVar.S;
                if (dzysVar27 == null) {
                    dzysVar27 = dzys.e;
                }
            } else {
                dzysVar27 = null;
            }
            if ((dzyuVar2.b & 1) != 0) {
                dzysVar28 = dzyuVar2.S;
                if (dzysVar28 == null) {
                    dzysVar28 = dzys.e;
                }
            } else {
                dzysVar28 = null;
            }
            dzys c14 = c(dzysVar27, dzysVar28);
            if (c14 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).S(c14);
            }
            if ((dzyuVar.b & 2) != 0) {
                dzysVar29 = dzyuVar.T;
                if (dzysVar29 == null) {
                    dzysVar29 = dzys.e;
                }
            } else {
                dzysVar29 = null;
            }
            if ((dzyuVar2.b & 2) != 0) {
                dzysVar30 = dzyuVar2.T;
                if (dzysVar30 == null) {
                    dzysVar30 = dzys.e;
                }
            } else {
                dzysVar30 = null;
            }
            dzys c15 = c(dzysVar29, dzysVar30);
            if (c15 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dzyu) bZ.b).T(c15);
            }
            if ((dzyuVar.b & 4) != 0) {
                long j20 = dzyuVar.U - dzyuVar2.U;
                if (j20 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).U(j20);
                }
            }
            if ((dzyuVar.b & 8) != 0) {
                long j21 = dzyuVar.V - dzyuVar2.V;
                if (j21 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).V(j21);
                }
            }
            if ((dzyuVar.b & 16) != 0) {
                long j22 = dzyuVar.W - dzyuVar2.W;
                if (j22 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).W(j22);
                }
            }
            if ((dzyuVar.b & 32) != 0) {
                long j23 = dzyuVar.X - dzyuVar2.X;
                if (j23 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).X(j23);
                }
            }
            if ((dzyuVar.b & 64) != 0) {
                long j24 = dzyuVar.Y - dzyuVar2.Y;
                if (j24 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).Y(j24);
                }
            }
            if ((dzyuVar.b & 128) != 0) {
                long j25 = dzyuVar.Z - dzyuVar2.Z;
                if (j25 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).Z(j25);
                }
            }
            if ((dzyuVar.b & 256) != 0) {
                long j26 = dzyuVar.aa - dzyuVar2.aa;
                if (j26 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).aa(j26);
                }
            }
            if ((dzyuVar.b & 512) != 0) {
                long j27 = dzyuVar.ab - dzyuVar2.ab;
                if (j27 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).ab(j27);
                }
            }
            if ((dzyuVar.b & 1024) != 0) {
                long j28 = dzyuVar.ac - dzyuVar2.ac;
                if (j28 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).ac(j28);
                }
            }
            if ((dzyuVar.b & 2048) != 0) {
                long j29 = dzyuVar.ad - dzyuVar2.ad;
                if (j29 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ((dzyu) bZ.b).ad(j29);
                }
            }
            if ((dzyuVar.b & 4096) != 0) {
                long j30 = dzyuVar.ae - dzyuVar2.ae;
                if (j30 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dzyu dzyuVar3 = (dzyu) bZ.b;
                    dzyuVar3.b |= 4096;
                    dzyuVar3.ae = j30;
                }
            }
            if ((dzyuVar.b & 8192) != 0) {
                long j31 = dzyuVar.af - dzyuVar2.af;
                if (j31 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dzyu dzyuVar4 = (dzyu) bZ.b;
                    dzyuVar4.b |= 8192;
                    dzyuVar4.af = j31;
                }
            }
            if ((dzyuVar.b & 16384) != 0) {
                long j32 = dzyuVar.ag - dzyuVar2.ag;
                if (j32 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dzyu dzyuVar5 = (dzyu) bZ.b;
                    dzyuVar5.b |= 16384;
                    dzyuVar5.ag = j32;
                }
            }
            if ((dzyuVar.b & 32768) != 0) {
                long j33 = dzyuVar.ah - dzyuVar2.ah;
                if (j33 != 0) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dzyu dzyuVar6 = (dzyu) bZ.b;
                    dzyuVar6.b |= 32768;
                    dzyuVar6.ah = j33;
                }
            }
            if ((dzyuVar.b & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                long j34 = dzyuVar.ai - dzyuVar2.ai;
                if (j34 != 0) {
                    bZ.q(j34);
                }
            }
            dzys c16 = c(dzyuVar.ae() ? dzyuVar.af() : null, dzyuVar2.ae() ? dzyuVar2.af() : null);
            if (c16 != null) {
                bZ.t(c16);
            }
            if (dzyuVar.ag()) {
                long j35 = dzyuVar.ak - dzyuVar2.ak;
                if (j35 != 0) {
                    bZ.x(j35);
                }
            }
            if (dzyuVar.ah()) {
                long j36 = dzyuVar.al - dzyuVar2.al;
                if (j36 != 0) {
                    bZ.w(j36);
                }
            }
            if (dzyuVar.ai()) {
                long j37 = dzyuVar.am - dzyuVar2.am;
                if (j37 != 0) {
                    bZ.r(j37);
                }
            }
            dzyuVar = bZ.bK();
            if (h(dzyuVar)) {
                return null;
            }
        }
        return dzyuVar;
    }

    static boolean h(dzyu dzyuVar) {
        if (dzyuVar != null) {
            return dzyuVar.c <= 0 && dzyuVar.d <= 0 && dzyuVar.e <= 0 && dzyuVar.f <= 0 && dzyuVar.g.size() == 0 && dzyuVar.h.size() == 0 && dzyuVar.i.size() == 0 && dzyuVar.j.size() == 0 && dzyuVar.k.size() == 0 && dzyuVar.l.size() == 0 && dzyuVar.n.size() == 0 && dzyuVar.o.size() == 0 && dzyuVar.p.size() == 0 && dzyuVar.q.size() == 0 && dzyuVar.r <= 0 && dzyuVar.s <= 0 && dzyuVar.t <= 0 && dzyuVar.u <= 0 && dzyuVar.v <= 0 && dzyuVar.w <= 0 && dzyuVar.x <= 0 && dzyuVar.y <= 0 && dzyuVar.z <= 0 && dzyuVar.A <= 0 && dzyuVar.B <= 0 && dzyuVar.C <= 0 && dzyuVar.D <= 0 && dzyuVar.E <= 0 && dzyuVar.G <= 0 && dzyuVar.U <= 0 && dzyuVar.V <= 0 && dzyuVar.W <= 0 && dzyuVar.X <= 0 && dzyuVar.Y <= 0 && dzyuVar.Z <= 0 && dzyuVar.aa <= 0 && dzyuVar.ab <= 0 && dzyuVar.ac <= 0 && dzyuVar.ad <= 0 && dzyuVar.ae <= 0 && dzyuVar.af <= 0 && dzyuVar.ag <= 0 && dzyuVar.ah <= 0 && dzyuVar.ai <= 0 && dzyuVar.ak <= 0 && dzyuVar.al <= 0 && dzyuVar.am <= 0;
        }
        return true;
    }

    public static long i(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static dzys j(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return b(null, healthStats.getTimer(i));
    }

    public static List<dzys> k(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return Collections.emptyList();
        }
        return cwvt.a.e(healthStats.getTimers(i));
    }

    public static Map<String, HealthStats> l(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }
}
