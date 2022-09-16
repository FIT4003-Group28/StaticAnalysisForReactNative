package com.facebook.react.views.progressbar;

import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.n;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class ReactProgressBarViewManager extends BaseViewManager<a, b> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    protected static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a aVar, Object obj) {
    }

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo170createViewInstance(af afVar) {
        return new a(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_STYLE)
    public void setStyle(a aVar, String str) {
        aVar.a(str);
    }

    @com.facebook.react.uimanager.a.a(a = "color", b = "Color")
    public void setColor(a aVar, Integer num) {
        aVar.a(num);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_INDETERMINATE)
    public void setIndeterminate(a aVar, boolean z) {
        aVar.a(z);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_PROGRESS)
    public void setProgress(a aVar, double d2) {
        aVar.a(d2);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_ANIMATING)
    public void setAnimating(a aVar, boolean z) {
        aVar.b(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public b mo168createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getStyleFromString(String str) {
        if (str == null) {
            throw new n("ProgressBar needs to have a style, null received");
        }
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
        throw new n("Unknown ProgressBar style: " + str);
    }
}
