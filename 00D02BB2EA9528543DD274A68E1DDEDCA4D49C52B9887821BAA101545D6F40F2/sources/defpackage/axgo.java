package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axgo  reason: default package */
/* loaded from: classes3.dex */
public final class axgo<T> implements dzaz<axhd> {
    final /* synthetic */ axhi a;

    public axgo(axhi axhiVar) {
        this.a = axhiVar;
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(axhd axhdVar) {
        dqas dqasVar;
        crzo<axoj> crzoVar;
        axoj l;
        axhd axhdVar2 = axhdVar;
        if (axhdVar2 instanceof axgw) {
            this.a.c.SQ();
            axhi axhiVar = this.a;
            for (crzo<axoj> crzoVar2 : axhiVar.g.values()) {
                axoj l2 = crzoVar2.a.l();
                if (l2 != null) {
                    l2.a = false;
                    l2.a(axhi.n());
                    crzoVar2.a(l2);
                }
            }
            axhiVar.g.clear();
            synchronized (axhiVar.d) {
                axhiVar.d.clear();
            }
            axgk axgkVar = axhiVar.b;
            axgkVar.a.e();
            axgkVar.b.clear();
        } else if (axhdVar2 instanceof axgx) {
            axgx axgxVar = (axgx) axhdVar2;
            this.a.e(axgxVar.a, axgxVar.b);
        } else if (axhdVar2 instanceof axgz) {
            this.a.f(((axgz) axhdVar2).a);
        } else if (axhdVar2 instanceof axgy) {
            axhi axhiVar2 = this.a;
            axgy axgyVar = (axgy) axhdVar2;
            String str = axgyVar.a;
            boolean z = axgyVar.b;
            dzvx.c(str, "obfuscatedGaiaId");
            axhiVar2.l("Cannot update data in FollowStateRepository when in terminal state");
            if (axhiVar2.a() || (crzoVar = axhiVar2.g.get(str)) == null || (l = crzoVar.a.l()) == null) {
                return;
            }
            l.a = z;
            crzoVar.a(l);
        } else if (axhdVar2 instanceof axhb) {
            axhi axhiVar3 = this.a;
            dqac dqacVar = ((axhb) axhdVar2).a;
            dzvx.c(dqacVar, "peopleFollowInfo");
            axhiVar3.l("Cannot update data in FollowStateRepository when in terminal state");
            if (axhiVar3.a()) {
                return;
            }
            if (axhiVar3.b() || axhiVar3.i == null) {
                axhiVar3.f(dqacVar);
                return;
            }
            dsrj<dqau> dsrjVar = dqacVar.b;
            dzvx.b(dsrjVar, "peopleFollowInfo.getUserList()");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (dqau dqauVar : dsrjVar) {
                dqau dqauVar2 = dqauVar;
                dzvx.b(dqauVar2, "it");
                if ((dqauVar2.a & 2) != 0) {
                    arrayList.add(dqauVar);
                } else {
                    arrayList2.add(dqauVar);
                }
            }
            dzsx dzsxVar = new dzsx(arrayList, arrayList2);
            List<dqau> list = (List) dzsxVar.a;
            List<dqau> list2 = (List) dzsxVar.b;
            ArrayList arrayList3 = new ArrayList(dzti.d(list, 10));
            for (dqau dqauVar3 : list) {
                dqkn dqknVar = dqauVar3.b;
                if (dqknVar == null) {
                    dqknVar = dqkn.e;
                }
                arrayList3.add(dqknVar.d);
            }
            axhiVar3.d(arrayList3, new axhh(axhiVar3, dqacVar));
            for (dqau dqauVar4 : list2) {
                axgk axgkVar2 = axhiVar3.b;
                dqkn dqknVar2 = dqauVar4.b;
                if (dqknVar2 == null) {
                    dqknVar2 = dqkn.e;
                }
                String str2 = dqknVar2.d;
                dzvx.b(str2, "it.getUser().getObfuscatedGaiaId()");
                axgkVar2.b(str2);
            }
        } else if (axhdVar2 instanceof axhc) {
            axhi axhiVar4 = this.a;
            List<String> list3 = ((axhc) axhdVar2).a;
            dzvx.c(list3, "userObfuscatedGaiaIds");
            axhiVar4.l("Cannot update data in FollowStateRepository when in terminal state");
            if (axhiVar4.a()) {
                return;
            }
            if (axhiVar4.i == null) {
                for (String str3 : list3) {
                    dqav bZ = dqaw.d.bZ();
                    dfqe dfqeVar = dfqe.NOT_FOLLOWING;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqaw dqawVar = (dqaw) bZ.b;
                    dqawVar.b = dfqeVar.f;
                    dqawVar.a |= 1;
                    dqaw.b(dqawVar);
                    dqaw bK = bZ.bK();
                    dzvx.b(bK, "PeopleFolloweeInfo.newBu…TIMESTAMP)\n      .build()");
                    axhiVar4.e(str3, bK);
                }
            }
            axhiVar4.d(list3, new axhg(axhiVar4, list3));
        } else if (axhdVar2 instanceof axha) {
            this.a.g(((axha) axhdVar2).a);
        } else if (axhdVar2 instanceof axgv) {
            axhi axhiVar5 = this.a;
            axhiVar5.l("Cannot update data in FollowStateRepository when in terminal state");
            if (axhiVar5.a() || (dqasVar = axhiVar5.f) == null) {
                return;
            }
            dsqp dsqpVar = (dsqp) dqasVar.cu(5);
            dsqpVar.bC(dqasVar);
            dqap dqapVar = (dqap) dsqpVar;
            if (dqapVar.c) {
                dqapVar.bF();
                dqapVar.c = false;
            }
            dqas dqasVar2 = (dqas) dqapVar.b;
            dqasVar2.b = null;
            dqasVar2.a &= -3;
            axhiVar5.f = dqapVar.bK();
        }
    }
}
