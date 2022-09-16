package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpUpsellOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MdpUpsellPlan[] e;
    public final Bundle f;
    public final Integer g;
    public final Long h;
    public final PaymentForm[] i;

    public MdpUpsellOfferResponse(String str, String str2, String str3, String str4, MdpUpsellPlan[] mdpUpsellPlanArr, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mdpUpsellPlanArr;
        this.f = bundle;
        this.g = num;
        this.h = l;
        this.i = paymentFormArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellOfferResponse)) {
            return false;
        }
        MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) obj;
        return tnk.j(this.a, mdpUpsellOfferResponse.a) && tnk.j(this.b, mdpUpsellOfferResponse.b) && tnk.j(this.c, mdpUpsellOfferResponse.c) && tnk.j(this.d, mdpUpsellOfferResponse.d) && Arrays.equals(this.e, mdpUpsellOfferResponse.e) && rqt.b(this.f, mdpUpsellOfferResponse.f) && tnk.j(this.g, mdpUpsellOfferResponse.g) && tnk.j(this.h, mdpUpsellOfferResponse.h) && Arrays.equals(this.i, mdpUpsellOfferResponse.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(rqt.a(this.f)), this.g, this.h, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.i))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("CarrierName", this.a, arrayList);
        tjk.g("CarrierLogoUrl", this.b, arrayList);
        tjk.g("PromoMessage", this.c, arrayList);
        tjk.g("Info", this.d, arrayList);
        tjk.g("UpsellPlans", Arrays.toString(this.e), arrayList);
        tjk.g("ExtraInfo", this.f, arrayList);
        tjk.g("EventFlowId", this.g, arrayList);
        tjk.g("UniqueRequestId", this.h, arrayList);
        tjk.g("PaymentForms", Arrays.toString(this.i), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.I(parcel, 5, this.e, i);
        tqj.v(parcel, 6, this.f);
        tqj.B(parcel, 7, this.g);
        tqj.D(parcel, 8, this.h);
        tqj.I(parcel, 9, this.i, i);
        tqj.n(parcel, m);
    }
}
