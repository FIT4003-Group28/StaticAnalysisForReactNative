package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.b.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.g;
import com.facebook.react.views.modal.c;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactModalHostManager extends ViewGroupManager<c> {
    protected static final String REACT_CLASS = "RCTModalHostView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c mo170createViewInstance(af afVar) {
        return new c(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public g mo168createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends g> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(c cVar) {
        super.onDropViewInstance((ReactModalHostManager) cVar);
        cVar.a();
    }

    @com.facebook.react.uimanager.a.a(a = "animationType")
    public void setAnimationType(c cVar, String str) {
        cVar.setAnimationType(str);
    }

    @com.facebook.react.uimanager.a.a(a = "transparent")
    public void setTransparent(c cVar, boolean z) {
        cVar.setTransparent(z);
    }

    @com.facebook.react.uimanager.a.a(a = "hardwareAccelerated")
    public void setHardwareAccelerated(c cVar, boolean z) {
        cVar.setHardwareAccelerated(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, final c cVar) {
        final com.facebook.react.uimanager.events.c eventDispatcher = ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher();
        cVar.setOnRequestCloseListener(new c.b() { // from class: com.facebook.react.views.modal.ReactModalHostManager.1
            @Override // com.facebook.react.views.modal.c.b
            public void a(DialogInterface dialogInterface) {
                eventDispatcher.a(new d(cVar.getId()));
            }
        });
        cVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.ReactModalHostManager.2
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                eventDispatcher.a(new e(cVar.getId()));
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return f.c().a("topRequestClose", f.a("registrationName", "onRequestClose")).a("topShow", f.a("registrationName", "onShow")).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(c cVar) {
        super.onAfterUpdateTransaction((ReactModalHostManager) cVar);
        cVar.b();
    }
}
