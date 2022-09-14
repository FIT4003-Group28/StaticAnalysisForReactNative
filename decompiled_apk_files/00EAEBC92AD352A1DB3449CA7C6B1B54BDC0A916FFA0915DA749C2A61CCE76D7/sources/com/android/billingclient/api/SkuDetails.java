package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a  reason: collision with root package name */
    private final String f4985a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f4986b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<SkuDetails> f4987a;

        /* renamed from: b  reason: collision with root package name */
        private int f4988b;

        /* renamed from: c  reason: collision with root package name */
        private String f4989c;

        public a(int i, String str, List<SkuDetails> list) {
            this.f4988b = i;
            this.f4989c = str;
            this.f4987a = list;
        }

        public String a() {
            return this.f4989c;
        }

        public int b() {
            return this.f4988b;
        }

        public List<SkuDetails> c() {
            return this.f4987a;
        }
    }

    public SkuDetails(String str) {
        this.f4985a = str;
        this.f4986b = new JSONObject(this.f4985a);
    }

    public String a() {
        return this.f4986b.optString("description");
    }

    public String b() {
        return this.f4986b.optString("freeTrialPeriod");
    }

    public String c() {
        return this.f4986b.optString("iconUrl");
    }

    public String d() {
        return this.f4986b.optString("introductoryPrice");
    }

    public String e() {
        return this.f4986b.optString("introductoryPriceCycles");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SkuDetails.class == obj.getClass()) {
            return TextUtils.equals(this.f4985a, ((SkuDetails) obj).f4985a);
        }
        return false;
    }

    public String f() {
        return this.f4986b.optString("introductoryPricePeriod");
    }

    public String g() {
        return this.f4985a;
    }

    public long h() {
        return this.f4986b.has("original_price_micros") ? this.f4986b.optLong("original_price_micros") : j();
    }

    public int hashCode() {
        return this.f4985a.hashCode();
    }

    public String i() {
        return this.f4986b.optString("price");
    }

    public long j() {
        return this.f4986b.optLong("price_amount_micros");
    }

    public String k() {
        return this.f4986b.optString("price_currency_code");
    }

    public String l() {
        return this.f4986b.optString("productId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        return this.f4986b.optString("skuDetailsToken");
    }

    public String n() {
        return this.f4986b.optString("subscriptionPeriod");
    }

    public String o() {
        return this.f4986b.optString("title");
    }

    public String p() {
        return this.f4986b.optString("type");
    }

    public boolean q() {
        return this.f4986b.has("rewardToken");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String r() {
        return this.f4986b.optString("rewardToken");
    }

    public String toString() {
        return "SkuDetails: " + this.f4985a;
    }
}
