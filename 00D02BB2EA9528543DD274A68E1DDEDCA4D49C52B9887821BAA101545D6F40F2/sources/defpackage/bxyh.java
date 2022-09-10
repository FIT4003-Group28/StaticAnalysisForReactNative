package defpackage;
/* compiled from: PG */
/* renamed from: bxyh  reason: default package */
/* loaded from: classes4.dex */
public class bxyh implements bxxq {
    private final dxio<aagc> a;
    private final bxyn b;
    private final String c;
    private final String d;
    private final cjtd e;
    @dzsi
    private final jau f;

    public bxyh(bxyn bxynVar, dxio<aagc> dxioVar, bxyp bxypVar) {
        dptb dptbVar;
        int a = dptd.a(bxynVar.b().b);
        boolean z = a == 3;
        if (a != 0) {
            dbsk.a(z);
            this.b = bxynVar;
            this.a = dxioVar;
            dpte b = bxynVar.b();
            if (b.b == 6) {
                dptbVar = (dptb) b.c;
            } else {
                dptbVar = dptb.e;
            }
            this.d = dptbVar.c;
            this.c = dptbVar.d;
            ddey a2 = bxypVar.a(bxynVar);
            if (a2.c) {
                a2.bF();
                a2.c = false;
            }
            ddfb ddfbVar = (ddfb) a2.b;
            ddfb ddfbVar2 = ddfb.g;
            ddfbVar.c = 3;
            ddfbVar.a |= 2;
            this.e = bxyp.c(a2, bxynVar);
            this.f = bxypVar.b(bxynVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.bxxq
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.bxxq
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.bxxq
    public CharSequence c() {
        return "";
    }

    @Override // defpackage.bxxq
    public cqtd d() {
        return cqrt.g(2131232317, bxnv.a);
    }

    @Override // defpackage.bxxq
    @dzsi
    public cqss e() {
        return bxnv.d;
    }

    public boolean equals(@dzsi Object obj) {
        dptb dptbVar;
        if (obj instanceof bxyh) {
            dpte b = this.b.b();
            if (b.b == 6) {
                dptbVar = (dptb) b.c;
            } else {
                dptbVar = dptb.e;
            }
            String str = dptbVar.a;
            dpte b2 = ((bxyh) obj).b.b();
            return str.equals((b2.b == 6 ? (dptb) b2.c : dptb.e).a);
        }
        return false;
    }

    @Override // defpackage.bxxq
    public cqkl f(cjqm cjqmVar) {
        dptb dptbVar;
        dpte b = this.b.b();
        if (b.b == 6) {
            dptbVar = (dptb) b.c;
        } else {
            dptbVar = dptb.e;
        }
        String str = dptbVar.a;
        dpuk dpukVar = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        dpuk b2 = dpuk.b(dptbVar.b);
        if (b2 == null) {
            b2 = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        if (b2.ordinal() == 1) {
            this.a.a().a(str, 2);
        }
        return cqkl.a;
    }

    @Override // defpackage.bxxq
    public cjtd g() {
        return this.e;
    }

    @Override // defpackage.bxxq
    @dzsi
    public cqtd h() {
        jau jauVar = this.f;
        if (jauVar != null) {
            return jauVar.c();
        }
        return null;
    }

    public int hashCode() {
        dptb dptbVar;
        dpte b = this.b.b();
        if (b.b == 6) {
            dptbVar = (dptb) b.c;
        } else {
            dptbVar = dptb.e;
        }
        return dptbVar.a.hashCode();
    }

    @Override // defpackage.bxxq
    public cqkl i(cjqm cjqmVar) {
        jau jauVar = this.f;
        return jauVar != null ? jauVar.d() : cqkl.a;
    }

    @Override // defpackage.bxxq
    public cjtd j() {
        jau jauVar = this.f;
        if (jauVar != null) {
            return jauVar.f();
        }
        return cjtd.b;
    }

    @Override // defpackage.bxxq
    public CharSequence k() {
        jau jauVar = this.f;
        return jauVar != null ? jauVar.e() : "";
    }
}
