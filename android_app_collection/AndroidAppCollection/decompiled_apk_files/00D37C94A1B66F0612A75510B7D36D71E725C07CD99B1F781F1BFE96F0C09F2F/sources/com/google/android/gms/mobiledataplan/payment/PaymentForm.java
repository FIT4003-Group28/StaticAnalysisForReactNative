package com.google.android.gms.mobiledataplan.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentForm extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(15);
    public int a;

    private PaymentForm() {
    }

    public PaymentForm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentForm)) {
            return false;
        }
        return tnk.j(Integer.valueOf(this.a), Integer.valueOf(((PaymentForm) obj).a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.n(parcel, m);
    }
}
