package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.savedtrips.api.AutoValue_SavedTrip;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: wdm  reason: default package */
/* loaded from: classes7.dex */
public final class wdm implements Parcelable.Creator<AutoValue_SavedTrip> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SavedTrip createFromParcel(Parcel parcel) {
        return new AutoValue_SavedTrip(parcel.readString(), (SavedTrip.Data) parcel.readParcelable(SavedTrip.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_SavedTrip[] newArray(int i) {
        return new AutoValue_SavedTrip[i];
    }
}
