package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clvr  reason: default package */
/* loaded from: classes5.dex */
public final class clvr implements clun {
    private static final int[] a;
    private static final int[] b;
    private static final byte[] c;
    private static final byte[] d;
    private static final int e;
    private final byte[] f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private long n;
    private clup o;
    private clvk p;
    private clvg q;
    private boolean r;

    static {
        int i = clvq.a;
        a = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        b = iArr;
        c = cmny.t("#!AMR\n");
        d = cmny.t("#!AMR-WB\n");
        e = iArr[8];
    }

    public clvr() {
        this(null);
    }

    public clvr(byte[] bArr) {
        this.f = new byte[1];
        this.l = -1;
    }

    private final boolean a(cluk clukVar) {
        byte[] bArr = c;
        if (b(clukVar, bArr)) {
            this.g = false;
            clukVar.d(bArr.length);
            return true;
        }
        byte[] bArr2 = d;
        if (!b(clukVar, bArr2)) {
            return false;
        }
        this.g = true;
        clukVar.d(bArr2.length);
        return true;
    }

    private static boolean b(cluk clukVar, byte[] bArr) {
        clukVar.i();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        clukVar.f(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[Catch: EOFException -> 0x0096, TryCatch #0 {EOFException -> 0x0096, blocks: (B:4:0x0007, B:6:0x0017, B:20:0x0035, B:22:0x003e, B:21:0x003a, B:28:0x0051, B:31:0x005a, B:32:0x007c, B:33:0x007d, B:34:0x0095), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x0096, TryCatch #0 {EOFException -> 0x0096, blocks: (B:4:0x0007, B:6:0x0017, B:20:0x0035, B:22:0x003e, B:21:0x003a, B:28:0x0051, B:31:0x005a, B:32:0x007c, B:33:0x007d, B:34:0x0095), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(defpackage.cluk r10) {
        /*
            r9 = this;
            int r0 = r9.j
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L97
            r10.i()     // Catch: java.io.EOFException -> L96
            byte[] r0 = r9.f     // Catch: java.io.EOFException -> L96
            r10.f(r0, r1, r3)     // Catch: java.io.EOFException -> L96
            byte[] r0 = r9.f     // Catch: java.io.EOFException -> L96
            r0 = r0[r1]     // Catch: java.io.EOFException -> L96
            r4 = r0 & 131(0x83, float:1.84E-43)
            if (r4 > 0) goto L7d
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r9.g     // Catch: java.io.EOFException -> L96
            if (r4 == 0) goto L28
            r5 = 10
            if (r0 < r5) goto L33
            r5 = 13
            if (r0 <= r5) goto L28
            goto L33
        L28:
            if (r4 != 0) goto L51
            r5 = 12
            if (r0 < r5) goto L33
            r5 = 14
            if (r0 > r5) goto L33
            goto L51
        L33:
            if (r4 == 0) goto L3a
            int[] r4 = defpackage.clvr.b     // Catch: java.io.EOFException -> L96
            r0 = r4[r0]     // Catch: java.io.EOFException -> L96
            goto L3e
        L3a:
            int[] r4 = defpackage.clvr.a     // Catch: java.io.EOFException -> L96
            r0 = r4[r0]     // Catch: java.io.EOFException -> L96
        L3e:
            r9.i = r0     // Catch: java.io.EOFException -> L96
            r9.j = r0
            int r4 = r9.l
            if (r4 != r2) goto L49
            r9.l = r0
            r4 = r0
        L49:
            if (r4 != r0) goto L97
            int r4 = r9.m
            int r4 = r4 + r3
            r9.m = r4
            goto L97
        L51:
            clob r10 = new clob     // Catch: java.io.EOFException -> L96
            java.lang.String r1 = "WB"
            java.lang.String r5 = "NB"
            if (r3 == r4) goto L5a
            r1 = r5
        L5a:
            int r3 = r1.length()     // Catch: java.io.EOFException -> L96
            int r3 = r3 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L96
            r4.<init>(r3)     // Catch: java.io.EOFException -> L96
            java.lang.String r3 = "Illegal AMR "
            r4.append(r3)     // Catch: java.io.EOFException -> L96
            r4.append(r1)     // Catch: java.io.EOFException -> L96
            java.lang.String r1 = " frame type "
            r4.append(r1)     // Catch: java.io.EOFException -> L96
            r4.append(r0)     // Catch: java.io.EOFException -> L96
            java.lang.String r0 = r4.toString()     // Catch: java.io.EOFException -> L96
            r10.<init>(r0)     // Catch: java.io.EOFException -> L96
            throw r10     // Catch: java.io.EOFException -> L96
        L7d:
            clob r10 = new clob     // Catch: java.io.EOFException -> L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L96
            r3 = 42
            r1.<init>(r3)     // Catch: java.io.EOFException -> L96
            java.lang.String r3 = "Invalid padding bits for frame header "
            r1.append(r3)     // Catch: java.io.EOFException -> L96
            r1.append(r0)     // Catch: java.io.EOFException -> L96
            java.lang.String r0 = r1.toString()     // Catch: java.io.EOFException -> L96
            r10.<init>(r0)     // Catch: java.io.EOFException -> L96
            throw r10     // Catch: java.io.EOFException -> L96
        L96:
            return r2
        L97:
            clvk r4 = r9.p
            int r10 = r4.c(r10, r0, r3)
            if (r10 != r2) goto La0
            return r2
        La0:
            int r0 = r9.j
            int r0 = r0 - r10
            r9.j = r0
            if (r0 <= 0) goto La8
            return r1
        La8:
            clvk r2 = r9.p
            long r3 = r9.h
            r5 = 1
            int r6 = r9.i
            r7 = 0
            r8 = 0
            r2.b(r3, r5, r6, r7, r8)
            long r2 = r9.h
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clvr.c(cluk):int");
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.o = clupVar;
        this.p = clupVar.RT(0);
        clupVar.RS();
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
        this.n = 0L;
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        return a(clukVar);
    }

    @Override // defpackage.clun
    public final int g(cluk clukVar, clvd clvdVar) {
        cmmn.e(this.p);
        int i = cmny.a;
        if (clukVar.c != 0 || a(clukVar)) {
            if (!this.r) {
                this.r = true;
                boolean z = this.g;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                clvk clvkVar = this.p;
                clnf clnfVar = new clnf();
                clnfVar.k = str;
                clnfVar.l = e;
                clnfVar.x = 1;
                clnfVar.y = i2;
                clvkVar.a(clnfVar.a());
            }
            int c2 = c(clukVar);
            if (!this.k) {
                clvf clvfVar = new clvf(-9223372036854775807L);
                this.q = clvfVar;
                this.o.b(clvfVar);
                this.k = true;
            }
            return c2;
        }
        throw new clob("Could not find AMR header.");
    }
}
