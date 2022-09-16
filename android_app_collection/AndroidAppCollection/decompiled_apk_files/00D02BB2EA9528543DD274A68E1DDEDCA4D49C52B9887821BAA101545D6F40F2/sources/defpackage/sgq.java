package defpackage;

import android.app.Application;
import android.view.View;
/* compiled from: PG */
/* renamed from: sgq  reason: default package */
/* loaded from: classes7.dex */
public class sgq extends sbv implements sba {
    private final shb a;
    private final sgp b;

    public sgq(cqhn cqhnVar, shc shcVar, String str, String str2, dcdc<amvh> dcdcVar, amte amteVar, int i, final sgp sgpVar) {
        super(str, str2, new View.OnClickListener(sgpVar) { // from class: sgn
            private final sgp a;

            {
                this.a = sgpVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gga ggaVar = ((roh) this.a).a.aE;
                dbsk.s(ggaVar);
                ggaVar.g().f();
            }
        });
        this.b = sgpVar;
        Application a = shcVar.a.a();
        shc.a(a, 1);
        cqhn a2 = shcVar.b.a();
        shc.a(a2, 2);
        qjk a3 = shcVar.c.a();
        shc.a(a3, 3);
        shu a4 = shcVar.d.a();
        shc.a(a4, 4);
        sic a5 = shcVar.e.a();
        shc.a(a5, 5);
        sdz a6 = shcVar.f.a();
        shc.a(a6, 6);
        qsm a7 = shcVar.g.a();
        shc.a(a7, 7);
        vox a8 = shcVar.h.a();
        shc.a(a8, 8);
        sgc a9 = shcVar.i.a();
        shc.a(a9, 9);
        akox a10 = shcVar.j.a();
        shc.a(a10, 10);
        shc.a(dcdcVar, 11);
        shc.a(amteVar, 12);
        this.a = new shb(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, dcdcVar, amteVar, i);
    }

    @Override // defpackage.saj
    public void b() {
        this.a.q(new sbc(this) { // from class: sgo
            private final sgq a;

            {
                this.a = this;
            }

            @Override // defpackage.sbc
            public final void a() {
                cqkx.p(this.a);
            }
        });
        this.a.i();
    }

    @Override // defpackage.saj
    public void c() {
        this.a.k();
        this.a.q(null);
    }

    @Override // defpackage.saj
    public Boolean d() {
        return this.a.a();
    }

    @Override // defpackage.sbv, defpackage.saj
    public Boolean e() {
        return Boolean.valueOf(this.a.o() != null);
    }

    @Override // defpackage.saj
    public cqkl f() {
        sgp sgpVar = this.b;
        sbe o = this.a.o();
        dbsk.s(o);
        roh rohVar = (roh) sgpVar;
        roj rojVar = rohVar.a;
        rojVar.Nw(new rmb(o, rojVar.ae));
        gga ggaVar = rohVar.a.aE;
        dbsk.s(ggaVar);
        ggaVar.g().f();
        return cqkl.a;
    }

    @Override // defpackage.saj
    public cjtd g() {
        return cjtd.a(dtxl.cV);
    }

    @Override // defpackage.sba
    public sbd j() {
        return this.a;
    }

    public void k() {
        this.a.g();
    }
}
