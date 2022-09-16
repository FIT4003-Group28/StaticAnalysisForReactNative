package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: baf  reason: default package */
/* loaded from: classes2.dex */
public final class baf implements aze {
    private static final int[] b;
    private static final int e;
    private final byte[] f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private azh n;
    private bab o;
    private azy p;
    private boolean q;
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] c = pxi.U("#!AMR\n");
    private static final byte[] d = pxi.U("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        b = iArr;
        e = iArr[8];
    }

    public baf() {
        this(null);
    }

    public baf(byte[] bArr) {
        this.f = new byte[1];
        this.l = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x007c, B:33:0x007d, B:34:0x0094), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x007c, B:33:0x007d, B:34:0x0094), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(defpackage.azf r10) {
        /*
            r9 = this;
            int r0 = r9.j
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L96
            r10.l()     // Catch: java.io.EOFException -> L95
            byte[] r0 = r9.f     // Catch: java.io.EOFException -> L95
            r10.j(r0, r1, r3)     // Catch: java.io.EOFException -> L95
            byte[] r0 = r9.f     // Catch: java.io.EOFException -> L95
            r0 = r0[r1]     // Catch: java.io.EOFException -> L95
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L7d
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r9.g     // Catch: java.io.EOFException -> L95
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = defpackage.baf.b     // Catch: java.io.EOFException -> L95
            r0 = r4[r0]     // Catch: java.io.EOFException -> L95
            goto L3f
        L3b:
            int[] r4 = defpackage.baf.a     // Catch: java.io.EOFException -> L95
            r0 = r4[r0]     // Catch: java.io.EOFException -> L95
        L3f:
            r9.i = r0     // Catch: java.io.EOFException -> L95
            r9.j = r0
            int r4 = r9.l
            if (r4 != r2) goto L4a
            r9.l = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L96
            int r4 = r9.m
            int r4 = r4 + r3
            r9.m = r4
            goto L96
        L52:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r4) goto L59
            r10 = r1
        L59:
            int r1 = r10.length()     // Catch: java.io.EOFException -> L95
            int r1 = r1 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L95
            r3.<init>(r1)     // Catch: java.io.EOFException -> L95
            java.lang.String r1 = "Illegal AMR "
            r3.append(r1)     // Catch: java.io.EOFException -> L95
            r3.append(r10)     // Catch: java.io.EOFException -> L95
            java.lang.String r10 = " frame type "
            r3.append(r10)     // Catch: java.io.EOFException -> L95
            r3.append(r0)     // Catch: java.io.EOFException -> L95
            java.lang.String r10 = r3.toString()     // Catch: java.io.EOFException -> L95
            pjq r10 = defpackage.pjq.a(r10, r5)     // Catch: java.io.EOFException -> L95
            throw r10     // Catch: java.io.EOFException -> L95
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L95
            r1 = 42
            r10.<init>(r1)     // Catch: java.io.EOFException -> L95
            java.lang.String r1 = "Invalid padding bits for frame header "
            r10.append(r1)     // Catch: java.io.EOFException -> L95
            r10.append(r0)     // Catch: java.io.EOFException -> L95
            java.lang.String r10 = r10.toString()     // Catch: java.io.EOFException -> L95
            pjq r10 = defpackage.pjq.a(r10, r5)     // Catch: java.io.EOFException -> L95
            throw r10     // Catch: java.io.EOFException -> L95
        L95:
            return r2
        L96:
            bab r4 = r9.o
            int r10 = r4.a(r10, r0, r3)
            if (r10 != r2) goto L9f
            return r2
        L9f:
            int r0 = r9.j
            int r0 = r0 - r10
            r9.j = r0
            if (r0 <= 0) goto La7
            return r1
        La7:
            bab r2 = r9.o
            long r3 = r9.h
            r5 = 1
            int r6 = r9.i
            r7 = 0
            r8 = 0
            r2.e(r3, r5, r6, r7, r8)
            long r2 = r9.h
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baf.a(azf):int");
    }

    private static boolean b(azf azfVar, byte[] bArr) {
        azfVar.l();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        azfVar.j(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean c(azf azfVar) {
        byte[] bArr = c;
        if (b(azfVar, bArr)) {
            this.g = false;
            azfVar.m(bArr.length);
            return true;
        }
        byte[] bArr2 = d;
        if (!b(azfVar, bArr2)) {
            return false;
        }
        this.g = true;
        azfVar.m(bArr2.length);
        return true;
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        ptx.b(this.o);
        int i = pxi.a;
        if (((aza) azfVar).c != 0 || c(azfVar)) {
            if (!this.q) {
                this.q = true;
                boolean z = this.g;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                bab babVar = this.o;
                pis pisVar = new pis();
                pisVar.k = str;
                pisVar.l = e;
                pisVar.x = 1;
                pisVar.y = i2;
                babVar.rx(pisVar.a());
            }
            int a2 = a(azfVar);
            if (!this.k) {
                azx azxVar = new azx(-9223372036854775807L);
                this.p = azxVar;
                this.n.ry(azxVar);
                this.k = true;
            }
            return a2;
        }
        throw pjq.a("Could not find AMR header.", null);
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.n = azhVar;
        this.o = azhVar.pT(0, 1);
        azhVar.b();
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        return c(azfVar);
    }
}
