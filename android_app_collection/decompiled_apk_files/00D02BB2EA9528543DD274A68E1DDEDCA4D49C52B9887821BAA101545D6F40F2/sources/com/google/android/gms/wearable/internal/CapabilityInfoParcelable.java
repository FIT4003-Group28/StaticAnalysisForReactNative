package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CapabilityInfoParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CapabilityInfoParcelable> CREATOR = new cpho();
    public final String a;
    public final List<NodeParcelable> b;

    public CapabilityInfoParcelable(String str, List<NodeParcelable> list) {
        this.a = str;
        this.b = list;
        cnwc.a(str);
        cnwc.a(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.a;
        if (str == null ? capabilityInfoParcelable.a != null : !str.equals(capabilityInfoParcelable.a)) {
            return false;
        }
        List<NodeParcelable> list = this.b;
        return list == null ? capabilityInfoParcelable.b == null : list.equals(capabilityInfoParcelable.b);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List<NodeParcelable> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.y(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
