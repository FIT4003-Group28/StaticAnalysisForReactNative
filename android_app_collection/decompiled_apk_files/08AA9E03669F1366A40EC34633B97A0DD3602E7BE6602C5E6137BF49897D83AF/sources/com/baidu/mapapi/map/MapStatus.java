package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.D;
/* loaded from: classes.dex */
public final class MapStatus implements Parcelable {
    public static final Parcelable.Creator<MapStatus> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    D f1618a;

    /* renamed from: b  reason: collision with root package name */
    private double f1619b;
    public final LatLngBounds bound;

    /* renamed from: c  reason: collision with root package name */
    private double f1620c;
    public final float overlook;
    public final float rotate;
    public final LatLng target;
    public final Point targetScreen;
    public final float zoom;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private float f1621a;

        /* renamed from: b  reason: collision with root package name */
        private LatLng f1622b;

        /* renamed from: c  reason: collision with root package name */
        private float f1623c;

        /* renamed from: d  reason: collision with root package name */
        private float f1624d;
        private Point e;
        private LatLngBounds f;
        private double g;
        private double h;

        public Builder() {
            this.f1621a = -2.14748365E9f;
            this.f1622b = null;
            this.f1623c = -2.14748365E9f;
            this.f1624d = -2.14748365E9f;
            this.e = null;
            this.f = null;
            this.g = 0.0d;
            this.h = 0.0d;
        }

        public Builder(MapStatus mapStatus) {
            this.f1621a = -2.14748365E9f;
            this.f1622b = null;
            this.f1623c = -2.14748365E9f;
            this.f1624d = -2.14748365E9f;
            this.e = null;
            this.f = null;
            this.g = 0.0d;
            this.h = 0.0d;
            this.f1621a = mapStatus.rotate;
            this.f1622b = mapStatus.target;
            this.f1623c = mapStatus.overlook;
            this.f1624d = mapStatus.zoom;
            this.e = mapStatus.targetScreen;
            this.g = mapStatus.a();
            this.h = mapStatus.b();
        }

        public MapStatus build() {
            return new MapStatus(this.f1621a, this.f1622b, this.f1623c, this.f1624d, this.e, this.f);
        }

        public Builder overlook(float f) {
            this.f1623c = f;
            return this;
        }

        public Builder rotate(float f) {
            this.f1621a = f;
            return this;
        }

        public Builder target(LatLng latLng) {
            this.f1622b = latLng;
            return this;
        }

        public Builder targetScreen(Point point) {
            this.e = point;
            return this;
        }

        public Builder zoom(float f) {
            this.f1624d = f;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapStatus(float f, LatLng latLng, float f2, float f3, Point point, double d2, double d3, LatLngBounds latLngBounds) {
        this.rotate = f;
        this.target = latLng;
        this.overlook = f2;
        this.zoom = f3;
        this.targetScreen = point;
        this.f1619b = d2;
        this.f1620c = d3;
        this.bound = latLngBounds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapStatus(float f, LatLng latLng, float f2, float f3, Point point, LatLngBounds latLngBounds) {
        this.rotate = f;
        this.target = latLng;
        this.overlook = f2;
        this.zoom = f3;
        this.targetScreen = point;
        if (this.target != null) {
            this.f1619b = CoordUtil.ll2mc(this.target).getLongitudeE6();
            this.f1620c = CoordUtil.ll2mc(this.target).getLatitudeE6();
        }
        this.bound = latLngBounds;
    }

    MapStatus(float f, LatLng latLng, float f2, float f3, Point point, D d2, double d3, double d4, LatLngBounds latLngBounds) {
        this.rotate = f;
        this.target = latLng;
        this.overlook = f2;
        this.zoom = f3;
        this.targetScreen = point;
        this.f1618a = d2;
        this.f1619b = d3;
        this.f1620c = d4;
        this.bound = latLngBounds;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MapStatus(Parcel parcel) {
        this.rotate = parcel.readFloat();
        this.target = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.overlook = parcel.readFloat();
        this.zoom = parcel.readFloat();
        this.targetScreen = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.bound = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        this.f1619b = parcel.readDouble();
        this.f1620c = parcel.readDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MapStatus a(D d2) {
        if (d2 == null) {
            return null;
        }
        float f = d2.f2027b;
        double d3 = d2.e;
        double d4 = d2.f2029d;
        LatLng mc2ll = CoordUtil.mc2ll(new GeoPoint(d3, d4));
        float f2 = d2.f2028c;
        float f3 = d2.f2026a;
        Point point = new Point(d2.f, d2.g);
        LatLng mc2ll2 = CoordUtil.mc2ll(new GeoPoint(d2.k.e.y, d2.k.e.x));
        LatLng mc2ll3 = CoordUtil.mc2ll(new GeoPoint(d2.k.f.y, d2.k.f.x));
        LatLng mc2ll4 = CoordUtil.mc2ll(new GeoPoint(d2.k.h.y, d2.k.h.x));
        LatLng mc2ll5 = CoordUtil.mc2ll(new GeoPoint(d2.k.g.y, d2.k.g.x));
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(mc2ll2);
        builder.include(mc2ll3);
        builder.include(mc2ll4);
        builder.include(mc2ll5);
        return new MapStatus(f, mc2ll, f2, f3, point, d2, d4, d3, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double a() {
        return this.f1619b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double b() {
        return this.f1620c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D b(D d2) {
        if (this.rotate != -2.14748365E9f) {
            d2.f2027b = (int) this.rotate;
        }
        if (this.zoom != -2.14748365E9f) {
            d2.f2026a = this.zoom;
        }
        if (this.overlook != -2.14748365E9f) {
            d2.f2028c = (int) this.overlook;
        }
        if (this.target != null) {
            CoordUtil.ll2mc(this.target);
            d2.f2029d = this.f1619b;
            d2.e = this.f1620c;
        }
        if (this.targetScreen != null) {
            d2.f = this.targetScreen.x;
            d2.g = this.targetScreen.y;
        }
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D c() {
        return b(new D());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.target != null) {
            sb.append("target lat: " + this.target.latitude + "\n");
            sb.append("target lng: " + this.target.longitude + "\n");
        }
        if (this.targetScreen != null) {
            sb.append("target screen x: " + this.targetScreen.x + "\n");
            sb.append("target screen y: " + this.targetScreen.y + "\n");
        }
        sb.append("zoom: " + this.zoom + "\n");
        sb.append("rotate: " + this.rotate + "\n");
        sb.append("overlook: " + this.overlook + "\n");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.rotate);
        parcel.writeParcelable(this.target, i);
        parcel.writeFloat(this.overlook);
        parcel.writeFloat(this.zoom);
        parcel.writeParcelable(this.targetScreen, i);
        parcel.writeParcelable(this.bound, i);
        parcel.writeDouble(this.f1619b);
        parcel.writeDouble(this.f1620c);
    }
}
