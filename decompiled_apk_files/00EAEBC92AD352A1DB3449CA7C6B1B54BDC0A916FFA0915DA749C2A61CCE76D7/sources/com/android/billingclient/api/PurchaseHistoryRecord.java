package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a  reason: collision with root package name */
    private final String f4982a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4983b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4984c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f4982a = str;
        this.f4983b = str2;
        this.f4984c = new JSONObject(this.f4982a);
    }

    public String a() {
        return this.f4984c.optString("developerPayload");
    }

    public String b() {
        return this.f4982a;
    }

    public long c() {
        return this.f4984c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.f4984c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f4983b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f4982a, purchaseHistoryRecord.b()) && TextUtils.equals(this.f4983b, purchaseHistoryRecord.e());
    }

    public String f() {
        return this.f4984c.optString("productId");
    }

    public int hashCode() {
        return this.f4982a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: " + this.f4982a;
    }
}
