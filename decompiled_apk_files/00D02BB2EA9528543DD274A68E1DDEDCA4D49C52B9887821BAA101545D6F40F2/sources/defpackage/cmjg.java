package defpackage;

import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: cmjg  reason: default package */
/* loaded from: classes5.dex */
public final class cmjg implements Comparable<cmjg> {
    public final boolean a;
    private final DefaultTrackSelector$Parameters b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
        if (r10 < r8.h) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
        if (r10 < r8.i) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cmjg(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r8, int r9, boolean r10) {
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
            int r5 = r8.b
            if (r4 > r5) goto L33
        L14:
            int r4 = r7.r
            if (r4 == r2) goto L1c
            int r5 = r8.c
            if (r4 > r5) goto L33
        L1c:
            float r4 = r7.s
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L29
            int r5 = r8.d
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L33
        L29:
            int r4 = r7.h
            if (r4 == r2) goto L31
            int r5 = r8.e
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
            int r4 = r8.f
            if (r10 < r4) goto L5e
        L40:
            int r10 = r7.r
            if (r10 == r2) goto L48
            int r4 = r8.g
            if (r10 < r4) goto L5e
        L48:
            float r10 = r7.s
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r8.h
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5e
        L55:
            int r10 = r7.h
            if (r10 == r2) goto L5f
            int r8 = r8.i
            if (r10 < r8) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r6.c = r1
            boolean r8 = defpackage.cmjh.a(r9, r3)
            r6.d = r8
            int r8 = r7.h
            r6.e = r8
            int r7 = r7.c()
            r6.f = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjg.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(cmjg cmjgVar) {
        Object c;
        if (!this.a || !this.d) {
            c = cmjh.a.c();
        } else {
            c = cmjh.a;
        }
        return dbzx.b.h(this.d, cmjgVar.d).h(this.a, cmjgVar.a).h(this.c, cmjgVar.c).b(Integer.valueOf(this.e), Integer.valueOf(cmjgVar.e), this.b.v ? cmjh.a.c() : cmjh.b).b(Integer.valueOf(this.f), Integer.valueOf(cmjgVar.f), c).b(Integer.valueOf(this.e), Integer.valueOf(cmjgVar.e), c).i();
    }
}