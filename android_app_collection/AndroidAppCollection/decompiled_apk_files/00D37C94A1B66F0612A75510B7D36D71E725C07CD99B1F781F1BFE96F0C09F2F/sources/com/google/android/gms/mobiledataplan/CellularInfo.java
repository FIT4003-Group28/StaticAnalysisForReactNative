package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CellularInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(1);
    public final Integer a;
    public final Integer b;

    public CellularInfo(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellularInfo)) {
            return false;
        }
        CellularInfo cellularInfo = (CellularInfo) obj;
        return tnk.j(this.a, cellularInfo.a) && tnk.j(this.b, cellularInfo.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("connectionType", this.a, arrayList);
        tjk.g("meteredness", this.b, arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.B(parcel, 1, this.a);
        tqj.B(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
