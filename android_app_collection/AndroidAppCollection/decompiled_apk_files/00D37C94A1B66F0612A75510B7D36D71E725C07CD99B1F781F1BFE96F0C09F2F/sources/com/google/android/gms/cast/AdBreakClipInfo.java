package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(18);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final VastAdsRequest l;

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                new JSONObject(this.g);
                return;
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
                this.g = null;
                new JSONObject();
                return;
            }
        }
        new JSONObject();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return qpl.j(this.a, adBreakClipInfo.a) && qpl.j(this.b, adBreakClipInfo.b) && this.c == adBreakClipInfo.c && qpl.j(this.d, adBreakClipInfo.d) && qpl.j(this.e, adBreakClipInfo.e) && qpl.j(this.f, adBreakClipInfo.f) && qpl.j(this.g, adBreakClipInfo.g) && qpl.j(this.h, adBreakClipInfo.h) && qpl.j(this.i, adBreakClipInfo.i) && this.j == adBreakClipInfo.j && qpl.j(this.k, adBreakClipInfo.k) && qpl.j(this.l, adBreakClipInfo.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.t(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.F(parcel, 6, this.e);
        tqj.F(parcel, 7, this.f);
        tqj.F(parcel, 8, this.g);
        tqj.F(parcel, 9, this.h);
        tqj.F(parcel, 10, this.i);
        tqj.t(parcel, 11, this.j);
        tqj.F(parcel, 12, this.k);
        tqj.E(parcel, 13, this.l, i);
        tqj.n(parcel, m);
    }
}
