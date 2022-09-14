package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public final class ArcOptions extends OverlayOptions {

    /* renamed from: d  reason: collision with root package name */
    private static final String f1546d = "ArcOptions";

    /* renamed from: a  reason: collision with root package name */
    int f1547a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1549c;
    private LatLng g;
    private LatLng h;
    private LatLng i;
    private int e = -16777216;
    private int f = 5;

    /* renamed from: b  reason: collision with root package name */
    boolean f1548b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        Arc arc = new Arc();
        arc.s = this.f1548b;
        arc.r = this.f1547a;
        arc.t = this.f1549c;
        arc.f1542a = this.e;
        arc.f1543b = this.f;
        arc.f1544c = this.g;
        arc.f1545d = this.h;
        arc.e = this.i;
        return arc;
    }

    public ArcOptions color(int i) {
        this.e = i;
        return this;
    }

    public ArcOptions extraInfo(Bundle bundle) {
        this.f1549c = bundle;
        return this;
    }

    public int getColor() {
        return this.e;
    }

    public LatLng getEndPoint() {
        return this.i;
    }

    public Bundle getExtraInfo() {
        return this.f1549c;
    }

    public LatLng getMiddlePoint() {
        return this.h;
    }

    public LatLng getStartPoint() {
        return this.g;
    }

    public int getWidth() {
        return this.f;
    }

    public int getZIndex() {
        return this.f1547a;
    }

    public boolean isVisible() {
        return this.f1548b;
    }

    public ArcOptions points(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new IllegalArgumentException("start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new IllegalArgumentException("start and middle and end points can not be same");
        }
        this.g = latLng;
        this.h = latLng2;
        this.i = latLng3;
        return this;
    }

    public ArcOptions visible(boolean z) {
        this.f1548b = z;
        return this;
    }

    public ArcOptions width(int i) {
        if (i > 0) {
            this.f = i;
        }
        return this;
    }

    public ArcOptions zIndex(int i) {
        this.f1547a = i;
        return this;
    }
}
