package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(2);
    public final String a;
    public final long b;
    public String c;
    public String d;
    public long e;
    public String f;
    public int g;
    public CarrierSupportInfo h;
    public Integer i;
    public Long j;

    public MdpCarrierPlanIdResponse(String str, long j, String str2, String str3, long j2, String str4, int i, CarrierSupportInfo carrierSupportInfo, Integer num, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        if (i == 0 || i == 1 || i == 2) {
            this.g = i;
            this.h = carrierSupportInfo;
            this.i = num;
            this.j = l;
            return;
        }
        throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdResponse)) {
            return false;
        }
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
        return tnk.j(this.a, mdpCarrierPlanIdResponse.a) && tnk.j(Long.valueOf(this.b), Long.valueOf(mdpCarrierPlanIdResponse.b)) && tnk.j(this.c, mdpCarrierPlanIdResponse.c) && tnk.j(this.d, mdpCarrierPlanIdResponse.d) && tnk.j(Long.valueOf(this.e), Long.valueOf(mdpCarrierPlanIdResponse.e)) && tnk.j(this.f, mdpCarrierPlanIdResponse.f) && tnk.j(Integer.valueOf(this.g), Integer.valueOf(mdpCarrierPlanIdResponse.g)) && tnk.j(this.h, mdpCarrierPlanIdResponse.h) && tnk.j(this.i, mdpCarrierPlanIdResponse.i) && tnk.j(this.j, mdpCarrierPlanIdResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("CarrierPlanId", this.a, arrayList);
        tjk.g("TTL-in-Seconds", Long.valueOf(this.b), arrayList);
        tjk.g("CarrierName", this.c, arrayList);
        tjk.g("CarrierLogoImageURL", this.d, arrayList);
        tjk.g("CarrierId", Long.valueOf(this.e), arrayList);
        tjk.g("CarrierCpid", this.f, arrayList);
        tjk.g("ResponseSource", Integer.valueOf(this.g), arrayList);
        tjk.g("CarrierSupportInfo", this.h, arrayList);
        tjk.g("EventFlowId", this.i, arrayList);
        tjk.g("UniqueRequestId", this.j, arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.t(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.t(parcel, 5, this.e);
        tqj.F(parcel, 6, this.f);
        tqj.s(parcel, 7, this.g);
        tqj.E(parcel, 8, this.h, i);
        tqj.B(parcel, 9, this.i);
        tqj.D(parcel, 10, this.j);
        tqj.n(parcel, m);
    }
}
