package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.i0.o;
import com.facebook.react.i0.p;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import com.facebook.react.views.modal.d;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactModalHostManager extends ViewGroupManager<d> implements p<d> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final y0<d> mDelegate = new o(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f6164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f6165b;

        a(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, d dVar2) {
            this.f6164a = dVar;
            this.f6165b = dVar2;
        }

        @Override // com.facebook.react.views.modal.d.c
        public void a(DialogInterface dialogInterface) {
            this.f6164a.a(new e(this.f6165b.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f6166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f6167b;

        b(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, d dVar2) {
            this.f6166a = dVar;
            this.f6167b = dVar2;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.f6166a.a(new f(this.f6167b.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, d dVar) {
        com.facebook.react.uimanager.events.d eventDispatcher = ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        dVar.setOnRequestCloseListener(new a(this, eventDispatcher, dVar));
        dVar.setOnShowListener(new b(this, eventDispatcher, dVar));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public i mo328createShadowNodeInstance() {
        return new com.facebook.react.views.modal.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo345createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<d> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("topRequestClose", com.facebook.react.common.f.a("registrationName", "onRequestClose"));
        a2.a("topShow", com.facebook.react.common.f.a("registrationName", "onShow"));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends i> getShadowNodeClass() {
        return com.facebook.react.views.modal.b.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(d dVar) {
        super.onAfterUpdateTransaction((ReactModalHostManager) dVar);
        dVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(d dVar) {
        super.onDropViewInstance((ReactModalHostManager) dVar);
        dVar.a();
    }

    @Override // com.facebook.react.i0.p
    public void setAnimated(d dVar, boolean z) {
    }

    @Override // com.facebook.react.i0.p
    @com.facebook.react.uimanager.e1.a(name = "animationType")
    public void setAnimationType(d dVar, String str) {
        if (str != null) {
            dVar.setAnimationType(str);
        }
    }

    @Override // com.facebook.react.i0.p
    @com.facebook.react.uimanager.e1.a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(d dVar, boolean z) {
        dVar.setHardwareAccelerated(z);
    }

    @Override // com.facebook.react.i0.p
    public void setIdentifier(d dVar, int i) {
    }

    @Override // com.facebook.react.i0.p
    public void setPresentationStyle(d dVar, String str) {
    }

    @Override // com.facebook.react.i0.p
    @com.facebook.react.uimanager.e1.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(d dVar, boolean z) {
        dVar.setStatusBarTranslucent(z);
    }

    @Override // com.facebook.react.i0.p
    public void setSupportedOrientations(d dVar, ReadableArray readableArray) {
    }

    @Override // com.facebook.react.i0.p
    @com.facebook.react.uimanager.e1.a(name = "transparent")
    public void setTransparent(d dVar, boolean z) {
        dVar.setTransparent(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d dVar, c0 c0Var, j0 j0Var) {
        Point a2 = com.facebook.react.views.modal.a.a(dVar.getContext());
        dVar.a(j0Var, a2.x, a2.y);
        return null;
    }
}
