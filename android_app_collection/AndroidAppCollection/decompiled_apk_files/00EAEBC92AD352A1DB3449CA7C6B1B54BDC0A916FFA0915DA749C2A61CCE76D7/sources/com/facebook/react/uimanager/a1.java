package com.facebook.react.uimanager;

import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ViewManager> f5864a;

    /* renamed from: b  reason: collision with root package name */
    private final UIManagerModule.g f5865b;

    public a1(UIManagerModule.g gVar) {
        this.f5864a = com.facebook.react.common.f.b();
        this.f5865b = gVar;
    }

    public a1(List<ViewManager> list) {
        HashMap b2 = com.facebook.react.common.f.b();
        for (ViewManager viewManager : list) {
            b2.put(viewManager.getName(), viewManager);
        }
        this.f5864a = b2;
        this.f5865b = null;
    }

    private ViewManager c(String str) {
        ViewManager a2 = this.f5865b.a(str);
        if (a2 != null) {
            this.f5864a.put(str, a2);
        }
        return a2;
    }

    public ViewManager a(String str) {
        ViewManager viewManager = this.f5864a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f5865b == null) {
            throw new g("No ViewManager found for class " + str);
        }
        ViewManager c2 = c(str);
        if (c2 != null) {
            return c2;
        }
        throw new g("ViewManagerResolver returned null for " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewManager b(String str) {
        ViewManager viewManager = this.f5864a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f5865b == null) {
            return null;
        }
        return c(str);
    }
}
