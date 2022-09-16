package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: wxs  reason: default package */
/* loaded from: classes4.dex */
public final class wxs {
    private final yni a;
    private final PlayerAd b;
    private final xdb c;
    private final PlayerResponseModel d;
    private final wzu e;
    private final wzr f;

    public wxs(yni yniVar, PlayerAd playerAd, xdb xdbVar, PlayerResponseModel playerResponseModel, wzu wzuVar, wzr wzrVar) {
        yniVar.getClass();
        this.a = yniVar;
        this.b = playerAd;
        xdbVar.getClass();
        this.c = xdbVar;
        playerResponseModel.getClass();
        this.d = playerResponseModel;
        wzuVar.getClass();
        this.e = wzuVar;
        wzrVar.getClass();
        this.f = wzrVar;
    }

    private final void c(wxq wxqVar, String str) {
        this.a.d(new wxr(wxqVar, this.c, this.e, this.d, this.b, str, this.f));
    }

    public final void a() {
        c(wxq.AD_VIDEO_ENDED, null);
    }

    public final void b(aika aikaVar, String str) {
        aika aikaVar2 = aika.NEW;
        int ordinal = aikaVar.ordinal();
        if (ordinal == 4) {
            c(wxq.AD_VIDEO_PLAY_REQUESTED, str);
        } else if (ordinal != 5) {
        } else {
            c(wxq.AD_VIDEO_PLAYING, str);
        }
    }
}
