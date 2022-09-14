package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawView.java */
/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final m[] f3403c = new m[0];

    /* renamed from: d  reason: collision with root package name */
    final int f3404d;
    private final RectF e = new RectF();
    private float f;
    private Path g;

    @Override // com.facebook.react.flat.b
    protected void c(Canvas canvas) {
    }

    public m(int i) {
        this.f3404d = i;
    }

    @Override // com.facebook.react.flat.b, com.facebook.react.flat.h
    public void a(s sVar, Canvas canvas) {
        d(sVar, canvas);
        if (this.a_ || this.f > 0.5f) {
            canvas.save(2);
            b(canvas);
            sVar.b(canvas);
            canvas.restore();
            return;
        }
        sVar.b(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.flat.b
    public void b(Canvas canvas) {
        if (this.f > 0.5f) {
            canvas.clipPath(this.g);
        } else {
            super.b(canvas);
        }
    }

    @Override // com.facebook.react.flat.b
    protected void c(s sVar, Canvas canvas) {
        sVar.a(canvas);
    }
}
