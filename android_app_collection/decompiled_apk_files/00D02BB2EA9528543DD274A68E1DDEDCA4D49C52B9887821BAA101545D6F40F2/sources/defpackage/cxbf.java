package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxbf  reason: default package */
/* loaded from: classes5.dex */
public final class cxbf implements cwwr, cwqx {
    private final cwrb a;
    private final dzsj<cxbl> b;
    private final dzsj<Boolean> c;

    public cxbf(cwrb cwrbVar, dzsj<cxbl> dzsjVar, dzsj<Boolean> dzsjVar2) {
        this.a = cwrbVar;
        this.b = dzsjVar;
        this.c = dzsjVar2;
    }

    private static eaao a(cxaz cxazVar) {
        eaan bZ = eaao.f.bZ();
        if (cxazVar.a != null) {
            String str = cxazVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaao eaaoVar = (eaao) bZ.b;
            str.getClass();
            eaaoVar.a |= 1;
            eaaoVar.b = str;
        }
        if (cxazVar.b != null) {
            long longValue = cxazVar.b.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaao eaaoVar2 = (eaao) bZ.b;
            eaaoVar2.a |= 2;
            eaaoVar2.c = longValue;
        }
        if (cxazVar.c != null) {
            long longValue2 = cxazVar.c.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaao eaaoVar3 = (eaao) bZ.b;
            eaaoVar3.a |= 4;
            eaaoVar3.d = longValue2;
        }
        if (cxazVar.d != null) {
            long longValue3 = cxazVar.d.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaao eaaoVar4 = (eaao) bZ.b;
            eaaoVar4.a |= 8;
            eaaoVar4.e = longValue3;
        }
        return bZ.bK();
    }

    private static long c(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.a.b(this);
    }

