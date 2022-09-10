package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cbyh  reason: default package */
/* loaded from: classes4.dex */
public class cbyh extends cbwa implements cbyf, crzp {
    private final cbrx a;
    private cbtv b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cbyh(defpackage.cbrx r3, defpackage.cbss r4, defpackage.cbyx r5, defpackage.cqhn r6, final defpackage.gga r7) {
        /*
            r2 = this;
            cbsb r4 = (defpackage.cbsb) r4
            crzm<cbtv> r5 = r4.c
            java.lang.Object r5 = r5.l()
            cbtv r5 = (defpackage.cbtv) r5
            defpackage.dbsk.s(r5)
            java.lang.String r5 = r5.f
            crzm<cbtv> r6 = r4.c
            java.lang.Object r6 = r6.l()
            cbtv r6 = (defpackage.cbtv) r6
            defpackage.dbsk.s(r6)
            java.lang.String r6 = r6.d
            ddho r0 = defpackage.dtya.dA
            cbyg r1 = new cbyg
            r1.<init>(r7)
            r2.<init>(r5, r6, r0, r1)
            r2.a = r3
            crzm<cbtv> r3 = r4.c
            java.lang.Object r3 = r3.l()
            cbtv r3 = (defpackage.cbtv) r3
            defpackage.dbsk.s(r3)
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.<init>(cbrx, cbss, cbyx, cqhn, gga):void");
    }

    @Override // defpackage.crzp
    public void On(crzm<cbtv> crzmVar) {
        cbtv l = crzmVar.l();
        dbsk.s(l);
        this.b = l;
        dbsk.l(l.a == 2);
        cqkx.p(this);
    }

    @Override // defpackage.cbyf
    public String d() {
        cbtx cbtxVar = this.b.c;
        if (cbtxVar == null) {
            cbtxVar = cbtx.c;
        }
        return cbtxVar.a;
    }

    @Override // defpackage.cbyf
    public String e() {
        cbuj cbujVar;
        cbtv cbtvVar = this.b;
        if (cbtvVar.a == 2) {
            cbujVar = (cbuj) cbtvVar.b;
        } else {
            cbujVar = cbuj.d;
        }
        return String.valueOf(cbujVar.c + 1);
    }

    @Override // defpackage.cbyf
    public String f() {
        cbuj cbujVar;
        cbtv cbtvVar = this.b;
        if (cbtvVar.a == 2) {
            cbujVar = (cbuj) cbtvVar.b;
        } else {
            cbujVar = cbuj.d;
        }
        return String.valueOf(cbujVar.b.size());
    }

    @Override // defpackage.cbyf
    public cqkl g() {
        ((cbrz) this.a).a.b();
        return cqkl.a;
    }

    @Override // defpackage.cbyf
    public List<cbyv> h() {
        cbuj cbujVar;
        cbtv cbtvVar = this.b;
        if (cbtvVar.a == 2) {
            cbujVar = (cbuj) cbtvVar.b;
        } else {
            cbujVar = cbuj.d;
        }
        cbul cbulVar = cbujVar.b.get(cbujVar.c);
        dccx dccxVar = new dccx();
        for (int i = 0; i < cbulVar.a.size(); i += 2) {
            cbts cbtsVar = cbulVar.a.get(i);
            int i2 = i + 1;
            cbts cbtsVar2 = i2 < cbulVar.a.size() ? cbulVar.a.get(i2) : null;
            cbrx cbrxVar = this.a;
            cjtd c = c(dtya.dB);
            cbyx.a(cbrxVar, 1);
            cbyx.a(c, 2);
            cbyx.a(cbtsVar, 4);
            dccxVar.g(new cbyw(cbrxVar, c, i, cbtsVar, cbtsVar2));
        }
        return dccxVar.f();
    }
}
