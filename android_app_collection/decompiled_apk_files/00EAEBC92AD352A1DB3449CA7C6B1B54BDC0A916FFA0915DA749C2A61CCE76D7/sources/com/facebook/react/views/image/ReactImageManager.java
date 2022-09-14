package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactImageManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactImageManager extends SimpleViewManager<g> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private final f mCallerContextFactory;
    private c.d.h.c.b mDraweeControllerBuilder;
    private a mGlobalImageLoadListener;

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
        this.mCallerContextFactory = null;
    }

    public ReactImageManager(c.d.h.c.b bVar, a aVar, f fVar) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContextFactory = fVar;
        this.mCallerContext = null;
    }

    @Deprecated
    public ReactImageManager(c.d.h.c.b bVar, a aVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
        this.mCallerContextFactory = null;
    }

    public ReactImageManager(c.d.h.c.b bVar, f fVar) {
        this(bVar, (a) null, fVar);
    }

    @Deprecated
    public ReactImageManager(c.d.h.c.b bVar, Object obj) {
        this(bVar, (a) null, obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public g mo345createViewInstance(k0 k0Var) {
        f fVar = this.mCallerContextFactory;
        return new g(k0Var, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, fVar != null ? fVar.a(k0Var) : getCallerContext());
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public c.d.h.c.b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = c.d.h.a.a.c.d();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.f.a(b.b(4), com.facebook.react.common.f.a("registrationName", "onLoadStart"), b.b(2), com.facebook.react.common.f.a("registrationName", "onLoad"), b.b(1), com.facebook.react.common.f.a("registrationName", "onError"), b.b(3), com.facebook.react.common.f.a("registrationName", "onLoadEnd"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(g gVar) {
        super.onAfterUpdateTransaction((ReactImageManager) gVar);
        gVar.e();
    }

    @com.facebook.react.uimanager.e1.a(name = "blurRadius")
    public void setBlurRadius(g gVar, float f2) {
        gVar.setBlurRadius(f2);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "borderColor")
    public void setBorderColor(g gVar, Integer num) {
        gVar.setBorderColor(num == null ? 0 : num.intValue());
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(g gVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        if (i == 0) {
            gVar.setBorderRadius(f2);
        } else {
            gVar.a(f2, i - 1);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "borderWidth")
    public void setBorderWidth(g gVar, float f2) {
        gVar.setBorderWidth(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "defaultSrc")
    public void setDefaultSource(g gVar, String str) {
        gVar.setDefaultSource(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "fadeDuration")
    public void setFadeDuration(g gVar, int i) {
        gVar.setFadeDuration(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "headers")
    public void setHeaders(g gVar, ReadableMap readableMap) {
        gVar.setHeaders(readableMap);
    }

    @com.facebook.react.uimanager.e1.a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(g gVar, boolean z) {
        gVar.setShouldNotifyLoadEvents(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(g gVar, String str) {
        gVar.setLoadingIndicatorSource(str);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(g gVar, Integer num) {
        gVar.setOverlayColor(num == null ? 0 : num.intValue());
    }

    @com.facebook.react.uimanager.e1.a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(g gVar, boolean z) {
        gVar.setProgressiveRenderingEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "resizeMethod")
    public void setResizeMethod(g gVar, String str) {
        c cVar;
        if (str == null || "auto".equals(str)) {
            cVar = c.AUTO;
        } else if ("resize".equals(str)) {
            cVar = c.RESIZE;
        } else if (!"scale".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
        } else {
            cVar = c.SCALE;
        }
        gVar.setResizeMethod(cVar);
    }

    @com.facebook.react.uimanager.e1.a(name = "resizeMode")
    public void setResizeMode(g gVar, String str) {
        gVar.setScaleType(d.a(str));
        gVar.setTileMode(d.b(str));
    }

    @com.facebook.react.uimanager.e1.a(name = "src")
    public void setSource(g gVar, ReadableArray readableArray) {
        gVar.setSource(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "tintColor")
    public void setTintColor(g gVar, Integer num) {
        if (num == null) {
            gVar.clearColorFilter();
        } else {
            gVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
