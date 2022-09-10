package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.details.AutoValue_TripDetailsContext;
import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
/* compiled from: PG */
/* renamed from: svf  reason: default package */
/* loaded from: classes7.dex */
public final class svf implements Parcelable.Creator<AutoValue_TripDetailsContext> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TripDetailsContext createFromParcel(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_TripDetailsContext(z, (dbsg) parcel.readSerializable(), parcel.readByte() == 0 ? dbpy.a : dbsg.j((TripDetailsContext.ModelGroupAndTripDetailsContext) parcel.readValue(TripDetailsContext.ModelGroupAndTripDetailsContext.class.getClassLoader())), parcel.readByte() == 0 ? dbpy.a : dbsg.j((TripDetailsContext.TaxiTripDetailsContext) parcel.readValue(TripDetailsContext.TaxiTripDetailsContext.class.getClassLoader())));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TripDetailsContext[] newArray(int i) {
        return new AutoValue_TripDetailsContext[i];
    }
}
