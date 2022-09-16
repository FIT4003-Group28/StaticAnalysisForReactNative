package defpackage;
/* compiled from: PG */
/* renamed from: dclr  reason: default package */
/* loaded from: classes5.dex */
final class dclr extends dclc {
    final Object a;
    int b;
    final /* synthetic */ dcls c;

    public dclr(dcls dclsVar, int i) {
        this.c = dclsVar;
        this.a = dclsVar.a[i];
        this.b = i;
    }

    @Override // defpackage.dcla
    public final Object a() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (defpackage.dbsd.a(r4.a, r2.a[r0]) != false) goto L7;
     */
    @Override // defpackage.dcla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 == r1) goto L17
            dcls r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.dbsd.a(r3, r0)
            if (r0 != 0) goto L21
        L17:
            dcls r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.i(r2)
            r4.b = r0
        L21:
            int r0 = r4.b
            if (r0 != r1) goto L27
            r0 = 0
            return r0
        L27:
            dcls r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dclr.b():int");
    }
}
