package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* compiled from: DefaultFlexByteArrayPoolParams.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2952a = Runtime.getRuntime().availableProcessors();

    public static SparseIntArray a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    public static t a() {
        return new t(4194304, f2952a * 4194304, a(131072, 4194304, f2952a), 131072, 4194304, f2952a);
    }
}
