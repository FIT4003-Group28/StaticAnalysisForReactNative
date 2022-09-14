package com.facebook.react.views.drawer;

import a.j.a.a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.f;
import com.facebook.react.i0.c;
import com.facebook.react.i0.d;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import com.facebook.react.views.drawer.b.b;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactDrawerLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<com.facebook.react.views.drawer.a> implements d<com.facebook.react.views.drawer.a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final y0<com.facebook.react.views.drawer.a> mDelegate = new c(this);

    /* loaded from: classes.dex */
    public static class a implements a.d {

        /* renamed from: a  reason: collision with root package name */
        private final a.j.a.a f6146a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.react.uimanager.events.d f6147b;

        public a(a.j.a.a aVar, com.facebook.react.uimanager.events.d dVar) {
            this.f6146a = aVar;
            this.f6147b = dVar;
        }

        @Override // a.j.a.a.d
        public void a(int i) {
            this.f6147b.a(new com.facebook.react.views.drawer.b.d(this.f6146a.getId(), i));
        }

        @Override // a.j.a.a.d
        public void a(View view) {
            this.f6147b.a(new b(this.f6146a.getId()));
        }

        @Override // a.j.a.a.d
        public void a(View view, float f2) {
            this.f6147b.a(new com.facebook.react.views.drawer.b.c(this.f6146a.getId(), f2));
        }

        @Override // a.j.a.a.d
        public void b(View view) {
            this.f6147b.a(new com.facebook.react.views.drawer.b.a(this.f6146a.getId()));
        }
    }

    private void setDrawerPositionInternal(com.facebook.react.views.drawer.a aVar, String str) {
        int i;
        if (str.equals("left")) {
            i = 8388611;
        } else if (!str.equals("right")) {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be 'left' or 'right', received" + str);
        } else {
            i = 8388613;
        }
        aVar.g(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.drawer.a aVar) {
        aVar.a(new a(aVar, ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.facebook.react.views.drawer.a aVar, View view, int i) {
        if (getChildCount(aVar) < 2) {
            if (i == 0 || i == 1) {
                aVar.addView(view, i);
                aVar.g();
                return;
            }
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
        throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
    }

    public void closeDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.drawer.a mo345createViewInstance(k0 k0Var) {
        return new com.facebook.react.views.drawer.a(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a("openDrawer", 1, "closeDrawer", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<com.facebook.react.views.drawer.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topDrawerSlide", f.a("registrationName", "onDrawerSlide"), "topDrawerOpen", f.a("registrationName", "onDrawerOpen"), "topDrawerClose", f.a("registrationName", "onDrawerClose"), "topDrawerStateChanged", f.a("registrationName", "onDrawerStateChanged"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return f.a("DrawerPosition", f.a("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void openDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.f();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            aVar.f();
        } else if (i != 2) {
        } else {
            aVar.e();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, String str, ReadableArray readableArray) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != -258774775) {
            if (hashCode == -83186725 && str.equals("openDrawer")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("closeDrawer")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            aVar.f();
        } else if (c2 != 1) {
        } else {
            aVar.e();
        }
    }

    @Override // com.facebook.react.i0.d
    public void setDrawerBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    @Override // com.facebook.react.i0.d
    @com.facebook.react.uimanager.e1.a(name = "drawerLockMode")
    public void setDrawerLockMode(com.facebook.react.views.drawer.a aVar, String str) {
        int i;
        if (str == null || "unlocked".equals(str)) {
            i = 0;
        } else if ("locked-closed".equals(str)) {
            i = 1;
        } else if (!"locked-open".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
        } else {
            i = 2;
        }
        aVar.setDrawerLockMode(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "drawerPosition")
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.g(8388611);
        } else if (dynamic.getType() != ReadableType.Number) {
            if (dynamic.getType() != ReadableType.String) {
                throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
            }
            setDrawerPositionInternal(aVar, dynamic.asString());
        } else {
            int asInt = dynamic.asInt();
            if (8388611 == asInt || 8388613 == asInt) {
                aVar.g(asInt);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + asInt);
        }
    }

    @Override // com.facebook.react.i0.d
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, String str) {
        if (str == null) {
            aVar.g(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, float f2) {
        aVar.h(Float.isNaN(f2) ? -1 : Math.round(q.b(f2)));
    }

    @Override // com.facebook.react.i0.d
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, Float f2) {
        aVar.h(f2 == null ? -1 : Math.round(q.b(f2.floatValue())));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setElevation(com.facebook.react.views.drawer.a aVar, float f2) {
        aVar.setDrawerElevation(q.b(f2));
    }

    @Override // com.facebook.react.i0.d
    public void setKeyboardDismissMode(com.facebook.react.views.drawer.a aVar, String str) {
    }

    @Override // com.facebook.react.i0.d
    public void setStatusBarBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }
}
