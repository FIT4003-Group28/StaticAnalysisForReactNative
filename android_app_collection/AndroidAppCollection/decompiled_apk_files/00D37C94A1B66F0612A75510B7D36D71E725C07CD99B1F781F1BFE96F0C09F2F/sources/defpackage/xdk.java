package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xdk  reason: default package */
/* loaded from: classes4.dex */
public abstract class xdk extends aftn {
    private final PlayerAd a;

    /* JADX INFO: Access modifiers changed from: protected */
    public xdk(PlayerAd playerAd) {
        this.a = playerAd;
    }

    protected abstract String c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aftn
    public void d(JSONObject jSONObject) {
        PlayerAd playerAd = this.a;
        int i = PlayerAd.o;
        m(jSONObject, "originalVideoId", playerAd.f);
        jSONObject.put("requestTrackingParams", Base64.encodeToString(this.a.g, 0));
        m(jSONObject, "contentPlayerAdParams", this.a.h);
        m(jSONObject, "adBreakId", this.a.i);
        jSONObject.put("isForOffline", this.a.j);
        m(jSONObject, "adCpn", this.a.l);
        jSONObject.put("expirationTimeMillis", this.a.m);
        m(jSONObject, "adType", c());
    }
}
