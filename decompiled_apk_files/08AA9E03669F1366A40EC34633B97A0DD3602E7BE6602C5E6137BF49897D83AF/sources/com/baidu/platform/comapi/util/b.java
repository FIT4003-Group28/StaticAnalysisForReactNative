package com.baidu.platform.comapi.util;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.model.inner.Point;
import com.baidu.platform.comapi.location.CoordinateType;
import com.baidu.platform.comjni.tools.JNITools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static Bundle f2116a = new Bundle();

    /* renamed from: b  reason: collision with root package name */
    static double[] f2117b = {1.289059486E7d, 8362377.87d, 5591021.0d, 3481989.83d, 1678043.12d, 0.0d};

    /* renamed from: c  reason: collision with root package name */
    static double[] f2118c = {7.5E7d, 6.0E7d, 4.5E7d, 3.0E7d, 1.5E7d, 0.0d};

    /* renamed from: d  reason: collision with root package name */
    static double[][] f2119d = {new double[]{1.410526172116255E-8d, 8.98305509648872E-6d, -1.9939833816331d, 200.9824383106796d, -187.2403703815547d, 91.6087516669843d, -23.38765649603339d, 2.57121317296198d, -0.03801003308653d, 1.73379812E7d}, new double[]{-7.435856389565537E-9d, 8.983055097726239E-6d, -0.78625201886289d, 96.32687599759846d, -1.85204757529826d, -59.36935905485877d, 47.40033549296737d, -16.50741931063887d, 2.28786674699375d, 1.026014486E7d}, new double[]{-3.030883460898826E-8d, 8.98305509983578E-6d, 0.30071316287616d, 59.74293618442277d, 7.357984074871d, -25.38371002664745d, 13.45380521110908d, -3.29883767235584d, 0.32710905363475d, 6856817.37d}, new double[]{-1.981981304930552E-8d, 8.983055099779535E-6d, 0.03278182852591d, 40.31678527705744d, 0.65659298677277d, -4.44255534477492d, 0.85341911805263d, 0.12923347998204d, -0.04625736007561d, 4482777.06d}, new double[]{3.09191371068437E-9d, 8.983055096812155E-6d, 6.995724062E-5d, 23.10934304144901d, -2.3663490511E-4d, -0.6321817810242d, -0.00663494467273d, 0.03430082397953d, -0.00466043876332d, 2555164.4d}, new double[]{2.890871144776878E-9d, 8.983055095805407E-6d, -3.068298E-8d, 7.47137025468032d, -3.53937994E-6d, -0.02145144861037d, -1.234426596E-5d, 1.0322952773E-4d, -3.23890364E-6d, 826088.5d}};
    static double[][] e = {new double[]{-0.0015702102444d, 111320.7020616939d, 1.704480524535203E15d, -1.033898737604234E16d, 2.611266785660388E16d, -3.51496691766537E16d, 2.659570071840392E16d, -1.072501245418824E16d, 1.800819912950474E15d, 82.5d}, new double[]{8.277824516172526E-4d, 111320.7020463578d, 6.477955746671607E8d, -4.082003173641316E9d, 1.077490566351142E10d, -1.517187553151559E10d, 1.205306533862167E10d, -5.124939663577472E9d, 9.133119359512032E8d, 67.5d}, new double[]{0.00337398766765d, 111320.7020202162d, 4481351.045890365d, -2.339375119931662E7d, 7.968221547186455E7d, -1.159649932797253E8d, 9.723671115602145E7d, -4.366194633752821E7d, 8477230.501135234d, 52.5d}, new double[]{0.00220636496208d, 111320.7020209128d, 51751.86112841131d, 3796837.749470245d, 992013.7397791013d, -1221952.21711287d, 1340652.697009075d, -620943.6990984312d, 144416.9293806241d, 37.5d}, new double[]{-3.441963504368392E-4d, 111320.7020576856d, 278.2353980772752d, 2485758.690035394d, 6070.750963243378d, 54821.18345352118d, 9540.606633304236d, -2710.55326746645d, 1405.483844121726d, 22.5d}, new double[]{-3.218135878613132E-4d, 111320.7020701615d, 0.00369383431289d, 823725.6402795718d, 0.46104986909093d, 2351.343141331292d, 1.58060784298199d, 8.77738589078284d, 0.37238884252424d, 7.45d}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        double f2120a;

        /* renamed from: b  reason: collision with root package name */
        double f2121b;

        a() {
        }
    }

    public static int a(LatLng latLng, int i) {
        LatLng latLng2 = new LatLng(latLng.latitude + (i / 111000.0d), latLng.longitude);
        GeoPoint a2 = a(latLng);
        GeoPoint a3 = a(latLng2);
        return (int) Math.sqrt(Math.pow(a2.getLatitudeE6() - a3.getLatitudeE6(), 2.0d) + Math.pow(a2.getLongitudeE6() - a3.getLongitudeE6(), 2.0d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r11.f2121b > (-1.0E-6d)) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[EDGE_INSN: B:34:0x0090->B:31:0x0090 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baidu.mapapi.model.LatLng a(com.baidu.mapapi.model.inner.GeoPoint r11) {
        /*
            com.baidu.platform.comapi.util.b$a r0 = new com.baidu.platform.comapi.util.b$a
            r0.<init>()
            double r1 = r11.getLongitudeE6()
            r0.f2120a = r1
            double r1 = r11.getLatitudeE6()
            r0.f2121b = r1
            com.baidu.platform.comapi.util.b$a r11 = new com.baidu.platform.comapi.util.b$a
            r11.<init>()
            double r1 = r0.f2120a
            r11.f2120a = r1
            double r1 = r11.f2120a
            r3 = 4716143987918427390(0x41731bf84578d4fe, double:2.0037508342E7)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r5 = -4507228048936348418(0xc1731bf84578d4fe, double:-2.0037508342E7)
            if (r1 <= 0) goto L2d
            r11.f2120a = r3
            goto L35
        L2d:
            double r1 = r11.f2120a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L35
            r11.f2120a = r5
        L35:
            double r0 = r0.f2121b
            r11.f2121b = r0
            double r0 = r11.f2121b
            r7 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L4f
            double r9 = r11.f2121b
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L4f
        L4c:
            r11.f2121b = r7
            goto L72
        L4f:
            double r7 = r11.f2121b
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L61
            double r0 = r11.f2121b
            r7 = -4706042843746669171(0xbeb0c6f7a0b5ed8d, double:-1.0E-6)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L61
            goto L4c
        L61:
            double r0 = r11.f2121b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6a
            r11.f2121b = r3
            goto L72
        L6a:
            double r0 = r11.f2121b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L72
            r11.f2121b = r5
        L72:
            r0 = 10
            double[] r0 = new double[r0]
            r1 = 0
        L77:
            r2 = 6
            if (r1 >= r2) goto L90
            double r2 = r11.f2121b
            double r2 = java.lang.Math.abs(r2)
            double[] r4 = com.baidu.platform.comapi.util.b.f2117b
            r5 = r4[r1]
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L8d
            double[][] r0 = com.baidu.platform.comapi.util.b.f2119d
            r0 = r0[r1]
            goto L90
        L8d:
            int r1 = r1 + 1
            goto L77
        L90:
            com.baidu.platform.comapi.util.b$a r11 = a(r11, r0)
            com.baidu.mapapi.model.LatLng r0 = new com.baidu.mapapi.model.LatLng
            double r1 = r11.f2121b
            double r3 = r11.f2120a
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.util.b.a(com.baidu.mapapi.model.inner.GeoPoint):com.baidu.mapapi.model.LatLng");
    }

    public static LatLng a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        f2116a.clear();
        f2116a.putString("strkey", str);
        JNITools.TransGeoStr2Pt(f2116a);
        GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
        geoPoint.setLongitudeE6(f2116a.getInt("ptx"));
        geoPoint.setLatitudeE6(f2116a.getInt("pty"));
        return a(geoPoint);
    }

    public static GeoPoint a(LatLng latLng) {
        a aVar = new a();
        double[] dArr = new double[10];
        aVar.f2121b = Math.abs(latLng.latitude * 1000000.0d);
        if (aVar.f2121b < 0.1d) {
            aVar.f2121b = 0.1d;
        }
        int i = 0;
        while (true) {
            if (i >= f2118c.length) {
                break;
            } else if (aVar.f2121b > f2118c[i]) {
                dArr = e[i];
                break;
            } else {
                i++;
            }
        }
        aVar.f2120a = latLng.longitude;
        aVar.f2121b = latLng.latitude;
        a a2 = a(aVar, dArr);
        return new GeoPoint(a2.f2121b, a2.f2120a);
    }

    public static Point a(float f, float f2, String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            str = CoordinateType.BD09LL;
        }
        if (!str.equals(CoordinateType.BD09LL) && !str.equals(CoordinateType.BD09MC) && !str.equals(CoordinateType.GCJ02) && !str.equals(CoordinateType.WGS84)) {
            return null;
        }
        if (str.equals(CoordinateType.BD09MC)) {
            return new Point((int) f, (int) f2);
        }
        Bundle bundle = new Bundle();
        JNITools.CoordinateEncryptEx(f, f2, str, bundle);
        if (bundle.isEmpty()) {
            return null;
        }
        Point point = new Point(0, 0);
        point.setmPtx((int) bundle.getDouble("x"));
        point.setmPty((int) bundle.getDouble("y"));
        return point;
    }

    static a a(a aVar, double[] dArr) {
        a aVar2 = new a();
        int i = 1;
        aVar2.f2120a = dArr[0] + (dArr[1] * Math.abs(aVar.f2120a));
        double abs = Math.abs(aVar.f2121b) / dArr[9];
        aVar2.f2121b = dArr[2] + (dArr[3] * abs) + (dArr[4] * abs * abs) + (dArr[5] * abs * abs * abs) + (dArr[6] * abs * abs * abs * abs) + (dArr[7] * abs * abs * abs * abs * abs) + (dArr[8] * abs * abs * abs * abs * abs * abs);
        aVar2.f2120a *= aVar.f2120a < 0.0d ? -1 : 1;
        double d2 = aVar2.f2121b;
        if (aVar.f2121b < 0.0d) {
            i = -1;
        }
        aVar2.f2121b = d2 * i;
        return aVar2;
    }

    public static LatLng b(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        f2116a.clear();
        f2116a.putString("strkey", str);
        JNITools.TransNodeStr2Pt(f2116a);
        return a(new GeoPoint(f2116a.getDouble("pty"), f2116a.getDouble("ptx")));
    }

    public static Point b(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return a((float) latLng.longitude, (float) latLng.latitude, CoordinateType.BD09LL);
    }

    public static List<LatLng> c(String str) {
        com.baidu.mapapi.model.inner.a a2 = com.baidu.platform.comjni.tools.a.a(str);
        ArrayList arrayList = new ArrayList();
        if (a2 == null || a2.f1771d == null) {
            return null;
        }
        ArrayList<ArrayList<Point>> arrayList2 = a2.f1771d;
        if (arrayList2.size() > 0) {
            ArrayList<Point> arrayList3 = arrayList2.get(0);
            for (int i = 0; i < arrayList3.size(); i++) {
                Point point = arrayList3.get(i);
                arrayList.add(a(new GeoPoint(point.y / 100, point.x / 100)));
            }
        }
        return arrayList;
    }

    public static List<List<LatLng>> d(String str) {
        com.baidu.mapapi.model.inner.a a2 = com.baidu.platform.comjni.tools.a.a(str);
        if (a2 == null || a2.f1771d == null) {
            return null;
        }
        ArrayList<ArrayList<Point>> arrayList = a2.f1771d;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ArrayList<Point>> it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<Point> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Point next = it2.next();
                arrayList3.add(a(new GeoPoint(next.y / 100, next.x / 100)));
            }
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }
}
