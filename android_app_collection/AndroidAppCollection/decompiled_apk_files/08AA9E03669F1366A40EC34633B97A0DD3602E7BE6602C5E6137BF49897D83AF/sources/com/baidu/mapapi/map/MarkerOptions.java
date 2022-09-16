package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class MarkerOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    int f1645a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1647c;

    /* renamed from: d  reason: collision with root package name */
    private LatLng f1648d;
    private BitmapDescriptor e;
    private float j;
    private String k;
    private int l;
    private ArrayList<BitmapDescriptor> n;
    private float f = 0.5f;
    private float g = 1.0f;
    private boolean h = true;
    private boolean i = false;
    private boolean m = false;
    private int o = 20;
    private float p = 1.0f;
    private int q = MarkerAnimateType.none.ordinal();

    /* renamed from: b  reason: collision with root package name */
    boolean f1646b = true;

    /* loaded from: classes.dex */
    public enum MarkerAnimateType {
        none,
        drop,
        grow
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerOptions a(int i) {
        this.l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        Marker marker = new Marker();
        marker.s = this.f1646b;
        marker.r = this.f1645a;
        marker.t = this.f1647c;
        if (this.f1648d == null) {
            throw new IllegalStateException("when you add marker, you must set the position");
        }
        marker.f1641a = this.f1648d;
        if (this.e == null && this.n == null) {
            throw new IllegalStateException("when you add marker, you must set the icon or icons");
        }
        marker.f1642b = this.e;
        marker.f1643c = this.f;
        marker.f1644d = this.g;
        marker.e = this.h;
        marker.f = this.i;
        marker.g = this.j;
        marker.h = this.k;
        marker.i = this.l;
        marker.j = this.m;
        marker.n = this.n;
        marker.o = this.o;
        marker.l = this.p;
        marker.m = this.q;
        return marker;
    }

    public MarkerOptions alpha(float f) {
        if (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            this.p = 1.0f;
            return this;
        }
        this.p = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        if (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f > 1.0f || f2 < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) {
            return this;
        }
        this.f = f;
        this.g = f2;
        return this;
    }

    public MarkerOptions animateType(MarkerAnimateType markerAnimateType) {
        if (markerAnimateType == null) {
            markerAnimateType = MarkerAnimateType.none;
        }
        this.q = markerAnimateType.ordinal();
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.i = z;
        return this;
    }

    public MarkerOptions extraInfo(Bundle bundle) {
        this.f1647c = bundle;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.m = z;
        return this;
    }

    public float getAlpha() {
        return this.p;
    }

    public float getAnchorX() {
        return this.f;
    }

    public float getAnchorY() {
        return this.g;
    }

    public MarkerAnimateType getAnimateType() {
        switch (this.q) {
            case 1:
                return MarkerAnimateType.drop;
            case 2:
                return MarkerAnimateType.grow;
            default:
                return MarkerAnimateType.none;
        }
    }

    public Bundle getExtraInfo() {
        return this.f1647c;
    }

    public BitmapDescriptor getIcon() {
        return this.e;
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        return this.n;
    }

    public int getPeriod() {
        return this.o;
    }

    public LatLng getPosition() {
        return this.f1648d;
    }

    public float getRotate() {
        return this.j;
    }

    public String getTitle() {
        return this.k;
    }

    public int getZIndex() {
        return this.f1645a;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("marker's icon can not be null");
        }
        this.e = bitmapDescriptor;
        return this;
    }

    public MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("marker's icons can not be null");
        }
        if (arrayList.size() == 0) {
            return this;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null || arrayList.get(i).f1560a == null) {
                return this;
            }
        }
        this.n = arrayList;
        return this;
    }

    public boolean isDraggable() {
        return this.i;
    }

    public boolean isFlat() {
        return this.m;
    }

    public boolean isPerspective() {
        return this.h;
    }

    public boolean isVisible() {
        return this.f1646b;
    }

    public MarkerOptions period(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("marker's period must be greater than zero ");
        }
        this.o = i;
        return this;
    }

    public MarkerOptions perspective(boolean z) {
        this.h = z;
        return this;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("marker's position can not be null");
        }
        this.f1648d = latLng;
        return this;
    }

    public MarkerOptions rotate(float f) {
        while (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) {
            f += 360.0f;
        }
        this.j = f % 360.0f;
        return this;
    }

    public MarkerOptions title(String str) {
        this.k = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.f1646b = z;
        return this;
    }

    public MarkerOptions zIndex(int i) {
        this.f1645a = i;
        return this;
    }
}
