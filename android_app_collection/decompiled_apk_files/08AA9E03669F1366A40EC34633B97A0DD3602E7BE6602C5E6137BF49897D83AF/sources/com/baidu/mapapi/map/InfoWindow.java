package com.baidu.mapapi.map;

import android.view.View;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class InfoWindow {

    /* renamed from: a  reason: collision with root package name */
    BitmapDescriptor f1601a;

    /* renamed from: b  reason: collision with root package name */
    View f1602b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1603c;

    /* renamed from: d  reason: collision with root package name */
    OnInfoWindowClickListener f1604d;
    int e;

    /* loaded from: classes.dex */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick();
    }

    public InfoWindow(View view, LatLng latLng, int i) {
        if (view == null || latLng == null) {
            throw new IllegalArgumentException("view and position can not be null");
        }
        this.f1602b = view;
        this.f1603c = latLng;
        this.e = i;
    }

    public InfoWindow(BitmapDescriptor bitmapDescriptor, LatLng latLng, int i, OnInfoWindowClickListener onInfoWindowClickListener) {
        if (bitmapDescriptor == null || latLng == null) {
            throw new IllegalArgumentException("bitmapDescriptor and position can not be null");
        }
        this.f1601a = bitmapDescriptor;
        this.f1603c = latLng;
        this.f1604d = onInfoWindowClickListener;
        this.e = i;
    }
}
