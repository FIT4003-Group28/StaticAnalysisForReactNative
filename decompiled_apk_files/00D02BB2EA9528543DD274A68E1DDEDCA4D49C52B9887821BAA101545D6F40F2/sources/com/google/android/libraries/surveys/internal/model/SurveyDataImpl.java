package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.SurveyMetadata;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyDataImpl implements SurveyData {
    public static final Parcelable.Creator<SurveyDataImpl> CREATOR = new czoh();
    public final String a;
    public final String b;
    public final dubf c;
    public final duch d;
    public final String e;
    public final long f;
    public final dcdc<String> g;

    public SurveyDataImpl(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
        dcdc<String> e = dcdc.e();
        this.g = e;
        parcel.readStringList(e);
        this.c = (dubf) dsuv.a(parcel, dubf.g, dsqa.b());
        this.d = (duch) dsuv.a(parcel, duch.c, dsqa.b());
    }

    public SurveyDataImpl(String str, String str2, long j, duch duchVar, dubf dubfVar, String str3, dcdc<String> dcdcVar) {
        this.a = str;
        this.b = str2;
        this.f = j;
        this.e = str3;
        this.g = dcdcVar;
        this.c = dubfVar;
        this.d = duchVar;
    }

    @Override // com.google.android.libraries.surveys.SurveyData
    public final SurveyMetadata a() {
        return new SurveyMetadata(this.a, this.b, b());
    }

    public final String b() {
        duch duchVar = this.d;
        if (duchVar != null) {
            return duchVar.a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeStringList(this.g);
        dsuv.e(parcel, this.c);
        dsuv.e(parcel, this.d);
    }
}
