package com.spotify.sdk.android.authentication;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AuthenticationRequest implements Parcelable {
    public static final Parcelable.Creator<AuthenticationRequest> CREATOR = new dxhv();
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;
    private final String e;
    private final boolean f;
    private final Map<String, String> g;
    private final String h;

    public AuthenticationRequest(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.createStringArray();
        this.f = parcel.readByte() != 1 ? false : true;
        this.g = new HashMap();
        this.h = parcel.readString();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        for (String str : readBundle.keySet()) {
            this.g.put(str, readBundle.getString(str));
        }
    }

    public AuthenticationRequest(dxhz dxhzVar, String[] strArr, Map<String, String> map) {
        this.a = "8b7569cef4fc4ee09d07142d8a4b2f6b";
        this.b = dxhzVar.f;
        this.c = "http://maps.google.com/maps";
        this.e = null;
        this.d = strArr;
        this.f = false;
        this.g = map;
        this.h = null;
    }

    public final Uri a() {
        Uri.Builder builder = new Uri.Builder();
        String str = "android-sdk";
        Uri.Builder appendQueryParameter = builder.scheme("https").authority("accounts.spotify.com").appendPath("authorize").appendQueryParameter("client_id", this.a).appendQueryParameter("response_type", this.b).appendQueryParameter("redirect_uri", this.c).appendQueryParameter("show_dialog", String.valueOf(this.f)).appendQueryParameter("utm_source", "spotify-sdk").appendQueryParameter("utm_medium", str);
        if (!TextUtils.isEmpty(this.h)) {
            str = this.h;
        }
        appendQueryParameter.appendQueryParameter("utm_campaign", str);
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : this.d) {
                sb.append(str2);
                sb.append(" ");
            }
            builder.appendQueryParameter("scope", sb.toString().trim());
        }
        String str3 = this.e;
        if (str3 != null) {
            builder.appendQueryParameter("state", str3);
        }
        if (this.g.size() > 0) {
            for (Map.Entry<String, String> entry : this.g.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeStringArray(this.d);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.h);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.g.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
    }
}
