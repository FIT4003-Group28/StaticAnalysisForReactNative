package defpackage;
/* compiled from: PG */
/* renamed from: agwi  reason: default package */
/* loaded from: classes2.dex */
final class agwi implements btzi<dirf, dirj> {
    final /* synthetic */ btlu a;
    final /* synthetic */ deig b;
    final /* synthetic */ dbsi c;
    final /* synthetic */ agwm d;

    public agwi(agwm agwmVar, btlu btluVar, deig deigVar, dbsi dbsiVar) {
        this.d = agwmVar;
        this.a = btluVar;
        this.b = deigVar;
        this.c = dbsiVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dirf> btzrVar, btzy btzyVar) {
        int i = agwm.d;
        this.b.k(new btzz(btzyVar));
        c(this.c);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dirf> btzrVar, dirj dirjVar) {
        dirj dirjVar2 = dirjVar;
        int i = agwm.d;
        if ((dirjVar2.a & 8) != 0) {
            agwm agwmVar = this.d;
            btlu btluVar = this.a;
            dnwb dnwbVar = dirjVar2.d;
            if (dnwbVar == null) {
                dnwbVar = dnwb.i;
            }
            if (btluVar.equals(agwmVar.a.a().j())) {
                agwmVar.b.b(dnwb.i, dnwbVar);
            }
        }
        this.b.j(dirjVar2);
        c(this.c);
    }

    final void c(dbsi<btlu, dirf> dbsiVar) {
        synchronized (this.d) {
            this.d.c.remove(dbsiVar);
        }
    }
}
