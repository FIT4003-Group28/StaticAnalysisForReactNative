package com.facebook.react.flat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.facebook.react.flat.s;
/* compiled from: InlineImageSpanWithPipeline.java */
/* loaded from: classes.dex */
final class u extends ReplacementSpan implements c, d {

    /* renamed from: b  reason: collision with root package name */
    private static final RectF f3422b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private w f3423c;

    /* renamed from: d  reason: collision with root package name */
    private s.a f3424d;
    private float e;
    private float f;
    private boolean g;

    @Override // com.facebook.react.flat.d
    public void a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u() {
        this(null, Float.NaN, Float.NaN);
    }

    private u(w wVar, float f, float f2) {
        this.f3423c = wVar;
        this.e = f;
        this.f = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u b() {
        return new u(this.f3423c, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.facebook.imagepipeline.n.b bVar) {
        if (bVar == null) {
            this.f3423c = null;
        } else {
            this.f3423c = new w(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        this.e = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f) {
        this.f = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.g;
    }

    @Override // com.facebook.react.flat.d
    public void a(Bitmap bitmap) {
        ((s.a) com.facebook.j.a.a.a(this.f3424d)).a();
    }

    @Override // com.facebook.react.flat.d
    public void b(Bitmap bitmap) {
        ((s.a) com.facebook.j.a.a.a(this.f3424d)).a();
    }

    @Override // com.facebook.react.flat.c
    public void a(s.a aVar) {
        this.f3424d = aVar;
        if (this.f3423c != null) {
            this.f3423c.a(this);
        }
    }

    @Override // com.facebook.react.flat.c
    public void a() {
        if (this.f3423c != null) {
            this.f3423c.a();
            if (!this.f3423c.c()) {
                return;
            }
            this.f3424d = null;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -Math.round(this.f);
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return Math.round(this.e);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Bitmap b2;
        if (this.f3423c == null || (b2 = this.f3423c.b()) == null) {
            return;
        }
        float f2 = i5 - paint.getFontMetricsInt().descent;
        f3422b.set(f, f2 - this.f, this.e + f, f2);
        canvas.drawBitmap(b2, (Rect) null, f3422b, paint);
    }
}
