package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CarrierSupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(10);
    public String a;
    public String b;
    public CarrierSupportChannel[] c;

    private CarrierSupportInfo() {
    }

    public CarrierSupportInfo(String str, String str2, CarrierSupportChannel[] carrierSupportChannelArr) {
        this.a = str;
        this.b = str2;
        this.c = carrierSupportChannelArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportInfo) {
            CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo) obj;
            if (tnk.j(this.a, carrierSupportInfo.a) && tnk.j(this.b, carrierSupportInfo.b) && Arrays.equals(this.c, carrierSupportInfo.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("TitleMessage", this.a, arrayList);
        tjk.g("LanguageCode", this.b, arrayList);
        tjk.g("SupportChannels", Arrays.toString(this.c), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.I(parcel, 3, this.c, i);
        tqj.n(parcel, m);
    }
}
