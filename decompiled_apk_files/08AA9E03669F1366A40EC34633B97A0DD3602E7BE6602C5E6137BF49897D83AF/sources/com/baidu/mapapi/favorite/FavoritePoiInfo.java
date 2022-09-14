package com.baidu.mapapi.favorite;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class FavoritePoiInfo {

    /* renamed from: a  reason: collision with root package name */
    String f1528a;

    /* renamed from: b  reason: collision with root package name */
    String f1529b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1530c;

    /* renamed from: d  reason: collision with root package name */
    String f1531d;
    String e;
    String f;
    long g;

    public FavoritePoiInfo addr(String str) {
        this.f1531d = str;
        return this;
    }

    public FavoritePoiInfo cityName(String str) {
        this.e = str;
        return this;
    }

    public String getAddr() {
        return this.f1531d;
    }

    public String getCityName() {
        return this.e;
    }

    public String getID() {
        return this.f1528a;
    }

    public String getPoiName() {
        return this.f1529b;
    }

    public LatLng getPt() {
        return this.f1530c;
    }

    public long getTimeStamp() {
        return this.g;
    }

    public String getUid() {
        return this.f;
    }

    public FavoritePoiInfo poiName(String str) {
        this.f1529b = str;
        return this;
    }

    public FavoritePoiInfo pt(LatLng latLng) {
        this.f1530c = latLng;
        return this;
    }

    public FavoritePoiInfo uid(String str) {
        this.f = str;
        return this;
    }
}
