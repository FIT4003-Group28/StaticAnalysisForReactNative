package com.google.android.apps.gmm.directions.maneuvers;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Maneuvers$Maneuver implements Parcelable {
    public static final Parcelable.Creator<Maneuvers$Maneuver> CREATOR = new vru();
    @dzsi
    public final dgau a;
    @dzsi
    public final dpdn b;
    public final boolean c;
    public final int d;

    public Maneuvers$Maneuver() {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = 0;
    }

    public Maneuvers$Maneuver(dgau dgauVar, dpdn dpdnVar, boolean z, int i) {
        this.a = dgauVar;
        this.b = dpdnVar;
        this.c = z;
        this.d = i;
    }

    public boolean a(dgau dgauVar, dpdn dpdnVar, dpdp dpdpVar, int i) {
        if (this.a != dgauVar) {
            return false;
        }
        return this.b == dpdn.SIDE_UNSPECIFIED || this.b == dpdnVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dgau dgauVar = this.a;
        int i2 = -1;
        parcel.writeInt(dgauVar == null ? -1 : dgauVar.F);
        dpdn dpdnVar = this.b;
        if (dpdnVar != null) {
            i2 = dpdnVar.d;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }

    public Maneuvers$Maneuver(Parcel parcel) {
        this.a = dgau.b(parcel.readInt());
        this.b = dpdn.b(parcel.readInt());
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
    }
}
