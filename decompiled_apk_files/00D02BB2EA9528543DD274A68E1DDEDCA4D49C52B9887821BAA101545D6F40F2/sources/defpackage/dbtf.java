package defpackage;
/* compiled from: PG */
/* renamed from: dbtf  reason: default package */
/* loaded from: classes5.dex */
final class dbtf extends dbtk {
    final /* synthetic */ dbtg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbtf(dbtg dbtgVar, dbtm dbtmVar, CharSequence charSequence) {
        super(dbtmVar, charSequence);
        this.a = dbtgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        r6 = r6 + 1;
     */
    @Override // defpackage.dbtk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r6) {
        /*
            r5 = this;
            dbtg r0 = r5.a
            java.lang.String r0 = r0.a
            int r0 = r0.length()
            java.lang.CharSequence r1 = r5.b
            int r1 = r1.length()
            int r1 = r1 - r0
        Lf:
            if (r6 > r1) goto L2d
            r2 = 0
        L12:
            if (r2 >= r0) goto L2c
            java.lang.CharSequence r3 = r5.b
            int r4 = r2 + r6
            char r3 = r3.charAt(r4)
            dbtg r4 = r5.a
            java.lang.String r4 = r4.a
            char r4 = r4.charAt(r2)
            if (r3 == r4) goto L29
            int r6 = r6 + 1
            goto Lf
        L29:
            int r2 = r2 + 1
            goto L12
        L2c:
            return r6
        L2d:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbtf.c(int):int");
    }

    @Override // defpackage.dbtk
    public final int d(int i) {
        return i + this.a.a.length();
    }
}
