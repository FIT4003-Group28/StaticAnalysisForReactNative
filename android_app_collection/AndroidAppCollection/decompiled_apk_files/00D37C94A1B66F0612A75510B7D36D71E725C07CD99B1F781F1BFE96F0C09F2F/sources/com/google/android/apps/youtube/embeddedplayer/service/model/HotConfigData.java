package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class HotConfigData implements BusSupported$Data {
    public static final Parcelable.Creator CREATOR;
    public final aqtp a;

    static {
        new HotConfigData(aqtp.a);
        CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.innertube.model.a(11);
    }

    public HotConfigData(aqtp aqtpVar) {
        this.a = aqtpVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.HOT_CONFIG_DATA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HotConfigData)) {
            return false;
        }
        return akzj.f(this.a, ((HotConfigData) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
    }
}
