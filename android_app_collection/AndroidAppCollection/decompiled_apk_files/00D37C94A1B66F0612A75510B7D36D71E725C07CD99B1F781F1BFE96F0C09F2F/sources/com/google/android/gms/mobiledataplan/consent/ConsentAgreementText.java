package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConsentAgreementText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(11);
    public SafeHtml a;
    public SafeHtml[] b;
    public SafeHtml[] c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;

    private ConsentAgreementText() {
    }

    public ConsentAgreementText(SafeHtml safeHtml, SafeHtml[] safeHtmlArr, SafeHtml[] safeHtmlArr2, String str, String str2, String str3, int i, String str4) {
        this.a = safeHtml;
        this.b = safeHtmlArr;
        this.c = safeHtmlArr2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentAgreementText) {
            ConsentAgreementText consentAgreementText = (ConsentAgreementText) obj;
            if (tnk.j(this.a, consentAgreementText.a) && Arrays.equals(this.b, consentAgreementText.b) && Arrays.equals(this.c, consentAgreementText.c) && tnk.j(this.d, consentAgreementText.d) && tnk.j(this.e, consentAgreementText.e) && tnk.j(this.f, consentAgreementText.f) && tnk.j(Integer.valueOf(this.g), Integer.valueOf(consentAgreementText.g)) && tnk.j(this.h, consentAgreementText.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, Integer.valueOf(this.g)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("Title", this.a, arrayList);
        tjk.g("DescriptionParagraphs", Arrays.toString(this.b), arrayList);
        tjk.g("AdditionalInfoParagraphs", Arrays.toString(this.c), arrayList);
        tjk.g("PositiveButtonCaption", this.d, arrayList);
        tjk.g("NegativeButtonCaption", this.e, arrayList);
        tjk.g("ContinueButtonCaption", this.f, arrayList);
        tjk.g("Version", Integer.valueOf(this.g), arrayList);
        tjk.g("TextId", this.h, arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 1, this.a, i);
        tqj.I(parcel, 2, this.b, i);
        tqj.I(parcel, 3, this.c, i);
        tqj.F(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.F(parcel, 6, this.f);
        tqj.s(parcel, 7, this.g);
        tqj.F(parcel, 8, this.h);
        tqj.n(parcel, m);
    }
}
