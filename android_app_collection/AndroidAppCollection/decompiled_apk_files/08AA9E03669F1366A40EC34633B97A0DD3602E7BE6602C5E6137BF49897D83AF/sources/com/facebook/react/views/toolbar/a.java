package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import com.facebook.f.e.g;
import com.facebook.imagepipeline.i.e;
/* compiled from: DrawableWithIntrinsicSize.java */
/* loaded from: classes.dex */
public class a extends g implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final e f4162a;

    public a(Drawable drawable, e eVar) {
        super(drawable);
        this.f4162a = eVar;
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4162a.f();
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4162a.g();
    }
}
