package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(3);
    public final String a;
    public final MdpDataPlanStatus[] b;
    public final Bundle c;
    public final String d;
    public final WalletBalanceInfo e;
    public final Integer f;
    public final Long g;
    public final Long h;
    public CellularInfo[] i;

    public MdpDataPlanStatusResponse(String str, MdpDataPlanStatus[] mdpDataPlanStatusArr, Bundle bundle, String str2, WalletBalanceInfo walletBalanceInfo, Integer num, Long l, Long l2, CellularInfo[] cellularInfoArr) {
        this.a = str;
        this.b = mdpDataPlanStatusArr;
        this.c = bundle;
        this.d = str2;
        this.e = walletBalanceInfo;
        this.f = num;
        this.g = l;
        this.h = l2;
        this.i = cellularInfoArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpDataPlanStatusResponse)) {
            return false;
        }
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) obj;
        return tnk.j(this.a, mdpDataPlanStatusResponse.a) && Arrays.equals(this.b, mdpDataPlanStatusResponse.b) && rqt.b(this.c, mdpDataPlanStatusResponse.c) && tnk.j(this.d, mdpDataPlanStatusResponse.d) && tnk.j(this.e, mdpDataPlanStatusResponse.e) && tnk.j(this.f, mdpDataPlanStatusResponse.f) && tnk.j(this.g, mdpDataPlanStatusResponse.g) && tnk.j(this.h, mdpDataPlanStatusResponse.h) && Arrays.equals(this.i, mdpDataPlanStatusResponse.i);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, Integer.valueOf(rqt.a(this.c)), this.d, this.e, this.f, this.g, this.h}) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("CarrierPlanId", this.a, arrayList);
        tjk.g("DataPlans", Arrays.toString(this.b), arrayList);
        tjk.g("ExtraInfo", this.c, arrayList);
        tjk.g("Title", this.d, arrayList);
        tjk.g("WalletBalanceInfo", this.e, arrayList);
        tjk.g("EventFlowId", this.f, arrayList);
        tjk.g("UniqueRequestId", this.g, arrayList);
        Long l = this.h;
        tjk.g("UpdateTime", l != null ? aosw.c(l.longValue()) : null, arrayList);
        tjk.g("CellularInfo", Arrays.toString(this.i), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.I(parcel, 2, this.b, i);
        tqj.v(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.E(parcel, 5, this.e, i);
        tqj.B(parcel, 6, this.f);
        tqj.D(parcel, 7, this.g);
        tqj.D(parcel, 8, this.h);
        tqj.I(parcel, 9, this.i, i);
        tqj.n(parcel, m);
    }
}
