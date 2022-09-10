package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeum  reason: default package */
/* loaded from: classes2.dex */
public final class aeum implements btzi<dwhf, dwhj> {
    final /* synthetic */ deig a;

    public aeum(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwhf> btzrVar, btzy btzyVar) {
        if (!this.a.isCancelled()) {
            this.a.cancel(false);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwhf> btzrVar, dwhj dwhjVar) {
        String str;
        String str2;
        dwhj dwhjVar2 = dwhjVar;
        deig deigVar = this.a;
        dvyw dvywVar = dwhjVar2.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        dvxz dvxzVar = dvywVar.s;
        if (dvxzVar == null) {
            dvxzVar = dvxz.h;
        }
        if ((dvxzVar.a & 4) != 0) {
            dvyw dvywVar2 = dwhjVar2.d;
            if (dvywVar2 == null) {
                dvywVar2 = dvyw.bv;
            }
            dvxz dvxzVar2 = dvywVar2.s;
            if (dvxzVar2 == null) {
                dvxzVar2 = dvxz.h;
            }
            str = dvxzVar2.d;
            dvyw dvywVar3 = dwhjVar2.d;
            if (dvywVar3 == null) {
                dvywVar3 = dvyw.bv;
            }
            dvxz dvxzVar3 = dvywVar3.s;
            if (dvxzVar3 == null) {
                dvxzVar3 = dvxz.h;
            }
            str2 = dvxzVar3.c;
        } else {
            dvyw dvywVar4 = dwhjVar2.d;
            if (dvywVar4 == null) {
                dvywVar4 = dvyw.bv;
            }
            str = dvywVar4.i;
            dpjx dpjxVar = dwhjVar2.c;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            str2 = dpjxVar.b;
        }
        deigVar.j(aeuk.d(str, str2, aeun.a(dwhjVar2)));
    }
}
