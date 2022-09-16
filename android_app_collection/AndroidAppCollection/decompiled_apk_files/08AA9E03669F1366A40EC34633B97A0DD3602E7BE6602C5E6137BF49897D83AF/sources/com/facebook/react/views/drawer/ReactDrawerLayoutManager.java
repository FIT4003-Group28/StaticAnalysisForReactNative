package com.facebook.react.views.drawer;

import android.os.Build;
import android.support.v4.widget.g;
import android.view.View;
import com.facebook.react.b.f;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.n;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.o;
import com.facebook.react.views.drawer.a.b;
import com.facebook.react.views.drawer.a.d;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<com.facebook.react.views.drawer.a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    protected static final String REACT_CLASS = "AndroidDrawerLayout";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, com.facebook.react.views.drawer.a aVar) {
        aVar.setDrawerListener(new a(aVar, ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.drawer.a mo170createViewInstance(af afVar) {
        return new com.facebook.react.views.drawer.a(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "drawerPosition", e = 8388611)
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, int i) {
        if (8388611 == i || 8388613 == i) {
            aVar.g(i);
            return;
        }
        throw new n("Unknown drawerPosition " + i);
    }

    @com.facebook.react.uimanager.a.a(a = "drawerWidth", d = Float.NaN)
    public void getDrawerWidth(com.facebook.react.views.drawer.a aVar, float f) {
        aVar.h(Float.isNaN(f) ? -1 : Math.round(o.a(f)));
    }

    @com.facebook.react.uimanager.a.a(a = "drawerLockMode")
    public void setDrawerLockMode(com.facebook.react.views.drawer.a aVar, String str) {
        if (str == null || "unlocked".equals(str)) {
            aVar.setDrawerLockMode(0);
        } else if ("locked-closed".equals(str)) {
            aVar.setDrawerLockMode(1);
        } else if ("locked-open".equals(str)) {
            aVar.setDrawerLockMode(2);
        } else {
            throw new n("Unknown drawerLockMode " + str);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(com.facebook.react.views.drawer.a aVar, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                com.facebook.react.views.drawer.a.class.getMethod("setDrawerElevation", Float.TYPE).invoke(aVar, Float.valueOf(o.a(f)));
            } catch (Exception e) {
                com.facebook.common.e.a.a("ReactNative", "setDrawerElevation is not available in this version of the support lib.", e);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a("openDrawer", 1, "closeDrawer", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, int i, am amVar) {
        switch (i) {
            case 1:
                aVar.e();
                return;
            case 2:
                aVar.f();
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return f.a("DrawerPosition", f.a("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topDrawerSlide", f.a("registrationName", "onDrawerSlide"), "topDrawerOpened", f.a("registrationName", "onDrawerOpen"), "topDrawerClosed", f.a("registrationName", "onDrawerClose"), "topDrawerStateChanged", f.a("registrationName", "onDrawerStateChanged"));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.facebook.react.views.drawer.a aVar, View view, int i) {
        if (getChildCount(aVar) >= 2) {
            throw new n("The Drawer cannot have more than two children");
        }
        if (i != 0 && i != 1) {
            throw new n("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
        aVar.addView(view, i);
        aVar.g();
    }

    /* loaded from: classes.dex */
    public static class a implements g.c {

        /* renamed from: a  reason: collision with root package name */
        private final g f3959a;

        /* renamed from: b  reason: collision with root package name */
        private final c f3960b;

        public a(g gVar, c cVar) {
            this.f3959a = gVar;
            this.f3960b = cVar;
        }

        @Override // android.support.v4.widget.g.c
        public void a(View view, float f) {
            this.f3960b.a(new com.facebook.react.views.drawer.a.c(this.f3959a.getId(), f));
        }

        @Override // android.support.v4.widget.g.c
        public void a(View view) {
            this.f3960b.a(new b(this.f3959a.getId()));
        }

        @Override // android.support.v4.widget.g.c
        public void b(View view) {
            this.f3960b.a(new com.facebook.react.views.drawer.a.a(this.f3959a.getId()));
        }

        @Override // android.support.v4.widget.g.c
        public void a(int i) {
            this.f3960b.a(new d(this.f3959a.getId(), i));
        }
    }
}
