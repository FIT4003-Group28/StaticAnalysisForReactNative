package com.baidu.platform.comjni.map.basemap;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.VersionInfo;
import com.baidu.mapapi.common.BaiduMapSDKException;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.platform.comapi.NativeLoader;
import com.baidu.platform.comapi.map.M;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2141a = "a";

    /* renamed from: d  reason: collision with root package name */
    private static List<JNIBaseMap> f2142d = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private long f2143b = 0;

    /* renamed from: c  reason: collision with root package name */
    private JNIBaseMap f2144c;

    static {
        if (!VersionInfo.getApiVersion().equals(M.a())) {
            throw new BaiduMapSDKException("the version of map is not match with base");
        }
        a(BMapManager.getContext());
        NativeLoader.getInstance().loadLibrary(M.b());
    }

    public a() {
        this.f2144c = null;
        this.f2144c = new JNIBaseMap();
    }

    public static int a(long j, int i, int i2, int i3) {
        return JNIBaseMap.MapProc(j, i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:9:0x006e, B:11:0x0095, B:13:0x00ac, B:15:0x00cc, B:20:0x00db, B:22:0x00e1, B:23:0x00e4, B:25:0x0112, B:26:0x0115, B:28:0x0135, B:29:0x0138, B:31:0x0158, B:32:0x015b, B:34:0x017b), top: B:50:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182 A[LOOP:0: B:36:0x017f->B:38:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e A[LOOP:1: B:40:0x018e->B:42:0x0191, LOOP_START, PHI: r9 
      PHI: (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:39:0x018c, B:42:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comjni.map.basemap.a.a(android.content.Context):void");
    }

    public static void b(long j, boolean z) {
        JNIBaseMap.SetMapCustomEnable(j, z);
    }

    public static List<JNIBaseMap> d() {
        return f2142d;
    }

    public int a(int i) {
        return this.f2144c.SetMapControlMode(this.f2143b, i);
    }

    public long a(int i, int i2, String str) {
        return this.f2144c.AddLayer(this.f2143b, i, i2, str);
    }

    public String a(int i, int i2) {
        return this.f2144c.ScrPtToGeoPoint(this.f2143b, i, i2);
    }

    public String a(int i, int i2, int i3, int i4) {
        return this.f2144c.GetNearlyObjID(this.f2143b, i, i2, i3, i4);
    }

    public String a(String str) {
        return this.f2144c.OnSchcityGet(this.f2143b, str);
    }

    public void a(long j, boolean z) {
        this.f2144c.ShowLayers(this.f2143b, j, z);
    }

    public void a(Bundle bundle) {
        this.f2144c.SetMapStatus(this.f2143b, bundle);
    }

    public void a(String str, Bundle bundle) {
        this.f2144c.SaveScreenToLocal(this.f2143b, str, bundle);
    }

    public void a(boolean z) {
        this.f2144c.ShowSatelliteMap(this.f2143b, z);
    }

    public void a(Bundle[] bundleArr) {
        this.f2144c.addOverlayItems(this.f2143b, bundleArr, bundleArr.length);
    }

    public boolean a() {
        this.f2143b = f2142d.size() == 0 ? this.f2144c.Create() : this.f2144c.CreateDuplicate(f2142d.get(0).f2140a);
        this.f2144c.f2140a = this.f2143b;
        f2142d.add(this.f2144c);
        this.f2144c.SetCallback(this.f2143b, null);
        return true;
    }

    public boolean a(int i, boolean z) {
        return this.f2144c.OnRecordReload(this.f2143b, i, z);
    }

    public boolean a(int i, boolean z, int i2) {
        return this.f2144c.OnRecordStart(this.f2143b, i, z, i2);
    }

    public boolean a(long j) {
        return this.f2144c.LayersIsShow(this.f2143b, j);
    }

    public boolean a(String str, String str2) {
        return this.f2144c.SwitchBaseIndoorMapFloor(this.f2143b, str, str2);
    }

    public boolean a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return this.f2144c.Init(this.f2143b, str, str2, str3, str4, str5, str6, str7, str8, i, i2, i3, i4, i5, i6, i7);
    }

    public boolean a(boolean z, boolean z2) {
        return this.f2144c.OnRecordImport(this.f2143b, z, z2);
    }

    public int[] a(int[] iArr, int i, int i2) {
        return this.f2144c.GetScreenBuf(this.f2143b, iArr, i, i2);
    }

    public String b(int i, int i2) {
        return this.f2144c.GeoPtToScrPoint(this.f2143b, i, i2);
    }

    public void b(long j) {
        this.f2144c.UpdateLayers(this.f2143b, j);
    }

    public void b(Bundle bundle) {
        this.f2144c.setMapStatusLimits(this.f2143b, bundle);
    }

    public void b(boolean z) {
        this.f2144c.ShowHotMap(this.f2143b, z);
    }

    public boolean b() {
        this.f2144c.Release(this.f2143b);
        f2142d.remove(this.f2144c);
        return true;
    }

    public boolean b(int i) {
        return this.f2144c.OnRecordAdd(this.f2143b, i);
    }

    public boolean b(int i, boolean z) {
        return this.f2144c.OnRecordRemove(this.f2143b, i, z);
    }

    public boolean b(int i, boolean z, int i2) {
        return this.f2144c.OnRecordSuspend(this.f2143b, i, z, i2);
    }

    public float c(Bundle bundle) {
        return this.f2144c.GetZoomToBound(this.f2143b, bundle);
    }

    public long c() {
        return this.f2143b;
    }

    public String c(int i) {
        return this.f2144c.OnRecordGetAt(this.f2143b, i);
    }

    public void c(boolean z) {
        this.f2144c.ShowTrafficMap(this.f2143b, z);
    }

    public boolean c(long j) {
        return this.f2144c.cleanSDKTileDataCache(this.f2143b, j);
    }

    public void d(long j) {
        this.f2144c.ClearLayer(this.f2143b, j);
    }

    public void d(boolean z) {
        this.f2144c.enableDrawHouseHeight(this.f2143b, z);
    }

    public boolean d(Bundle bundle) {
        return this.f2144c.updateSDKTile(this.f2143b, bundle);
    }

    public String e(long j) {
        return this.f2144c.getCompassPosition(this.f2143b, j);
    }

    public void e() {
        this.f2144c.OnPause(this.f2143b);
    }

    public void e(boolean z) {
        this.f2144c.ShowBaseIndoorMap(this.f2143b, z);
    }

    public boolean e(Bundle bundle) {
        return this.f2144c.addtileOverlay(this.f2143b, bundle);
    }

    public void f() {
        this.f2144c.OnResume(this.f2143b);
    }

    public void f(Bundle bundle) {
        this.f2144c.addOneOverlayItem(this.f2143b, bundle);
    }

    public void g() {
        this.f2144c.OnBackground(this.f2143b);
    }

    public void g(Bundle bundle) {
        this.f2144c.updateOneOverlayItem(this.f2143b, bundle);
    }

    public void h() {
        this.f2144c.OnForeground(this.f2143b);
    }

    public void h(Bundle bundle) {
        this.f2144c.removeOneOverlayItem(this.f2143b, bundle);
    }

    public void i() {
        this.f2144c.ResetImageRes(this.f2143b);
    }

    public Bundle j() {
        return this.f2144c.GetMapStatus(this.f2143b);
    }

    public Bundle k() {
        Bundle mapStatusLimits = this.f2144c.getMapStatusLimits(this.f2143b);
        Log.d("test", "GetMapStatusLimits, maddr: " + this.f2143b + "bundle: " + mapStatusLimits);
        return mapStatusLimits;
    }

    public Bundle l() {
        return this.f2144c.getDrawingMapStatus(this.f2143b);
    }

    public boolean m() {
        return this.f2144c.GetBaiduHotMapCityInfo(this.f2143b);
    }

    public String n() {
        return this.f2144c.OnRecordGetAll(this.f2143b);
    }

    public String o() {
        return this.f2144c.OnHotcityGet(this.f2143b);
    }

    public void p() {
        this.f2144c.PostStatInfo(this.f2143b);
    }

    public boolean q() {
        return this.f2144c.isDrawHouseHeightEnable(this.f2143b);
    }

    public void r() {
        this.f2144c.clearHeatMapLayerCache(this.f2143b);
    }

    public MapBaseIndoorMapInfo s() {
        String str;
        String str2;
        JSONArray optJSONArray;
        String str3 = this.f2144c.getfocusedBaseIndoorMapInfo(this.f2143b);
        if (str3 == null) {
            return null;
        }
        String str4 = new String();
        ArrayList arrayList = new ArrayList(1);
        try {
            JSONObject jSONObject = new JSONObject(str3);
            str = jSONObject.optString("focusindoorid");
            try {
                str2 = jSONObject.optString("curfloor");
                try {
                    optJSONArray = jSONObject.optJSONArray("floorlist");
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    return new MapBaseIndoorMapInfo(str, str2, arrayList);
                }
            } catch (JSONException e2) {
                e = e2;
                str2 = str4;
                e.printStackTrace();
                return new MapBaseIndoorMapInfo(str, str2, arrayList);
            }
        } catch (JSONException e3) {
            e = e3;
            str = "";
        }
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.get(i).toString());
        }
        return new MapBaseIndoorMapInfo(str, str2, arrayList);
    }

    public boolean t() {
        return this.f2144c.IsBaseIndoorMapMode(this.f2143b);
    }
}
