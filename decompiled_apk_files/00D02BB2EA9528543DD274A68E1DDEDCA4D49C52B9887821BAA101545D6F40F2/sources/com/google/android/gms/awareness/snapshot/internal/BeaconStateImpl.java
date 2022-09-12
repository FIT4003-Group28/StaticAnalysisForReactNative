package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class BeaconStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeaconStateImpl> CREATOR = new cmvd();
    public final ArrayList<BeaconInfoImpl> a;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public final class BeaconInfoImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator<BeaconInfoImpl> CREATOR = new cmvc();
        public final String a;
        public final String b;
        public final byte[] c;

        public BeaconInfoImpl(String str, String str2, @dzsi byte[] bArr) {
            cnwc.l(str);
            this.a = str;
            cnwc.l(str2);
            this.b = str2;
            this.c = bArr;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.k(parcel, 2, this.a, false);
            cnwn.k(parcel, 3, this.b, false);
            cnwn.l(parcel, 4, this.c, false);
            cnwn.c(parcel, d);
        }

        public final String toString() {
            byte[] bArr = this.c;
            String str = bArr == null ? "<null>" : new String(bArr);
            String str2 = this.a;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 6 + String.valueOf(str3).length() + str.length());
            sb.append("(");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append(", ");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public BeaconStateImpl(ArrayList<BeaconInfoImpl> arrayList) {
        this.a = arrayList;
    }

    public final String toString() {
        ArrayList<BeaconInfoImpl> arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BeaconState: ");
        ArrayList<BeaconInfoImpl> arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList2.get(i));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
