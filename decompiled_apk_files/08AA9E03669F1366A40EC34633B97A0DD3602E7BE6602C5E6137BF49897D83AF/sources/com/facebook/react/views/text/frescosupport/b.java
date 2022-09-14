package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.imagepipeline.n.c;
import com.facebook.react.bridge.an;
import com.facebook.react.views.text.n;
/* compiled from: FrescoBasedReactTextInlineImageSpan.java */
/* loaded from: classes.dex */
public class b extends n {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f4089a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.f.c.b f4090b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.f.i.b<com.facebook.f.f.a> f4091c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4092d;
    private int e;
    private Uri f;
    private int g;
    private an h;
    private TextView i;

    public b(Resources resources, int i, int i2, Uri uri, an anVar, com.facebook.f.c.b bVar, Object obj) {
        this.f4091c = new com.facebook.f.i.b<>(com.facebook.f.f.b.a(resources).s());
        this.f4090b = bVar;
        this.f4092d = obj;
        this.e = i;
        this.g = i2;
        this.f = uri == null ? Uri.EMPTY : uri;
        this.h = anVar;
    }

    @Override // com.facebook.react.views.text.n
    public void b() {
        this.f4091c.c();
    }

    @Override // com.facebook.react.views.text.n
    public void c() {
        this.f4091c.c();
    }

    @Override // com.facebook.react.views.text.n
    public void d() {
        this.f4091c.b();
    }

    @Override // com.facebook.react.views.text.n
    public void e() {
        this.f4091c.b();
    }

    @Override // com.facebook.react.views.text.n
    public Drawable a() {
        return this.f4089a;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.e;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.g;
    }

    @Override // com.facebook.react.views.text.n
    public void a(TextView textView) {
        this.i = textView;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f4089a == null) {
            this.f4091c.a(this.f4090b.e().b(this.f4091c.d()).e(this.f4092d).b((com.facebook.f.c.b) com.facebook.react.modules.fresco.a.a(c.a(this.f), this.h)).q());
            this.f4090b.e();
            this.f4089a = this.f4091c.f();
            this.f4089a.setBounds(0, 0, this.g, this.e);
            this.f4089a.setCallback(this.i);
        }
        canvas.save();
        canvas.translate(f, i4 - this.f4089a.getBounds().bottom);
        this.f4089a.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.n
    public int f() {
        return this.e;
    }
}
