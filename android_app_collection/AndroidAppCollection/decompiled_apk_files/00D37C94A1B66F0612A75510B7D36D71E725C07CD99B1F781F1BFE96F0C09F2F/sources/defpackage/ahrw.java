package defpackage;
/* compiled from: PG */
/* renamed from: ahrw  reason: default package */
/* loaded from: classes.dex */
public final class ahrw extends ahrx implements ahro {
    public final ahrt b;
    public final ahry d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ahrw(defpackage.ahrz r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = defpackage.ahrt.b(r8)
            r1 = 2131951666(0x7f130032, float:1.9539753E38)
            java.lang.String r1 = r8.a(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L16
            java.lang.String r0 = r0.concat(r1)
            goto L1c
        L16:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L1c:
            java.lang.String r1 = defpackage.ahrt.a(r8, r9)
            java.lang.String r2 = defpackage.ahry.a(r8, r10)
            r3 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r8 = r8.a(r3)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r5 = r8.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + r4
            int r3 = r3 + r5
            r6.<init>(r3)
            r6.append(r1)
            r6.append(r2)
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            r7.<init>(r0, r8)
            java.lang.String r8 = "uTexMultiplier"
            int r8 = r7.f(r8)
            r7.e = r8
            java.lang.String r8 = "uTexOffset"
            int r8 = r7.f(r8)
            r7.f = r8
            java.lang.String r8 = "uTextureMatrix"
            int r8 = r7.f(r8)
            r7.g = r8
            ahrt r8 = new ahrt
            r8.<init>(r7, r9)
            r7.b = r8
            ahry r8 = new ahry
            r8.<init>(r7, r10)
            r7.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrw.<init>(ahrz, boolean, boolean):void");
    }

    @Override // defpackage.ahro
    public final void a(boolean z, byte[] bArr, long j, long j2) {
        this.b.d(z, bArr, j, j2);
    }

    @Override // defpackage.ahro
    public final void b(int i, int i2, int i3, int i4) {
        this.b.f(i, i2, i3, i4);
    }

    @Override // defpackage.ahrp
    public final void i() {
        this.b.c();
        super.i();
    }
}
