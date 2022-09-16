package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: pmr  reason: default package */
/* loaded from: classes7.dex */
public class pmr extends ibd implements plt {
    private final String g;
    private final dcdc<pls> h;
    private final dcdc<iao> i;
    private final dqso j;
    private final gga k;
    private final brba l;
    private final dxio<afha> m;
    private final String n;

    public pmr(gga ggaVar, cqhn cqhnVar, cjqy cjqyVar, pmo pmoVar, brba brbaVar, dxio<afha> dxioVar, String str, dqtf dqtfVar) {
        super(cqhnVar, cjqyVar);
        this.k = ggaVar;
        this.l = brbaVar;
        this.m = dxioVar;
        this.n = str;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (dqte dqteVar : dqtfVar.b) {
            pmf a = pmoVar.a.a();
            pmo.a(a, 1);
            pmo.a(str, 2);
            pmo.a(dqteVar, 3);
            F.g(new pmn(a, str, dqteVar));
            F2.g(new pmq(dqteVar.a, str));
        }
        dqso dqsoVar = dqtfVar.c;
        this.j = dqsoVar == null ? dqso.d : dqsoVar;
        this.g = dqtfVar.a;
        this.h = F.f();
        this.i = F2.f();
    }

    @Override // defpackage.plt
    public CharSequence d() {
        return this.g;
    }

    @Override // defpackage.plt
    public List<cqix<?>> e() {
        return dcdc.q(dcbg.b(this.i).s(pmp.a));
    }

    @Override // defpackage.plt
    public List<pls> f() {
        return this.h;
    }

    @Override // defpackage.plt
    public CharSequence g() {
        return this.j.c;
    }

    @Override // defpackage.plt
    public cqkl h(cjqm cjqmVar) {
        dqso dqsoVar = this.j;
        if (dqsoVar.a == 3) {
            String str = ((dgbo) dqsoVar.b).c;
            if (!str.isEmpty()) {
                this.m.a().l(this.k, Uri.parse(str), 4);
            }
        }
        if (this.j.a == 4) {
            dnqg bZ = dnqh.p.bZ();
            int i = ddda.aA.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            if (cjqmVar.a().a()) {
                String b = cjqmVar.a().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                b.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = b;
                doeh bZ2 = doei.d.bZ();
                String b2 = cjqmVar.a().b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                doei doeiVar = (doei) bZ2.b;
                b2.getClass();
                doeiVar.a |= 4;
                doeiVar.c = b2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar3 = (dnqh) bZ.b;
                doei bK = bZ2.bK();
                bK.getClass();
                dnqhVar3.m = bK;
                dnqhVar3.a |= 262144;
            }
            brba brbaVar = this.l;
            dqso dqsoVar2 = this.j;
            brbaVar.j(dqsoVar2.a == 4 ? (String) dqsoVar2.b : "", bZ.bK());
        }
        return cqkl.a;
    }

    @Override // defpackage.plt
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtxl.il;
        b.g(this.n);
        return b.a();
    }
}
