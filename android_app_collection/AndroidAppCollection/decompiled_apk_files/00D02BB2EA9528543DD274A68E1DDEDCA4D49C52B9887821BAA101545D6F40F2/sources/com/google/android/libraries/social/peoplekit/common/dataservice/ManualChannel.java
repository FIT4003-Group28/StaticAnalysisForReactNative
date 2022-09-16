package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ManualChannel implements Channel {
    public static final Parcelable.Creator<ManualChannel> CREATOR = new cxrf();
    private String a;
    private String b;
    private String c;
    private final String d;
    private final int e;
    private String f;
    private String g;
    private String h;

    public ManualChannel(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    public ManualChannel(cxrg cxrgVar) {
        this.a = cxrgVar.a;
        this.d = cxrgVar.b;
        this.e = cxrgVar.c;
        this.f = cxrgVar.d;
    }

    public static cxrg B() {
        return new cxrg();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void A() {
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final int a() {
        return 1;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String b(Context context) {
        if (TextUtils.isEmpty(this.c)) {
            this.c = this.e == 2 ? cxqz.d(this.d, context) : this.d;
        }
        return this.c;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String c() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final int d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final AutocompleteMatchInfo e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Channel) {
            return cxrc.a(this, (Channel) obj);
        }
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String g() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final AutocompleteMatchInfo h() {
        return null;
    }

    public final int hashCode() {
        return cxrc.b(this);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String i(Context context) {
        return !TextUtils.isEmpty(this.a) ? this.a : b(context);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean k() {
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean l() {
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String m() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String n() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String o() {
        return "";
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String q() {
        return null;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final int r() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String s() {
        return this.h;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void t(String str, boolean z, boolean z2) {
        this.a = str;
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            int i = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
            sb.append(str);
            sb.append(" <");
            sb.append(i);
            sb.append(">");
            return sb.toString();
        }
        String str2 = this.d;
        int i2 = this.e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 14);
        sb2.append(str2);
        sb2.append(" <");
        sb2.append(i2);
        sb2.append(">");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void u(String str) {
        this.b = str;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void v(String str) {
        this.f = str;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void w(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void x(String str) {
        this.h = str;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean y() {
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final czha z(Context context) {
        return cxrc.c(this, context);
    }
}
