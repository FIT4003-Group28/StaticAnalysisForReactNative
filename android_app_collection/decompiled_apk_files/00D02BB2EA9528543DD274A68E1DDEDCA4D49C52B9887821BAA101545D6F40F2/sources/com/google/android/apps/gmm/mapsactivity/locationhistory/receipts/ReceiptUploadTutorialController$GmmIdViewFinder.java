package com.google.android.apps.gmm.mapsactivity.locationhistory.receipts;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.material.featurehighlight.ViewFinder;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ReceiptUploadTutorialController$GmmIdViewFinder extends ViewFinder {
    public static final Parcelable.Creator<ReceiptUploadTutorialController$GmmIdViewFinder> CREATOR = new aojo();
    private final int a;

    public ReceiptUploadTutorialController$GmmIdViewFinder() {
        this.a = R.id.live_camera_record_button;
    }

    public ReceiptUploadTutorialController$GmmIdViewFinder(Parcel parcel) {
        this.a = parcel.readInt();
    }

    @Override // com.google.android.libraries.material.featurehighlight.ViewFinder
    public final View a(Activity activity, View view) {
        fd K;
        View view2;
        if (!(activity instanceof gga) || (K = ((gga) activity).K()) == null || (view2 = K.P) == null) {
            return null;
        }
        return view2.findViewById(this.a);
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
