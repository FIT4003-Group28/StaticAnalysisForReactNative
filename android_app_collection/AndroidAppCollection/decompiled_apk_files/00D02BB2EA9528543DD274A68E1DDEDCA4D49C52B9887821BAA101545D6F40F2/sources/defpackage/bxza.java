package defpackage;
/* compiled from: PG */
/* renamed from: bxza  reason: default package */
/* loaded from: classes4.dex */
public class bxza implements bxxq {
    private final dxio<nut> a;
    private final bxyn b;
    private final String c;
    private final String d;
    private final String e;
    private final cjtd f;
    @dzsi
    private final jau g;
    private final ckmp h;
    private final cklq i;
    private final btvo j;

    public bxza(bxyn bxynVar, dxio<nut> dxioVar, bxyp bxypVar, ckmp ckmpVar, cklq cklqVar, btvo btvoVar) {
        dpti dptiVar;
        this.b = bxynVar;
        this.h = ckmpVar;
        int a = dptd.a(bxynVar.b().b);
        boolean z = a == 2;
        if (a != 0) {
            dbsk.a(z);
            this.a = dxioVar;
            this.i = cklqVar;
            this.j = btvoVar;
            dpte b = bxynVar.b();
            if (b.b == 5) {
                dptiVar = (dpti) b.c;
            } else {
                dptiVar = dpti.e;
            }
            this.c = dptiVar.c;
            this.d = dptiVar.d;
            this.e = dptiVar.b;
            ddey a2 = bxypVar.a(bxynVar);
            if (a2.c) {
                a2.bF();
                a2.c = false;
            }
            ddfb ddfbVar = (ddfb) a2.b;
            ddfb ddfbVar2 = ddfb.g;
            ddfbVar.c = 2;
            ddfbVar.a |= 2;
            ddfb ddfbVar3 = (ddfb) a2.b;
            ddfbVar3.b = 5;
            ddfbVar3.a |= 1;
            this.f = bxyp.c(a2, bxynVar);
            this.g = bxypVar.b(bxynVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.bxxq
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.bxxq
    public CharSequence b() {
        return (!this.j.getSuggestParameters().s || dbsj.d(this.d)) ? "" : this.d;
    }

    @Override // defpackage.bxxq
    public CharSequence c() {
        return "";
    }

    @Override // defpackage.bxxq
    public cqtd d() {
        return bxnv.b(null);
    }

    @Override // defpackage.bxxq
    @dzsi
    public cqss e() {
        return bxnv.e(null);
    }

    public boolean equals(@dzsi Object obj) {
        dpti dptiVar;
        if (obj instanceof bxza) {
            dpte b = this.b.b();
            if (b.b == 5) {
                dptiVar = (dpti) b.c;
            } else {
                dptiVar = dpti.e;
            }
            String str = dptiVar.b;
            dpte b2 = ((bxza) obj).b.b();
            return str.equals((b2.b == 5 ? (dpti) b2.c : dpti.e).b);
        }
        return false;
    }

    @Override // defpackage.bxxq
    public cqkl f(cjqm cjqmVar) {
        this.i.a(ckls.ZERO_PREFIX_SUGGESTION_CLICKED);
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.aA.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            doeh bZ2 = doei.d.bZ();
            String b2 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b2.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b2;
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
        this.h.b(ckmk.SEARCH_TO_LIST);
        this.a.a().f().e(this.e, this.c.isEmpty() ? this.e : this.c, bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.bxxq
    public cjtd g() {
        return this.f;
    }

    @Override // defpackage.bxxq
    @dzsi
    public cqtd h() {
        jau jauVar = this.g;
        if (jauVar != null) {
            return jauVar.c();
        }
        return null;
    }

    public int hashCode() {
        dpti dptiVar;
        dpte b = this.b.b();
        if (b.b == 5) {
            dptiVar = (dpti) b.c;
        } else {
            dptiVar = dpti.e;
        }
        return dptiVar.b.hashCode();
    }

    @Override // defpackage.bxxq
    public cqkl i(cjqm cjqmVar) {
        jau jauVar = this.g;
        return jauVar != null ? jauVar.d() : cqkl.a;
    }

    @Override // defpackage.bxxq
    public cjtd j() {
        jau jauVar = this.g;
        if (jauVar != null) {
            return jauVar.f();
        }
        return cjtd.b;
    }

    @Override // defpackage.bxxq
    public CharSequence k() {
        jau jauVar = this.g;
        return jauVar != null ? jauVar.e() : "";
    }
}
