package com.facebook.react.uimanager;
/* compiled from: FloatUtil.java */
/* loaded from: classes.dex */
public class c {
    public static boolean a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f2 - f) < 1.0E-5f;
    }
}
