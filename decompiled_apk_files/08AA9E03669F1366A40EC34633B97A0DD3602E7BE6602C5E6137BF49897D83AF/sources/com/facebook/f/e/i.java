package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.spongycastle.crypto.tls.CipherSuite;
/* compiled from: OrientedDrawable.java */
/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: a  reason: collision with root package name */
    final Matrix f2430a;

    /* renamed from: c  reason: collision with root package name */
    private int f2431c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f2432d;
    private final RectF e;

    public i(Drawable drawable, int i) {
        super(drawable);
        this.f2432d = new Matrix();
        this.e = new RectF();
        com.facebook.common.d.i.a(i % 90 == 0);
        this.f2430a = new Matrix();
        this.f2431c = i;
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2431c <= 0) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f2430a);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2431c % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0 ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2431c % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0 ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f2431c > 0) {
            this.f2430a.setRotate(this.f2431c, rect.centerX(), rect.centerY());
            this.f2432d.reset();
            this.f2430a.invert(this.f2432d);
            this.e.set(rect);
            this.f2432d.mapRect(this.e);
            current.setBounds((int) this.e.left, (int) this.e.top, (int) this.e.right, (int) this.e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    @Override // com.facebook.f.e.g, com.facebook.f.e.q
    public void a(Matrix matrix) {
        b(matrix);
        if (!this.f2430a.isIdentity()) {
            matrix.preConcat(this.f2430a);
        }
    }
}
