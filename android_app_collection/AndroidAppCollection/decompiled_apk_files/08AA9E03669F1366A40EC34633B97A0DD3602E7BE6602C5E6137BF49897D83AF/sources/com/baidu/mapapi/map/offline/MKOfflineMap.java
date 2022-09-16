package com.baidu.mapapi.map.offline;

import com.baidu.mapapi.BMapManager;
import com.baidu.platform.comapi.map.s;
import com.baidu.platform.comapi.map.t;
import com.baidu.platform.comapi.map.w;
import com.baidu.platform.comapi.map.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class MKOfflineMap {
    public static final int TYPE_DOWNLOAD_UPDATE = 0;
    public static final int TYPE_NEW_OFFLINE = 6;
    public static final int TYPE_VER_UPDATE = 4;

    /* renamed from: a  reason: collision with root package name */
    private static final String f1743a = "MKOfflineMap";

    /* renamed from: b  reason: collision with root package name */
    private t f1744b;

    /* renamed from: c  reason: collision with root package name */
    private MKOfflineMapListener f1745c;

    public void destroy() {
        this.f1744b.d(0);
        this.f1744b.b((x) null);
        this.f1744b.b();
        BMapManager.destroy();
    }

    public ArrayList<MKOLUpdateElement> getAllUpdateInfo() {
        ArrayList<w> e = this.f1744b.e();
        if (e == null) {
            return null;
        }
        ArrayList<MKOLUpdateElement> arrayList = new ArrayList<>();
        Iterator<w> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getUpdatElementFromLocalMapElement(it.next().a()));
        }
        return arrayList;
    }

    public ArrayList<MKOLSearchRecord> getHotCityList() {
        ArrayList<s> c2 = this.f1744b.c();
        if (c2 == null) {
            return null;
        }
        ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
        Iterator<s> it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public ArrayList<MKOLSearchRecord> getOfflineCityList() {
        ArrayList<s> d2 = this.f1744b.d();
        if (d2 == null) {
            return null;
        }
        ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
        Iterator<s> it = d2.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public MKOLUpdateElement getUpdateInfo(int i) {
        w g = this.f1744b.g(i);
        if (g == null) {
            return null;
        }
        return OfflineMapUtil.getUpdatElementFromLocalMapElement(g.a());
    }

    @Deprecated
    public int importOfflineData() {
        return importOfflineData(false);
    }

    @Deprecated
    public int importOfflineData(boolean z) {
        int i;
        ArrayList<w> e = this.f1744b.e();
        int i2 = 0;
        if (e != null) {
            i2 = e.size();
            i = i2;
        } else {
            i = 0;
        }
        this.f1744b.a(z, true);
        ArrayList<w> e2 = this.f1744b.e();
        if (e2 != null) {
            i2 = e2.size();
        }
        return i2 - i;
    }

    public boolean init(MKOfflineMapListener mKOfflineMapListener) {
        BMapManager.init();
        this.f1744b = t.a();
        if (this.f1744b == null) {
            return false;
        }
        this.f1744b.a(new a(this));
        this.f1745c = mKOfflineMapListener;
        return true;
    }

    public boolean pause(int i) {
        return this.f1744b.c(i);
    }

    public boolean remove(int i) {
        return this.f1744b.e(i);
    }

    public ArrayList<MKOLSearchRecord> searchCity(String str) {
        ArrayList<s> a2 = this.f1744b.a(str);
        if (a2 == null) {
            return null;
        }
        ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
        Iterator<s> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public boolean start(int i) {
        if (this.f1744b == null) {
            return false;
        }
        if (this.f1744b.e() != null) {
            Iterator<w> it = this.f1744b.e().iterator();
            while (it.hasNext()) {
                w next = it.next();
                if (next.f2090a.f2086a == i) {
                    if (!next.f2090a.j && next.f2090a.l != 2 && next.f2090a.l != 3 && next.f2090a.l != 6) {
                        return false;
                    }
                    return this.f1744b.b(i);
                }
            }
        }
        return this.f1744b.a(i);
    }

    public boolean update(int i) {
        if (this.f1744b != null && this.f1744b.e() != null) {
            Iterator<w> it = this.f1744b.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w next = it.next();
                if (next.f2090a.f2086a == i) {
                    if (next.f2090a.j) {
                        return this.f1744b.f(i);
                    }
                }
            }
        }
        return false;
    }
}
