package com.baidu.mapapi.search.share;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class LocationShareURLOption {

    /* renamed from: a  reason: collision with root package name */
    LatLng f1920a = null;

    /* renamed from: b  reason: collision with root package name */
    String f1921b = null;

    /* renamed from: c  reason: collision with root package name */
    String f1922c = null;

    public LocationShareURLOption location(LatLng latLng) {
        this.f1920a = latLng;
        return this;
    }

    public LocationShareURLOption name(String str) {
        this.f1921b = str;
        return this;
    }

    public LocationShareURLOption snippet(String str) {
        this.f1922c = str;
        return this;
    }
}
