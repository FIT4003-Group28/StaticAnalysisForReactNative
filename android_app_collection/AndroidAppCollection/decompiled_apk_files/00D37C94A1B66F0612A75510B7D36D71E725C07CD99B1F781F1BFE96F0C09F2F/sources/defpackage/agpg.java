package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: agpg  reason: default package */
/* loaded from: classes.dex */
public final class agpg implements agry {
    private static final agrx a = new agrw(1);
    private final aguu b;
    private final agrf c;

    public agpg(agrf agrfVar, aguu aguuVar) {
        this.c = agrfVar;
        this.b = aguuVar;
    }

    private static amuk d(int i) {
        amuf f = amuk.f();
        for (int i2 = 0; i2 < i; i2++) {
            f.h(agru.b);
        }
        return f.g();
    }

    private static aopc e(atrc atrcVar) {
        aopc aopcVar = (aopc) atrc.b.createBuilder();
        int i = atrcVar.d;
        aopcVar.copyOnWrite();
        atrc atrcVar2 = (atrc) aopcVar.instance;
        atrcVar2.c |= 1;
        atrcVar2.d = i;
        aops<atra> aopsVar = new aops(atrcVar.e, atrc.a);
        aopcVar.copyOnWrite();
        atrc atrcVar3 = (atrc) aopcVar.instance;
        atrcVar3.a();
        for (atra atraVar : aopsVar) {
            atrcVar3.e.g(atraVar.e);
        }
        return aopcVar;
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        int aq = akel.aq(atrfVar.c);
        return (aq != 0 && aq == 4) ? a : agrx.a;
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        agru agruVar;
        String g = aakj.g(atrfVar.d);
        if (g.isEmpty()) {
            return anlz.q(agru.c);
        }
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        int i = aq - 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    agvx a2 = this.c.a();
                    if (!afvmVar.d().equals(a2.q())) {
                        agruVar = agru.b;
                    } else if (this.b.b(a2, amvn.r(g)) != null) {
                        agruVar = agru.a;
                    } else {
                        agruVar = agru.b;
                    }
                    return anlz.q(agruVar);
                }
                Object[] objArr = new Object[2];
                int aq2 = akel.aq(atrfVar.c);
                if (aq2 == 0) {
                    aq2 = 1;
                }
                objArr[0] = Integer.valueOf(aq2 - 1);
                objArr[1] = 155;
                zep.e("Could not handle action: %s for type %s", objArr);
                return anlz.q(agru.c);
            }
            atrc atrcVar = atrfVar.e;
            if (atrcVar == null) {
                atrcVar = atrc.b;
            }
            amuf f = amuk.f();
            aopa createBuilder = atrf.a.createBuilder();
            createBuilder.copyOnWrite();
            atrf atrfVar2 = (atrf) createBuilder.instance;
            atrfVar2.c = 2;
            atrfVar2.b |= 1;
            String f2 = aakj.f(atyq.b.a(), g);
            createBuilder.copyOnWrite();
            atrf atrfVar3 = (atrf) createBuilder.instance;
            f2.getClass();
            atrfVar3.b |= 2;
            atrfVar3.d = f2;
            createBuilder.copyOnWrite();
            atrf atrfVar4 = (atrf) createBuilder.instance;
            atrcVar.getClass();
            atrfVar4.e = atrcVar;
            atrfVar4.b |= 4;
            aopa createBuilder2 = atrf.a.createBuilder();
            createBuilder2.copyOnWrite();
            atrf atrfVar5 = (atrf) createBuilder2.instance;
            atrfVar5.c = 2;
            atrfVar5.b = 1 | atrfVar5.b;
            String f3 = aakj.f(awky.b.a(), g);
            createBuilder2.copyOnWrite();
            atrf atrfVar6 = (atrf) createBuilder2.instance;
            f3.getClass();
            atrfVar6.b |= 2;
            atrfVar6.d = f3;
            createBuilder2.copyOnWrite();
            atrf atrfVar7 = (atrf) createBuilder2.instance;
            atrcVar.getClass();
            atrfVar7.e = atrcVar;
            atrfVar7.b |= 4;
            createBuilder2.aE((atrf) createBuilder.mo39build());
            f.h((atrf) createBuilder2.mo39build());
            agrt a3 = agru.a();
            a3.a = 2;
            a3.b(f.g());
            return anlz.q(a3.a());
        }
        atrc atrcVar2 = atrfVar.e;
        if (atrcVar2 == null) {
            atrcVar2 = atrc.b;
        }
        amuf f4 = amuk.f();
        aopa createBuilder3 = atrf.a.createBuilder();
        createBuilder3.copyOnWrite();
        atrf atrfVar8 = (atrf) createBuilder3.instance;
        atrfVar8.c = 1;
        atrfVar8.b |= 1;
        String f5 = aakj.f(atyq.b.a(), g);
        createBuilder3.copyOnWrite();
        atrf atrfVar9 = (atrf) createBuilder3.instance;
        f5.getClass();
        atrfVar9.b |= 2;
        atrfVar9.d = f5;
        awjo awjoVar = (awjo) atrcVar2.qm(awjo.b);
        aopc e = e(atrcVar2);
        if (!new aops(((atrc) e.instance).e, atrc.a).contains(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK)) {
            e.cm(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
        }
        aopg aopgVar = atym.b;
        aopa createBuilder4 = atym.a.createBuilder();
        attl b = attl.b(awjoVar.e);
        if (b == null) {
            b = attl.UNKNOWN_FORMAT_TYPE;
        }
        createBuilder4.copyOnWrite();
        atym atymVar = (atym) createBuilder4.instance;
        atymVar.e = b.k;
        atymVar.c |= 2;
        String str = awjoVar.h;
        createBuilder4.copyOnWrite();
        atym atymVar2 = (atym) createBuilder4.instance;
        str.getClass();
        atymVar2.c |= 8;
        atymVar2.f = str;
        aoob aoobVar = awjoVar.d;
        createBuilder4.copyOnWrite();
        atym atymVar3 = (atym) createBuilder4.instance;
        aoobVar.getClass();
        atymVar3.c |= 1;
        atymVar3.d = aoobVar;
        e.e(aopgVar, (atym) createBuilder4.mo39build());
        atrc atrcVar3 = (atrc) e.mo39build();
        createBuilder3.copyOnWrite();
        atrf atrfVar10 = (atrf) createBuilder3.instance;
        atrcVar3.getClass();
        atrfVar10.e = atrcVar3;
        atrfVar10.b |= 4;
        atrf atrfVar11 = (atrf) createBuilder3.mo39build();
        aopa createBuilder5 = atrf.a.createBuilder();
        createBuilder5.copyOnWrite();
        atrf atrfVar12 = (atrf) createBuilder5.instance;
        atrfVar12.c = 1;
        atrfVar12.b |= 1;
        String f6 = aakj.f(awky.b.a(), g);
        createBuilder5.copyOnWrite();
        atrf atrfVar13 = (atrf) createBuilder5.instance;
        f6.getClass();
        atrfVar13.b |= 2;
        atrfVar13.d = f6;
        awjo awjoVar2 = (awjo) atrcVar2.qm(awjo.b);
        aopa createBuilder6 = awkr.a.createBuilder();
        attl b2 = attl.b(awjoVar2.e);
        if (b2 == null) {
            b2 = attl.UNKNOWN_FORMAT_TYPE;
        }
        createBuilder6.copyOnWrite();
        awkr awkrVar = (awkr) createBuilder6.instance;
        awkrVar.e = b2.k;
        awkrVar.c |= 2;
        aoob aoobVar2 = awjoVar2.d;
        createBuilder6.copyOnWrite();
        awkr awkrVar2 = (awkr) createBuilder6.instance;
        aoobVar2.getClass();
        awkrVar2.c = 1 | awkrVar2.c;
        awkrVar2.d = aoobVar2;
        String str2 = awjoVar2.h;
        createBuilder6.copyOnWrite();
        awkr awkrVar3 = (awkr) createBuilder6.instance;
        str2.getClass();
        awkrVar3.c |= 16;
        awkrVar3.h = str2;
        int i2 = awjoVar2.c;
        if ((i2 & 8) != 0 && (i2 & 16) != 0) {
            awky awkyVar = awjoVar2.f;
            if (awkyVar == null) {
                awkyVar = awky.a;
            }
            createBuilder6.copyOnWrite();
            awkr awkrVar4 = (awkr) createBuilder6.instance;
            awkyVar.getClass();
            awkrVar4.f = awkyVar;
            awkrVar4.c |= 4;
            awjj awjjVar = awjoVar2.g;
            if (awjjVar == null) {
                awjjVar = awjj.a;
            }
            createBuilder6.copyOnWrite();
            awkr awkrVar5 = (awkr) createBuilder6.instance;
            awjjVar.getClass();
            awkrVar5.g = awjjVar;
            awkrVar5.c |= 8;
        }
        aopc e2 = e(atrcVar2);
        e2.e(awkr.b, (awkr) createBuilder6.mo39build());
        atrc atrcVar4 = (atrc) e2.mo39build();
        createBuilder5.copyOnWrite();
        atrf atrfVar14 = (atrf) createBuilder5.instance;
        atrcVar4.getClass();
        atrfVar14.e = atrcVar4;
        atrfVar14.b |= 4;
        createBuilder5.aE(atrfVar11);
        f4.h((atrf) createBuilder5.mo39build());
        agrt a4 = agru.a();
        a4.a = 2;
        a4.b(f4.g());
        return anlz.q(a4.a());
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        amuk g;
        int aq = akel.aq(((atrf) amukVar.get(0)).c);
        if (aq == 0 || aq != 4) {
            int aq2 = akel.aq(((atrf) amukVar.get(0)).c);
            String str = (aq2 == 0 || aq2 == 1) ? "OFFLINE_ORCHESTRATION_ACTION_TYPE_UNKNOWN" : aq2 != 2 ? aq2 != 3 ? aq2 != 4 ? "OFFLINE_ORCHESTRATION_ACTION_TYPE_UPDATE" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_REFRESH" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_DELETE" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_ADD";
            throw new UnsupportedOperationException(str.length() != 0 ? "Cannot handle batched type: ".concat(str) : new String("Cannot handle batched type: "));
        }
        agvx a2 = this.c.a();
        if (!afvmVar.d().equals(a2.q())) {
            g = d(((amxx) amukVar).c);
        } else {
            amxx amxxVar = (amxx) amukVar;
            ArrayList arrayList = new ArrayList(amxxVar.c);
            int i = amxxVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(aakj.g(((atrf) amukVar.get(i2)).d));
            }
            arzh b = this.b.b(a2, amvn.p(arrayList));
            if (b == null) {
                g = d(amxxVar.c);
            } else {
                HashSet hashSet = new HashSet();
                for (arzn arznVar : b.d) {
                    for (arzo arzoVar : arznVar.c) {
                        hashSet.add(arzoVar.d);
                    }
                }
                amuf f = amuk.f();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f.h(hashSet.contains((String) arrayList.get(i3)) ? agru.a : agru.b);
                }
                g = f.g();
            }
        }
        return anlz.q(g);
    }
}
