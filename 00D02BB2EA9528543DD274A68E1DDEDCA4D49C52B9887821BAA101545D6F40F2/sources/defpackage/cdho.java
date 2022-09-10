package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdho  reason: default package */
/* loaded from: classes4.dex */
public final class cdho implements btzi<dwjd, dwjf> {
    final /* synthetic */ cdhp a;

    public cdho(cdhp cdhpVar) {
        this.a = cdhpVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjd> btzrVar, btzy btzyVar) {
        cdip cdipVar = this.a.ad;
        dbsk.s(cdipVar);
        cdipVar.l(null);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjd> btzrVar, dwjf dwjfVar) {
        dwjf dwjfVar2 = dwjfVar;
        dwjfVar2.b.size();
        ArrayList arrayList = new ArrayList();
        for (dwjb dwjbVar : dwjfVar2.b) {
            dbsg<cdhl> d = cdhl.d(dwjbVar);
            if (d.a()) {
                arrayList.add(d.b());
            }
        }
        cdip cdipVar = this.a.ad;
        dbsk.s(cdipVar);
        cdipVar.l(arrayList);
    }
}
