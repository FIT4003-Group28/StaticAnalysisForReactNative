package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6315a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f6316b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    private float f6317c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    private float f6318d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    private float f6319e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private float f6320f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    private b0 f6321g = b0.UNSET;

    public x a(x xVar) {
        x xVar2 = new x();
        xVar2.f6315a = this.f6315a;
        xVar2.f6316b = !Float.isNaN(xVar.f6316b) ? xVar.f6316b : this.f6316b;
        xVar2.f6317c = !Float.isNaN(xVar.f6317c) ? xVar.f6317c : this.f6317c;
        xVar2.f6318d = !Float.isNaN(xVar.f6318d) ? xVar.f6318d : this.f6318d;
        xVar2.f6319e = !Float.isNaN(xVar.f6319e) ? xVar.f6319e : this.f6319e;
        xVar2.f6320f = !Float.isNaN(xVar.f6320f) ? xVar.f6320f : this.f6320f;
        b0 b0Var = xVar.f6321g;
        if (b0Var == b0.UNSET) {
            b0Var = this.f6321g;
        }
        xVar2.f6321g = b0Var;
        return xVar2;
    }

    public void a(float f2) {
        this.f6316b = f2;
    }

    public void a(b0 b0Var) {
        this.f6321g = b0Var;
    }

    public void a(boolean z) {
        this.f6315a = z;
    }

    public boolean a() {
        return this.f6315a;
    }

    public int b() {
        float f2 = !Float.isNaN(this.f6316b) ? this.f6316b : 14.0f;
        return (int) Math.ceil(this.f6315a ? com.facebook.react.uimanager.q.a(f2, e()) : com.facebook.react.uimanager.q.b(f2));
    }

    public void b(float f2) {
        this.f6320f = f2;
    }

    public float c() {
        if (Float.isNaN(this.f6318d)) {
            return Float.NaN;
        }
        return (this.f6315a ? com.facebook.react.uimanager.q.a(this.f6318d, e()) : com.facebook.react.uimanager.q.b(this.f6318d)) / b();
    }

    public void c(float f2) {
        this.f6318d = f2;
    }

    public float d() {
        if (Float.isNaN(this.f6317c)) {
            return Float.NaN;
        }
        float a2 = this.f6315a ? com.facebook.react.uimanager.q.a(this.f6317c, e()) : com.facebook.react.uimanager.q.b(this.f6317c);
        return !Float.isNaN(this.f6320f) && (this.f6320f > a2 ? 1 : (this.f6320f == a2 ? 0 : -1)) > 0 ? this.f6320f : a2;
    }

    public void d(float f2) {
        this.f6317c = f2;
    }

    public float e() {
        if (!Float.isNaN(this.f6319e)) {
            return this.f6319e;
        }
        return 0.0f;
    }

    public void e(float f2) {
        if (f2 == 0.0f || f2 >= 1.0f) {
            this.f6319e = f2;
            return;
        }
        throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
    }

    public float f() {
        return this.f6316b;
    }

    public float g() {
        return this.f6320f;
    }

    public float h() {
        return this.f6318d;
    }

    public float i() {
        return this.f6317c;
    }

    public float j() {
        return this.f6319e;
    }

    public b0 k() {
        return this.f6321g;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + a() + "\n  getFontSize(): " + f() + "\n  getEffectiveFontSize(): " + b() + "\n  getHeightOfTallestInlineViewOrImage(): " + g() + "\n  getLetterSpacing(): " + h() + "\n  getEffectiveLetterSpacing(): " + c() + "\n  getLineHeight(): " + i() + "\n  getEffectiveLineHeight(): " + d() + "\n  getTextTransform(): " + k() + "\n  getMaxFontSizeMultiplier(): " + j() + "\n  getEffectiveMaxFontSizeMultiplier(): " + e() + "\n}";
    }
}
