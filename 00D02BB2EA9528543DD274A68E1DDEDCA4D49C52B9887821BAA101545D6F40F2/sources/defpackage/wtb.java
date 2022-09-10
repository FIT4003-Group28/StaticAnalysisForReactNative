package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: wtb  reason: default package */
/* loaded from: classes7.dex */
final class wtb implements bxeq {
    final /* synthetic */ wtc a;

    public wtb(wtc wtcVar) {
        this.a = wtcVar;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List<dwjj> list) {
        wtc wtcVar = this.a;
        wtcVar.d.b(dbsg.i(Integer.valueOf(wtcVar.a)), bxmhVar, list, this.a);
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        amvh L;
        if (!this.a.bg()) {
            return;
        }
        this.a.e.a(ckls.DIRECTIONS_SUGGESTION_CLICKED);
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        amvh L2 = amvh.L(dwjjVar, this.a.J());
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a = dxbk.a(dxbpVar.g);
        ddgg ddggVar = null;
        if (a == 0 || a != 12 || bxmhVar2 == null) {
            L = null;
        } else {
            dwjj dwjjVar2 = bxmhVar2.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            L = amvh.L(dwjjVar2, this.a.J());
        }
        if (bxkvVar != null) {
            ddggVar = bxkvVar.d();
        }
        wtc wtcVar = this.a;
        wte wteVar = wtcVar.f;
        wtd wtdVar = new wtd(dbsg.i(Integer.valueOf(wtcVar.a)), L2, bxns.a(ddggVar), 1);
        wtdVar.a = L;
        wtdVar.c = this.a.w();
        wtdVar.d = dnqhVar;
        wtdVar.e = ddggVar;
        wteVar.a(wtdVar.a());
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        if (!this.a.bg()) {
            return;
        }
        wtc wtcVar = this.a;
        wte wteVar = wtcVar.f;
        dbsg i = dbsg.i(Integer.valueOf(wtcVar.a));
        amvg amvgVar = new amvg();
        amvgVar.b = str;
        amvgVar.k = false;
        wtd wtdVar = new wtd(i, amvgVar.a(), false, 2);
        wtdVar.c = this.a.w();
        wtdVar.d = dnqhVar;
        ddgg ddggVar = dnqhVar.k;
        if (ddggVar == null) {
            ddggVar = ddgg.y;
        }
        wtdVar.e = ddggVar;
        wteVar.a(wtdVar.a());
    }
}
