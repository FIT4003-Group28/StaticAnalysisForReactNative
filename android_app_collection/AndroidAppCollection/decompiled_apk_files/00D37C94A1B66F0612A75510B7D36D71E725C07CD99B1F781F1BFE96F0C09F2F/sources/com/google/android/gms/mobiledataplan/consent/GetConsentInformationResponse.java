package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(13);
    public ConsentStatus a;
    public ConsentAgreementText b;
    public Long c;
    public Integer d;
    public Long e;
    public Integer f;

    private GetConsentInformationResponse() {
    }

    public GetConsentInformationResponse(ConsentStatus consentStatus, ConsentAgreementText consentAgreementText, Long l, Integer num, Long l2, Integer num2) {
        this.a = consentStatus;
        this.b = consentAgreementText;
        this.c = l;
        this.d = num;
        this.e = l2;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationResponse) {
            GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) obj;
            if (tnk.j(this.a, getConsentInformationResponse.a) && tnk.j(this.b, getConsentInformationResponse.b) && tnk.j(this.c, getConsentInformationResponse.c) && tnk.j(this.d, getConsentInformationResponse.d) && tnk.j(this.e, getConsentInformationResponse.e) && tnk.j(this.f, getConsentInformationResponse.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("ConsentStatus", this.a, arrayList);
        tjk.g("ConsentAgreementText", this.b, arrayList);
        tjk.g("ConsentChangeTime", this.c, arrayList);
        tjk.g("EventFlowId", this.d, arrayList);
        tjk.g("UniqueRequestId", this.e, arrayList);
        tjk.g("ConsentResponseSource", this.f, arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 1, this.a, i);
        tqj.E(parcel, 2, this.b, i);
        tqj.D(parcel, 3, this.c);
        tqj.B(parcel, 4, this.d);
        tqj.D(parcel, 5, this.e);
        tqj.B(parcel, 6, this.f);
        tqj.n(parcel, m);
    }
}
