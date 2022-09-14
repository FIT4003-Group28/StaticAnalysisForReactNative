package com.baidu.platform.comapi.search;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.baidu.mapapi.MessageCenter;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.model.inner.Point;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2100a = "d";

    /* renamed from: b  reason: collision with root package name */
    private com.baidu.platform.comjni.map.search.a f2101b;

    /* renamed from: c  reason: collision with root package name */
    private long f2102c;

    /* renamed from: d  reason: collision with root package name */
    private c f2103d;
    private Handler e;
    private int f = 10;
    private Bundle g = null;

    public d() {
        this.f2101b = null;
        this.f2103d = null;
        this.e = null;
        this.f2101b = new com.baidu.platform.comjni.map.search.a();
        this.f2102c = this.f2101b.a();
        this.f2103d = new c();
        this.e = new e(this);
        MessageCenter.registMessage(UIMsg.m_AppUI.MSG_APP_DATA_OK, this.e);
        this.f2103d.a(this);
    }

    private Bundle a(a aVar) {
        if (aVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", aVar.f2093a);
        bundle.putString("uid", aVar.e);
        if (aVar.f2094b != null) {
            bundle.putInt("x", aVar.f2094b.getmPtx());
            bundle.putInt("y", aVar.f2094b.getmPty());
        }
        bundle.putString("keyword", aVar.f2096d);
        return bundle;
    }

    private Bundle c() {
        if (this.g == null) {
            this.g = new Bundle();
        } else {
            this.g.clear();
        }
        return this.g;
    }

    public void a() {
        MessageCenter.unregistMessage(UIMsg.m_AppUI.MSG_APP_DATA_OK, this.e);
        this.f2101b.b();
        this.f2103d.a();
        this.e = null;
        this.f2101b = null;
        this.g = null;
        this.f2103d = null;
        this.f2102c = 0L;
    }

    public void a(int i) {
        if (i <= 0 || i > 50) {
            return;
        }
        this.f = i;
    }

    public void a(b bVar) {
        this.f2103d.a(bVar);
    }

    public boolean a(Point point) {
        if (point == null) {
            return false;
        }
        int i = point.getmPty();
        return this.f2101b.a(point.getmPtx(), i);
    }

    public boolean a(Point point, Point point2, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        if (this.f2101b == null) {
            return false;
        }
        Bundle c2 = c();
        if (i3 == 3) {
            c2.putInt("cityCode", i4);
            c2.putInt("pn", i5);
        } else {
            if (i >= 0) {
                c2.putInt("startCode", i);
            }
            if (i >= 0) {
                c2.putInt("endCode", i2);
            }
        }
        c2.putInt("tn", i3);
        if (point != null) {
            c2.putInt("startX", point.getmPtx());
            c2.putInt("startY", point.getmPty());
        }
        if (point2 != null) {
            c2.putInt("endX", point2.getmPtx());
            c2.putInt("endY", point2.getmPty());
        }
        c2.putString("strName", str);
        c2.putString("endName", str2);
        return this.f2101b.i(c2);
    }

    public boolean a(Point point, String str, String str2) {
        if (point == null || str == null || str2 == null) {
            return false;
        }
        return this.f2101b.a(point.getmPtx(), point.getmPty(), str, str2);
    }

    public boolean a(a aVar, a aVar2, String str, MapBound mapBound, int i, int i2, Map<String, Object> map) {
        if (str == null || str.equals("")) {
            return false;
        }
        Bundle c2 = c();
        Bundle a2 = a(aVar);
        Bundle a3 = a(aVar2);
        if (a2 == null || a3 == null) {
            return false;
        }
        c2.putBundle("start", a2);
        c2.putBundle("end", a3);
        if (i2 < 3 || i2 > 6) {
            return false;
        }
        c2.putInt("strategy", i2);
        c2.putString("cityid", str);
        if (mapBound != null && mapBound.ptLB != null && mapBound.ptRT != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("level", i);
            bundle.putInt("ll_x", mapBound.ptLB.getmPtx());
            bundle.putInt("ll_y", mapBound.ptLB.getmPty());
            bundle.putInt("ru_x", mapBound.ptRT.getmPtx());
            bundle.putInt("ru_y", mapBound.ptRT.getmPty());
            c2.putBundle("mapbound", bundle);
        }
        if (map != null) {
            Bundle bundle2 = new Bundle();
            for (String str2 : map.keySet()) {
                bundle2.putString(str2.toString(), map.get(str2).toString());
            }
            c2.putBundle("extparams", bundle2);
        }
        return this.f2101b.d(c2);
    }

    public boolean a(a aVar, a aVar2, String str, String str2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        if (aVar.f2095c == null && (aVar.f2096d == null || aVar.f2096d.equals(""))) {
            return false;
        }
        if (aVar2.f2095c == null && (aVar2.f2096d == null || aVar2.f2096d.equals(""))) {
            return false;
        }
        Bundle c2 = c();
        c2.putInt("starttype", aVar.f2093a);
        if (aVar.f2095c != null) {
            c2.putDouble("startptx", aVar.f2095c.longitude);
            c2.putDouble("startpty", aVar.f2095c.latitude);
        }
        c2.putString("startkeyword", aVar.f2096d);
        c2.putString("startcity", str);
        c2.putInt("endtype", aVar2.f2093a);
        if (aVar2.f2095c != null) {
            c2.putDouble("endptx", aVar2.f2095c.longitude);
            c2.putDouble("endpty", aVar2.f2095c.latitude);
        }
        c2.putString("endkeyword", aVar2.f2096d);
        c2.putString("endcity", str2);
        return this.f2101b.g(c2);
    }

    public boolean a(a aVar, a aVar2, String str, String str2, String str3, MapBound mapBound, int i, int i2, int i3, ArrayList<f> arrayList, Map<String, Object> map) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        if (aVar.f2094b == null && (str2 == null || str2.equals(""))) {
            return false;
        }
        if (aVar2.f2094b == null && (str3 == null || str3.equals(""))) {
            return false;
        }
        Bundle c2 = c();
        c2.putInt("starttype", aVar.f2093a);
        if (aVar.f2094b != null) {
            c2.putInt("startptx", aVar.f2094b.getmPtx());
            c2.putInt("startpty", aVar.f2094b.getmPty());
        }
        c2.putString("startkeyword", aVar.f2096d);
        c2.putString("startuid", aVar.e);
        c2.putInt("endtype", aVar2.f2093a);
        if (aVar2.f2094b != null) {
            c2.putInt("endptx", aVar2.f2094b.getmPtx());
            c2.putInt("endpty", aVar2.f2094b.getmPty());
        }
        c2.putString("endkeyword", aVar2.f2096d);
        c2.putString("enduid", aVar2.e);
        c2.putInt("level", i);
        if (mapBound != null && mapBound.ptLB != null && mapBound.ptRT != null) {
            c2.putInt("ll_x", mapBound.ptLB.getmPtx());
            c2.putInt("ll_y", mapBound.ptLB.getmPty());
            c2.putInt("ru_x", mapBound.ptRT.getmPtx());
            c2.putInt("ru_y", mapBound.ptRT.getmPty());
        }
        c2.putInt("strategy", i2);
        c2.putString("cityid", str);
        c2.putString("st_cityid", str2);
        c2.putString("en_cityid", str3);
        c2.putInt("traffic", i3);
        if (arrayList != null) {
            int size = arrayList.size();
            String str4 = "";
            String str5 = "";
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (arrayList.get(i5).f2105a != null) {
                        jSONObject.put("type", 1);
                    } else {
                        jSONObject.put("type", 2);
                    }
                    jSONObject.put("keyword", arrayList.get(i5).f2106b);
                    if (arrayList.get(i5).f2105a != null) {
                        jSONObject.put("xy", String.valueOf(arrayList.get(i5).f2105a.x) + "," + String.valueOf(arrayList.get(i5).f2105a.y));
                    }
                    String str6 = str5 + arrayList.get(i5).f2107c;
                    try {
                        String str7 = str4 + jSONObject.toString();
                        if (i4 != size - 1) {
                            try {
                                str4 = str7 + "|";
                                str5 = str6 + "|";
                            } catch (JSONException e) {
                                e = e;
                                str4 = str7;
                                str5 = str6;
                                e.printStackTrace();
                            }
                        } else {
                            str4 = str7;
                            str5 = str6;
                        }
                        i4++;
                    } catch (JSONException e2) {
                        e = e2;
                    }
                } catch (JSONException e3) {
                    e = e3;
                }
            }
            c2.putString("wp", str4);
            c2.putString("wpc", str5);
        }
        if (map != null) {
            Bundle bundle = new Bundle();
            for (String str8 : map.keySet()) {
                bundle.putString(str8.toString(), map.get(str8).toString());
            }
            c2.putBundle("extparams", bundle);
        }
        return this.f2101b.e(c2);
    }

    public boolean a(a aVar, a aVar2, String str, String str2, String str3, MapBound mapBound, int i, Map<String, Object> map) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        if (aVar.f2094b == null && (str2 == null || str2.equals(""))) {
            return false;
        }
        if (aVar2.f2094b == null && (str3 == null || str3.equals(""))) {
            return false;
        }
        Bundle c2 = c();
        c2.putInt("starttype", aVar.f2093a);
        if (aVar.f2094b != null) {
            c2.putInt("startptx", aVar.f2094b.getmPtx());
            c2.putInt("startpty", aVar.f2094b.getmPty());
        }
        c2.putString("startkeyword", aVar.f2096d);
        c2.putString("startuid", aVar.e);
        c2.putInt("endtype", aVar2.f2093a);
        if (aVar2.f2094b != null) {
            c2.putInt("endptx", aVar2.f2094b.getmPtx());
            c2.putInt("endpty", aVar2.f2094b.getmPty());
        }
        c2.putString("endkeyword", aVar2.f2096d);
        c2.putString("enduid", aVar2.e);
        c2.putInt("level", i);
        if (mapBound != null && mapBound.ptLB != null && mapBound.ptRT != null) {
            c2.putInt("ll_x", mapBound.ptLB.getmPtx());
            c2.putInt("ll_y", mapBound.ptLB.getmPty());
            c2.putInt("ru_x", mapBound.ptRT.getmPtx());
            c2.putInt("ru_y", mapBound.ptRT.getmPty());
        }
        c2.putString("cityid", str);
        c2.putString("st_cityid", str2);
        c2.putString("en_cityid", str3);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (String str4 : map.keySet()) {
                bundle.putString(str4.toString(), map.get(str4).toString());
            }
            c2.putBundle("extparams", bundle);
        }
        return this.f2101b.f(c2);
    }

    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() != 0 && trim.length() <= 99) {
            return this.f2101b.a(trim);
        }
        return false;
    }

    public boolean a(String str, int i, int i2, int i3, MapBound mapBound, MapBound mapBound2, Map<String, Object> map, int i4) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() == 0 || trim.length() > 99) {
            return false;
        }
        Bundle c2 = c();
        c2.putString("keyword", trim);
        c2.putInt("pagenum", i2);
        c2.putInt("count", this.f);
        c2.putInt("cityid", i);
        c2.putInt("level", i3);
        c2.putInt("sortType", i4);
        if (mapBound2 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("ll_x", mapBound2.ptLB.getmPtx());
            bundle.putInt("ll_y", mapBound2.ptLB.getmPty());
            bundle.putInt("ru_x", mapBound2.ptRT.getmPtx());
            bundle.putInt("ru_y", mapBound2.ptRT.getmPty());
            c2.putBundle("mapbound", bundle);
        }
        if (mapBound != null) {
            c2.putInt("ll_x", mapBound.ptLB.getmPtx());
            c2.putInt("ll_y", mapBound.ptLB.getmPty());
            c2.putInt("ru_x", mapBound.ptRT.getmPtx());
            c2.putInt("ru_y", mapBound.ptRT.getmPty());
            c2.putInt("loc_x", (mapBound.ptLB.getmPtx() + mapBound.ptRT.getmPtx()) / 2);
            c2.putInt("loc_y", (mapBound.ptLB.getmPty() + mapBound.ptRT.getmPty()) / 2);
        }
        if (map != null) {
            Bundle bundle2 = new Bundle();
            for (String str2 : map.keySet()) {
                bundle2.putString(str2.toString(), map.get(str2).toString());
            }
            c2.putBundle("extparams", bundle2);
        }
        return this.f2101b.b(c2);
    }

    public boolean a(String str, int i, int i2, MapBound mapBound, int i3, Point point, Map<String, Object> map) {
        if (mapBound == null || str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() == 0 || trim.length() > 99) {
            return false;
        }
        Bundle c2 = c();
        c2.putString("keyword", trim);
        c2.putInt("pagenum", i2);
        c2.putInt("count", this.f);
        c2.putString("cityid", String.valueOf(i));
        c2.putInt("level", i3);
        if (mapBound != null) {
            c2.putInt("ll_x", mapBound.ptLB.getmPtx());
            c2.putInt("ll_y", mapBound.ptLB.getmPty());
            c2.putInt("ru_x", mapBound.ptRT.getmPtx());
            c2.putInt("ru_y", mapBound.ptRT.getmPty());
        }
        if (point != null) {
            c2.putInt("loc_x", point.x);
            c2.putInt("loc_y", point.y);
        }
        if (map != null) {
            Bundle bundle = new Bundle();
            for (String str2 : map.keySet()) {
                bundle.putString(str2.toString(), map.get(str2).toString());
            }
            c2.putBundle("extparams", bundle);
        }
        return this.f2101b.j(c2);
    }

    public boolean a(String str, int i, String str2, MapBound mapBound, int i2, Point point) {
        if (str == null) {
            return false;
        }
        if (i != 0 && i != 2) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() == 0 || trim.length() > 99) {
            return false;
        }
        Bundle c2 = c();
        c2.putString("keyword", str);
        c2.putInt("type", i);
        c2.putString("cityid", str2);
        Bundle bundle = new Bundle();
        bundle.putInt("level", i2);
        c2.putBundle("mapbound", bundle);
        if (point != null) {
            c2.putInt("loc_x", point.x);
            c2.putInt("loc_y", point.y);
        }
        return this.f2101b.h(c2);
    }

    public boolean a(String str, String str2) {
        if (str2 == null || str == null || str.equals("")) {
            return false;
        }
        String trim = str2.trim();
        if (trim.length() != 0 && trim.length() <= 99) {
            return this.f2101b.a(str, trim);
        }
        return false;
    }

    public boolean a(String str, String str2, int i, int i2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("bid", str);
        bundle.putString("wd", str2);
        bundle.putInt("currentPage", i);
        bundle.putInt("pageSize", i2);
        if (str3 != null && str3.length() > 0) {
            bundle.putString("floor", str3);
        }
        return this.f2101b.c(bundle);
    }

    public boolean a(String str, String str2, int i, MapBound mapBound, int i2, Map<String, Object> map) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() == 0 || trim.length() > 99) {
            return false;
        }
        Bundle c2 = c();
        c2.putString("keyword", trim);
        c2.putInt("pagenum", i);
        c2.putInt("count", this.f);
        c2.putString("cityid", str2);
        c2.putInt("level", i2);
        if (mapBound != null) {
            c2.putInt("ll_x", mapBound.ptLB.getmPtx());
            c2.putInt("ll_y", mapBound.ptLB.getmPty());
            c2.putInt("ru_x", mapBound.ptRT.getmPtx());
            c2.putInt("ru_y", mapBound.ptRT.getmPty());
        }
        if (map != null) {
            Bundle bundle = new Bundle();
            for (String str3 : map.keySet()) {
                bundle.putString(str3.toString(), map.get(str3).toString());
            }
            c2.putBundle("extparams", bundle);
        }
        return this.f2101b.a(c2);
    }

    public int b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(int i) {
        String a2 = this.f2101b.a(i);
        if (a2 == null || a2.trim().length() > 0) {
            return a2;
        }
        return null;
    }

    public boolean b(String str) {
        if (str == null) {
            return false;
        }
        return this.f2101b.b(str);
    }

    public boolean b(String str, String str2) {
        return this.f2101b.b(str, str2);
    }

    public boolean c(String str, String str2) {
        if (this.f2101b != null && !TextUtils.isEmpty(str)) {
            return this.f2101b.c(str, str2);
        }
        return false;
    }
}
