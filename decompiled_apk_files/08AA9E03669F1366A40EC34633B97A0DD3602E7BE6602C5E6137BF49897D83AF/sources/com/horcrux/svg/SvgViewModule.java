package com.horcrux.svg;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
/* loaded from: classes.dex */
class SvgViewModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewManager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgViewModule(com.facebook.react.bridge.ah ahVar) {
        super(ahVar);
    }

    @com.facebook.react.bridge.al
    public void toDataURL(int i, com.facebook.react.bridge.d dVar) {
        SvgViewShadowNode shadowNodeByTag = SvgViewManager.getShadowNodeByTag(i);
        if (shadowNodeByTag != null) {
            dVar.a(shadowNodeByTag.toDataURL());
        }
    }
}
