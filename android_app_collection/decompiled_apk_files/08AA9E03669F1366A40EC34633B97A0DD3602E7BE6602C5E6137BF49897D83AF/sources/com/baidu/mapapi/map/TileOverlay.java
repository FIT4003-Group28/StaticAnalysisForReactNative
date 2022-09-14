package com.baidu.mapapi.map;

import android.util.Log;
import com.baidu.mapapi.common.Logger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class TileOverlay {

    /* renamed from: b  reason: collision with root package name */
    private static final String f1697b = "TileOverlay";
    private static int f;

    /* renamed from: a  reason: collision with root package name */
    BaiduMap f1698a;
    private TileProvider g;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Tile> f1700d = new HashMap<>();
    private HashSet<String> e = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f1699c = Executors.newFixedThreadPool(1);

    public TileOverlay(BaiduMap baiduMap, TileProvider tileProvider) {
        this.f1698a = baiduMap;
        this.g = tileProvider;
    }

    private synchronized Tile a(String str) {
        if (this.f1700d.containsKey(str)) {
            Tile tile = this.f1700d.get(str);
            this.f1700d.remove(str);
            return tile;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, Tile tile) {
        this.f1700d.put(str, tile);
    }

    private synchronized boolean b(String str) {
        return this.e.contains(str);
    }

    private synchronized void c(String str) {
        this.e.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Tile a(int i, int i2, int i3) {
        String str;
        String str2;
        String str3 = i + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i2 + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i3;
        Tile a2 = a(str3);
        if (a2 != null) {
            return a2;
        }
        if (this.f1698a != null && f == 0) {
            MapStatus mapStatus = this.f1698a.getMapStatus();
            f = (((mapStatus.f1618a.j.f2035b - mapStatus.f1618a.j.f2034a) / 256) + 2) * (((mapStatus.f1618a.j.f2037d - mapStatus.f1618a.j.f2036c) / 256) + 2);
        }
        if (this.f1700d.size() > f) {
            a();
        }
        if (b(str3) || this.f1699c.isShutdown()) {
            return null;
        }
        try {
            c(str3);
            this.f1699c.execute(new t(this, i, i2, i3, str3));
            return null;
        } catch (RejectedExecutionException unused) {
            str = f1697b;
            str2 = "ThreadPool excepiton";
            Log.e(str, str2);
            return null;
        } catch (Exception unused2) {
            str = f1697b;
            str2 = "fileDir is not legal";
            Log.e(str, str2);
            return null;
        }
    }

    synchronized void a() {
        Logger.logE(f1697b, "clearTaskSet");
        this.e.clear();
        this.f1700d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f1699c.shutdownNow();
    }

    public boolean clearTileCache() {
        return this.f1698a.b();
    }

    public void removeTileOverlay() {
        if (this.f1698a == null) {
            return;
        }
        this.f1698a.a(this);
    }
}
