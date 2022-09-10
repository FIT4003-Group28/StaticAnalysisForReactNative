package defpackage;

import android.text.Html;
/* compiled from: PG */
/* renamed from: abvh  reason: default package */
/* loaded from: classes2.dex */
public class abvh implements abiu {
    @dzsi
    private final acwt a;
    private final dxio<abfb> b;
    private final akpm c;
    private final dqfo d;
    private final absg e;

    public abvh(dxio<abfb> dxioVar, akpm akpmVar, dqfo dqfoVar, @dzsi acwt acwtVar, absg absgVar) {
        this.a = acwtVar;
        this.b = dxioVar;
        this.c = akpmVar;
        this.d = dqfoVar;
        this.e = absgVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return Html.fromHtml(this.d.e).toString();
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        dqez dqezVar;
        dqez dqezVar2;
        this.a.a();
        akpm akpmVar = this.c;
        dhjx Y = akpmVar.Y(akpmVar.n());
        abfb a = this.b.a();
        dpsv dpsvVar = dpsv.DINING;
        dqfo dqfoVar = this.d;
        if (dqfoVar.b == 11) {
            dqezVar = (dqez) dqfoVar.c;
        } else {
            dqezVar = dqez.c;
        }
        int a2 = dpsx.a(dqezVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        dqfo dqfoVar2 = this.d;
        if (dqfoVar2.b == 11) {
            dqezVar2 = (dqez) dqfoVar2.c;
        } else {
            dqezVar2 = dqez.c;
        }
        dpva dpvaVar = dqezVar2.a;
        if (dpvaVar == null) {
            dpvaVar = dpva.c;
        }
        dpuz b = dpuz.b(dpvaVar.b);
        if (b == null) {
            b = dpuz.UNKNOWN_TYPE;
        }
        a.i(dpsvVar, a2, dcdc.f(b), Y);
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return cjtd.a(this.e == absg.AREA_EXPLORE ? dtxj.cL : dtxo.cG);
    }

    @Override // defpackage.abiu
    public jic l() {
        return null;
    }
}
