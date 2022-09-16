package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpUpsellPlan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(7);
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;

    public MdpUpsellPlan(String str, String str2, String str3, long j, String str4, String str5, long j2, long j3, String str6, String str7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = j3;
        this.i = str6;
        this.j = str7;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellPlan)) {
            return false;
        }
        MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan) obj;
        return tnk.j(this.a, mdpUpsellPlan.a) && tnk.j(this.b, mdpUpsellPlan.b) && tnk.j(this.c, mdpUpsellPlan.c) && tnk.j(Long.valueOf(this.d), Long.valueOf(mdpUpsellPlan.d)) && tnk.j(this.e, mdpUpsellPlan.e) && tnk.j(this.f, mdpUpsellPlan.f) && tnk.j(Long.valueOf(this.g), Long.valueOf(mdpUpsellPlan.g)) && tnk.j(Long.valueOf(this.h), Long.valueOf(mdpUpsellPlan.h)) && tnk.j(this.i, mdpUpsellPlan.i) && tnk.j(this.j, mdpUpsellPlan.j) && tnk.j(Integer.valueOf(this.k), Integer.valueOf(mdpUpsellPlan.k));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("PlanId", this.a, arrayList);
        tjk.g("PlanName", this.b, arrayList);
        tjk.g("PlanType", this.c, arrayList);
        tjk.g("Cost", Long.valueOf(this.d), arrayList);
        tjk.g("CostCurrency", this.e, arrayList);
        tjk.g("ConnectionType", this.f, arrayList);
        tjk.g("DurationInSeconds", Long.valueOf(this.g), arrayList);
        tjk.g("mQuotaBytes", Long.valueOf(this.h), arrayList);
        tjk.g("mOfferContext", this.i, arrayList);
        tjk.g("planDescription", this.j, arrayList);
        tjk.g("offerType", Integer.valueOf(this.k), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.t(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.F(parcel, 6, this.f);
        tqj.t(parcel, 7, this.g);
        tqj.t(parcel, 8, this.h);
        tqj.F(parcel, 9, this.i);
        tqj.F(parcel, 10, this.j);
        tqj.s(parcel, 11, this.k);
        tqj.n(parcel, m);
    }
}
