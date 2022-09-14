package com.baidu.mapapi.map;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.google.android.gms.common.internal.ImagesContract;
/* loaded from: classes.dex */
public final class TileOverlayOptions {

    /* renamed from: c  reason: collision with root package name */
    private static Bundle f1701c = null;
    private static final String j = "TileOverlayOptions";

    /* renamed from: b  reason: collision with root package name */
    private TileProvider f1703b;
    public int datasource;
    public String urlString;

    /* renamed from: a  reason: collision with root package name */
    private int f1702a = 20971520;

    /* renamed from: d  reason: collision with root package name */
    private int f1704d = 20;
    private int e = 3;
    private int f = 15786414;
    private int g = -20037726;
    private int h = -15786414;
    private int i = 20037726;

    public TileOverlayOptions() {
        f1701c = new Bundle();
        f1701c.putInt("rectr", this.f);
        f1701c.putInt("rectb", this.g);
        f1701c.putInt("rectl", this.h);
        f1701c.putInt("rectt", this.i);
    }

    private TileOverlayOptions a(int i, int i2) {
        this.f1704d = i;
        this.e = i2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        f1701c.putString(ImagesContract.URL, this.urlString);
        f1701c.putInt("datasource", this.datasource);
        f1701c.putInt("maxDisplay", this.f1704d);
        f1701c.putInt("minDisplay", this.e);
        f1701c.putInt("sdktiletmpmax", this.f1702a);
        return f1701c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileOverlay a(BaiduMap baiduMap) {
        return new TileOverlay(baiduMap, this.f1703b);
    }

    public TileOverlayOptions setMaxTileTmp(int i) {
        this.f1702a = i;
        return this;
    }

    public TileOverlayOptions setPositionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("bound can not be null");
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.northeast);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLngBounds.southwest);
        double latitudeE6 = ll2mc.getLatitudeE6();
        double longitudeE6 = ll2mc2.getLongitudeE6();
        double latitudeE62 = ll2mc2.getLatitudeE6();
        double longitudeE62 = ll2mc.getLongitudeE6();
        if (latitudeE6 <= latitudeE62 || longitudeE62 <= longitudeE6) {
            Log.e(j, "bounds is illegal, use default bounds");
            return this;
        }
        f1701c.putInt("rectr", (int) longitudeE62);
        f1701c.putInt("rectb", (int) latitudeE62);
        f1701c.putInt("rectl", (int) longitudeE6);
        f1701c.putInt("rectt", (int) latitudeE6);
        return this;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        String str;
        String str2;
        int maxDisLevel;
        if (tileProvider == null) {
            return null;
        }
        if (!(tileProvider instanceof UrlTileProvider)) {
            if (!(tileProvider instanceof FileTileProvider)) {
                str = j;
                str2 = "tileProvider must be UrlTileProvider or FileTileProvider";
                Log.e(str, str2);
                return null;
            }
            this.datasource = 0;
            this.f1703b = tileProvider;
            maxDisLevel = tileProvider.getMaxDisLevel();
            int minDisLevel = tileProvider.getMinDisLevel();
            if (maxDisLevel <= 21) {
            }
            Log.e(j, "display level is illegal");
            return this;
        }
        this.datasource = 1;
        String tileUrl = ((UrlTileProvider) tileProvider).getTileUrl();
        if (tileUrl == null || "".equals(tileUrl) || !tileUrl.contains("{x}") || !tileUrl.contains("{y}") || !tileUrl.contains("{z}")) {
            str = j;
            str2 = "tile url template is illegal, must contains {x}、{y}、{z}";
            Log.e(str, str2);
            return null;
        }
        this.urlString = tileUrl;
        this.f1703b = tileProvider;
        maxDisLevel = tileProvider.getMaxDisLevel();
        int minDisLevel2 = tileProvider.getMinDisLevel();
        if (maxDisLevel <= 21 || minDisLevel2 < 3) {
            Log.e(j, "display level is illegal");
            return this;
        }
        a(maxDisLevel, minDisLevel2);
        return this;
    }
}
