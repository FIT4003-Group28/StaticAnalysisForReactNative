package com.spotify.sdk.android.authentication;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AuthenticationResponse implements Parcelable {
    public static final Parcelable.Creator<AuthenticationResponse> CREATOR = new dxhx();
    public final String a;
    private final dxhz b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;

    public AuthenticationResponse(Parcel parcel) {
        this.f = parcel.readInt();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = dxhz.values()[parcel.readInt()];
    }

    public static AuthenticationResponse a(Uri uri) {
        dxhy dxhyVar = new dxhy();
        if (uri == null) {
            dxhyVar.a = dxhz.EMPTY;
            return dxhyVar.a();
        }
        String queryParameter = uri.getQueryParameter("error");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("state");
            dxhyVar.e = queryParameter;
            dxhyVar.d = queryParameter2;
            dxhyVar.a = dxhz.ERROR;
            return dxhyVar.a();
        }
        String queryParameter3 = uri.getQueryParameter("code");
        if (queryParameter3 != null) {
            String queryParameter4 = uri.getQueryParameter("state");
            dxhyVar.b = queryParameter3;
            dxhyVar.d = queryParameter4;
            dxhyVar.a = dxhz.CODE;
            return dxhyVar.a();
        }
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment == null || encodedFragment.length() <= 0) {
            dxhyVar.a = dxhz.UNKNOWN;
            return dxhyVar.a();
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        for (String str4 : encodedFragment.split("&")) {
            String[] split = str4.split("=");
            if (split.length == 2) {
                if (split[0].startsWith("access_token")) {
                    str = Uri.decode(split[1]);
                }
                if (split[0].startsWith("state")) {
                    str2 = Uri.decode(split[1]);
                }
                if (split[0].startsWith("expires_in")) {
                    str3 = Uri.decode(split[1]);
                }
            }
        }
        dxhyVar.c = str;
        dxhyVar.d = str2;
        if (str3 != null) {
            try {
                dxhyVar.f = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
            }
        }
        dxhyVar.a = dxhz.TOKEN;
        return dxhyVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeInt(this.b.ordinal());
    }

    public AuthenticationResponse(dxhz dxhzVar, String str, String str2, String str3, String str4, int i) {
        this.b = dxhzVar == null ? dxhz.UNKNOWN : dxhzVar;
        this.c = str;
        this.a = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }
}
