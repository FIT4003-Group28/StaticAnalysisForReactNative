package defpackage;

import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pob  reason: default package */
/* loaded from: classes7.dex */
public final class pob implements pns {
    static final float b = (float) Math.sin(Math.toRadians(0.8600000143051147d));
    public final dbsg<String> c;
    public final dbsg<String> d;
    public final dcdc<String> e;
    public final boolean f;
    public final dcdn<String, String> g;
    public final dcdn<pnu, String> h;
    public final dbsg<String> i;
    public final dbsg<Integer> j;
    private final int k;
    private final dcdn<String, String> l;
    private final dbsg<Integer> m;
    private final dbsg<Integer> n;
    private final dbsg<Float> o;
    private final dbsg<Float> p;
    private final dcdn<String, Float> q;

    public pob(JSONObject jSONObject, dbsg<JSONObject> dbsgVar, int i) {
        dcdc<String> f;
        dbsg<String> dbsgVar2;
        dbsg dbsgVar3;
        this.k = i;
        this.d = pod.c(jSONObject, "archiveFilename");
        this.c = pod.c(jSONObject, "name");
        JSONObject optJSONObject = jSONObject.optJSONObject("icon");
        dcdg dcdgVar = new dcdg();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!optString.isEmpty()) {
                    dcdgVar.f(next, optString);
                }
            }
        }
        this.l = dcdgVar.b();
        this.j = pod.a(jSONObject, "chevronVeType");
        this.m = pod.a(jSONObject, "buttonVeType");
        this.n = pod.b(jSONObject, "animationDurationMs", -1);
        this.o = pod.d(jSONObject, "scale");
        HashMap hashMap = new HashMap();
        Matcher matcher = Pattern.compile("rot[XYZ]\\s+(-?\\d+(\\.\\d*)?)").matcher(jSONObject.optString("transform"));
        while (matcher.find()) {
            List<String> i2 = dbtm.d("\\s+").i(matcher.group());
            hashMap.put(i2.get(0).substring(3, 4), Float.valueOf(Float.parseFloat(i2.get(1))));
        }
        this.q = dcdn.r(hashMap);
        this.p = pod.d(jSONObject, "turnThreshold");
        String optString2 = jSONObject.optString("filename");
        this.f = optString2.endsWith(".fbx");
        JSONObject jSONObject2 = null;
        JSONObject optJSONObject2 = (!dbsgVar.a() || !dbsgVar.b().optString("modelName").equals(jSONObject.optString("name"))) ? null : dbsgVar.b().optJSONObject("modelVisibility");
        dccx dccxVar = new dccx();
        if (optJSONObject2 == null) {
            if (!dbsj.d(optString2)) {
                dccxVar.g(optString2);
            }
            f = dccxVar.f();
        } else {
            if (!dbsj.d(optString2) && !optJSONObject2.optString(optString2).equals("gone")) {
                dccxVar.g(optString2);
            }
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (optJSONObject2.optString(next2).equals("visible") && !next2.equals(optString2)) {
                    dccxVar.g(next2);
                }
            }
            f = dccxVar.f();
        }
        this.e = f;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("otherFilesMap");
        if (optJSONObject3 != null) {
            Iterator<String> keys3 = optJSONObject3.keys();
            while (true) {
                if (!keys3.hasNext()) {
                    dbsgVar2 = dbpy.a;
                    break;
                }
                String next3 = keys3.next();
                if (optJSONObject3.optString(next3).endsWith(".mtl")) {
                    dbsgVar2 = dbsg.i(next3);
                    break;
                }
            }
        } else {
            dbsgVar2 = dbpy.a;
        }
        this.i = dbsgVar2;
        if (dbsgVar.a() && dbsgVar.b().optString("modelName").equals(jSONObject.optString("name"))) {
            jSONObject2 = dbsgVar.b().optJSONObject("textureChanges");
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("otherFilesMap");
        dcdg dcdgVar2 = new dcdg();
        if (jSONObject2 != null) {
            Iterator<String> keys4 = jSONObject2.keys();
            while (keys4.hasNext()) {
                String next4 = keys4.next();
                dcdgVar2.f(jSONObject2.optString(next4), next4);
            }
        }
        dcdn b2 = dcdgVar2.b();
        if (optJSONObject4 != null) {
            Iterator<String> keys5 = optJSONObject4.keys();
            while (keys5.hasNext()) {
                String next5 = keys5.next();
                String optString3 = optJSONObject4.optString(next5);
                if (!optString3.isEmpty() && !optString3.endsWith(".mtl") && (jSONObject2 == null || !b2.containsKey(optString3))) {
                    dcdgVar2.f(optString3, next5);
                }
            }
        }
        this.g = dcdgVar2.b();
        dcdg dcdgVar3 = new dcdg();
        JSONObject optJSONObject5 = jSONObject.optJSONObject("sounds");
        if (optJSONObject5 != null) {
            Iterator<String> keys6 = optJSONObject5.keys();
            while (keys6.hasNext()) {
                String next6 = keys6.next();
                String optString4 = optJSONObject5.optString(next6);
                pnu[] values = pnu.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        dbsgVar3 = dbpy.a;
                        break;
                    }
                    pnu pnuVar = values[i3];
                    if (pnuVar.d.equals(next6)) {
                        dbsgVar3 = dbsg.i(pnuVar);
                        break;
                    }
                    i3++;
                }
                if (dbsgVar3.a() && !optString4.isEmpty()) {
                    dcdgVar3.f((pnu) dbsgVar3.b(), optString4);
                }
            }
        }
        this.h = dcdgVar3.b();
    }

    @Override // defpackage.pns
    public final dbsg<String> a() {
        return this.c;
    }

    @Override // defpackage.pns
    public final dbsg<String> b(final String str, DisplayMetrics displayMetrics) {
        dcdc j;
        dbsg dbsgVar = dbpy.a;
        int i = displayMetrics.densityDpi;
        if (i > 480) {
            j = dcdc.j("xxxhdpi", "xxhdpi", "xhdpi", "hdpi", "mdpi");
        } else if (i > 320) {
            j = dcdc.j("xxhdpi", "xxxhdpi", "xhdpi", "hdpi", "mdpi");
        } else if (i > 240) {
            j = dcdc.j("xhdpi", "xxhdpi", "xxxhdpi", "hdpi", "mdpi");
        } else if (i > 160) {
            j = dcdc.j("hdpi", "xhdpi", "xxhdpi", "xxxhdpi", "mdpi");
        } else {
            j = dcdc.j("mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi");
        }
        int size = j.size();
        int i2 = 0;
        while (i2 < size) {
            dbsgVar = dbsg.j(this.l.get((String) j.get(i2)));
            i2++;
            if (dbsgVar.a()) {
                break;
            }
        }
        return dbsgVar.h(new dbrn(str) { // from class: pnz
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf((String) obj);
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
        });
    }

    @Override // defpackage.pns
    public final int c() {
        return this.k;
    }

    @Override // defpackage.pns
    public final dbsg<Integer> d() {
        return this.m;
    }

    @Override // defpackage.pns
    public final float e() {
        return this.o.c(Float.valueOf(1.0f)).floatValue();
    }

    @Override // defpackage.pns
    public final int f() {
        return this.n.c(1000).intValue();
    }

    @Override // defpackage.pns
    public final float g() {
        return this.p.c(Float.valueOf(b)).floatValue();
    }

    @Override // defpackage.pns
    public final float h() {
        return ((Float) dbsg.j(this.q.get("X")).c(Float.valueOf(90.0f))).floatValue();
    }

    @Override // defpackage.pns
    public final float i() {
        return ((Float) dbsg.j(this.q.get("Y")).c(Float.valueOf(180.0f))).floatValue();
    }

    @Override // defpackage.pns
    public final float j() {
        return ((Float) dbsg.j(this.q.get("Z")).c(Float.valueOf(0.0f))).floatValue();
    }
}
