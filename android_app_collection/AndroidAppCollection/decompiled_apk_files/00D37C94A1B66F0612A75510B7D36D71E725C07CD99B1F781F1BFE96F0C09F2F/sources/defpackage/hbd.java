package defpackage;
/* compiled from: PG */
/* renamed from: hbd  reason: default package */
/* loaded from: classes3.dex */
public final class hbd extends pvn {
    private final hbh a;

    public hbd(hbh hbhVar) {
        this.a = hbhVar;
    }

    @Override // defpackage.pvn
    public final void a(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r0 == 0) goto L42;
     */
    @Override // defpackage.pvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pvo b(defpackage.pke[] r11, com.google.android.exoplayer2.source.TrackGroupArray r12, defpackage.ppz r13, defpackage.pkt r14) {
        /*
            r10 = this;
            int r13 = r11.length
            pvf[] r14 = new defpackage.pvf[r13]
            pkf[] r13 = new defpackage.pkf[r13]
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r12.b
            r4 = 2
            r5 = 1
            if (r2 >= r3) goto L4f
            com.google.android.exoplayer2.source.TrackGroup r3 = r12.b(r2)
            com.google.android.exoplayer2.Format r6 = r3.a(r1)
            java.lang.String r7 = r6.l
            int r7 = defpackage.pwl.b(r7)
            if (r7 == r5) goto L25
            if (r7 == r4) goto L25
            goto L4c
        L25:
            r4 = 0
        L26:
            int r8 = r11.length
            if (r4 >= r8) goto L4c
            r8 = r11[r4]     // Catch: defpackage.phr -> L49
            int r8 = r8.a(r6)     // Catch: defpackage.phr -> L49
            r8 = r8 & 7
            r9 = 4
            if (r8 != r9) goto L49
            r8 = r14[r4]     // Catch: defpackage.phr -> L49
            if (r8 != 0) goto L49
            pvg r8 = new pvg     // Catch: defpackage.phr -> L49
            r8.<init>(r3)     // Catch: defpackage.phr -> L49
            r14[r4] = r8     // Catch: defpackage.phr -> L49
            pkf r8 = defpackage.pkf.a     // Catch: defpackage.phr -> L49
            r13[r4] = r8     // Catch: defpackage.phr -> L49
            if (r7 != r5) goto L4c
            r0.add(r6)     // Catch: defpackage.phr -> L49
            goto L4c
        L49:
            int r4 = r4 + 1
            goto L26
        L4c:
            int r2 = r2 + 1
            goto Lc
        L4f:
            hbh r11 = r10.a
            com.google.android.exoplayer2.Format[] r12 = new com.google.android.exoplayer2.Format[r1]
            java.lang.Object[] r12 = r0.toArray(r12)
            com.google.android.exoplayer2.Format[] r12 = (com.google.android.exoplayer2.Format[]) r12
            int r0 = r12.length
            r11.b = r0
            if (r0 <= r4) goto L69
            java.lang.String r2 = "More than two tracks supplied to AudioMixAudioProcessor"
            defpackage.zep.b(r2)
            r3 = 24
            defpackage.afus.b(r5, r3, r2)
            goto L6c
        L69:
            if (r0 != 0) goto L6c
            goto L81
        L6c:
            r2 = r12[r1]
            int r2 = r2.z
            r11.d = r2
        L72:
            if (r1 >= r0) goto L81
            r2 = r12[r1]
            int r2 = r2.y
            int r3 = r11.a
            if (r2 <= r3) goto L7e
            r11.a = r2
        L7e:
            int r1 = r1 + 1
            goto L72
        L81:
            pvo r11 = new pvo
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
            r11.<init>(r13, r14, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbd.b(pke[], com.google.android.exoplayer2.source.TrackGroupArray, ppz, pkt):pvo");
    }
}
