package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConsentStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(12);
    public int a;

    private ConsentStatus() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentStatus)) {
            return false;
        }
        return tnk.j(Integer.valueOf(this.a), Integer.valueOf(((ConsentStatus) obj).a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("EnumVal", Integer.valueOf(this.a), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.n(parcel, m);
    }

    public ConsentStatus(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                this.a = i;
                return;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", Integer.valueOf(i)));
        }
    }
}
