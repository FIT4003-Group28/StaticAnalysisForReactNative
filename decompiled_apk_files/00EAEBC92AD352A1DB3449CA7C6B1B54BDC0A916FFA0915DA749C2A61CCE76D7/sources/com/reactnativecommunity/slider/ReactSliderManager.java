package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.horcrux.svg.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactSliderManager extends SimpleViewManager<com.reactnativecommunity.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "RNCSlider";
    private static final int STYLE = 16842875;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.reactnativecommunity.slider.b(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).a(i), z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new e(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).a(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new d(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).a(seekBar.getProgress())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends i implements m {
        private int A;
        private int B;
        private boolean C;

        private b() {
            R();
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private void R() {
            a((m) this);
        }

        @Override // com.facebook.yoga.m
        public long a(p pVar, float f2, n nVar, float f3, n nVar2) {
            if (!this.C) {
                com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(i(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
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
    public void addEventEmitters(k0 k0Var, com.reactnativecommunity.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public i mo328createShadowNodeInstance() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.reactnativecommunity.slider.a mo345createViewInstance(k0 k0Var) {
        com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(k0Var, null, STYLE);
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setSplitTrack(false);
        }
        return aVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topSlidingComplete", f.a("registrationName", "onRNCSliderSlidingComplete"), "topSlidingStart", f.a("registrationName", "onRNCSliderSlidingStart"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @com.facebook.react.uimanager.e1.a(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(com.reactnativecommunity.slider.a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    @com.facebook.react.uimanager.e1.a(name = "accessibilityUnits")
    public void setAccessibilityUnits(com.reactnativecommunity.slider.a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.reactnativecommunity.slider.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "inverted")
    public void setInverted(com.reactnativecommunity.slider.a aVar, boolean z) {
        aVar.setScaleX(z ? -1.0f : 1.0f);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.reactnativecommunity.slider.a aVar, double d2) {
        aVar.setMaxValue(d2);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.reactnativecommunity.slider.a aVar, double d2) {
        aVar.setMinValue(d2);
    }

    @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.reactnativecommunity.slider.a aVar, double d2) {
        aVar.setStep(d2);
    }

    @com.facebook.react.uimanager.e1.a(name = "thumbImage")
    public void setThumbImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
        aVar.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        if (aVar.getThumb() != null) {
            Drawable thumb = aVar.getThumb();
            if (num == null) {
                thumb.clearColorFilter();
            } else {
                thumb.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0d, name = "value")
    public void setValue(com.reactnativecommunity.slider.a aVar, double d2) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d2);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
