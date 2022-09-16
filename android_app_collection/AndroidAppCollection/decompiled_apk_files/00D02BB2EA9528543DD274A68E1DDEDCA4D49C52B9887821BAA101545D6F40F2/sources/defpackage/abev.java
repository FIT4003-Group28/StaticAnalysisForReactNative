package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: abev  reason: default package */
/* loaded from: classes2.dex */
final class abev implements degu<awwb> {
    final /* synthetic */ abew a;

    public abev(abew abewVar) {
        this.a = abewVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        abew abewVar = this.a;
        if (!abewVar.aD) {
            return;
        }
        abewVar.ag.h(null);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(awwb awwbVar) {
        awwb awwbVar2 = awwbVar;
        if (!this.a.aD) {
            return;
        }
        dvho dvhoVar = (dvho) awwbVar2.a(awvv.c).f();
        if (dvhoVar == null || dvhoVar.d.size() <= 0) {
            this.a.ag.h(null);
            return;
        }
        int size = dvhoVar.d.size();
        dsrj<dqfq> dsrjVar = dvhoVar.d;
        List<dqfq> list = dsrjVar;
        if (size > 1) {
            list = dsrjVar.subList(1, dsrjVar.size());
        }
        abew abewVar = this.a;
        absk abskVar = abewVar.ah;
        dsqp dsqpVar = (dsqp) abskVar.cu(5);
        dsqpVar.bC(abskVar);
        absj absjVar = (absj) dsqpVar;
        if (absjVar.c) {
            absjVar.bF();
            absjVar.c = false;
        }
        absk abskVar2 = absk.d;
        ((absk) absjVar.b).b = absk.ck();
        if (absjVar.c) {
            absjVar.bF();
            absjVar.c = false;
        }
        absk abskVar3 = (absk) absjVar.b;
        dsrj<dqfq> dsrjVar2 = abskVar3.b;
        if (!dsrjVar2.a()) {
            abskVar3.b = dsqw.cl(dsrjVar2);
        }
        dsod.bv(list, abskVar3.b);
        abewVar.ah = absjVar.bK();
        this.a.g();
    }
}
