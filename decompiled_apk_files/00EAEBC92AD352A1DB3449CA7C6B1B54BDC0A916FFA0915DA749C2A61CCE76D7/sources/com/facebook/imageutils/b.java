package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Pair<Integer, Integer> f5297a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorSpace f5298b;

    public b(int i, int i2, ColorSpace colorSpace) {
        this.f5297a = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.f5298b = colorSpace;
    }

    public ColorSpace a() {
        return this.f5298b;
    }

    public Pair<Integer, Integer> b() {
        return this.f5297a;
    }
}
