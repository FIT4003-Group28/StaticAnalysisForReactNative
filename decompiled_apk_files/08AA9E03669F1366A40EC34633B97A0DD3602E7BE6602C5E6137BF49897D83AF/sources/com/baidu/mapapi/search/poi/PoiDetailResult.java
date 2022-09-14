package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import ezvcard.property.Kind;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PoiDetailResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiDetailResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    int f1839a;

    /* renamed from: b  reason: collision with root package name */
    String f1840b;

    /* renamed from: c  reason: collision with root package name */
    String f1841c;

    /* renamed from: d  reason: collision with root package name */
    LatLng f1842d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    double k;
    double l;
    double m;
    double n;
    double o;
    double p;
    double q;
    double r;
    int s;
    int t;
    int u;
    int v;
    int w;
    String x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoiDetailResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PoiDetailResult(Parcel parcel) {
        this.f1839a = parcel.readInt();
        this.f1840b = parcel.readString();
        this.f1841c = parcel.readString();
        this.f1842d = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readDouble();
        this.l = parcel.readDouble();
        this.m = parcel.readDouble();
        this.n = parcel.readDouble();
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        this.r = parcel.readDouble();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readString();
    }

    public PoiDetailResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1839a = jSONObject.optInt("status");
            if (this.f1839a == 0) {
                this.f1840b = jSONObject.optString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE);
                JSONObject optJSONObject = jSONObject.optJSONObject(BiometricAuthenticationModule.RESULT);
                if (optJSONObject != null) {
                    this.f1841c = optJSONObject.optString("name");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(Kind.LOCATION);
                    this.f1842d = new LatLng(optJSONObject2.optDouble("lat"), optJSONObject2.optDouble("lng"));
                    this.e = optJSONObject.optString("address");
                    this.f = optJSONObject.optString("telephone");
                    this.g = optJSONObject.optString("uid");
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("detail_info");
                    if (optJSONObject3 == null) {
                        return true;
                    }
                    this.h = optJSONObject3.optString("tag");
                    this.i = optJSONObject3.optString("detail_url");
                    this.j = optJSONObject3.optString("type");
                    this.k = optJSONObject3.optDouble("price", 0.0d);
                    this.l = optJSONObject3.optDouble("overall_rating", 0.0d);
                    this.m = optJSONObject3.optDouble("taste_rating", 0.0d);
                    this.n = optJSONObject3.optDouble("service_rating", 0.0d);
                    this.o = optJSONObject3.optDouble("environment_rating", 0.0d);
                    this.p = optJSONObject3.optDouble("facility_rating", 0.0d);
                    this.q = optJSONObject3.optDouble("hygiene_rating", 0.0d);
                    this.r = optJSONObject3.optDouble("technology_rating", 0.0d);
                    this.s = optJSONObject3.optInt("image_num");
                    this.t = optJSONObject3.optInt("groupon_num");
                    this.u = optJSONObject3.optInt("comment_num");
                    this.v = optJSONObject3.optInt("favorite_num");
                    this.w = optJSONObject3.optInt("checkin_num");
                    this.x = optJSONObject3.optString("shop_hours");
                    return true;
                }
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.e;
    }

    public int getCheckinNum() {
        return this.w;
    }

    public int getCommentNum() {
        return this.u;
    }

    public String getDetailUrl() {
        return this.i;
    }

    public double getEnvironmentRating() {
        return this.o;
    }

    public double getFacilityRating() {
        return this.p;
    }

    public int getFavoriteNum() {
        return this.v;
    }

    public int getGrouponNum() {
        return this.t;
    }

    public double getHygieneRating() {
        return this.q;
    }

    public int getImageNum() {
        return this.s;
    }

    public LatLng getLocation() {
        return this.f1842d;
    }

    public String getName() {
        return this.f1841c;
    }

    public double getOverallRating() {
        return this.l;
    }

    public double getPrice() {
        return this.k;
    }

    public double getServiceRating() {
        return this.n;
    }

    public String getShopHours() {
        return this.x;
    }

    public String getTag() {
        return this.h;
    }

    public double getTasteRating() {
        return this.m;
    }

    public double getTechnologyRating() {
        return this.r;
    }

    public String getTelephone() {
        return this.f;
    }

    public String getType() {
        return this.j;
    }

    public String getUid() {
        return this.g;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1839a);
        parcel.writeString(this.f1840b);
        parcel.writeString(this.f1841c);
        parcel.writeValue(this.f1842d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeDouble(this.k);
        parcel.writeDouble(this.l);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.n);
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        parcel.writeDouble(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
    }
}
