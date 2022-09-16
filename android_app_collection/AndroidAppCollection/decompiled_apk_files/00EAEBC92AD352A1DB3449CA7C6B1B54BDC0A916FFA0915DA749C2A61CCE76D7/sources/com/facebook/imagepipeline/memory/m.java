package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5259a = Runtime.getRuntime().availableProcessors();

    public static SparseIntArray a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    public static g0 a() {
        int i = f5259a;
        return new g0(4194304, i * 4194304, a(131072, 4194304, i), 131072, 4194304, f5259a);
    }
}
