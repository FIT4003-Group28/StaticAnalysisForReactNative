package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: baf  reason: default package */
/* loaded from: classes.dex */
final class baf extends bai {
    public int[] a;
    jm b;
    float c;
    jm d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;

    public baf() {
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

    @Override // defpackage.bah
    public final boolean b() {
        return this.d.c() || this.b.c();
    }

    @Override // defpackage.bah
    public final boolean c(int[] iArr) {
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

    public baf(baf bafVar) {
        super(bafVar);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = bafVar.a;
        this.a = null;
        this.b = bafVar.b;
        this.c = bafVar.c;
        this.e = bafVar.e;
        this.d = bafVar.d;
        this.o = bafVar.o;
        this.f = bafVar.f;
        this.g = bafVar.g;
        this.h = bafVar.h;
        this.i = bafVar.i;
        this.j = bafVar.j;
        this.k = bafVar.k;
        this.l = bafVar.l;
    }
}
