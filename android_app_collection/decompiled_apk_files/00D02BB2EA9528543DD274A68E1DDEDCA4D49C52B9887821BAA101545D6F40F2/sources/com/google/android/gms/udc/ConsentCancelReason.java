package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConsentCancelReason extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConsentCancelReason> CREATOR = new cpdd();
    public final int a;
    public final boolean b;

    public ConsentCancelReason(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof ConsentCancelReason) {
            ConsentCancelReason consentCancelReason = (ConsentCancelReason) obj;
            if (this.a == consentCancelReason.a && this.b == consentCancelReason.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("CancelAction", Integer.valueOf(this.a));
        b.a("HadErrors", Boolean.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
