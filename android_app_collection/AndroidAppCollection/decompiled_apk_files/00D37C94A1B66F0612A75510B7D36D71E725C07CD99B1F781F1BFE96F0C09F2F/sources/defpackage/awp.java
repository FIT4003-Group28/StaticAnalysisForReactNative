package defpackage;
/* compiled from: PG */
/* renamed from: awp  reason: default package */
/* loaded from: classes2.dex */
public final class awp implements avw {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // defpackage.avw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.avx b(defpackage.avv r5) {
        /*
            r4 = this;
            android.view.Surface r0 = r5.d
            avz r1 = r5.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            defpackage.ptx.a(r1)     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            avz r1 = r5.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            java.lang.String r1 = r1.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            java.lang.String r2 = "createCodec:"
            int r3 = r1.length()     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            if (r3 == 0) goto L16
            r2.concat(r1)     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
        L16:
            int r2 = defpackage.pxi.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r1)     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            android.media.MediaFormat r2 = r5.b     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            android.media.MediaCrypto r5 = r5.e     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            r3 = 0
            r1.configure(r2, r0, r5, r3)     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            r1.start()     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            awq r5 = new awq     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            r5.<init>(r1)     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            return r5
        L2d:
            r5 = move-exception
            goto L35
        L2f:
            r5 = move-exception
            goto L35
        L31:
            r5 = move-exception
            goto L34
        L33:
            r5 = move-exception
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L3a
            r1.release()
        L3a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awp.b(avv):avx");
    }
}
