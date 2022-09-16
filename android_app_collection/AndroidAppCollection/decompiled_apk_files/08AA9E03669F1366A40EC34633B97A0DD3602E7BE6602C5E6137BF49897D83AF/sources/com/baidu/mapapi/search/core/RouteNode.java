package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class RouteNode implements Parcelable {
    public static final Parcelable.Creator<RouteNode> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    private String f1794a;

    /* renamed from: b  reason: collision with root package name */
    private LatLng f1795b;

    /* renamed from: c  reason: collision with root package name */
    private String f1796c;

    public RouteNode() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RouteNode(Parcel parcel) {
        this.f1794a = parcel.readString();
        this.f1795b = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f1796c = parcel.readString();
    }

    public static RouteNode location(LatLng latLng) {
        RouteNode routeNode = new RouteNode();
        routeNode.setLocation(latLng);
        return routeNode;
    }

    public static RouteNode titleAndLocation(String str, LatLng latLng) {
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(str);
        routeNode.setLocation(latLng);
        return routeNode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getLocation() {
        return this.f1795b;
    }

    public String getTitle() {
        return this.f1794a;
    }

    public String getUid() {
        return this.f1796c;
    }

    public void setLocation(LatLng latLng) {
        this.f1795b = latLng;
    }

    public void setTitle(String str) {
        this.f1794a = str;
    }

    public void setUid(String str) {
        this.f1796c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1794a);
        parcel.writeValue(this.f1795b);
        parcel.writeString(this.f1796c);
    }
}
