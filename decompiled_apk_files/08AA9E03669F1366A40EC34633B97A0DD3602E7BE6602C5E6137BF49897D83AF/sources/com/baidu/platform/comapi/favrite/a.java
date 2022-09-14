package com.baidu.platform.comapi.favrite;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.inner.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f2002b;

    /* renamed from: a  reason: collision with root package name */
    private com.baidu.platform.comjni.map.favorite.a f2003a = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2004c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2005d = false;
    private Vector<String> e = null;
    private Vector<String> f = null;
    private boolean g = false;
    private c h = new c();
    private b i = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.baidu.platform.comapi.favrite.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0038a implements Comparator<String> {
        C0038a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    /* loaded from: classes.dex */
    private class b {

        /* renamed from: b  reason: collision with root package name */
        private long f2008b;

        /* renamed from: c  reason: collision with root package name */
        private long f2009c;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f2008b = System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f2009c = System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return this.f2009c - this.f2008b > 1000;
        }
    }

    /* loaded from: classes.dex */
    private class c {

        /* renamed from: b  reason: collision with root package name */
        private String f2011b;

        /* renamed from: c  reason: collision with root package name */
        private long f2012c;

        /* renamed from: d  reason: collision with root package name */
        private long f2013d;

        private c() {
            this.f2012c = 5000L;
            this.f2013d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f2011b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            this.f2011b = str;
            this.f2013d = System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return TextUtils.isEmpty(this.f2011b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return true;
        }
    }

    private a() {
    }

    public static a a() {
        if (f2002b == null) {
            synchronized (a.class) {
                if (f2002b == null) {
                    f2002b = new a();
                    f2002b.h();
                }
            }
        }
        return f2002b;
    }

    public static boolean g() {
        return (f2002b == null || f2002b.f2003a == null || !f2002b.f2003a.d()) ? false : true;
    }

    private boolean h() {
        if (this.f2003a == null) {
            this.f2003a = new com.baidu.platform.comjni.map.favorite.a();
            if (this.f2003a.a() == 0) {
                this.f2003a = null;
                return false;
            }
            j();
            i();
        }
        return true;
    }

    private boolean i() {
        if (this.f2003a == null) {
            return false;
        }
        String str = SysOSUtil.getModuleFileName() + "/";
        this.f2003a.a(1);
        return this.f2003a.a(str, "fav_poi", "fifo", 10, UIMsg.d_ResultType.VERSION_CHECK, -1);
    }

    private void j() {
        this.f2004c = false;
        this.f2005d = false;
    }

    public synchronized int a(String str, FavSyncPoi favSyncPoi) {
        if (this.f2003a == null) {
            return 0;
        }
        if (str != null && !str.equals("") && favSyncPoi != null) {
            j();
            ArrayList<String> e = e();
            if ((e != null ? e.size() : 0) + 1 > 500) {
                return -2;
            }
            if (e != null && e.size() > 0) {
                Iterator<String> it = e.iterator();
                while (it.hasNext()) {
                    FavSyncPoi b2 = b(it.next());
                    if (b2 != null && str.equals(b2.f1999b)) {
                        return -1;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                favSyncPoi.f1999b = str;
                String valueOf = String.valueOf(System.currentTimeMillis());
                String str2 = valueOf + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + favSyncPoi.hashCode();
                favSyncPoi.h = valueOf;
                favSyncPoi.f1998a = str2;
                jSONObject.put("bdetail", favSyncPoi.i);
                jSONObject.put("uspoiname", favSyncPoi.f1999b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", favSyncPoi.f2000c.getmPtx());
                jSONObject2.put("y", favSyncPoi.f2000c.getmPty());
                jSONObject.put("pt", jSONObject2);
                jSONObject.put("ncityid", favSyncPoi.e);
                jSONObject.put("npoitype", favSyncPoi.g);
                jSONObject.put("uspoiuid", favSyncPoi.f);
                jSONObject.put("addr", favSyncPoi.f2001d);
                jSONObject.put("addtimesec", favSyncPoi.h);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("Fav_Sync", jSONObject);
                jSONObject3.put("Fav_Content", favSyncPoi.j);
                if (!this.f2003a.a(str2, jSONObject3.toString())) {
                    return 0;
                }
                j();
                return 1;
            } catch (JSONException unused) {
                return 0;
            } finally {
                g();
            }
        }
        return -1;
    }

    public synchronized boolean a(String str) {
        if (this.f2003a == null) {
            return false;
        }
        if (str != null && !str.equals("")) {
            if (!c(str)) {
                return false;
            }
            j();
            return this.f2003a.a(str);
        }
        return false;
    }

    public FavSyncPoi b(String str) {
        if (this.f2003a == null || str == null || str.equals("")) {
            return null;
        }
        try {
            if (!c(str)) {
                return null;
            }
            FavSyncPoi favSyncPoi = new FavSyncPoi();
            String b2 = this.f2003a.b(str);
            if (b2 == null || b2.equals("")) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(b2);
            JSONObject optJSONObject = jSONObject.optJSONObject("Fav_Sync");
            String optString = jSONObject.optString("Fav_Content");
            favSyncPoi.f1999b = optJSONObject.optString("uspoiname");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("pt");
            favSyncPoi.f2000c = new Point(optJSONObject2.optInt("x"), optJSONObject2.optInt("y"));
            favSyncPoi.e = optJSONObject.optString("ncityid");
            favSyncPoi.f = optJSONObject.optString("uspoiuid");
            favSyncPoi.g = optJSONObject.optInt("npoitype");
            favSyncPoi.f2001d = optJSONObject.optString("addr");
            favSyncPoi.h = optJSONObject.optString("addtimesec");
            favSyncPoi.i = optJSONObject.optBoolean("bdetail");
            favSyncPoi.j = optString;
            favSyncPoi.f1998a = str;
            return favSyncPoi;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void b() {
        if (f2002b != null) {
            if (f2002b.f2003a != null) {
                f2002b.f2003a.b();
                f2002b.f2003a = null;
            }
            f2002b = null;
        }
    }

    public synchronized boolean b(String str, FavSyncPoi favSyncPoi) {
        boolean z = false;
        if (this.f2003a != null && str != null && !str.equals("") && favSyncPoi != null) {
            if (!c(str)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uspoiname", favSyncPoi.f1999b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", favSyncPoi.f2000c.getmPtx());
                jSONObject2.put("y", favSyncPoi.f2000c.getmPty());
                jSONObject.put("pt", jSONObject2);
                jSONObject.put("ncityid", favSyncPoi.e);
                jSONObject.put("npoitype", favSyncPoi.g);
                jSONObject.put("uspoiuid", favSyncPoi.f);
                jSONObject.put("addr", favSyncPoi.f2001d);
                favSyncPoi.h = String.valueOf(System.currentTimeMillis());
                jSONObject.put("addtimesec", favSyncPoi.h);
                jSONObject.put("bdetail", false);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("Fav_Sync", jSONObject);
                jSONObject3.put("Fav_Content", favSyncPoi.j);
                j();
                if (this.f2003a != null) {
                    if (this.f2003a.b(str, jSONObject3.toString())) {
                        z = true;
                    }
                }
                return z;
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }

    public synchronized boolean c() {
        if (this.f2003a == null) {
            return false;
        }
        j();
        boolean c2 = this.f2003a.c();
        g();
        return c2;
    }

    public boolean c(String str) {
        return this.f2003a != null && str != null && !str.equals("") && this.f2003a.c(str);
    }

    public ArrayList<String> d() {
        String b2;
        if (this.f2003a == null) {
            return null;
        }
        if (this.f2005d && this.f != null) {
            return new ArrayList<>(this.f);
        }
        try {
            Bundle bundle = new Bundle();
            this.f2003a.a(bundle);
            String[] stringArray = bundle.getStringArray("rstString");
            if (stringArray != null) {
                if (this.f == null) {
                    this.f = new Vector<>();
                } else {
                    this.f.clear();
                }
                for (int i = 0; i < stringArray.length; i++) {
                    if (!stringArray[i].equals("data_version") && (b2 = this.f2003a.b(stringArray[i])) != null && !b2.equals("")) {
                        this.f.add(stringArray[i]);
                    }
                }
                if (this.f.size() > 0) {
                    try {
                        Collections.sort(this.f, new C0038a());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.f2005d = true;
                }
            } else if (this.f != null) {
                this.f.clear();
                this.f = null;
            }
            if (this.f != null && !this.f.isEmpty()) {
                return new ArrayList<>(this.f);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ArrayList<String> e() {
        if (this.f2003a == null) {
            return null;
        }
        if (this.f2004c && this.e != null) {
            return new ArrayList<>(this.e);
        }
        try {
            Bundle bundle = new Bundle();
            this.f2003a.a(bundle);
            String[] stringArray = bundle.getStringArray("rstString");
            if (stringArray != null) {
                if (this.e == null) {
                    this.e = new Vector<>();
                } else {
                    this.e.clear();
                }
                for (String str : stringArray) {
                    if (!str.equals("data_version")) {
                        this.e.add(str);
                    }
                }
                if (this.e.size() > 0) {
                    try {
                        Collections.sort(this.e, new C0038a());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.f2004c = true;
                }
            } else if (this.e != null) {
                this.e.clear();
                this.e = null;
            }
            if (this.e != null && this.e.size() != 0) {
                return new ArrayList<>(this.e);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String f() {
        String b2;
        if (!this.i.c() || this.h.c() || this.h.b()) {
            this.i.a();
            if (this.f2003a == null) {
                return null;
            }
            ArrayList<String> d2 = d();
            JSONObject jSONObject = new JSONObject();
            if (d2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    int i = 0;
                    Iterator<String> it = d2.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next != null && !next.equals("data_version") && (b2 = this.f2003a.b(next)) != null && !b2.equals("")) {
                            JSONObject optJSONObject = new JSONObject(b2).optJSONObject("Fav_Sync");
                            optJSONObject.put("key", next);
                            jSONArray.put(i, optJSONObject);
                            i++;
                        }
                    }
                    if (i > 0) {
                        jSONObject.put("favcontents", jSONArray);
                        jSONObject.put("favpoinum", i);
                    }
                } catch (JSONException unused) {
                    return null;
                }
            }
            this.i.b();
            this.h.a(jSONObject.toString());
            return this.h.a();
        }
        return this.h.a();
    }
}
