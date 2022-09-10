package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bdtz  reason: default package */
/* loaded from: classes3.dex */
final class bdtz implements btzi<dwjd, dwjf> {
    final /* synthetic */ bdua a;

    public bdtz(bdua bduaVar) {
        this.a = bduaVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjd> btzrVar, btzy btzyVar) {
        this.a.A(aeui.d);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjd> btzrVar, dwjf dwjfVar) {
        bdua bduaVar = this.a;
        aeui aeuiVar = aeui.b;
        ArrayList arrayList = new ArrayList();
        for (dwjb dwjbVar : dwjfVar.b) {
            if ((dwjbVar.a & 1) != 0) {
                ily ilyVar = new ily();
                dvyw dvywVar = dwjbVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                ilyVar.E(dvywVar);
                aeuf i = aeuf.i(ilyVar.d(), dtaq.m);
                if (i != null) {
                    arrayList.add(i);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            aeuiVar = new aeui(aeuh.HIGH_CONFIDENCE, arrayList, null);
        }
        bduaVar.A(aeuiVar);
    }
}
