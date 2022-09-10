package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cejb  reason: default package */
/* loaded from: classes4.dex */
public final class cejb extends cqiw<cesw> {
    private static final cqrp d = cqrp.d(200.0d);
    private static final cqrp e = cqrp.d(130.0d);
    public static final cqrp a = cqrp.d(100.0d);
    public static final cqrp b = cqrp.d(2.0d);
    public static final cqtd c = cqui.c(cquh.d(GradientDrawable.Orientation.TOP_BOTTOM), cquh.i(cqta.f(), ire.r()));

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cesw ceswVar, Context context, cqiv cqivVar) {
        ceja cejaVar;
        cesv cesvVar;
        cesw ceswVar2 = ceswVar;
        int intValue = ceswVar2.k().intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            return;
                        }
                        if (i == 0) {
                            cqrp cqrpVar = e;
                            cqivVar.a(new ceja(cqrpVar), ceswVar2.j().get(0));
                            cqivVar.c(new ceit());
                            cejaVar = new ceja(cqrpVar);
                        } else if (i != 1) {
                            return;
                        } else {
                            cqrp cqrpVar2 = e;
                            cqivVar.a(new ceja(cqrpVar2), ceswVar2.j().get(2));
                            cqivVar.c(new ceit());
                            cqivVar.a(new ceja(cqrpVar2), ceswVar2.j().get(3));
                            cqivVar.c(new ceit());
                            cejaVar = new ceja(cqrpVar2);
                            cesvVar = ceswVar2.j().get(4);
                        }
                    } else if (i == 0) {
                        cqrp cqrpVar3 = e;
                        cqivVar.a(new ceja(cqrpVar3), ceswVar2.j().get(0));
                        cqivVar.c(new ceit());
                        cejaVar = new ceja(cqrpVar3);
                    } else if (i != 1) {
                        return;
                    } else {
                        cqrp cqrpVar4 = e;
                        cqivVar.a(new ceja(cqrpVar4), ceswVar2.j().get(2));
                        cqivVar.c(new ceit());
                        cejaVar = new ceja(cqrpVar4);
                        cesvVar = ceswVar2.j().get(3);
                    }
                } else if (i == 0) {
                    cejaVar = new ceja(e);
                } else if (i != 1) {
                    return;
                } else {
                    cqrp cqrpVar5 = e;
                    cqivVar.a(new ceja(cqrpVar5), ceswVar2.j().get(1));
                    cqivVar.c(new ceit());
                    cejaVar = new ceja(cqrpVar5);
                    cesvVar = ceswVar2.j().get(2);
                }
                cqivVar.a(cejaVar, cesvVar);
            } else if (i != 0) {
                return;
            } else {
                cqrp cqrpVar6 = d;
                cqivVar.a(new ceja(cqrpVar6), ceswVar2.j().get(0));
                cqivVar.c(new ceit());
                cejaVar = new ceja(cqrpVar6);
            }
            cesvVar = ceswVar2.j().get(1);
            cqivVar.a(cejaVar, cesvVar);
        } else if (i != 0) {
            return;
        } else {
            cejaVar = new ceja(d);
        }
        cesvVar = ceswVar2.j().get(0);
        cqivVar.a(cejaVar, cesvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cesw> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.aF(cqjv.x(ceim.a)), cqgr.ck(D(0))), cqgr.fY(cqgr.bq(b), cqgr.aI(cein.a)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.aI(ceio.a), cqgr.ck(D(1)))};
        cqrp f = ibn.f();
        return cqgr.gd(cqgr.aW(2), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.fP(new cerf(), ceil.a, new cqmp[0]), cqgr.gd(cqmpVarArr), cqgr.gq(cqgr.aF(cqjv.x(ceip.a)), cqgr.cd(-1), cqgr.cH(ibn.a()), cqgr.dz(f, f, f, f), cqgr.x(ibo.h()), cqgr.eM(ceiq.a), ibq.u(), cqgr.eN(4), cqgr.cW(cqgr.q(ceir.a)), iue.c(ceis.a)));
    }
}
