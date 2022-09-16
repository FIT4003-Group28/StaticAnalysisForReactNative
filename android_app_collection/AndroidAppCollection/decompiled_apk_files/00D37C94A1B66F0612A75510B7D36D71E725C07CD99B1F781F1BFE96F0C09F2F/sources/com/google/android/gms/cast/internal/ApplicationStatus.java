package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApplicationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(1);
    public String a;

    public ApplicationStatus() {
        this(null);
    }

    public ApplicationStatus(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApplicationStatus) {
            return qpl.j(this.a, ((ApplicationStatus) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.n(parcel, m);
    }
}
