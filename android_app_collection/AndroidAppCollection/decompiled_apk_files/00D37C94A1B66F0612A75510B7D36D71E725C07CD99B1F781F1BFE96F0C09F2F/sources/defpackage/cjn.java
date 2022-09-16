package defpackage;

import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjn  reason: default package */
/* loaded from: classes2.dex */
public final class cjn implements cjr, cik {
    private final List a;
    private final cjs b;
    private final cjq c;
    private int d = -1;
    private chy e;
    private List f;
    private int g;
    private volatile cnp h;
    private File i;

    public cjn(List list, cjs cjsVar, cjq cjqVar) {
        this.a = list;
        this.b = cjsVar;
        this.c = cjqVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.cjr
    public final void a() {
        cnp cnpVar = this.h;
        if (cnpVar != null) {
            cnpVar.c.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (c() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        r0 = r7.f;
        r3 = r7.g;
        r7.g = r3 + 1;
        r3 = r7.i;
        r4 = r7.b;
        r7.h = ((defpackage.cnq) r0.get(r3)).a(r3, r4.e, r4.f, r4.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r7.h == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r7.b.h(r7.h.c.a()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        r7.h.c.d(r7.b.n, r7);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        r7.h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 != false) goto L27;
     */
    @Override // defpackage.cjr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r7 = this;
        L0:
            java.util.List r0 = r7.f     // Catch: java.lang.Throwable -> L95
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L58
            boolean r0 = r7.c()     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto Ld
            goto L58
        Ld:
            r0 = 0
            r7.h = r0     // Catch: java.lang.Throwable -> L95
        L10:
            if (r1 != 0) goto L57
            boolean r0 = r7.c()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L57
            java.util.List r0 = r7.f     // Catch: java.lang.Throwable -> L95
            int r3 = r7.g     // Catch: java.lang.Throwable -> L95
            int r4 = r3 + 1
            r7.g = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L95
            cnq r0 = (defpackage.cnq) r0     // Catch: java.lang.Throwable -> L95
            java.io.File r3 = r7.i     // Catch: java.lang.Throwable -> L95
            cjs r4 = r7.b     // Catch: java.lang.Throwable -> L95
            int r5 = r4.e     // Catch: java.lang.Throwable -> L95
            int r6 = r4.f     // Catch: java.lang.Throwable -> L95
            cic r4 = r4.h     // Catch: java.lang.Throwable -> L95
            cnp r0 = r0.a(r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L95
            r7.h = r0     // Catch: java.lang.Throwable -> L95
            cnp r0 = r7.h     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L10
            cjs r0 = r7.b     // Catch: java.lang.Throwable -> L95
            cnp r3 = r7.h     // Catch: java.lang.Throwable -> L95
            cil r3 = r3.c     // Catch: java.lang.Throwable -> L95
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.h(r3)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L10
            cnp r0 = r7.h     // Catch: java.lang.Throwable -> L95
            cil r0 = r0.c     // Catch: java.lang.Throwable -> L95
            cjs r1 = r7.b     // Catch: java.lang.Throwable -> L95
            cfv r1 = r1.n     // Catch: java.lang.Throwable -> L95
            r0.d(r1, r7)     // Catch: java.lang.Throwable -> L95
            r1 = 1
            goto L10
        L57:
            return r1
        L58:
            int r0 = r7.d     // Catch: java.lang.Throwable -> L95
            int r0 = r0 + r2
            r7.d = r0     // Catch: java.lang.Throwable -> L95
            java.util.List r2 = r7.a     // Catch: java.lang.Throwable -> L95
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L95
            if (r0 < r2) goto L66
            return r1
        L66:
            java.util.List r0 = r7.a     // Catch: java.lang.Throwable -> L95
            int r2 = r7.d     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L95
            chy r0 = (defpackage.chy) r0     // Catch: java.lang.Throwable -> L95
            cjo r2 = new cjo     // Catch: java.lang.Throwable -> L95
            cjs r3 = r7.b     // Catch: java.lang.Throwable -> L95
            chy r3 = r3.m     // Catch: java.lang.Throwable -> L95
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L95
            cjs r3 = r7.b     // Catch: java.lang.Throwable -> L95
            clt r3 = r3.d()     // Catch: java.lang.Throwable -> L95
            java.io.File r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L95
            r7.i = r2     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L0
            r7.e = r0     // Catch: java.lang.Throwable -> L95
            cjs r0 = r7.b     // Catch: java.lang.Throwable -> L95
            java.util.List r0 = r0.g(r2)     // Catch: java.lang.Throwable -> L95
            r7.f = r0     // Catch: java.lang.Throwable -> L95
            r7.g = r1     // Catch: java.lang.Throwable -> L95
            goto L0
        L95:
            r0 = move-exception
            goto L98
        L97:
            throw r0
        L98:
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjn.b():boolean");
    }

    @Override // defpackage.cik
    public final void f(Object obj) {
        this.c.e(this.e, obj, this.h.c, 3, this.e);
    }

    @Override // defpackage.cik
    public final void g(Exception exc) {
        this.c.d(this.e, exc, this.h.c, 3);
    }
}
