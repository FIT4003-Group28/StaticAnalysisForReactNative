package defpackage;
/* compiled from: PG */
/* renamed from: addb  reason: default package */
/* loaded from: classes2.dex */
class addb extends adfs implements aeer<dqfo> {
    private final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public addb(defpackage.dxio<defpackage.brba> r11, defpackage.dxio<defpackage.bwjz> r12, defpackage.acwt r13, defpackage.dqfo r14, defpackage.cjtd r15) {
        /*
            r10 = this;
            java.lang.String r4 = r14.e
            java.lang.String r5 = r14.f
            int r0 = r14.b
            java.lang.String r8 = ""
            r9 = 2
            if (r0 != r9) goto L11
            java.lang.Object r0 = r14.c
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            goto L12
        L11:
            r6 = r8
        L12:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r11 = r14.b
            if (r11 != r9) goto L23
            java.lang.Object r11 = r14.c
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
        L23:
            r10.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addb.<init>(dxio, dxio, acwt, dqfo, cjtd):void");
    }

    @Override // defpackage.aeer
    /* renamed from: a */
    public void e(dqfo dqfoVar) {
        this.a = dqfoVar.e;
        this.b = j(dqfoVar.f);
    }

    @Override // defpackage.aeer
    /* renamed from: b */
    public boolean d(dqfo dqfoVar) {
        return this.d.equals(dqfoVar.b == 2 ? (String) dqfoVar.c : "");
    }

    @Override // defpackage.aeer
    public boolean c() {
        return false;
    }
}
