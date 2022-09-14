package defpackage;
/* compiled from: PG */
/* renamed from: clqy  reason: default package */
/* loaded from: classes5.dex */
public final class clqy {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static clqx a(byte[] bArr) {
        return b(new cmnj(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (r12 != 3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.clqx b(defpackage.cmnj r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clqy.b(cmnj, boolean):clqx");
    }

    public static int c(int i) {
        if (i != 2) {
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i == 22) {
                return 1073741824;
            }
            return i != 23 ? 0 : 15;
        }
        return 10;
    }

    private static int d(cmnj cmnjVar) {
        int j = cmnjVar.j(5);
        return j == 31 ? cmnjVar.j(6) + 32 : j;
    }

    private static int e(cmnj cmnjVar) {
        int j = cmnjVar.j(4);
        if (j == 15) {
            return cmnjVar.j(24);
        }
        cmmn.a(j < 13);
        return b[j];
    }
}
