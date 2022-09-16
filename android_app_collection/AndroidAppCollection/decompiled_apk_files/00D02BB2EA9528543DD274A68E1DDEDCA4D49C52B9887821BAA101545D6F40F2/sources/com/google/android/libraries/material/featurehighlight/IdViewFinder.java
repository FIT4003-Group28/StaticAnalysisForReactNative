package com.google.android.libraries.material.featurehighlight;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class IdViewFinder extends ViewFinder {
    public static final Parcelable.Creator<IdViewFinder> CREATOR = new csmf();
    private final int a;

    public IdViewFinder() {
        this.a = R.id.tutorial_blue_dot;
    }

    public IdViewFinder(Parcel parcel) {
        this.a = parcel.readInt();
    }

    @Override // com.google.android.libraries.material.featurehighlight.ViewFinder
    public final View a(Activity activity, View view) {
        View findViewById = view != null ? view.findViewById(this.a) : null;
        return findViewById == null ? activity.findViewById(this.a) : findViewById;
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
