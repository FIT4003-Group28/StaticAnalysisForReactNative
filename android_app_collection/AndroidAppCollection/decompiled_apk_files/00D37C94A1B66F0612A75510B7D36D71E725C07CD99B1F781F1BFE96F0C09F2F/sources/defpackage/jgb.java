package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jgb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgb implements ampg {
    public final /* synthetic */ Optional a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgb(Optional optional) {
        this.a = optional;
    }

    public /* synthetic */ jgb(Optional optional, int i) {
        this.b = i;
        this.a = optional;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r4 < r1.d) goto L49;
     */
    @Override // defpackage.ampg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.b
            if (r0 == 0) goto L13
            j$.util.Optional r0 = r8.a
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            int r1 = defpackage.gjk.e
            boolean r9 = r9.booleanValue()
            gjj r9 = defpackage.gjj.a(r0, r9)
            return r9
        L13:
            j$.util.Optional r0 = r8.a
            jiq r9 = (defpackage.jiq) r9
            jiq r1 = defpackage.jiq.PLAYABLE
            r2 = 1
            r3 = 0
            if (r9 == r1) goto L89
            boolean r9 = r9.p
            if (r9 != 0) goto L88
            boolean r9 = r0.isPresent()
            if (r9 != 0) goto L29
            goto L88
        L29:
            java.lang.Object r9 = r0.get()
            atyp r9 = (defpackage.atyp) r9
            avkp r9 = r9.g()
            if (r9 == 0) goto L3a
            java.util.List r9 = r9.getStreamProgress()
            goto L3e
        L3a:
            amuk r9 = defpackage.amuk.q()
        L3e:
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
            r1 = r0
        L44:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r9.next()
            auzy r4 = (defpackage.auzy) r4
            int r5 = r4.e
            int r5 = defpackage.awwc.aL(r5)
            if (r5 != 0) goto L59
            goto L5e
        L59:
            r6 = 2
            if (r5 != r6) goto L5e
            r0 = r4
            goto L44
        L5e:
            int r5 = r4.e
            int r5 = defpackage.awwc.aL(r5)
            if (r5 != 0) goto L67
            goto L44
        L67:
            r6 = 3
            if (r5 == r6) goto L6b
            goto L44
        L6b:
            r1 = r4
            goto L44
        L6d:
            if (r0 == 0) goto L88
            if (r1 == 0) goto L88
            long r4 = r0.c
            long r6 = r0.d
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L88
            long r4 = r1.c
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L88
            long r0 = r1.d
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 >= 0) goto L88
            goto L89
        L88:
            r2 = 0
        L89:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgb.apply(java.lang.Object):java.lang.Object");
    }
}
