package com.facebook.f.f;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.f.e.g;
import com.facebook.f.e.r;
import com.facebook.f.e.s;
/* compiled from: RootDrawable.java */
/* loaded from: classes.dex */
public class c extends g implements r {

    /* renamed from: a  reason: collision with root package name */
    Drawable f2463a;

    /* renamed from: c  reason: collision with root package name */
    private s f2464c;

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    public c(Drawable drawable) {
        super(drawable);
        this.f2463a = null;
    }

    @Override // com.facebook.f.e.r
    public void a(s sVar) {
        this.f2464c = sVar;
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f2464c != null) {
            this.f2464c.a(z);
        }
        return super.setVisible(z, z2);
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (!isVisible()) {
            return;
        }
        if (this.f2464c != null) {
            this.f2464c.a();
        }
        super.draw(canvas);
        if (this.f2463a == null) {
            return;
        }
        this.f2463a.setBounds(getBounds());
        this.f2463a.draw(canvas);
    }

    public void d(Drawable drawable) {
        this.f2463a = drawable;
        invalidateSelf();
    }
}
