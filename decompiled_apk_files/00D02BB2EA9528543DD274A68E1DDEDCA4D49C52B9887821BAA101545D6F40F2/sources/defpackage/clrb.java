package defpackage;
/* compiled from: PG */
/* renamed from: clrb  reason: default package */
/* loaded from: classes5.dex */
public final class clrb {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r10 != 11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
        if (r10 != 11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
        if (r10 != 8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.clra a(defpackage.cmnj r10) {
        /*
            r0 = 16
            int r1 = r10.j(r0)
            int r0 = r10.j(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.j(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r3 = r10.j(r1)
            r4 = 3
            if (r3 != r4) goto L32
        L29:
            r10.j(r1)
            boolean r3 = r10.i()
            if (r3 != 0) goto L29
        L32:
            r3 = 10
            int r3 = r10.j(r3)
            boolean r5 = r10.i()
            if (r5 == 0) goto L47
            int r5 = r10.j(r4)
            if (r5 <= 0) goto L47
            r10.h(r1)
        L47:
            boolean r5 = r10.i()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L58
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L5b
        L58:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L5b:
            int r10 = r10.j(r2)
            r9 = 0
            if (r5 != r6) goto L6b
            r6 = 13
            if (r10 != r6) goto L6b
            int[] r10 = defpackage.clrb.b
            r9 = r10[r6]
            goto L96
        L6b:
            if (r5 != r7) goto L96
            r6 = 14
            if (r10 >= r6) goto L96
            int[] r6 = defpackage.clrb.b
            r9 = r6[r10]
            int r3 = r3 % 5
            r6 = 8
            if (r3 == r8) goto L90
            r7 = 11
            if (r3 == r1) goto L8b
            if (r3 == r4) goto L90
            if (r3 == r2) goto L84
            goto L96
        L84:
            if (r10 == r4) goto L94
            if (r10 == r6) goto L94
            if (r10 != r7) goto L96
            goto L94
        L8b:
            if (r10 == r6) goto L94
            if (r10 != r7) goto L96
            goto L94
        L90:
            if (r10 == r4) goto L94
            if (r10 != r6) goto L96
        L94:
            int r9 = r9 + 1
        L96:
            clra r10 = new clra
            r10.<init>(r5, r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clrb.a(cmnj):clra");
    }

    public static void b(int i, cmnk cmnkVar) {
        cmnkVar.a(7);
        byte[] bArr = cmnkVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }
}
