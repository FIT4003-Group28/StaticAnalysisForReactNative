package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f5258a = new SparseIntArray(0);

    public static g0 a() {
        return new g0(0, b(), f5258a);
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
