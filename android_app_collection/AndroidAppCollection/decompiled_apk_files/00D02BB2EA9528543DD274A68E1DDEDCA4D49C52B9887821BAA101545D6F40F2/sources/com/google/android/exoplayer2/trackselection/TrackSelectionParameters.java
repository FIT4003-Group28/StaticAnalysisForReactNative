package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;
    public final dcdc<String> A;
    public final dcdc<String> B;
    public final int C;
    public final boolean D;
    public final int E;

    static {
        cmjp cmjpVar = new cmjp();
        new TrackSelectionParameters(cmjpVar.a, cmjpVar.b, cmjpVar.c);
        CREATOR = new cmjo();
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.A = dcdc.r(arrayList);
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.B = dcdc.r(arrayList2);
        this.C = parcel.readInt();
        this.D = cmny.n(parcel);
        this.E = parcel.readInt();
    }

    public TrackSelectionParameters(dcdc<String> dcdcVar, dcdc<String> dcdcVar2, int i) {
        this.A = dcdcVar;
        this.B = dcdcVar2;
        this.C = i;
        this.D = false;
        this.E = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (dchl.m(this.A, trackSelectionParameters.A) && dchl.m(this.B, trackSelectionParameters.B) && this.C == trackSelectionParameters.C && this.D == trackSelectionParameters.D && this.E == trackSelectionParameters.E) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.A.hashCode() + 31) * 31) + this.B.hashCode()) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + this.E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A);
        parcel.writeList(this.B);
        parcel.writeInt(this.C);
        cmny.o(parcel, this.D);
        parcel.writeInt(this.E);
    }
}
