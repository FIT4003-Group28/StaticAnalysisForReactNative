package com.facebook.react.flat;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: FontStylingSpan.java */
/* loaded from: classes.dex */
final class t extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    static final t f3418a = new t(-1.6777216E7d, 0, -1, -1, -1, false, false, null, true);

    /* renamed from: b  reason: collision with root package name */
    private double f3419b;

    /* renamed from: c  reason: collision with root package name */
    private int f3420c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3421d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private String i;
    private boolean j;

    t() {
    }

    private t(double d2, int i, int i2, int i3, int i4, boolean z, boolean z2, String str, boolean z3) {
        this.f3419b = d2;
        this.f3420c = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.f3421d = z;
        this.e = z2;
        this.i = str;
        this.j = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t a() {
        return new t(this.f3419b, this.f3420c, this.f, this.g, this.h, this.f3421d, this.e, this.i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double d() {
        return this.f3419b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d2) {
        this.f3419b = d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f3420c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f3420c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.i = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f3421d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f3421d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.e = z;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (!Double.isNaN(this.f3419b)) {
            textPaint.setColor((int) this.f3419b);
        }
        textPaint.bgColor = this.f3420c;
        textPaint.setUnderlineText(this.f3421d);
        textPaint.setStrikeThruText(this.e);
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        if (this.f != -1) {
            textPaint.setTextSize(this.f);
        }
        a(textPaint);
    }

    private int e(int i) {
        if (this.g != -1) {
            i = (i & (-3)) | this.g;
        }
        return this.h != -1 ? (i & (-2)) | this.h : i;
    }

    private void a(TextPaint textPaint) {
        Typeface a2;
        Typeface typeface = textPaint.getTypeface();
        int style = typeface == null ? 0 : typeface.getStyle();
        int e = e(style);
        if (style == e && this.i == null) {
            return;
        }
        if (this.i != null) {
            a2 = ag.a(this.i, e);
        } else {
            a2 = ag.a(typeface, e);
        }
        textPaint.setTypeface(a2);
    }
}
