package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: wxr  reason: default package */
/* loaded from: classes4.dex */
public class wxr extends ymg {
    private final wxq a;
    private final xdb b;
    private final wzu d;
    private final PlayerResponseModel e;
    private final wzr f;
    private final PlayerAd g;
    private final String h;

    public wxr(wxq wxqVar, xdb xdbVar, wzu wzuVar, PlayerResponseModel playerResponseModel, PlayerAd playerAd, String str, wzr wzrVar) {
        wxqVar.getClass();
        this.a = wxqVar;
        this.b = xdbVar;
        this.d = wzuVar;
        this.e = playerResponseModel;
        this.g = playerAd;
        this.h = str;
        this.f = wzrVar;
    }

    public wxq a() {
        return this.a;
    }

    public xdb b() {
        return this.b;
    }

    public PlayerAd c() {
        return this.g;
    }

    public String d() {
        PlayerAd playerAd = this.g;
        if (playerAd == null) {
            return null;
        }
        return playerAd.l;
    }

    public String e() {
        return this.h;
    }
}
