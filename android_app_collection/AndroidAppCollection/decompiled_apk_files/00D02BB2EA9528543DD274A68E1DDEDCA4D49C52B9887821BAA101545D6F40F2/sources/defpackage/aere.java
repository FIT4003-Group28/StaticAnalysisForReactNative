package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aere  reason: default package */
/* loaded from: classes2.dex */
final class aere implements btzi<dwjd, dwjf> {
    final /* synthetic */ aerf a;

    public aere(aerf aerfVar) {
        this.a = aerfVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjd> btzrVar, btzy btzyVar) {
        aerf aerfVar = this.a;
        if (aerfVar.af != 3) {
            return;
        }
        aerfVar.q(aeui.d);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjd> btzrVar, dwjf dwjfVar) {
        dwjf dwjfVar2 = dwjfVar;
        if (this.a.af != 3) {
            return;
        }
        dwjfVar2.b.size();
        ArrayList arrayList = new ArrayList();
        for (dwjb dwjbVar : dwjfVar2.b) {
            if ((dwjbVar.a & 1) != 0) {
                ily ilyVar = new ily();
                dvyw dvywVar = dwjbVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                ilyVar.E(dvywVar);
                arrayList.add(aeuf.i(ilyVar.d(), dtaq.m));
            }
        }
        this.a.q(new aeui(aeuh.NO_CONFIDENCE, arrayList, null));
    }
}
