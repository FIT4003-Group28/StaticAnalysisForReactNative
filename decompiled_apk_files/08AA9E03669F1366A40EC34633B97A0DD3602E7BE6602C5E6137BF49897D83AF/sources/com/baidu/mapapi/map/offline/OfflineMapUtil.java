package com.baidu.mapapi.map.offline;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.map.s;
import com.baidu.platform.comapi.map.v;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class OfflineMapUtil {
    public static MKOLSearchRecord getSearchRecordFromLocalCityInfo(s sVar) {
        if (sVar == null) {
            return null;
        }
        MKOLSearchRecord mKOLSearchRecord = new MKOLSearchRecord();
        mKOLSearchRecord.cityID = sVar.f2077a;
        mKOLSearchRecord.cityName = sVar.f2078b;
        mKOLSearchRecord.cityType = sVar.f2080d;
        int i = 0;
        if (sVar.a() != null) {
            ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
            Iterator<s> it = sVar.a().iterator();
            while (it.hasNext()) {
                s next = it.next();
                arrayList.add(getSearchRecordFromLocalCityInfo(next));
                i += next.f2079c;
                mKOLSearchRecord.childCities = arrayList;
            }
        }
        if (mKOLSearchRecord.cityType == 1) {
            mKOLSearchRecord.size = i;
            return mKOLSearchRecord;
        }
        mKOLSearchRecord.size = sVar.f2079c;
        return mKOLSearchRecord;
    }

    public static MKOLUpdateElement getUpdatElementFromLocalMapElement(v vVar) {
        if (vVar == null) {
            return null;
        }
        MKOLUpdateElement mKOLUpdateElement = new MKOLUpdateElement();
        mKOLUpdateElement.cityID = vVar.f2086a;
        mKOLUpdateElement.cityName = vVar.f2087b;
        if (vVar.g != null) {
            mKOLUpdateElement.geoPt = CoordUtil.mc2ll(vVar.g);
        }
        mKOLUpdateElement.level = vVar.e;
        mKOLUpdateElement.ratio = vVar.i;
        mKOLUpdateElement.serversize = vVar.h;
        mKOLUpdateElement.size = vVar.i == 100 ? vVar.h : (vVar.h / 100) * vVar.i;
        mKOLUpdateElement.status = vVar.l;
        mKOLUpdateElement.update = vVar.j;
        return mKOLUpdateElement;
    }
}
