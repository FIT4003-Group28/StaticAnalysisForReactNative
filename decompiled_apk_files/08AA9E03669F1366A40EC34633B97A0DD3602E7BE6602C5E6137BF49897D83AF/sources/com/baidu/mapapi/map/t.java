package com.baidu.mapapi.map;

import android.util.Log;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1751a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f1752b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f1753c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f1754d;
    final /* synthetic */ TileOverlay e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(TileOverlay tileOverlay, int i, int i2, int i3, String str) {
        this.e = tileOverlay;
        this.f1751a = i;
        this.f1752b = i2;
        this.f1753c = i3;
        this.f1754d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        TileProvider tileProvider;
        String str;
        String str2;
        HashSet hashSet;
        tileProvider = this.e.g;
        Tile tile = ((FileTileProvider) tileProvider).getTile(this.f1751a, this.f1752b, this.f1753c);
        if (tile == null) {
            str = TileOverlay.f1697b;
            str2 = "FileTile pic is null";
        } else if (tile.height == 256 && tile.height == 256) {
            this.e.a(this.f1751a + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + this.f1752b + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + this.f1753c, tile);
            hashSet = this.e.e;
            hashSet.remove(this.f1754d);
        } else {
            str = TileOverlay.f1697b;
            str2 = "FileTile pic must be 256 * 256";
        }
        Log.e(str, str2);
        hashSet = this.e.e;
        hashSet.remove(this.f1754d);
    }
}
