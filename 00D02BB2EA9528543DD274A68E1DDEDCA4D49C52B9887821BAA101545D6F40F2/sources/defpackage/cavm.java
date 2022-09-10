package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cavm  reason: default package */
/* loaded from: classes4.dex */
public class cavm implements cavt {
    private static final cqrp b = cqrp.d(28.0d);
    public final boolean a;
    private final cawy c;
    @dzsi
    private final bzym d;
    private final String e;
    private final int f;
    private final boolean g;
    private final cqss h;
    private final List<cavu> i;
    private final String j;
    private final cklf k;
    private final boolean l;
    private final bzyx m;
    @dzsi
    private jic n;
    private final cafi o;
    @dzsi
    private ebm p;

    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cavm(defpackage.ges r18, defpackage.bzyv r19, defpackage.cawy r20, android.content.res.Resources r21, defpackage.bzyt r22, defpackage.bzyu r23, defpackage.bzyo r24, defpackage.cavr r25, defpackage.cklf r26, defpackage.cafi r27, defpackage.ech r28) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cavm.<init>(ges, bzyv, cawy, android.content.res.Resources, bzyt, bzyu, bzyo, cavr, cklf, cafi, ech):void");
    }

    private static boolean m(dqwe dqweVar) {
        return !dqweVar.e.isEmpty();
    }

    @Override // defpackage.cavt
    @dzsi
    public bzyw a() {
        return this.d;
    }

    @Override // defpackage.cavt
    public List<cavu> b() {
        return this.i;
    }

    @Override // defpackage.cavt
    public Boolean c() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.cavt
    public String d() {
        return this.j;
    }

    @Override // defpackage.cavt
    public cqkl e() {
        this.k.a(true != this.a ? "contributions_points" : "lg_points");
        return cqkl.a;
    }

    @Override // defpackage.cavt
    public String f() {
        return this.e;
    }

    @Override // defpackage.cavt
    public bzyx g() {
        return this.m;
    }

    @Override // defpackage.cavt
    @dzsi
    public jic h() {
        return this.n;
    }

    @Override // defpackage.cavt
    public Boolean i() {
        ebm ebmVar;
        boolean z = false;
        if (this.o.p() && (ebmVar = this.p) != null && !ebmVar.b().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cavt
    @dzsi
    public ebm j() {
        return this.p;
    }

    @Override // defpackage.cavt
    @dzsi
    public ebn k() {
        ebm ebmVar = this.p;
        if (ebmVar == null) {
            return null;
        }
        return ebmVar.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (m(r0) != false) goto L15;
     */
    @Override // defpackage.cavt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean l() {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.c()
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            java.lang.Boolean r0 = r3.i()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f
            boolean r0 = r3.l
            if (r0 != 0) goto L30
            cawy r0 = r3.c
            dqwa r0 = r0.d
            if (r0 != 0) goto L22
            dqwa r0 = defpackage.dqwa.g
        L22:
            dqwe r0 = r0.d
            if (r0 != 0) goto L28
            dqwe r0 = defpackage.dqwe.f
        L28:
            boolean r0 = m(r0)
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r1 = 0
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cavm.l():java.lang.Boolean");
    }
}
