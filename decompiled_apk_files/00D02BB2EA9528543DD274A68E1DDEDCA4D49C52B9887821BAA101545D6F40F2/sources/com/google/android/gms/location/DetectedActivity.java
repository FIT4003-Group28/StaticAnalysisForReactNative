package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new cojj();
    int a;
    public int b;

    public DetectedActivity(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        int i = this.a;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.a == detectedActivity.a && this.b == detectedActivity.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        int a = a();
        String num = a != 0 ? a != 1 ? a != 2 ? a != 3 ? a != 4 ? a != 5 ? a != 7 ? a != 8 ? a != 16 ? a != 17 ? Integer.toString(a) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(num);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
