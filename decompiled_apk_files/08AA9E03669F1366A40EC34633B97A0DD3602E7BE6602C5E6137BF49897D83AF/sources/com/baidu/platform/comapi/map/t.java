package com.baidu.platform.comapi.map;

import android.os.Handler;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.MessageCenter;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.inner.GeoPoint;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2081a = "t";

    /* renamed from: c  reason: collision with root package name */
    private static t f2082c;

    /* renamed from: b  reason: collision with root package name */
    private com.baidu.platform.comjni.map.basemap.a f2083b;

    /* renamed from: d  reason: collision with root package name */
    private y f2084d;
    private Handler e;

    private t() {
    }

    public static t a() {
        if (f2082c == null) {
            f2082c = new t();
            f2082c.g();
        }
        return f2082c;
    }

    private void g() {
        h();
        this.f2084d = new y();
        this.e = new u(this);
        MessageCenter.registMessage(UIMsg.m_AppUI.V_WM_VDATAENGINE, this.e);
    }

    private void h() {
        EnvironmentUtilities.initAppDirectory(BMapManager.getContext());
        this.f2083b = new com.baidu.platform.comjni.map.basemap.a();
        this.f2083b.a();
        String moduleFileName = SysOSUtil.getModuleFileName();
        String appSDCardPath = EnvironmentUtilities.getAppSDCardPath();
        String appCachePath = EnvironmentUtilities.getAppCachePath();
        String appSecondCachePath = EnvironmentUtilities.getAppSecondCachePath();
        int mapTmpStgMax = EnvironmentUtilities.getMapTmpStgMax();
        int domTmpStgMax = EnvironmentUtilities.getDomTmpStgMax();
        int itsTmpStgMax = EnvironmentUtilities.getItsTmpStgMax();
        String str = SysOSUtil.getDensityDpi() >= 180 ? "/h/" : "/l/";
        String str2 = moduleFileName + "/cfg";
        String str3 = appSDCardPath + "/vmp";
        String str4 = str3 + str;
        String str5 = str3 + str;
        String str6 = appCachePath + "/tmp/";
        this.f2083b.a(str2 + str, str4, str6, appSecondCachePath + "/tmp/", str5, str2 + "/a/", null, str2 + "/idrres/", SysOSUtil.getScreenSizeX(), SysOSUtil.getScreenSizeY(), SysOSUtil.getDensityDpi(), mapTmpStgMax, domTmpStgMax, itsTmpStgMax, 0);
        this.f2083b.f();
    }

    public ArrayList<s> a(String str) {
        String a2;
        JSONArray optJSONArray;
        if (str.equals("") || this.f2083b == null || (a2 = this.f2083b.a(str)) == null || a2.equals("")) {
            return null;
        }
        ArrayList<s> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            if (jSONObject == null || jSONObject.length() == 0 || (optJSONArray = jSONObject.optJSONArray("dataset")) == null) {
                return null;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                s sVar = new s();
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                sVar.f2077a = jSONObject2.optInt("id");
                sVar.f2078b = jSONObject2.optString("name");
                sVar.f2079c = jSONObject2.optInt("mapsize");
                sVar.f2080d = jSONObject2.optInt("cty");
                if (jSONObject2.has("child")) {
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("child");
                    ArrayList<s> arrayList2 = new ArrayList<>();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        s sVar2 = new s();
                        JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                        sVar2.f2077a = optJSONObject.optInt("id");
                        sVar2.f2078b = optJSONObject.optString("name");
                        sVar2.f2079c = optJSONObject.optInt("mapsize");
                        sVar2.f2080d = optJSONObject.optInt("cty");
                        arrayList2.add(sVar2);
                    }
                    sVar.a(arrayList2);
                }
                arrayList.add(sVar);
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void a(x xVar) {
        if (this.f2084d != null) {
            this.f2084d.a(xVar);
        }
    }

    public boolean a(int i) {
        if (this.f2083b == null || i < 0) {
            return false;
        }
        return this.f2083b.b(i);
    }

    public boolean a(boolean z, boolean z2) {
        if (this.f2083b == null) {
            return false;
        }
        return this.f2083b.a(z, z2);
    }

    public void b() {
        MessageCenter.unregistMessage(UIMsg.m_AppUI.V_WM_VDATAENGINE, this.e);
        this.f2083b.b();
        f2082c = null;
    }

    public void b(x xVar) {
        if (this.f2084d != null) {
            this.f2084d.b(xVar);
        }
    }

    public boolean b(int i) {
        if (this.f2083b == null || i < 0) {
            return false;
        }
        return this.f2083b.a(i, false, 0);
    }

    public ArrayList<s> c() {
        if (this.f2083b == null) {
            return null;
        }
        String o = this.f2083b.o();
        ArrayList<s> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = new JSONObject(o).optJSONArray("dataset");
            for (int i = 0; i < optJSONArray.length(); i++) {
                s sVar = new s();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                sVar.f2077a = optJSONObject.optInt("id");
                sVar.f2078b = optJSONObject.optString("name");
                sVar.f2079c = optJSONObject.optInt("mapsize");
                sVar.f2080d = optJSONObject.optInt("cty");
                if (optJSONObject.has("child")) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("child");
                    ArrayList<s> arrayList2 = new ArrayList<>();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        s sVar2 = new s();
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        sVar2.f2077a = optJSONObject2.optInt("id");
                        sVar2.f2078b = optJSONObject2.optString("name");
                        sVar2.f2079c = optJSONObject2.optInt("mapsize");
                        sVar2.f2080d = optJSONObject2.optInt("cty");
                        arrayList2.add(sVar2);
                    }
                    sVar.a(arrayList2);
                }
                arrayList.add(sVar);
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean c(int i) {
        if (this.f2083b == null || i < 0) {
            return false;
        }
        return this.f2083b.b(i, false, 0);
    }

    public ArrayList<s> d() {
        if (this.f2083b == null) {
            return null;
        }
        String a2 = this.f2083b.a("");
        ArrayList<s> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = new JSONObject(a2).optJSONArray("dataset");
            for (int i = 0; i < optJSONArray.length(); i++) {
                s sVar = new s();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                sVar.f2077a = optJSONObject.optInt("id");
                sVar.f2078b = optJSONObject.optString("name");
                sVar.f2079c = optJSONObject.optInt("mapsize");
                sVar.f2080d = optJSONObject.optInt("cty");
                if (optJSONObject.has("child")) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("child");
                    ArrayList<s> arrayList2 = new ArrayList<>();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        s sVar2 = new s();
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        sVar2.f2077a = optJSONObject2.optInt("id");
                        sVar2.f2078b = optJSONObject2.optString("name");
                        sVar2.f2079c = optJSONObject2.optInt("mapsize");
                        sVar2.f2080d = optJSONObject2.optInt("cty");
                        arrayList2.add(sVar2);
                    }
                    sVar.a(arrayList2);
                }
                arrayList.add(sVar);
            }
            return arrayList;
        } catch (JSONException | Exception unused) {
            return null;
        }
    }

    public boolean d(int i) {
        if (this.f2083b == null) {
            return false;
        }
        return this.f2083b.b(0, true, i);
    }

    public ArrayList<w> e() {
        String n;
        if (this.f2083b == null || (n = this.f2083b.n()) == null || n.equals("")) {
            return null;
        }
        ArrayList<w> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(n);
            if (jSONObject.length() == 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("dataset");
            for (int i = 0; i < optJSONArray.length(); i++) {
                w wVar = new w();
                v vVar = new v();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                vVar.f2086a = optJSONObject.optInt("id");
                vVar.f2087b = optJSONObject.optString("name");
                vVar.f2088c = optJSONObject.optString("pinyin");
                vVar.h = optJSONObject.optInt("mapoldsize");
                vVar.i = optJSONObject.optInt("ratio");
                vVar.l = optJSONObject.optInt("status");
                vVar.g = new GeoPoint(optJSONObject.optInt("y"), optJSONObject.optInt("x"));
                if (optJSONObject.optInt("up") == 1) {
                    vVar.j = true;
                } else {
                    vVar.j = false;
                }
                vVar.e = optJSONObject.optInt("lev");
                if (vVar.j) {
                    vVar.k = optJSONObject.optInt("mapsize");
                } else {
                    vVar.k = 0;
                }
                wVar.a(vVar);
                arrayList.add(wVar);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean e(int i) {
        if (this.f2083b == null || i < 0) {
            return false;
        }
        return this.f2083b.b(i, false);
    }

    public boolean f(int i) {
        if (this.f2083b == null || i < 0) {
            return false;
        }
        return this.f2083b.a(i, false);
    }

    public w g(int i) {
        String c2;
        if (this.f2083b == null || i < 0 || (c2 = this.f2083b.c(i)) == null || c2.equals("")) {
            return null;
        }
        w wVar = new w();
        v vVar = new v();
        try {
            JSONObject jSONObject = new JSONObject(c2);
            if (jSONObject.length() == 0) {
                return null;
            }
            vVar.f2086a = jSONObject.optInt("id");
            vVar.f2087b = jSONObject.optString("name");
            vVar.f2088c = jSONObject.optString("pinyin");
            vVar.f2089d = jSONObject.optString("headchar");
            vVar.h = jSONObject.optInt("mapoldsize");
            vVar.i = jSONObject.optInt("ratio");
            vVar.l = jSONObject.optInt("status");
            vVar.g = new GeoPoint(jSONObject.optInt("y"), jSONObject.optInt("x"));
            if (jSONObject.optInt("up") == 1) {
                vVar.j = true;
            } else {
                vVar.j = false;
            }
            vVar.e = jSONObject.optInt("lev");
            if (vVar.j) {
                vVar.k = jSONObject.optInt("mapsize");
            } else {
                vVar.k = 0;
            }
            vVar.f = jSONObject.optInt("ver");
            wVar.a(vVar);
            return wVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
