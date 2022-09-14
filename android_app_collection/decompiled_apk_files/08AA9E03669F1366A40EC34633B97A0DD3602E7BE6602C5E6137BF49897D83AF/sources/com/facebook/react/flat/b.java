package com.facebook.react.flat;

import android.graphics.Canvas;
/* compiled from: AbstractDrawCommand.java */
/* loaded from: classes.dex */
abstract class b extends h implements Cloneable {
    protected boolean a_;

    /* renamed from: c  reason: collision with root package name */
    private float f3387c;

    /* renamed from: d  reason: collision with root package name */
    private float f3388d;
    private float e;
    private float f;
    private boolean g;
    private float h;
    private float i;
    private float j;
    private float k;

    protected static int j() {
        return -16711681;
    }

    protected abstract void c(Canvas canvas);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(s sVar, Canvas canvas) {
    }

    public final float f() {
        return this.h;
    }

    public final float g() {
        return this.i;
    }

    public final float h() {
        return this.j;
    }

    public final float i() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Canvas canvas) {
        canvas.clipRect(this.h, this.i, this.j, this.k);
    }

    @Override // com.facebook.react.flat.h
    public void a(s sVar, Canvas canvas) {
        d(sVar, canvas);
        if (this.a_ && r()) {
            canvas.save(2);
            b(canvas);
            c(canvas);
            canvas.restore();
            return;
        }
        c(canvas);
    }

    protected String k() {
        return getClass().getSimpleName().substring(4);
    }

    @Override // com.facebook.react.flat.h
    public final void b(s sVar, Canvas canvas) {
        c(sVar, canvas);
    }

    protected void c(s sVar, Canvas canvas) {
        sVar.a(canvas, j(), k(), this.f3387c, this.f3388d, this.e, this.f);
    }

    public final b l() {
        try {
            b bVar = (b) super.clone();
            bVar.g = false;
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean m() {
        return this.g;
    }

    public final float n() {
        return this.f3387c;
    }

    public final float o() {
        return this.f3388d;
    }

    public final float p() {
        return this.e;
    }

    public final float q() {
        return this.f;
    }

    protected boolean r() {
        return this.f3387c < f() || this.f3388d < g() || this.e > h() || this.f > i();
    }
}
