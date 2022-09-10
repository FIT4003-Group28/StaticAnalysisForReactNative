package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bgvr  reason: default package */
/* loaded from: classes3.dex */
public class bgvr implements bgvm {
    private static final ddho a = dtxv.bp;
    private static final ddho b = dtxv.bs;
    private static final ddho c = dtxv.bo;
    private final gga d;
    private final bgve e;
    private final bwqv f;
    private final boolean g;
    @dzsi
    private bwrs<ilo> h;
    private dgcm i = dgcm.c;
    private dgcm j = dgcm.c;
    private dgcm k = dgcm.c;
    private cjtd l = j(a);
    private cjtd m = j(b);
    private cjtd n = j(c);

    public bgvr(gga ggaVar, bhat bhatVar, bgve bgveVar, bwqv bwqvVar) {
        dbsk.l(true);
        this.d = ggaVar;
        this.e = bgveVar;
        this.f = bwqvVar;
        this.g = bhatVar.d();
    }

    private static cjtd j(ddho ddhoVar) {
        return k(ddhoVar, null);
    }

    private static cjtd k(ddho ddhoVar, @dzsi ilo iloVar) {
        cjta c2 = cjtd.c(iloVar == null ? null : iloVar.a());
        c2.d = ddhoVar;
        return c2.a();
    }

    private final cqkl l(dgcm dgcmVar) {
        bwrs<ilo> bwrsVar = this.h;
        dbsk.s(bwrsVar);
        bwqv bwqvVar = this.f;
        bgue bgueVar = new bgue();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "PLACEMARK_REF_KEY", bwrsVar);
        bvrs.l(bundle, dgcmVar);
        bgueVar.B(bundle);
        this.d.D(bgueVar);
        return cqkl.a;
    }

    @Override // defpackage.bgvm
    public cjtd a() {
        return this.l;
    }

    @Override // defpackage.bgvm
    public cjtd b() {
        return this.m;
    }

    @Override // defpackage.bgvm
    public cjtd c() {
        return this.n;
    }

    @Override // defpackage.bgvm
    public Boolean d() {
        return Boolean.valueOf(this.i.b.size() > 0);
    }

    @Override // defpackage.bgvm
    public Boolean e() {
        return Boolean.valueOf(this.j.b.size() > 0);
    }

    @Override // defpackage.bgvm
    public Boolean f() {
        return Boolean.valueOf(this.k.b.size() > 0);
    }

    @Override // defpackage.bgvm
    public cqkl g() {
        return l(this.i);
    }

    @Override // defpackage.bgvm
    public cqkl h() {
        return l(this.j);
    }

    @Override // defpackage.bgvm
    public cqkl i() {
        return l(this.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0133, code lost:
        if ((r10.a & 128) != 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    @Override // defpackage.bega
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.bwrs<defpackage.ilo> r14) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgvr.t(bwrs):void");
    }

    @Override // defpackage.bega
    public void u() {
        this.h = null;
        this.i = dgcm.c;
        this.j = dgcm.c;
        this.k = dgcm.c;
        this.l = j(a);
        this.m = j(b);
        this.n = j(c);
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = true;
        if (this.h == null || !this.g || (!d().booleanValue() && !e().booleanValue() && !f().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
