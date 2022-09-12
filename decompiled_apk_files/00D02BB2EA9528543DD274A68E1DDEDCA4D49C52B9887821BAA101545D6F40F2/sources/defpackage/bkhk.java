package defpackage;
/* compiled from: PG */
/* renamed from: bkhk  reason: default package */
/* loaded from: classes3.dex */
public class bkhk implements bnif {
    private final dxio<aesb> a;
    private final dxio<boxa> b;
    private final dkyr c;
    private final bwrs<ilo> d;
    private final cjtd e;
    private final dobf f;
    private final ddho g;
    private final int h;
    private final CharSequence i;

    public bkhk(dxio<aesb> dxioVar, dxio<boxa> dxioVar2, dxio<apun> dxioVar3, btvo btvoVar, bhat bhatVar, bwrs<ilo> bwrsVar, dobf dobfVar, apum apumVar, ddho ddhoVar, int i, CharSequence charSequence) {
        cjtd a;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = btvoVar.getUgcParameters();
        this.d = bwrsVar;
        ilo c = bwrsVar.c();
        if (c == null) {
            a = cjtd.b;
        } else {
            cjta c2 = cjtd.c(c.a());
            c2.d = ddhoVar;
            a = c2.a();
        }
        this.e = a;
        this.f = dobfVar;
        this.g = ddhoVar;
        this.h = i;
        this.i = charSequence;
    }

    @Override // defpackage.bnif
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.g(this.h, irg.j());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ilo c = this.d.c();
        if (c == null) {
            return cqkl.a;
        }
        this.a.a().D(c, 8, this.g);
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.ADD_INFO_LINK;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        dnqe bK = bZ.bK();
        if (this.c.B()) {
            dobf dobfVar = this.f;
            if ((dobfVar.a & 4) != 0) {
                dobk dobkVar = dobfVar.d;
                if (dobkVar == null) {
                    dobkVar = dobk.d;
                }
                if (dobkVar.a == 2) {
                    boxa a = this.b.a();
                    bwrs<ilo> bwrsVar = this.d;
                    dobk dobkVar2 = this.f.d;
                    if (dobkVar2 == null) {
                        dobkVar2 = dobk.d;
                    }
                    a.C(bwrsVar, bK, dobkVar2.a == 2 ? (String) dobkVar2.b : "");
                    return cqkl.a;
                }
            }
        }
        boxa a2 = this.b.a();
        bwrs<ilo> bwrsVar2 = this.d;
        dqgh b = dqgh.b(this.f.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        a2.B(bwrsVar2, bK, bomu.a(b.af));
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
        return this.e;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.i;
    }
}
