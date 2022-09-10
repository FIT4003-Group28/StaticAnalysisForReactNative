package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bepx  reason: default package */
/* loaded from: classes3.dex */
public final class bepx implements crzp<apsi<dbsg<List<dqob>>>> {
    final /* synthetic */ bepz a;

    public bepx(bepz bepzVar) {
        this.a = bepzVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<dbsg<List<dqob>>>> crzmVar) {
        apsi<dbsg<List<dqob>>> l = crzmVar.l();
        if (l != null) {
            int b = l.b();
            if (b == 0) {
                throw null;
            }
            if (b != 3 || !l.a().a()) {
                return;
            }
            for (dqob dqobVar : l.a().b()) {
                dqof dqofVar = dqobVar.a;
                if (dqofVar == null) {
                    dqofVar = dqof.c;
                }
                int a = dqoe.a(dqofVar.b);
                if (a != 0 && a == 2) {
                    this.a.b.a().e(dvum.MERCHANT_CALLS_MAIN_PAGE, null, bepw.a, beno.c(dqobVar, this.a.j));
                }
            }
        }
    }
}
