package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ezk  reason: default package */
/* loaded from: classes6.dex */
final class ezk<T> implements dzsj<T> {
    final /* synthetic */ ezl a;
    private final int b;

    public ezk(ezl ezlVar, int i) {
        this.a = ezlVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            ezl ezlVar = this.a;
            ftt fttVar = ezlVar.b;
            return (T) apnz.b(fttVar.eV, fttVar.eW.il(), dxjh.c(ezlVar.b.ld()), dxjh.c(ezlVar.b.eW.p()), dxjh.c(ezlVar.b.li()), ezlVar.b.pw());
        } else if (i == 1) {
            ezl ezlVar2 = this.a;
            return (T) new bgyb(ezlVar2.b.wk(), ezlVar2.b.wl());
        } else if (i == 2) {
            ezl ezlVar3 = this.a;
            return (T) new bepv(ezlVar3.b.eW.fr(), ezlVar3.b.eW.il(), dxjh.c(ezlVar3.b.ti()), ezlVar3.b.eW.R());
        } else if (i != 3) {
            ezl ezlVar4 = this.a;
            Application a = ezlVar4.b.eW.a.a();
            dxjg.e(a);
            cqat rR = ezlVar4.b.eW.a.rR();
            dxjg.e(rR);
            return (T) new benm(a, rR);
        } else {
            ezl ezlVar5 = this.a;
            dzsj dzsjVar = ezlVar5.a;
            if (dzsjVar == null) {
                dzsjVar = new ezk(ezlVar5, 4);
                ezlVar5.a = dzsjVar;
            }
            return (T) new beni(dzsjVar);
        }
    }
}
