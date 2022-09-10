package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfid  reason: default package */
/* loaded from: classes4.dex */
public class cfid extends cfje implements cfhb {
    private final dddi a;
    private final dlmm b;
    private final cfjm c;
    private dcdc<cfhz> d;
    private dbsg<cfhz> e;

    public cfid(cfgv cfgvVar, cfia cfiaVar, dddi dddiVar, dspd dspdVar, dlmm dlmmVar, cfjm cfjmVar) {
        this.a = dddiVar;
        this.b = dlmmVar;
        this.c = cfjmVar;
        this.d = dcdc.e();
        dccx F = dcdc.F();
        for (dlmh dlmhVar : dlmmVar.c) {
            F.g(cfiaVar.a(dddiVar, dlmhVar, new cfjm(this) { // from class: cfib
                private final cfid a;

                {
                    this.a = this;
                }

                @Override // defpackage.cfjm
                public final void a(cfgd cfgdVar) {
                    this.a.g(cfgdVar);
                }
            }));
        }
        this.d = F.f();
        this.e = dbpy.a;
        if ((dlmmVar.a & 2) != 0) {
            dlmh dlmhVar2 = dlmmVar.d;
            this.e = dbsg.i(cfiaVar.a(dddiVar, dlmhVar2 == null ? dlmh.d : dlmhVar2, new cfjm(this) { // from class: cfic
                private final cfid a;

                {
                    this.a = this;
                }

                @Override // defpackage.cfjm
                public final void a(cfgd cfgdVar) {
                    this.a.g(cfgdVar);
                }
            }));
        }
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        if (e.a()) {
            m(e.b());
        }
    }

    private final void m(cfgd cfgdVar) {
        dspd dspdVar = cfgdVar.b;
        dcdc<cfhz> dcdcVar = this.d;
        dbsk.s(dcdcVar);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cfhz cfhzVar = dcdcVar.get(i);
            cfhzVar.f(cfhzVar.g().equals(dspdVar));
        }
        if (this.e.a()) {
            this.e.b().f(this.e.b().g().equals(dspdVar));
        }
    }

    @Override // defpackage.cfhb
    public Spanned a() {
        return Html.fromHtml(this.b.b);
    }

    @Override // defpackage.cfhb
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.cfhb
    public List<cfha> c() {
        return dcdc.r(this.d);
    }

    @Override // defpackage.cfhb
    @dzsi
    public cfha d() {
        return this.e.f();
    }

    @Override // defpackage.cfhb
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxy.nV;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddiVar.getClass();
        dddgVar.d = dddiVar;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }

    @Override // defpackage.cfhb
    public Boolean f() {
        dlml dlmlVar = this.b.e;
        if (dlmlVar == null) {
            dlmlVar = dlml.b;
        }
        int a = dlmk.a(dlmlVar.a);
        boolean z = false;
        if (a != 0 && a == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void g(cfgd cfgdVar) {
        m(cfgdVar);
        this.c.a(cfgdVar);
    }
}
