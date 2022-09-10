package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cbwz  reason: default package */
/* loaded from: classes4.dex */
public class cbwz extends cbwa implements cbwt, crzp {
    public final cbrx a;
    public final isd b;
    public final String c;
    @dzsi
    public isc d;
    public cbtv e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cbwz(defpackage.cbrx r4, defpackage.cbss r5, defpackage.cqhn r6, final defpackage.gga r7, defpackage.isd r8) {
        /*
            r3 = this;
            cbsb r5 = (defpackage.cbsb) r5
            crzm<cbtv> r6 = r5.c
            java.lang.Object r6 = r6.l()
            cbtv r6 = (defpackage.cbtv) r6
            defpackage.dbsk.s(r6)
            java.lang.String r6 = r6.f
            crzm<cbtv> r0 = r5.c
            java.lang.Object r0 = r0.l()
            cbtv r0 = (defpackage.cbtv) r0
            defpackage.dbsk.s(r0)
            java.lang.String r0 = r0.d
            ddho r1 = defpackage.dtya.f21do
            cbwu r2 = new cbwu
            r2.<init>(r7)
            r3.<init>(r6, r0, r1, r2)
            r3.a = r4
            r3.b = r8
            r4 = 2131956913(0x7f1314b1, float:1.9550395E38)
            java.lang.String r4 = r7.getString(r4)
            r3.c = r4
            crzm<cbtv> r4 = r5.c
            java.lang.Object r4 = r4.l()
            cbtv r4 = (defpackage.cbtv) r4
            defpackage.dbsk.s(r4)
            r3.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbwz.<init>(cbrx, cbss, cqhn, gga, isd):void");
    }

    private final cbts o() {
        cbub cbubVar;
        cbtv cbtvVar = this.e;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        cbts cbtsVar = cbubVar.b.get(cbubVar.c).a;
        return cbtsVar == null ? cbts.e : cbtsVar;
    }

    @Override // defpackage.crzp
    public void On(crzm<cbtv> crzmVar) {
        cbtv l = crzmVar.l();
        dbsk.s(l);
        this.e = l;
        dbsk.l(l.a == 6);
        cqkx.p(this);
    }

    @Override // defpackage.cbwt
    public String d() {
        cbtx cbtxVar = this.e.c;
        if (cbtxVar == null) {
            cbtxVar = cbtx.c;
        }
        return cbtxVar.a;
    }

    @Override // defpackage.cbwt
    public jic e() {
        return new jic(o().b, ckqc.FIFE_MERGE, cqrt.f(2131232998), 0);
    }

    @Override // defpackage.cbwt
    public String f() {
        return o().a;
    }

    @Override // defpackage.cbwt
    public String g() {
        return o().d;
    }

    @Override // defpackage.cbwt
    public Boolean h() {
        cbub cbubVar;
        cbtv cbtvVar = this.e;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        return Boolean.valueOf(cbubVar.d);
    }

    @Override // defpackage.cbwt
    public View.OnClickListener i() {
        return new View.OnClickListener(this) { // from class: cbwv
            private final cbwz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cbwz cbwzVar = this.a;
                isc iscVar = cbwzVar.d;
                if (iscVar != null) {
                    iscVar.dismiss();
                }
                cbwzVar.d = cbwzVar.b.a(view);
                jhm a = jhm.a();
                a.a = cbwzVar.c;
                a.f = cbwzVar.c(dtya.dr);
                jho c = a.c();
                isc iscVar2 = cbwzVar.d;
                if (iscVar2 != null) {
                    iscVar2.a(dcdc.f(c));
                    cbwzVar.d.show();
                }
            }
        };
    }

    @Override // defpackage.cbwt
    public View.OnClickListener j() {
        return new View.OnClickListener(this) { // from class: cbww
            private final cbwz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cbub cbubVar;
                cbwz cbwzVar = this.a;
                cbsj cbsjVar = ((cbrz) cbwzVar.a).a;
                cbtv cbtvVar = cbwzVar.e;
                if (cbtvVar.a == 6) {
                    cbubVar = (cbub) cbtvVar.b;
                } else {
                    cbubVar = cbub.e;
                }
                cbts cbtsVar = cbubVar.b.get(cbubVar.c).a;
                if (cbtsVar == null) {
                    cbtsVar = cbts.e;
                }
                cbsjVar.a(dcdc.f(cbtsVar));
            }
        };
    }

    @Override // defpackage.cbwt
    public View.OnClickListener k() {
        return new View.OnClickListener(this) { // from class: cbwx
            private final cbwz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((cbrz) this.a.a).a.a(dcdc.e());
            }
        };
    }

    @Override // defpackage.cbwt
    public View.OnClickListener l() {
        return new View.OnClickListener(this) { // from class: cbwy
            private final cbwz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((cbrz) this.a.a).a.b();
            }
        };
    }

    @Override // defpackage.cbwt
    public String m() {
        cbub cbubVar;
        cbtv cbtvVar = this.e;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        return String.valueOf(cbubVar.c + 1);
    }

    @Override // defpackage.cbwt
    public String n() {
        cbub cbubVar;
        cbtv cbtvVar = this.e;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        return String.valueOf(cbubVar.b.size());
    }
}
