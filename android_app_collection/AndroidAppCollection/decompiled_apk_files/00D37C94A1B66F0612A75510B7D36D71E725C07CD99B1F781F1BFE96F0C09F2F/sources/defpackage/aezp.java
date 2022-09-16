package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezp  reason: default package */
/* loaded from: classes.dex */
public final class aezp extends pkt implements aeys {
    static final Integer a = 0;
    static final Integer b = 0;
    static final long d = TimeUnit.MILLISECONDS.toMicros(1);
    final pjc e;
    final long f;
    final long g;
    final long h;
    final long i;
    final long j;
    final long k;
    final long l;
    final long m;
    final boolean n;
    final long o;
    final long p;
    final long q;
    final int r;
    private final aqwt s;

    /* JADX WARN: Removed duplicated region for block: B:130:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aezp(long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, boolean r45, int r46, defpackage.pjc r47, defpackage.aqwt r48) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezp.<init>(long, long, long, long, long, long, long, long, long, long, long, boolean, int, pjc, aqwt):void");
    }

    static String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "POST_LIVE" : "LIVE_ENDED" : "LIVE_ONGOING";
    }

    public static String k(long j) {
        return j == -9223372036854775807L ? "UNSET" : String.valueOf(phk.d(j));
    }

    private static void l(boolean z, String str) {
        if (z) {
            return;
        }
        afkj.b(afki.MFL, "Illegal Timeline parameter(s): %s", str);
        throw new aezo(str);
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        return obj != b ? -1 : 0;
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        if (i == 0) {
            Integer num = null;
            Integer num2 = z ? a : null;
            if (z) {
                num = b;
            }
            pkrVar.i(num2, num, this.l, -this.j);
            return pkrVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.pkt
    public final boolean equals(Object obj) {
        if (obj instanceof aezp) {
            aezp aezpVar = (aezp) obj;
            if (this.j == aezpVar.j && this.k == aezpVar.k && this.l == aezpVar.l && this.o == aezpVar.o && this.p == aezpVar.p && this.q == aezpVar.q && this.n == aezpVar.n && akzj.f(this.e, aezpVar.e) && this.r == aezpVar.r && akzj.f(this.s, aezpVar.s)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        if (i == 0) {
            pksVar.e(pks.a, this.e, phk.d(this.o), phk.d(this.p), this.n, this.r == 1 && this.i == -1, this.e.c, this.q, afbz.c(this.k, this.j), Math.max(this.j, 0L));
            return pksVar;
        }
        throw new IndexOutOfBoundsException();
    }

    public final long h() {
        return (this.r == 1 && this.i == -1) ? this.f + this.m : this.k;
    }

    @Override // defpackage.pkt
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.j), Long.valueOf(this.k), Long.valueOf(this.l), Long.valueOf(this.o), Long.valueOf(this.p), Long.valueOf(this.q), Boolean.valueOf(this.n), this.e, Integer.valueOf(this.r), this.s});
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        if (i == 0) {
            return b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.pkt
    public final int p() {
        return 1;
    }

    @Override // defpackage.pkt
    public final int q() {
        return 1;
    }

    public final String toString() {
        String format;
        pks y = y(0, new pks());
        Locale locale = Locale.US;
        Object[] objArr = new Object[13];
        objArr[0] = Boolean.valueOf(this.n);
        double d2 = this.j;
        Double.isNaN(d2);
        objArr[1] = Double.valueOf(d2 / 1000000.0d);
        double d3 = this.k;
        Double.isNaN(d3);
        objArr[2] = Double.valueOf(d3 / 1000000.0d);
        double d4 = this.f;
        Double.isNaN(d4);
        objArr[3] = Double.valueOf(d4 / 1000000.0d);
        objArr[4] = Long.valueOf(this.h);
        objArr[5] = Long.valueOf(this.i);
        objArr[6] = Long.valueOf(this.g);
        String str = "TIME_UNSET";
        if (this.o == -9223372036854775807L) {
            format = str;
        } else {
            Locale locale2 = Locale.US;
            double d5 = this.o;
            Double.isNaN(d5);
            format = String.format(locale2, "%.1f sec", Double.valueOf(d5 / 1000000.0d));
        }
        objArr[7] = format;
        if (this.p != -9223372036854775807L) {
            Locale locale3 = Locale.US;
            double d6 = this.p;
            Double.isNaN(d6);
            str = String.format(locale3, "%.1f sec", Double.valueOf(d6 / 1000000.0d));
        }
        objArr[8] = str;
        double d7 = y.q;
        Double.isNaN(d7);
        objArr[9] = Double.valueOf(d7 / 1000000.0d);
        double d8 = y.n;
        Double.isNaN(d8);
        objArr[10] = Double.valueOf(d8 / 1000000.0d);
        double d9 = y.m;
        Double.isNaN(d9);
        objArr[11] = Double.valueOf(d9 / 1000000.0d);
        objArr[12] = i(this.r);
        return String.format(locale, "ManifestlessLiveTimeline (seekable = %b, windowMinMediaTime = %.1f sec, windowMaxMediaTime = %.1f sec, maxMediaTime = %.1f sec, minDvrSequence = %d, maxDvrSequence = %d, maxSequence = %d, utcOffset = %s, windowStartUtc = %s, window.positionInFirstPeriod = %.1f sec, window.duration = %.1f sec, window.defaultPosition = %.1f sec, steamState = %s )", objArr);
    }

    @Override // defpackage.aeys
    public final long A(long j) {
        if (j != 0 && j != -9223372036854775807L && j <= h()) {
            if (j >= (this.h != -1 ? this.j : Math.max(this.j - this.m, d))) {
                long j2 = this.h;
                if (j2 != -1 && j == this.j) {
                    return j2;
                }
                int i = this.r;
                if (i != 3 || j2 != -1) {
                    long j3 = this.k;
                    long j4 = this.m;
                    if (j > j3 - j4) {
                        long j5 = this.i;
                        if (j5 != -1) {
                            return j5;
                        }
                        if (i == 2) {
                            return this.g;
                        }
                    }
                    double d2 = this.f - j;
                    double d3 = j4;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    long max = Math.max(this.g - Math.max((long) Math.ceil(d2 / d3), 0L), 0L);
                    long j6 = this.h;
                    if (j6 != -1) {
                        max = Math.max(max, j6);
                    }
                    long j7 = this.i;
                    return j7 != -1 ? Math.min(max, j7) : max;
                }
                return j / this.m;
            }
        }
        return -1L;
    }
}
