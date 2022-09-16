package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amgl  reason: default package */
/* loaded from: classes.dex */
final class amgl implements ankb {
    final /* synthetic */ amgk a;

    public amgl(amgk amgkVar) {
        this.a = amgkVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        amvn n;
        amgk amgkVar = this.a;
        synchronized (amgkVar.a) {
            amvd amvdVar = new amvd(4);
            amvg amvgVar = (amvg) amgkVar.b.get("com.google.apps.tiktok.account.data.AllAccounts");
            if (amvgVar != null) {
                amxq amxqVar = amvdVar.a;
                amxqVar.getClass();
                amxq amxqVar2 = amvgVar instanceof amyf ? ((amyf) amvgVar).b : null;
                if (amxqVar2 != null) {
                    amxqVar.h(Math.max(amxqVar.c, amxqVar2.c));
                    for (int a = amxqVar2.a(); a >= 0; a = amxqVar2.e(a)) {
                        amvdVar.b(amxqVar2.g(a), amxqVar2.c(a));
                    }
                } else {
                    Set j = amvgVar.j();
                    amxq amxqVar3 = amvdVar.a;
                    amxqVar3.h(Math.max(amxqVar3.c, j.size()));
                    for (amxk amxkVar : amvgVar.j()) {
                        amvdVar.b(amxkVar.a, amxkVar.a());
                    }
                }
            }
            n = amvdVar.a().n();
        }
        amzs it = ((amvt) n).iterator();
        while (it.hasNext()) {
            amgm amgmVar = (amgm) it.next();
            if (amgmVar != null) {
                amgmVar.a();
            }
        }
    }
}
