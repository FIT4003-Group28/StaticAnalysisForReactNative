package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
/* loaded from: classes.dex */
public class h extends com.facebook.react.views.view.f {

    /* renamed from: b  reason: collision with root package name */
    private int f10077b;

    /* renamed from: c  reason: collision with root package name */
    private int f10078c;

    /* renamed from: d  reason: collision with root package name */
    private a f10079d;

    /* loaded from: classes.dex */
    public enum a {
        LEFT,
        CENTER,
        RIGHT,
        BACK
    }

    public h(ReactContext reactContext) {
        super(reactContext);
        this.f10079d = a.RIGHT;
    }

    public a getType() {
        return this.f10079d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.f10077b = View.MeasureSpec.getSize(i);
            this.f10078c = View.MeasureSpec.getSize(i2);
            ViewParent parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f10077b, this.f10078c);
    }

    public void setType(a aVar) {
        this.f10079d = aVar;
    }
}
