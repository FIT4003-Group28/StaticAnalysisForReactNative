package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.details.AutoValue_TripDetailsContext_TaxiTripDetailsContext;
/* compiled from: PG */
/* renamed from: svh  reason: default package */
/* loaded from: classes7.dex */
public final class svh implements Parcelable.Creator<AutoValue_TripDetailsContext_TaxiTripDetailsContext> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TripDetailsContext_TaxiTripDetailsContext createFromParcel(Parcel parcel) {
        return new AutoValue_TripDetailsContext_TaxiTripDetailsContext(parcel.readString(), Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TripDetailsContext_TaxiTripDetailsContext[] newArray(int i) {
        return new AutoValue_TripDetailsContext_TaxiTripDetailsContext[i];
    }
}
