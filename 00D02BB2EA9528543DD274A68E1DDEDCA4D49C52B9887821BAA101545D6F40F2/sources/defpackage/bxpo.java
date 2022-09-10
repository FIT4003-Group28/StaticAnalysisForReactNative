package defpackage;
/* compiled from: PG */
/* renamed from: bxpo  reason: default package */
/* loaded from: classes4.dex */
public class bxpo implements bxoa {
    private static final int g = 3;
    private final dxio<brba> c;
    private Boolean d = false;
    @dzsi
    private String e = null;
    @dzsi
    private brln f = null;
    private final cqss a = bxnv.i(3);
    @dzsi
    private final cqss b = bxnv.h(3);

    public bxpo(dxio<brba> dxioVar) {
        this.c = dxioVar;
    }

    @Override // defpackage.bxoi
    public cyg A() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean B() {
        return bxoh.a();
    }

    @Override // defpackage.bxoi
    public jic C() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean D() {
        return bxoh.b();
    }

    @Override // defpackage.bxoi
    public CharSequence E() {
        return "";
    }

    @Override // defpackage.bxoa
    public Boolean F() {
        return this.d;
    }

    public void G(@dzsi brln brlnVar) {
        this.f = brlnVar;
        boolean z = false;
        if (brlnVar == null) {
            this.d = false;
            return;
        }
        brlu brluVar = brlnVar.e;
        if (brluVar == null) {
            return;
        }
        String str = brluVar.a;
        String str2 = brluVar.b;
        this.e = str2;
        if (str != null && str2 != null) {
            z = true;
        }
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bxoi
    public Boolean a() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean b() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean c() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        cqtd b = oxa.b(2);
        if (b == null) {
            return null;
        }
        return cqrt.i(b, this.a);
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        brln brlnVar = this.f;
        if (brlnVar == null) {
            return cqkl.a;
        }
        dwir b = brlnVar.b();
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        dwim dwimVar = (dwim) dsqpVar;
        dnqg bZ = dnqh.p.bZ();
        ddxw bZ2 = ddxx.j.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ2.b;
        ddxxVar.a |= 8;
        ddxxVar.d = 9348;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        ddxx bK = bZ2.bK();
        bK.getClass();
        dnqhVar.f = bK;
        dnqhVar.a |= 16;
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar = (dwir) dwimVar.b;
        dnqh bK2 = bZ.bK();
        dwir dwirVar2 = dwir.R;
        bK2.getClass();
        dwirVar.s = bK2;
        dwirVar.a |= 33554432;
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar3 = (dwir) dwimVar.b;
        dwirVar3.a |= 128;
        dwirVar3.h = true;
        dwir dwirVar4 = (dwir) dwimVar.b;
        dwirVar4.a |= 8;
        dwirVar4.f = 0;
        this.c.a().s(dwimVar.bK(), brlnVar.a);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(dtyi.cZ);
    }

    @Override // defpackage.bxoi
    public Boolean i() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean j() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean k() {
        return false;
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return "";
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.d.booleanValue() ? this.e : "";
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence n() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean o() {
        return false;
    }

    @Override // defpackage.bxoi
    public cqkl p() {
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd q() {
        return null;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cqss r() {
        return this.b;
    }

    @Override // defpackage.bxoi
    public cqkl s() {
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd t() {
        return null;
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence u() {
        return null;
    }

    @Override // defpackage.bxoi
    public bxok v() {
        return null;
    }

    @Override // defpackage.bxoi
    public bxok w() {
        return null;
    }

    @Override // defpackage.bxoi
    public String x() {
        return " ";
    }

    @Override // defpackage.bxoi
    public bxoj y() {
        return null;
    }

    @Override // defpackage.bxoi
    public acmv z() {
        return null;
    }
}
