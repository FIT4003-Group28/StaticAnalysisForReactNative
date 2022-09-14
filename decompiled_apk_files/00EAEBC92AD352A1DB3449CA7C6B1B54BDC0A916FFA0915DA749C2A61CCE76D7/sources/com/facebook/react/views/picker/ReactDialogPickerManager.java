package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
@com.facebook.react.d0.a.a(name = ReactDialogPickerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactDialogPickerManager extends ReactPickerManager implements com.facebook.react.i0.b<a> {
    public static final String REACT_CLASS = "AndroidDialogPicker";
    private final y0<a> mDelegate = new com.facebook.react.i0.a(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo345createViewInstance(k0 k0Var) {
        return new a(k0Var, 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.i0.b
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(a aVar, Integer num) {
        super.setColor(aVar, num);
    }

    @Override // com.facebook.react.i0.b
    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(a aVar, boolean z) {
        super.setEnabled(aVar, z);
    }

    @Override // com.facebook.react.i0.b
    @com.facebook.react.uimanager.e1.a(name = "items")
    public /* bridge */ /* synthetic */ void setItems(a aVar, ReadableArray readableArray) {
        super.setItems(aVar, readableArray);
    }

    @Override // com.facebook.react.i0.b
    @com.facebook.react.uimanager.e1.a(name = "prompt")
    public /* bridge */ /* synthetic */ void setPrompt(a aVar, String str) {
        super.setPrompt(aVar, str);
    }

    @Override // com.facebook.react.i0.b
    @com.facebook.react.uimanager.e1.a(name = "selected")
    public /* bridge */ /* synthetic */ void setSelected(a aVar, int i) {
        super.setSelected(aVar, i);
    }
}
