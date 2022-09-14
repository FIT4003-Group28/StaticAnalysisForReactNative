package com.facebook.react.views.switchview;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.g;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
/* loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<com.facebook.react.views.switchview.a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new CompoundButton.OnCheckedChangeListener() { // from class: com.facebook.react.views.switchview.ReactSwitchManager.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) ((aj) compoundButton.getContext()).b(UIManagerModule.class)).getEventDispatcher().a(new b(compoundButton.getId(), z));
        }
    };
    private static final String REACT_CLASS = "AndroidSwitch";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends g implements YogaMeasureFunction {

        /* renamed from: a  reason: collision with root package name */
        private int f4062a;

        /* renamed from: b  reason: collision with root package name */
        private int f4063b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4064c;

        private a() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f4064c) {
                com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(getThemedContext());
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f4062a = aVar.getMeasuredWidth();
                this.f4063b = aVar.getMeasuredHeight();
                this.f4064c = true;
            }
            return com.facebook.yoga.b.a(this.f4062a, this.f4063b);
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
    public com.facebook.react.views.switchview.a mo170createViewInstance(af afVar) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(afVar);
        aVar.setShowText(false);
        return aVar;
    }

    @com.facebook.react.uimanager.a.a(a = "enabled", f = true)
    public void setEnabled(com.facebook.react.views.switchview.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "on")
    public void setOn(com.facebook.react.views.switchview.a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.a(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @com.facebook.react.uimanager.a.a(a = "thumbTintColor", b = "Color")
    public void setThumbTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        if (num == null) {
            aVar.getThumbDrawable().clearColorFilter();
        } else {
            aVar.getThumbDrawable().setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "trackTintColor", b = "Color")
    public void setTrackTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        if (num == null) {
            aVar.getTrackDrawable().clearColorFilter();
        } else {
            aVar.getTrackDrawable().setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, com.facebook.react.views.switchview.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
