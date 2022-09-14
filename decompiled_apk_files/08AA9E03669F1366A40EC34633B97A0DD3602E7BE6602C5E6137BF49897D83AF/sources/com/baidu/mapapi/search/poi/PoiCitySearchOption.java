package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class PoiCitySearchOption {

    /* renamed from: a  reason: collision with root package name */
    String f1835a = null;

    /* renamed from: b  reason: collision with root package name */
    String f1836b = null;

    /* renamed from: c  reason: collision with root package name */
    float f1837c = 12.0f;

    /* renamed from: d  reason: collision with root package name */
    LatLng f1838d = null;
    int e = 0;
    int f = 10;

    public PoiCitySearchOption city(String str) {
        this.f1835a = str;
        return this;
    }

    public PoiCitySearchOption keyword(String str) {
        this.f1836b = str;
        return this;
    }

    public PoiCitySearchOption pageCapacity(int i) {
        this.f = i;
        return this;
    }

    public PoiCitySearchOption pageNum(int i) {
        this.e = i;
        return this;
    }
}
