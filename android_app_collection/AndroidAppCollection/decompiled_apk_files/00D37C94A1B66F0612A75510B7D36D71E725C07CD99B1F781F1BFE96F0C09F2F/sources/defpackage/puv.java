package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: puv  reason: default package */
/* loaded from: classes4.dex */
public final class puv extends puw {
    private final awx d;
    private final amuk e;
    private float f;
    private int g;
    private int h;
    private long i;
    private psb j;

    /* JADX INFO: Access modifiers changed from: protected */
    public puv(TrackGroup trackGroup, int[] iArr, awx awxVar, List list) {
        super(trackGroup, iArr, null);
        this.d = awxVar;
        this.e = amuk.o(list);
        this.f = 1.0f;
        this.h = 0;
        this.i = -9223372036854775807L;
    }

    public static void e(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            amuf amufVar = (amuf) list.get(i);
            if (amufVar != null) {
                amufVar.h(new puu(j, jArr[i]));
            }
        }
    }

    private final int t(long j) {
        long j2;
        long e = (((float) this.d.e()) * 0.7f) / this.f;
        if (!this.e.isEmpty()) {
            int i = 1;
            while (i < this.e.size() - 1 && ((puu) this.e.get(i)).a < e) {
                i++;
            }
            puu puuVar = (puu) this.e.get(i - 1);
            puu puuVar2 = (puu) this.e.get(i);
            long j3 = puuVar.a;
            long j4 = puuVar2.a;
            e = ((((float) (e - j3)) / ((float) (j4 - j3))) * ((float) (puuVar2.b - j2))) + puuVar.b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !r(i3, j)) {
                if (n(i3).h <= e) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private static final void u(List list) {
        if (list.isEmpty()) {
            return;
        }
        psb psbVar = (psb) arey.s(list);
        if (psbVar.k == -9223372036854775807L) {
            return;
        }
        long j = psbVar.l;
    }

    @Override // defpackage.puw, defpackage.pvf
    public final int a(long j, List list) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.i;
        if (j2 == -9223372036854775807L || elapsedRealtime - j2 >= 1000 || (!list.isEmpty() && !((psb) arey.s(list)).equals(this.j))) {
            this.i = elapsedRealtime;
            this.j = list.isEmpty() ? null : (psb) arey.s(list);
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            if (pxi.m(((psb) list.get(size - 1)).k - j, this.f) < 25000000) {
                return size;
            }
            u(list);
            Format n = n(t(elapsedRealtime));
            for (int i3 = 0; i3 < size; i3++) {
                psb psbVar = (psb) list.get(i3);
                Format format = psbVar.h;
                if (pxi.m(psbVar.k - j, this.f) >= 25000000 && format.h < n.h && (i = format.r) != -1 && i < 720 && (i2 = format.q) != -1 && i2 < 1280 && i < n.r) {
                    return i3;
                }
            }
            return size;
        }
        return list.size();
    }

    @Override // defpackage.pvf
    public final int b() {
        return this.g;
    }

    @Override // defpackage.pvf
    public final int c() {
        return this.h;
    }

    @Override // defpackage.pvf
    public final Object d() {
        return null;
    }

    @Override // defpackage.puw, defpackage.pvf
    public final void f() {
        this.j = null;
    }

    @Override // defpackage.puw, defpackage.pvf
    public final void g() {
        this.i = -9223372036854775807L;
        this.j = null;
    }

    @Override // defpackage.puw, defpackage.pvf
    public final void h(float f) {
        this.f = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r9 < r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r9 >= 25000000) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
        r13 = r0;
     */
    @Override // defpackage.pvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r7, long r9, long r11, java.util.List r13, defpackage.psd[] r14) {
        /*
            r6 = this;
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r0 = r6.g
            int r1 = r14.length
            r2 = 0
            if (r0 >= r1) goto L1d
            r0 = r14[r0]
            boolean r0 = r0.b()
            if (r0 == 0) goto L1d
            int r0 = r6.g
            r14 = r14[r0]
            r14.c()
            r14.d()
            goto L34
        L1d:
            if (r2 >= r1) goto L31
            r0 = r14[r2]
            boolean r3 = r0.b()
            if (r3 == 0) goto L2e
            r0.c()
            r0.d()
            goto L34
        L2e:
            int r2 = r2 + 1
            goto L1d
        L31:
            u(r13)
        L34:
            int r14 = r6.h
            if (r14 != 0) goto L42
            r9 = 1
            r6.h = r9
            int r7 = r6.t(r7)
            r6.g = r7
            return
        L42:
            int r0 = r6.g
            boolean r1 = r13.isEmpty()
            r2 = -1
            if (r1 == 0) goto L4d
            r1 = -1
            goto L59
        L4d:
            java.lang.Object r1 = defpackage.arey.s(r13)
            psb r1 = (defpackage.psb) r1
            com.google.android.exoplayer2.Format r1 = r1.h
            int r1 = r6.l(r1)
        L59:
            if (r1 == r2) goto L64
            java.lang.Object r13 = defpackage.arey.s(r13)
            psb r13 = (defpackage.psb) r13
            int r14 = r13.i
            r0 = r1
        L64:
            int r13 = r6.t(r7)
            boolean r7 = r6.r(r0, r7)
            if (r7 != 0) goto La1
            com.google.android.exoplayer2.Format r7 = r6.n(r0)
            com.google.android.exoplayer2.Format r8 = r6.n(r13)
            int r8 = r8.h
            int r7 = r7.h
            if (r8 <= r7) goto L97
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r5 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r5 == 0) goto L92
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 > 0) goto L92
            float r11 = (float) r11
            r12 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r12
            long r3 = (long) r11
        L92:
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L97
            goto La0
        L97:
            if (r8 >= r7) goto La1
            r7 = 25000000(0x17d7840, double:1.2351641E-316)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 < 0) goto La1
        La0:
            r13 = r0
        La1:
            if (r13 != r0) goto La4
            goto La5
        La4:
            r14 = 3
        La5:
            r6.h = r14
            r6.g = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puv.i(long, long, long, java.util.List, psd[]):void");
    }
}
