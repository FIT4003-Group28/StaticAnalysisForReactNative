package defpackage;
/* compiled from: PG */
/* renamed from: dbtk  reason: default package */
/* loaded from: classes.dex */
abstract class dbtk extends dbpz<String> {
    final CharSequence b;
    final dbrb c;
    final boolean d;
    int e = 0;
    int f;

    /* JADX INFO: Access modifiers changed from: protected */
    public dbtk(dbtm dbtmVar, CharSequence charSequence) {
        this.c = dbtmVar.a;
        this.d = dbtmVar.b;
        this.f = dbtmVar.c;
        this.b = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 >= r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r6.c.b(r6.b.charAt(r0)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 <= r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        r3 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r6.c.b(r6.b.charAt(r3)) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r6.d == false) goto L44;
     */
    @Override // defpackage.dbpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.String a() {
        /*
            r6 = this;
        L0:
            int r0 = r6.e
        L2:
            int r1 = r6.e
            r2 = -1
            if (r1 == r2) goto L8b
            int r1 = r6.c(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r6.b
            int r1 = r1.length()
            r6.e = r2
            r3 = -1
            goto L1d
        L17:
            int r3 = r6.d(r1)
            r6.e = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r6.e = r3
            java.lang.CharSequence r1 = r6.b
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r6.e = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L41
            dbrb r3 = r6.c
            java.lang.CharSequence r4 = r6.b
            char r4 = r4.charAt(r0)
            boolean r3 = r3.b(r4)
            if (r3 == 0) goto L41
            int r0 = r0 + 1
            goto L2e
        L41:
            if (r1 <= r0) goto L55
            int r3 = r1 + (-1)
            dbrb r4 = r6.c
            java.lang.CharSequence r5 = r6.b
            char r5 = r5.charAt(r3)
            boolean r4 = r4.b(r5)
            if (r4 == 0) goto L55
            r1 = r3
            goto L41
        L55:
            boolean r3 = r6.d
            if (r3 == 0) goto L5c
            if (r0 != r1) goto L5c
            goto L0
        L5c:
            int r3 = r6.f
            r4 = 1
            if (r3 != r4) goto L7d
            java.lang.CharSequence r1 = r6.b
            int r1 = r1.length()
            r6.e = r2
        L69:
            if (r1 <= r0) goto L80
            int r2 = r1 + (-1)
            dbrb r3 = r6.c
            java.lang.CharSequence r4 = r6.b
            char r4 = r4.charAt(r2)
            boolean r3 = r3.b(r4)
            if (r3 == 0) goto L80
            r1 = r2
            goto L69
        L7d:
            int r3 = r3 + r2
            r6.f = r3
        L80:
            java.lang.CharSequence r2 = r6.b
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L91
        L8b:
            java.lang.Object r0 = r6.b()
            java.lang.String r0 = (java.lang.String) r0
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbtk.a():java.lang.Object");
    }

    public abstract int c(int i);

    public abstract int d(int i);
}
