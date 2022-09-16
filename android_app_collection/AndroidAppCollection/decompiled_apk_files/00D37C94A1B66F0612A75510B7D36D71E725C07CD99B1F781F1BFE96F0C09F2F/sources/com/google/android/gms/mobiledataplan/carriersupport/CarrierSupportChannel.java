package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(9);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    private CarrierSupportChannel() {
    }

    public CarrierSupportChannel(String str, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportChannel) {
            CarrierSupportChannel carrierSupportChannel = (CarrierSupportChannel) obj;
            if (tnk.j(this.a, carrierSupportChannel.a) && tnk.j(this.b, carrierSupportChannel.b) && tnk.j(this.c, carrierSupportChannel.c) && tnk.j(this.d, carrierSupportChannel.d) && tnk.j(this.e, carrierSupportChannel.e) && tnk.j(Integer.valueOf(this.f), Integer.valueOf(carrierSupportChannel.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("Title", this.a, arrayList);
        tjk.g("SubTitle", this.b, arrayList);
        tjk.g("Target", this.c, arrayList);
        tjk.g("DefaultMessageSubject", this.d, arrayList);
        tjk.g("DefaultMessageBody", this.e, arrayList);
        tjk.g("Type", Integer.valueOf(this.f), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.s(parcel, 6, this.f);
        tqj.n(parcel, m);
    }
}
