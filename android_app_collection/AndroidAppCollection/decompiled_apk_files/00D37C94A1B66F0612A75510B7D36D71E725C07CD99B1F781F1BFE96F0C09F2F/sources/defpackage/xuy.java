package defpackage;

import android.content.Intent;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xuy  reason: default package */
/* loaded from: classes4.dex */
public final class xuy implements yiu {
    final /* synthetic */ xuz a;

    public xuy(xuz xuzVar) {
        this.a = xuzVar;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        if (i == 1800 && i2 == -1) {
            String[] stringArrayExtra = intent.getStringArrayExtra("frontend_ids");
            if (stringArrayExtra != null && stringArrayExtra.length > 0) {
                this.a.aM = stringArrayExtra[0];
            } else {
                this.a.aM = null;
            }
            this.a.aL();
            xuz xuzVar = this.a;
            final xya xyaVar = new xya(xuzVar.aM, xuzVar.ai, xuzVar.at, xuzVar.aj);
            xux xuxVar = new xux(this, xyaVar);
            if (this.a.aM == null) {
                return;
            }
            xyaVar.i = xuxVar;
            xyaVar.d.d(xyaVar.f);
            xyaVar.h = true;
            xyaVar.g = xyaVar.d.b(xyaVar.e.c());
            ylx.k(xyaVar.g, xyaVar.c, ngc.k, new ylw() { // from class: xxy
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    xya xyaVar2 = xya.this;
                    List<alcw> list = (List) obj;
                    if (!xyaVar2.h || xyaVar2.b != null) {
                        return;
                    }
                    for (alcw alcwVar : list) {
                        if (alcwVar.k.equals(xyaVar2.a)) {
                            xyaVar2.b = alcwVar.W;
                            if (!xyaVar2.b.isEmpty()) {
                                xyaVar2.i.a(xyaVar2.b);
                                return;
                            }
                        }
                    }
                }
            });
        }
    }
}
