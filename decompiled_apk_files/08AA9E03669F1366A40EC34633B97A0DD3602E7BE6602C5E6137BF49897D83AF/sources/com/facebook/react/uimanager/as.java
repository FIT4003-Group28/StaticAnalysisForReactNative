package com.facebook.react.uimanager;

import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ViewManagerRegistry.java */
/* loaded from: classes.dex */
public final class as {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ViewManager> f3823a;

    /* renamed from: b  reason: collision with root package name */
    private final UIManagerModule.c f3824b;

    public as(UIManagerModule.c cVar) {
        this.f3823a = com.facebook.react.b.f.a();
        this.f3824b = cVar;
    }

    public as(List<ViewManager> list) {
        HashMap a2 = com.facebook.react.b.f.a();
        for (ViewManager viewManager : list) {
            a2.put(viewManager.getName(), viewManager);
        }
        this.f3823a = a2;
        this.f3824b = null;
    }

    public ViewManager a(String str) {
        ViewManager a2;
        ViewManager viewManager = this.f3823a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f3824b != null && (a2 = this.f3824b.a(str)) != null) {
            this.f3823a.put(str, a2);
            return a2;
        }
        throw new e("No ViewManager defined for class " + str);
    }
}
