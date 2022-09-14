package defpackage;
/* compiled from: PG */
/* renamed from: alwf  reason: default package */
/* loaded from: classes.dex */
public final class alwf implements alyg {
    public final alyh a;
    public final byte[] b;
    public int c;
    public String[] d;
    public String[] e;
    public int f;
    private final akry g;
    private final int h;
    private amze i;
    private akrx j;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        r2 = new byte[4];
        java.lang.System.arraycopy(r9, 5, r2, 0, 4);
        r7 = defpackage.decl.j(r2);
        r1 = java.lang.Math.abs(r7);
        r2 = new java.io.ByteArrayInputStream(r9, 9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r7 >= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        r2 = new java.util.zip.GZIPInputStream(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        r8.b = (defpackage.dxcy) ((defpackage.dssr) defpackage.dxcy.c.cu(7)).h(r2);
        r2.close();
        r8.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        r1 = r1 + 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        defpackage.bvoo.i(new java.lang.RuntimeException(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public alwf(defpackage.amze r6, defpackage.akry r7, defpackage.alyh r8, byte[] r9, defpackage.akrx r10, int r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alwf.<init>(amze, akry, alyh, byte[], akrx, int):void");
    }

    @Override // defpackage.alyg
    public final alyh a() {
        return this.a;
    }

    @Override // defpackage.alyg
    public final akry b() {
        return this.g;
    }

    @Override // defpackage.alyg
    public final synchronized amze c() {
        return this.i;
    }

    @Override // defpackage.alyg
    public final synchronized void d(amze amzeVar) {
        this.i = amzeVar;
    }

    @Override // defpackage.alyg
    public final synchronized void e(akrx akrxVar) {
        this.j = akrxVar;
    }

    @Override // defpackage.alyg
    public final int f() {
        return this.h;
    }

    @Override // defpackage.alyg
    public final synchronized akrx g() {
        return this.j;
    }
}
