package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.b.f;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.n;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.o;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactImageManager extends SimpleViewManager<e> {
    protected static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private com.facebook.f.c.b mDraweeControllerBuilder;
    private a mGlobalImageLoadListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ReactImageManager(com.facebook.f.c.b bVar, Object obj) {
        this(bVar, null, obj);
    }

    public ReactImageManager(com.facebook.f.c.b bVar, a aVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }

    public com.facebook.f.c.b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = com.facebook.f.a.a.c.a();
        }
        return this.mDraweeControllerBuilder;
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public e mo170createViewInstance(af afVar) {
        return new e(afVar, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    @com.facebook.react.uimanager.a.a(a = "src")
    public void setSource(e eVar, am amVar) {
        eVar.setSource(amVar);
    }

    @com.facebook.react.uimanager.a.a(a = "blurRadius")
    public void setBlurRadius(e eVar, float f) {
        eVar.setBlurRadius(f);
    }

    @com.facebook.react.uimanager.a.a(a = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(e eVar, String str) {
        eVar.setLoadingIndicatorSource(str);
    }

    @com.facebook.react.uimanager.a.a(a = "borderColor", b = "Color")
    public void setBorderColor(e eVar, Integer num) {
        if (num == null) {
            eVar.setBorderColor(0);
        } else {
            eVar.setBorderColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.a.a(a = "overlayColor")
    public void setOverlayColor(e eVar, Integer num) {
        if (num == null) {
            eVar.setOverlayColor(0);
        } else {
            eVar.setOverlayColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderWidth")
    public void setBorderWidth(e eVar, float f) {
        eVar.setBorderWidth(f);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"}, c = Float.NaN)
    public void setBorderRadius(e eVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        if (i == 0) {
            eVar.setBorderRadius(f);
        } else {
            eVar.a(f, i - 1);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "resizeMode")
    public void setResizeMode(e eVar, String str) {
        eVar.setScaleType(d.a(str));
    }

    @com.facebook.react.uimanager.a.a(a = "resizeMethod")
    public void setResizeMethod(e eVar, String str) {
        if (str == null || "auto".equals(str)) {
            eVar.setResizeMethod(c.AUTO);
        } else if ("resize".equals(str)) {
            eVar.setResizeMethod(c.RESIZE);
        } else if ("scale".equals(str)) {
            eVar.setResizeMethod(c.SCALE);
        } else {
            throw new n("Invalid resize method: '" + str + "'");
        }
    }

    @com.facebook.react.uimanager.a.a(a = "tintColor", b = "Color")
    public void setTintColor(e eVar, Integer num) {
        if (num == null) {
            eVar.clearColorFilter();
        } else {
            eVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(e eVar, boolean z) {
        eVar.setProgressiveRenderingEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "fadeDuration")
    public void setFadeDuration(e eVar, int i) {
        eVar.setFadeDuration(i);
    }

    @com.facebook.react.uimanager.a.a(a = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(e eVar, boolean z) {
        eVar.setShouldNotifyLoadEvents(z);
    }

    @com.facebook.react.uimanager.a.a(a = "headers")
    public void setHeaders(e eVar, an anVar) {
        eVar.setHeaders(anVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a(b.b(4), f.a("registrationName", "onLoadStart"), b.b(2), f.a("registrationName", "onLoad"), b.b(1), f.a("registrationName", "onError"), b.b(3), f.a("registrationName", "onLoadEnd"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(e eVar) {
        super.onAfterUpdateTransaction((ReactImageManager) eVar);
        eVar.e();
    }
}
