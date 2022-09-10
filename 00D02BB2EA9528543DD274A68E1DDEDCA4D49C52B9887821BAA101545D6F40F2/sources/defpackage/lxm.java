package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxm  reason: default package */
/* loaded from: classes7.dex */
public final class lxm implements ksx {
    final /* synthetic */ dcdc a;
    final /* synthetic */ amte b;
    final /* synthetic */ lxp c;

    public lxm(lxp lxpVar, dcdc dcdcVar, amte amteVar) {
        this.c = lxpVar;
        this.a = dcdcVar;
        this.b = amteVar;
    }

    @Override // defpackage.ksx
    public final void a(GmmLocation gmmLocation) {
        this.c.m(6);
        lxp lxpVar = this.c;
        if (lxpVar.n) {
            lxpVar.l(18);
            return;
        }
        ksr ksrVar = lxpVar.k;
        ldm ldmVar = (ldm) this.a.get(0);
        lxp lxpVar2 = this.c;
        amte amteVar = this.b;
        dbsk.s(gmmLocation);
        if (amteVar.c(amteVar.a.o()) == dqvj.DRIVE && vyz.a(amteVar, gmmLocation, lxpVar2.h.a().getNavigationParameters().s().a, lxpVar2.b)) {
            ksrVar.f(ldmVar, gmmLocation, this.b);
            if (ldmVar.u() == 2) {
                this.c.f(ddda.dp);
                this.c.a.d(this.a, this.b.a.o(), null, lyy.c(new lzc(lzb.NAV_RESTORE)).a());
                this.c.j();
                this.c.g();
                this.c.l(13);
                this.c.f.Z(bvjk.ee, this.c.d.b());
                return;
            }
        }
        this.c.m(7);
        lxp lxpVar3 = this.c;
        if (lxpVar3.m) {
            lxp.i("Directions Helper already started");
        } else {
            lxpVar3.k.a();
            lxpVar3.m = true;
        }
        ksrVar.d(this.a, new lxl(this), null);
    }
}
