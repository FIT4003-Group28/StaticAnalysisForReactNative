package defpackage;
/* compiled from: PG */
/* renamed from: bypi  reason: default package */
/* loaded from: classes4.dex */
final class bypi implements btzi<djvw, djwa> {
    final /* synthetic */ deig a;
    final /* synthetic */ bypk b;

    public bypi(bypk bypkVar, deig deigVar) {
        this.b = bypkVar;
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djvw> btzrVar, btzy btzyVar) {
        dcqe dcqeVar = bypk.a;
        bttq bttqVar = btzyVar.p;
        cjsx i = cjsy.i();
        i.b(ddda.fB);
        this.b.g.a().k(i.a());
        this.a.j(byqf.ERROR_NO_RETRY);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djvw> btzrVar, djwa djwaVar) {
        byqf byqfVar;
        djwa djwaVar2 = djwaVar;
        deig deigVar = this.a;
        bypk bypkVar = this.b;
        int a = djvz.a(djwaVar2.b);
        if (a != 0 && a == 2) {
            cjsx i = cjsy.i();
            i.b(ddda.fC);
            bypkVar.g.a().k(i.a());
            if ((djwaVar2.a & 4) != 0) {
                bypkVar.h.a();
                if (djwaVar2.c == null) {
                    djvt djvtVar = djvt.b;
                }
            }
            byqfVar = byqf.SUCCESS;
        } else {
            int i2 = djwaVar2.b;
            cjsx i3 = cjsy.i();
            i3.b(ddda.fB);
            bypkVar.g.a().k(i3.a());
            byqfVar = byqf.ERROR_NO_RETRY;
        }
        deigVar.j(byqfVar);
    }
}
