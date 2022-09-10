package defpackage;
/* compiled from: PG */
/* renamed from: ceau  reason: default package */
/* loaded from: classes4.dex */
public final class ceau implements btzi<dhsg, dhsi> {
    final /* synthetic */ ceaw a;
    final /* synthetic */ dzve b;

    public ceau(ceaw ceawVar, dzve dzveVar) {
        this.a = ceawVar;
        this.b = dzveVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhsg> btzrVar, btzy btzyVar) {
        dzvx.c(btzyVar, "failure");
        this.a.d();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhsg> btzrVar, dhsi dhsiVar) {
        dhsi dhsiVar2 = dhsiVar;
        dzvx.c(dhsiVar2, "response");
        if ((dhsiVar2.a & 2) != 0) {
            ceaw ceawVar = this.a;
            djgl djglVar = dhsiVar2.d;
            if (djglVar == null) {
                djglVar = djgl.g;
            }
            ceawVar.f = djglVar;
        }
        ceaw ceawVar2 = this.a;
        dmbc dmbcVar = dhsiVar2.b;
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
        ceawVar2.b(bK);
        this.a.f(1);
        this.b.a(dhsiVar2);
    }
}
