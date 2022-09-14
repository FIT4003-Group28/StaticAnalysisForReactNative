package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;
/* compiled from: PoolParams.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f2977a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2978b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f2979c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2980d;
    public final int e;
    public final int f;

    public t(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1);
    }

    public t(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        com.facebook.common.d.i.b(i >= 0 && i2 >= i);
        this.f2978b = i;
        this.f2977a = i2;
        this.f2979c = sparseIntArray;
        this.f2980d = i3;
        this.e = i4;
        this.f = i5;
    }
}
