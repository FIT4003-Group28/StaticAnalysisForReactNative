package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra();
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;

    public MdpCarrierPlanIdRequest() {
    }

    public MdpCarrierPlanIdRequest(String str, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdRequest)) {
            return false;
        }
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = (MdpCarrierPlanIdRequest) obj;
        return tnk.j(this.a, mdpCarrierPlanIdRequest.a) && rqt.b(this.b, mdpCarrierPlanIdRequest.b) && tnk.j(this.c, mdpCarrierPlanIdRequest.c) && tnk.j(this.d, mdpCarrierPlanIdRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(rqt.a(this.b)), this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.a;
        tjk.g("apiKey", str.substring(Math.max(str.length() - 5, 0)), arrayList);
        tjk.g("ExtraInfo", this.b, arrayList);
        tjk.g("EventFlowId", this.c, arrayList);
        tjk.g("UniqueRequestId", this.d, arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.v(parcel, 2, this.b);
        tqj.B(parcel, 3, this.c);
        tqj.D(parcel, 4, this.d);
        tqj.n(parcel, m);
    }
}
