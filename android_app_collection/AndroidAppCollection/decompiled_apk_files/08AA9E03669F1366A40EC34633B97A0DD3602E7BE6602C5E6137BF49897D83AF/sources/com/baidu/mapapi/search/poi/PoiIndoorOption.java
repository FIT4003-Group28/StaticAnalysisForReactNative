package com.baidu.mapapi.search.poi;
/* loaded from: classes.dex */
public class PoiIndoorOption {

    /* renamed from: a  reason: collision with root package name */
    String f1845a;

    /* renamed from: b  reason: collision with root package name */
    String f1846b;

    /* renamed from: c  reason: collision with root package name */
    String f1847c;

    /* renamed from: d  reason: collision with root package name */
    int f1848d = 0;
    int e = 10;

    public PoiIndoorOption poiCurrentPage(int i) {
        this.f1848d = i;
        return this;
    }

    public PoiIndoorOption poiFloor(String str) {
        this.f1847c = str;
        return this;
    }

    public PoiIndoorOption poiIndoorBid(String str) {
        this.f1845a = str;
        return this;
    }

    public PoiIndoorOption poiIndoorWd(String str) {
        this.f1846b = str;
        return this;
    }

    public PoiIndoorOption poiPageSize(int i) {
        this.e = i;
        return this;
    }
}
