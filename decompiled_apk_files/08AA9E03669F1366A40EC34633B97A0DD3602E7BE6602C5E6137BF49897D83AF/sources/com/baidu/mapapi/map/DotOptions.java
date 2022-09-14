package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public final class DotOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    int f1574a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1576c;

    /* renamed from: d  reason: collision with root package name */
    private LatLng f1577d;
    private int e = -16777216;
    private int f = 5;

    /* renamed from: b  reason: collision with root package name */
    boolean f1575b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        Dot dot = new Dot();
        dot.s = this.f1575b;
        dot.r = this.f1574a;
        dot.t = this.f1576c;
        dot.f1572b = this.e;
        dot.f1571a = this.f1577d;
        dot.f1573c = this.f;
        return dot;
    }

    public DotOptions center(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("dot center can not be null");
        }
        this.f1577d = latLng;
        return this;
    }

    public DotOptions color(int i) {
        this.e = i;
        return this;
    }

    public DotOptions extraInfo(Bundle bundle) {
        this.f1576c = bundle;
        return this;
    }

    public LatLng getCenter() {
        return this.f1577d;
    }

    public int getColor() {
        return this.e;
    }

    public Bundle getExtraInfo() {
        return this.f1576c;
    }

    public int getRadius() {
        return this.f;
    }

    public int getZIndex() {
        return this.f1574a;
    }

    public boolean isVisible() {
        return this.f1575b;
    }

    public DotOptions radius(int i) {
        if (i > 0) {
            this.f = i;
        }
        return this;
    }

    public DotOptions visible(boolean z) {
        this.f1575b = z;
        return this;
    }

    public DotOptions zIndex(int i) {
        this.f1574a = i;
        return this;
    }
}
