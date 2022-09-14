package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* compiled from: DefaultBitmapPoolParams.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f2951a = new SparseIntArray(0);

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }

    public static t a() {
        return new t(0, b(), f2951a);
    }
}
