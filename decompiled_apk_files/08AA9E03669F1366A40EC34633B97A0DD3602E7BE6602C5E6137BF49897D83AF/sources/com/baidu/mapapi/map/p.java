package com.baidu.mapapi.map;

import android.view.View;
import com.baidu.mapapi.map.SwipeDismissTouchListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p implements SwipeDismissTouchListener.DismissCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeDismissView f1747a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(SwipeDismissView swipeDismissView) {
        this.f1747a = swipeDismissView;
    }

    @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(Object obj) {
        return true;
    }

    @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(View view, Object obj) {
        if (this.f1747a.f1678a == null) {
            return;
        }
        this.f1747a.f1678a.onDismiss();
    }

    @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
    public void onNotify() {
        if (this.f1747a.f1678a == null) {
            return;
        }
        this.f1747a.f1678a.onNotify();
    }
}
