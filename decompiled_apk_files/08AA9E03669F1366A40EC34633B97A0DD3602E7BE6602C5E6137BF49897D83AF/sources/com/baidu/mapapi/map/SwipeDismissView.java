package com.baidu.mapapi.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.baidu.mapapi.map.WearMapView;
/* loaded from: classes.dex */
public class SwipeDismissView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    WearMapView.OnDismissCallback f1678a;

    public SwipeDismissView(Context context, AttributeSet attributeSet, int i, View view) {
        super(context, attributeSet, i);
        this.f1678a = null;
        a(context, view);
    }

    public SwipeDismissView(Context context, AttributeSet attributeSet, View view) {
        super(context, attributeSet);
        this.f1678a = null;
        a(context, view);
    }

    public SwipeDismissView(Context context, View view) {
        super(context);
        this.f1678a = null;
        a(context, view);
    }

    void a(Context context, View view) {
        setOnTouchListener(new SwipeDismissTouchListener(view, new Object(), new p(this)));
    }

    public void setCallback(WearMapView.OnDismissCallback onDismissCallback) {
        this.f1678a = onDismissCallback;
    }
}
