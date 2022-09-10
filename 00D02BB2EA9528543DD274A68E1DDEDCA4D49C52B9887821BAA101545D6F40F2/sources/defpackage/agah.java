package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agah  reason: default package */
/* loaded from: classes2.dex */
public final class agah implements btzi<dirb, dird> {
    final /* synthetic */ deig a;
    final /* synthetic */ dirb b;
    final /* synthetic */ agal c;

    public agah(agal agalVar, deig deigVar, dirb dirbVar) {
        this.c = agalVar;
        this.a = deigVar;
        this.b = dirbVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dirb> btzrVar, btzy btzyVar) {
        int i = agal.i;
        this.a.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dirb> btzrVar, dird dirdVar) {
        dird dirdVar2 = dirdVar;
        int i = agal.i;
        if (this.c.h.e()) {
            axjh axjhVar = this.c.h;
            dlau dlauVar = dirdVar2.i;
            if (dlauVar == null) {
                dlauVar = dlau.e;
            }
            axjhVar.s(dlauVar.c);
            dlau dlauVar2 = dirdVar2.i;
            if (dlauVar2 == null) {
                dlauVar2 = dlau.e;
            }
            if ((dlauVar2.a & 2) != 0) {
                axjh axjhVar2 = this.c.h;
                dlau dlauVar3 = dirdVar2.i;
                if (dlauVar3 == null) {
                    dlauVar3 = dlau.e;
                }
                dqas dqasVar = dlauVar3.d;
                if (dqasVar == null) {
                    dqasVar = dqas.c;
                }
                axjhVar2.E(dqasVar);
            }
            if ((dirdVar2.a & 32) != 0 && this.c.h.j()) {
                axjh axjhVar3 = this.c.h;
                dqac dqacVar = dirdVar2.h;
                if (dqacVar == null) {
                    dqacVar = dqac.d;
                }
                axjhVar3.B(dqacVar);
            }
        }
        this.a.j(new afzw(dirdVar2, btzrVar, TimeUnit.MILLISECONDS.toSeconds(btzrVar.e.c) + this.c.b.getLocalStreamParameters().j()));
        int a = dpwh.a(this.b.k);
        if ((a == 0 || a == 2) && btlu.i(btzrVar.c) == btlt.GOOGLE) {
            if (this.c.d.f()) {
                agbr agbrVar = this.c.f;
                btlu btluVar = btzrVar.c;
                dbsk.s(btluVar);
                agbrVar.k(btluVar, dirdVar2.j);
                return;
            }
            agbr agbrVar2 = this.c.f;
            btlu btluVar2 = btzrVar.c;
            dbsk.s(btluVar2);
            if (agbrVar2.i(btluVar2, dirdVar2.g)) {
                agbrVar2.l();
            }
            long j = 0;
            for (dlcv dlcvVar : dirdVar2.d) {
                if (dlcu.a(dlcvVar.b) == 6) {
                    long j2 = dlcvVar.e;
                    if (j < j2) {
                        j = j2;
                    }
                }
            }
            if (j == 0) {
                return;
            }
            agbr agbrVar3 = this.c.f;
            btlu btluVar3 = btzrVar.c;
            dbsk.s(btluVar3);
            agbrVar3.j(btluVar3, j);
        }
    }
}
