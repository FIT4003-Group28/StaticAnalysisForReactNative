package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aeql  reason: default package */
/* loaded from: classes2.dex */
final class aeql implements dbty<dbsg<aeqj>> {
    final /* synthetic */ aeqp a;

    public aeql(aeqp aeqpVar) {
        this.a = aeqpVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ dbsg<aeqj> a() {
        Object aeqmVar;
        aeqp aeqpVar = this.a;
        dnhi dnhiVar = aeqpVar.b.k;
        if (dnhiVar == null) {
            dnhiVar = dnhi.f;
        }
        int a = dnhh.a(dnhiVar.b);
        if (a == 0 || a != 2 || (dnhiVar.a & 4) == 0 || dnhiVar.c.isEmpty() || dnhiVar.c.equals(aeqpVar.b())) {
            aeqp aeqpVar2 = this.a;
            dnob dnobVar = aeqpVar2.b.j;
            if (dnobVar == null) {
                dnobVar = dnob.j;
            }
            int a2 = donw.a(dnobVar.b);
            if (a2 != 0 && a2 == 4) {
                dnob dnobVar2 = aeqpVar2.b.j;
                if (dnobVar2 == null) {
                    dnobVar2 = dnob.j;
                }
                if (dnobVar2.f > 0) {
                    aeqp aeqpVar3 = this.a;
                    Resources resources = aeqpVar3.a;
                    dnob dnobVar3 = aeqpVar3.b.j;
                    if (dnobVar3 == null) {
                        dnobVar3 = dnob.j;
                    }
                    aeqmVar = new aeqo(resources, dnobVar3, this.a.c);
                }
            }
            aeqp aeqpVar4 = this.a;
            dnhi dnhiVar2 = aeqpVar4.b.k;
            if (dnhiVar2 == null) {
                dnhiVar2 = dnhi.f;
            }
            int a3 = dnhh.a(dnhiVar2.b);
            if (a3 != 0 && a3 == 6) {
                dnhi dnhiVar3 = aeqpVar4.b.k;
                if (dnhiVar3 == null) {
                    dnhiVar3 = dnhi.f;
                }
                if ((dnhiVar3.a & 4) != 0) {
                    aeqp aeqpVar5 = this.a;
                    Resources resources2 = aeqpVar5.a;
                    dnhi dnhiVar4 = aeqpVar5.b.k;
                    if (dnhiVar4 == null) {
                        dnhiVar4 = dnhi.f;
                    }
                    aeqmVar = new aeqm(resources2, dnhiVar4, this.a.c);
                }
            }
            return dbpy.a;
        }
        aeqp aeqpVar6 = this.a;
        Resources resources3 = aeqpVar6.a;
        dnhi dnhiVar5 = aeqpVar6.b.k;
        if (dnhiVar5 == null) {
            dnhiVar5 = dnhi.f;
        }
        aeqmVar = new aeqn(resources3, dnhiVar5, this.a.c);
        return dbsg.i(aeqmVar);
    }
}
