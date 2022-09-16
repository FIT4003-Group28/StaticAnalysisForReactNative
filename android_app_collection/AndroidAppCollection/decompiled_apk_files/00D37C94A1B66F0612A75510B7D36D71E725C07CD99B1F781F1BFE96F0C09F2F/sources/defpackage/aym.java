package defpackage;
/* compiled from: PG */
/* renamed from: aym  reason: default package */
/* loaded from: classes2.dex */
public final class aym {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static agqq a(byte[] bArr) {
        return b(new pwt(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
        if (r12 != 3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.agqq b(defpackage.pwt r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aym.b(pwt, boolean):agqq");
    }

    private static int c(pwt pwtVar) {
        int d = pwtVar.d(5);
        return d == 31 ? pwtVar.d(6) + 32 : d;
    }

    private static int d(pwt pwtVar) {
        int d = pwtVar.d(4);
        if (d == 15) {
            return pwtVar.d(24);
        }
        if (d < 13) {
            return b[d];
        }
        throw pjq.a(null, null);
    }
}
