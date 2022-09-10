package defpackage;
/* compiled from: PG */
/* renamed from: bxyx  reason: default package */
/* loaded from: classes4.dex */
public class bxyx implements bxxq {
    private final dxio<nut> a;
    private final dxio<bxtx> b;
    private final btvo c;
    private final bxyn d;
    private final String e;
    private final dbty<cqtd> f;
    private final dbty<cqss> g;
    @dzsi
    private final akqi h;
    private final akqq i;
    private final String j;
    private final String k;
    private final CharSequence l;
    private final cjtd m;
    @dzsi
    private final jau n;
    private final cklq o;
    private final int p;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bxyx(defpackage.bxyn r9, defpackage.dxio<defpackage.nut> r10, defpackage.dxio<defpackage.bxtx> r11, final defpackage.btvo r12, defpackage.dxio<defpackage.ahjq> r13, defpackage.bxyp r14, defpackage.cklq r15) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxyx.<init>(bxyn, dxio, dxio, btvo, dxio, bxyp, cklq):void");
    }

    @Override // defpackage.bxxq
    public CharSequence a() {
        return this.j;
    }

    @Override // defpackage.bxxq
    public CharSequence b() {
        return dbsj.d(this.e) ? this.l : this.e;
    }

    @Override // defpackage.bxxq
    public CharSequence c() {
        return dbsj.d(this.e) ? "" : this.l;
    }

    @Override // defpackage.bxxq
    public cqtd d() {
        return this.f.a();
    }

    @Override // defpackage.bxxq
    @dzsi
    public cqss e() {
        return this.g.a();
    }

    public boolean equals(@dzsi Object obj) {
        dptg dptgVar;
        if (obj instanceof bxyx) {
            dpte b = this.d.b();
            if (b.b == 4) {
                dptgVar = (dptg) b.c;
            } else {
                dptgVar = dptg.q;
            }
            String str = dptgVar.e;
            dpte b2 = ((bxyx) obj).d.b();
            return str.equals((b2.b == 4 ? (dptg) b2.c : dptg.q).e);
        }
        return false;
    }

    @Override // defpackage.bxxq
    public cqkl f(cjqm cjqmVar) {
        dptg dptgVar;
        dptg dptgVar2;
        dptg dptgVar3;
        ddda dddaVar;
        this.o.a(ckls.ZERO_PREFIX_SUGGESTION_CLICKED);
        dnqg bZ = dnqh.p.bZ();
        dpte b = this.d.b();
        if (b.b == 4) {
            dptgVar = (dptg) b.c;
        } else {
            dptgVar = dptg.q;
        }
        boolean z = dptgVar.n && this.c.getEnableFeatureParameters().aA;
        dpte b2 = this.d.b();
        if (b2.b == 4) {
            dptgVar2 = (dptg) b2.c;
        } else {
            dptgVar2 = dptg.q;
        }
        boolean z2 = dptgVar2.o;
        dpte b3 = this.d.b();
        if (b3.b == 4) {
            dptgVar3 = (dptg) b3.c;
        } else {
            dptgVar3 = dptg.q;
        }
        boolean z3 = dptgVar3.p;
        if (z) {
            dddaVar = ddda.fn;
        } else if (z2) {
            dddaVar = ddda.fm;
        } else {
            dddaVar = ddda.ay;
        }
        int i = dddaVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b4 = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b4.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b4;
            doeh bZ2 = doei.d.bZ();
            String b5 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b5.getClass();
            doeiVar.a = 4 | doeiVar.a;
            doeiVar.c = b5;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ.b;
            doei bK = bZ2.bK();
            bK.getClass();
            dnqhVar3.m = bK;
            dnqhVar3.a |= 262144;
        }
        this.a.a().f().f(this.k, this.h, this.j, this.p, bZ.bK(), this.h != null, z, z2, z3, this.i);
        this.b.a().h(this.d.b());
        return cqkl.a;
    }

    @Override // defpackage.bxxq
    public cjtd g() {
        return this.m;
    }

    @Override // defpackage.bxxq
    @dzsi
    public cqtd h() {
        jau jauVar = this.n;
        if (jauVar != null) {
            return jauVar.c();
        }
        return null;
    }

    public int hashCode() {
        dptg dptgVar;
        dpte b = this.d.b();
        if (b.b == 4) {
            dptgVar = (dptg) b.c;
        } else {
            dptgVar = dptg.q;
        }
        return dptgVar.e.hashCode();
    }

    @Override // defpackage.bxxq
    public cqkl i(cjqm cjqmVar) {
        jau jauVar = this.n;
        return jauVar != null ? jauVar.d() : cqkl.a;
    }

    @Override // defpackage.bxxq
    public cjtd j() {
        jau jauVar = this.n;
        if (jauVar != null) {
            return jauVar.f();
        }
        return cjtd.b;
    }

    @Override // defpackage.bxxq
    public CharSequence k() {
        jau jauVar = this.n;
        return jauVar != null ? jauVar.e() : "";
    }
}
