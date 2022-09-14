package com.baidu.mapapi.utils.poi;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class PoiParaOption {

    /* renamed from: a  reason: collision with root package name */
    String f1959a;

    /* renamed from: b  reason: collision with root package name */
    String f1960b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1961c;

    /* renamed from: d  reason: collision with root package name */
    int f1962d;

    public PoiParaOption center(LatLng latLng) {
        this.f1961c = latLng;
        return this;
    }

    public LatLng getCenter() {
        return this.f1961c;
    }

    public String getKey() {
        return this.f1960b;
    }

    public int getRadius() {
        return this.f1962d;
    }

    public String getUid() {
        return this.f1959a;
    }

    public PoiParaOption key(String str) {
        this.f1960b = str;
        return this;
    }

    public PoiParaOption radius(int i) {
        this.f1962d = i;
        return this;
    }

    public PoiParaOption uid(String str) {
        this.f1959a = str;
        return this;
    }
}
