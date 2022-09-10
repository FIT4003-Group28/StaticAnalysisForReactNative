package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjjs  reason: default package */
/* loaded from: classes4.dex */
public final class cjjs extends dzvy implements dzut<Boolean> {
    final /* synthetic */ cjju a;

    public cjjs(cjju cjjuVar) {
        this.a = cjjuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.length == 0) goto L11;
     */
    @Override // defpackage.dzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Boolean a() {
        /*
            r5 = this;
            cjju r0 = r5.a
            java.lang.CharSequence r0 = r0.c
            boolean r1 = r0 instanceof android.text.Spanned
            r2 = 1
            if (r2 == r1) goto La
            r0 = 0
        La:
            android.text.Spanned r0 = (android.text.Spanned) r0
            r1 = 0
            if (r0 == 0) goto L21
            int r3 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r4 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r0.getSpans(r1, r3, r4)
        */
        //  java.lang.String r3 = "getSpans(/* start= */ 0,…lickableSpan::class.java)"
        /*
            defpackage.dzvx.b(r0, r3)
            int r0 = r0.length
            if (r0 != 0) goto L22
        L21:
            r2 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjjs.a():java.lang.Object");
    }
}
