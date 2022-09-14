package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class PseudonymousIdToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PseudonymousIdToken> CREATOR = new coyq();
    @dzsi
    public final String a;

    public PseudonymousIdToken(@dzsi String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PseudonymousIdToken) {
            return cnvv.a(this.a, ((PseudonymousIdToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("PseudonymousIdToken[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.c(parcel, d);
    }
}
