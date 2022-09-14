package com.BaiduMaps;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;
/* compiled from: BaiduUtil.java */
/* loaded from: classes.dex */
public class g {
    public static LatLng a(double d2, double d3) {
        CoordinateConverter coordinateConverter = new CoordinateConverter();
        coordinateConverter.coord(new LatLng(d2, d3));
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        return coordinateConverter.convert();
    }
}
