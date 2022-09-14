package defpackage;
/* compiled from: PG */
/* renamed from: crkt  reason: default package */
/* loaded from: classes5.dex */
final class crkt implements btzi<dwaw, crke> {
    final /* synthetic */ crkv a;

    public crkt(crkv crkvVar) {
        this.a = crkvVar;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwaw> btzrVar, crke crkeVar) {
        this.a.c(crkeVar, null);
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwaw> btzrVar, btzy btzyVar) {
        bttq bttqVar = btzyVar.p;
        vmd vmdVar = this.a.h;
        if (vmdVar == null || bttqVar.s || vmdVar.e() >= 2) {
            this.a.c(null, btzyVar.p);
            return;
        }
        crkv crkvVar = this.a;
        if (bttqVar != bttq.INVALID_GAIA_AUTH_TOKEN && bttqVar != bttq.SINGLE_REQUEST_ERROR && bttqVar != bttq.SINGLE_REQUEST_FATAL_ERROR) {
            crkvVar.d.b(new crma());
        }
        dbsk.s(this.a.h);
        crkv crkvVar2 = this.a;
        vmd vmdVar2 = crkvVar2.h;
        vmc g = vmdVar2.g();
        g.b(vmdVar2.e() + 1);
        crkvVar2.a(g.a());
        dbsk.s(this.a.h);
        crkv crkvVar3 = this.a;
        crkvVar3.g = crkvVar3.c.a(crkvVar3.h);
    }
}
