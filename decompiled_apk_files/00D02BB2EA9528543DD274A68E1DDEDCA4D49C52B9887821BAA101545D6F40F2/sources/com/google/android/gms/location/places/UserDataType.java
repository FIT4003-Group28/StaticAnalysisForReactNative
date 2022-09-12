package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class UserDataType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserDataType> CREATOR;
    public static final UserDataType a;
    public static final UserDataType b;
    public static final UserDataType c;
    final String d;
    final int e;

    static {
        UserDataType a2 = a("test_type", 1);
        a = a2;
        UserDataType a3 = a("labeled_place", 6);
        b = a3;
        UserDataType a4 = a("here_content", 7);
        c = a4;
        Set a5 = cnxl.a(3, false);
        a5.add(a2);
        a5.add(a3);
        a5.add(a4);
        Collections.unmodifiableSet(a5);
        CREATOR = new coos();
    }

    public UserDataType(String str, int i) {
        cnwc.l(str);
        this.d = str;
        this.e = i;
    }

    private static UserDataType a(String str, int i) {
        return new UserDataType(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataType)) {
            return false;
        }
        UserDataType userDataType = (UserDataType) obj;
        return this.d.equals(userDataType.d) && this.e == userDataType.e;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.d, false);
        cnwn.g(parcel, 2, this.e);
        cnwn.c(parcel, d);
    }
}