    @Override // defpackage.cwqx
    public final void b(Activity activity) {
        Long l;
        dbsg dbsgVar;
        FileInputStream fileInputStream;
        int i;
        boolean z;
        this.a.b(this);
        cxbe cxbeVar = cxbe.a;
        if (cxbeVar.f > 0) {
            long j = cxbeVar.b ? cxbeVar.c : cxbeVar.e;
            if (j <= 0 || cxbeVar.f < j) {
                return;
            }
            final eaap bZ = eaar.n.bZ();
            boolean z2 = cxbeVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaar eaarVar = (eaar) bZ.b;
            eaarVar.a |= 512;
            eaarVar.j = z2;
            cxbd cxbdVar = cxbeVar.i;
            if (cxbdVar.a) {
                long j2 = cxbeVar.c;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar2 = (eaar) bZ.b;
                eaarVar2.a |= 16;
                eaarVar2.e = j2;
                l = Long.valueOf(j2);
            } else {
                l = null;
            }
            if (cxbdVar.b) {
                long j3 = cxbeVar.d;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar3 = (eaar) bZ.b;
                eaarVar3.a |= 32;
                eaarVar3.f = j3;
                l = Long.valueOf(c(l, j3));
            }
            if (cxbdVar.c) {
                long j4 = cxbeVar.e;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar4 = (eaar) bZ.b;
                eaarVar4.a |= 64;
                eaarVar4.g = j4;
                l = Long.valueOf(c(l, j4));
            }
            if (cxbdVar.d) {
                long j5 = cxbeVar.f;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar5 = (eaar) bZ.b;
                eaarVar5.a |= 128;
                eaarVar5.h = j5;
                l = Long.valueOf(c(l, j5));
            }
            if (cxbdVar.e) {
                long j6 = cxbeVar.g;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar6 = (eaar) bZ.b;
                eaarVar6.a |= 256;
                eaarVar6.i = j6;
                l = Long.valueOf(c(l, j6));
            }
            if (cxbeVar.j.b != null) {
                eaao a = a(cxbeVar.j);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar7 = (eaar) bZ.b;
                a.getClass();
                eaarVar7.k = a;
                eaarVar7.a |= 1024;
                if ((a.a & 2) != 0) {
                    l = Long.valueOf(c(l, a.c));
                }
                if ((a.a & 4) != 0) {
                    l = Long.valueOf(c(l, a.d));
                }
                if ((a.a & 8) != 0) {
                    l = Long.valueOf(c(l, a.e));
                }
            }
            if (cxbeVar.k.b != null) {
                eaao a2 = a(cxbeVar.k);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar8 = (eaar) bZ.b;
                a2.getClass();
                eaarVar8.l = a2;
                eaarVar8.a |= 2048;
                if ((a2.a & 2) != 0) {
                    l = Long.valueOf(c(l, a2.c));
                }
                if ((a2.a & 4) != 0) {
                    l = Long.valueOf(c(l, a2.d));
                }
                if ((a2.a & 8) != 0) {
                    l = Long.valueOf(c(l, a2.e));
                }
            }
            dbsg<Long> dbsgVar2 = cxbn.a;
            if (dbsgVar2 == null) {
                long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                dbsg i2 = sysconf > 0 ? dbsg.i(Long.valueOf(sysconf)) : dbpy.a;
                if (!i2.a()) {
                    dbsgVar2 = dbpy.a;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    byte[] bArr = new byte[440];
                    try {
                        try {
                            fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                        } catch (IOException unused) {
                            dbsgVar = dbpy.a;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                        try {
                            int read = fileInputStream.read(bArr);
                            fileInputStream.close();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= read) {
                                    i3 = 0;
                                    break;
                                } else if (bArr[i3] == 40) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i3 == 0 || (i = i3 + 16) >= read) {
                                dbsgVar = dbpy.a;
                            } else {
                                while (true) {
                                    if (i <= i3) {
                                        z = false;
                                        break;
                                    } else if (bArr[i] == 41) {
                                        i3 = i;
                                        z = true;
                                        break;
                                    } else {
                                        i--;
                                    }
                                }
                                if (!z) {
                                    dbsgVar = dbpy.a;
                                } else {
                                    long j7 = 0;
                                    int i4 = 1;
                                    while (true) {
                                        if (i3 >= read) {
                                            break;
                                        }
                                        byte b = bArr[i3];
                                        if (b == 32) {
                                            int i5 = i4 + 1;
                                            if (i4 != 21) {
                                                i4 = i5;
                                                i3++;
                                            } else if (j7 > 0) {
                                                dbsgVar = dbsg.i(Long.valueOf(j7));
                                            }
                                        } else {
                                            if (i4 == 21) {
                                                if (j7 > 922337203685477580L) {
                                                    break;
                                                }
                                                long j8 = j7 * 10;
                                                if (b < 48 || b > 57) {
                                                    break;
                                                }
                                                j7 = j8 + (b - 48);
                                                i4 = 21;
                                            } else {
                                                continue;
                                            }
                                            i3++;
                                        }
                                    }
                                    dbsgVar = dbpy.a;
                                }
                            }
                            dbsgVar2 = !dbsgVar.a() ? dbpy.a : dbsg.i(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) dbsgVar.b()).longValue()) / ((Long) i2.b()).longValue()));
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                deki.a(th, th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th3;
                    }
                }
                cxbn.a = dbsgVar2;
            }
            if (dbsgVar2.a()) {
                Long b2 = dbsgVar2.b();
                long longValue = b2.longValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar9 = (eaar) bZ.b;
                eaarVar9.a |= 2;
                eaarVar9.c = longValue;
                l = Long.valueOf(c(l, b2.longValue()));
            }
            if (Build.VERSION.SDK_INT >= 24) {
                long startElapsedRealtime = Process.getStartElapsedRealtime();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaar eaarVar10 = (eaar) bZ.b;
                eaarVar10.a |= 4;
                eaarVar10.d = startElapsedRealtime;
                l = Long.valueOf(c(l, startElapsedRealtime));
            }
            if (l != null) {
                long longValue2 = l.longValue();
                boolean booleanValue = this.c.a().booleanValue();
                if (longValue2 != 0) {
                    if (!booleanValue) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar11 = (eaar) bZ.b;
                        eaarVar11.a |= 1;
                        eaarVar11.b = longValue2;
                    }
                    eaar eaarVar12 = (eaar) bZ.b;
                    if ((eaarVar12.a & 16) != 0) {
                        long j9 = eaarVar12.e - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar13 = (eaar) bZ.b;
                        eaarVar13.a |= 16;
                        eaarVar13.e = j9;
                    }
                    eaar eaarVar14 = (eaar) bZ.b;
                    if ((eaarVar14.a & 32) != 0) {
                        long j10 = eaarVar14.f - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar15 = (eaar) bZ.b;
                        eaarVar15.a |= 32;
                        eaarVar15.f = j10;
                    }
                    eaar eaarVar16 = (eaar) bZ.b;
                    if ((eaarVar16.a & 64) != 0) {
                        long j11 = eaarVar16.g - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar17 = (eaar) bZ.b;
                        eaarVar17.a |= 64;
                        eaarVar17.g = j11;
                    }
                    eaar eaarVar18 = (eaar) bZ.b;
                    if ((eaarVar18.a & 128) != 0) {
                        long j12 = eaarVar18.h - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar19 = (eaar) bZ.b;
                        eaarVar19.a |= 128;
                        eaarVar19.h = j12;
                    }
                    eaar eaarVar20 = (eaar) bZ.b;
                    if ((eaarVar20.a & 256) != 0) {
                        long j13 = eaarVar20.i - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar21 = (eaar) bZ.b;
                        eaarVar21.a |= 256;
                        eaarVar21.i = j13;
                    }
                    eaar eaarVar22 = (eaar) bZ.b;
                    if ((eaarVar22.a & 1024) != 0) {
                        eaao eaaoVar = eaarVar22.k;
                        if (eaaoVar == null) {
                            eaaoVar = eaao.f;
                        }
                        dsqp dsqpVar = (dsqp) eaaoVar.cu(5);
                        dsqpVar.bC(eaaoVar);
                        eaan eaanVar = (eaan) dsqpVar;
                        eaao eaaoVar2 = (eaao) eaanVar.b;
                        if ((eaaoVar2.a & 2) != 0) {
                            long j14 = eaaoVar2.c - longValue2;
                            if (eaanVar.c) {
                                eaanVar.bF();
                                eaanVar.c = false;
                            }
                            eaao eaaoVar3 = (eaao) eaanVar.b;
                            eaaoVar3.a |= 2;
                            eaaoVar3.c = j14;
                        }
                        eaao eaaoVar4 = (eaao) eaanVar.b;
                        if ((eaaoVar4.a & 4) != 0) {
                            long j15 = eaaoVar4.d - longValue2;
                            if (eaanVar.c) {
                                eaanVar.bF();
                                eaanVar.c = false;
                            }
                            eaao eaaoVar5 = (eaao) eaanVar.b;
                            eaaoVar5.a |= 4;
                            eaaoVar5.d = j15;
                        }
                        eaao eaaoVar6 = (eaao) eaanVar.b;
                        if ((eaaoVar6.a & 8) != 0) {
                            long j16 = eaaoVar6.e - longValue2;
                            if (eaanVar.c) {
                                eaanVar.bF();
                                eaanVar.c = false;
                            }
                            eaao eaaoVar7 = (eaao) eaanVar.b;
                            eaaoVar7.a |= 8;
                            eaaoVar7.e = j16;
                        }
                        eaao bK = eaanVar.bK();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar23 = (eaar) bZ.b;
                        bK.getClass();
                        eaarVar23.k = bK;
                        eaarVar23.a |= 1024;
                    }
                    eaar eaarVar24 = (eaar) bZ.b;
                    if ((eaarVar24.a & 2048) != 0) {
                        eaao eaaoVar8 = eaarVar24.l;
                        if (eaaoVar8 == null) {
                            eaaoVar8 = eaao.f;
                        }
                        dsqp dsqpVar2 = (dsqp) eaaoVar8.cu(5);
                        dsqpVar2.bC(eaaoVar8);
                        eaan eaanVar2 = (eaan) dsqpVar2;
                        eaao eaaoVar9 = (eaao) eaanVar2.b;
                        if ((eaaoVar9.a & 2) != 0) {
                            long j17 = eaaoVar9.c - longValue2;
                            if (eaanVar2.c) {
                                eaanVar2.bF();
                                eaanVar2.c = false;
                            }
                            eaao eaaoVar10 = (eaao) eaanVar2.b;
                            eaaoVar10.a |= 2;
                            eaaoVar10.c = j17;
                        }
                        eaao eaaoVar11 = (eaao) eaanVar2.b;
                        if ((eaaoVar11.a & 4) != 0) {
                            long j18 = eaaoVar11.d - longValue2;
                            if (eaanVar2.c) {
                                eaanVar2.bF();
                                eaanVar2.c = false;
                            }
                            eaao eaaoVar12 = (eaao) eaanVar2.b;
                            eaaoVar12.a |= 4;
                            eaaoVar12.d = j18;
                        }
                        eaao eaaoVar13 = (eaao) eaanVar2.b;
                        if ((eaaoVar13.a & 8) != 0) {
                            long j19 = eaaoVar13.e - longValue2;
                            if (eaanVar2.c) {
                                eaanVar2.bF();
                                eaanVar2.c = false;
                            }
                            eaao eaaoVar14 = (eaao) eaanVar2.b;
                            eaaoVar14.a |= 8;
                            eaaoVar14.e = j19;
                        }
                        eaao bK2 = eaanVar2.bK();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar25 = (eaar) bZ.b;
                        bK2.getClass();
                        eaarVar25.l = bK2;
                        eaarVar25.a |= 2048;
                    }
                    eaar eaarVar26 = (eaar) bZ.b;
                    if ((eaarVar26.a & 4) != 0) {
                        long j20 = eaarVar26.d - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar27 = (eaar) bZ.b;
                        eaarVar27.a |= 4;
                        eaarVar27.d = j20;
                    }
                    eaar eaarVar28 = (eaar) bZ.b;
                    if ((eaarVar28.a & 2) != 0) {
                        long j21 = eaarVar28.c - longValue2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        eaar eaarVar29 = (eaar) bZ.b;
                        eaarVar29.a |= 2;
                        eaarVar29.c = j21;
                    }
                }
            }
            cwsv cwsvVar = cxbeVar.h;
            final cxbl a3 = this.b.a();
            final String d = cwsv.d(cwsvVar);
            cwtl.a(deha.f(new deff(a3, bZ, d) { // from class: cxbh
                private final cxbl a;
                private final eaap b;
                private final String c;

                {
                    this.a = a3;
                    this.b = bZ;
                    this.c = d;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    final cxbl cxblVar = this.a;
                    final eaap eaapVar = this.b;
                    final String str = this.c;
                    if (!cxblVar.a.a()) {
                        return dehk.a;
                    }
                    if (cxbe.a.c <= 0) {
                        return dehk.a;
                    }
                    cwts a4 = cxblVar.b.a();
                    a4.d().c(cxbi.a);
                    final dehn a5 = deha.a(dbpy.a);
                    a4.c().c(cxbj.a);
                    final dehn a6 = deha.a(dbpy.a);
                    return deha.k(a5, a6).a(new deff(cxblVar, eaapVar, a5, a6, str) { // from class: cxbk
                        private final cxbl a;
                        private final eaap b;
                        private final dehn c;
                        private final dehn d;
                        private final String e;

                        {
                            this.a = cxblVar;
                            this.b = eaapVar;
                            this.c = a5;
                            this.d = a6;
                            this.e = str;
                        }

                        @Override // defpackage.deff
                        public final dehn a() {
                            cxbl cxblVar2 = this.a;
                            eaap eaapVar2 = this.b;
                            dehn dehnVar = this.c;
                            dehn dehnVar2 = this.d;
                            String str2 = this.e;
                            try {
                                Map map = (Map) ((dbsg) deha.r(dehnVar)).f();
                                if (map != null) {
                                    long j22 = ((eaar) eaapVar2.b).b;
                                    for (Map.Entry entry : map.entrySet()) {
                                        int intValue = ((Integer) entry.getKey()).intValue();
                                        long longValue3 = ((Long) entry.getValue()).longValue() - j22;
                                        if (eaapVar2.c) {
                                            eaapVar2.bF();
                                            eaapVar2.c = false;
                                        }
                                        eaar eaarVar30 = (eaar) eaapVar2.b;
                                        dssd<Integer, Long> dssdVar = eaarVar30.m;
                                        if (!dssdVar.a) {
                                            eaarVar30.m = dssdVar.a();
                                        }
                                        eaarVar30.m.put(Integer.valueOf(intValue), Long.valueOf(longValue3));
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                            cwwo cwwoVar = cxblVar2.a;
                            cwwi f = cwwj.f();
                            eacc bZ2 = eacd.u.bZ();
                            eaah bZ3 = eaaj.f.bZ();
                            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            eaaj eaajVar = (eaaj) bZ3.b;
                            eaajVar.a |= 1;
                            eaajVar.b = leastSignificantBits;
                            eaaj eaajVar2 = (eaaj) bZ3.b;
                            eaajVar2.c = 2;
                            eaajVar2.a = 2 | eaajVar2.a;
                            eaar bK3 = eaapVar2.bK();
                            bK3.getClass();
                            eaajVar2.e = bK3;
                            eaajVar2.a |= 16;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            eacd eacdVar = (eacd) bZ2.b;
                            eaaj bK4 = bZ3.bK();
                            bK4.getClass();
                            eacdVar.n = bK4;
                            eacdVar.a |= 32768;
                            f.c(bZ2.bK());
                            cwwf cwwfVar = (cwwf) f;
                            cwwfVar.b = (dzze) ((dbsg) deha.r(dehnVar2)).f();
                            cwwfVar.c = str2;
                            return cwwoVar.c(f.a());
                        }
                    }, dege.a);
                }
            }, a3.c));
        }
    }

    @Override // defpackage.cwwr
    public final void g() {
        this.a.a(this);
    }
}
