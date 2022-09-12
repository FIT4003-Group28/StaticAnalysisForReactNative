package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: cllz  reason: default package */
/* loaded from: classes5.dex */
public final class cllz extends Exception {
    public final int a;
    public final String b;
    public final int c;
    public final Format d;
    public final int e;
    public final int f;
    public final long g;
    public final cmeh h;
    final boolean i;
    private final Throwable j;

    public cllz(int i, Throwable th) {
        this(i, th, null, -1, null, 4, 0, false);
    }

    public static cllz a(RuntimeException runtimeException) {
        return new cllz(2, runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cllz b(cmeh cmehVar) {
        return new cllz(getMessage(), this.j, this.a, this.b, this.c, this.d, this.e, cmehVar, this.f, this.g, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cllz(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, com.google.android.exoplayer2.Format r18, int r19, int r20, boolean r21) {
        /*
            r13 = this;
            r3 = r14
            r7 = r19
            r0 = 2
            if (r3 == 0) goto L85
            r1 = 4
            r2 = 3
            r4 = 1
            if (r3 == r4) goto L22
            if (r3 == r2) goto L1b
            if (r3 == r1) goto L18
            r1 = 5
            if (r3 == r1) goto L15
            java.lang.String r1 = "Unexpected runtime error"
            goto L1d
        L15:
            java.lang.String r1 = "Timeout error"
            goto L1d
        L18:
            java.lang.String r1 = "Out of memory error"
            goto L1d
        L1b:
            java.lang.String r1 = "Remote error"
        L1d:
            r4 = r16
            r6 = r17
            goto L8b
        L22:
            java.lang.String r5 = java.lang.String.valueOf(r18)
            if (r7 == 0) goto L42
            if (r7 == r4) goto L3f
            if (r7 == r0) goto L3c
            if (r7 == r2) goto L39
            if (r7 != r1) goto L33
            java.lang.String r1 = "YES"
            goto L44
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L39:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L44
        L3c:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L44
        L3f:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L44
        L42:
            java.lang.String r1 = "NO"
        L44:
            java.lang.String r2 = java.lang.String.valueOf(r16)
            int r2 = r2.length()
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            int r6 = r1.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r4
            int r2 = r2 + r6
            r8.<init>(r2)
            r4 = r16
            r8.append(r4)
            java.lang.String r2 = " error, index="
            r8.append(r2)
            r6 = r17
            r8.append(r6)
            java.lang.String r2 = ", format="
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = ", format_supported="
            r8.append(r2)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L8b
        L85:
            r4 = r16
            r6 = r17
            java.lang.String r1 = "Source error"
        L8b:
            r2 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto Lbb
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.String r8 = "null"
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r5 = r5 + r0
            int r5 = r5 + r8
            r9.<init>(r5)
            r9.append(r1)
            java.lang.String r0 = ": "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = r9.toString()
            r1 = r0
        Lbb:
            r8 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cllz.<init>(int, java.lang.Throwable, java.lang.String, int, com.google.android.exoplayer2.Format, int, int, boolean):void");
    }

    private cllz(String str, Throwable th, int i, String str2, int i2, Format format, int i3, cmeh cmehVar, int i4, long j, boolean z) {
        super(str, th);
        this.a = i;
        this.j = th;
        this.b = str2;
        this.c = i2;
        this.d = format;
        this.e = i3;
        this.h = cmehVar;
        this.f = i4;
        this.g = j;
        this.i = z;
    }
}
