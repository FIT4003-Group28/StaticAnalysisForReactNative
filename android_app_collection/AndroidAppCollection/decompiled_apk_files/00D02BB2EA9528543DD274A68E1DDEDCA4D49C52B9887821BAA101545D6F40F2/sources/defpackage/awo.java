package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: awo  reason: default package */
/* loaded from: classes3.dex */
final class awo {
    final RectF a = new RectF();
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    float g;
    float h;
    int[] i;
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;

    public awo() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int[] iArr) {
        this.i = iArr;
        b(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        this.j = i;
        this.u = this.i[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return (this.j + 1) % this.i.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return this.i[this.j];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        if (this.n != z) {
            this.n = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.k = this.e;
        this.l = this.f;
        this.m = this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }
}
