package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ActionBarColor_ThemedActionBarColor extends C$AutoValue_ActionBarColor_ThemedActionBarColor {
    public static final Parcelable.Creator CREATOR = new asq(14);

    public AutoValue_ActionBarColor_ThemedActionBarColor(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
