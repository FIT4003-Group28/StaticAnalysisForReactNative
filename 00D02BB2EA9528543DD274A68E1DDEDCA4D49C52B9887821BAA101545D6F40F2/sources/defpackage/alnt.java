package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alnt  reason: default package */
/* loaded from: classes2.dex */
public final class alnt {
    private final alrv a;
    private int b;
    private int c;
    private dmpn d = dmpn.r;

    public alnt(alrv alrvVar) {
        this.a = alrvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            r5 = this;
            dmpn r0 = r5.d
            dsqv<dmpn, dmpz> r1 = defpackage.dmqa.b
            r0.f(r1)
            dsqh<dsqu> r0 = r0.V
            dsqu r2 = r1.d
            java.lang.Object r0 = r0.l(r2)
            if (r0 != 0) goto L14
            Type r0 = r1.b
            goto L18
        L14:
            java.lang.Object r0 = r1.b(r0)
        L18:
            dmpz r0 = (defpackage.dmpz) r0
            int r1 = r0.b
            if (r1 != 0) goto L4e
            dmpn r1 = r5.d
            dsqv<dmpn, alwt> r2 = defpackage.alwu.c
            r1.f(r2)
            dsqh<dsqu> r1 = r1.V
            dsqu r2 = r2.d
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L4e
            dmpn r1 = r5.d
            dsqv<dmpn, alwt> r2 = defpackage.alwu.c
            r1.f(r2)
            dsqh<dsqu> r1 = r1.V
            dsqu r3 = r2.d
            java.lang.Object r1 = r1.l(r3)
            if (r1 != 0) goto L43
            Type r1 = r2.b
            goto L47
        L43:
            java.lang.Object r1 = r2.b(r1)
        L47:
            alwt r1 = (defpackage.alwt) r1
            int r1 = r1.f
            r5.c = r1
            goto L56
        L4e:
            alrv r1 = r5.a
            int r1 = r1.x()
            r5.c = r1
        L56:
            dmpn r1 = r5.d
            dsrf r1 = r1.o
            dcep r1 = defpackage.dcep.K(r1)
            int r0 = r0.b
            if (r0 == 0) goto L6d
            alrv r1 = r5.a
            int r2 = r5.c
            alxp r0 = r1.o(r0, r2)
            long r0 = r0.a
            goto L8a
        L6d:
            dmpn r0 = r5.d
            int r2 = r0.a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L88
            alrv r2 = r5.a
            long r3 = r0.l
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            int r3 = r5.c
            java.lang.Long r0 = r2.v(r0, r1, r3)
            long r0 = r0.longValue()
            goto L8a
        L88:
            r0 = -1
        L8a:
            int r1 = (int) r0
            r5.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alnt.c():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a(dmpn dmpnVar) {
        if (!this.d.equals(dmpnVar)) {
            this.d = dmpnVar;
            c();
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int b(dmpn dmpnVar) {
        if (!this.d.equals(dmpnVar)) {
            this.d = dmpnVar;
            c();
        }
        return this.c;
    }
}
