package com.baidu.platform.comjni.map.search;

import android.os.Bundle;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2150a = "a";

    /* renamed from: b  reason: collision with root package name */
    private long f2151b = 0;

    /* renamed from: c  reason: collision with root package name */
    private JNISearch f2152c;

    public a() {
        this.f2152c = null;
        this.f2152c = new JNISearch();
    }

    public long a() {
        this.f2151b = this.f2152c.Create();
        return this.f2151b;
    }

    public String a(int i) {
        return this.f2152c.GetSearchResult(this.f2151b, i);
    }

    public boolean a(int i, int i2) {
        return this.f2152c.ReverseGeocodeSearch(this.f2151b, i, i2);
    }

    public boolean a(int i, int i2, String str, String str2) {
        return this.f2152c.PoiRGCShareUrlSearch(this.f2151b, i, i2, str, str2);
    }

    public boolean a(Bundle bundle) {
        return this.f2152c.ForceSearchByCityName(this.f2151b, bundle);
    }

    public boolean a(String str) {
        return this.f2152c.POIDetailSearchPlace(this.f2151b, str);
    }

    public boolean a(String str, String str2) {
        return this.f2152c.BusLineDetailSearch(this.f2151b, str, str2);
    }

    public int b() {
        return this.f2152c.Release(this.f2151b);
    }

    public boolean b(Bundle bundle) {
        return this.f2152c.AreaSearch(this.f2151b, bundle);
    }

    public boolean b(String str) {
        return this.f2152c.PoiDetailShareUrlSearch(this.f2151b, str);
    }

    public boolean b(String str, String str2) {
        return this.f2152c.geocode(this.f2151b, str, str2);
    }

    public boolean c(Bundle bundle) {
        return this.f2152c.IndoorSearch(this.f2151b, bundle);
    }

    public boolean c(String str, String str2) {
        return this.f2152c.districtSearch(this.f2151b, str, str2);
    }

    public boolean d(Bundle bundle) {
        return this.f2152c.RoutePlanByBus(this.f2151b, bundle);
    }

    public boolean e(Bundle bundle) {
        return this.f2152c.RoutePlanByCar(this.f2151b, bundle);
    }

    public boolean f(Bundle bundle) {
        return this.f2152c.RoutePlanByFoot(this.f2151b, bundle);
    }

    public boolean g(Bundle bundle) {
        return this.f2152c.routePlanByBike(this.f2151b, bundle);
    }

    public boolean h(Bundle bundle) {
        return this.f2152c.SuggestionSearch(this.f2151b, bundle);
    }

    public boolean i(Bundle bundle) {
        return this.f2152c.routeShareUrlSearch(this.f2151b, bundle);
    }

    public boolean j(Bundle bundle) {
        return this.f2152c.MapBoundSearch(this.f2151b, bundle);
    }
}
