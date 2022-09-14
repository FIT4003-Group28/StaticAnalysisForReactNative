package com.facebook.react.views.art;

import com.facebook.react.bridge.am;
/* compiled from: PropHelper.java */
/* loaded from: classes.dex */
class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] a(am amVar) {
        if (amVar != null) {
            float[] fArr = new float[amVar.size()];
            a(amVar, fArr);
            return fArr;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(am amVar, float[] fArr) {
        int length = amVar.size() > fArr.length ? fArr.length : amVar.size();
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) amVar.getDouble(i);
        }
        return amVar.size();
    }
}
