package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.v;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements v {
    @Override // com.facebook.react.v
    public List<RNCWebViewModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        List<RNCWebViewModule> a2;
        f.c.a.b.b(reactApplicationContext, "reactContext");
        a2 = f.b.b.a(new RNCWebViewModule(reactApplicationContext));
        return a2;
    }

    @Override // com.facebook.react.v
    public List<RNCWebViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<RNCWebViewManager> a2;
        f.c.a.b.b(reactApplicationContext, "reactContext");
        a2 = f.b.b.a(new RNCWebViewManager());
        return a2;
    }
}
