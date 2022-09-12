package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutocompleteMatchInfo implements Parcelable {
    public static final Parcelable.Creator<AutocompleteMatchInfo> CREATOR = new cxqy();
    public final int a;
    public final int b;

    public AutocompleteMatchInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public AutocompleteMatchInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AutocompleteMatchInfo) {
            AutocompleteMatchInfo autocompleteMatchInfo = (AutocompleteMatchInfo) obj;
            if (this.a == autocompleteMatchInfo.a && this.b == autocompleteMatchInfo.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
