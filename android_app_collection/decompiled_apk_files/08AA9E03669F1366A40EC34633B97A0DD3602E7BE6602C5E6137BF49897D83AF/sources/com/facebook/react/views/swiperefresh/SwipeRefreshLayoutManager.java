package com.facebook.react.views.swiperefresh;

import android.support.v4.widget.n;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.b.f;
import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.util.Map;
/* loaded from: classes.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<a> {
    protected static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo170createViewInstance(af afVar) {
        return new a(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "enabled", f = true)
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = LinearGradientManager.PROP_COLORS, b = "ColorArray")
    public void setColors(a aVar, am amVar) {
        if (amVar != null) {
            int[] iArr = new int[amVar.size()];
            for (int i = 0; i < amVar.size(); i++) {
                iArr[i] = amVar.getInt(i);
            }
            aVar.setColorSchemeColors(iArr);
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @com.facebook.react.uimanager.a.a(a = "progressBackgroundColor", b = "Color", e = 0)
    public void setProgressBackgroundColor(a aVar, int i) {
        aVar.setProgressBackgroundColorSchemeColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "size", e = 1)
    public void setSize(a aVar, int i) {
        aVar.setSize(i);
    }

    @com.facebook.react.uimanager.a.a(a = "refreshing")
    public void setRefreshing(a aVar, boolean z) {
        aVar.setRefreshing(z);
    }

    @com.facebook.react.uimanager.a.a(a = "progressViewOffset", d = BitmapDescriptorFactory.HUE_RED)
    public void setProgressViewOffset(a aVar, float f) {
        aVar.setProgressViewOffset(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final af afVar, final a aVar) {
        aVar.setOnRefreshListener(new n.b() { // from class: com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager.1
            @Override // android.support.v4.widget.n.b
            public void a() {
                ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher().a(new b(aVar.getId()));
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return f.a("SIZE", f.a(NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return f.c().a("topRefresh", f.a("registrationName", "onRefresh")).a();
    }
}
