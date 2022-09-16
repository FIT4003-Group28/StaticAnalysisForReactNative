package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.details.AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext;
/* compiled from: PG */
/* renamed from: svg  reason: default package */
/* loaded from: classes7.dex */
public final class svg implements Parcelable.Creator<AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext createFromParcel(Parcel parcel) {
        return new AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext(parcel.readString(), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext[] newArray(int i) {
        return new AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext[i];
    }
}
