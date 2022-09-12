package com.google.android.apps.gmm.shared.webview;

import android.webkit.JavascriptInterface;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface NativeApi {
    @JavascriptInterface
    void callFunction(String str, String str2, String str3);

    @JavascriptInterface
    void returnValue(String str, String str2, int i);
}
