package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.i0.k;
import com.facebook.react.i0.l;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.horcrux.svg.BuildConfig;
/* loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<com.facebook.react.views.switchview.a> implements l<com.facebook.react.views.switchview.a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final y0<com.facebook.react.views.switchview.a> mDelegate = new k(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.switchview.b(compoundButton.getId(), z));
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
                com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(i());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.A = aVar.getMeasuredWidth();
                this.B = aVar.getMeasuredHeight();
                this.C = true;
            }
            return o.a(this.A, this.B);
        }
    }

    private static void setValueInternal(com.facebook.react.views.switchview.a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.a(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.switchview.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public i mo328createShadowNodeInstance() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.switchview.a mo345createViewInstance(k0 k0Var) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(k0Var);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected y0<com.facebook.react.views.switchview.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, n nVar, float f3, n nVar2) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(q.a(aVar.getMeasuredWidth()), q.a(aVar.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.switchview.a aVar, String str, ReadableArray readableArray) {
        boolean z = false;
        if (((str.hashCode() == -669744680 && str.equals("setNativeValue")) ? (char) 0 : (char) 65535) != 0) {
            return;
        }
        if (readableArray != null && readableArray.getBoolean(0)) {
            z = true;
        }
        setValueInternal(aVar, z);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "disabled")
    public void setDisabled(com.facebook.react.views.switchview.a aVar, boolean z) {
        aVar.setEnabled(!z);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.switchview.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    public void setNativeValue(com.facebook.react.views.switchview.a aVar, boolean z) {
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(name = "on")
    public void setOn(com.facebook.react.views.switchview.a aVar, boolean z) {
        setValueInternal(aVar, z);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbColor")
    public void setThumbColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.a(num);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.c(num);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.d(num);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.b(num);
    }

    @Override // com.facebook.react.i0.l
    @com.facebook.react.uimanager.e1.a(name = "value")
    public void setValue(com.facebook.react.views.switchview.a aVar, boolean z) {
        setValueInternal(aVar, z);
    }
}
