package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
/* compiled from: PG */
/* renamed from: xim  reason: default package */
/* loaded from: classes4.dex */
public final class xim implements aimx {
    private final MediaAd a;

    public xim(MediaAd mediaAd) {
        this.a = mediaAd;
        zgh.m(mediaAd.f);
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        int i = 1;
        ainaVar.w = true;
        ainaVar.W = 3;
        aalh aalhVar = ((RemoteVideoAd) this.a).p;
        int S = akel.S(Integer.parseInt(aalhVar != null ? aalhVar.g : aalh.UNKNOWN.g));
        if (S == 0) {
            S = 1;
        }
        ainaVar.V = S;
        MediaAd mediaAd = this.a;
        ainaVar.c = mediaAd.h;
        if (true == ((RemoteVideoAd) mediaAd).a) {
            i = 2;
        }
        ainaVar.X = i;
        ainaVar.L = mediaAd.f;
    }
}
