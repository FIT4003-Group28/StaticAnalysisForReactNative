package defpackage;

import com.google.android.apps.maps.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aeha  reason: default package */
/* loaded from: classes2.dex */
public final class aeha implements btzi<dwgv, dwgx> {
    final /* synthetic */ aehy a;
    final /* synthetic */ aehb b;

    public aeha(aehb aehbVar, aehy aehyVar) {
        this.b = aehbVar;
        this.a = aehyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwgv> btzrVar, btzy btzyVar) {
        synchronized (this.b) {
            this.b.d = null;
            if (btzyVar.p.equals(bttq.CANCELED)) {
                return;
            }
            aehy aehyVar = this.a;
            bttq bttqVar = btzyVar.p;
            if (((bdxq) aehyVar).a.S()) {
                bdyb bdybVar = ((bdxq) aehyVar).a;
                if (bdybVar.aD) {
                    cjxu.g(bdybVar.bw, bdybVar.b, bdybVar.Rp(R.string.NET_FAIL_TITLE));
                    ((bdxq) aehyVar).a.ai.b(new aehz());
                    ((bdxq) aehyVar).a.an.h(false);
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwgv> btzrVar, dwgx dwgxVar) {
        brlu c;
        int n;
        dwgx dwgxVar2 = dwgxVar;
        synchronized (this.b) {
            HashMap d = dcjz.d();
            dnxr dnxrVar = dwgxVar2.a;
            if (dnxrVar == null) {
                dnxrVar = dnxr.c;
            }
            for (dnxq dnxqVar : dnxrVar.a) {
                d.put(akqi.b(dnxqVar.a), dnxqVar);
            }
            dnxr dnxrVar2 = dwgxVar2.a;
            if (dnxrVar2 == null) {
                dnxrVar2 = dnxr.c;
            }
            dqtl dqtlVar = dnxrVar2.b;
            if (dqtlVar == null) {
                dqtlVar = dqtl.e;
            }
            String str = dqtlVar.b;
            aehy aehyVar = this.a;
            ilo bo = ((bdxq) aehyVar).a.bo();
            dnxq dnxqVar2 = (dnxq) d.get(bo.ai());
            if (dnxqVar2 != null) {
                dnng dnngVar = dnxqVar2.b;
                if (dnngVar == null) {
                    dnngVar = dnng.r;
                }
                bo.bR(dnngVar);
                if (bo.V().a()) {
                    ily g = bo.g();
                    dqtl b = bo.V().b();
                    dsqp dsqpVar = (dsqp) b.cu(5);
                    dsqpVar.bC(b);
                    dqti dqtiVar = (dqti) dsqpVar;
                    if (dqtiVar.c) {
                        dqtiVar.bF();
                        dqtiVar.c = false;
                    }
                    dqtl dqtlVar2 = (dqtl) dqtiVar.b;
                    str.getClass();
                    dqtlVar2.a |= 1;
                    dqtlVar2.b = str;
                    g.b.c = dqtiVar.bK();
                    bo = g.d();
                }
                ((bdxq) aehyVar).a.bP.d(bo);
                bwrs<brlu> bw = ((bdxq) aehyVar).a.bw();
                if (bw != null && ((bdxq) aehyVar).a.al.i() && (c = bw.c()) != null && (n = c.n(bo)) >= 0 && n < c.g()) {
                    c.j(n, bo);
                    bw.d(c);
                }
            }
            if (((bdxq) aehyVar).a.S()) {
                ((bdxq) aehyVar).a.aV();
                ((bdxq) aehyVar).a.bB(false, false);
                ((bdxq) aehyVar).a.ai.b(new aehz());
                ((bdxq) aehyVar).a.an.h(false);
            }
            this.b.d = null;
        }
    }
}
