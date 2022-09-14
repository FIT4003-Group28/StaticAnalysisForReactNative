package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import c.d.j.o.d;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.text.y;
/* loaded from: classes.dex */
public class b extends y {

    /* renamed from: b  reason: collision with root package name */
    private Drawable f6274b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.h.c.b f6275c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.h.i.b<c.d.h.f.a> f6276d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f6277e;

    /* renamed from: f  reason: collision with root package name */
    private int f6278f;

    /* renamed from: g  reason: collision with root package name */
    private int f6279g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f6280h;
    private int i;
    private ReadableMap j;
    private TextView k;

    public b(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, c.d.h.c.b bVar, Object obj) {
        this.f6276d = new c.d.h.i.b<>(c.d.h.f.b.a(resources).a());
        this.f6275c = bVar;
        this.f6277e = obj;
        this.f6279g = i3;
        this.f6280h = uri == null ? Uri.EMPTY : uri;
        this.j = readableMap;
        this.i = (int) q.b(i2);
        this.f6278f = (int) q.b(i);
    }

    @Override // com.facebook.react.views.text.y
    public Drawable a() {
        return this.f6274b;
    }

    @Override // com.facebook.react.views.text.y
    public void a(TextView textView) {
        this.k = textView;
    }

    @Override // com.facebook.react.views.text.y
    public int b() {
        return this.f6278f;
    }

    @Override // com.facebook.react.views.text.y
    public void c() {
        this.f6276d.f();
    }

    @Override // com.facebook.react.views.text.y
    public void d() {
        this.f6276d.g();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        if (this.f6274b == null) {
            com.facebook.react.modules.fresco.a a2 = com.facebook.react.modules.fresco.a.a(d.b(this.f6280h), this.j);
            c.d.h.c.b bVar = this.f6275c;
            bVar.k();
            bVar.mo133a(this.f6276d.b());
            bVar.a(this.f6277e);
            bVar.b((c.d.h.c.b) a2);
            this.f6276d.a(bVar.mo132a());
            this.f6275c.k();
            this.f6274b = this.f6276d.d();
            this.f6274b.setBounds(0, 0, this.i, this.f6278f);
            int i6 = this.f6279g;
            if (i6 != 0) {
                this.f6274b.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            this.f6274b.setCallback(this.k);
        }
        canvas.save();
        canvas.translate(f2, ((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f6274b.getBounds().bottom - this.f6274b.getBounds().top) / 2));
        this.f6274b.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.y
    public void e() {
        this.f6276d.f();
    }

    @Override // com.facebook.react.views.text.y
    public void f() {
        this.f6276d.g();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.f6278f;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.i;
    }
}
