package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public interface y {
    void a();

    void a(int i);

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getInitialUITemplate();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    @Deprecated
    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i);

    void setShouldLogContentAppeared(boolean z);
}
