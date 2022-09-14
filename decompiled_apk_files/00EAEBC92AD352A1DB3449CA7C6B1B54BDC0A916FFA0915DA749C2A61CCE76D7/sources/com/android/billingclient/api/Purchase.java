package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a  reason: collision with root package name */
    private final String f4977a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4978b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4979c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<Purchase> f4980a;

        /* renamed from: b  reason: collision with root package name */
        private h f4981b;

        public a(h hVar, List<Purchase> list) {
            this.f4980a = list;
            this.f4981b = hVar;
        }

        public h a() {
            return this.f4981b;
        }

        public List<Purchase> b() {
            return this.f4980a;
        }
    }

    public Purchase(String str, String str2) {
        this.f4977a = str;
        this.f4978b = str2;
        this.f4979c = new JSONObject(this.f4977a);
    }

    public String a() {
        return this.f4979c.optString("developerPayload");
    }

    public String b() {
        return this.f4979c.optString("orderId");
    }

    public String c() {
        return this.f4977a;
    }

    public int d() {
        return this.f4979c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long e() {
        return this.f4979c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f4977a, purchase.c()) && TextUtils.equals(this.f4978b, purchase.g());
    }

    public String f() {
        JSONObject jSONObject = this.f4979c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String g() {
        return this.f4978b;
    }

    public String h() {
        return this.f4979c.optString("productId");
    }

    public int hashCode() {
        return this.f4977a.hashCode();
    }

    public boolean i() {
        return this.f4979c.optBoolean("acknowledged", true);
    }

    public boolean j() {
        return this.f4979c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: " + this.f4977a;
    }
}
