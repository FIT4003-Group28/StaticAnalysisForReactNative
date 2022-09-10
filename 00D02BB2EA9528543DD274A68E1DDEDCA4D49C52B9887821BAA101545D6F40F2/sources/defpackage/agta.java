package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: agta  reason: default package */
/* loaded from: classes2.dex */
public final class agta extends cqiw<agxe> {
    private static final cqtd f = cqui.c(cquh.i(cqta.f(), cqta.f(), cqta.f(), cqta.d(1711276032), cqta.d(-1728053248), cqta.d(-1728053248), cqta.d(-1728053248)));
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();
    public static final cqjg e = cqjg.a();
    private static final Object g = new Object();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agxe agxeVar, Context context, cqiv cqivVar) {
        float f2;
        agxe agxeVar2 = agxeVar;
        if (i == 0) {
            cqix<? extends agxd> c2 = agxeVar2.c();
            if (c2 == null) {
                return;
            }
            cqivVar.e(c2);
        } else if (i != 1) {
        } else {
            List<agxa<?>> a2 = agxeVar2.a();
            if (a2.isEmpty()) {
                return;
            }
            int i2 = 0;
            float h = agwz.h(a2.get(0)) - 4.0f;
            while (i2 < a2.size()) {
                agxa<?> agxaVar = a2.get(i2);
                V v = agxaVar.b;
                v.e(cqrp.d(Math.max(h, 0.0f)));
                float f3 = agxaVar.a.f(agxaVar.b);
                int i3 = i2 + 1;
                float h2 = i3 < a2.size() ? agwz.h(a2.get(i3)) : 0.0f;
                float max = Math.max(f3, h2);
                if (max > 0.0f) {
                    f2 = (max / (h2 + f3)) * f3;
                    h = max - f2;
                } else {
                    h = 0.0f;
                    f2 = 0.0f;
                }
                if (i2 == a2.size() - 1) {
                    f2 += 0.0f;
                }
                v.g(cqrp.d(Math.max(f2, 0.0f)));
                cqivVar.a(agxaVar.a, agxaVar.b);
                i2 = i3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agxe> a() {
        agrd h = agre.h();
        ((agcm) h).a = g;
        cqmp[] cqmpVarArr = {cqic.c(agsu.a, new cqmp[0]), cqgr.cd(-1), cqgr.bp(-1), jnq.y(cqgr.cd(-1), cqgr.bp(-1), jnq.C((Boolean) false), jnq.A(true), cqgr.az(false), cqgr.fw(new agrf(h.a())), cqgr.fA(2), cqgr.fy(agsv.a), cqgr.fx(agsw.a), cqgr.fC(agsz.a), cqgr.dx(2)), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.x(f))};
        Float valueOf = Float.valueOf(1.0f);
        cqlc cqlcVar = agsx.a;
        cqgq n = cqgr.n();
        Float valueOf2 = Float.valueOf(0.0f);
        n.a = valueOf2;
        n.d = 250;
        n.d();
        cqnf b2 = n.b();
        cqgq n2 = cqgr.n();
        n2.a = valueOf;
        n2.d = 250;
        n2.j();
        cqmp[] cqmpVarArr2 = {cqgr.bp(-2), cqgr.i(valueOf), cqgr.dr(1), cqgr.L(false), cqgr.P(false), cqjv.l(cqlcVar, b2, n2.b()), cqgr.fY(cqgr.L(false), cqgr.P(false), cqgr.ck(D(0))), cqgr.gd(cqgr.aT(e), cqgr.bp(-2), cqgr.dr(1), cqgr.L(false), cqgr.P(false), cqgr.ck(D(1)))};
        cqlc cqlcVar2 = agsy.a;
        cqgq n3 = cqgr.n();
        n3.a = valueOf2;
        n3.d = 250;
        n3.c();
        cqnf b3 = n3.b();
        cqgq n4 = cqgr.n();
        n4.a = valueOf;
        n4.d = 250;
        n4.j();
        return agxk.e(cqgr.bV(cqrp.d(8.0d)), cqgr.L(false), cqgr.P(false), cqgr.M(false), iue.c(agst.a), cqgr.fY(cqmpVarArr), cqgr.gd(cqmpVarArr2), agwr.a(cqgr.fI(8), cqgr.i(valueOf2), agwr.b(ibm.g()), cqgr.dd(), cqjv.l(cqlcVar2, b3, n4.b()), cqgr.gg(cqgr.ch(cqrp.d(48.0d)), cqgr.bw(17))));
    }
}
