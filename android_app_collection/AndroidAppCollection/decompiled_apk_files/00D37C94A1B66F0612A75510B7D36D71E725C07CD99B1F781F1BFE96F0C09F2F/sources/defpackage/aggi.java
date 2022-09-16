package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
/* compiled from: PG */
/* renamed from: aggi  reason: default package */
/* loaded from: classes.dex */
public final class aggi implements wld {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public aggi(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public aggi(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.wld
    public final void a(PlayerAd playerAd) {
        if (this.c != 0) {
            if (playerAd instanceof ForecastingAd) {
                return;
            }
            wwz wwzVar = (wwz) this.a.get();
            long c = ((snc) this.b.get()).c();
            wwzVar.h = anlz.q(Long.valueOf(c));
            ylx.m(wwzVar.c.b(new fcp(c, 7)), ngc.j);
        } else if (playerAd == null) {
        } else {
            agvx a = ((agrf) this.b.get()).a();
            if (playerAd.j) {
                a.g().g(playerAd.f, playerAd.i);
                if (!TextUtils.isEmpty(playerAd.n())) {
                    a.g().h(playerAd.n());
                }
            }
            ((aggi) this.a.get()).a(playerAd);
        }
    }
}
