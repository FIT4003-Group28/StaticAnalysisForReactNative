package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axgl  reason: default package */
/* loaded from: classes3.dex */
final class axgl<T> implements dzaz<axgu> {
    final /* synthetic */ axhi a;

    public axgl(axhi axhiVar) {
        this.a = axhiVar;
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(axgu axguVar) {
        axgu axguVar2 = axguVar;
        if (!(axguVar2 instanceof axgt)) {
            if (!(axguVar2 instanceof axgs)) {
                return;
            }
            axgs axgsVar = (axgs) axguVar2;
            this.a.k(axgsVar.b, axgsVar.a);
            return;
        }
        axhi axhiVar = this.a;
        axgt axgtVar = (axgt) axguVar2;
        dqac dqacVar = axgtVar.a.a;
        if (dqacVar == null) {
            dqacVar = dqac.d;
        }
        dqac dqacVar2 = axgtVar.a.a;
        if (dqacVar2 == null) {
            dqacVar2 = dqac.d;
        }
        dsrj<dqau> dsrjVar = dqacVar2.b;
        dzvx.b(dsrjVar, "result.response.getPeopl…ollowInfo().getUserList()");
        ArrayList arrayList = new ArrayList(dzti.d(dsrjVar, 10));
        for (dqau dqauVar : dsrjVar) {
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            arrayList.add(dqknVar.d);
        }
        axhiVar.k(dqacVar, arrayList);
    }
}
