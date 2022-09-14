package com.facebook.react.views.art;

import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ReadableArray readableArray, float[] fArr) {
        int length = readableArray.size() > fArr.length ? fArr.length : readableArray.size();
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        return readableArray.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] a(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = new float[readableArray.size()];
            a(readableArray, fArr);
            return fArr;
        }
        return null;
    }
}
