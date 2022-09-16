package defpackage;
/* compiled from: PG */
/* renamed from: nto  reason: default package */
/* loaded from: classes3.dex */
public final class nto implements nsw {
    private final nsk a;
    private final nrl b;

    public nto(nsk nskVar, nrl nrlVar) {
        this.a = nskVar;
        this.b = nrlVar;
    }

    private static nsr e(int i, int i2, int i3, nsr nsrVar) {
        if (i3 < i / 2) {
            return nsrVar;
        }
        if (i3 > (i2 + i) / 2) {
            return nsr.HIDDEN;
        }
        return nsr.EXPANDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r7 < r0) goto L14;
     */
    @Override // defpackage.nsw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nsr a(defpackage.ntd r6, int r7) {
        /*
            r5 = this;
            nrl r0 = r5.b
            boolean r0 = r0.e()
            nrl r1 = r5.b
            amvn r1 = r1.a()
            ampq r0 = r5.d(r0, r1)
            boolean r1 = r0.h()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.c()
            nsr r4 = defpackage.nsr.FULL_BLEED
            if (r1 != r4) goto L42
            nsk r0 = r5.a
            int r0 = r0.a()
            ntd r1 = defpackage.ntd.NO_FLING
            int r1 = r6.ordinal()
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L35
        L32:
            nsr r6 = defpackage.nsr.HIDDEN
            goto L41
        L35:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L3b:
            nsr r6 = defpackage.nsr.FULL_BLEED
            goto L41
        L3e:
            if (r7 >= r0) goto L32
            goto L3b
        L41:
            return r6
        L42:
            java.lang.Object r0 = r0.c()
            nsr r1 = defpackage.nsr.EXPANDED
            if (r0 != r1) goto L7a
            nsk r0 = r5.a
            int r0 = r0.a()
            nsk r1 = r5.a
            android.graphics.Rect r1 = r1.b()
            ntd r4 = defpackage.ntd.NO_FLING
            int r4 = r6.ordinal()
            if (r4 == 0) goto L71
            if (r4 == r3) goto L6e
            if (r4 != r2) goto L68
            if (r7 >= r0) goto L65
            goto L6e
        L65:
            nsr r6 = defpackage.nsr.HIDDEN
            goto L79
        L68:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L6e:
            nsr r6 = defpackage.nsr.EXPANDED
            goto L79
        L71:
            int r6 = r1.bottom
            nsr r1 = defpackage.nsr.EXPANDED
            nsr r6 = e(r0, r6, r7, r1)
        L79:
            return r6
        L7a:
            nsk r0 = r5.a
            int r0 = r0.a()
            nsk r1 = r5.a
            android.graphics.Rect r1 = r1.b()
            ntd r4 = defpackage.ntd.NO_FLING
            nsr r4 = defpackage.nsr.FULL_BLEED
            int r4 = r6.ordinal()
            if (r4 == 0) goto La8
            if (r4 == r3) goto La0
            if (r4 != r2) goto L9a
            if (r7 >= r0) goto L97
            goto La5
        L97:
            nsr r6 = defpackage.nsr.HIDDEN
            goto Lb0
        L9a:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        La0:
            if (r7 >= r0) goto La5
            nsr r6 = defpackage.nsr.FULL_BLEED
            goto Lb0
        La5:
            nsr r6 = defpackage.nsr.EXPANDED
            goto Lb0
        La8:
            int r6 = r1.bottom
            nsr r1 = defpackage.nsr.FULL_BLEED
            nsr r6 = e(r0, r6, r7, r1)
        Lb0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nto.a(ntd, int):nsr");
    }

    @Override // defpackage.nsw
    public final nsr b(boolean z, amvn amvnVar) {
        return (nsr) d(z, amvnVar).e(nsr.EXPANDED);
    }

    @Override // defpackage.nsw
    public final nsr c(nsr nsrVar) {
        if (nsrVar != nsr.HIDDEN) {
            ampq d = d(this.b.e(), this.b.a());
            if (d.h()) {
                return (nsr) d.c();
            }
        }
        ntd ntdVar = ntd.NO_FLING;
        int ordinal = nsrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return nsr.FULL_BLEED;
            }
            if (ordinal == 2) {
                return nsr.HIDDEN;
            }
            throw new AssertionError(nsrVar);
        }
        return nsr.EXPANDED;
    }

    @Override // defpackage.nsw
    public final ampq d(boolean z, amvn amvnVar) {
        if (!z) {
            return ampq.j(nsr.EXPANDED);
        }
        if (amvnVar.size() == 1) {
            if (amvnVar.contains(aqvi.ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED)) {
                return ampq.j(nsr.FULL_BLEED);
            }
            if (amvnVar.contains(aqvi.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER)) {
                return ampq.j(nsr.EXPANDED);
            }
        }
        return amon.a;
    }
}
