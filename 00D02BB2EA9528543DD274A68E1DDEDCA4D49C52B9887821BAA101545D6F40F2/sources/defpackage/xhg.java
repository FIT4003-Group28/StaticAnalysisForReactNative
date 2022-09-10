package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xhg  reason: default package */
/* loaded from: classes7.dex */
public class xhg extends xgw {
    private final amve e;

    public xhg(dxio<xfa> dxioVar, gga ggaVar, cqhn cqhnVar, bvjj bvjjVar, dxio<afha> dxioVar2, amve amveVar, xfc xfcVar, xfd xfdVar, btvo btvoVar, ckcw ckcwVar, xgu xguVar, Executor executor) {
        super(dxioVar, ggaVar, cqhnVar, bvjjVar, dxioVar2, xguVar, xfcVar, xfdVar, btvoVar, ckcwVar);
        this.d = xfcVar.i(amveVar);
        this.e = amveVar;
        xfcVar.g().b(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<xfc> crzmVar) {
        this.d = this.a.i(this.e);
        cqkx.p(this);
        this.c.a();
    }

    @Override // defpackage.xgv
    public cjtd n() {
        return t(dtyc.cG);
    }

    @Override // defpackage.xgw
    public Boolean r() {
        return Boolean.valueOf(this.b.d(Arrays.asList(this.e)));
    }

    @Override // defpackage.xgw
    public void s() {
        this.b.c(Arrays.asList(this.e));
    }

    @Override // defpackage.xgw
    public ddgr u() {
        List<dpgh> w = vyb.w(this.e);
        ddgp bZ = ddgr.d.bZ();
        bZ.b(dchl.k(w, xhf.a));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddgr ddgrVar = (ddgr) bZ.b;
        ddgrVar.c = 1;
        ddgrVar.a = 1 | ddgrVar.a;
        return bZ.bK();
    }
}
