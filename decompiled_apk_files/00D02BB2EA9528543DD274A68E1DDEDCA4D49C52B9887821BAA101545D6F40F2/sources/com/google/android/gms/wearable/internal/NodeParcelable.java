package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NodeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NodeParcelable> CREATOR = new cpjh();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public NodeParcelable(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NodeParcelable)) {
            return false;
        }
        return ((NodeParcelable) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        int i = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
        sb.append("Node{");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.g(parcel, 4, this.c);
        cnwn.e(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
