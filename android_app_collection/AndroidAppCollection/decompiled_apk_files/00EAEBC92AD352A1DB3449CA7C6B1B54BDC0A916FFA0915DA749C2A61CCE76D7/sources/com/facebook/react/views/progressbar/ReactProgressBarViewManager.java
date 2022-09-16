package com.facebook.react.views.progressbar;

import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.i0.g;
import com.facebook.react.i0.h;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
@com.facebook.react.d0.a.a(name = ReactProgressBarViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactProgressBarViewManager extends BaseViewManager<a, b> implements h<a> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();
    private final y0<a> mDelegate = new g(this);

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getStyleFromString(String str) {
        if (str != null) {
            if (str.equals("Horizontal")) {
                return 16842872;
            }
            if (str.equals("Small")) {
                return 16842873;
            }
            if (str.equals("Large")) {
                return 16842874;
            }
            if (str.equals("Inverse")) {
                return 16843399;
            }
            if (str.equals("SmallInverse")) {
                return 16843400;
            }
            if (str.equals("LargeInverse")) {
                return 16843401;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return 16842871;
            }
            throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: " + str);
        }
        throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public b mo328createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo345createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.a();
    }

    @Override // com.facebook.react.i0.h
    @com.facebook.react.uimanager.e1.a(name = PROP_ANIMATING)
    public void setAnimating(a aVar, boolean z) {
        aVar.a(z);
    }

    @Override // com.facebook.react.i0.h
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
    public void setColor(a aVar, Integer num) {
        aVar.a(num);
    }

    @Override // com.facebook.react.i0.h
    @com.facebook.react.uimanager.e1.a(name = PROP_INDETERMINATE)
    public void setIndeterminate(a aVar, boolean z) {
        aVar.b(z);
    }

    @Override // com.facebook.react.i0.h
    @com.facebook.react.uimanager.e1.a(name = PROP_PROGRESS)
    public void setProgress(a aVar, double d2) {
        aVar.a(d2);
    }

    @Override // com.facebook.react.i0.h
    @com.facebook.react.uimanager.e1.a(name = PROP_STYLE)
    public void setStyleAttr(a aVar, String str) {
        aVar.a(str);
    }

    @Override // com.facebook.react.i0.h
    public void setTestID(a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // com.facebook.react.i0.h
    public void setTypeAttr(a aVar, String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a aVar, Object obj) {
    }
}
