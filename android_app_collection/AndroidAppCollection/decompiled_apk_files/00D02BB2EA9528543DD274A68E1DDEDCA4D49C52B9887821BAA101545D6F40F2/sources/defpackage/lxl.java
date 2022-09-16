package defpackage;
/* compiled from: PG */
/* renamed from: lxl  reason: default package */
/* loaded from: classes7.dex */
final class lxl implements ksu {
    final /* synthetic */ lxm a;

    public lxl(lxm lxmVar) {
        this.a = lxmVar;
    }

    @Override // defpackage.ksu
    public final void a(ldm ldmVar) {
        lxp lxpVar = this.a.c;
        if (lxpVar.n) {
            lxpVar.l(18);
            return;
        }
        lxpVar.m(8);
        lxm lxmVar = this.a;
        lxp lxpVar2 = lxmVar.c;
        dcdc<ldm> dcdcVar = lxmVar.a;
        amte amteVar = lxmVar.b;
        if (dcdcVar.get(0).u() != 2) {
            lxpVar2.f(ddda.f3do);
            lxpVar2.l(14);
        } else if (lxpVar2.a.e()) {
            lxpVar2.f(ddda.dn);
            lxpVar2.l(15);
        } else if (lxpVar2.b()) {
            lxpVar2.f(ddda.dn);
            lxpVar2.l(16);
        } else {
            lxpVar2.f(ddda.dp);
            lxpVar2.a.d(dcdcVar, Math.min(Math.max(amteVar.a.o(), 0), dcdcVar.get(0).m() - 1), null, lyy.c(new lzc(lzb.NAV_RESTORE)).a());
            lxpVar2.l(17);
            lxpVar2.f.Z(bvjk.ee, lxpVar2.d.b());
        }
        this.a.c.h();
        this.a.c.j();
        this.a.c.g();
    }
}
