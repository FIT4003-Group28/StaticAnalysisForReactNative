package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdVideoEnd extends MediaBreakAd {
    public static final Parcelable.Creator CREATOR = new rxi(19);
    public static final xdk a = new wzv();
    public final apax b;
    public final PlayerAd c;

    public AdVideoEnd(PlayerAd playerAd, String str) {
        super(playerAd.f, playerAd.g, playerAd.h, playerAd.i, playerAd.j, playerAd.k, str, playerAd.n);
        apax i = playerAd.i();
        i.getClass();
        this.b = i;
        this.c = playerAd;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof AdVideoEnd)) {
            return false;
        }
        AdVideoEnd adVideoEnd = (AdVideoEnd) obj;
        return super.equals(adVideoEnd) && akzj.f(this.b, adVideoEnd.b);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new wzv(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apax i() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyz qP() {
        apax apaxVar = this.b;
        if ((apaxVar.b & 128) != 0) {
            aoyz aoyzVar = apaxVar.i;
            return aoyzVar == null ? aoyz.a : aoyzVar;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        zgd.K(this.b, parcel);
        parcel.writeParcelable(this.c, 0);
    }

    public AdVideoEnd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, apax apaxVar, PlayerAd playerAd) {
        super(str, bArr, str2, str3, z, playerConfigModel, str4, new VideoAdTrackingModel(apai.a));
        apaxVar.getClass();
        this.b = apaxVar;
        playerAd.getClass();
        this.c = playerAd;
    }
}
