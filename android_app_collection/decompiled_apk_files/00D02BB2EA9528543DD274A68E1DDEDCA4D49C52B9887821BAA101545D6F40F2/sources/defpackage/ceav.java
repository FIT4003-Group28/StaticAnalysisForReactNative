package defpackage;
/* compiled from: PG */
/* renamed from: ceav  reason: default package */
/* loaded from: classes4.dex */
public final class ceav implements btzi<dkck, dkcm> {
    final /* synthetic */ ceaw a;
    final /* synthetic */ dzve b;

    public ceav(ceaw ceawVar, dzve dzveVar) {
        this.a = ceawVar;
        this.b = dzveVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkck> btzrVar, btzy btzyVar) {
        dzvx.c(btzyVar, "failure");
        this.a.d();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkck> btzrVar, dkcm dkcmVar) {
        dkcm dkcmVar2 = dkcmVar;
        dzvx.c(dkcmVar2, "response");
        ceaw ceawVar = this.a;
        dmbc dmbcVar = dkcmVar2.a;
        if (dmbcVar == null) {
            dmbcVar = dmbc.h;
        }
        dsqp dsqpVar = (dsqp) dmbcVar.cu(5);
        dsqpVar.bC(dmbcVar);
        dmbb dmbbVar = (dmbb) dsqpVar;
        dmbg dmbgVar = this.a.b.d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        if (dmbbVar.c) {
            dmbbVar.bF();
            dmbbVar.c = false;
        }
        dmbc dmbcVar2 = (dmbc) dmbbVar.b;
        dmbgVar.getClass();
        dmbcVar2.d = dmbgVar;
        dmbcVar2.a |= 4;
        dmbc bK = dmbbVar.bK();
        dzvx.b(bK, "response.post.toBuilder(…raftPost.content).build()");
        ceawVar.b(bK);
        this.a.f(3);
        this.b.a(dkcmVar2);
    }
}
