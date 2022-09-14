package com.baidu.mapapi.map;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.EnumC0135h;
import java.util.List;
/* loaded from: classes.dex */
public final class Polyline extends Overlay {

    /* renamed from: a  reason: collision with root package name */
    int f1662a;

    /* renamed from: b  reason: collision with root package name */
    List<LatLng> f1663b;

    /* renamed from: c  reason: collision with root package name */
    int[] f1664c;

    /* renamed from: d  reason: collision with root package name */
    int[] f1665d;
    int e;
    boolean f;
    boolean g = false;
    boolean h = true;
    BitmapDescriptor i;
    List<BitmapDescriptor> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Polyline() {
        this.q = EnumC0135h.polyline;
    }

    private Bundle a(boolean z) {
        return (z ? BitmapDescriptorFactory.fromAsset("lineDashTexture.png") : this.i).b();
    }

    static void a(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("traffic_array", iArr);
    }

    private Bundle b(boolean z) {
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putInt("total", 1);
            bundle.putBundle("texture_0", BitmapDescriptorFactory.fromAsset("lineDashTexture.png").b());
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        int i = 0;
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            if (this.j.get(i2) != null) {
                bundle2.putBundle("texture_" + String.valueOf(i), this.j.get(i2).b());
                i++;
            }
        }
        bundle2.putInt("total", i);
        return bundle2;
    }

    static void b(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_array", iArr);
        bundle.putInt("total", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a(Bundle bundle) {
        super.a(bundle);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f1663b.get(0));
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("width", this.e);
        Overlay.a(this.f1663b, bundle);
        Overlay.a(this.f1662a, bundle);
        a(this.f1664c, bundle);
        b(this.f1665d, bundle);
        int i = 1;
        if (this.f1664c != null && this.f1664c.length > 0 && this.f1664c.length > this.f1663b.size() - 1) {
            Log.e("baidumapsdk", "the size of textureIndexs is larger than the size of points");
        }
        if (this.f) {
            bundle.putInt("dotline", 1);
        } else {
            bundle.putInt("dotline", 0);
        }
        bundle.putInt("focus", this.g ? 1 : 0);
        try {
            if (this.i != null) {
                bundle.putInt("custom", 1);
                bundle.putBundle("image_info", a(false));
            } else {
                if (this.f) {
                    bundle.putBundle("image_info", a(true));
                }
                bundle.putInt("custom", 0);
            }
            if (this.j != null) {
                bundle.putInt("customlist", 1);
                bundle.putBundle("image_info_list", b(false));
            } else {
                if (this.f && ((this.f1664c != null && this.f1664c.length > 0) || (this.f1665d != null && this.f1665d.length > 0))) {
                    bundle.putBundle("image_info_list", b(true));
                }
                bundle.putInt("customlist", 0);
            }
            if (!this.h) {
                i = 0;
            }
            bundle.putInt("keep", i);
            return bundle;
        } catch (Exception unused) {
            Log.e("baidumapsdk", "load texture resource failed!");
            bundle.putInt("dotline", 0);
            return bundle;
        }
    }

    public int getColor() {
        return this.f1662a;
    }

    public List<LatLng> getPoints() {
        return this.f1663b;
    }

    public int getWidth() {
        return this.e;
    }

    public boolean isDottedLine() {
        return this.f;
    }

    public boolean isFocus() {
        return this.g;
    }

    public void setColor(int i) {
        this.f1662a = i;
        this.listener.b(this);
    }

    public void setDottedLine(boolean z) {
        this.f = z;
        this.listener.b(this);
    }

    public void setFocus(boolean z) {
        this.g = z;
        this.listener.b(this);
    }

    public void setPoints(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("points list can not be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("points count can not less than 2 or more than 10000");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("points list can not contains null");
        }
        this.f1663b = list;
        this.listener.b(this);
    }

    public void setWidth(int i) {
        if (i > 0) {
            this.e = i;
            this.listener.b(this);
        }
    }
}
