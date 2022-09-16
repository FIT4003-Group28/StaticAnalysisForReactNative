package com.google.android.libraries.onegoogle.popovercontainer;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ExpandableDialogView_State extends C$AutoValue_ExpandableDialogView_State {
    public static final Parcelable.Creator<AutoValue_ExpandableDialogView_State> CREATOR = new cwpd();

    public AutoValue_ExpandableDialogView_State(boolean z, Parcelable parcelable) {
        super(z, parcelable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
    }
}
