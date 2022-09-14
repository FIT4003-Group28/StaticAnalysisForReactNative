package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.LatLngBounds;
/* loaded from: classes.dex */
public class PoiBoundSearchOption {

    /* renamed from: a  reason: collision with root package name */
    LatLngBounds f1831a = null;

    /* renamed from: b  reason: collision with root package name */
    String f1832b = null;

    /* renamed from: c  reason: collision with root package name */
    float f1833c = 12.0f;

    /* renamed from: d  reason: collision with root package name */
    int f1834d = 0;
    int e = 10;

    public PoiBoundSearchOption bound(LatLngBounds latLngBounds) {
        this.f1831a = latLngBounds;
        return this;
    }

    public PoiBoundSearchOption keyword(String str) {
        this.f1832b = str;
        return this;
    }

    public PoiBoundSearchOption pageCapacity(int i) {
        this.e = i;
        return this;
    }

    public PoiBoundSearchOption pageNum(int i) {
        this.f1834d = i;
        return this;
    }
}
