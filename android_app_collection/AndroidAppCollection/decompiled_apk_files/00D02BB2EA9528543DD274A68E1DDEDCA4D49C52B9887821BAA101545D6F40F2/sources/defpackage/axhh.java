package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axhh  reason: default package */
/* loaded from: classes3.dex */
final class axhh extends dzvy implements dzut<dztc> {
    final /* synthetic */ axhi a;
    final /* synthetic */ dqac b;

    public axhh(axhi axhiVar, dqac dqacVar) {
        this.a = axhiVar;
        this.b = dqacVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ dztc a() {
        axhi axhiVar = this.a;
        dqac dqacVar = this.b;
        ckij j = axhiVar.j();
        dsrj<dqau> dsrjVar = dqacVar.b;
        dzvx.b(dsrjVar, "peopleFollowInfo.getUserList()");
        ArrayList arrayList = new ArrayList(dzti.d(dsrjVar, 10));
        for (dqau dqauVar : dsrjVar) {
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            arrayList.add(dqknVar.d);
        }
        axhiVar.i(arrayList, j, dqacVar);
        return dztc.a;
    }
}
