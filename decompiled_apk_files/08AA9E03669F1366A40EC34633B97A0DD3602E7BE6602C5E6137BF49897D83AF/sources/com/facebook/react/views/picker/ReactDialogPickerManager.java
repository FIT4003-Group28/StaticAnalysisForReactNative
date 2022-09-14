package com.facebook.react.views.picker;

import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class ReactDialogPickerManager extends ReactPickerManager {
    protected static final String REACT_CLASS = "AndroidDialogPicker";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo170createViewInstance(af afVar) {
        return new a(afVar, 0);
    }
}
