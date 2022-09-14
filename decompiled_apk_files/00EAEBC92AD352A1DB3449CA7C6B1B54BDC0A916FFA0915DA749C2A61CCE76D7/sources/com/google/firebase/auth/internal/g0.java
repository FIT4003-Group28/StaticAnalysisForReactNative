package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c.e.a.b.d.e.c3;
import c.e.a.b.d.e.u2;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g0 extends com.google.android.gms.common.internal.x.a implements com.google.firebase.auth.t0 {
    public static final Parcelable.Creator<g0> CREATOR = new j0();

    /* renamed from: b  reason: collision with root package name */
    private String f8356b;

    /* renamed from: c  reason: collision with root package name */
    private String f8357c;

    /* renamed from: d  reason: collision with root package name */
    private String f8358d;

    /* renamed from: e  reason: collision with root package name */
    private String f8359e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f8360f;

    /* renamed from: g  reason: collision with root package name */
    private String f8361g;

    /* renamed from: h  reason: collision with root package name */
    private String f8362h;
    private boolean i;
    private String j;

    public g0(c3 c3Var) {
        com.google.android.gms.common.internal.s.a(c3Var);
        this.f8356b = c3Var.f();
        String k = c3Var.k();
        com.google.android.gms.common.internal.s.b(k);
        this.f8357c = k;
        this.f8358d = c3Var.j();
        Uri q = c3Var.q();
        if (q != null) {
            this.f8359e = q.toString();
            this.f8360f = q;
        }
        this.f8361g = c3Var.s();
        this.f8362h = c3Var.g();
        this.i = false;
        this.j = c3Var.r();
    }

    public g0(u2 u2Var, String str) {
        com.google.android.gms.common.internal.s.a(u2Var);
        com.google.android.gms.common.internal.s.b(str);
        String q = u2Var.q();
        com.google.android.gms.common.internal.s.b(q);
        this.f8356b = q;
        this.f8357c = str;
        this.f8361g = u2Var.f();
        this.f8358d = u2Var.k();
        Uri g2 = u2Var.g();
        if (g2 != null) {
            this.f8359e = g2.toString();
            this.f8360f = g2;
        }
        this.i = u2Var.j();
        this.j = null;
        this.f8362h = u2Var.r();
    }

    public g0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f8356b = str;
        this.f8357c = str2;
        this.f8361g = str3;
        this.f8362h = str4;
        this.f8358d = str5;
        this.f8359e = str6;
        if (!TextUtils.isEmpty(this.f8359e)) {
            this.f8360f = Uri.parse(this.f8359e);
        }
        this.i = z;
        this.j = str7;
    }

    public static g0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new g0(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new com.google.firebase.auth.v0.b(e2);
        }
    }

    @Override // com.google.firebase.auth.t0
    public final String a() {
        return this.f8357c;
    }

    public final String f() {
        return this.j;
    }

    @Override // com.google.firebase.auth.t0
    public final Uri h() {
        if (!TextUtils.isEmpty(this.f8359e) && this.f8360f == null) {
            this.f8360f = Uri.parse(this.f8359e);
        }
        return this.f8360f;
    }

    @Override // com.google.firebase.auth.t0
    public final String i() {
        return this.f8356b;
    }

    public final String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f8356b);
            jSONObject.putOpt("providerId", this.f8357c);
            jSONObject.putOpt("displayName", this.f8358d);
            jSONObject.putOpt("photoUrl", this.f8359e);
            jSONObject.putOpt("email", this.f8361g);
            jSONObject.putOpt("phoneNumber", this.f8362h);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.i));
            jSONObject.putOpt("rawUserInfo", this.j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new com.google.firebase.auth.v0.b(e2);
        }
    }

    @Override // com.google.firebase.auth.t0
    public final boolean l() {
        return this.i;
    }

    @Override // com.google.firebase.auth.t0
    public final String m() {
        return this.f8362h;
    }

    @Override // com.google.firebase.auth.t0
    public final String o() {
        return this.f8361g;
    }

    @Override // com.google.firebase.auth.t0
    public final String p() {
        return this.f8358d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, i(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, a(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, p(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f8359e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, o(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, m(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, l());
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.j, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
