package com.facebook.react.uimanager;
/* loaded from: classes.dex */
public class d {
    public static boolean a(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) && Float.isNaN(f3) : Math.abs(f3 - f2) < 1.0E-5f;
    }
}
