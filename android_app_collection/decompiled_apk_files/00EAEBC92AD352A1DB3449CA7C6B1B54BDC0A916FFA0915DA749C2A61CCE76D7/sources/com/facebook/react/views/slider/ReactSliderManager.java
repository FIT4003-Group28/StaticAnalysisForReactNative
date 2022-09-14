package com.facebook.react.views.slider;

import a.g.m.e0.c;
import a.g.m.v;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.i0.q;
import com.facebook.react.i0.r;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactSliderManager extends SimpleViewManager<com.facebook.react.views.slider.a> implements r<com.facebook.react.views.slider.a> {
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;
    private final y0<com.facebook.react.views.slider.a> mDelegate = new q(this);
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    protected static b sAccessibilityDelegate = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.slider.b(seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).a(i), z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.slider.c(seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).a(seekBar.getProgress())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b extends a.g.m.a {
        protected b() {
        }

        private static boolean a(int i) {
            return i == c.a.i.a() || i == c.a.j.a() || i == c.a.p.a();
        }

        @Override // a.g.m.a
        public boolean a(View view, int i, Bundle bundle) {
            if (a(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
            }
            boolean a2 = super.a(view, i, bundle);
            if (a(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
            }
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends i implements m {
        private int A;
        private int B;
        private boolean C;

        private c() {
            R();
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private void R() {
            a((m) this);
        }

        @Override // com.facebook.yoga.m
        public long a(p pVar, float f2, n nVar, float f3, n nVar2) {
            if (!this.C) {
                com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(i(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.A = aVar.getMeasuredWidth();
                this.B = aVar.getMeasuredHeight();
                this.C = true;
            }
            return o.a(this.A, this.B);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public i mo328createShadowNodeInstance() {
        return new c(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.slider.a mo345createViewInstance(k0 k0Var) {
        com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(k0Var, null, STYLE);
        v.a(aVar, sAccessibilityDelegate);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected y0<com.facebook.react.views.slider.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topSlidingComplete", f.a("registrationName", "onSlidingComplete"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, n nVar, float f3, n nVar2) {
        com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(context, null, STYLE);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(com.facebook.react.uimanager.q.a(aVar.getMeasuredWidth()), com.facebook.react.uimanager.q.a(aVar.getMeasuredHeight()));
    }

    @Override // com.facebook.react.i0.r
    public void setDisabled(com.facebook.react.views.slider.a aVar, boolean z) {
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.slider.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @Override // com.facebook.react.i0.r
    public void setMaximumTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setMaxValue(d2);
    }

    @Override // com.facebook.react.i0.r
    public void setMinimumTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setMinValue(d2);
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setStep(d2);
    }

    @Override // com.facebook.react.i0.r
    public void setTestID(com.facebook.react.views.slider.a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // com.facebook.react.i0.r
    public void setThumbImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable thumb = aVar.getThumb();
        if (num == null) {
            thumb.clearColorFilter();
        } else {
            thumb.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.i0.r
    public void setTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.i0.r
    @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0d, name = "value")
    public void setValue(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d2);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
