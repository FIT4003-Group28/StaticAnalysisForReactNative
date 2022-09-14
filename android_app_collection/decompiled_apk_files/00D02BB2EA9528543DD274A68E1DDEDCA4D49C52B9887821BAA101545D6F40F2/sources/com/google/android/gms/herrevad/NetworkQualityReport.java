package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NetworkQualityReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NetworkQualityReport> CREATOR = new coez();
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public Bundle f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;

    public NetworkQualityReport() {
        this.a = -1;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1;
        this.f = new Bundle();
        this.g = false;
        this.h = -1;
        this.i = false;
        this.j = false;
    }

    public final void a(String str, String str2) {
        this.f.putString(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[\n");
        sb.append("mLatencyMicros: ");
        sb.append(this.a);
        sb.append("\n");
        sb.append("mDurationMicros: ");
        sb.append(this.b);
        sb.append("\n");
        sb.append("mBytesDownloaded: ");
        sb.append(this.c);
        sb.append("\n");
        sb.append("mBytesUploaded: ");
        sb.append(this.d);
        sb.append("\n");
        sb.append("mMeasurementType: ");
        sb.append(this.e);
        sb.append("\n");
        sb.append("mIsNoConnectivity: ");
        sb.append(this.g);
        sb.append("\n");
        sb.append("mConnectivityType: ");
        sb.append(this.h);
        sb.append("\n");
        sb.append("mIsCaptivePortal: ");
        sb.append(this.i);
        sb.append("\n");
        sb.append("mHighPriority: ");
        sb.append(this.j);
        sb.append("\n");
        for (String str : this.f.keySet()) {
            sb.append("custom param: ");
            sb.append(str);
            sb.append("=");
            sb.append(this.f.get(str));
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.h(parcel, 3, this.b);
        cnwn.h(parcel, 4, this.c);
        cnwn.h(parcel, 5, this.d);
        cnwn.g(parcel, 6, this.e);
        cnwn.m(parcel, 7, this.f);
        cnwn.e(parcel, 8, this.g);
        cnwn.g(parcel, 9, this.h);
        cnwn.e(parcel, 10, this.i);
        cnwn.e(parcel, 11, this.j);
        cnwn.c(parcel, d);
    }

    public NetworkQualityReport(int i, long j, long j2, long j3, int i2, Bundle bundle, boolean z, int i3, boolean z2, boolean z3) {
        this.a = -1;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1;
        new Bundle();
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = bundle;
        this.g = z;
        this.h = i3;
        this.i = z2;
        this.j = z3;
    }
}
