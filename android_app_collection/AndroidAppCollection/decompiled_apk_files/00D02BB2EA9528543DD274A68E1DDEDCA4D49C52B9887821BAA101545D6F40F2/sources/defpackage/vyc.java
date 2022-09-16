package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vyc  reason: default package */
/* loaded from: classes7.dex */
public final class vyc implements btzi<dwcw, dwcy> {
    final /* synthetic */ deig a;
    final /* synthetic */ vyd b;

    public vyc(vyd vydVar, deig deigVar) {
        this.b = vydVar;
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwcw> btzrVar, btzy btzyVar) {
        deig deigVar = this.a;
        String valueOf = String.valueOf(btzyVar.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("Error: ");
        sb.append(valueOf);
        deigVar.k(new Exception(sb.toString()));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwcw> btzrVar, dwcy dwcyVar) {
        dvwm dvwmVar;
        dwcy dwcyVar2 = dwcyVar;
        if ((dwcyVar2.a & 1) == 0) {
            this.a.k(new Exception("Missing nearby transit"));
            return;
        }
        this.b.b.k(dwcyVar2.c);
        deig deigVar = this.a;
        dvyw dvywVar = dwcyVar2.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        if ((dvywVar.a & 1073741824) != 0) {
            dvwm dvwmVar2 = dvywVar.P;
            if (dvwmVar2 == null) {
                dvwmVar2 = dvwm.b;
            }
            dvwj ca = dvwm.b.ca(dvwmVar2);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dvwm) ca.b).a = dvwm.ck();
            dvwk bZ = dvwl.d.bZ();
            dopk dopkVar = dvywVar.L;
            if (dopkVar == null) {
                dopkVar = dopk.x;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvwl dvwlVar = (dvwl) bZ.b;
            dopkVar.getClass();
            dvwlVar.c = dopkVar;
            dvwlVar.a |= 16;
            dvwc dvwcVar = vyd.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvwl dvwlVar2 = (dvwl) bZ.b;
            dvwcVar.getClass();
            dvwlVar2.b = dvwcVar;
            dvwlVar2.a |= 8;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dvwm dvwmVar3 = (dvwm) ca.b;
            dvwl bK = bZ.bK();
            bK.getClass();
            dvwmVar3.c();
            dvwmVar3.a.add(bK);
            dvwm dvwmVar4 = dvywVar.P;
            if (dvwmVar4 == null) {
                dvwmVar4 = dvwm.b;
            }
            dsrj<dvwl> dsrjVar = dvwmVar4.a;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dvwm dvwmVar5 = (dvwm) ca.b;
            dvwmVar5.c();
            dsod.bv(dsrjVar, dvwmVar5.a);
            dvwmVar = ca.bK();
        } else {
            dvwmVar = dvywVar.P;
            if (dvwmVar == null) {
                dvwmVar = dvwm.b;
            }
        }
        deigVar.j(dvwmVar);
    }
}
