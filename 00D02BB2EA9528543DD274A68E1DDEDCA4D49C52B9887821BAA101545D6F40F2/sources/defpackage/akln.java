package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akln  reason: default package */
/* loaded from: classes2.dex */
public class akln implements aklc {
    private static final dcqe a = dcqe.c("akln");
    private final List<aklf> b;
    @dzsi
    private final aklf c;
    @dzsi
    private final CharSequence d;

    public akln(dpsf dpsfVar, @dzsi acwt acwtVar, @dzsi ddho ddhoVar, aklt akltVar) {
        akls aklsVar;
        ddho d;
        dccx F = dcdc.F();
        dqfq dqfqVar = dpsfVar.b;
        for (dqfo dqfoVar : (dqfqVar == null ? dqfq.h : dqfqVar).f) {
            F.g(akltVar.a(dqfoVar, acwtVar, d(dqfoVar, ddhoVar)));
        }
        this.b = F.f();
        String str = null;
        if ((dpsfVar.a & 2) != 0) {
            dqfo dqfoVar2 = dpsfVar.c;
            dqfoVar2 = dqfoVar2 == null ? dqfo.j : dqfoVar2;
            dqfo dqfoVar3 = dpsfVar.c;
            dqfoVar3 = dqfoVar3 == null ? dqfo.j : dqfoVar3;
            if (ddhoVar == null) {
                bvoo.h("Failed to pick VE type for see all button. Received unexpected null parentVeType.", new Object[0]);
                d = dtxv.z;
            } else if (dtxr.Q.equals(ddhoVar) || dtxj.ci.equals(ddhoVar) || dtxj.ch.equals(ddhoVar)) {
                d = d(dqfoVar3, ddhoVar);
            } else if (dtxl.q.equals(ddhoVar)) {
                d = dtxl.r;
            } else if (dtxu.bl.equals(ddhoVar)) {
                d = dtxu.bm;
            } else {
                bvoo.h("Failed to pick VE type for categorical button. Received unexpected parentVeType of %s.", ddhoVar);
                d = dtxv.z;
            }
            aklsVar = akltVar.a(dqfoVar2, acwtVar, d);
        } else {
            aklsVar = null;
        }
        this.c = aklsVar;
        dqfq dqfqVar2 = dpsfVar.b;
        if (((dqfqVar2 == null ? dqfq.h : dqfqVar2).a & 4) != 0) {
            dqfq dqfqVar3 = dpsfVar.b;
            str = (dqfqVar3 == null ? dqfq.h : dqfqVar3).d;
        }
        this.d = str;
    }

    private static ddho d(dqfo dqfoVar, @dzsi ddho ddhoVar) {
        dprx dprxVar;
        dprx dprxVar2;
        if (ddhoVar == null) {
            bvoo.h("Failed to pick VE type for categorical button. Received unexpected null parentVeType.", new Object[0]);
            return dtxv.z;
        } else if (dtxr.Q.equals(ddhoVar)) {
            if (dqfoVar.b == 6) {
                dprxVar2 = (dprx) dqfoVar.c;
            } else {
                dprxVar2 = dprx.h;
            }
            dpsh dpshVar = dprxVar2.f;
            if (dpshVar == null) {
                dpshVar = dpsh.e;
            }
            return dpshVar.b ? dtxo.cr : dtxo.cl;
        } else if (dtxj.ci.equals(ddhoVar) || dtxj.ch.equals(ddhoVar)) {
            if (dqfoVar.b == 6) {
                dprxVar = (dprx) dqfoVar.c;
            } else {
                dprxVar = dprx.h;
            }
            dpsh dpshVar2 = dprxVar.f;
            if (dpshVar2 == null) {
                dpshVar2 = dpsh.e;
            }
            return dpshVar2.b ? dtxj.cj : dtxj.bW;
        } else {
            bvoo.h("Failed to pick VE type for categorical button. Received unexpected parentVeType of %s.", ddhoVar);
            return dtxv.z;
        }
    }

    @Override // defpackage.aklc
    public List<aklf> a() {
        return this.b;
    }

    @Override // defpackage.aklc
    @dzsi
    public aklf b() {
        return this.c;
    }

    @Override // defpackage.aklc
    @dzsi
    public CharSequence c() {
        return this.d;
    }
}
