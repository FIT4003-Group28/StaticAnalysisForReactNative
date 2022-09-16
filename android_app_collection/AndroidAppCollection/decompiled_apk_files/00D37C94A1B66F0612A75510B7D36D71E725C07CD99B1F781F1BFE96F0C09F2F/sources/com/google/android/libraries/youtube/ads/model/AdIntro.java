package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdIntro extends MediaAd {
    public static final Parcelable.Creator CREATOR = new rxi(18);
    public static final xdk a = new wzs();
    public final PlayerResponseModel b;

    public AdIntro(String str, byte[] bArr, String str2, String str3, boolean z, String str4, long j, PlayerResponseModel playerResponseModel) {
        super(str, bArr, str2, str3, z, playerResponseModel.c(), str4, j, new VideoAdTrackingModel(apai.a));
        playerResponseModel.getClass();
        this.b = playerResponseModel;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.b.a();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri d() {
        List list;
        if (e() == null || (list = e().n) == null) {
            return null;
        }
        if (list.isEmpty()) {
            afus.b(1, 1, "Received non-null videoStreamingData object with empty list of format streams");
            return null;
        }
        return ((FormatStreamModel) list.get(0)).d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final VideoStreamingData e() {
        return this.b.c;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof AdIntro)) {
            return false;
        }
        AdIntro adIntro = (AdIntro) obj;
        return super.equals(adIntro) && akzj.f(this.b, adIntro.b);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlaybackTrackingModel f() {
        return this.b.f();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlayerResponseModel g() {
        return this.b;
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new wzs(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apax i() {
        return this.b.q();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final arit j() {
        arja arjaVar = this.b.a.r;
        if (arjaVar == null) {
            arjaVar = arja.a;
        }
        if (arjaVar.b == 61737181) {
            arja arjaVar2 = this.b.a.r;
            if (arjaVar2 == null) {
                arjaVar2 = arja.a;
            }
            if (arjaVar2.b == 61737181) {
                return (arit) arjaVar2.c;
            }
            return arit.a;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.MediaAd
    public final asib k() {
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String l() {
        return VastAd.a;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String m() {
        return this.b.x();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.b.B();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
    }
}
