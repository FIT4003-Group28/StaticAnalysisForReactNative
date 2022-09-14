package com.baidu.platform.comjni.map.basemap;

import android.os.Bundle;
import android.util.LongSparseArray;
/* loaded from: classes.dex */
public class BaseMapCallback {

    /* renamed from: a  reason: collision with root package name */
    private static LongSparseArray<b> f2139a = new LongSparseArray<>();

    public static int ReqLayerData(Bundle bundle, long j, int i, Bundle bundle2) {
        int size = f2139a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b valueAt = f2139a.valueAt(i2);
            if (valueAt != null && valueAt.a(j)) {
                return valueAt.a(bundle, j, i, bundle2);
            }
        }
        return 0;
    }

    public static void addLayerDataInterface(long j, b bVar) {
        f2139a.put(j, bVar);
    }

    public static void removeLayerDataInterface(long j) {
        f2139a.remove(j);
    }
}
