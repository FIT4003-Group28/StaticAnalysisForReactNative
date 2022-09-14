package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.google.android.gms.common.api.Api;
/* loaded from: classes.dex */
public final class GroundOverlayOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    int f1589a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1591c;

    /* renamed from: d  reason: collision with root package name */
    private BitmapDescriptor f1592d;
    private LatLng e;
    private int f;
    private int g;
    private LatLngBounds j;
    private float h = 0.5f;
    private float i = 0.5f;
    private float k = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    boolean f1590b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        int i;
        GroundOverlay groundOverlay = new GroundOverlay();
        groundOverlay.s = this.f1590b;
        groundOverlay.r = this.f1589a;
        groundOverlay.t = this.f1591c;
        if (this.f1592d == null) {
            throw new IllegalStateException("when you add ground overlay, you must set the image");
        }
        groundOverlay.f1586b = this.f1592d;
        if (this.j != null || this.e == null) {
            if (this.e != null || this.j == null) {
                throw new IllegalStateException("when you add ground overlay, you must set one of position or bounds");
            }
            groundOverlay.h = this.j;
            i = 1;
        } else if (this.f <= 0 || this.g <= 0) {
            throw new IllegalArgumentException("when you add ground overlay, the width and height must greater than 0");
        } else {
            groundOverlay.f1587c = this.e;
            groundOverlay.f = this.h;
            groundOverlay.g = this.i;
            groundOverlay.f1588d = this.f;
            groundOverlay.e = this.g;
            i = 2;
        }
        groundOverlay.f1585a = i;
        groundOverlay.i = this.k;
        return groundOverlay;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        if (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f > 1.0f || f2 < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) {
            return this;
        }
        this.h = f;
        this.i = f2;
        return this;
    }

    public GroundOverlayOptions dimensions(int i) {
        this.f = i;
        this.g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        return this;
    }

    public GroundOverlayOptions dimensions(int i, int i2) {
        this.f = i;
        this.g = i2;
        return this;
    }

    public GroundOverlayOptions extraInfo(Bundle bundle) {
        this.f1591c = bundle;
        return this;
    }

    public float getAnchorX() {
        return this.h;
    }

    public float getAnchorY() {
        return this.i;
    }

    public LatLngBounds getBounds() {
        return this.j;
    }

    public Bundle getExtraInfo() {
        return this.f1591c;
    }

    public int getHeight() {
        return this.g == Integer.MAX_VALUE ? (int) ((this.f * this.f1592d.f1560a.getHeight()) / this.f1592d.f1560a.getWidth()) : this.g;
    }

    public BitmapDescriptor getImage() {
        return this.f1592d;
    }

    public LatLng getPosition() {
        return this.e;
    }

    public float getTransparency() {
        return this.k;
    }

    public int getWidth() {
        return this.f;
    }

    public int getZIndex() {
        return this.f1589a;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("image can not be null");
        }
        this.f1592d = bitmapDescriptor;
        return this;
    }

    public boolean isVisible() {
        return this.f1590b;
    }

    public GroundOverlayOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("position can not be null");
        }
        this.e = latLng;
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("bounds can not be null");
        }
        this.j = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        if (f > 1.0f || f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        this.k = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.f1590b = z;
        return this;
    }

    public GroundOverlayOptions zIndex(int i) {
        this.f1589a = i;
        return this;
    }
}
