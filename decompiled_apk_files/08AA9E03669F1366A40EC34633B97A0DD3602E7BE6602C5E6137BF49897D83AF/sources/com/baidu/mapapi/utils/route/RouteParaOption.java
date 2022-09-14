package com.baidu.mapapi.utils.route;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class RouteParaOption {

    /* renamed from: a  reason: collision with root package name */
    LatLng f1965a;

    /* renamed from: b  reason: collision with root package name */
    LatLng f1966b;

    /* renamed from: c  reason: collision with root package name */
    String f1967c;

    /* renamed from: d  reason: collision with root package name */
    String f1968d;
    String e;
    EBusStrategyType f = EBusStrategyType.bus_recommend_way;

    /* loaded from: classes.dex */
    public enum EBusStrategyType {
        bus_time_first,
        bus_transfer_little,
        bus_walk_little,
        bus_no_subway,
        bus_recommend_way
    }

    public RouteParaOption busStrategyType(EBusStrategyType eBusStrategyType) {
        this.f = eBusStrategyType;
        return this;
    }

    public RouteParaOption cityName(String str) {
        this.e = str;
        return this;
    }

    public RouteParaOption endName(String str) {
        this.f1968d = str;
        return this;
    }

    public RouteParaOption endPoint(LatLng latLng) {
        this.f1966b = latLng;
        return this;
    }

    public EBusStrategyType getBusStrategyType() {
        return this.f;
    }

    public String getCityName() {
        return this.e;
    }

    public String getEndName() {
        return this.f1968d;
    }

    public LatLng getEndPoint() {
        return this.f1966b;
    }

    public String getStartName() {
        return this.f1967c;
    }

    public LatLng getStartPoint() {
        return this.f1965a;
    }

    public RouteParaOption startName(String str) {
        this.f1967c = str;
        return this;
    }

    public RouteParaOption startPoint(LatLng latLng) {
        this.f1965a = latLng;
        return this;
    }
}
