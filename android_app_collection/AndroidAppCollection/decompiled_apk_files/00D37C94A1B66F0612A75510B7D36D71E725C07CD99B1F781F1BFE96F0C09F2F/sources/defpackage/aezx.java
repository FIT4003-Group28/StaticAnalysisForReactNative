package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aezx  reason: default package */
/* loaded from: classes.dex */
final class aezx extends puw {
    private final pvf d;
    private final amsa e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aezx(defpackage.pvf r6, int[] r7, int[] r8) {
        /*
            r5 = this;
            int r0 = r7.length
            com.google.android.exoplayer2.Format[] r0 = new com.google.android.exoplayer2.Format[r0]
            r1 = 0
            r2 = 0
        L5:
            int r3 = r7.length
            if (r2 >= r3) goto L17
            com.google.android.exoplayer2.source.TrackGroup r3 = r6.p()
            r4 = r7[r2]
            com.google.android.exoplayer2.Format r3 = r3.a(r4)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5
        L17:
            com.google.android.exoplayer2.source.TrackGroup r2 = new com.google.android.exoplayer2.source.TrackGroup
            r2.<init>(r0)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3 = 0
        L22:
            int r4 = r7.length
            if (r3 >= r4) goto L2d
            r4 = r7[r3]
            r0.put(r4, r3)
            int r3 = r3 + 1
            goto L22
        L2d:
            int r7 = r8.length
            int[] r7 = new int[r7]
            r3 = 0
        L31:
            int r4 = r8.length
            if (r3 >= r4) goto L3f
            r4 = r8[r3]
            int r4 = r0.get(r4)
            r7[r3] = r4
            int r3 = r3 + 1
            goto L31
        L3f:
            r5.<init>(r2, r7)
            r7 = 1
            if (r4 <= 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            defpackage.afms.b(r0)
            int r0 = r6.m()
            if (r4 > r0) goto L52
            goto L53
        L52:
            r7 = 0
        L53:
            int r0 = r6.m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "length."
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ";parent."
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.afms.c(r7, r0)
            r5.d = r6
            amtu r7 = defpackage.amtu.g(r4)
            r5.e = r7
        L7d:
            int r7 = r8.length
            if (r1 >= r7) goto Ld7
            r7 = r8[r1]
            int r7 = r6.k(r7)
            r0 = -1
            if (r7 == r0) goto Lbc
            amsa r0 = r5.e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto La1
            amsa r0 = r5.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.put(r7, r2)
            int r1 = r1 + 1
            goto L7d
        La1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r7 = r8[r1]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r0 = 21
            r8.<init>(r0)
            java.lang.String r0 = "duplicate."
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        Lbc:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r7 = r8[r1]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r0 = 28
            r8.<init>(r0)
            java.lang.String r0 = "trackNotInParent."
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezx.<init>(pvf, int[], int[]):void");
    }

    private final int e(int i) {
        Integer num = (Integer) this.e.a().get(Integer.valueOf(i));
        this.e.a();
        num.getClass();
        return num.intValue();
    }

    @Override // defpackage.puw, defpackage.pvf
    public final int a(long j, List list) {
        return this.d.a(j, list);
    }

    @Override // defpackage.pvf
    public final int b() {
        Integer num = (Integer) this.e.get(Integer.valueOf(this.d.b()));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.pvf
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.pvf
    public final Object d() {
        return this.d.d();
    }

    @Override // defpackage.puw, defpackage.pvf
    public final void h(float f) {
        this.d.h(f);
    }

    @Override // defpackage.pvf
    public final void i(long j, long j2, long j3, List list, psd[] psdVarArr) {
        this.d.i(j, j2, j3, list, psdVarArr);
    }

    @Override // defpackage.puw, defpackage.pvf
    public final boolean q(int i, long j) {
        try {
            return this.d.q(e(i), j);
        } catch (NullPointerException e) {
            afus.c(2, 6, "Illegal index in SplitTrackSelection.blacklist.", e);
            return false;
        }
    }

    @Override // defpackage.puw, defpackage.pvf
    public final boolean r(int i, long j) {
        try {
            return this.d.r(e(i), j);
        } catch (NullPointerException e) {
            afus.c(2, 6, "Illegal index in SplitTrackSelection.isBlacklisted.", e);
            return true;
        }
    }
}
