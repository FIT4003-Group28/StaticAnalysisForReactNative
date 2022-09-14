package com.facebook.react.flat;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ShadowStyleSpan.java */
/* loaded from: classes.dex */
final class ae extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    static final ae f3376a = new ae(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, true);

    /* renamed from: b  reason: collision with root package name */
    private float f3377b;

    /* renamed from: c  reason: collision with root package name */
    private float f3378c;

    /* renamed from: d  reason: collision with root package name */
    private float f3379d;
    private int e;
    private boolean f;

    private ae(float f, float f2, float f3, int i, boolean z) {
        this.f3377b = f;
        this.f3378c = f2;
        this.f3379d = f3;
        this.e = i;
        this.f = z;
    }

    public boolean a(float f, float f2) {
        return this.f3377b == f && this.f3378c == f2;
    }

    public void b(float f, float f2) {
        this.f3377b = f;
        this.f3378c = f2;
    }

    public float a() {
        return this.f3379d;
    }

    public void a(float f) {
        this.f3379d = f;
    }

    public int b() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae c() {
        return new ae(this.f3377b, this.f3378c, this.f3379d, this.e, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f = true;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f3379d, this.f3377b, this.f3378c, this.e);
    }
}
