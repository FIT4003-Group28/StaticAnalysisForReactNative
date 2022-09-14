package com.baidu.mapapi.map;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements com.baidu.platform.comapi.map.p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaiduMap f1720a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BaiduMap baiduMap) {
        this.f1720a = baiduMap;
    }

    @Override // com.baidu.platform.comapi.map.p
    public Bundle a(int i, int i2, int i3) {
        Lock lock;
        Lock lock2;
        HeatMap heatMap;
        Lock lock3;
        HeatMap heatMap2;
        lock = this.f1720a.D;
        lock.lock();
        try {
            heatMap = this.f1720a.C;
            if (heatMap != null) {
                heatMap2 = this.f1720a.C;
                Tile a2 = heatMap2.a(i, i2, i3);
                if (a2 != null) {
                    return a2.toBundle();
                }
            }
            lock3 = this.f1720a.D;
            lock3.unlock();
            return null;
        } finally {
            lock2 = this.f1720a.D;
            lock2.unlock();
        }
    }
}
