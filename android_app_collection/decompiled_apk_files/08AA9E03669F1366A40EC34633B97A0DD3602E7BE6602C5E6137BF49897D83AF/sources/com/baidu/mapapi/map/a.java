package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.map.Overlay;
import com.baidu.platform.comapi.map.C0132e;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements Overlay.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaiduMap f1718a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BaiduMap baiduMap) {
        this.f1718a = baiduMap;
    }

    @Override // com.baidu.mapapi.map.Overlay.a
    public void a(Overlay overlay) {
        List list;
        List list2;
        List list3;
        C0132e c0132e;
        C0132e c0132e2;
        List list4;
        List list5;
        List list6;
        C0132e c0132e3;
        List list7;
        C0132e c0132e4;
        if (overlay != null) {
            list6 = this.f1718a.k;
            if (list6.contains(overlay)) {
                Bundle a2 = overlay.a();
                c0132e3 = this.f1718a.i;
                if (c0132e3 != null) {
                    c0132e4 = this.f1718a.i;
                    c0132e4.d(a2);
                }
                list7 = this.f1718a.k;
                list7.remove(overlay);
            }
        }
        if (overlay != null) {
            list4 = this.f1718a.m;
            if (list4.contains(overlay)) {
                list5 = this.f1718a.m;
                list5.remove(overlay);
            }
        }
        if (overlay != null) {
            list = this.f1718a.l;
            if (!list.contains(overlay)) {
                return;
            }
            Marker marker = (Marker) overlay;
            if (marker.n == null) {
                return;
            }
            list2 = this.f1718a.l;
            list2.remove(marker);
            list3 = this.f1718a.l;
            if (list3.size() != 0) {
                return;
            }
            c0132e = this.f1718a.i;
            if (c0132e == null) {
                return;
            }
            c0132e2 = this.f1718a.i;
            c0132e2.b(false);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay.a
    public void b(Overlay overlay) {
        List list;
        List list2;
        List list3;
        List list4;
        C0132e c0132e;
        C0132e c0132e2;
        List list5;
        List list6;
        C0132e c0132e3;
        C0132e c0132e4;
        List list7;
        if (overlay != null) {
            list4 = this.f1718a.k;
            if (list4.contains(overlay)) {
                if (overlay instanceof Marker) {
                    Marker marker = (Marker) overlay;
                    if (marker.n != null && marker.n.size() != 0) {
                        list5 = this.f1718a.l;
                        if (list5.contains(marker)) {
                            list7 = this.f1718a.l;
                            list7.remove(marker);
                        }
                        list6 = this.f1718a.l;
                        list6.add(marker);
                        c0132e3 = this.f1718a.i;
                        if (c0132e3 != null) {
                            c0132e4 = this.f1718a.i;
                            c0132e4.b(true);
                        }
                    }
                }
                Bundle bundle = new Bundle();
                c0132e = this.f1718a.i;
                if (c0132e != null) {
                    c0132e2 = this.f1718a.i;
                    c0132e2.c(overlay.a(bundle));
                }
            }
        }
        list = this.f1718a.m;
        if (list.contains(overlay)) {
            list3 = this.f1718a.m;
            list3.remove(overlay);
        }
        if (overlay instanceof Marker) {
            list2 = this.f1718a.m;
            list2.add((Marker) overlay);
        }
    }
}
