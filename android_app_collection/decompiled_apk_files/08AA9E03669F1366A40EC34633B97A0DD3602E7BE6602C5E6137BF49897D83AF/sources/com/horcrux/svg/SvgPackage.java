package com.horcrux.svg;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class SvgPackage implements com.facebook.react.n {
    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(com.facebook.react.bridge.ah ahVar) {
        return Arrays.asList(RenderableViewManager.createGroupViewManager(), RenderableViewManager.createPathViewManager(), RenderableViewManager.createCircleViewManager(), RenderableViewManager.createEllipseViewManager(), RenderableViewManager.createLineViewManager(), RenderableViewManager.createRectViewManager(), RenderableViewManager.createTextViewManager(), RenderableViewManager.createTSpanViewManager(), RenderableViewManager.createTextPathViewManager(), RenderableViewManager.createImageViewManager(), RenderableViewManager.createClipPathViewManager(), RenderableViewManager.createDefsViewManager(), RenderableViewManager.createUseViewManager(), RenderableViewManager.createSymbolManager(), RenderableViewManager.createLinearGradientManager(), RenderableViewManager.createRadialGradientManager(), new SvgViewManager());
    }

    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(com.facebook.react.bridge.ah ahVar) {
        return Collections.singletonList(new SvgViewModule(ahVar));
    }
}
