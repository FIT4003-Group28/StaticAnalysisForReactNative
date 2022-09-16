package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: srs  reason: default package */
/* loaded from: classes7.dex */
public final class srs implements vmb {
    final /* synthetic */ srv a;

    public srs(srv srvVar) {
        this.a = srvVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwaw> btzrVar, btzy btzyVar) {
        srv srvVar = this.a;
        synchronized (srvVar) {
            srx w = srvVar.k.w();
            w.e(false);
            srvVar.k = w.a();
            srvVar.q(false);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwaw> btzrVar, amsy amsyVar) {
        srf srfVar;
        avtq avtqVar;
        amsy amsyVar2 = amsyVar;
        srv srvVar = this.a;
        dwaw dwawVar = btzrVar.a;
        synchronized (srvVar) {
            dwbc dwbcVar = amsyVar2.a;
            dvzy dvzyVar = dwawVar.b;
            if (dvzyVar == null) {
                dvzyVar = dvzy.u;
            }
            dnqh dnqhVar = dvzyVar.o;
            if (dnqhVar == null) {
                dnqhVar = dnqh.p;
            }
            srfVar = null;
            if (dnqhVar.j) {
                srvVar.n = null;
                cqat cqatVar = srvVar.c;
                dvzy dvzyVar2 = dwawVar.b;
                if (dvzyVar2 == null) {
                    dvzyVar2 = dvzy.u;
                }
                dnqh dnqhVar2 = dvzyVar2.o;
                if (dnqhVar2 == null) {
                    dnqhVar2 = dnqh.p;
                }
                dwat dwatVar = (dwat) dwaw.j.ca(dwawVar);
                dvzv dvzvVar = (dvzv) dvzy.u.ca(dvzyVar2);
                dnqg ca = dnqh.p.ca(dnqhVar2);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dnqh dnqhVar3 = (dnqh) ca.b;
                dnqhVar3.a |= 2048;
                dnqhVar3.j = false;
                if (dvzvVar.c) {
                    dvzvVar.bF();
                    dvzvVar.c = false;
                }
                dvzy dvzyVar3 = (dvzy) dvzvVar.b;
                dnqh bK = ca.bK();
                bK.getClass();
                dvzyVar3.o = bK;
                dvzyVar3.a |= 8192;
                if (dwatVar.c) {
                    dwatVar.bF();
                    dwatVar.c = false;
                }
                dwaw dwawVar2 = (dwaw) dwatVar.b;
                dvzy dvzyVar4 = (dvzy) dvzvVar.bK();
                dvzyVar4.getClass();
                dwawVar2.b = dvzyVar4;
                dwawVar2.a |= 1;
                srvVar.m = new avtq(cqatVar, (dwaw) dwatVar.bK(), dwbcVar);
            } else {
                srvVar.m = null;
                srvVar.n = new avtq(srvVar.c, dwawVar, dwbcVar);
                if (srvVar.k.x() == 4) {
                    avtqVar = srvVar.n;
                    srx w = srvVar.k.w();
                    w.e(false);
                    srvVar.k = w.a();
                    if (srvVar.k.x() != 4 || amsyVar2.t()) {
                        srfVar = srvVar.h(dwawVar, amsyVar2, false);
                    }
                    srvVar.k.x();
                }
            }
            avtqVar = null;
            srx w2 = srvVar.k.w();
            w2.e(false);
            srvVar.k = w2.a();
            if (srvVar.k.x() != 4) {
            }
            srfVar = srvVar.h(dwawVar, amsyVar2, false);
            srvVar.k.x();
        }
        if (srfVar != null) {
            srvVar.f.b(srfVar);
            if (avtqVar == null) {
                return;
            }
            srvVar.g.u(avtqVar);
        }
    }
}
