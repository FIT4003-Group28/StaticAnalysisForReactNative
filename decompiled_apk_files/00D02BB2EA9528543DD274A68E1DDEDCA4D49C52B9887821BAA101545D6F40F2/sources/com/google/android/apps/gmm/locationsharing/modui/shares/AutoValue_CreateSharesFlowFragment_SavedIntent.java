package com.google.android.apps.gmm.locationsharing.modui.shares;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_CreateSharesFlowFragment_SavedIntent extends C$AutoValue_CreateSharesFlowFragment_SavedIntent {
    public static final Parcelable.Creator<AutoValue_CreateSharesFlowFragment_SavedIntent> CREATOR = new ajcf();

    public AutoValue_CreateSharesFlowFragment_SavedIntent(Intent intent, String str) {
        super(intent, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
