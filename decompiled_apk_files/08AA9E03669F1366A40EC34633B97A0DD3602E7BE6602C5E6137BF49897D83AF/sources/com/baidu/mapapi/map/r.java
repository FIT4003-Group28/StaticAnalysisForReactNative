package com.baidu.mapapi.map;

import android.view.View;
import com.baidu.platform.comapi.map.D;
import com.baidu.platform.comapi.map.E;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextureMapView f1749a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(TextureMapView textureMapView) {
        this.f1749a = textureMapView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        E e;
        E e2;
        e = this.f1749a.f1691b;
        D D = e.b().D();
        D.f2026a -= 1.0f;
        e2 = this.f1749a.f1691b;
        e2.b().a(D, 300);
    }
}
