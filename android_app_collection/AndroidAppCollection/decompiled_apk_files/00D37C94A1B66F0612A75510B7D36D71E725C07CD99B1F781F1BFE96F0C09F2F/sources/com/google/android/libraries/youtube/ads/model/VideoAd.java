package com.google.android.libraries.youtube.ads.model;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class VideoAd extends MediaAd {
    /* JADX INFO: Access modifiers changed from: protected */
    public VideoAd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, long j, VideoAdTrackingModel videoAdTrackingModel) {
        super(str, bArr, str2, str3, z, playerConfigModel, str4, j, videoAdTrackingModel);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apzg E() {
        asib k = k();
        if (k == null || (k.b & 4) == 0) {
            return null;
        }
        aunb aunbVar = k.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        if ((apojVar.b & 16384) == 0) {
            return null;
        }
        apzg apzgVar = apojVar.o;
        return apzgVar == null ? apzg.a : apzgVar;
    }
}
