package defpackage;

import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: pvc  reason: default package */
/* loaded from: classes4.dex */
public final class pvc implements Comparable {
    public final boolean a;
    private final DefaultTrackSelector$Parameters b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
        if (r10 < r8.t) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
        if (r10 < r8.u) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pvc(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.b = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            r2 = -1
            r3 = 0
            if (r10 == 0) goto L33
            int r4 = r7.q
            if (r4 == r2) goto L14
            int r5 = r8.n
            if (r4 > r5) goto L33
        L14:
            int r4 = r7.r
            if (r4 == r2) goto L1c
            int r5 = r8.o
            if (r4 > r5) goto L33
        L1c:
            float r4 = r7.s
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L29
            int r5 = r8.p
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L33
        L29:
            int r4 = r7.h
            if (r4 == r2) goto L31
            int r5 = r8.q
            if (r4 > r5) goto L33
        L31:
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            r6.a = r4
            if (r10 == 0) goto L5e
            int r10 = r7.q
            if (r10 == r2) goto L40
            int r4 = r8.r
            if (r10 < r4) goto L5e
        L40:
            int r10 = r7.r
            if (r10 == r2) goto L48
            int r4 = r8.s
            if (r10 < r4) goto L5e
        L48:
            float r10 = r7.s
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r8.t
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5e
        L55:
            int r10 = r7.h
            if (r10 == r2) goto L5f
            int r0 = r8.u
            if (r10 < r0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r6.c = r1
            boolean r9 = defpackage.pvd.e(r9, r3)
            r6.d = r9
            int r9 = r7.h
            r6.e = r9
            int r9 = r7.a()
            r6.f = r9
        L71:
            amuk r9 = r8.y
            int r9 = r9.size()
            if (r3 >= r9) goto L8d
            java.lang.String r9 = r7.l
            if (r9 == 0) goto L8a
            amuk r10 = r8.y
            java.lang.Object r10 = r10.get(r3)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L8a
            goto L90
        L8a:
            int r3 = r3 + 1
            goto L71
        L8d:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L90:
            r6.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvc.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(pvc pvcVar) {
        amxr a;
        if (!this.a || !this.d) {
            a = pvd.a.a();
        } else {
            a = pvd.a;
        }
        return amsu.b.e(this.d, pvcVar.d).e(this.a, pvcVar.a).e(this.c, pvcVar.c).d(Integer.valueOf(this.g), Integer.valueOf(pvcVar.g), amyi.a).d(Integer.valueOf(this.e), Integer.valueOf(pvcVar.e), this.b.H ? pvd.a.a() : pvd.b).d(Integer.valueOf(this.f), Integer.valueOf(pvcVar.f), a).d(Integer.valueOf(this.e), Integer.valueOf(pvcVar.e), a).a();
    }
}
