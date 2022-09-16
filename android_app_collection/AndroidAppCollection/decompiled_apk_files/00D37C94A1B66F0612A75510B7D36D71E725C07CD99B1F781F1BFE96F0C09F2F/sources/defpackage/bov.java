package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: bov  reason: default package */
/* loaded from: classes2.dex */
final class bov extends box {
    public int[] a;
    gk b;
    float c;
    gk d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;

    public bov() {
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }

    @Override // defpackage.adn
    public final boolean e() {
        return this.d.c() || this.b.c();
    }

    @Override // defpackage.adn
    public final boolean f(int[] iArr) {
        return this.b.d(iArr) | this.d.d(iArr);
    }

    float getFillAlpha() {
        return this.f;
    }

    int getFillColor() {
        return this.d.b;
    }

    float getStrokeAlpha() {
        return this.e;
    }

    int getStrokeColor() {
        return this.b.b;
    }

    float getStrokeWidth() {
        return this.c;
    }

    float getTrimPathEnd() {
        return this.h;
    }

    float getTrimPathOffset() {
        return this.i;
    }

    float getTrimPathStart() {
        return this.g;
    }

    void setFillAlpha(float f) {
        this.f = f;
    }

    void setFillColor(int i) {
        this.d.b = i;
    }

    void setStrokeAlpha(float f) {
        this.e = f;
    }

    void setStrokeColor(int i) {
        this.b.b = i;
    }

    void setStrokeWidth(float f) {
        this.c = f;
    }

    void setTrimPathEnd(float f) {
        this.h = f;
    }

    void setTrimPathOffset(float f) {
        this.i = f;
    }

    void setTrimPathStart(float f) {
        this.g = f;
    }

    public bov(bov bovVar) {
        super(bovVar);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = bovVar.a;
        this.a = null;
        this.b = bovVar.b;
        this.c = bovVar.c;
        this.e = bovVar.e;
        this.d = bovVar.d;
        this.o = bovVar.o;
        this.f = bovVar.f;
        this.g = bovVar.g;
        this.h = bovVar.h;
        this.i = bovVar.i;
        this.j = bovVar.j;
        this.k = bovVar.k;
        this.l = bovVar.l;
    }
}
