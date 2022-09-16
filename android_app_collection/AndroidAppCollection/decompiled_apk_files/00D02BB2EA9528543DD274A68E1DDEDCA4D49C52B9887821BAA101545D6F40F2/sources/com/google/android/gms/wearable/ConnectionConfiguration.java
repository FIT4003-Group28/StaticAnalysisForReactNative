package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new cpgj();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean f;
    public volatile String g;
    public boolean h;
    public String i;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return cnvv.a(this.a, connectionConfiguration.a) && cnvv.a(this.b, connectionConfiguration.b) && cnvv.a(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && cnvv.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && cnvv.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && cnvv.a(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.a);
        sb.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new String("mName="));
        String valueOf2 = String.valueOf(this.b);
        sb.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new String(", mAddress="));
        int i = this.c;
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(", mType=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.d;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mRole=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.e;
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(", mEnabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.f;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append(", mIsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.g);
        sb.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new String(", mPeerNodeId="));
        boolean z3 = this.h;
        StringBuilder sb6 = new StringBuilder(21);
        sb6.append(", mBtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.i);
        sb.append(valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new String(", mNodeId="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.g(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.e(parcel, 6, this.e);
        cnwn.e(parcel, 7, this.f);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.e(parcel, 9, this.h);
        cnwn.k(parcel, 10, this.i, false);
        cnwn.c(parcel, d);
    }
}
