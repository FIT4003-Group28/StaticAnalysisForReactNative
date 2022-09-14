package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: key  reason: default package */
/* loaded from: classes7.dex */
public final class key implements jzp {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;

    public key(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("CarInputInfo:"));
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append(str);
        sb.append("  hasTouchscreen: ");
        sb.append(z);
        printWriter.println(sb.toString());
        boolean z2 = this.b;
        StringBuilder sb2 = new StringBuilder(str.length() + 28);
        sb2.append(str);
        sb2.append("  hasRotaryController: ");
        sb2.append(z2);
        printWriter.println(sb2.toString());
        boolean z3 = this.c;
        StringBuilder sb3 = new StringBuilder(str.length() + 16);
        sb3.append(str);
        sb3.append("  hasDpad: ");
        sb3.append(z3);
        printWriter.println(sb3.toString());
        boolean z4 = this.d;
        StringBuilder sb4 = new StringBuilder(str.length() + 20);
        sb4.append(str);
        sb4.append("  hasTouchpad: ");
        sb4.append(z4);
        printWriter.println(sb4.toString());
        boolean z5 = this.e;
        StringBuilder sb5 = new StringBuilder(str.length() + 35);
        sb5.append(str);
        sb5.append("  hasTouchpadForUiNavigation: ");
        sb5.append(z5);
        printWriter.println(sb5.toString());
        int i = this.f;
        StringBuilder sb6 = new StringBuilder(str.length() + 36);
        sb6.append(str);
        sb6.append("  touchpadSizeInPixelsX: ");
        sb6.append(i);
        printWriter.println(sb6.toString());
        int i2 = this.g;
        StringBuilder sb7 = new StringBuilder(str.length() + 36);
        sb7.append(str);
        sb7.append("  touchpadSizeInPixelsY: ");
        sb7.append(i2);
        printWriter.println(sb7.toString());
    }

    @Override // defpackage.jzp
    public final boolean a() {
        return this.a || h();
    }

    @Override // defpackage.jzp
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.jzp
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.jzp
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.jzp
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.jzp
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.jzp
    public final boolean h() {
        return this.b || this.e;
    }

    @Override // defpackage.jzp
    public final int i() {
        return this.f;
    }

    @Override // defpackage.jzp
    public final int j() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jzp k(boolean r12, boolean r13, boolean r14, int[] r15, boolean r16) {
        /*
            r0 = r15
            r1 = 1
            r2 = 2
            r3 = 0
            if (r16 == 0) goto L14
            if (r0 == 0) goto Lc
            int r4 = r0.length
            if (r4 < r2) goto Lc
            goto L1b
        Lc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "hasTouchpadForNavigation is true but touchpad dimensions not supplied."
            r0.<init>(r1)
            throw r0
        L14:
            if (r0 == 0) goto L1b
            int r4 = r0.length
            if (r4 != r2) goto L1b
            r8 = 1
            goto L1c
        L1b:
            r8 = 0
        L1c:
            key r2 = new key
            if (r0 != 0) goto L22
            r10 = 0
            goto L25
        L22:
            r4 = r0[r3]
            r10 = r4
        L25:
            if (r0 != 0) goto L29
            r11 = 0
            goto L2c
        L29:
            r3 = r0[r1]
            r11 = r3
        L2c:
            r4 = r2
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.key.k(boolean, boolean, boolean, int[], boolean):jzp");
    }
}
