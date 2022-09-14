package com.facebook.react.modules.debug;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.aj;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SourceCodeModule extends BaseJavaModule {
    public static final String NAME = "SourceCode";
    private final aj mReactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SourceCodeModule(aj ajVar) {
        this.mReactContext = ajVar;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) com.facebook.j.a.a.a(this.mReactContext.a().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }
}
