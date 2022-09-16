package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InstreamAdImpl implements InstreamAd, afto {
    public static final Parcelable.Creator CREATOR = new xcg();
    public static final xch a = new xch();
    public final PlayerAd b;

    public InstreamAdImpl(PlayerAd playerAd) {
        this.b = playerAd;
    }

    @Override // defpackage.aalj
    public final long a() {
        return this.b.m;
    }

    @Override // defpackage.aalj
    @Deprecated
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final int c() {
        return this.b.o();
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final Uri d() {
        return this.b.d();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.afto
    /* renamed from: e */
    public final xch h() {
        return new xch(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InstreamAdImpl)) {
            return false;
        }
        return this.b.equals(((InstreamAdImpl) obj).b);
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final aalh f() {
        return this.b.D();
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String g() {
        return this.b.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String i() {
        return this.b.n();
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String j() {
        return this.b.f;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean k(snc sncVar) {
        return this.b.Z(sncVar);
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean l() {
        return this.b instanceof ForecastingAd;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean m() {
        return this.b.aa();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
    }
}
