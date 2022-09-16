package com.facebook.react.flat;

import android.graphics.Canvas;
import android.text.Layout;
/* compiled from: DrawTextLayout.java */
/* loaded from: classes.dex */
final class l extends b {

    /* renamed from: c  reason: collision with root package name */
    private Layout f3401c;

    /* renamed from: d  reason: collision with root package name */
    private float f3402d;
    private float e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Layout layout) {
        a(layout);
    }

    public void a(Layout layout) {
        this.f3401c = layout;
        this.f3402d = layout.getWidth();
        this.e = com.facebook.g.a.c.a.b(layout);
    }

    public float a() {
        return this.f3402d;
    }

    public float b() {
        return this.e;
    }

    @Override // com.facebook.react.flat.b
    protected void c(Canvas canvas) {
        float n = n();
        float o = o();
        canvas.translate(n, o);
        this.f3401c.draw(canvas);
        canvas.translate(-n, -o);
    }
}
