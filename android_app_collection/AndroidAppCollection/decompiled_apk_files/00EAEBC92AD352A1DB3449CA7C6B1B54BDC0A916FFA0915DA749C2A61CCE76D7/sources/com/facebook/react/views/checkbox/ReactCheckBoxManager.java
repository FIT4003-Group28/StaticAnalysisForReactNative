package com.facebook.react.views.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.CompoundButton;
import androidx.appcompat.widget.u0;
import androidx.core.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
/* loaded from: classes.dex */
public class ReactCheckBoxManager extends SimpleViewManager<com.facebook.react.views.checkbox.a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidCheckBox";

    /* loaded from: classes.dex */
    static class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        private ReactContext a(CompoundButton compoundButton) {
            Context context = compoundButton.getContext();
            return (ReactContext) (context instanceof u0 ? ((u0) context).getBaseContext() : compoundButton.getContext());
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(compoundButton.getId(), z));
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static int getThemeColor(Context context, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(getIdentifier(context, str), typedValue, true);
        return typedValue.data;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.checkbox.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.checkbox.a mo345createViewInstance(k0 k0Var) {
        return new com.facebook.react.views.checkbox.a(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.checkbox.a aVar, String str, ReadableArray readableArray) {
        if (((str.hashCode() == -669744680 && str.equals("setNativeValue")) ? (char) 0 : (char) 65535) == 0 && readableArray != null) {
            setOn(aVar, readableArray.getBoolean(0));
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.checkbox.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "on")
    public void setOn(com.facebook.react.views.checkbox.a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.a(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @com.facebook.react.uimanager.e1.a(name = "tintColors")
    public void setTintColors(com.facebook.react.views.checkbox.a aVar, ReadableMap readableMap) {
        c.a(aVar, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{(readableMap == null || !readableMap.hasKey("true")) ? getThemeColor(aVar.getContext(), "colorAccent") : readableMap.getInt("true"), (readableMap == null || !readableMap.hasKey("false")) ? getThemeColor(aVar.getContext(), "colorPrimaryDark") : readableMap.getInt("false")}));
    }
}
