package com.baidu.mapapi.map;

import android.content.Context;
import android.os.Bundle;
import com.baidu.platform.comapi.map.K;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements K {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaiduMap f1721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(BaiduMap baiduMap) {
        this.f1721a = baiduMap;
    }

    @Override // com.baidu.platform.comapi.map.K
    public Bundle a(int i, int i2, int i3, Context context) {
        Lock lock;
        Lock lock2;
        TileOverlay tileOverlay;
        Lock lock3;
        TileOverlay tileOverlay2;
        lock = this.f1721a.E;
        lock.lock();
        try {
            tileOverlay = this.f1721a.B;
            if (tileOverlay != null) {
                tileOverlay2 = this.f1721a.B;
                Tile a2 = tileOverlay2.a(i, i2, i3);
                if (a2 != null) {
                    return a2.toBundle();
                }
            }
            lock3 = this.f1721a.E;
            lock3.unlock();
            return null;
        } finally {
            lock2 = this.f1721a.E;
            lock2.unlock();
        }
    }
}
