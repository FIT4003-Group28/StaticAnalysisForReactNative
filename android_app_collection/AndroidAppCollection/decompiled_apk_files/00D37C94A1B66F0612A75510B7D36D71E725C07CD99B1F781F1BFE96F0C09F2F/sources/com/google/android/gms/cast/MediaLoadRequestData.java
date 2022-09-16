package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final MediaInfo a;
    public final MediaQueueData b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public long l;
    private final JSONObject m;

    static {
        new qpu("MediaLoadRequestData");
        CREATOR = new qjl(7);
    }

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = mediaQueueData;
        this.c = bool;
        this.d = j;
        this.e = d;
        this.f = jArr;
        this.m = jSONObject;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = j2;
    }

    public static MediaLoadRequestData a(JSONObject jSONObject) {
        qkb qkbVar = new qkb();
        try {
            if (jSONObject.has("media")) {
                qkbVar.a = new MediaInfo(jSONObject.getJSONObject("media"));
            }
            if (jSONObject.has("queueData")) {
                MediaQueueData mediaQueueData = new MediaQueueData();
                tgo.q(jSONObject.getJSONObject("queueData"), mediaQueueData);
                qkbVar.b = tgo.p(mediaQueueData);
            }
            if (jSONObject.has("autoplay")) {
                qkbVar.c = Boolean.valueOf(jSONObject.getBoolean("autoplay"));
            } else {
                qkbVar.c = null;
            }
            if (jSONObject.has("currentTime")) {
                qkbVar.d = qpl.b(jSONObject.getDouble("currentTime"));
            } else {
                qkbVar.d = -1L;
            }
            qkbVar.b(jSONObject.optDouble("playbackRate", 1.0d));
            qkbVar.g = qpl.e(jSONObject, "credentials");
            qkbVar.h = qpl.e(jSONObject, "credentialsType");
            qkbVar.i = qpl.e(jSONObject, "atvCredentials");
            qkbVar.j = qpl.e(jSONObject, "atvCredentialsType");
            qkbVar.k = jSONObject.optLong("requestId");
            JSONArray optJSONArray = jSONObject.optJSONArray("activeTrackIds");
            if (optJSONArray != null) {
                long[] jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = optJSONArray.getLong(i);
                }
                qkbVar.e = jArr;
            }
            qkbVar.f = jSONObject.optJSONObject("customData");
            return qkbVar.a();
        } catch (JSONException unused) {
            return qkbVar.a();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return qyk.a(this.m, mediaLoadRequestData.m) && tnk.j(this.a, mediaLoadRequestData.a) && tnk.j(this.b, mediaLoadRequestData.b) && tnk.j(this.c, mediaLoadRequestData.c) && this.d == mediaLoadRequestData.d && this.e == mediaLoadRequestData.e && Arrays.equals(this.f, mediaLoadRequestData.f) && tnk.j(this.h, mediaLoadRequestData.h) && tnk.j(this.i, mediaLoadRequestData.i) && tnk.j(this.j, mediaLoadRequestData.j) && tnk.j(this.k, mediaLoadRequestData.k) && this.l == mediaLoadRequestData.l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.m), this.h, this.i, this.j, this.k, Long.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.E(parcel, 3, this.b, i);
        tqj.u(parcel, 4, this.c);
        tqj.t(parcel, 5, this.d);
        tqj.p(parcel, 6, this.e);
        tqj.C(parcel, 7, this.f);
        tqj.F(parcel, 8, this.g);
        tqj.F(parcel, 9, this.h);
        tqj.F(parcel, 10, this.i);
        tqj.F(parcel, 11, this.j);
        tqj.F(parcel, 12, this.k);
        tqj.t(parcel, 13, this.l);
        tqj.n(parcel, m);
    }
}
