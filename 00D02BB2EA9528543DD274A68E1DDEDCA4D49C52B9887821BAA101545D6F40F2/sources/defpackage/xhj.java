package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xhj  reason: default package */
/* loaded from: classes7.dex */
public class xhj extends xgw {
    private final amsy e;

    public xhj(dxio<xfa> dxioVar, gga ggaVar, cqhn cqhnVar, bvjj bvjjVar, dxio<afha> dxioVar2, amsy amsyVar, xfc xfcVar, xfd xfdVar, btvo btvoVar, ckcw ckcwVar, xgu xguVar, Executor executor) {
        super(dxioVar, ggaVar, cqhnVar, bvjjVar, dxioVar2, xguVar, xfcVar, xfdVar, btvoVar, ckcwVar);
        this.d = xfcVar.h(amsyVar);
        this.e = amsyVar;
        xfcVar.g().b(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<xfc> crzmVar) {
        this.d = this.a.h(this.e);
        cqkx.p(this);
        this.c.a();
    }

    @Override // defpackage.xgw, defpackage.xgv
    public Boolean d() {
        return false;
    }

    @Override // defpackage.xgv
    public cjtd n() {
        return cjtd.b;
    }

    @Override // defpackage.xgw
    public Boolean r() {
        return Boolean.valueOf(this.b.d(Arrays.asList(this.e.d)));
    }

    @Override // defpackage.xgw
    public void s() {
        this.b.c(Arrays.asList(this.e.d));
    }

    @Override // defpackage.xgw
    public ddgr u() {
        HashSet hashSet = new HashSet();
        for (amve amveVar : this.e.d) {
            hashSet.addAll(dchl.k(vyb.w(amveVar), xhi.a));
        }
        ddgp bZ = ddgr.d.bZ();
        bZ.b(hashSet);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddgr ddgrVar = (ddgr) bZ.b;
        ddgrVar.c = 2;
        ddgrVar.a |= 1;
        return bZ.bK();
    }
}
