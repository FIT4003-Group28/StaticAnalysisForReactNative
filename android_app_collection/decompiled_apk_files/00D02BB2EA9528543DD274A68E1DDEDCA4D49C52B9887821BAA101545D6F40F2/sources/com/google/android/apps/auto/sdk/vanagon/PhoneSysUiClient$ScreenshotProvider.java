package com.google.android.apps.auto.sdk.vanagon;

import android.graphics.Bitmap;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface PhoneSysUiClient$ScreenshotProvider {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public interface OnCompleteListener {
        void onScreenshotComplete(Bitmap bitmap);
    }

    void getScreenshot(OnCompleteListener onCompleteListener);
}
