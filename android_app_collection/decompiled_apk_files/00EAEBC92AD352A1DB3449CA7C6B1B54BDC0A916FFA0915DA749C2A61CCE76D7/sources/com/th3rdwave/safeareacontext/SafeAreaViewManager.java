package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.EnumSet;
/* loaded from: classes.dex */
public class SafeAreaViewManager extends ViewGroupManager<g> {
    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public k mo328createShadowNodeInstance() {
        return new k();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public g mo345createViewInstance(k0 k0Var) {
        return new g(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.i> getShadowNodeClass() {
        return k.class;
    }

    @com.facebook.react.uimanager.e1.a(name = "edges")
    public void setEdges(g gVar, ReadableArray readableArray) {
        h hVar;
        EnumSet<h> noneOf = EnumSet.noneOf(h.class);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if ("top".equals(string)) {
                    hVar = h.TOP;
                } else if ("right".equals(string)) {
                    hVar = h.RIGHT;
                } else if ("bottom".equals(string)) {
                    hVar = h.BOTTOM;
                } else if ("left".equals(string)) {
                    hVar = h.LEFT;
                }
                noneOf.add(hVar);
            }
        }
        gVar.setEdges(noneOf);
    }

    @com.facebook.react.uimanager.e1.a(name = "mode")
    public void setMode(g gVar, String str) {
        j jVar;
        if ("padding".equals(str)) {
            jVar = j.PADDING;
        } else if (!"margin".equals(str)) {
            return;
        } else {
            jVar = j.MARGIN;
        }
        gVar.setMode(jVar);
    }
}
