package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfii  reason: default package */
/* loaded from: classes4.dex */
public final class cfii extends cfje implements cfhd {
    public final cfjm a;
    private final dddi b;
    private final dlms c;
    private dcdc<cfif> d;

    public cfii(cfgv cfgvVar, cfig cfigVar, dddi dddiVar, dspd dspdVar, dlms dlmsVar, cfjm cfjmVar) {
        this.b = dddiVar;
        this.c = dlmsVar;
        this.a = cfjmVar;
        this.d = dcdc.e();
        dccx F = dcdc.F();
        for (dlmr dlmrVar : dlmsVar.d) {
            F.g(cfigVar.a(dddiVar, dlmrVar, new cfjm(this) { // from class: cfih
                private final cfii a;

                {
                    this.a = this;
                }

                @Override // defpackage.cfjm
                public final void a(cfgd cfgdVar) {
                    cfii cfiiVar = this.a;
                    cfiiVar.f(cfgdVar);
                    cfiiVar.a.a(cfgdVar);
                }
            }));
        }
        this.d = F.f();
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        if (e.a()) {
            f(e.b());
        }
    }

    @Override // defpackage.cfhd
    public Spanned a() {
        return Html.fromHtml(this.c.a);
    }

    @Override // defpackage.cfhd
    public List<cfhc> b() {
        return dcdc.r(this.d);
    }

    @Override // defpackage.cfhd
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxy.nX;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.b;
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

    @Override // defpackage.cfhd
    public Spanned d() {
        return Html.fromHtml(this.c.b);
    }

    @Override // defpackage.cfhd
    public Spanned e() {
        return Html.fromHtml(this.c.c);
    }

    public final void f(cfgd cfgdVar) {
        dspd dspdVar = cfgdVar.b;
        dcdc<cfif> dcdcVar = this.d;
        dbsk.s(dcdcVar);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cfif cfifVar = dcdcVar.get(i);
            cfifVar.f(cfifVar.g().equals(dspdVar));
        }
    }
}
