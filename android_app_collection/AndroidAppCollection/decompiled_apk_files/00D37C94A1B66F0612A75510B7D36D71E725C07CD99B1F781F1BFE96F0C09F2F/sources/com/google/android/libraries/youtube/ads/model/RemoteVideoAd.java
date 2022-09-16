package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteVideoAd extends VideoAd {
    public static final Parcelable.Creator CREATOR = new xcg(3);
    public final boolean a;
    public final int b;
    public final String c;
    public final aalh p;
    public final Uri q;
    public final PlayerResponseModel r;
    public final apzg s;
    private final String t;
    private final asib u;

    public RemoteVideoAd(boolean z, int i, long j, String str, String str2, String str3, String str4, byte[] bArr, aalh aalhVar, Uri uri, PlayerResponseModel playerResponseModel, apzg apzgVar, asib asibVar) {
        super(str3, bArr, "", "", false, PlayerConfigModel.b, str, j, VideoAdTrackingModel.a);
        this.a = z;
        this.b = i;
        this.c = str2;
        this.t = str4;
        this.p = aalhVar;
        this.q = uri;
        this.r = playerResponseModel;
        this.s = apzgVar;
        this.u = asibVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aalh D() {
        return this.p;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean aa() {
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlayerResponseModel g() {
        return this.r;
    }

    @Override // defpackage.afto
    public final aftn h() {
        throw new UnsupportedOperationException("RemoteVideoAd should not be used for Jsonable converter.");
    }

    @Override // com.google.android.libraries.youtube.ads.model.MediaAd
    public final asib k() {
        return this.u;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.c;
    }

    public final xdq q() {
        xdq xdqVar = new xdq();
        xdqVar.a = this.a;
        xdqVar.b = this.b;
        xdqVar.c = this.m;
        xdqVar.d = this.l;
        xdqVar.e = this.c;
        xdqVar.f = this.f;
        xdqVar.g = this.t;
        xdqVar.h = this.g;
        xdqVar.i = this.p;
        xdqVar.j = this.q;
        xdqVar.k = this.r;
        xdqVar.l = this.s;
        xdqVar.m = this.u;
        return xdqVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri r() {
        return this.q;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.t);
        parcel.writeString(this.p.toString());
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.r, 0);
        apzg apzgVar = this.s;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        zgd.K(apzgVar, parcel);
        asib asibVar = this.u;
        if (asibVar != null) {
            zgd.K(asibVar, parcel);
        }
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String x() {
        return this.t;
    }
}
