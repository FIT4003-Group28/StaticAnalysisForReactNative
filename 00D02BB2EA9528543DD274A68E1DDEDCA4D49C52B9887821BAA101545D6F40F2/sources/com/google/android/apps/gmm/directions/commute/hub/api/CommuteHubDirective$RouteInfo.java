package com.google.android.apps.gmm.directions.commute.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class CommuteHubDirective$RouteInfo implements Parcelable {
    public static final Parcelable.Creator<CommuteHubDirective$RouteInfo> CREATOR = new quo();

    public static CommuteHubDirective$RouteInfo b(dspd dspdVar) {
        return new AutoValue_CommuteHubDirective_RouteInfo(dspdVar.G().length, dspdVar);
    }

    public abstract dspd a();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a().G().length);
        parcel.writeByteArray(a().G());
    }
}
