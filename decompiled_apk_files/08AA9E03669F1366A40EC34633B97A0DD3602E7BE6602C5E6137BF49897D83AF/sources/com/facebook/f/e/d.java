package com.facebook.f.e;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: DrawableProperties.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f2415a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2416b = false;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f2417c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f2418d = -1;
    private int e = -1;

    public void a(int i) {
        this.f2415a = i;
    }

    public void a(ColorFilter colorFilter) {
        this.f2417c = colorFilter;
        this.f2416b = true;
    }

    public void a(boolean z) {
        this.f2418d = z ? 1 : 0;
    }

    public void b(boolean z) {
        this.e = z ? 1 : 0;
    }

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (this.f2415a != -1) {
            drawable.setAlpha(this.f2415a);
        }
        if (this.f2416b) {
            drawable.setColorFilter(this.f2417c);
        }
        boolean z = false;
        if (this.f2418d != -1) {
            drawable.setDither(this.f2418d != 0);
        }
        if (this.e == -1) {
            return;
        }
        if (this.e != 0) {
            z = true;
        }
        drawable.setFilterBitmap(z);
    }
}
