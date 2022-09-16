package com.facebook.react.views.swiperefresh;

import a.q.a.c;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.f;
import com.facebook.react.i0.i;
import com.facebook.react.i0.j;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import java.util.Map;
@com.facebook.react.d0.a.a(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<com.facebook.react.views.swiperefresh.a> implements j<com.facebook.react.views.swiperefresh.a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final y0<com.facebook.react.views.swiperefresh.a> mDelegate = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0 f6251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.swiperefresh.a f6252b;

        a(SwipeRefreshLayoutManager swipeRefreshLayoutManager, k0 k0Var, com.facebook.react.views.swiperefresh.a aVar) {
            this.f6251a = k0Var;
            this.f6252b = aVar;
        }

        @Override // a.q.a.c.j
        public void a() {
            ((UIManagerModule) this.f6251a.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(this.f6252b.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.swiperefresh.a aVar) {
        aVar.setOnRefreshListener(new a(this, k0Var, aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.swiperefresh.a mo345createViewInstance(k0 k0Var) {
        return new com.facebook.react.views.swiperefresh.a(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected y0<com.facebook.react.views.swiperefresh.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        f.b a2 = f.a();
        a2.a("topRefresh", f.a("registrationName", "onRefresh"));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return f.a("SIZE", f.a("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.swiperefresh.a aVar, String str, ReadableArray readableArray) {
        if (((str.hashCode() == 513968928 && str.equals("setNativeRefreshing")) ? (char) 0 : (char) 65535) == 0 && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.i0.j
    @com.facebook.react.uimanager.e1.a(customType = "ColorArray", name = LinearGradientManager.PROP_COLORS)
    public void setColors(com.facebook.react.views.swiperefresh.a aVar, ReadableArray readableArray) {
        if (readableArray == null) {
            aVar.setColorSchemeColors(new int[0]);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            iArr[i] = readableArray.getInt(i);
        }
        aVar.setColorSchemeColors(iArr);
    }

    @Override // com.facebook.react.i0.j
    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.swiperefresh.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    public void setNativeRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z) {
    }

    @Override // com.facebook.react.i0.j
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(com.facebook.react.views.swiperefresh.a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // com.facebook.react.i0.j
    @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(com.facebook.react.views.swiperefresh.a aVar, float f2) {
        aVar.setProgressViewOffset(f2);
    }

    @Override // com.facebook.react.i0.j
    @com.facebook.react.uimanager.e1.a(name = "refreshing")
    public void setRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z) {
        aVar.setRefreshing(z);
    }

    @Override // com.facebook.react.i0.j
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, int i) {
        aVar.setSize(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "size")
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, Dynamic dynamic) {
        int i;
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.Number) {
                i = dynamic.asInt();
            } else if (dynamic.getType() != ReadableType.String) {
                throw new IllegalArgumentException("Size must be 'default' or 'large'");
            } else {
                String asString = dynamic.asString();
                if (!asString.equals("default")) {
                    if (!asString.equals("large")) {
                        throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + asString);
                    }
                    i = 0;
                }
            }
            aVar.setSize(i);
            return;
        }
        aVar.setSize(1);
    }
}
