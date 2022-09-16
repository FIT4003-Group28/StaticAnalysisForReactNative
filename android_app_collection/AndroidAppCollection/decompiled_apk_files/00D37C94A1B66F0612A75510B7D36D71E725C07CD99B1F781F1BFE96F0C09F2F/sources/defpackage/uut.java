package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: uut  reason: default package */
/* loaded from: classes4.dex */
public class uut {
    private static Method a;

    private static void a(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }

    public static long e(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List f(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return Collections.emptyList();
        }
        return uvd.a.d(healthStats.getTimers(i));
    }

    public static Map g(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }

    public static azzd h(String str) {
        aopa createBuilder = azzd.a.createBuilder();
        createBuilder.copyOnWrite();
        azzd azzdVar = (azzd) createBuilder.instance;
        azzdVar.b |= 2;
        azzdVar.d = str;
        return (azzd) createBuilder.mo39build();
    }

    public static azzi i(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return k(null, healthStats.getTimer(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azzi j(azzi azziVar, azzi azziVar2) {
        if (azziVar == null || azziVar2 == null) {
            return azziVar;
        }
        int i = azziVar.c - azziVar2.c;
        long j = azziVar.d - azziVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        aopa createBuilder = azzi.a.createBuilder();
        azzd azzdVar = azziVar.e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        createBuilder.copyOnWrite();
        azzi azziVar3 = (azzi) createBuilder.instance;
        azzdVar.getClass();
        azziVar3.e = azzdVar;
        azziVar3.b |= 4;
        createBuilder.copyOnWrite();
        azzi azziVar4 = (azzi) createBuilder.instance;
        azziVar4.b |= 1;
        azziVar4.c = i;
        createBuilder.copyOnWrite();
        azzi azziVar5 = (azzi) createBuilder.instance;
        azziVar5.b |= 2;
        azziVar5.d = j;
        return (azzi) createBuilder.mo39build();
    }

    public static azzi k(String str, TimerStat timerStat) {
        aopa createBuilder = azzi.a.createBuilder();
        int count = timerStat.getCount();
        createBuilder.copyOnWrite();
        azzi azziVar = (azzi) createBuilder.instance;
        azziVar.b |= 1;
        azziVar.c = count;
        long time = timerStat.getTime();
        createBuilder.copyOnWrite();
        azzi azziVar2 = (azzi) createBuilder.instance;
        azziVar2.b |= 2;
        azziVar2.d = time;
        if (azziVar2.c < 0) {
            createBuilder.copyOnWrite();
            azzi azziVar3 = (azzi) createBuilder.instance;
            azziVar3.b |= 1;
            azziVar3.c = 0;
        }
        if (str != null) {
            azzd h = h(str);
            createBuilder.copyOnWrite();
            azzi azziVar4 = (azzi) createBuilder.instance;
            h.getClass();
            azziVar4.e = h;
            azziVar4.b |= 4;
        }
        azzi azziVar5 = (azzi) createBuilder.instance;
        if (azziVar5.c == 0 && azziVar5.d == 0) {
            return null;
        }
        return (azzi) createBuilder.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azzj l(azzj azzjVar, azzj azzjVar2) {
        azzi azziVar;
        azzi azziVar2;
        azzi azziVar3;
        azzi azziVar4;
        azzi azziVar5;
        azzi azziVar6;
        azzi azziVar7;
        azzi azziVar8;
        azzi azziVar9;
        azzi azziVar10;
        azzi azziVar11;
        azzi azziVar12;
        azzi azziVar13;
        azzi azziVar14;
        azzi azziVar15;
        azzi azziVar16;
        azzi azziVar17;
        azzi azziVar18;
        azzi azziVar19;
        azzi azziVar20;
        azzi azziVar21;
        azzi azziVar22;
        azzi azziVar23;
        azzi azziVar24;
        azzi azziVar25;
        azzi azziVar26;
        azzi azziVar27;
        azzi azziVar28;
        azzi azziVar29;
        azzi azziVar30;
        azzi azziVar31;
        azzi azziVar32;
        if (azzjVar != null && azzjVar2 != null) {
            aopa createBuilder = azzj.a.createBuilder();
            if ((azzjVar.b & 1) != 0) {
                long j = azzjVar.d - azzjVar2.d;
                if (j != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar3 = (azzj) createBuilder.instance;
                    azzjVar3.b |= 1;
                    azzjVar3.d = j;
                }
            }
            if ((azzjVar.b & 2) != 0) {
                long j2 = azzjVar.e - azzjVar2.e;
                if (j2 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar4 = (azzj) createBuilder.instance;
                    azzjVar4.b |= 2;
                    azzjVar4.e = j2;
                }
            }
            if ((azzjVar.b & 4) != 0) {
                long j3 = azzjVar.f - azzjVar2.f;
                if (j3 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar5 = (azzj) createBuilder.instance;
                    azzjVar5.b |= 4;
                    azzjVar5.f = j3;
                }
            }
            if ((azzjVar.b & 8) != 0) {
                long j4 = azzjVar.g - azzjVar2.g;
                if (j4 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar6 = (azzj) createBuilder.instance;
                    azzjVar6.b |= 8;
                    azzjVar6.g = j4;
                }
            }
            createBuilder.bR(uvd.a.e(azzjVar.h, azzjVar2.h));
            createBuilder.bS(uvd.a.e(azzjVar.i, azzjVar2.i));
            createBuilder.bT(uvd.a.e(azzjVar.j, azzjVar2.j));
            createBuilder.bQ(uvd.a.e(azzjVar.k, azzjVar2.k));
            createBuilder.bP(uvd.a.e(azzjVar.l, azzjVar2.l));
            createBuilder.bL(uvd.a.e(azzjVar.m, azzjVar2.m));
            if ((azzjVar.b & 16) != 0) {
                azziVar = azzjVar.n;
                if (azziVar == null) {
                    azziVar = azzi.a;
                }
            } else {
                azziVar = null;
            }
            if ((azzjVar2.b & 16) != 0) {
                azziVar2 = azzjVar2.n;
                if (azziVar2 == null) {
                    azziVar2 = azzi.a;
                }
            } else {
                azziVar2 = null;
            }
            azzi j5 = j(azziVar, azziVar2);
            if (j5 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar7 = (azzj) createBuilder.instance;
                azzjVar7.n = j5;
                azzjVar7.b |= 16;
            }
            createBuilder.bM(uvd.a.e(azzjVar.o, azzjVar2.o));
            createBuilder.bO(uva.a.e(azzjVar.q, azzjVar2.q));
            createBuilder.bN(uuz.a.e(azzjVar.r, azzjVar2.r));
            if ((azzjVar.b & 32) != 0) {
                long j6 = azzjVar.s - azzjVar2.s;
                if (j6 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar8 = (azzj) createBuilder.instance;
                    azzjVar8.b |= 32;
                    azzjVar8.s = j6;
                }
            }
            if ((azzjVar.b & 64) != 0) {
                long j7 = azzjVar.t - azzjVar2.t;
                if (j7 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar9 = (azzj) createBuilder.instance;
                    azzjVar9.b |= 64;
                    azzjVar9.t = j7;
                }
            }
            if ((azzjVar.b & 128) != 0) {
                long j8 = azzjVar.u - azzjVar2.u;
                if (j8 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar10 = (azzj) createBuilder.instance;
                    azzjVar10.b |= 128;
                    azzjVar10.u = j8;
                }
            }
            if ((azzjVar.b & 256) != 0) {
                long j9 = azzjVar.v - azzjVar2.v;
                if (j9 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar11 = (azzj) createBuilder.instance;
                    azzjVar11.b |= 256;
                    azzjVar11.v = j9;
                }
            }
            if ((azzjVar.b & 512) != 0) {
                long j10 = azzjVar.w - azzjVar2.w;
                if (j10 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar12 = (azzj) createBuilder.instance;
                    azzjVar12.b |= 512;
                    azzjVar12.w = j10;
                }
            }
            if ((azzjVar.b & 1024) != 0) {
                long j11 = azzjVar.x - azzjVar2.x;
                if (j11 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar13 = (azzj) createBuilder.instance;
                    azzjVar13.b |= 1024;
                    azzjVar13.x = j11;
                }
            }
            if ((azzjVar.b & 2048) != 0) {
                long j12 = azzjVar.y - azzjVar2.y;
                if (j12 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar14 = (azzj) createBuilder.instance;
                    azzjVar14.b |= 2048;
                    azzjVar14.y = j12;
                }
            }
            if ((azzjVar.b & 4096) != 0) {
                long j13 = azzjVar.z - azzjVar2.z;
                if (j13 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar15 = (azzj) createBuilder.instance;
                    azzjVar15.b |= 4096;
                    azzjVar15.z = j13;
                }
            }
            if ((azzjVar.b & 8192) != 0) {
                long j14 = azzjVar.A - azzjVar2.A;
                if (j14 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar16 = (azzj) createBuilder.instance;
                    azzjVar16.b |= 8192;
                    azzjVar16.A = j14;
                }
            }
            if ((azzjVar.b & 16384) != 0) {
                long j15 = azzjVar.B - azzjVar2.B;
                if (j15 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar17 = (azzj) createBuilder.instance;
                    azzjVar17.b |= 16384;
                    azzjVar17.B = j15;
                }
            }
            if ((azzjVar.b & 32768) != 0) {
                long j16 = azzjVar.C - azzjVar2.C;
                if (j16 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar18 = (azzj) createBuilder.instance;
                    azzjVar18.b |= 32768;
                    azzjVar18.C = j16;
                }
            }
            if ((azzjVar.b & 65536) != 0) {
                long j17 = azzjVar.D - azzjVar2.D;
                if (j17 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar19 = (azzj) createBuilder.instance;
                    azzjVar19.b |= 65536;
                    azzjVar19.D = j17;
                }
            }
            if ((azzjVar.b & 131072) != 0) {
                long j18 = azzjVar.E - azzjVar2.E;
                if (j18 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar20 = (azzj) createBuilder.instance;
                    azzjVar20.b |= 131072;
                    azzjVar20.E = j18;
                }
            }
            if ((azzjVar.b & 262144) != 0) {
                long j19 = azzjVar.F - azzjVar2.F;
                if (j19 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar21 = (azzj) createBuilder.instance;
                    azzjVar21.b |= 262144;
                    azzjVar21.F = j19;
                }
            }
            if ((azzjVar.b & 524288) != 0) {
                azziVar3 = azzjVar.G;
                if (azziVar3 == null) {
                    azziVar3 = azzi.a;
                }
            } else {
                azziVar3 = null;
            }
            if ((azzjVar2.b & 524288) != 0) {
                azziVar4 = azzjVar2.G;
                if (azziVar4 == null) {
                    azziVar4 = azzi.a;
                }
            } else {
                azziVar4 = null;
            }
            azzi j20 = j(azziVar3, azziVar4);
            if (j20 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar22 = (azzj) createBuilder.instance;
                azzjVar22.G = j20;
                azzjVar22.b |= 524288;
            }
            if ((azzjVar.b & 1048576) != 0) {
                long j21 = azzjVar.H - azzjVar2.H;
                if (j21 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar23 = (azzj) createBuilder.instance;
                    azzjVar23.b |= 1048576;
                    azzjVar23.H = j21;
                }
            }
            if ((azzjVar.b & 2097152) != 0) {
                azziVar5 = azzjVar.I;
                if (azziVar5 == null) {
                    azziVar5 = azzi.a;
                }
            } else {
                azziVar5 = null;
            }
            if ((azzjVar2.b & 2097152) != 0) {
                azziVar6 = azzjVar2.I;
                if (azziVar6 == null) {
                    azziVar6 = azzi.a;
                }
            } else {
                azziVar6 = null;
            }
            azzi j22 = j(azziVar5, azziVar6);
            if (j22 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar24 = (azzj) createBuilder.instance;
                azzjVar24.I = j22;
                azzjVar24.b |= 2097152;
            }
            if ((azzjVar.b & 4194304) != 0) {
                azziVar7 = azzjVar.f135J;
                if (azziVar7 == null) {
                    azziVar7 = azzi.a;
                }
            } else {
                azziVar7 = null;
            }
            if ((azzjVar2.b & 4194304) != 0) {
                azziVar8 = azzjVar2.f135J;
                if (azziVar8 == null) {
                    azziVar8 = azzi.a;
                }
            } else {
                azziVar8 = null;
            }
            azzi j23 = j(azziVar7, azziVar8);
            if (j23 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar25 = (azzj) createBuilder.instance;
                azzjVar25.f135J = j23;
                azzjVar25.b |= 4194304;
            }
            if ((azzjVar.b & 8388608) != 0) {
                azziVar9 = azzjVar.K;
                if (azziVar9 == null) {
                    azziVar9 = azzi.a;
                }
            } else {
                azziVar9 = null;
            }
            if ((azzjVar2.b & 8388608) != 0) {
                azziVar10 = azzjVar2.K;
                if (azziVar10 == null) {
                    azziVar10 = azzi.a;
                }
            } else {
                azziVar10 = null;
            }
            azzi j24 = j(azziVar9, azziVar10);
            if (j24 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar26 = (azzj) createBuilder.instance;
                azzjVar26.K = j24;
                azzjVar26.b |= 8388608;
            }
            if ((azzjVar.b & 16777216) != 0) {
                azziVar11 = azzjVar.L;
                if (azziVar11 == null) {
                    azziVar11 = azzi.a;
                }
            } else {
                azziVar11 = null;
            }
            if ((azzjVar2.b & 16777216) != 0) {
                azziVar12 = azzjVar2.L;
                if (azziVar12 == null) {
                    azziVar12 = azzi.a;
                }
            } else {
                azziVar12 = null;
            }
            azzi j25 = j(azziVar11, azziVar12);
            if (j25 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar27 = (azzj) createBuilder.instance;
                azzjVar27.L = j25;
                azzjVar27.b |= 16777216;
            }
            if ((azzjVar.b & 33554432) != 0) {
                azziVar13 = azzjVar.M;
                if (azziVar13 == null) {
                    azziVar13 = azzi.a;
                }
            } else {
                azziVar13 = null;
            }
            if ((azzjVar2.b & 33554432) != 0) {
                azziVar14 = azzjVar2.M;
                if (azziVar14 == null) {
                    azziVar14 = azzi.a;
                }
            } else {
                azziVar14 = null;
            }
            azzi j26 = j(azziVar13, azziVar14);
            if (j26 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar28 = (azzj) createBuilder.instance;
                azzjVar28.M = j26;
                azzjVar28.b |= 33554432;
            }
            if ((azzjVar.b & 67108864) != 0) {
                azziVar15 = azzjVar.N;
                if (azziVar15 == null) {
                    azziVar15 = azzi.a;
                }
            } else {
                azziVar15 = null;
            }
            if ((azzjVar2.b & 67108864) != 0) {
                azziVar16 = azzjVar2.N;
                if (azziVar16 == null) {
                    azziVar16 = azzi.a;
                }
            } else {
                azziVar16 = null;
            }
            azzi j27 = j(azziVar15, azziVar16);
            if (j27 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar29 = (azzj) createBuilder.instance;
                azzjVar29.N = j27;
                azzjVar29.b |= 67108864;
            }
            if ((azzjVar.b & 134217728) != 0) {
                azziVar17 = azzjVar.O;
                if (azziVar17 == null) {
                    azziVar17 = azzi.a;
                }
            } else {
                azziVar17 = null;
            }
            if ((azzjVar2.b & 134217728) != 0) {
                azziVar18 = azzjVar2.O;
                if (azziVar18 == null) {
                    azziVar18 = azzi.a;
                }
            } else {
                azziVar18 = null;
            }
            azzi j28 = j(azziVar17, azziVar18);
            if (j28 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar30 = (azzj) createBuilder.instance;
                azzjVar30.O = j28;
                azzjVar30.b |= 134217728;
            }
            if ((azzjVar.b & 268435456) != 0) {
                azziVar19 = azzjVar.P;
                if (azziVar19 == null) {
                    azziVar19 = azzi.a;
                }
            } else {
                azziVar19 = null;
            }
            if ((azzjVar2.b & 268435456) != 0) {
                azziVar20 = azzjVar2.P;
                if (azziVar20 == null) {
                    azziVar20 = azzi.a;
                }
            } else {
                azziVar20 = null;
            }
            azzi j29 = j(azziVar19, azziVar20);
            if (j29 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar31 = (azzj) createBuilder.instance;
                azzjVar31.P = j29;
                azzjVar31.b |= 268435456;
            }
            if ((azzjVar.b & 536870912) != 0) {
                azziVar21 = azzjVar.Q;
                if (azziVar21 == null) {
                    azziVar21 = azzi.a;
                }
            } else {
                azziVar21 = null;
            }
            if ((azzjVar2.b & 536870912) != 0) {
                azziVar22 = azzjVar2.Q;
                if (azziVar22 == null) {
                    azziVar22 = azzi.a;
                }
            } else {
                azziVar22 = null;
            }
            azzi j30 = j(azziVar21, azziVar22);
            if (j30 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar32 = (azzj) createBuilder.instance;
                azzjVar32.Q = j30;
                azzjVar32.b |= 536870912;
            }
            if ((azzjVar.b & 1073741824) != 0) {
                azziVar23 = azzjVar.R;
                if (azziVar23 == null) {
                    azziVar23 = azzi.a;
                }
            } else {
                azziVar23 = null;
            }
            if ((azzjVar2.b & 1073741824) != 0) {
                azziVar24 = azzjVar2.R;
                if (azziVar24 == null) {
                    azziVar24 = azzi.a;
                }
            } else {
                azziVar24 = null;
            }
            azzi j31 = j(azziVar23, azziVar24);
            if (j31 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar33 = (azzj) createBuilder.instance;
                azzjVar33.R = j31;
                azzjVar33.b |= 1073741824;
            }
            if ((azzjVar.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                azziVar25 = azzjVar.S;
                if (azziVar25 == null) {
                    azziVar25 = azzi.a;
                }
            } else {
                azziVar25 = null;
            }
            if ((azzjVar2.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                azziVar26 = azzjVar2.S;
                if (azziVar26 == null) {
                    azziVar26 = azzi.a;
                }
            } else {
                azziVar26 = null;
            }
            azzi j32 = j(azziVar25, azziVar26);
            if (j32 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar34 = (azzj) createBuilder.instance;
                azzjVar34.S = j32;
                azzjVar34.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            if ((azzjVar.c & 1) != 0) {
                azziVar27 = azzjVar.T;
                if (azziVar27 == null) {
                    azziVar27 = azzi.a;
                }
            } else {
                azziVar27 = null;
            }
            if ((azzjVar2.c & 1) != 0) {
                azziVar28 = azzjVar2.T;
                if (azziVar28 == null) {
                    azziVar28 = azzi.a;
                }
            } else {
                azziVar28 = null;
            }
            azzi j33 = j(azziVar27, azziVar28);
            if (j33 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar35 = (azzj) createBuilder.instance;
                azzjVar35.T = j33;
                azzjVar35.c |= 1;
            }
            if ((azzjVar.c & 2) != 0) {
                azziVar29 = azzjVar.U;
                if (azziVar29 == null) {
                    azziVar29 = azzi.a;
                }
            } else {
                azziVar29 = null;
            }
            if ((azzjVar2.c & 2) != 0) {
                azziVar30 = azzjVar2.U;
                if (azziVar30 == null) {
                    azziVar30 = azzi.a;
                }
            } else {
                azziVar30 = null;
            }
            azzi j34 = j(azziVar29, azziVar30);
            if (j34 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar36 = (azzj) createBuilder.instance;
                azzjVar36.U = j34;
                azzjVar36.c |= 2;
            }
            if ((azzjVar.c & 4) != 0) {
                long j35 = azzjVar.V - azzjVar2.V;
                if (j35 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar37 = (azzj) createBuilder.instance;
                    azzjVar37.c |= 4;
                    azzjVar37.V = j35;
                }
            }
            if ((azzjVar.c & 8) != 0) {
                long j36 = azzjVar.W - azzjVar2.W;
                if (j36 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar38 = (azzj) createBuilder.instance;
                    azzjVar38.c |= 8;
                    azzjVar38.W = j36;
                }
            }
            if ((azzjVar.c & 16) != 0) {
                long j37 = azzjVar.X - azzjVar2.X;
                if (j37 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar39 = (azzj) createBuilder.instance;
                    azzjVar39.c |= 16;
                    azzjVar39.X = j37;
                }
            }
            if ((azzjVar.c & 32) != 0) {
                long j38 = azzjVar.Y - azzjVar2.Y;
                if (j38 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar40 = (azzj) createBuilder.instance;
                    azzjVar40.c |= 32;
                    azzjVar40.Y = j38;
                }
            }
            if ((azzjVar.c & 64) != 0) {
                long j39 = azzjVar.Z - azzjVar2.Z;
                if (j39 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar41 = (azzj) createBuilder.instance;
                    azzjVar41.c |= 64;
                    azzjVar41.Z = j39;
                }
            }
            if ((azzjVar.c & 128) != 0) {
                long j40 = azzjVar.aa - azzjVar2.aa;
                if (j40 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar42 = (azzj) createBuilder.instance;
                    azzjVar42.c |= 128;
                    azzjVar42.aa = j40;
                }
            }
            if ((azzjVar.c & 256) != 0) {
                long j41 = azzjVar.ab - azzjVar2.ab;
                if (j41 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar43 = (azzj) createBuilder.instance;
                    azzjVar43.c |= 256;
                    azzjVar43.ab = j41;
                }
            }
            if ((azzjVar.c & 512) != 0) {
                long j42 = azzjVar.ac - azzjVar2.ac;
                if (j42 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar44 = (azzj) createBuilder.instance;
                    azzjVar44.c |= 512;
                    azzjVar44.ac = j42;
                }
            }
            if ((azzjVar.c & 1024) != 0) {
                long j43 = azzjVar.ad - azzjVar2.ad;
                if (j43 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar45 = (azzj) createBuilder.instance;
                    azzjVar45.c |= 1024;
                    azzjVar45.ad = j43;
                }
            }
            if ((azzjVar.c & 2048) != 0) {
                long j44 = azzjVar.ae - azzjVar2.ae;
                if (j44 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar46 = (azzj) createBuilder.instance;
                    azzjVar46.c |= 2048;
                    azzjVar46.ae = j44;
                }
            }
            if ((azzjVar.c & 4096) != 0) {
                long j45 = azzjVar.af - azzjVar2.af;
                if (j45 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar47 = (azzj) createBuilder.instance;
                    azzjVar47.c |= 4096;
                    azzjVar47.af = j45;
                }
            }
            if ((azzjVar.c & 8192) != 0) {
                long j46 = azzjVar.ag - azzjVar2.ag;
                if (j46 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar48 = (azzj) createBuilder.instance;
                    azzjVar48.c |= 8192;
                    azzjVar48.ag = j46;
                }
            }
            if ((azzjVar.c & 16384) != 0) {
                long j47 = azzjVar.ah - azzjVar2.ah;
                if (j47 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar49 = (azzj) createBuilder.instance;
                    azzjVar49.c |= 16384;
                    azzjVar49.ah = j47;
                }
            }
            if ((azzjVar.c & 32768) != 0) {
                long j48 = azzjVar.ai - azzjVar2.ai;
                if (j48 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar50 = (azzj) createBuilder.instance;
                    azzjVar50.c = 32768 | azzjVar50.c;
                    azzjVar50.ai = j48;
                }
            }
            if ((azzjVar.c & 65536) != 0) {
                long j49 = azzjVar.aj - azzjVar2.aj;
                if (j49 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar51 = (azzj) createBuilder.instance;
                    azzjVar51.c |= 65536;
                    azzjVar51.aj = j49;
                }
            }
            if ((azzjVar.c & 131072) != 0) {
                azziVar31 = azzjVar.ak;
                if (azziVar31 == null) {
                    azziVar31 = azzi.a;
                }
            } else {
                azziVar31 = null;
            }
            if ((azzjVar2.c & 131072) != 0) {
                azziVar32 = azzjVar2.ak;
                if (azziVar32 == null) {
                    azziVar32 = azzi.a;
                }
            } else {
                azziVar32 = null;
            }
            azzi j50 = j(azziVar31, azziVar32);
            if (j50 != null) {
                createBuilder.copyOnWrite();
                azzj azzjVar52 = (azzj) createBuilder.instance;
                azzjVar52.ak = j50;
                azzjVar52.c |= 131072;
            }
            if ((azzjVar.c & 262144) != 0) {
                long j51 = azzjVar.al - azzjVar2.al;
                if (j51 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar53 = (azzj) createBuilder.instance;
                    azzjVar53.c |= 262144;
                    azzjVar53.al = j51;
                }
            }
            if ((azzjVar.c & 524288) != 0) {
                long j52 = azzjVar.am - azzjVar2.am;
                if (j52 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar54 = (azzj) createBuilder.instance;
                    azzjVar54.c |= 524288;
                    azzjVar54.am = j52;
                }
            }
            if ((azzjVar.c & 1048576) != 0) {
                long j53 = azzjVar.an - azzjVar2.an;
                if (j53 != 0) {
                    createBuilder.copyOnWrite();
                    azzj azzjVar55 = (azzj) createBuilder.instance;
                    azzjVar55.c |= 1048576;
                    azzjVar55.an = j53;
                }
            }
            azzjVar = (azzj) createBuilder.mo39build();
            if (p(azzjVar)) {
                return null;
            }
        }
        return azzjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(azze azzeVar) {
        return azzeVar == null || (azzeVar.c.size() == 0 && azzeVar.d.size() == 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(azzg azzgVar) {
        if (azzgVar != null) {
            return azzgVar.c <= 0 && azzgVar.d <= 0 && azzgVar.e <= 0 && azzgVar.f <= 0 && azzgVar.g <= 0 && azzgVar.h <= 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean o(azzh azzhVar) {
        return azzhVar == null || (((long) azzhVar.c) <= 0 && ((long) azzhVar.d) <= 0);
    }

    static boolean p(azzj azzjVar) {
        if (azzjVar != null) {
            return azzjVar.d <= 0 && azzjVar.e <= 0 && azzjVar.f <= 0 && azzjVar.g <= 0 && azzjVar.h.size() == 0 && azzjVar.i.size() == 0 && azzjVar.j.size() == 0 && azzjVar.k.size() == 0 && azzjVar.l.size() == 0 && azzjVar.m.size() == 0 && azzjVar.o.size() == 0 && azzjVar.p.size() == 0 && azzjVar.q.size() == 0 && azzjVar.r.size() == 0 && azzjVar.s <= 0 && azzjVar.t <= 0 && azzjVar.u <= 0 && azzjVar.v <= 0 && azzjVar.w <= 0 && azzjVar.x <= 0 && azzjVar.y <= 0 && azzjVar.z <= 0 && azzjVar.A <= 0 && azzjVar.B <= 0 && azzjVar.C <= 0 && azzjVar.D <= 0 && azzjVar.E <= 0 && azzjVar.F <= 0 && azzjVar.H <= 0 && azzjVar.V <= 0 && azzjVar.W <= 0 && azzjVar.X <= 0 && azzjVar.Y <= 0 && azzjVar.Z <= 0 && azzjVar.aa <= 0 && azzjVar.ab <= 0 && azzjVar.ac <= 0 && azzjVar.ad <= 0 && azzjVar.ae <= 0 && azzjVar.af <= 0 && azzjVar.ag <= 0 && azzjVar.ah <= 0 && azzjVar.ai <= 0 && azzjVar.aj <= 0 && azzjVar.al <= 0 && azzjVar.am <= 0 && azzjVar.an <= 0;
        }
        return true;
    }

    @Deprecated
    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void r(eo eoVar) {
        if (a == null) {
            try {
                Method declaredMethod = eo.class.getDeclaredMethod("noteStateNotSaved", new Class[0]);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                a(e);
            }
        }
        try {
            Method method = a;
            method.getClass();
            method.invoke(eoVar, new Object[0]);
        } catch (IllegalAccessException e2) {
            a(e2);
        } catch (InvocationTargetException e3) {
            a(e3);
        }
    }
}
