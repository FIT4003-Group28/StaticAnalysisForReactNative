package com.google.android.apps.gmm.directions.framework.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_TripDetailsContext extends C$AutoValue_TripDetailsContext {
    public static final Parcelable.Creator<AutoValue_TripDetailsContext> CREATOR = new svf();

    public AutoValue_TripDetailsContext(boolean z, dbsg dbsgVar, dbsg<TripDetailsContext.ModelGroupAndTripDetailsContext> dbsgVar2, dbsg<TripDetailsContext.TaxiTripDetailsContext> dbsgVar3) {
        super(z, dbsgVar, dbsgVar2, dbsgVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeSerializable(this.b);
        dbsg<TripDetailsContext.ModelGroupAndTripDetailsContext> dbsgVar = this.c;
        if (dbsgVar.a()) {
            parcel.writeByte((byte) 1);
            parcel.writeValue(dbsgVar.b());
        } else {
            parcel.writeByte((byte) 0);
        }
        dbsg<TripDetailsContext.TaxiTripDetailsContext> dbsgVar2 = this.d;
        if (dbsgVar2.a()) {
            parcel.writeByte((byte) 1);
            parcel.writeValue(dbsgVar2.b());
            return;
        }
        parcel.writeByte((byte) 0);
    }
}
