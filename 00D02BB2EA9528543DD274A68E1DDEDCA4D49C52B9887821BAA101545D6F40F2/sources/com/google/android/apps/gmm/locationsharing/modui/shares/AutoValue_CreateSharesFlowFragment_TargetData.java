package com.google.android.apps.gmm.locationsharing.modui.shares;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_CreateSharesFlowFragment_TargetData extends C$AutoValue_CreateSharesFlowFragment_TargetData {
    public static final Parcelable.Creator<AutoValue_CreateSharesFlowFragment_TargetData> CREATOR = new ajcg();

    public AutoValue_CreateSharesFlowFragment_TargetData(int i, @dzsi CreateSharesFlowFragment$SavedIntent createSharesFlowFragment$SavedIntent, @dzsi SendKitPickerResult sendKitPickerResult, @dzsi Profile profile) {
        super(i, createSharesFlowFragment$SavedIntent, sendKitPickerResult, profile);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ajcq.a(this.d));
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
