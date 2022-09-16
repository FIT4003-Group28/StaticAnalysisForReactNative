package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class PoiNearbySearchOption {

    /* renamed from: a  reason: collision with root package name */
    String f1852a = null;

    /* renamed from: b  reason: collision with root package name */
    LatLng f1853b = null;

    /* renamed from: c  reason: collision with root package name */
    int f1854c = -1;

    /* renamed from: d  reason: collision with root package name */
    float f1855d = 12.0f;
    int e = 0;
    int f = 10;
    PoiSortType g = PoiSortType.comprehensive;

    public PoiNearbySearchOption keyword(String str) {
        this.f1852a = str;
        return this;
    }

    public PoiNearbySearchOption location(LatLng latLng) {
        this.f1853b = latLng;
        return this;
    }

    public PoiNearbySearchOption pageCapacity(int i) {
        this.f = i;
        return this;
    }

    public PoiNearbySearchOption pageNum(int i) {
        this.e = i;
        return this;
    }

    public PoiNearbySearchOption radius(int i) {
        this.f1854c = i;
        return this;
    }

    public PoiNearbySearchOption sortType(PoiSortType poiSortType) {
        if (poiSortType != null) {
            this.g = poiSortType;
        }
        return this;
    }
}
