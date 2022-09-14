package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.picker.a;
/* loaded from: classes.dex */
public abstract class ReactPickerManager extends SimpleViewManager<com.facebook.react.views.picker.a> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.react.views.picker.a f6186a;

        /* renamed from: b  reason: collision with root package name */
        private final d f6187b;

        public a(com.facebook.react.views.picker.a aVar, d dVar) {
            this.f6186a = aVar;
            this.f6187b = dVar;
        }

        @Override // com.facebook.react.views.picker.a.c
        public void a(int i) {
            this.f6187b.a(new com.facebook.react.views.picker.d.a(this.f6186a.getId(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.picker.a aVar) {
        aVar.setOnSelectListener(new a(aVar, ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.picker.a aVar) {
        super.onAfterUpdateTransaction((ReactPickerManager) aVar);
        aVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.picker.a aVar, String str, ReadableArray readableArray) {
        if (((str.hashCode() == -729039331 && str.equals("setNativeSelectedPosition")) ? (char) 0 : (char) 65535) == 0 && readableArray != null) {
            aVar.setImmediateSelection(readableArray.getInt(0));
        }
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
    public void setColor(com.facebook.react.views.picker.a aVar, Integer num) {
        aVar.setStagedPrimaryTextColor(num);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.picker.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "items")
    public void setItems(com.facebook.react.views.picker.a aVar, ReadableArray readableArray) {
        aVar.setStagedItems(c.a(readableArray));
    }

    @com.facebook.react.uimanager.e1.a(name = "prompt")
    public void setPrompt(com.facebook.react.views.picker.a aVar, String str) {
        aVar.setPrompt(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "selected")
    public void setSelected(com.facebook.react.views.picker.a aVar, int i) {
        aVar.setStagedSelection(i);
    }
}
