package com.baidu.mapapi.map;

import android.view.View;
import com.baidu.platform.comapi.map.D;
import com.baidu.platform.comapi.map.GestureDetector$OnDoubleTapListenerC0136i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MapView f1731a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(MapView mapView) {
        this.f1731a = mapView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i;
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i2;
        gestureDetector$OnDoubleTapListenerC0136i = this.f1731a.f1631c;
        D D = gestureDetector$OnDoubleTapListenerC0136i.a().D();
        D.f2026a -= 1.0f;
        gestureDetector$OnDoubleTapListenerC0136i2 = this.f1731a.f1631c;
        gestureDetector$OnDoubleTapListenerC0136i2.a().a(D, 300);
    }
}
