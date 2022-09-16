package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpFlexTimeWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(4);
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public MdpFlexTimeWindow(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpFlexTimeWindow mdpFlexTimeWindow = (MdpFlexTimeWindow) obj;
            if (tnk.j(this.a, mdpFlexTimeWindow.a) && tnk.j(this.b, mdpFlexTimeWindow.b) && tnk.j(this.c, mdpFlexTimeWindow.c) && tnk.j(Integer.valueOf(this.d), Integer.valueOf(mdpFlexTimeWindow.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("RecurrenceType", this.a, arrayList);
        tjk.g("StartTime", this.b, arrayList);
        tjk.g("EndTime", this.c, arrayList);
        tjk.g("DiscountPercentage", Integer.valueOf(this.d), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.s(parcel, 4, this.d);
        tqj.n(parcel, m);
    }
}
