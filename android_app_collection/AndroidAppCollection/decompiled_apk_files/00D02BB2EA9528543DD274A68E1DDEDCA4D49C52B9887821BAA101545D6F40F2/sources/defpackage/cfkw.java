package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfkw  reason: default package */
/* loaded from: classes4.dex */
public final class cfkw extends cfje implements cfhm {
    public final cfjm a;
    private final dddi b;
    private final dlnh c;
    private dcdc<cfkt> d;

    public cfkw(cfgv cfgvVar, cfku cfkuVar, dddi dddiVar, dspd dspdVar, dlnh dlnhVar, cfjm cfjmVar, cezu cezuVar) {
        this.b = dddiVar;
        this.c = dlnhVar;
        this.a = cfjmVar;
        this.d = dcdc.e();
        dccx F = dcdc.F();
        for (dlng dlngVar : dlnhVar.c) {
            cfjm cfjmVar2 = new cfjm(this) { // from class: cfkv
                private final cfkw a;

                {
                    this.a = this;
                }

                @Override // defpackage.cfjm
                public final void a(cfgd cfgdVar) {
                    cfkw cfkwVar = this.a;
                    cfkwVar.d(cfgdVar);
                    cfkwVar.a.a(cfgdVar);
                }
            };
            cfku.a(cfkuVar.a.a(), 1);
            cfku.a(dddiVar, 2);
            cfku.a(dlngVar, 3);
            cfku.a(cfjmVar2, 4);
            cfku.a(cezuVar, 5);
            F.g(new cfkt(dddiVar, dlngVar, cfjmVar2, cezuVar));
        }
        this.d = F.f();
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        if (e.a()) {
            d(e.b());
        }
    }

    @Override // defpackage.cfhm
    public Spanned a() {
        return Html.fromHtml(this.c.b);
    }

    @Override // defpackage.cfhm
    public List<cfhl> b() {
        return dcdc.r(this.d);
    }

    @Override // defpackage.cfhm
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxy.oi;
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

    public final void d(cfgd cfgdVar) {
        dspd dspdVar = cfgdVar.b;
        dcdc<cfkt> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cfkt cfktVar = dcdcVar.get(i);
            cfktVar.g(cfktVar.h().equals(dspdVar));
        }
    }
}
