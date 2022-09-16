package com.facebook.react.views.slider;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.baidu.mapapi.map.WeightedLatLng;
import com.facebook.react.b.f;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.g;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactSliderManager extends SimpleViewManager<com.facebook.react.views.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new SeekBar.OnSeekBarChangeListener() { // from class: com.facebook.react.views.slider.ReactSliderManager.1
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((aj) seekBar.getContext()).b(UIManagerModule.class)).getEventDispatcher().a(new b(seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).a(i), z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((aj) seekBar.getContext()).b(UIManagerModule.class)).getEventDispatcher().a(new c(seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).a(seekBar.getProgress())));
        }
    };
    private static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends g implements YogaMeasureFunction {

        /* renamed from: a  reason: collision with root package name */
        private int f4049a;

        /* renamed from: b  reason: collision with root package name */
        private int f4050b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4051c;

        private a() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f4051c) {
                com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(getThemedContext(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f4049a = aVar.getMeasuredWidth();
                this.f4050b = aVar.getMeasuredHeight();
                this.f4051c = true;
            }
            return com.facebook.yoga.b.a(this.f4049a, this.f4050b);
        }
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public g mo168createShadowNodeInstance() {
        return new a();
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return a.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.slider.a mo170createViewInstance(af afVar) {
        return new com.facebook.react.views.slider.a(afVar, null, STYLE);
    }

    @com.facebook.react.uimanager.a.a(a = "enabled", f = true)
    public void setEnabled(com.facebook.react.views.slider.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "value", c = 0.0d)
    public void setValue(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d2);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @com.facebook.react.uimanager.a.a(a = "minimumValue", c = 0.0d)
    public void setMinimumValue(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setMinValue(d2);
    }

    @com.facebook.react.uimanager.a.a(a = "maximumValue", c = WeightedLatLng.DEFAULT_INTENSITY)
    public void setMaximumValue(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setMaxValue(d2);
    }

    @com.facebook.react.uimanager.a.a(a = "step", c = 0.0d)
    public void setStep(com.facebook.react.views.slider.a aVar, double d2) {
        aVar.setStep(d2);
    }

    @com.facebook.react.uimanager.a.a(a = "thumbTintColor", b = "Color")
    public void setThumbTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        if (num == null) {
            aVar.getThumb().clearColorFilter();
        } else {
            aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "minimumTrackTintColor", b = "Color")
    public void setMinimumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "maximumTrackTintColor", b = "Color")
    public void setMaximumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, com.facebook.react.views.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topSlidingComplete", f.a("registrationName", "onSlidingComplete"));
    }
}
