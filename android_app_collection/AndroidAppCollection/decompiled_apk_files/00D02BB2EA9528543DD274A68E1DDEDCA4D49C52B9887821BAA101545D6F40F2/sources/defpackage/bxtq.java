package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bxtq  reason: default package */
/* loaded from: classes4.dex */
public class bxtq implements bxsz {
    private final gft a;
    private final dxio<axwy> b;
    private final dndr c;
    @dzsi
    private final azva d;
    private final axuc e;
    private final bxsj f;
    private final int g;
    private final cqtd h;
    private final cqss i;
    @dzsi
    private final cqss j;
    private final String k;
    @dzsi
    private final String l;
    private final cjtd m;
    private final ddho n;

    private static cqtd m(dndr dndrVar, boolean z) {
        return cqrt.g(dndrVar == dndr.HOME ? 2131232292 : 2131232467, bxnv.i(z ? 7 : 2));
    }

    private static cqss n(boolean z, boolean z2) {
        if (z) {
            return bxnv.h(7);
        }
        return iva.b(ibl.h(), ibl.s());
    }

    @dzsi
    private static cqss o(boolean z) {
        if (z) {
            return null;
        }
        return ibl.ay();
    }

    @Override // defpackage.bxsz
    public cqtd a() {
        return this.h;
    }

    @Override // defpackage.bxsz
    public cqss b() {
        return this.i;
    }

    @Override // defpackage.bxsz
    @dzsi
    public cqss c() {
        return this.j;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.k;
    }

    @Override // defpackage.bxsz
    public String e() {
        return this.k;
    }

    @Override // defpackage.bxsz
    @dzsi
    public String f() {
        return this.l;
    }

    @Override // defpackage.bxsz
    public Integer g() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        if (!this.a.bb()) {
            return cqkl.a;
        }
        azva azvaVar = this.d;
        if (azvaVar == null) {
            axwv n = axww.n();
            n.b(this.c);
            axvv axvvVar = (axvv) n;
            axvvVar.a = this.n;
            axvvVar.d = this.e;
            this.b.a().M(n.h());
        } else {
            this.f.a(azvaVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.m;
    }

    @Override // defpackage.abql
    public View.OnAttachStateChangeListener j() {
        return null;
    }

    @Override // defpackage.abql
    public cqtd k() {
        return abqk.a();
    }

    @Override // defpackage.abiu
    public jic l() {
        return new jic((String) null, ckqc.FIFE, this.h, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bxtq(defpackage.gga r1, defpackage.gft r2, defpackage.dxio<defpackage.axwy> r3, defpackage.btvo r4, defpackage.bxsj r5, @defpackage.dzsi defpackage.azva r6, defpackage.dndr r7, defpackage.axuc r8, int r9, boolean r10, defpackage.wfz r11) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.f = r5
            r0.d = r6
            r0.c = r7
            r0.g = r9
            r0.e = r8
            r2 = 0
            if (r6 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            r4 = 2131959024(0x7f131cf0, float:1.9554677E38)
            r5 = 2131954121(0x7f1309c9, float:1.9544732E38)
            if (r6 != 0) goto L3f
            dndr r8 = defpackage.dndr.HOME
            if (r7 != r8) goto L3f
            cqtd r4 = m(r7, r3)
            r0.h = r4
            cqss r2 = n(r3, r2)
            r0.i = r2
            cqss r2 = o(r3)
            r0.j = r2
            ddho r2 = r11.f()
            r0.n = r2
        L3b:
            r4 = 2131954121(0x7f1309c9, float:1.9544732E38)
            goto L9b
        L3f:
            if (r6 != 0) goto L5e
            dndr r8 = defpackage.dndr.WORK
            if (r7 != r8) goto L5e
            cqtd r5 = m(r7, r3)
            r0.h = r5
            cqss r2 = n(r3, r2)
            r0.i = r2
            cqss r2 = o(r3)
            r0.j = r2
            ddho r2 = r11.g()
            r0.n = r2
            goto L9b
        L5e:
            if (r6 == 0) goto L7d
            dndr r8 = defpackage.dndr.HOME
            if (r7 != r8) goto L7d
            cqtd r4 = m(r7, r3)
            r0.h = r4
            cqss r2 = n(r3, r2)
            r0.i = r2
            cqss r2 = o(r3)
            r0.j = r2
            ddho r2 = r11.d()
            r0.n = r2
            goto L3b
        L7d:
            if (r6 == 0) goto Lba
            dndr r5 = defpackage.dndr.WORK
            if (r7 != r5) goto Lba
            cqtd r5 = m(r7, r3)
            r0.h = r5
            cqss r2 = n(r3, r2)
            r0.i = r2
            cqss r2 = o(r3)
            r0.j = r2
            ddho r2 = r11.e()
            r0.n = r2
        L9b:
            java.lang.String r2 = r1.getString(r4)
            r0.k = r2
            if (r6 != 0) goto Lad
            r2 = 2131954139(0x7f1309db, float:1.9544769E38)
            java.lang.String r1 = r1.getString(r2)
            r0.l = r1
            goto Lb1
        Lad:
            java.lang.String r1 = r6.d
            r0.l = r1
        Lb1:
            ddho r1 = r0.n
            cjtd r1 = defpackage.cjtd.a(r1)
            r0.m = r1
            return
        Lba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r7.name()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unsupported item type: "
            int r4 = r2.length()
            if (r4 == 0) goto Ld1
            java.lang.String r2 = r3.concat(r2)
            goto Ld6
        Ld1:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        Ld6:
            r1.<init>(r2)
            goto Ldb
        Lda:
            throw r1
        Ldb:
            goto Lda
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxtq.<init>(gga, gft, dxio, btvo, bxsj, azva, dndr, axuc, int, boolean, wfz):void");
    }
}
