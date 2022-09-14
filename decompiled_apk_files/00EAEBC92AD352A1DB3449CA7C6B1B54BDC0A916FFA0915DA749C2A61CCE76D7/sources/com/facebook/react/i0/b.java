package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
public interface b<T extends View> {
    void setColor(T t, Integer num);

    void setEnabled(T t, boolean z);

    void setItems(T t, ReadableArray readableArray);

    void setPrompt(T t, String str);

    void setSelected(T t, int i);
}
