package defpackage;
/* compiled from: PG */
/* renamed from: ailt  reason: default package */
/* loaded from: classes.dex */
public final class ailt implements ynl {
    final /* synthetic */ ailu a;

    public ailt(ailu ailuVar) {
        this.a = ailuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    @Override // defpackage.ynl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] ky(java.lang.Class r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            r8 = -1
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = 0
            if (r10 == r8) goto Lb3
            if (r10 == 0) goto L49
            if (r10 != r2) goto L30
            aikd r9 = (defpackage.aikd) r9
            ailu r8 = r7.a
            aiml r8 = r8.h
            ailu r9 = r7.a
            aadd r9 = r9.b
            boolean r9 = defpackage.aiix.t(r9)
            if (r9 == 0) goto Lbd
            if (r8 == 0) goto L20
            r8.a()
        L20:
            ailu r8 = r7.a
            aikk r9 = r8.j
            if (r9 == 0) goto Lbd
            android.os.ConditionVariable r8 = r8.k
            if (r8 != 0) goto L2c
            goto Lbd
        L2c:
            r8.open()
            return r3
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 32
            r9.<init>(r0)
            java.lang.String r0 = "unsupported op code: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L49:
            ahhw r9 = (defpackage.ahhw) r9
            ailu r8 = r7.a
            aiml r8 = r8.h
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r10 = r9.b()
            ailu r4 = r7.a
            aadd r4 = r4.b
            boolean r4 = defpackage.aiix.t(r4)
            if (r4 == 0) goto Lbd
            aika r4 = r9.c()
            r5 = 3
            aika[] r5 = new defpackage.aika[r5]
            aika r6 = defpackage.aika.INTERSTITIAL_PLAYING
            r5[r0] = r6
            aika r0 = defpackage.aika.VIDEO_PLAYING
            r5[r2] = r0
            aika r0 = defpackage.aika.ENDED
            r5[r1] = r0
            boolean r0 = r4.a(r5)
            if (r0 != 0) goto L9f
            aika r9 = r9.c()
            aika r0 = defpackage.aika.PLAYBACK_INTERRUPTED
            if (r9 != r0) goto Lbd
            if (r10 == 0) goto Lbd
            aoyb r9 = r10.o()
            if (r9 != 0) goto L87
            goto Lbd
        L87:
            aopu r9 = r9.c
            java.util.Iterator r9 = r9.iterator()
        L8d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r9.next()
            aoyc r10 = (defpackage.aoyc) r10
            int r10 = r10.b
            r10 = r10 & 4
            if (r10 == 0) goto L8d
        L9f:
            if (r8 == 0) goto La4
            r8.a()
        La4:
            ailu r8 = r7.a
            aikk r9 = r8.j
            if (r9 == 0) goto Lbd
            android.os.ConditionVariable r8 = r8.k
            if (r8 != 0) goto Laf
            goto Lbd
        Laf:
            r8.open()
            return r3
        Lb3:
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class<ahhw> r8 = defpackage.ahhw.class
            r3[r0] = r8
            java.lang.Class<aikd> r8 = defpackage.aikd.class
            r3[r2] = r8
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ailt.ky(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
