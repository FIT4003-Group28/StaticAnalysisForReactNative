package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5250a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5251b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f5252c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5253d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5254e;

    public g0(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public g0(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        c.d.d.d.i.b(i >= 0 && i2 >= i);
        this.f5251b = i;
        this.f5250a = i2;
        this.f5252c = sparseIntArray;
        this.f5254e = i5;
    }
}
