package com.baidu.mapapi.navi;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class NaviParaOption {

    /* renamed from: a  reason: collision with root package name */
    LatLng f1773a;

    /* renamed from: b  reason: collision with root package name */
    String f1774b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1775c;

    /* renamed from: d  reason: collision with root package name */
    String f1776d;

    public NaviParaOption endName(String str) {
        this.f1776d = str;
        return this;
    }

    public NaviParaOption endPoint(LatLng latLng) {
        this.f1775c = latLng;
        return this;
    }

    public String getEndName() {
        return this.f1776d;
    }

    public LatLng getEndPoint() {
        return this.f1775c;
    }

    public String getStartName() {
        return this.f1774b;
    }

    public LatLng getStartPoint() {
        return this.f1773a;
    }

    public NaviParaOption startName(String str) {
        this.f1774b = str;
        return this;
    }

    public NaviParaOption startPoint(LatLng latLng) {
        this.f1773a = latLng;
        return this;
    }
}
