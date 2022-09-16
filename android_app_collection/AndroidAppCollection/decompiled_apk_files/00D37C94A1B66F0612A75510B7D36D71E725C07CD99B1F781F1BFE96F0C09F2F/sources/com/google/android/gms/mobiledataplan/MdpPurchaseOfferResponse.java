package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpPurchaseOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(5);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public Bundle h;
    public final Integer i;
    public final Long j;

    public MdpPurchaseOfferResponse(String str, String str2, String str3, String str4, long j, String str5, String str6, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = str6;
        this.h = bundle;
        this.i = num;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpPurchaseOfferResponse)) {
            return false;
        }
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) obj;
        return tnk.j(this.a, mdpPurchaseOfferResponse.a) && tnk.j(this.b, mdpPurchaseOfferResponse.b) && tnk.j(this.c, mdpPurchaseOfferResponse.c) && tnk.j(this.d, mdpPurchaseOfferResponse.d) && tnk.j(Long.valueOf(this.e), Long.valueOf(mdpPurchaseOfferResponse.e)) && tnk.j(this.f, mdpPurchaseOfferResponse.f) && tnk.j(this.g, mdpPurchaseOfferResponse.g) && rqt.b(this.h, mdpPurchaseOfferResponse.h) && tnk.j(this.i, mdpPurchaseOfferResponse.i) && tnk.j(this.j, mdpPurchaseOfferResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("CarrierName", this.a, arrayList);
        tjk.g("TransactionId", this.b, arrayList);
        tjk.g("ConfirmationCode", this.c, arrayList);
        tjk.g("TransactionMsg", this.d, arrayList);
        tjk.g("RemainingBalance", Long.valueOf(this.e), arrayList);
        tjk.g("CostCurrency", this.f, arrayList);
        tjk.g("PlanActivationTime", this.g, arrayList);
        tjk.g("ExtraInfo", this.h, arrayList);
        tjk.g("EventFlowId", this.i, arrayList);
        tjk.g("UniqueRequestId", this.j, arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.t(parcel, 5, this.e);
        tqj.F(parcel, 6, this.f);
        tqj.F(parcel, 7, this.g);
        tqj.v(parcel, 8, this.h);
        tqj.B(parcel, 9, this.i);
        tqj.D(parcel, 10, this.j);
        tqj.n(parcel, m);
    }
}
