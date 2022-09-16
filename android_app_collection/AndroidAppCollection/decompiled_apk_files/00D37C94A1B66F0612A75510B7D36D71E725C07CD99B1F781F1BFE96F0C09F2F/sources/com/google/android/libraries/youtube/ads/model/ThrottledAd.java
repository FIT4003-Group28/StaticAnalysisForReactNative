package com.google.android.libraries.youtube.ads.model;

import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ThrottledAd extends PlayerAd {
    public static final ThrottledAd a = new ThrottledAd("throttled", new byte[0], "", "throttled", false, PlayerConfigModel.b, "", Long.MAX_VALUE);
    public static final Parcelable.Creator CREATOR = new xcg(6);

    static {
        new xee();
    }

    public ThrottledAd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, long j) {
        super(str, bArr, str2, str3, z, playerConfigModel, str4, j, new VideoAdTrackingModel(apai.a));
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof ThrottledAd)) {
            return false;
        }
        return super.equals((ThrottledAd) obj);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new xee(this);
    }
}
