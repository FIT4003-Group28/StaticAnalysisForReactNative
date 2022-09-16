package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xiy  reason: default package */
/* loaded from: classes4.dex */
public final class xiy implements xis {
    private final aiji a;
    private final aijh b;
    private final wjy c;
    private final afzo d;
    private final wzx e;
    private final aafo f;
    private final wzb g;

    public xiy(aiji aijiVar, aijh aijhVar, wjy wjyVar, wzb wzbVar, afzo afzoVar, wzx wzxVar, aafo aafoVar) {
        this.a = aijiVar;
        this.b = aijhVar;
        this.g = wzbVar;
        this.c = wjyVar;
        this.d = afzoVar;
        this.e = wzxVar;
        this.f = aafoVar;
    }

    private final wka c(PlayerAd playerAd) {
        asop O = playerAd.k.O();
        if (!O.b) {
            return null;
        }
        tjq tjqVar = new tjq();
        boolean z = O.c;
        boolean z2 = O.d;
        boolean z3 = O.e;
        tjqVar.a = O.f;
        boolean z4 = O.g;
        tjqVar.b = O.h;
        tjqVar.c = O.i;
        return this.c.a(tjqVar);
    }

    @Override // defpackage.xis
    public final xiu a(xew xewVar, String str, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        wzd a = this.g.a();
        this.d.e(a);
        if (playerAd.i() != null) {
            a.e = TimeUnit.SECONDS.toMillis(playerAd.c());
        }
        return new xjb(this.e, xewVar, instreamAdBreak, playerAd, str, this.a.d(), this.b, c(playerAd), a, this.e.a, this.f);
    }

    @Override // defpackage.xis
    public final xiu b(xew xewVar, String str, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        return new xje(xewVar, instreamAdBreak, playerAd, str, this.a.d(), this.b, c(playerAd), this.g.a(), this.f);
    }
}
