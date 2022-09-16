package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dmk  reason: default package */
/* loaded from: classes6.dex */
public final class dmk implements btzi<dibs, dibu> {
    final /* synthetic */ dml a;

    public dmk(dml dmlVar) {
        this.a = dmlVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dibs> btzrVar, btzy btzyVar) {
        dzvx.c(btzyVar, "failure");
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dibs> btzrVar, dibu dibuVar) {
        dibu dibuVar2 = dibuVar;
        dzvx.c(dibuVar2, "response");
        dsrj<dvyw> dsrjVar = dibuVar2.a;
        dzvx.b(dsrjVar, "response.getResultList()");
        ArrayList<dvyw> arrayList = new ArrayList();
        for (dvyw dvywVar : dsrjVar) {
            dvyw dvywVar2 = dvywVar;
            dzvx.b(dvywVar2, "it");
            String str = dvywVar2.i;
            if (str != null && str.length() != 0) {
                arrayList.add(dvywVar);
            }
        }
        for (dvyw dvywVar3 : arrayList) {
            dmt dmtVar = this.a.d;
            ily ilyVar = new ily();
            ilyVar.E(dvywVar3);
            ilo d = ilyVar.d();
            dbsk.s(d.ai());
            dmr d2 = dmr.d(dmq.ORIENTATION_CUE, d.ai());
            dmx dmxVar = new dmx();
            dmxVar.a = d2;
            dmxVar.c(d);
            dmtVar.b(dmxVar.a());
        }
    }
}
