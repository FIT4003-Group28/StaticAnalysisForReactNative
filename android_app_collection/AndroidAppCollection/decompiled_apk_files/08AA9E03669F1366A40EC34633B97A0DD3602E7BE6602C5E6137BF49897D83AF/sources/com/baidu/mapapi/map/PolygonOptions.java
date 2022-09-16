package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
public final class PolygonOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    int f1658a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1660c;

    /* renamed from: d  reason: collision with root package name */
    private Stroke f1661d;
    private List<LatLng> f;
    private int e = -16777216;

    /* renamed from: b  reason: collision with root package name */
    boolean f1659b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        Polygon polygon = new Polygon();
        polygon.s = this.f1659b;
        polygon.r = this.f1658a;
        polygon.t = this.f1660c;
        if (this.f == null || this.f.size() < 2) {
            throw new IllegalStateException("when you add polyline, you must at least supply 2 points");
        }
        polygon.f1657c = this.f;
        polygon.f1656b = this.e;
        polygon.f1655a = this.f1661d;
        return polygon;
    }

    public PolygonOptions extraInfo(Bundle bundle) {
        this.f1660c = bundle;
        return this;
    }

    public PolygonOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public Bundle getExtraInfo() {
        return this.f1660c;
    }

    public int getFillColor() {
        return this.e;
    }

    public List<LatLng> getPoints() {
        return this.f;
    }

    public Stroke getStroke() {
        return this.f1661d;
    }

    public int getZIndex() {
        return this.f1658a;
    }

    public boolean isVisible() {
        return this.f1659b;
    }

    public PolygonOptions points(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("points list can not be null");
        }
        if (list.size() <= 2) {
            throw new IllegalArgumentException("points count can not less than three");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("points list can not contains null");
        }
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                if (list.get(i) == list.get(i3)) {
                    throw new IllegalArgumentException("points list can not has same points");
                }
            }
            i = i2;
        }
        this.f = list;
        return this;
    }

    public PolygonOptions stroke(Stroke stroke) {
        this.f1661d = stroke;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.f1659b = z;
        return this;
    }

    public PolygonOptions zIndex(int i) {
        this.f1658a = i;
        return this;
    }
}
